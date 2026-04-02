package com.amazon.aps.iva.vy;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.crunchyroll.music.watch.screen.layout.WatchMusicLayout;
/* compiled from: ActivityWatchMusicBinding.java */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final LinearLayout a;
    public final FrameLayout b;
    public final com.amazon.aps.iva.vf.a c;
    public final WatchMusicLayout d;

    public b(LinearLayout linearLayout, FrameLayout frameLayout, com.amazon.aps.iva.vf.a aVar, WatchMusicLayout watchMusicLayout) {
        this.a = linearLayout;
        this.b = frameLayout;
        this.c = aVar;
        this.d = watchMusicLayout;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
