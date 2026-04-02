package com.amazon.aps.iva.nk;

import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.qj.u;
/* compiled from: SessionHeartbeatState.kt */
/* loaded from: classes.dex */
public final class h {
    public final u a;
    public final String b;
    public final String c;

    public h() {
        this(null, null, null);
    }

    public static h a(h hVar, u uVar, String str, String str2, int i) {
        if ((i & 1) != 0) {
            uVar = hVar.a;
        }
        if ((i & 2) != 0) {
            str = hVar.b;
        }
        if ((i & 4) != 0) {
            str2 = hVar.c;
        }
        hVar.getClass();
        return new h(uVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, hVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, hVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, hVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        u uVar = this.a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionHeartbeatState(session=");
        sb.append(this.a);
        sb.append(", contentId=");
        sb.append(this.b);
        sb.append(", token=");
        return t1.b(sb, this.c, ')');
    }

    public h(u uVar, String str, String str2) {
        this.a = uVar;
        this.b = str;
        this.c = str2;
    }
}
