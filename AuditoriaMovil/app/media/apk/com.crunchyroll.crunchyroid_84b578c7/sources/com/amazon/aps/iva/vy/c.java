package com.amazon.aps.iva.vy;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.crunchyroll.ui.genres.GenresLayout;
/* compiled from: LayoutArtistSummaryBinding.java */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;
    public final GenresLayout e;
    public final View f;
    public final TextView g;

    public c(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, GenresLayout genresLayout, View view, TextView textView3) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = textView;
        this.d = textView2;
        this.e = genresLayout;
        this.f = view;
        this.g = textView3;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
