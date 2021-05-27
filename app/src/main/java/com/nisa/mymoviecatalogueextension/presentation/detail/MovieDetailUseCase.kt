package com.nisa.mymoviecatalogueextension.presentation.detail

import com.nisa.mymoviecatalogueextension.data.model.uimodel.MovieDetailViewItem
import com.nisa.mymoviecatalogueextension.data.repository.RemoteRepository
import com.nisa.mymoviecatalogueextension.domain.mapper.MovieDetailItemMapper
import io.reactivex.Observable
import javax.inject.Inject

class MovieDetailUseCase @Inject constructor(
    private val repository: RemoteRepository,
    private val itemMapper: MovieDetailItemMapper
) {
    fun getMovieDetail(movieId: Int): Observable<MovieDetailViewItem> {
        return repository.getMovieDetail(movieId = movieId).map { itemMapper.mapFrom(it) }
    }
}

