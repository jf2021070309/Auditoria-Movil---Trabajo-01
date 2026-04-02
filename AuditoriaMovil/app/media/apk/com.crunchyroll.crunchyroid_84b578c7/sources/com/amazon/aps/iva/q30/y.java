package com.amazon.aps.iva.q30;

import com.google.android.gms.actions.SearchIntents;
/* compiled from: RecentSearchesViewModel.kt */
/* loaded from: classes2.dex */
public final class y extends com.amazon.aps.iva.ez.b implements x {
    public final com.amazon.aps.iva.i5.v<String> b;

    public y() {
        super(new com.amazon.aps.iva.wy.j[0]);
        this.b = new com.amazon.aps.iva.i5.v<>();
    }

    @Override // com.amazon.aps.iva.q30.x
    public final void h7(String str) {
        com.amazon.aps.iva.yb0.j.f(str, SearchIntents.EXTRA_QUERY);
        com.amazon.aps.iva.i5.v<String> vVar = this.b;
        if (!com.amazon.aps.iva.yb0.j.a(vVar.d(), str)) {
            vVar.k(str);
        }
    }

    @Override // com.amazon.aps.iva.q30.x
    public final com.amazon.aps.iva.i5.v q0() {
        return this.b;
    }
}
