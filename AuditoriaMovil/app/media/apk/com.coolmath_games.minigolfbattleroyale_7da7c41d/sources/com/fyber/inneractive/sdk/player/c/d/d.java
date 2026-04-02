package com.fyber.inneractive.sdk.player.c.d;

import com.fyber.inneractive.sdk.player.c.k.t;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes.dex */
public final class d implements n {
    public final int a;
    public long f;
    public com.fyber.inneractive.sdk.player.c.h g;
    public c h;
    private final com.fyber.inneractive.sdk.player.c.j.b i;
    private boolean k;
    private com.fyber.inneractive.sdk.player.c.h l;
    private long m;
    private long n;
    private com.fyber.inneractive.sdk.player.c.j.a o;
    private int p;
    private boolean q;
    public final b b = new b();
    public final LinkedBlockingDeque<com.fyber.inneractive.sdk.player.c.j.a> c = new LinkedBlockingDeque<>();
    public final a d = new a((byte) 0);
    public final com.fyber.inneractive.sdk.player.c.k.k e = new com.fyber.inneractive.sdk.player.c.k.k(32);
    private final AtomicInteger j = new AtomicInteger();

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    public d(com.fyber.inneractive.sdk.player.c.j.b bVar) {
        this.i = bVar;
        this.a = bVar.c();
        this.p = this.a;
    }

    public final void a(boolean z) {
        int andSet = this.j.getAndSet(z ? 0 : 2);
        d();
        b bVar = this.b;
        bVar.e = Long.MIN_VALUE;
        bVar.f = Long.MIN_VALUE;
        if (andSet == 2) {
            this.g = null;
        }
    }

    public final void a() {
        if (this.j.getAndSet(2) == 0) {
            d();
        }
    }

    public final boolean a(long j, boolean z) {
        long a2 = this.b.a(j, z);
        if (a2 == -1) {
            return false;
        }
        a(a2);
        return true;
    }

