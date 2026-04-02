package com.amazon.aps.iva.cj;
/* compiled from: AdvertisingInfoProvider.kt */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final boolean b;
    public final String c;

    public a(String str, boolean z) {
        String str2;
        this.a = str;
        this.b = z;
        if (z) {
            str2 = "afai";
        } else {
            str2 = "adid";
        }
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && this.b == aVar.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AdvertisingInfo(id=" + this.a + ", isAmazon=" + this.b + ")";
    }
}
