package com.higortavares.designpatterns.chainofresposibility

class EmailValidation: Handler() {

    private val EMAIL_PATTERN = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+\$"

    override fun handle(request: Request) {
        print("TESTING EMAIL ...")
        if (isValidMail(request)) next?.handle(request) else { throw IllegalArgumentException("invalid email") }
    }

    private fun isValidMail(request: Request) : Boolean {
        return request.email.matches(Regex(EMAIL_PATTERN))
    }
}