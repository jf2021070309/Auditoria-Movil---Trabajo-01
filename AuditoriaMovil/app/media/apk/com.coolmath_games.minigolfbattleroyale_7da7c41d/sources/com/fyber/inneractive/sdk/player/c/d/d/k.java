package com.fyber.inneractive.sdk.player.c.d.d;
/* loaded from: classes.dex */
final class k {
    public c a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public j o;
    public int p;
    public com.fyber.inneractive.sdk.player.c.k.k q;
    public boolean r;
    public long s;

    public final void a(int i) {
        com.fyber.inneractive.sdk.player.c.k.k kVar = this.q;
        if (kVar == null || kVar.c < i) {
            this.q = new com.fyber.inneractive.sdk.player.c.k.k(i);
        }
        this.p = i;
        this.m = true;
        this.r = true;
    }

    public final long b(int i) {
        return this.k[i] + this.j[i];
    }
}
