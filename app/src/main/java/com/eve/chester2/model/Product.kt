package com.eve.chester2.model


class Product{
    var name:String=""
    var adminid:String=""
    var email:String=""
    var password:String=""
    var userid:String=""

    constructor(name:String,adminid:String,email:String,password:String,userid:String){
        this.name=name
        this.adminid=adminid
        this.email=email
        this.password=password
        this.userid=userid

    }
    constructor()
}