package com.example.shopappf

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopappf.dataModels.UserDB
import io.reactivex.rxjava3.schedulers.Schedulers
import io.realm.Realm
import io.realm.RealmConfiguration

class tmpActivity: AppCompatActivity() {

    lateinit var text: TextView
    lateinit var config: RealmConfiguration
    lateinit var realm: Realm
    lateinit var usersRV: RecyclerView
    lateinit var usersList: ArrayList<UserDB>
    private lateinit var list: List<UserDB>
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_user)

        //init views
        usersRV = findViewById(R.id.usersRV)
        text = findViewById(R.id.txtName)
        button = findViewById(R.id.button5)

        //REALM DATABASE
        // inicjalizacja bazy
        Realm.init(this)

        config = RealmConfiguration.Builder().name("AndroidShop")
            .deleteRealmIfMigrationNeeded()
            .allowWritesOnUiThread(true)
            .build()

        Realm.setDefaultConfiguration(config)
        realm = Realm.getDefaultInstance()

        realm.beginTransaction()
        realm.deleteAll()
        realm.commitTransaction()

        //RXjava
        //ściąganie danych z serwera
        ShopApi.create().getUser()
            .subscribeOn(Schedulers.io())
            .observeOn(io.reactivex.rxjava3.android.schedulers.AndroidSchedulers.mainThread())
            .subscribe({ list ->
                realm.executeTransaction { r ->
                    r.copyToRealmOrUpdate(list)
                }
            }, { e ->
                Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            })

        //sciaganie uzytkowników z realm do listy
        realm.executeTransaction {
            list = it.where(UserDB::class.java).findAll()
        }
        //wrzucanie listy z urzytkownikami do adaptera ktory pozniej wrzuca do rycaclerView
        usersRV.adapter = UserAdapter(list, this)
        usersRV.layoutManager = LinearLayoutManager(this)

    }

}