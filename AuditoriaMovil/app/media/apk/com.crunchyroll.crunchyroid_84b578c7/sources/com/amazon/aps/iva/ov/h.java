package com.amazon.aps.iva.ov;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.widgets.overflow.OverflowButton;
/* compiled from: LayoutCrunchylistItemBinding.java */
/* loaded from: classes2.dex */
public final class h implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final OverflowButton e;

    public h(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, OverflowButton overflowButton) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = overflowButton;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
