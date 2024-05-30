package com.eve.chester2.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.eve.chester2.model.User
import com.eve.chester2.navigation.ROUTE_HOME
import com.eve.chester2.navigation.ROUTE_LOGIN
import com.eve.chester2.navigation.ROUTE_REGISTER
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthViewModel(var navController: NavHostController, var context: Context) {

    var mAuth: FirebaseAuth


    init {
        mAuth = FirebaseAuth.getInstance()

    }

    fun signup(adminid: String, email: String, pass: String, confpass: String) {


        if (adminid.isBlank() || email.isBlank() || pass.isBlank() || confpass.isBlank()) {

            Toast.makeText(context, "Please admission number, email and password cannot be blank", Toast.LENGTH_LONG)
                .show()
            return
        } else if (pass != confpass) {
            Toast.makeText(context, "Passwords do not match", Toast.LENGTH_LONG).show()
            return
        } else {
            mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                if (it.isSuccessful) {
                    val userdata = User(email, pass, mAuth.currentUser!!.uid)
                    val regRef = FirebaseDatabase.getInstance().getReference()
                        .child("Users/" + mAuth.currentUser!!.uid)
                    regRef.setValue(userdata).addOnCompleteListener {

                        if (it.isSuccessful) {
                            Toast.makeText(context, "Registered Successfully", Toast.LENGTH_LONG)
                                .show()
                            navController.navigate(ROUTE_LOGIN)

                        } else {
                            Toast.makeText(context, "${it.exception!!.message}", Toast.LENGTH_LONG)
                                .show()
                            navController.navigate(ROUTE_LOGIN)
                        }
                    }
                } else {
                    navController.navigate(ROUTE_REGISTER)
                }

            }
        }

    }

    fun login(email: String, pass: String) {
//        progress.show()

        mAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
//            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "Succeffully Logged in", Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_HOME)
//                navController.navigate(ROUTE_REGISTER)TO TAKE YOU TO A DIIFFERNT PAGE
            } else {
                Toast.makeText(context, "${it.exception!!.message}", Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_LOGIN)
            }
        }

    }

    fun logout() {
        mAuth.signOut()
        navController.navigate(ROUTE_LOGIN)
    }

    fun isloggedin(): Boolean {
        return mAuth.currentUser != null
    }
}

