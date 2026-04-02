package com.amazon.aps.iva.ap;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: WatchScreenContentInput.kt */
/* loaded from: classes2.dex */
public final class a implements Serializable {
    public final String b;
    public final t c;
    public final String d;

    public a(String str, t tVar) {
        j.f(str, "containerId");
        j.f(tVar, "containerResourceType");
        this.b = str;
        this.c = tVar;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.b, aVar.b) && this.c == aVar.c && j.a(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = l1.a(this.c, this.b.hashCode() * 31, 31);
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WatchScreenContentInput(containerId=");
        sb.append(this.b);
        sb.append(", containerResourceType=");
        sb.append(this.c);
        sb.append(", seasonId=");
        return defpackage.b.c(sb, this.d, ")");
    }
}
