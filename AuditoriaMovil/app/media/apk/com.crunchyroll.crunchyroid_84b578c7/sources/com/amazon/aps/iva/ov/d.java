package com.amazon.aps.iva.ov;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ellation.feature.empty.EmptyCtaLayout;
import com.ellation.feature.empty.EmptyLayout;
/* compiled from: FragmentCrunchylistsBinding.java */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final EmptyCtaLayout b;
    public final EmptyLayout c;
    public final ConstraintLayout d;
    public final FrameLayout e;
    public final RecyclerView f;
    public final ConstraintLayout g;
    public final TextView h;
    public final TextView i;

    public d(ConstraintLayout constraintLayout, EmptyCtaLayout emptyCtaLayout, EmptyLayout emptyLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout3, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = emptyCtaLayout;
        this.c = emptyLayout;
        this.d = constraintLayout2;
        this.e = frameLayout;
        this.f = recyclerView;
        this.g = constraintLayout3;
        this.h = textView;
        this.i = textView2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
