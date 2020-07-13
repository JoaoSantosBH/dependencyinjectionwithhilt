package com.ioasys.dependencyinjectionwithhilt.data.remote.interactor

sealed class Result<out T : Any>

data class Success<out T : Any>(val data: T) : Result<T>()

data class Failure(val error: Throwable?) : Result<Nothing>()