package com.amazon.aps.iva.f5;

import androidx.leanback.widget.SearchBar;
/* compiled from: SearchBar.java */
/* loaded from: classes.dex */
public final class t implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ SearchBar c;

    public t(SearchBar searchBar, int i) {
        this.c = searchBar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchBar searchBar = this.c;
        searchBar.u.play(searchBar.v.get(this.b), 1.0f, 1.0f, 1, 0, 1.0f);
    }
}
