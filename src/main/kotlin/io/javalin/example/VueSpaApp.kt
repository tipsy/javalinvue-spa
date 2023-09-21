package io.javalin.example

import io.javalin.Javalin
import io.javalin.vue.VueComponent

fun main() {

    val app = Javalin.create {
        it.staticFiles.enableWebjars()
        it.spaRoot.addHandler("/", VueComponent("root-page"))
    }.start(8080)

}
