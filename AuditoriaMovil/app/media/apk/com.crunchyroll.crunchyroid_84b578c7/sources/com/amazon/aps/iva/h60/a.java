package com.amazon.aps.iva.h60;

import android.view.View;
import android.widget.FrameLayout;
import com.crunchyroll.watchscreen.screen.layout.WatchScreenLayout;
/* compiled from: ActivityWatchScreenBinding.java */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final WatchScreenLayout a;
    public final FrameLayout b;
    public final WatchScreenLayout c;

    public a(WatchScreenLayout watchScreenLayout, FrameLayout frameLayout, WatchScreenLayout watchScreenLayout2) {
        this.a = watchScreenLayout;
        this.b = frameLayout;
        this.c = watchScreenLayout2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
