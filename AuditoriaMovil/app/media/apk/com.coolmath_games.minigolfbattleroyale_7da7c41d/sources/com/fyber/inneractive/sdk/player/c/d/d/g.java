package com.fyber.inneractive.sdk.player.c.d.d;

import com.fyber.inneractive.sdk.player.c.d.d.a;
import com.fyber.inneractive.sdk.player.c.d.m;
import com.fyber.inneractive.sdk.player.c.d.n;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes.dex */
public final class g implements com.fyber.inneractive.sdk.player.c.d.f, m {
    public static final com.fyber.inneractive.sdk.player.c.d.i a = new com.fyber.inneractive.sdk.player.c.d.i() { // from class: com.fyber.inneractive.sdk.player.c.d.d.g.1
        @Override // com.fyber.inneractive.sdk.player.c.d.i
        public final com.fyber.inneractive.sdk.player.c.d.f[] a() {
            return new com.fyber.inneractive.sdk.player.c.d.f[]{new g()};
        }
    };
    private static final int b = t.e("qt  ");
    private int g;
    private int h;
    private long i;
    private int j;
    private com.fyber.inneractive.sdk.player.c.k.k k;
    private int l;
    private int m;
    private com.fyber.inneractive.sdk.player.c.d.h n;
    private a[] o;
    private long p;
    private boolean q;
    private final com.fyber.inneractive.sdk.player.c.k.k e = new com.fyber.inneractive.sdk.player.c.k.k(16);
    private final Stack<a.C0055a> f = new Stack<>();
    private final com.fyber.inneractive.sdk.player.c.k.k c = new com.fyber.inneractive.sdk.player.c.k.k(com.fyber.inneractive.sdk.player.c.k.i.a);
    private final com.fyber.inneractive.sdk.player.c.k.k d = new com.fyber.inneractive.sdk.player.c.k.k(4);

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final boolean b_() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final boolean a(com.fyber.inneractive.sdk.player.c.d.g gVar) throws IOException, InterruptedException {
        return h.b(gVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar) {
        this.n = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(long j, long j2) {
        this.f.clear();
        this.j = 0;
        this.l = 0;
        this.m = 0;
        if (j == 0) {
            c();
            return;
        }
        a[] aVarArr = this.o;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                l lVar = aVar.b;
                int a2 = lVar.a(j2);
                if (a2 == -1) {
                    a2 = lVar.b(j2);
                }
                aVar.d = a2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0006 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.c.d.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.c.d.g r24, com.fyber.inneractive.sdk.player.c.d.l r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.d.g.a(com.fyber.inneractive.sdk.player.c.d.g, com.fyber.inneractive.sdk.player.c.d.l):int");
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long b() {
        return this.p;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long a(long j) {
        a[] aVarArr = this.o;
        long j2 = LongCompanionObject.MAX_VALUE;
        for (a aVar : aVarArr) {
            l lVar = aVar.b;
            int a2 = lVar.a(j);
            if (a2 == -1) {
                a2 = lVar.b(j);
            }
            long j3 = lVar.b[a2];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    private void c() {
        this.g = 0;
        this.j = 0;
    }

    private void b(long j) throws com.fyber.inneractive.sdk.player.c.l {
        a.C0055a c0055a;
        com.fyber.inneractive.sdk.player.c.d.j jVar;
        int i;
        i a2;
        long j2;
        a aVar;
        i iVar;
        g gVar = this;
        while (!gVar.f.isEmpty() && gVar.f.peek().aQ == j) {
            a.C0055a pop = gVar.f.pop();
            if (pop.aP != com.fyber.inneractive.sdk.player.c.d.d.a.B) {
                if (!gVar.f.isEmpty()) {
                    gVar.f.peek().a(pop);
                }
            } else {
                long j3 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                com.fyber.inneractive.sdk.player.c.f.a aVar2 = null;
                com.fyber.inneractive.sdk.player.c.d.j jVar2 = new com.fyber.inneractive.sdk.player.c.d.j();
                a.b d = pop.d(com.fyber.inneractive.sdk.player.c.d.d.a.aA);
                if (d != null && (aVar2 = b.a(d, gVar.q)) != null) {
                    jVar2.a(aVar2);
                }
                int i2 = 0;
                while (i2 < pop.aS.size()) {
                    a.C0055a c0055a2 = pop.aS.get(i2);
                    if (c0055a2.aP == com.fyber.inneractive.sdk.player.c.d.d.a.D && (a2 = b.a(c0055a2, pop.d(com.fyber.inneractive.sdk.player.c.d.d.a.C), -9223372036854775807L, (com.fyber.inneractive.sdk.player.c.c.a) null, gVar.q)) != null) {
                        l a3 = b.a(a2, c0055a2.e(com.fyber.inneractive.sdk.player.c.d.d.a.E).e(com.fyber.inneractive.sdk.player.c.d.d.a.F).e(com.fyber.inneractive.sdk.player.c.d.d.a.G), jVar2);
                        if (a3.a != 0) {
                            a aVar3 = new a(a2, a3, gVar.n.a(i2));
                            int i3 = a3.d + 30;
                            com.fyber.inneractive.sdk.player.c.h hVar = a2.f;
                            com.fyber.inneractive.sdk.player.c.h hVar2 = new com.fyber.inneractive.sdk.player.c.h(hVar.a, hVar.e, hVar.f, hVar.c, hVar.b, i3, hVar.j, hVar.k, hVar.l, hVar.m, hVar.n, hVar.p, hVar.o, hVar.q, hVar.r, hVar.s, hVar.t, hVar.u, hVar.v, hVar.x, hVar.y, hVar.z, hVar.w, hVar.h, hVar.i, hVar.d);
                            if (a2.b == 1) {
                                com.fyber.inneractive.sdk.player.c.h hVar3 = jVar2.a() ? new com.fyber.inneractive.sdk.player.c.h(hVar2.a, hVar2.e, hVar2.f, hVar2.c, hVar2.b, hVar2.g, hVar2.j, hVar2.k, hVar2.l, hVar2.m, hVar2.n, hVar2.p, hVar2.o, hVar2.q, hVar2.r, hVar2.s, hVar2.t, jVar2.b, jVar2.c, hVar2.x, hVar2.y, hVar2.z, hVar2.w, hVar2.h, hVar2.i, hVar2.d) : hVar2;
                                if (aVar2 != null) {
                                    jVar = jVar2;
                                    com.fyber.inneractive.sdk.player.c.h hVar4 = hVar3;
                                    c0055a = pop;
                                    aVar = aVar3;
                                    iVar = a2;
                                    i = i2;
                                    j2 = j3;
                                    hVar2 = new com.fyber.inneractive.sdk.player.c.h(hVar3.a, hVar3.e, hVar3.f, hVar3.c, hVar4.b, hVar4.g, hVar4.j, hVar4.k, hVar4.l, hVar4.m, hVar4.n, hVar4.p, hVar4.o, hVar4.q, hVar4.r, hVar4.s, hVar4.t, hVar4.u, hVar4.v, hVar4.x, hVar4.y, hVar4.z, hVar4.w, hVar4.h, hVar4.i, aVar2);
                                } else {
                                    c0055a = pop;
                                    j2 = j3;
                                    jVar = jVar2;
                                    aVar = aVar3;
                                    iVar = a2;
                                    i = i2;
                                    hVar2 = hVar3;
                                }
                            } else {
                                c0055a = pop;
                                j2 = j3;
                                jVar = jVar2;
                                aVar = aVar3;
                                iVar = a2;
                                i = i2;
                            }
                            aVar.c.a(hVar2);
                            long max = Math.max(j2, iVar.e);
                            arrayList.add(aVar);
                            j3 = max;
                            i2 = i + 1;
                            gVar = this;
                            jVar2 = jVar;
                            pop = c0055a;
                        }
                    }
                    c0055a = pop;
                    jVar = jVar2;
                    i = i2;
                    j3 = j3;
                    i2 = i + 1;
                    gVar = this;
                    jVar2 = jVar;
                    pop = c0055a;
                }
                gVar.p = j3;
                gVar.o = (a[]) arrayList.toArray(new a[arrayList.size()]);
                gVar.n.b();
                gVar.n.a(gVar);
                gVar.f.clear();
                gVar.g = 2;
            }
        }
        if (gVar.g != 2) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public final i a;
        public final l b;
        public final n c;
        public int d;

        public a(i iVar, l lVar, n nVar) {
            this.a = iVar;
            this.b = lVar;
            this.c = nVar;
        }
    }
}
