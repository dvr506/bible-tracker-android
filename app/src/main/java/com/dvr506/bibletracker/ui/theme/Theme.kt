package com.dvr506.bibletracker.data

data class ReadingEntry(
    val title: String,
    val chapterRange: String,
    val chaptersRead: Int,
    val percentage: Int
)
