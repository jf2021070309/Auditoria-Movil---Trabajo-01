package com.amazon.aps.iva.pu;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ellation.widgets.CrunchyrollSwipeRefreshLayout;
/* compiled from: FragmentCommentRepliesBinding.java */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final com.amazon.aps.iva.pe.d b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final RecyclerView e;
    public final CrunchyrollSwipeRefreshLayout f;
    public final g g;

    public b(ConstraintLayout constraintLayout, com.amazon.aps.iva.pe.d dVar, FrameLayout frameLayout, FrameLayout frameLayout2, RecyclerView recyclerView, CrunchyrollSwipeRefreshLayout crunchyrollSwipeRefreshLayout, g gVar) {
        this.a = constraintLayout;
        this.b = dVar;
        this.c = frameLayout;
        this.d = frameLayout2;
        this.e = recyclerView;
        this.f = crunchyrollSwipeRefreshLayout;
        this.g = gVar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
