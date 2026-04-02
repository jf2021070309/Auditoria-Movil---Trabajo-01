package com.amazon.aps.iva.gi;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
/* compiled from: MusicCardOverflowMenuProvider.kt */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final String b;
    public final t c;
    public final String d;
    public final String e;

    public f(String str, String str2, t tVar, String str3, String str4) {
        j.f(str, "id");
        j.f(str2, "artistId");
        j.f(tVar, "type");
        j.f(str3, "title");
        j.f(str4, "artistName");
        this.a = str;
        this.b = str2;
        this.c = tVar;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (j.a(this.a, fVar.a) && j.a(this.b, fVar.b) && this.c == fVar.c && j.a(this.d, fVar.d) && j.a(this.e, fVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + com.amazon.aps.iva.c80.a.b(this.d, l1.a(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicOverflowData(id=");
        sb.append(this.a);
        sb.append(", artistId=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", artistName=");
        return defpackage.b.c(sb, this.e, ")");
    }
}
