package com.amazon.aps.iva.d1;

import androidx.compose.ui.focus.FocusTargetNode;
/* compiled from: FocusRequesterModifierNode.kt */
/* loaded from: classes.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<FocusTargetNode, Boolean> {
    public static final u h = new u();

    public u() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = focusTargetNode;
        com.amazon.aps.iva.yb0.j.f(focusTargetNode2, "it");
        return Boolean.valueOf(y.h(focusTargetNode2));
    }
}
