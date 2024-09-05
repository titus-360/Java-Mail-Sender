package com.mailsender.service

/**
 *
 * @author Titus Murithi Bundi
 */
fun interface MailService {

    fun sendMail(to: String, subject: String, body: String)
}
