package com.amazon.aps.iva.mj;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
/* compiled from: LayoutPlayerGesturesBinding.java */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.d9.a {
    public final FrameLayout a;
    public final ComposeView b;

    public d(FrameLayout frameLayout, ComposeView composeView) {
        this.a = frameLayout;
        this.b = composeView;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
