package com.amazon.aps.iva.f00;
/* compiled from: PlayableAssetUiModel.kt */
/* loaded from: classes2.dex */
public final class v implements a {
    public final String b;
    public final String c;
    public final String d;

    public v(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "seasonId");
        com.amazon.aps.iva.yb0.j.f(str2, "seasonTitle");
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        this.b = str;
        this.c = str2;
        this.d = str;
    }

    public final Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, vVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, vVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, vVar.d)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.f00.a
    public final String getAdapterId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeasonHeader(seasonId=");
        sb.append(this.b);
        sb.append(", seasonTitle=");
        sb.append(this.c);
        sb.append(", adapterId=");
        return defpackage.b.c(sb, this.d, ")");
    }
}
