package com.example.iriam_serveur.controller.controllerWeb

import com.example.iriam_serveur.model.UserBean
import com.example.iriam_serveur.model.dao.UserDao
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

private val connectUsers = ArrayList<UserBean>()
@Controller
class LoginControler(private val userDao: UserDao){
    // http://localhost:8080/login
    @GetMapping("/login")
    fun login(model: Model): String {
        println("/login")

        val user = UserBean()
        model.addAttribute("user", user)

        //Nom du fichier HTML que l'on souhaite afficher
        return "login"
    }

//    // http://localhost:8080/liste
//    @PostMapping("/liste")
//    fun showListe(model: Model, @ModelAttribute("user") user: UserBean): String {
//        println("/liste user=$user")
//
//        var errorMessage = ""
//
//        if (user.pseudo.isBlank()) {
//            errorMessage += "Le loggin est vide <br/>"
//        }
//        if (user.password.isBlank()) {
//            errorMessage += "Le mot de passe est vide est vide<br/>"
//        }
//
//        //je cherhce un utilisateur correspondant
//        val connectUser = connectUsers.firstOrNull { user.pseudo.equals(it.pseudo, true) }
//        if (connectUser != null && connectUser.password != user.password) {
//            errorMessage += "Mot de passe incorrecte <br/>"
//        }
//
//        //Si erreur
//        if (errorMessage.isNotBlank()) {
//            model.addAttribute("errorMessage", errorMessage)
//            return "login"
//        }
//        else {
//            //pas d'erreur
//            //on ajoute l'utilisateur s'il n'existe pas
//            if (connectUser == null) {
//                connectUsers.add(user)
//            }
//
//            model.addAttribute("listuser", connectUsers)
//            model.addAttribute("connectUser", user)
//            //Nom du fichier HTML que l'on souhaite afficher
//            return "register"
//        }
//    }
//    @GetMapping("/register")
//    fun save(model: Model, pseudo: String, password: String): String {
//        println("/register pseudo=$pseudo password=$password")
//
//        var errorMessage = ""
//        if (pseudo.isBlank()) {
//            errorMessage = "Il faut un nom"
//        }
//
//        try {
//            if (errorMessage.isNotBlank()) {
//                throw Exception(errorMessage)
//            }
//
//            userDao.save(UserBean(pseudo, password))
//
//            model.addAttribute("message", "L'étudiant $pseudo a bien été ajouté")
//
//            return "liste"
//        }
//        catch (e: Exception) {
//            e.printStackTrace()
//            model.addAttribute("errorMessage", e.message)
//            return "error"
//        }
//    }
}