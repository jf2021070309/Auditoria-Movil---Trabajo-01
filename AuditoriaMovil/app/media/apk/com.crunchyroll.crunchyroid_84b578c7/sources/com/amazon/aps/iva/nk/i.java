package com.amazon.aps.iva.nk;
/* compiled from: SettingsValuesState.kt */
/* loaded from: classes.dex */
public final class i {
    public final boolean a;
    public final String b;
    public final String c;
    public com.amazon.aps.iva.ik.f d;
    public final String e;
    public final boolean f;

    public i() {
        this(false, null, null, false, 63);
    }

    public static i a(i iVar, boolean z, String str, boolean z2, int i) {
        String str2;
        String str3;
        com.amazon.aps.iva.ik.f fVar;
        if ((i & 1) != 0) {
            z = iVar.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            str2 = iVar.b;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = iVar.c;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            fVar = iVar.d;
        } else {
            fVar = null;
        }
        if ((i & 16) != 0) {
            str = iVar.e;
        }
        String str4 = str;
        if ((i & 32) != 0) {
            z2 = iVar.f;
        }
        iVar.getClass();
        com.amazon.aps.iva.yb0.j.f(str2, "audioSettings");
        com.amazon.aps.iva.yb0.j.f(str3, "audioTag");
        com.amazon.aps.iva.yb0.j.f(fVar, "preferredQuality");
        com.amazon.aps.iva.yb0.j.f(str4, "subtitleSettings");
        return new i(z3, str2, str3, fVar, str4, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a == iVar.a && com.amazon.aps.iva.yb0.j.a(this.b, iVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, iVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, iVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, iVar.e) && this.f == iVar.f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        int i = 1;
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int b = com.amazon.aps.iva.c80.a.b(this.e, (this.d.hashCode() + com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, r1 * 31, 31), 31)) * 31, 31);
        boolean z2 = this.f;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return b + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsValuesState(isAutoPlay=");
        sb.append(this.a);
        sb.append(", audioSettings=");
        sb.append(this.b);
        sb.append(", audioTag=");
        sb.append(this.c);
        sb.append(", preferredQuality=");
        sb.append(this.d);
        sb.append(", subtitleSettings=");
        sb.append(this.e);
        sb.append(", areCaptionsEnabled=");
        return defpackage.a.b(sb, this.f, ')');
    }

    public i(boolean z, String str, String str2, com.amazon.aps.iva.ik.f fVar, String str3, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(str, "audioSettings");
        com.amazon.aps.iva.yb0.j.f(str2, "audioTag");
        com.amazon.aps.iva.yb0.j.f(fVar, "preferredQuality");
        com.amazon.aps.iva.yb0.j.f(str3, "subtitleSettings");
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = fVar;
        this.e = str3;
        this.f = z2;
    }

    public /* synthetic */ i(boolean z, com.amazon.aps.iva.ik.f fVar, String str, boolean z2, int i) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "" : null, (i & 4) != 0 ? "" : null, (i & 8) != 0 ? new com.amazon.aps.iva.ik.a(0) : fVar, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? false : z2);
    }
}
