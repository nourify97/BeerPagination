package com.nourify.beerpagination.data.mappers

import com.nourify.beerpagination.data.local.BeerEntity
import com.nourify.beerpagination.data.remote.BeerDto
import com.nourify.beerpagination.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagLine = tagLine,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagLine = tagLine,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}