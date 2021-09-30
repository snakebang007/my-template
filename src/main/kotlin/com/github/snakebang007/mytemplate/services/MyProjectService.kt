package com.github.snakebang007.mytemplate.services

import com.intellij.openapi.project.Project
import com.github.snakebang007.mytemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
