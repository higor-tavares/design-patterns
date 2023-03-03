package com.higortavares.designpatterns.chainofresponsibility

import com.higortavares.designpatterns.chainofresposibility.EmailValidation
import com.higortavares.designpatterns.chainofresposibility.PasswordValidation
import com.higortavares.designpatterns.chainofresposibility.Request
import com.higortavares.designpatterns.chainofresposibility.RoleValidator
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito.never
import org.mockito.Mockito.verify

class ChainOfResponsibilityTest {

    @Test
    fun testUser() {
        val request = Request("higortavares.ifce@gmail.com","123456", "user");
        val emailValidator = EmailValidation()
        val passwordValidator = PasswordValidation()
        emailValidator.addHandle(passwordValidator)
        emailValidator.handle(request);
    }

    @Test
    fun testAdmin() {
        val request = Request("higortavares.ifce@gmail.com","123456", "ADMIN");
        val emailValidator = EmailValidation()
        val passwordValidator = PasswordValidation()
        val roleValidation = RoleValidator()
        emailValidator.addHandle(passwordValidator)
        passwordValidator.addHandle(roleValidation)
        emailValidator.handle(request)
    }

    @Test
    fun testPasswordError() {
        val request = Request("higortavares.ifce@gmail.com","123", "ADMIN");
        val emailValidator = EmailValidation()
        val passwordValidator = PasswordValidation()
        val roleValidation = RoleValidator()
        emailValidator.addHandle(passwordValidator)
        passwordValidator.addHandle(roleValidation)
        assertThrows<IllegalArgumentException> {  emailValidator.handle(request) }
    }

}