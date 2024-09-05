package com.mailsender.dto

/**
 *
 * @author Titus Murithi Bundi
 */
data class MailRequest(
    val to: String,
    val subject: String,
    val body: String
)
