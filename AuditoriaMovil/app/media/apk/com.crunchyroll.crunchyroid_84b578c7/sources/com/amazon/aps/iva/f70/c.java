package com.amazon.aps.iva.f70;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.iva.pu.f;
import com.amazon.aps.iva.pu.l;
/* compiled from: LayoutLoadingStateBinding.java */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.d9.a {
    public final FrameLayout a;
    public final TextView b;
    public final l c;
    public final LinearLayout d;
    public final f e;
    public final TextView f;

    public c(FrameLayout frameLayout, TextView textView, l lVar, LinearLayout linearLayout, f fVar, TextView textView2) {
        this.a = frameLayout;
        this.b = textView;
        this.c = lVar;
        this.d = linearLayout;
        this.e = fVar;
        this.f = textView2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
