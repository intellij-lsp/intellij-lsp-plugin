package com.github.gtache.lsp.contributors.icon

import javax.swing.Icon

import com.intellij.openapi.extensions.ExtensionPointName
import org.eclipse.lsp4j.CompletionItemKind

object LSPIconProvider {
  val EP_NAME: ExtensionPointName[LSPIconProvider] = ExtensionPointName.create("com.github.gtache.lsp.contributors.icon.LSPIconProvider")
}

trait LSPIconProvider {

  def getIcon(kind: CompletionItemKind): Icon
}