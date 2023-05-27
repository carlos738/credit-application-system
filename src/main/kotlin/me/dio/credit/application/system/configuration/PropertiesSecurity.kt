package me.dio.credit.application.system.configuration

import org.hibernate.validator.constraints.Length
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "jwt-security")
class PropertiesSecurity {
    @Length(min = 37, message = "Minimum length for the secret is 37.")
    @Value("\${jwt-secret}")
    lateinit var secretKey: String

    @Value("\${jwt.expirationTime}")
    val  expirationTime: Int = 13  // in days

    
}