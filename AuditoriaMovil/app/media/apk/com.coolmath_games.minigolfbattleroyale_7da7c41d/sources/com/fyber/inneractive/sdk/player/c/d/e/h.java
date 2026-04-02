package com.fyber.inneractive.sdk.player.c.d.e;

import com.fyber.inneractive.sdk.player.c.d.l;
import com.fyber.inneractive.sdk.player.c.d.m;
import com.fyber.inneractive.sdk.player.c.d.n;
import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class h {
    private d a;
    long b;
    int c;
    private n d;
    private com.fyber.inneractive.sdk.player.c.d.h e;
    private f f;
    private long g;
    private long h;
    private int i;
    private a j;
    private long k;
    private boolean l;
    private boolean m;

    protected abstract long a(com.fyber.inneractive.sdk.player.c.k.k kVar);

    protected abstract boolean a(com.fyber.inneractive.sdk.player.c.k.k kVar, long j, a aVar) throws IOException, InterruptedException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        com.fyber.inneractive.sdk.player.c.h a;
        f b;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar, n nVar) {
        this.e = hVar;
        this.d = nVar;
        this.a = new d();
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z) {
        if (z) {
            this.j = new a();
            this.b = 0L;
            this.c = 0;
        } else {
            this.c = 1;
        }
        this.g = -1L;
        this.h = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j, long j2) {
        d dVar = this.a;
        dVar.a.a();
        dVar.b.a();
        dVar.c = -1;
        dVar.d = false;
        if (j == 0) {
            a(!this.l);
        } else if (this.c != 0) {
            this.g = this.f.a_(j2);
            this.c = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(com.fyber.inneractive.sdk.player.c.d.g gVar) throws IOException, InterruptedException {
        boolean z = true;
        while (z) {
            if (!this.a.a(gVar)) {
                this.c = 3;
                return -1;
            }
            this.k = gVar.c() - this.b;
            z = a(this.a.b, this.b, this.j);
            if (z) {
                this.b = gVar.c();
            }
        }
        this.i = this.j.a.s;
        if (!this.m) {
            this.d.a(this.j.a);
            this.m = true;
        }
        if (this.j.b != null) {
            this.f = this.j.b;
        } else if (gVar.d() == -1) {
            this.f = new b((byte) 0);
        } else {
            e eVar = this.a.a;
            this.f = new com.fyber.inneractive.sdk.player.c.d.e.a(this.b, gVar.d(), this, eVar.h + eVar.i, eVar.c);
        }
        this.j = null;
        this.c = 2;
        d dVar = this.a;
        if (dVar.b.a.length != 65025) {
            dVar.b.a = Arrays.copyOf(dVar.b.a, Math.max(65025, dVar.b.c));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(com.fyber.inneractive.sdk.player.c.d.g gVar, l lVar) throws IOException, InterruptedException {
        long a2 = this.f.a(gVar);
        if (a2 >= 0) {
            lVar.a = a2;
            return 1;
        }
        if (a2 < -1) {
            c(-(a2 + 2));
        }
        if (!this.l) {
            this.e.a(this.f.a());
            this.l = true;
        }
        if (this.k > 0 || this.a.a(gVar)) {
            this.k = 0L;
            com.fyber.inneractive.sdk.player.c.k.k kVar = this.a.b;
            long a3 = a(kVar);
            if (a3 >= 0) {
                long j = this.h;
                if (j + a3 >= this.g) {
                    long a4 = a(j);
                    this.d.a(kVar, kVar.c);
                    this.d.a(a4, 1, kVar.c, 0, null);
                    this.g = -1L;
                }
            }
            this.h += a3;
            return 0;
        }
        this.c = 3;
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long a(long j) {
        return (j * 1000000) / this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long b(long j) {
        return (this.i * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(long j) {
        this.h = j;
    }

    /* loaded from: classes.dex */
    private static final class b implements f {
        @Override // com.fyber.inneractive.sdk.player.c.d.e.f
        public final long a(com.fyber.inneractive.sdk.player.c.d.g gVar) throws IOException, InterruptedException {
            return -1L;
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.e.f
        public final long a_(long j) {
            return 0L;
        }

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.e.f
        public final m a() {
            return new m.a(-9223372036854775807L);
        }
    }
}
