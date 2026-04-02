package com.amazon.aps.iva.f5;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.leanback.widget.SearchBar;
/* compiled from: SearchBar.java */
/* loaded from: classes.dex */
public final class u implements Runnable {
    public final /* synthetic */ SearchBar b;

    public u(SearchBar searchBar) {
        this.b = searchBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchBar searchBar = this.b;
        searchBar.b.requestFocusFromTouch();
        searchBar.b.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, searchBar.b.getWidth(), searchBar.b.getHeight(), 0));
        searchBar.b.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, searchBar.b.getWidth(), searchBar.b.getHeight(), 0));
    }
}
