package com.example.iriam_serveur.controller.controllerMobile

import com.example.iriam_serveur.model.UserBean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rest")
class ControlerLogin {

    // http://localhost:8080/test
    @GetMapping("/test")
    fun test(): String{
        return "Connexion établie"
    }

    // http://localhost:8080/login
    @GetMapping("/login")
    fun loginMobile(pseudo: String, password: String): UserBean {
        return UserBean(pseudo, password)
    }


}