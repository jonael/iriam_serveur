package com.example.iriam_serveur.model

import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "users")
data class UserBean(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id_user: Int,
    var image_url: String,
    var pseudo: String,
    var password: String,
    var latitude: String?,
    var longitude: String?,
    var last_query: Timestamp?,
    var id_session: String?
){
    constructor(): this(0, "", "", "", "", "" ,null ,"")
    constructor(pseudo: String, password: String, id_session: String?) : this()
    constructor(pseudo: String, password: String): this()
}