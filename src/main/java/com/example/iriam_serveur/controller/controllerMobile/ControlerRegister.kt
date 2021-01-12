package com.example.iriam_serveur.controller.controllerMobile

import com.example.iriam_serveur.model.UserBean
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

//@RestController
//class ControlerRegister {
//    @PostMapping("/register")
//    fun register(@RequestBody user: UserBean): Any {
//        println("/register $user")
//        return try {
//            val id_session = buAddUser(user.pseudo, user.password
//                    UserBean(user.pseudo, user.password, id_session)
//        } catch (e: Exception) {
//            ErrorBean(e.message ?: "Une erreur est survenue")
//        }
//    }
//}