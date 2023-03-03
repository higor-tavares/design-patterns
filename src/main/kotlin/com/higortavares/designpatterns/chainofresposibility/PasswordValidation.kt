package com.higortavares.designpatterns.chainofresposibility

class PasswordValidation : Handler() {

    override fun handle(request: Request) {
        print("TESTING PASSWORD ...")
        if (isValidPassword(request)) next?.handle(request) else { throw IllegalArgumentException("invalid password") }
    }

    private fun isValidPassword(request: Request) : Boolean {
        return request.password.length > 5
    }
}