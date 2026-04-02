package com.amazon.aps.iva.o40;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.x50.t;
import java.io.Serializable;
/* compiled from: ShowContentInteractorInput.kt */
/* loaded from: classes2.dex */
public final class j implements Serializable {
    public final String b;
    public final t c;
    public final String d;

    public j(t tVar, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        com.amazon.aps.iva.yb0.j.f(tVar, "containerResourceType");
        this.b = str;
        this.c = tVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, jVar.b) && this.c == jVar.c && com.amazon.aps.iva.yb0.j.a(this.d, jVar.d)) {
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
        StringBuilder sb = new StringBuilder("ShowContentInteractorInput(containerId=");
        sb.append(this.b);
        sb.append(", containerResourceType=");
        sb.append(this.c);
        sb.append(", seasonId=");
        return defpackage.b.c(sb, this.d, ")");
    }
}
