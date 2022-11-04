package com.peacecodetech.myresume

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast


/**
 * @param url : url link to a particular social media platform
 * */
fun Context.goToUrl(url: String) {
    if (url.startsWith("https://") || url.startsWith("http://")) {
        val uriUrl = Uri.parse(url)
        val launchBrowser = Intent(Intent.ACTION_VIEW, uriUrl)
        startActivity(launchBrowser)

    } else {
        Toast.makeText(this, "Invalid Url", Toast.LENGTH_SHORT).show()
    }
}

//social media links
const val twitterLink = "https://twitter.com/Kwesi_Welbred"
const val linkendInLink = "https://www.linkedin.com/in/peacemaker-otoo"
const val githubLink = "https://github.com/otoo-peacemaker"
