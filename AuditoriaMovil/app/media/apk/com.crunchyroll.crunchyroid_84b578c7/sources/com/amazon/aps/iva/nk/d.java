package com.amazon.aps.iva.nk;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.qj.u;
import java.util.List;
/* compiled from: NextEpisodeState.kt */
/* loaded from: classes.dex */
public final class d {
    public final com.amazon.aps.iva.kk.c a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final List<? extends com.amazon.aps.iva.qj.h> f;
    public final String g;
    public final u h;

    public d() {
        this(0);
    }

    public static d a(d dVar, com.amazon.aps.iva.kk.c cVar, String str, List list, String str2, u uVar, int i) {
        com.amazon.aps.iva.kk.c cVar2;
        long j;
        long j2;
        String str3;
        String str4;
        List<? extends com.amazon.aps.iva.qj.h> list2;
        String str5;
        u uVar2;
        if ((i & 1) != 0) {
            cVar2 = dVar.a;
        } else {
            cVar2 = cVar;
        }
        if ((i & 2) != 0) {
            j = dVar.b;
        } else {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = dVar.c;
        } else {
            j2 = 0;
        }
        if ((i & 8) != 0) {
            str3 = dVar.d;
        } else {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = dVar.e;
        } else {
            str4 = str;
        }
        if ((i & 32) != 0) {
            list2 = dVar.f;
        } else {
            list2 = list;
        }
        if ((i & 64) != 0) {
            str5 = dVar.g;
        } else {
            str5 = str2;
        }
        if ((i & 128) != 0) {
            uVar2 = dVar.h;
        } else {
            uVar2 = uVar;
        }
        dVar.getClass();
        com.amazon.aps.iva.yb0.j.f(cVar2, "contentMetadata");
        com.amazon.aps.iva.yb0.j.f(str4, "adSessionId");
        com.amazon.aps.iva.yb0.j.f(list2, "availableSubtitlesOptions");
        return new d(cVar2, j, j2, str3, str4, list2, str5, uVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && com.amazon.aps.iva.yb0.j.a(this.d, dVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, dVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, dVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, dVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, dVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int a = com.amazon.aps.iva.b8.i.a(this.c, com.amazon.aps.iva.b8.i.a(this.b, this.a.hashCode() * 31, 31), 31);
        int i = 0;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a2 = defpackage.a.a(this.f, com.amazon.aps.iva.c80.a.b(this.e, (a + hashCode) * 31, 31), 31);
        String str2 = this.g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (a2 + hashCode2) * 31;
        u uVar = this.h;
        if (uVar != null) {
            i = uVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "NextEpisodeState(contentMetadata=" + this.a + ", playheadSec=" + this.b + ", durationMs=" + this.c + ", availableDate=" + this.d + ", adSessionId=" + this.e + ", availableSubtitlesOptions=" + this.f + ", videoToken=" + this.g + ", session=" + this.h + ')';
    }

    public d(com.amazon.aps.iva.kk.c cVar, long j, long j2, String str, String str2, List<? extends com.amazon.aps.iva.qj.h> list, String str3, u uVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "contentMetadata");
        com.amazon.aps.iva.yb0.j.f(str2, "adSessionId");
        com.amazon.aps.iva.yb0.j.f(list, "availableSubtitlesOptions");
        this.a = cVar;
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = list;
        this.g = str3;
        this.h = uVar;
    }

    public /* synthetic */ d(int i) {
        this(new com.amazon.aps.iva.kk.c(null, null, null, null, null, null, null, null, null, false, false, false, null, 0L, null, null, null, null, null, null, null, null, null, 268435455), 0L, 0L, null, "", z.b, null, new u(0, 0, 0, 0, 0, 0, null, 255));
    }
}
