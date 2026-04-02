package com.amazon.aps.iva.xq;
/* compiled from: RumViewScope.kt */
/* loaded from: classes2.dex */
public final class l implements com.amazon.aps.iva.er.f {
    public double a = Double.NaN;
    public final /* synthetic */ k b;

    public l(k kVar) {
        this.b = kVar;
    }

    @Override // com.amazon.aps.iva.er.f
    public final void a(com.amazon.aps.iva.er.e eVar) {
        boolean isNaN = Double.isNaN(this.a);
        double d = eVar.c;
        if (isNaN) {
            this.a = d;
        } else {
            this.b.G = Double.valueOf(d - this.a);
        }
    }
}
