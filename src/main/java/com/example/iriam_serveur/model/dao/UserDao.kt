package com.example.iriam_serveur.model.dao

import com.example.iriam_serveur.model.UserBean
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface UserDao : JpaRepository<UserBean, Long> {

}
