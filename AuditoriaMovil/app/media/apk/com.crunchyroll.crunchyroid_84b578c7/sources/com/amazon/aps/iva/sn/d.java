package com.amazon.aps.iva.sn;

import com.amazon.aps.iva.wy.j;
import com.crunchyroll.sortandfilters.screen.SortAndFilterActivity;
/* compiled from: SortAndFilterPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> implements c {
    public final boolean b;

    public d(SortAndFilterActivity sortAndFilterActivity, boolean z) {
        super(sortAndFilterActivity, new j[0]);
        this.b = z;
    }

    @Override // com.amazon.aps.iva.sn.c
    public final void c() {
        getView().closeScreen();
    }

    @Override // com.amazon.aps.iva.sn.c
    public final void f2() {
        getView().closeScreen();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        if (this.b) {
            getView().Xa();
        }
    }
}
