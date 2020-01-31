package com.example.nameandaddress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onGenerateAddress(view: View) {
        val firstName = etFirstName.text.toString()
        val lastName = etLastName.text.toString()
        val streetAddress = etStreetAddress.text.toString()
        val city = etCity.text.toString()
        val state = etState.text.toString()
        val zip = etZip.text.toString()

        val person = Person(firstName, lastName, streetAddress, city, state, zip)

        Log.d("TAG", person.toString())

        etPersonFirstName.setText(person.firstName.toString())
        etPersonLastName.setText(person.lastName.toString())
        etPersonStreet.setText(person.streetAddress.toString())
        etPersonCity.setText(person.city.toString())
        etPersonState.setText(person.state.toString())
        etPersonZip.setText(person.zip.toString())
    }
}
