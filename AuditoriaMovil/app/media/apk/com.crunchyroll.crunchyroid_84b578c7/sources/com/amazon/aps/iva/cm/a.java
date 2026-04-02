package com.amazon.aps.iva.cm;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.widgets.ScrollToggleRecyclerView;
import com.ellation.widgets.ratingbar.RatingBar;
/* compiled from: ActivityAvatarSelectionBinding.java */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a = 0;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;
    public final FrameLayout e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;
    public final ViewGroup j;

    public a(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, TextView textView2, FrameLayout frameLayout, TextView textView3, View view, TextView textView4, RatingBar ratingBar) {
        this.b = constraintLayout;
        this.c = textView;
        this.g = linearLayout;
        this.d = textView2;
        this.e = frameLayout;
        this.h = textView3;
        this.f = view;
        this.i = textView4;
        this.j = ratingBar;
    }

    public final ConstraintLayout a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        ConstraintLayout constraintLayout = this.b;
        switch (i) {
            case 0:
            default:
                return constraintLayout;
        }
    }

    public a(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, View view, View view2, FrameLayout frameLayout, ScrollToggleRecyclerView scrollToggleRecyclerView, TextView textView, TextView textView2) {
        this.b = constraintLayout;
        this.g = imageView;
        this.h = imageView2;
        this.f = view;
        this.i = view2;
        this.e = frameLayout;
        this.j = scrollToggleRecyclerView;
        this.c = textView;
        this.d = textView2;
    }
}
