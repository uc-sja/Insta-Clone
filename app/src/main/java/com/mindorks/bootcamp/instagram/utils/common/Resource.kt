package com.mindorks.bootcamp.instagram.utils.common

data class Resource<out T> private constructor(val status: Status, val data: T?) {

    companion object {
        fun <T> success(data: T? = null): Resource<T> = Resource(Status.SUCCESS, data)

        fun <T> error(data: T? = null): Resource<T> = Resource(Status.ERROR, data)

        fun <T> loading(data: T? = null): Resource<T> = Resource(Status.LOADING, data)

        fun <T> unknown(data: T? = null): Resource<T> = Resource(Status.UNKNOWN, data)
    }
}


/*
sealed class Resource<out T>(val data: T?) {

    class Success<T>(data: T? = null):  Resource<T>(data)

    class Error<T>(data: T? = null): Resource<T>(data)

    class Loading<T>(data: T? = null): Resource<T>(data)

    class Unknown<T>(data: T? = null): Resource<T>(data)

}
 */

