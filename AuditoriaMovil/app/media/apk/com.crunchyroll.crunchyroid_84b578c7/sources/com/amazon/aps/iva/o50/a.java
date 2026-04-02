package com.amazon.aps.iva.o50;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ellation.crunchyroll.showrating.ratingdialogv2.widgets.AverageRatingLayout;
import com.ellation.crunchyroll.showrating.ratingdialogv2.widgets.RatingProgressLayout;
import com.ellation.crunchyroll.ui.userratingbar.UserRatingBar;
/* compiled from: DialogShowRatingV2Binding.java */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final FrameLayout a;
    public final AverageRatingLayout b;
    public final RatingProgressLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final com.amazon.aps.iva.uu.a f;
    public final TextView g;
    public final ImageView h;
    public final UserRatingBar i;
    public final TextView j;

    public a(FrameLayout frameLayout, AverageRatingLayout averageRatingLayout, RatingProgressLayout ratingProgressLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, com.amazon.aps.iva.uu.a aVar, TextView textView, ImageView imageView, UserRatingBar userRatingBar, TextView textView2) {
        this.a = frameLayout;
        this.b = averageRatingLayout;
        this.c = ratingProgressLayout;
        this.d = frameLayout2;
        this.e = frameLayout3;
        this.f = aVar;
        this.g = textView;
        this.h = imageView;
        this.i = userRatingBar;
        this.j = textView2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
