package com.fyber.inneractive.sdk.player.c.j.a;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.c.j.a.a;
import com.fyber.inneractive.sdk.player.c.j.t;
import java.io.IOException;
import java.io.InterruptedIOException;
/* loaded from: classes.dex */
public final class d implements com.fyber.inneractive.sdk.player.c.j.g {
    private final com.fyber.inneractive.sdk.player.c.j.a.a a;
    private final com.fyber.inneractive.sdk.player.c.j.g b;
    private final com.fyber.inneractive.sdk.player.c.j.g c;
    private final com.fyber.inneractive.sdk.player.c.j.g d;
    private final a e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private com.fyber.inneractive.sdk.player.c.j.g i;
    private boolean j;
    private Uri k;
    private int l;
    private String m;
    private long n;
    private long o;
    private g p;
    private boolean q;
    private boolean r;
    private long s;

    /* loaded from: classes.dex */
    public interface a {
    }

    public d(com.fyber.inneractive.sdk.player.c.j.a.a aVar, com.fyber.inneractive.sdk.player.c.j.g gVar, com.fyber.inneractive.sdk.player.c.j.g gVar2, com.fyber.inneractive.sdk.player.c.j.f fVar, int i, a aVar2) {
        this.a = aVar;
        this.b = gVar2;
        this.f = (i & 1) != 0;
        this.g = (i & 2) != 0;
        this.h = (i & 4) != 0;
        this.d = gVar;
        if (fVar != null) {
            this.c = new t(gVar, fVar);
        } else {
            this.c = null;
        }
        this.e = aVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final long a(com.fyber.inneractive.sdk.player.c.j.i iVar) throws IOException {
        try {
            this.k = iVar.a;
            this.l = iVar.g;
            this.m = iVar.f != null ? iVar.f : iVar.a.toString();
            this.n = iVar.d;
            this.r = (this.g && this.q) || (iVar.e == -1 && this.h);
            if (iVar.e == -1 && !this.r) {
                long a2 = this.a.a(this.m);
                this.o = a2;
                if (a2 != -1) {
                    long j = a2 - iVar.d;
                    this.o = j;
                    if (j <= 0) {
                        throw new com.fyber.inneractive.sdk.player.c.j.h();
                    }
                }
                a(true);
                return this.o;
            }
            this.o = iVar.e;
            a(true);
            return this.o;
        } catch (IOException e) {
            a(e);
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        try {
            int a2 = this.i.a(bArr, i, i2);
            if (a2 >= 0) {
                if (this.i == this.b) {
                    this.s += a2;
                }
                long j = a2;
                this.n += j;
                if (this.o != -1) {
                    this.o -= j;
                }
            } else {
                if (this.j) {
                    a(this.n);
                    this.o = 0L;
                }
                c();
                if ((this.o > 0 || this.o == -1) && a(false)) {
                    return a(bArr, i, i2);
                }
            }
            return a2;
        } catch (IOException e) {
            a(e);
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final Uri a() {
        com.fyber.inneractive.sdk.player.c.j.g gVar = this.i;
        return gVar == this.d ? gVar.a() : this.k;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final void b() throws IOException {
        this.k = null;
        if (this.e != null && this.s > 0) {
            this.a.a();
            this.s = 0L;
        }
        try {
            c();
        } catch (IOException e) {
            a(e);
            throw e;
        }
    }

    private boolean a(boolean z) throws IOException {
        g a2;
        long j;
        com.fyber.inneractive.sdk.player.c.j.i iVar;
        IOException iOException = null;
        if (this.r) {
            a2 = null;
        } else if (this.f) {
            try {
                a2 = this.a.a(this.m, this.n);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            a2 = this.a.b(this.m, this.n);
        }
        boolean z2 = true;
        if (a2 == null) {
            this.i = this.d;
            iVar = new com.fyber.inneractive.sdk.player.c.j.i(this.k, this.n, this.o, this.m, this.l);
        } else if (a2.d) {
            Uri fromFile = Uri.fromFile(a2.e);
            long j2 = this.n - a2.b;
            long j3 = a2.c - j2;
            long j4 = this.o;
            if (j4 != -1) {
                j3 = Math.min(j3, j4);
            }
            com.fyber.inneractive.sdk.player.c.j.i iVar2 = new com.fyber.inneractive.sdk.player.c.j.i(fromFile, this.n, j2, j3, this.m, this.l);
            this.i = this.b;
            iVar = iVar2;
        } else {
            if (a2.c == -1) {
                j = this.o;
            } else {
                j = a2.c;
                long j5 = this.o;
                if (j5 != -1) {
                    j = Math.min(j, j5);
                }
            }
            iVar = new com.fyber.inneractive.sdk.player.c.j.i(this.k, this.n, j, this.m, this.l);
            com.fyber.inneractive.sdk.player.c.j.g gVar = this.c;
            if (gVar != null) {
                this.i = gVar;
                this.p = a2;
            } else {
                this.i = this.d;
                this.a.a(a2);
            }
        }
        this.j = iVar.e == -1;
        long j6 = 0;
        try {
            j6 = this.i.a(iVar);
        } catch (IOException e) {
            if (!z && this.j) {
                for (Throwable th = e; th != null; th = th.getCause()) {
                    if ((th instanceof com.fyber.inneractive.sdk.player.c.j.h) && ((com.fyber.inneractive.sdk.player.c.j.h) th).a == 0) {
                        break;
                    }
                }
            }
            iOException = e;
            if (iOException != null) {
                throw iOException;
            }
            z2 = false;
        }
        if (this.j && j6 != -1) {
            this.o = j6;
            a(iVar.d + this.o);
        }
        return z2;
    }

    private void a(long j) throws IOException {
        if (this.i == this.c) {
            this.a.c(this.m, j);
        }
    }

    private void c() throws IOException {
        com.fyber.inneractive.sdk.player.c.j.g gVar = this.i;
        if (gVar == null) {
            return;
        }
        try {
            gVar.b();
            this.i = null;
            this.j = false;
        } finally {
            g gVar2 = this.p;
            if (gVar2 != null) {
                this.a.a(gVar2);
                this.p = null;
            }
        }
    }

    private void a(IOException iOException) {
        if (this.i == this.b || (iOException instanceof a.C0064a)) {
            this.q = true;
        }
    }
}
