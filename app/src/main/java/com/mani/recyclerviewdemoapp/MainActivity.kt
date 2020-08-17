package com.mani.recyclerviewdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvContacts = findViewById<RecyclerView>(R.id.rvContacts)

        rvContacts.layoutManager = LinearLayoutManager(this)

        val contactsDataList = ArrayList<ContactsData>()

        contactsDataList.add(ContactsData("Raman","raman@gmail.com","+91 9810765432","AndroidDevloper","https://homepages.cae.wisc.edu/~ece533/images/girl.png"))
        contactsDataList.add(ContactsData("Ramesh","Ramesh@gmail.com","+91 9810765412","IOSDevloper","https://homepages.cae.wisc.edu/~ece533/images/girl.png"))
        contactsDataList.add(ContactsData("Laxman","Laxman@gmail.com","+91 9810765423","AndroidDevloper","https://homepages.cae.wisc.edu/~ece533/images/girl.png"))
        contactsDataList.add(ContactsData("Rajesh","Rajesh@gmail.com","+91 9810765445","FlutterDevloper","https://homepages.cae.wisc.edu/~ece533/images/girl.png"))
        contactsDataList.add(ContactsData("Seetha","Seetha@gmail.com","+91 9810765467","IOSdDevloper","https://homepages.cae.wisc.edu/~ece533/images/girl.png"))
        contactsDataList.add(ContactsData("Janu","Janu@gmail.com","+91 9810765489","AndroidDevloper","https://homepages.cae.wisc.edu/~ece533/images/girl.png"))
        contactsDataList.add(ContactsData("Manikanta","Manikanta@gmail.com","+91 9810765490","FlutterDevloper","https://homepages.cae.wisc.edu/~ece533/images/girl.png"))
        contactsDataList.add(ContactsData("Suresh","Suresh@gmail.com","+91 9810765401","AndroidDevloper","https://homepages.cae.wisc.edu/~ece533/images/girl.png"))
        contactsDataList.add(ContactsData("Mahesh","Mahesh@gmail.com","+91 9810765412","FlutterDevloper","https://homepages.cae.wisc.edu/~ece533/images/girl.png"))
        contactsDataList.add(ContactsData("Roopesh","Roopesh@gmail.com","+91 9810765423","AndroidDevloper","https://homepages.cae.wisc.edu/~ece533/images/girl.png"))


        val mContactAdapter = ContactAdapter(contactsDataList)
        rvContacts.adapter = mContactAdapter

    }
}