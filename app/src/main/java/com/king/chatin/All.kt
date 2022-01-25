package com.king.chatin

data class All(
    var profilePicture: Int,
    var profileName: String,
    var emailAddress: String,
    var password: String,
    var bio: String,
    var message: String,
    var timeOfMessage: String,
    var statusPost: Int,
    var media: Int
)

data class User1(
    var profilePicture: Int,
    var number: String,
    var name: String,
    var message: String,
    var time: String

)
