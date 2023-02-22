package com.higortavares.designpatterns.facade

class UserService {
    private val userDAO = UserDAO()
    private val storageService = StorageService()

    fun saveUser(user: Any, profilePicture: ByteArray) {
        userDAO.save(user)
        storageService.uploadPicture(profilePicture)
    }
}