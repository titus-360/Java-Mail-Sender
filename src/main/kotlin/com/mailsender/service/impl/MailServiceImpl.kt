package com.mailsender.service.impl

import com.mailsender.service.MailService
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.stereotype.Service

/**
 *
 * @author Titus Murithi Bundi
 */
@Service("mailService")
class MailServiceImpl(private val javaMailSender: JavaMailSender) : MailService {
    override fun sendMail(to: String, subject: String, body: String) {
        val message = javaMailSender.createMimeMessage()
        val helper = MimeMessageHelper(message, true)
        helper.setTo(to)
        helper.setSubject(subject)
        helper.setText(body, true)
        javaMailSender.send(message)
    }
}
