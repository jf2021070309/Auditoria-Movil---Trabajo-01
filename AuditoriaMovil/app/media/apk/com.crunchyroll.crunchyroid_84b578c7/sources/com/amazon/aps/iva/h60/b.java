package com.amazon.aps.iva.h60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.watchscreen.screen.assets.allassetsbutton.AllAssetsButton;
/* compiled from: LayoutWatchScreenAssetsBinding.java */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final RelativeLayout a;
    public final AllAssetsButton b;
    public final RecyclerView c;
    public final FrameLayout d;

    public b(RelativeLayout relativeLayout, AllAssetsButton allAssetsButton, RecyclerView recyclerView, FrameLayout frameLayout) {
        this.a = relativeLayout;
        this.b = allAssetsButton;
        this.c = recyclerView;
        this.d = frameLayout;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
