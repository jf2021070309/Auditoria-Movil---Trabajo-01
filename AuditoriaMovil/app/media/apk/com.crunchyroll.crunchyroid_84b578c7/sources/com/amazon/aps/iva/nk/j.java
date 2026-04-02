package com.amazon.aps.iva.nk;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.qj.u;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import java.util.List;
import okhttp3.internal.http2.Http2;
/* compiled from: VideoPlayerState.kt */
/* loaded from: classes.dex */
public final class j {
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final float e;
    public final long f;
    public final e g;
    public final com.amazon.aps.iva.kk.c h;
    public final int i;
    public final com.amazon.aps.iva.dk.c j;
    public final boolean k;
    public final boolean l;
    public final c m;
    public String n;
    public final com.amazon.aps.iva.ik.f o;
    public final List<? extends com.amazon.aps.iva.ik.f> p;
    public final com.amazon.aps.iva.qj.h q;
    public final List<? extends com.amazon.aps.iva.qj.h> r;
    public final List<? extends com.amazon.aps.iva.qj.h> s;
    public final boolean t;
    public final String u;
    public final u v;

    public j() {
        this(0);
    }

    public static j a(j jVar, boolean z, long j, long j2, float f, long j3, e eVar, com.amazon.aps.iva.kk.c cVar, int i, com.amazon.aps.iva.dk.c cVar2, c cVar3, String str, com.amazon.aps.iva.ik.f fVar, List list, com.amazon.aps.iva.qj.h hVar, List list2, List list3, boolean z2, String str2, u uVar, int i2) {
        boolean z3;
        long j4;
        long j5;
        long j6;
        float f2;
        long j7;
        e eVar2;
        com.amazon.aps.iva.kk.c cVar4;
        int i3;
        com.amazon.aps.iva.dk.c cVar5;
        boolean z4;
        boolean z5;
        c cVar6;
        String str3;
        com.amazon.aps.iva.ik.f fVar2;
        List list4;
        com.amazon.aps.iva.qj.h hVar2;
        List list5;
        List list6;
        long j8;
        boolean z6;
        String str4;
        u uVar2;
        if ((i2 & 1) != 0) {
            z3 = jVar.a;
        } else {
            z3 = z;
        }
        if ((i2 & 2) != 0) {
            j4 = jVar.b;
        } else {
            j4 = j;
        }
        if ((i2 & 4) != 0) {
            j5 = jVar.c;
        } else {
            j5 = j2;
        }
        if ((i2 & 8) != 0) {
            j6 = jVar.d;
        } else {
            j6 = 0;
        }
        long j9 = j6;
        if ((i2 & 16) != 0) {
            f2 = jVar.e;
        } else {
            f2 = f;
        }
        if ((i2 & 32) != 0) {
            j7 = jVar.f;
        } else {
            j7 = j3;
        }
        if ((i2 & 64) != 0) {
            eVar2 = jVar.g;
        } else {
            eVar2 = eVar;
        }
        if ((i2 & 128) != 0) {
            cVar4 = jVar.h;
        } else {
            cVar4 = cVar;
        }
        if ((i2 & 256) != 0) {
            i3 = jVar.i;
        } else {
            i3 = i;
        }
        if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            cVar5 = jVar.j;
        } else {
            cVar5 = cVar2;
        }
        if ((i2 & 1024) != 0) {
            z4 = jVar.k;
        } else {
            z4 = false;
        }
        if ((i2 & 2048) != 0) {
            z5 = jVar.l;
        } else {
            z5 = false;
        }
        if ((i2 & 4096) != 0) {
            cVar6 = jVar.m;
        } else {
            cVar6 = cVar3;
        }
        if ((i2 & 8192) != 0) {
            str3 = jVar.n;
        } else {
            str3 = str;
        }
        long j10 = j7;
        if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            fVar2 = jVar.o;
        } else {
            fVar2 = fVar;
        }
        if ((32768 & i2) != 0) {
            list4 = jVar.p;
        } else {
            list4 = list;
        }
        float f3 = f2;
        if ((i2 & Cast.MAX_MESSAGE_LENGTH) != 0) {
            hVar2 = jVar.q;
        } else {
            hVar2 = hVar;
        }
        if ((i2 & 131072) != 0) {
            list5 = jVar.r;
        } else {
            list5 = list2;
        }
        if ((262144 & i2) != 0) {
            list6 = jVar.s;
        } else {
            list6 = list3;
        }
        if ((i2 & 524288) != 0) {
            j8 = j5;
            z6 = jVar.t;
        } else {
            j8 = j5;
            z6 = z2;
        }
        if ((1048576 & i2) != 0) {
            str4 = jVar.u;
        } else {
            str4 = str2;
        }
        if ((i2 & 2097152) != 0) {
            uVar2 = jVar.v;
        } else {
            uVar2 = uVar;
        }
        jVar.getClass();
        com.amazon.aps.iva.yb0.j.f(eVar2, "playbackState");
        com.amazon.aps.iva.yb0.j.f(cVar4, "contentMetadata");
        com.amazon.aps.iva.yb0.j.f(cVar6, "adState");
        com.amazon.aps.iva.yb0.j.f(str3, "adSessionId");
        com.amazon.aps.iva.yb0.j.f(fVar2, "selectedQuality");
        com.amazon.aps.iva.yb0.j.f(list4, "availableVideoQualities");
        com.amazon.aps.iva.yb0.j.f(hVar2, "selectedSubtitles");
        com.amazon.aps.iva.yb0.j.f(list5, "availableSubtitlesOptions");
        com.amazon.aps.iva.yb0.j.f(list6, "availableClosedCaptionOptions");
        return new j(z3, j4, j8, j9, f3, j10, eVar2, cVar4, i3, cVar5, z4, z5, cVar6, str3, fVar2, list4, hVar2, list5, list6, z6, str4, uVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d && com.amazon.aps.iva.yb0.j.a(Float.valueOf(this.e), Float.valueOf(jVar.e)) && this.f == jVar.f && this.g == jVar.g && com.amazon.aps.iva.yb0.j.a(this.h, jVar.h) && this.i == jVar.i && com.amazon.aps.iva.yb0.j.a(this.j, jVar.j) && this.k == jVar.k && this.l == jVar.l && com.amazon.aps.iva.yb0.j.a(this.m, jVar.m) && com.amazon.aps.iva.yb0.j.a(this.n, jVar.n) && com.amazon.aps.iva.yb0.j.a(this.o, jVar.o) && com.amazon.aps.iva.yb0.j.a(this.p, jVar.p) && com.amazon.aps.iva.yb0.j.a(this.q, jVar.q) && com.amazon.aps.iva.yb0.j.a(this.r, jVar.r) && com.amazon.aps.iva.yb0.j.a(this.s, jVar.s) && this.t == jVar.t && com.amazon.aps.iva.yb0.j.a(this.u, jVar.u) && com.amazon.aps.iva.yb0.j.a(this.v, jVar.v)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 1;
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int a = com.amazon.aps.iva.b8.i.a(this.f, t0.b(this.e, com.amazon.aps.iva.b8.i.a(this.d, com.amazon.aps.iva.b8.i.a(this.c, com.amazon.aps.iva.b8.i.a(this.b, r1 * 31, 31), 31), 31), 31), 31);
        int a2 = r.a(this.i, (this.h.hashCode() + ((this.g.hashCode() + a) * 31)) * 31, 31);
        int i2 = 0;
        com.amazon.aps.iva.dk.c cVar = this.j;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i3 = (a2 + hashCode) * 31;
        ?? r3 = this.k;
        int i4 = r3;
        if (r3 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r32 = this.l;
        int i6 = r32;
        if (r32 != 0) {
            i6 = 1;
        }
        int a3 = defpackage.a.a(this.s, defpackage.a.a(this.r, (this.q.hashCode() + defpackage.a.a(this.p, (this.o.hashCode() + com.amazon.aps.iva.c80.a.b(this.n, (this.m.hashCode() + ((i5 + i6) * 31)) * 31, 31)) * 31, 31)) * 31, 31), 31);
        boolean z2 = this.t;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        int i7 = (a3 + i) * 31;
        String str = this.u;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i8 = (i7 + hashCode2) * 31;
        u uVar = this.v;
        if (uVar != null) {
            i2 = uVar.hashCode();
        }
        return i8 + i2;
    }

    public final String toString() {
        return "VideoPlayerState(isPlaying=" + this.a + ", remainingDuration=" + this.b + ", currentPosition=" + this.c + ", seekPosition=" + this.d + ", progress=" + this.e + ", secondaryProgress=" + this.f + ", playbackState=" + this.g + ", contentMetadata=" + this.h + ", playerCommand=" + this.i + ", error=" + this.j + ", isFirstInitialize=" + this.k + ", isInAdMode=" + this.l + ", adState=" + this.m + ", adSessionId=" + this.n + ", selectedQuality=" + this.o + ", availableVideoQualities=" + this.p + ", selectedSubtitles=" + this.q + ", availableSubtitlesOptions=" + this.r + ", availableClosedCaptionOptions=" + this.s + ", playWhenReady=" + this.t + ", videoToken=" + this.u + ", session=" + this.v + ')';
    }

    public j(boolean z, long j, long j2, long j3, float f, long j4, e eVar, com.amazon.aps.iva.kk.c cVar, int i, com.amazon.aps.iva.dk.c cVar2, boolean z2, boolean z3, c cVar3, String str, com.amazon.aps.iva.ik.f fVar, List<? extends com.amazon.aps.iva.ik.f> list, com.amazon.aps.iva.qj.h hVar, List<? extends com.amazon.aps.iva.qj.h> list2, List<? extends com.amazon.aps.iva.qj.h> list3, boolean z4, String str2, u uVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "playbackState");
        com.amazon.aps.iva.yb0.j.f(cVar, "contentMetadata");
        com.amazon.aps.iva.yb0.j.f(cVar3, "adState");
        com.amazon.aps.iva.yb0.j.f(str, "adSessionId");
        com.amazon.aps.iva.yb0.j.f(fVar, "selectedQuality");
        com.amazon.aps.iva.yb0.j.f(list, "availableVideoQualities");
        com.amazon.aps.iva.yb0.j.f(hVar, "selectedSubtitles");
        com.amazon.aps.iva.yb0.j.f(list2, "availableSubtitlesOptions");
        com.amazon.aps.iva.yb0.j.f(list3, "availableClosedCaptionOptions");
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = f;
        this.f = j4;
        this.g = eVar;
        this.h = cVar;
        this.i = i;
        this.j = cVar2;
        this.k = z2;
        this.l = z3;
        this.m = cVar3;
        this.n = str;
        this.o = fVar;
        this.p = list;
        this.q = hVar;
        this.r = list2;
        this.s = list3;
        this.t = z4;
        this.u = str2;
        this.v = uVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ j(int r40) {
        /*
            r39 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            com.amazon.aps.iva.nk.e r11 = com.amazon.aps.iva.nk.e.IDLE
            com.amazon.aps.iva.kk.c r38 = new com.amazon.aps.iva.kk.c
            r12 = r38
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 268435455(0xfffffff, float:2.5243547E-29)
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r13 = 0
            r16 = 0
            com.amazon.aps.iva.nk.c r12 = new com.amazon.aps.iva.nk.c
            r0 = 0
            r15 = 15
            r12.<init>(r0, r15)
            java.lang.String r18 = ""
            com.amazon.aps.iva.ik.a r15 = new com.amazon.aps.iva.ik.a
            r0 = 0
            r15.<init>(r0)
            com.amazon.aps.iva.ik.a r14 = new com.amazon.aps.iva.ik.a
            r14.<init>(r0)
            java.util.List r20 = com.amazon.aps.iva.ee0.f1.J(r14)
            com.amazon.aps.iva.qj.f r21 = com.amazon.aps.iva.qj.f.a
            com.amazon.aps.iva.lb0.z r23 = com.amazon.aps.iva.lb0.z.b
            r24 = 1
            r25 = 0
            r26 = 0
            r0 = r39
            r19 = r12
            r12 = r38
            r14 = 0
            r22 = r15
            r15 = 1
            r17 = r19
            r19 = r22
            r22 = r23
            r0.<init>(r1, r2, r4, r6, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.nk.j.<init>(int):void");
    }
}
