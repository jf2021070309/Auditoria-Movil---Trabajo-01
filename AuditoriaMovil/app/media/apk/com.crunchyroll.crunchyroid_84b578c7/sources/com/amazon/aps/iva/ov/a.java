package com.amazon.aps.iva.ov;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.ellation.widgets.NestedScrollCoordinatorLayout;
import com.ellation.widgets.collapsibletoolbar.CollapsibleToolbarLayout;
/* compiled from: ActivityCrunchylistBinding.java */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final FrameLayout a;
    public final CollapsibleToolbarLayout b;
    public final com.amazon.aps.iva.cm.c c;
    public final FrameLayout d;
    public final com.amazon.aps.iva.mj.a e;
    public final RecyclerView f;
    public final FrameLayout g;
    public final NestedScrollCoordinatorLayout h;
    public final Toolbar i;

    public a(FrameLayout frameLayout, CollapsibleToolbarLayout collapsibleToolbarLayout, com.amazon.aps.iva.cm.c cVar, FrameLayout frameLayout2, com.amazon.aps.iva.mj.a aVar, RecyclerView recyclerView, FrameLayout frameLayout3, NestedScrollCoordinatorLayout nestedScrollCoordinatorLayout, Toolbar toolbar) {
        this.a = frameLayout;
        this.b = collapsibleToolbarLayout;
        this.c = cVar;
        this.d = frameLayout2;
        this.e = aVar;
        this.f = recyclerView;
        this.g = frameLayout3;
        this.h = nestedScrollCoordinatorLayout;
        this.i = toolbar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
