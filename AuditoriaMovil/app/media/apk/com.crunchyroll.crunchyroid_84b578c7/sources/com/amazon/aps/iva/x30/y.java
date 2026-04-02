package com.amazon.aps.iva.x30;
/* compiled from: SearchResultSummaryViewModel.kt */
/* loaded from: classes2.dex */
public final class y extends com.amazon.aps.iva.r30.f implements w {
    public final int c;
    public final j d;
    public String e;

    public y(int i, k kVar) {
        super(kVar);
        this.c = i;
        this.d = kVar;
        this.e = "";
    }

    @Override // com.amazon.aps.iva.x30.w
    public final void A() {
        String str = this.e;
        this.e = str;
        com.amazon.aps.iva.ez.h.c(this.b, null);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new x(this, str, null), 3);
    }

    @Override // com.amazon.aps.iva.x30.w
    public final void V() {
        this.e = "";
    }

    @Override // com.amazon.aps.iva.x30.w
    public final void i8(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "searchString");
        if (!com.amazon.aps.iva.yb0.j.a(this.e, str)) {
            this.e = str;
            com.amazon.aps.iva.ez.h.c(this.b, null);
            com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new x(this, str, null), 3);
        }
    }

    @Override // com.amazon.aps.iva.x30.w
    public final String m1() {
        return this.e;
    }
}
