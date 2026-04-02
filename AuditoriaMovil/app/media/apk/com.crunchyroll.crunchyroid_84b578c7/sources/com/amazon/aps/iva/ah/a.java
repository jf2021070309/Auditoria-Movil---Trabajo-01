package com.amazon.aps.iva.ah;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.player.presentation.playerview.PlayerViewLayout;
/* compiled from: LayoutEmailVerificationBannerBinding.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a = 0;
    public final ConstraintLayout b;
    public final Object c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;

    public a(ConstraintLayout constraintLayout, FrameLayout frameLayout, com.amazon.aps.iva.vf.a aVar, Guideline guideline, PlayerViewLayout playerViewLayout, FrameLayout frameLayout2, RecyclerView recyclerView, ConstraintLayout constraintLayout2) {
        this.b = constraintLayout;
        this.c = aVar;
        this.d = guideline;
        this.e = playerViewLayout;
        this.f = frameLayout2;
        this.g = recyclerView;
        this.h = constraintLayout2;
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

    public a(ConstraintLayout constraintLayout, View view, TextView textView, TextView textView2, Space space, TextView textView3, TextView textView4, Flow flow) {
        this.b = constraintLayout;
        this.c = textView;
        this.d = textView2;
        this.g = space;
        this.e = textView3;
        this.f = textView4;
        this.h = flow;
    }
}
