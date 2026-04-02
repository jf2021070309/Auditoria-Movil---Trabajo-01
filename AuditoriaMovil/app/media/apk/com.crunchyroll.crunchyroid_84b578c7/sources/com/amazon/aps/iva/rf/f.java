package com.amazon.aps.iva.rf;

import com.amazon.aps.iva.yb0.j;
/* compiled from: PremiumDubUiModel.kt */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final String b;
    public final String c;

    public f(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (j.a(this.a, fVar.a) && j.a(this.b, fVar.b) && j.a(this.c, fVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumDubUiModel(currentLocale=");
        sb.append(this.a);
        sb.append(", fallbackLocale=");
        sb.append(this.b);
        sb.append(", fallbackAssetId=");
        return defpackage.b.c(sb, this.c, ")");
    }
}
