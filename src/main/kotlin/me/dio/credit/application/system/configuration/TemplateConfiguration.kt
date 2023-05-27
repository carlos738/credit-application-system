package me.dio.credit.application.system.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class TemplateConfiguration<SimpleMailMessage> {

    @Bean
    fun exampleNewLesterTemplate() {
       val template = SimpleMailMessage()
        template.setSubeject("Newslestter")
        template.setText("""""ola %s, Esse é um exemplo de mensagem de noticias""".trimIndent()
        )

    }

}