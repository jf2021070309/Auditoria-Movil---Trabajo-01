package com.amazon.aps.iva.mk;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.yb0.j;
/* compiled from: MuxConfig.kt */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final b e;

    public a(String str, String str2, long j, b bVar) {
        j.f(str, "muxKey");
        j.f(str2, "userId");
        this.a = str;
        this.b = "Android Exoplayer";
        this.c = str2;
        this.d = j;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && this.d == aVar.d && j.a(this.e, aVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + i.a(this.d, com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "MuxConfig(muxKey=" + this.a + ", playerName=" + this.b + ", userId=" + this.c + ", playerInitTimeMs=" + this.d + ", customData=" + this.e + ')';
    }
}
