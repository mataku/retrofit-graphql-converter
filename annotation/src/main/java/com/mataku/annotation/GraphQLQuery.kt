package com.mataku.annotation

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class GraphQLQuery(val value: String)