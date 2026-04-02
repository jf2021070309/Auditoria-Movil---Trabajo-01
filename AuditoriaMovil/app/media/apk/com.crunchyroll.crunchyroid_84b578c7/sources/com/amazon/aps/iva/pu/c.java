package com.amazon.aps.iva.pu;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ellation.crunchyroll.commenting.comments.pendingstate.banner.PendingStateBannerLayout;
import com.ellation.widgets.CrunchyrollSwipeRefreshLayout;
/* compiled from: FragmentCommentsBinding.java */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.d9.a {
    public final RelativeLayout a;
    public final l b;
    public final PendingStateBannerLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final RecyclerView f;
    public final CrunchyrollSwipeRefreshLayout g;
    public final k h;

    public c(RelativeLayout relativeLayout, l lVar, PendingStateBannerLayout pendingStateBannerLayout, FrameLayout frameLayout, FrameLayout frameLayout2, RecyclerView recyclerView, CrunchyrollSwipeRefreshLayout crunchyrollSwipeRefreshLayout, k kVar) {
        this.a = relativeLayout;
        this.b = lVar;
        this.c = pendingStateBannerLayout;
        this.d = frameLayout;
        this.e = frameLayout2;
        this.f = recyclerView;
        this.g = crunchyrollSwipeRefreshLayout;
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
