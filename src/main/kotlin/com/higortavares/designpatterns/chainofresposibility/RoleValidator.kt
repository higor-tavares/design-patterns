package com.higortavares.designpatterns.chainofresposibility

open class RoleValidator : Handler(){

    override fun handle(request: Request) {
        print("TESTING ROLE ...")
        if (isAdministrator(request)) next?.handle(request) else { throw IllegalArgumentException("invalid role") }
    }

    private fun isAdministrator(request: Request) : Boolean {
        return request.role == "ADMIN"
    }
}