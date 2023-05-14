package com.nourify.beerpagination

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.cachedIn
import androidx.paging.map
import com.nourify.beerpagination.data.local.BeerEntity
import com.nourify.beerpagination.data.mappers.toBeer
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class BeerViewModel @Inject constructor(
    pager: Pager<Int, BeerEntity>
): ViewModel() {

    val beerPagingFlow = pager
        .flow
        .map { pagingData ->
            pagingData.map { it.toBeer() }
        }
        .cachedIn(viewModelScope)
}