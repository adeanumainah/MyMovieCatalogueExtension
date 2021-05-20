package com.nisa.mymoviecatalogueextension.presentation.detail

import com.nisa.mymoviecatalogueextension.util.Constants
import javax.inject.Inject

class MovieDetailItemDecider @Inject constructor() {
    fun provideImagePath(path: String?): String? = "${Constants.POSTER_PATH}$path"
    fun provideBackdropPath(path: String?): String? = "${Constants.BACKDROP_PATH}$path"
}
