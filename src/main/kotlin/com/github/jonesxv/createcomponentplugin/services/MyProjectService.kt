package com.github.jonesxv.createcomponentplugin.services

import com.intellij.openapi.project.Project
import com.github.jonesxv.createcomponentplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
