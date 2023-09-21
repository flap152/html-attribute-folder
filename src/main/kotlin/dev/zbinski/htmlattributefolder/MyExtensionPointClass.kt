package dev.zbinski.htmlattributefolder

import com.intellij.lang.LanguageExtensionPoint
import com.intellij.lang.folding.FoldingBuilder
import com.intellij.lang.folding.LanguageFolding
import com.intellij.openapi.extensions.AbstractExtensionPointBean


class MyExtensionPointClass : AbstractExtensionPointBean() {
//abstract class  MyExtensionPointClass : FoldingBuilder {
    private val settings = AttributeFolderState.instance

//    <extensionPoint name="lang.foldingBuilder" beanClass="com.intellij.lang.LanguageExtensionPoint" dynamic="true">
//    <with attribute="implementationClass" implements="com.intellij.lang.folding.FoldingBuilder"/>
//    </extensionPoint>

//    constructor()

    @com.intellij.util.xmlb.annotations.Attribute("language")
    var language: String? = null

    @com.intellij.util.xmlb.annotations.Attribute("implementationClass")
    var implementationClass: String? = null
    val `class`: String
        get() = implementationClass!!
}