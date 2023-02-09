package com.example.pixabay.network

import java.net.IDN

data class PixabayModel(
    val total: Int,
    val totalHits: Int,
    val hits: List<ImageModel>,

    )

data class ImageModel(
    val id:Int,
    val previewWidth:Int,
    val previewHeight:Int,
    val imageWidth:Int,
    val imageHeight:Int,
    val views:Int,
    val likes:Int,
    val comments:Int,
    val downloads:Int,
    val user_id:Int,
    val collections:Int,
    val imageSize:Int,
    val webformatURL:String,
    val webformatWidth:Int,
    val webformatHeight:String,
    val pageURL:String,
    val type:String,
    val user:String,
    val userImageURL:String,
    val tags:String,
    val previewURL:String,

    val largeImageURL: String,


)
