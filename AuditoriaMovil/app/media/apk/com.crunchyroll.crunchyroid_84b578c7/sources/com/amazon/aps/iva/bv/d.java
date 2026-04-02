package com.amazon.aps.iva.bv;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: AddToCrunchylistInput.kt */
/* loaded from: classes2.dex */
public final class d implements Serializable {
    public final String b;
    public final t c;
    public final String d;
    public final String e;

    public d(String str, String str2, t tVar, String str3) {
        j.f(str, "contentId");
        j.f(tVar, "contentType");
        j.f(str2, "contentTitle");
        j.f(str3, "channelId");
        this.b = str;
        this.c = tVar;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j.a(this.b, dVar.b) && this.c == dVar.c && j.a(this.d, dVar.d) && j.a(this.e, dVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + com.amazon.aps.iva.c80.a.b(this.d, l1.a(this.c, this.b.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddToCrunchylistInput(contentId=");
        sb.append(this.b);
        sb.append(", contentType=");
        sb.append(this.c);
        sb.append(", contentTitle=");
        sb.append(this.d);
        sb.append(", channelId=");
        return defpackage.b.c(sb, this.e, ")");
    }
}
