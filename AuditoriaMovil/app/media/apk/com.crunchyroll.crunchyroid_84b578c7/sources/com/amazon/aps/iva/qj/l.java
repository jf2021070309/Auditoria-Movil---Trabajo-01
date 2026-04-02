package com.amazon.aps.iva.qj;

import com.amazon.aps.iva.o0.t1;
/* compiled from: VideoAudioVersions.kt */
/* loaded from: classes.dex */
public final class l {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;

    public l() {
        this(null, false, null, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, lVar.a) && this.b == lVar.b && com.amazon.aps.iva.yb0.j.a(this.c, lVar.c) && this.d == lVar.d && com.amazon.aps.iva.yb0.j.a(this.e, lVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, lVar.f)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 1;
        boolean z = this.b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int b = com.amazon.aps.iva.c80.a.b(this.c, (hashCode + i2) * 31, 31);
        boolean z2 = this.d;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return this.f.hashCode() + com.amazon.aps.iva.c80.a.b(this.e, (b + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAudioVersions(id=");
        sb.append(this.a);
        sb.append(", isPremiumOnly=");
        sb.append(this.b);
        sb.append(", mediaId=");
        sb.append(this.c);
        sb.append(", isOriginal=");
        sb.append(this.d);
        sb.append(", variant=");
        sb.append(this.e);
        sb.append(", audioLocale=");
        return t1.b(sb, this.f, ')');
    }

    public l(String str, boolean z, String str2, boolean z2, int i) {
        String str3 = (i & 1) != 0 ? "" : null;
        z = (i & 2) != 0 ? false : z;
        str = (i & 4) != 0 ? "" : str;
        z2 = (i & 8) != 0 ? false : z2;
        String str4 = (i & 16) != 0 ? "" : null;
        str2 = (i & 32) != 0 ? "" : str2;
        com.amazon.aps.iva.yb0.j.f(str3, "id");
        com.amazon.aps.iva.yb0.j.f(str, "mediaId");
        com.amazon.aps.iva.yb0.j.f(str4, "variant");
        com.amazon.aps.iva.yb0.j.f(str2, "audioLocale");
        this.a = str3;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = str4;
        this.f = str2;
    }
}
