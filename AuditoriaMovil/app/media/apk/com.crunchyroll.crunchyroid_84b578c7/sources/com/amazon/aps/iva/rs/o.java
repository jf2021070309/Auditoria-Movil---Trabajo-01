package com.amazon.aps.iva.rs;
/* compiled from: BillingProduct.kt */
/* loaded from: classes2.dex */
public final class o {
    public final String a;
    public final String b;
    public final com.amazon.aps.iva.ss.b c;
    public final n d;
    public final m e;

    public o(String str, String str2, com.amazon.aps.iva.ss.b bVar, n nVar, m mVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = nVar;
        this.e = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, oVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, oVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, oVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, oVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, oVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
        int i = 0;
        com.amazon.aps.iva.ss.b bVar = this.c;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int hashCode2 = (this.d.hashCode() + ((b + hashCode) * 31)) * 31;
        m mVar = this.e;
        if (mVar != null) {
            i = mVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "BillingProduct(productId=" + this.a + ", title=" + this.b + ", freeTrialPeriod=" + this.c + ", basePhase=" + this.d + ", offer=" + this.e + ")";
    }
}
