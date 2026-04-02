package com.amazon.aps.iva.w70;

import com.amazon.aps.iva.wy.j;
/* compiled from: CustomTabItemPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<d> {
    public final String b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, int i) {
        super(dVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(dVar, "view");
        com.amazon.aps.iva.yb0.j.f(str, "tabTitle");
        this.b = str;
        this.c = i;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        getView().setTitle(this.b);
        int i = this.c;
        if (i != 0) {
            getView().setIcon(i);
        }
    }
}
