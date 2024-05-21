package com.example.tmdbclient.data.model.artist


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "popular_artists")//koristimo istu klasu i za Retrofit i za Room. Zbog Room anotiramo kao @Entity i moramo da definisemo @PrimaryKey
data class Artist(

    @PrimaryKey
    @SerializedName("id")
    val id: Int,
    //@ColumnInfo(name = "artist_name")
    @SerializedName("name")
    val name: String?,
    @SerializedName("popularity")
    val popularity: Double?,
    @SerializedName("profile_path")
    val profilePath: String?
)