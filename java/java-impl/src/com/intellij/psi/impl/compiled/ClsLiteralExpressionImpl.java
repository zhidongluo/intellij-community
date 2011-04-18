/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.psi.impl.compiled;

import com.intellij.psi.*;
import com.intellij.psi.impl.source.tree.JavaElementType;
import com.intellij.psi.impl.source.tree.TreeElement;
import org.jetbrains.annotations.NotNull;

public class ClsLiteralExpressionImpl extends ClsElementImpl implements PsiLiteralExpression {
  private ClsElementImpl myParent;
  private final String myText;
  private final PsiType myType;
  private final Object myValue;

  public ClsLiteralExpressionImpl(ClsElementImpl parent, String text, PsiType type, Object value) {
    myParent = parent;
    myText = text;
    myType = type;
    myValue = value;
  }

  void setParent(ClsElementImpl parent) {
    myParent = parent;
  }

  public PsiType getType() {
    return myType;
  }

  public Object getValue() {
    return myValue;
  }

  public String getText() {
    return myText;
  }

  public String getParsingError() {
    return null;
  }

  public void appendMirrorText(final int indentLevel, final StringBuilder buffer) {
    buffer.append(getText());
  }

  public void setMirror(@NotNull TreeElement element) {
    setMirrorCheckingType(element, JavaElementType.LITERAL_EXPRESSION);
  }

  @NotNull
  public PsiElement[] getChildren() {
    return PsiElement.EMPTY_ARRAY;
  }

  public PsiElement getParent() {
    return myParent;
  }

  public String toString() {
    return "PsiLiteralExpression:" + getText();
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JavaElementVisitor) {
      ((JavaElementVisitor)visitor).visitLiteralExpression(this);
    }
    else {
      visitor.visitElement(this);
    }
  }
}
