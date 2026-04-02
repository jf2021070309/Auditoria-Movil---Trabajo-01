package com.amazon.aps.iva.ov;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: FragmentAddToCrunchylistBinding.java */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final TextView c;
    public final com.amazon.aps.iva.pu.f d;
    public final FrameLayout e;
    public final g f;
    public final FrameLayout g;
    public final RecyclerView h;
    public final com.amazon.aps.iva.uu.a i;

    public b(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, com.amazon.aps.iva.pu.f fVar, FrameLayout frameLayout2, g gVar, FrameLayout frameLayout3, RecyclerView recyclerView, com.amazon.aps.iva.uu.a aVar) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = textView;
        this.d = fVar;
        this.e = frameLayout2;
        this.f = gVar;
        this.g = frameLayout3;
        this.h = recyclerView;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
