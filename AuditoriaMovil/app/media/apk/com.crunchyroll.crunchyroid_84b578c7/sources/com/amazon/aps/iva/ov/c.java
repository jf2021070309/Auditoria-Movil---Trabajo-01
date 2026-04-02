package com.amazon.aps.iva.ov;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ellation.feature.empty.EmptyLayout;
import com.ellation.widgets.searchtoolbar.SearchToolbarLayout;
/* compiled from: FragmentCrunchylistSearchBinding.java */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final EmptyLayout d;
    public final FrameLayout e;
    public final RecyclerView f;
    public final SearchToolbarLayout g;

    public c(ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, EmptyLayout emptyLayout, FrameLayout frameLayout3, RecyclerView recyclerView, SearchToolbarLayout searchToolbarLayout) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = emptyLayout;
        this.e = frameLayout3;
        this.f = recyclerView;
        this.g = searchToolbarLayout;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
