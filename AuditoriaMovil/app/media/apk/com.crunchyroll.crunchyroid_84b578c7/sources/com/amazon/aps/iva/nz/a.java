package com.amazon.aps.iva.nz;

import com.amazon.aps.iva.yb0.j;
/* compiled from: PlayheadUpdateMonitor.kt */
/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final String b;

    public a(String str, String str2) {
        j.f(str, "assetId");
        j.f(str2, "parentId");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayheadUpdate(assetId=");
        sb.append(this.a);
        sb.append(", parentId=");
        return defpackage.b.c(sb, this.b, ")");
    }
}
