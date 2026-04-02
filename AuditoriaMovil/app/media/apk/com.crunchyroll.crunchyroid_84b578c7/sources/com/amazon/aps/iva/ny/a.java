package com.amazon.aps.iva.ny;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.crunchyroll.showrating.ratingprogressbar.RatingProgressBar;
/* compiled from: LayoutInAppUpdatesBinding.java */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a = 1;
    public final ViewGroup b;
    public final ViewGroup c;
    public final View d;
    public final View e;
    public final View f;
    public final ViewGroup g;
    public final ViewGroup h;

    public a(LinearLayout linearLayout, RatingProgressBar ratingProgressBar, RatingProgressBar ratingProgressBar2, RatingProgressBar ratingProgressBar3, RatingProgressBar ratingProgressBar4, RatingProgressBar ratingProgressBar5, LinearLayout linearLayout2) {
        this.b = linearLayout;
        this.c = ratingProgressBar;
        this.d = ratingProgressBar2;
        this.e = ratingProgressBar3;
        this.f = ratingProgressBar4;
        this.g = ratingProgressBar5;
        this.h = linearLayout2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                return (ConstraintLayout) viewGroup;
            default:
                return (LinearLayout) viewGroup;
        }
    }

    public a(ConstraintLayout constraintLayout, TextView textView, TextView textView2, FrameLayout frameLayout, TextView textView3, FrameLayout frameLayout2, ConstraintLayout constraintLayout2) {
        this.b = constraintLayout;
        this.d = textView;
        this.e = textView2;
        this.g = frameLayout;
        this.f = textView3;
        this.h = frameLayout2;
        this.c = constraintLayout2;
    }
}
