package com.higortavares.designpatterns.prototype

class JDBCConnection( var host: String,
                      var port: Int,
                      var dbName: String,
                      var username: String,
                      var password: String) : Prototype() {



    override fun copy(): Prototype {
       return JDBCConnection(this.host, this.port, this.dbName, this.username, this.password)
    }
}