    public final void a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            a(j);
            int i3 = (int) (j - this.f);
            int min = Math.min(i - i2, this.a - i3);
            com.fyber.inneractive.sdk.player.c.j.a peek = this.c.peek();
            System.arraycopy(peek.a, peek.b + i3, bArr, i2, min);
            j += min;
            i2 += min;
        }
    }

    public final void a(long j) {
        int i = ((int) (j - this.f)) / this.a;
        for (int i2 = 0; i2 < i; i2++) {
            this.i.a(this.c.remove());
            this.f += this.a;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.n
    public final void a(com.fyber.inneractive.sdk.player.c.h hVar) {
        com.fyber.inneractive.sdk.player.c.h a2;
        long j = this.m;
        if (hVar == null) {
            a2 = null;
        } else {
            a2 = (j == 0 || hVar.w == LongCompanionObject.MAX_VALUE) ? hVar : hVar.a(hVar.w + j);
        }
        boolean a3 = this.b.a(a2);
        this.l = hVar;
        this.k = false;
        c cVar = this.h;
        if (cVar == null || !a3) {
            return;
        }
        cVar.a();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.n
    public final int a(g gVar, int i, boolean z) throws IOException, InterruptedException {
        if (!b()) {
            int a2 = gVar.a(i);
            if (a2 == -1) {
                if (z) {
                    return -1;
                }
                throw new EOFException();
            }
            return a2;
        }
        try {
            int a3 = a(i);
            int a4 = gVar.a(this.o.a, this.o.b + this.p, a3);
            if (a4 == -1) {
                if (z) {
                    return -1;
                }
                throw new EOFException();
            }
            this.p += a4;
            this.n += a4;
            return a4;
        } finally {
            c();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.n
    public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar, int i) {
        if (!b()) {
            kVar.d(i);
            return;
        }
        while (i > 0) {
            int a2 = a(i);
            kVar.a(this.o.a, this.o.b + this.p, a2);
            this.p += a2;
            this.n += a2;
            i -= a2;
        }
        c();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.n
    public final void a(long j, int i, int i2, int i3, byte[] bArr) {
        if (this.k) {
            a(this.l);
        }
        if (!b()) {
            this.b.a(j);
            return;
        }
        try {
            if (this.q) {
                if ((i & 1) != 0 && this.b.b(j)) {
                    this.q = false;
                }
                return;
            }
            this.b.a(j + this.m, i, (this.n - i2) - i3, i2, bArr);
        } finally {
            c();
        }
    }

    private boolean b() {
        return this.j.compareAndSet(0, 1);
    }

    private void c() {
        if (this.j.compareAndSet(1, 0)) {
            return;
        }
        d();
    }

    private void d() {
        b bVar = this.b;
        bVar.b = 0;
        bVar.c = 0;
        bVar.d = 0;
        bVar.a = 0;
        bVar.g = true;
        com.fyber.inneractive.sdk.player.c.j.b bVar2 = this.i;
        LinkedBlockingDeque<com.fyber.inneractive.sdk.player.c.j.a> linkedBlockingDeque = this.c;
        bVar2.a((com.fyber.inneractive.sdk.player.c.j.a[]) linkedBlockingDeque.toArray(new com.fyber.inneractive.sdk.player.c.j.a[linkedBlockingDeque.size()]));
        this.c.clear();
        this.i.b();
        this.f = 0L;
        this.n = 0L;
        this.o = null;
        this.p = this.a;
    }

    private int a(int i) {
        if (this.p == this.a) {
            this.p = 0;
            com.fyber.inneractive.sdk.player.c.j.a a2 = this.i.a();
            this.o = a2;
            this.c.add(a2);
        }
        return Math.min(i, this.a - this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        int a;
        int b;
        int c;
        int d;
        private com.fyber.inneractive.sdk.player.c.h q;
        private int r;
        private int h = 1000;
        private int[] i = new int[1000];
        private long[] j = new long[1000];
        private long[] m = new long[1000];
        private int[] l = new int[1000];
        private int[] k = new int[1000];
        private byte[][] n = new byte[1000];
        private com.fyber.inneractive.sdk.player.c.h[] o = new com.fyber.inneractive.sdk.player.c.h[1000];
        long e = Long.MIN_VALUE;
        long f = Long.MIN_VALUE;
        private boolean p = true;
        boolean g = true;

        public final int a() {
            return this.b + this.a;
        }

        public final synchronized boolean b() {
            return this.a == 0;
        }

        public final synchronized com.fyber.inneractive.sdk.player.c.h c() {
            if (this.p) {
                return null;
            }
            return this.q;
        }

        public final synchronized long d() {
            return Math.max(this.e, this.f);
        }

        public final synchronized int a(com.fyber.inneractive.sdk.player.c.i iVar, com.fyber.inneractive.sdk.player.c.b.d dVar, boolean z, boolean z2, com.fyber.inneractive.sdk.player.c.h hVar, a aVar) {
            if (this.a == 0) {
                if (!z2) {
                    if (this.q == null || (!z && this.q == hVar)) {
                        return -3;
                    }
                    iVar.a = this.q;
                    return -5;
                }
                dVar.a = 4;
                return -4;
            }
            if (!z && this.o[this.c] == hVar) {
                if (dVar.c == null && dVar.e == 0) {
                    return -3;
                }
                dVar.d = this.m[this.c];
                dVar.a = this.l[this.c];
                aVar.a = this.k[this.c];
                aVar.b = this.j[this.c];
                aVar.d = this.n[this.c];
                this.e = Math.max(this.e, dVar.d);
                this.a--;
                int i = this.c + 1;
                this.c = i;
                this.b++;
                if (i == this.h) {
                    this.c = 0;
                }
                aVar.c = this.a > 0 ? this.j[this.c] : aVar.b + aVar.a;
                return -4;
            }
            iVar.a = this.o[this.c];
            return -5;
        }

        public final synchronized long e() {
            if (this.a == 0) {
                return -1L;
            }
            int i = ((this.c + this.a) - 1) % this.h;
            this.c = (this.c + this.a) % this.h;
            this.b += this.a;
            this.a = 0;
            return this.j[i] + this.k[i];
        }

        public final synchronized long a(long j, boolean z) {
            if (this.a != 0 && j >= this.m[this.c]) {
                if (j <= this.f || z) {
                    int i = 0;
                    int i2 = this.c;
                    int i3 = -1;
                    while (i2 != this.d && this.m[i2] <= j) {
                        if ((this.l[i2] & 1) != 0) {
                            i3 = i;
                        }
                        i2 = (i2 + 1) % this.h;
                        i++;
                    }
                    if (i3 == -1) {
                        return -1L;
                    }
                    int i4 = (this.c + i3) % this.h;
                    this.c = i4;
                    this.b += i3;
                    this.a -= i3;
                    return this.j[i4];
                }
                return -1L;
            }
            return -1L;
        }

        public final synchronized boolean a(com.fyber.inneractive.sdk.player.c.h hVar) {
            if (hVar == null) {
                this.p = true;
                return false;
            }
            this.p = false;
            if (t.a(hVar, this.q)) {
                return false;
            }
            this.q = hVar;
            return true;
        }

        public final synchronized void a(long j, int i, long j2, int i2, byte[] bArr) {
            if (this.g) {
                if ((i & 1) == 0) {
                    return;
                }
                this.g = false;
            }
            com.fyber.inneractive.sdk.player.c.k.a.b(!this.p);
            a(j);
            this.m[this.d] = j;
            this.j[this.d] = j2;
            this.k[this.d] = i2;
            this.l[this.d] = i;
            this.n[this.d] = bArr;
            this.o[this.d] = this.q;
            this.i[this.d] = this.r;
            int i3 = this.a + 1;
            this.a = i3;
            if (i3 == this.h) {
                int i4 = this.h + 1000;
                int[] iArr = new int[i4];
                long[] jArr = new long[i4];
                long[] jArr2 = new long[i4];
                int[] iArr2 = new int[i4];
                int[] iArr3 = new int[i4];
                byte[][] bArr2 = new byte[i4];
                com.fyber.inneractive.sdk.player.c.h[] hVarArr = new com.fyber.inneractive.sdk.player.c.h[i4];
                int i5 = this.h - this.c;
                System.arraycopy(this.j, this.c, jArr, 0, i5);
                System.arraycopy(this.m, this.c, jArr2, 0, i5);
                System.arraycopy(this.l, this.c, iArr2, 0, i5);
                System.arraycopy(this.k, this.c, iArr3, 0, i5);
                System.arraycopy(this.n, this.c, bArr2, 0, i5);
                System.arraycopy(this.o, this.c, hVarArr, 0, i5);
                System.arraycopy(this.i, this.c, iArr, 0, i5);
                int i6 = this.c;
                System.arraycopy(this.j, 0, jArr, i5, i6);
                System.arraycopy(this.m, 0, jArr2, i5, i6);
                System.arraycopy(this.l, 0, iArr2, i5, i6);
                System.arraycopy(this.k, 0, iArr3, i5, i6);
                System.arraycopy(this.n, 0, bArr2, i5, i6);
                System.arraycopy(this.o, 0, hVarArr, i5, i6);
                System.arraycopy(this.i, 0, iArr, i5, i6);
                this.j = jArr;
                this.m = jArr2;
                this.l = iArr2;
                this.k = iArr3;
                this.n = bArr2;
                this.o = hVarArr;
                this.i = iArr;
                this.c = 0;
                this.d = this.h;
                this.a = this.h;
                this.h = i4;
                return;
            }
            int i7 = this.d + 1;
            this.d = i7;
            if (i7 == this.h) {
                this.d = 0;
            }
        }

        public final synchronized void a(long j) {
            this.f = Math.max(this.f, j);
        }

        public final synchronized boolean b(long j) {
            boolean z = false;
            if (this.e >= j) {
                return false;
            }
            int i = this.a;
            while (i > 0 && this.m[((this.c + i) - 1) % this.h] >= j) {
                i--;
            }
            int a = a() - (this.b + i);
            if (a >= 0 && a <= this.a) {
                z = true;
            }
            com.fyber.inneractive.sdk.player.c.k.a.a(z);
            if (a == 0) {
                int i2 = this.b;
            } else {
                int i3 = this.a - a;
                this.a = i3;
                this.d = ((this.d + this.h) - a) % this.h;
                this.f = Long.MIN_VALUE;
                for (int i4 = i3 - 1; i4 >= 0; i4--) {
                    int i5 = (this.c + i4) % this.h;
                    this.f = Math.max(this.f, this.m[i5]);
                    if ((this.l[i5] & 1) != 0) {
                        break;
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public long b;
        public long c;
        public byte[] d;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }
}
