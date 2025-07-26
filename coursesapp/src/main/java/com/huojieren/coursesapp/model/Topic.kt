package com.huojieren.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val topicNameResourceId: Int,
    val courseNumber: Int,
    @DrawableRes val topicImageResourceId: Int
)
