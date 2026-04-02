package com.amazon.aps.iva.um;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SwitchProfileScreen.kt */
/* loaded from: classes2.dex */
public final class e {
    public final g<com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.ym.c>> a;
    public final String b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(g<? extends com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.ym.c>> gVar, String str, boolean z) {
        this.a = gVar;
        this.b = str;
        this.c = z;
    }

    public static e a(e eVar, g gVar, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            gVar = eVar.a;
        }
        if ((i & 2) != 0) {
            str = eVar.b;
        }
        if ((i & 4) != 0) {
            z = eVar.c;
        }
        eVar.getClass();
        j.f(gVar, "profiles");
        return new e(gVar, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.a, eVar.a) && j.a(this.b, eVar.b) && this.c == eVar.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        boolean z = this.c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwitchProfileState(profiles=");
        sb.append(this.a);
        sb.append(", backgroundImageId=");
        sb.append(this.b);
        sb.append(", isInEditMode=");
        return com.amazon.aps.iva.e4.e.c(sb, this.c, ")");
    }
}
