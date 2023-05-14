package com.nourify.beerpagination.domain

data class Beer(
    val id: Int,
    val name: String,
    val tagLine: String,
    val firstBrewed: String,
    val description: String,
    val imageUrl: String?
)
