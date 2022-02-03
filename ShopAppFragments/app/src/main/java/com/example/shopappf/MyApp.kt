package com.example.shopappf

import android.app.Application
import android.widget.Toast
import io.reactivex.rxjava3.schedulers.Schedulers
import io.realm.Realm
import io.realm.RealmConfiguration

class MyApp: Application() {
    lateinit var config: RealmConfiguration
    lateinit var realm: Realm

    override fun onCreate(){
        super.onCreate()


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
        //ściąganie danych z serwera Products
        ShopApi.create().getProducts()
            .subscribeOn(Schedulers.io())
            .observeOn(io.reactivex.rxjava3.android.schedulers.AndroidSchedulers.mainThread())
            .subscribe({ list ->
                realm.executeTransaction { r ->
                    r.copyToRealmOrUpdate(list)
                }
            }, { e ->
                Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            })

        //ściąganie danych z serwera Users
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

    }
}