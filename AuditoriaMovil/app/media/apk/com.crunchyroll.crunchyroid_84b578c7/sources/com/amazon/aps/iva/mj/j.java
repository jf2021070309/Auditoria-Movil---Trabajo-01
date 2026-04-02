package com.amazon.aps.iva.mj;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteButton;
/* compiled from: PlayerToolbarBinding.java */
/* loaded from: classes.dex */
public final class j implements com.amazon.aps.iva.d9.a {
    public final LinearLayout a;
    public final ImageView b;
    public final ImageView c;
    public final ImageView d;
    public final MediaRouteButton e;
    public final TextView f;
    public final TextView g;
    public final LinearLayout h;
    public final ImageView i;

    public j(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, MediaRouteButton mediaRouteButton, TextView textView, TextView textView2, LinearLayout linearLayout2, ImageView imageView4) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = imageView3;
        this.e = mediaRouteButton;
        this.f = textView;
        this.g = textView2;
        this.h = linearLayout2;
        this.i = imageView4;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
