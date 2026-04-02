package com.amazon.aps.iva.z80;

import com.google.android.material.search.SearchView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ SearchView c;

    public /* synthetic */ g(SearchView searchView, int i) {
        this.b = i;
        this.c = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        SearchView searchView = this.c;
        switch (i) {
            case 0:
                SearchView.d(searchView);
                return;
            default:
                searchView.requestFocusAndShowKeyboardIfNeeded();
                return;
        }
    }
}
