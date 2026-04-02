package com.fyber.inneractive.sdk.player.c;

import com.fyber.inneractive.sdk.player.c.k.t;
/* loaded from: classes.dex */
public final class c implements k {
    private final com.fyber.inneractive.sdk.player.c.j.j a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final com.fyber.inneractive.sdk.player.c.k.n f;
    private int g;
    private boolean h;

    public c() {
        this(new com.fyber.inneractive.sdk.player.c.j.j());
    }

    private c(com.fyber.inneractive.sdk.player.c.j.j jVar) {
        this(jVar, (byte) 0);
    }

    private c(com.fyber.inneractive.sdk.player.c.j.j jVar, byte b) {
        this(jVar, (char) 0);
    }

    private c(com.fyber.inneractive.sdk.player.c.j.j jVar, char c) {
        this.a = jVar;
        this.b = 15000000L;
        this.c = 30000000L;
        this.d = 2500000L;
        this.e = 5000000L;
        this.f = null;
    }

    @Override // com.fyber.inneractive.sdk.player.c.k
    public final void a() {
        a(false);
    }

    @Override // com.fyber.inneractive.sdk.player.c.k
    public final void a(n[] nVarArr, com.fyber.inneractive.sdk.player.c.i.f fVar) {
        this.g = 0;
        for (int i = 0; i < nVarArr.length; i++) {
            if (fVar.b[i] != null) {
                this.g += t.b(nVarArr[i].a());
            }
        }
        this.a.a(this.g);
    }

    @Override // com.fyber.inneractive.sdk.player.c.k
    public final void b() {
        a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.c.k
    public final void c() {
        a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.c.k
    public final com.fyber.inneractive.sdk.player.c.j.b d() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.player.c.k
    public final boolean a(long j, boolean z) {
        long j2 = z ? this.e : this.d;
        return j2 <= 0 || j >= j2;
    }

    private void a(boolean z) {
        this.g = 0;
        com.fyber.inneractive.sdk.player.c.k.n nVar = this.f;
        if (nVar != null && this.h) {
            nVar.a();
        }
        this.h = false;
        if (z) {
            this.a.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.k
    public final boolean a(long j) {
        boolean z = true;
        boolean z2 = j > this.c ? false : j < this.b ? true : true;
        boolean z3 = this.a.e() >= this.g;
        boolean z4 = this.h;
        if (!z2 && (!z2 || !z4 || z3)) {
            z = false;
        }
        this.h = z;
        com.fyber.inneractive.sdk.player.c.k.n nVar = this.f;
        if (nVar != null && z != z4) {
            if (!z) {
                nVar.a();
            } else {
                synchronized (nVar.a) {
                    nVar.b.add(0);
                    nVar.c = Math.max(nVar.c, 0);
                }
            }
        }
        return this.h;
    }
}
