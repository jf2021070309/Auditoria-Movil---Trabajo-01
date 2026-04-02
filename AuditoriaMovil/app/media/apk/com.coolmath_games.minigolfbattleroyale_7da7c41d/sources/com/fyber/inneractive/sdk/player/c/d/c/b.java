package com.fyber.inneractive.sdk.player.c.d.c;

import com.fyber.inneractive.sdk.player.c.d.f;
import com.fyber.inneractive.sdk.player.c.d.g;
import com.fyber.inneractive.sdk.player.c.d.h;
import com.fyber.inneractive.sdk.player.c.d.i;
import com.fyber.inneractive.sdk.player.c.d.j;
import com.fyber.inneractive.sdk.player.c.d.m;
import com.fyber.inneractive.sdk.player.c.d.n;
import com.fyber.inneractive.sdk.player.c.k.k;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.io.IOException;
/* loaded from: classes.dex */
public final class b implements f {
    public static final i a = new i() { // from class: com.fyber.inneractive.sdk.player.c.d.c.b.1
        @Override // com.fyber.inneractive.sdk.player.c.d.i
        public final f[] a() {
            return new f[]{new b()};
        }
    };
    private static final int b = t.e("Xing");
    private static final int c = t.e("Info");
    private static final int d = t.e("VBRI");
    private final int e;
    private final long f;
    private final k g;
    private final com.fyber.inneractive.sdk.player.c.d.k h;
    private final j i;
    private h j;
    private n k;
    private int l;
    private com.fyber.inneractive.sdk.player.c.f.a m;
    private a n;
    private long o;
    private long p;
    private int q;

    /* loaded from: classes.dex */
    interface a extends m {
        long b(long j);
    }

    private static boolean a(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    public b() {
        this(0);
    }

    public b(int i) {
        this(i, (byte) 0);
    }

    private b(int i, byte b2) {
        this.e = i;
        this.f = -9223372036854775807L;
        this.g = new k(10);
        this.h = new com.fyber.inneractive.sdk.player.c.d.k();
        this.i = new j();
        this.o = -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final boolean a(g gVar) throws IOException, InterruptedException {
        return a(gVar, true);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(h hVar) {
        this.j = hVar;
        this.k = hVar.a(0);
        this.j.b();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(long j, long j2) {
        this.l = 0;
        this.o = -9223372036854775807L;
        this.p = 0L;
        this.q = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r11 != com.fyber.inneractive.sdk.player.c.d.c.b.c) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f0  */
    @Override // com.fyber.inneractive.sdk.player.c.d.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.c.d.g r38, com.fyber.inneractive.sdk.player.c.d.l r39) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.c.b.a(com.fyber.inneractive.sdk.player.c.d.g, com.fyber.inneractive.sdk.player.c.d.l):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0155, code lost:
        if (r18 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0157, code lost:
        r17.b(r3 + r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015c, code lost:
        r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015f, code lost:
        r16.l = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0161, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.fyber.inneractive.sdk.player.c.d.g r17, boolean r18) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.c.b.a(com.fyber.inneractive.sdk.player.c.d.g, boolean):boolean");
    }

    private a b(g gVar) throws IOException, InterruptedException {
        gVar.c(this.g.a, 0, 4);
        this.g.c(0);
        com.fyber.inneractive.sdk.player.c.d.k.a(this.g.j(), this.h);
        return new com.fyber.inneractive.sdk.player.c.d.c.a(gVar.c(), this.h.f, gVar.d());
    }
}
