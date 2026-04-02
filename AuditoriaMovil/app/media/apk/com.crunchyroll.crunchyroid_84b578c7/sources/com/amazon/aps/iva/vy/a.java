package com.amazon.aps.iva.vy;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.music.artist.summary.ArtistSummaryLayout;
import com.ellation.widgets.FixedAspectRatioImageView;
import com.ellation.widgets.tabs.CustomTabLayout;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: ActivityArtistBinding.java */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final AppBarLayout b;
    public final LinearLayout c;
    public final View d;
    public final com.amazon.aps.iva.xd.d e;
    public final View f;
    public final FixedAspectRatioImageView g;
    public final TextView h;
    public final ArtistSummaryLayout i;
    public final FrameLayout j;
    public final CustomTabLayout k;
    public final FrameLayout l;
    public final TextView m;
    public final d n;
    public final FrameLayout o;
    public final com.amazon.aps.iva.vf.a p;
    public final RecyclerView q;

    public a(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, LinearLayout linearLayout, View view, com.amazon.aps.iva.xd.d dVar, View view2, FixedAspectRatioImageView fixedAspectRatioImageView, TextView textView, ArtistSummaryLayout artistSummaryLayout, FrameLayout frameLayout, CustomTabLayout customTabLayout, FrameLayout frameLayout2, TextView textView2, d dVar2, FrameLayout frameLayout3, com.amazon.aps.iva.vf.a aVar, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = appBarLayout;
        this.c = linearLayout;
        this.d = view;
        this.e = dVar;
        this.f = view2;
        this.g = fixedAspectRatioImageView;
        this.h = textView;
        this.i = artistSummaryLayout;
        this.j = frameLayout;
        this.k = customTabLayout;
        this.l = frameLayout2;
        this.m = textView2;
        this.n = dVar2;
        this.o = frameLayout3;
        this.p = aVar;
        this.q = recyclerView;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
