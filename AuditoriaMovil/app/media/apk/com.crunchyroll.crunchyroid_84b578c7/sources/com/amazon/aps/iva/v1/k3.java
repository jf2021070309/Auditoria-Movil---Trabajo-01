package com.amazon.aps.iva.v1;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
/* compiled from: RenderNodeLayer.android.kt */
/* loaded from: classes.dex */
public final class k3 {
    public static final k3 a = new k3();

    public final void a(AndroidComposeView androidComposeView) {
        com.amazon.aps.iva.yb0.j.f(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
