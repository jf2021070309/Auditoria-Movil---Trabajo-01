package com.amazon.aps.iva.lf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: FragmentConnectedAppsBinding.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final RelativeLayout a;
    public final RelativeLayout b;
    public final FrameLayout c;
    public final RecyclerView d;

    public a(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.a = relativeLayout;
        this.b = relativeLayout2;
        this.c = frameLayout;
        this.d = recyclerView;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
