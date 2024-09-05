package com.mailsender.controller

import com.mailsender.dto.MailRequest
import com.mailsender.service.MailService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 * @author Titus Murithi Bundi
 */
@RestController
@RequestMapping("/api/v1/mail")
class MailController (private val mailService: MailService){

    @PostMapping("/send")
    fun sendMail(@RequestBody mailRequest: MailRequest){
        mailService.sendMail(mailRequest.to, mailRequest.subject, mailRequest.body)
    }
}
