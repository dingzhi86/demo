package com.github.dingzhi86.demo.services

import com.intellij.openapi.project.Project
import com.github.dingzhi86.demo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
