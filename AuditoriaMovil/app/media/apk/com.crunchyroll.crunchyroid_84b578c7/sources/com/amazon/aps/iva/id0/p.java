package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.i;
import com.amazon.aps.iva.od0.p;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public final class p extends h.d<p> {
    public static final p u;
    public static final a v = new a();
    public final com.amazon.aps.iva.od0.c c;
    public int d;
    public List<b> e;
    public boolean f;
    public int g;
    public p h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public p n;
    public int o;
    public p p;
    public int q;
    public int r;
    public byte s;
    public int t;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<p> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new p(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class c extends h.c<p, c> {
        public int e;
        public List<b> f = Collections.emptyList();
        public boolean g;
        public int h;
        public p i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public p o;
        public int p;
        public p q;
        public int r;
        public int s;

        public c() {
            p pVar = p.u;
            this.i = pVar;
            this.o = pVar;
            this.q = pVar;
        }

        @Override // com.amazon.aps.iva.od0.a.AbstractC0569a, com.amazon.aps.iva.od0.p.a
        public final /* bridge */ /* synthetic */ p.a D(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws IOException {
            h(dVar, fVar);
            return this;
        }

        @Override // com.amazon.aps.iva.od0.a.AbstractC0569a
        public final /* bridge */ /* synthetic */ a.AbstractC0569a b(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws IOException {
            h(dVar, fVar);
            return this;
        }

        @Override // com.amazon.aps.iva.od0.p.a
        public final com.amazon.aps.iva.od0.p build() {
            p f = f();
            if (f.isInitialized()) {
                return f;
            }
            throw new com.amazon.aps.iva.od0.v();
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final h.b c() {
            c cVar = new c();
            cVar.g(f());
            return cVar;
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final Object clone() throws CloneNotSupportedException {
            c cVar = new c();
            cVar.g(f());
            return cVar;
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final /* bridge */ /* synthetic */ h.b d(com.amazon.aps.iva.od0.h hVar) {
            g((p) hVar);
            return this;
        }

        public final p f() {
            p pVar = new p(this);
            int i = this.e;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f = Collections.unmodifiableList(this.f);
                this.e &= -2;
            }
            pVar.e = this.f;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            pVar.f = this.g;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            pVar.g = this.h;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            pVar.h = this.i;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            pVar.i = this.j;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            pVar.j = this.k;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            pVar.k = this.l;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            pVar.l = this.m;
            if ((i & 256) == 256) {
                i2 |= 128;
            }
            pVar.m = this.n;
            if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                i2 |= 256;
            }
            pVar.n = this.o;
            if ((i & 1024) == 1024) {
                i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            pVar.o = this.p;
            if ((i & 2048) == 2048) {
                i2 |= 1024;
            }
            pVar.p = this.q;
            if ((i & 4096) == 4096) {
                i2 |= 2048;
            }
            pVar.q = this.r;
            if ((i & 8192) == 8192) {
                i2 |= 4096;
            }
            pVar.r = this.s;
            pVar.d = i2;
            return pVar;
        }

        public final c g(p pVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            p pVar2;
            p pVar3;
            p pVar4;
            p pVar5 = p.u;
            if (pVar == pVar5) {
                return this;
            }
            boolean z12 = true;
            if (!pVar.e.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = pVar.e;
                    this.e &= -2;
                } else {
                    if ((this.e & 1) != 1) {
                        this.f = new ArrayList(this.f);
                        this.e |= 1;
                    }
                    this.f.addAll(pVar.e);
                }
            }
            int i = pVar.d;
            if ((i & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                boolean z13 = pVar.f;
                this.e |= 2;
                this.g = z13;
            }
            if ((i & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i2 = pVar.g;
                this.e |= 4;
                this.h = i2;
            }
            if ((i & 4) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                p pVar6 = pVar.h;
                if ((this.e & 8) == 8 && (pVar4 = this.i) != pVar5) {
                    c n = p.n(pVar4);
                    n.g(pVar6);
                    this.i = n.f();
                } else {
                    this.i = pVar6;
                }
                this.e |= 8;
            }
            if ((pVar.d & 8) == 8) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                int i3 = pVar.i;
                this.e |= 16;
                this.j = i3;
            }
            if (pVar.l()) {
                int i4 = pVar.j;
                this.e |= 32;
                this.k = i4;
            }
            int i5 = pVar.d;
            if ((i5 & 32) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                int i6 = pVar.k;
                this.e |= 64;
                this.l = i6;
            }
            if ((i5 & 64) == 64) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                int i7 = pVar.l;
                this.e |= 128;
                this.m = i7;
            }
            if ((i5 & 128) == 128) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                int i8 = pVar.m;
                this.e |= 256;
                this.n = i8;
            }
            if ((i5 & 256) == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                p pVar7 = pVar.n;
                if ((this.e & AdRequest.MAX_CONTENT_URL_LENGTH) == 512 && (pVar3 = this.o) != pVar5) {
                    c n2 = p.n(pVar3);
                    n2.g(pVar7);
                    this.o = n2.f();
                } else {
                    this.o = pVar7;
                }
                this.e |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            int i9 = pVar.d;
            if ((i9 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                int i10 = pVar.o;
                this.e |= 1024;
                this.p = i10;
            }
            if ((i9 & 1024) == 1024) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                p pVar8 = pVar.p;
                if ((this.e & 2048) == 2048 && (pVar2 = this.q) != pVar5) {
                    c n3 = p.n(pVar2);
                    n3.g(pVar8);
                    this.q = n3.f();
                } else {
                    this.q = pVar8;
                }
                this.e |= 2048;
            }
            int i11 = pVar.d;
            if ((i11 & 2048) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i12 = pVar.q;
                this.e |= 4096;
                this.r = i12;
            }
            if ((i11 & 4096) != 4096) {
                z12 = false;
            }
            if (z12) {
                int i13 = pVar.r;
                this.e |= 8192;
                this.s = i13;
            }
            e(pVar);
            this.b = this.b.d(pVar.c);
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.p$a r0 = com.amazon.aps.iva.id0.p.v     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.p r0 = new com.amazon.aps.iva.id0.p     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.<init>(r2, r3)     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r1.g(r0)
                return
            Le:
                r2 = move-exception
                goto L12
            L10:
                r2 = move-exception
                goto L19
            L12:
                com.amazon.aps.iva.od0.p r3 = r2.b     // Catch: java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.p r3 = (com.amazon.aps.iva.id0.p) r3     // Catch: java.lang.Throwable -> L10
                throw r2     // Catch: java.lang.Throwable -> L17
            L17:
                r2 = move-exception
                goto L1a
            L19:
                r3 = 0
            L1a:
                if (r3 == 0) goto L1f
                r1.g(r3)
            L1f:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.p.c.h(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        p pVar = new p(0);
        u = pVar;
        pVar.m();
    }

    public p() {
        throw null;
    }

    public p(h.c cVar) {
        super(cVar);
        this.s = (byte) -1;
        this.t = -1;
        this.c = cVar.b;
    }

    public static c n(p pVar) {
        c cVar = new c();
        cVar.g(pVar);
        return cVar;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        h.d.a aVar = new h.d.a(this);
        if ((this.d & 4096) == 4096) {
            eVar.m(1, this.r);
        }
        for (int i = 0; i < this.e.size(); i++) {
            eVar.o(2, this.e.get(i));
        }
        if ((this.d & 1) == 1) {
            boolean z = this.f;
            eVar.x(3, 0);
            eVar.q(z ? 1 : 0);
        }
        if ((this.d & 2) == 2) {
            eVar.m(4, this.g);
        }
        if ((this.d & 4) == 4) {
            eVar.o(5, this.h);
        }
        if ((this.d & 16) == 16) {
            eVar.m(6, this.j);
        }
        if ((this.d & 32) == 32) {
            eVar.m(7, this.k);
        }
        if ((this.d & 8) == 8) {
            eVar.m(8, this.i);
        }
        if ((this.d & 64) == 64) {
            eVar.m(9, this.l);
        }
        if ((this.d & 256) == 256) {
            eVar.o(10, this.n);
        }
        if ((this.d & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            eVar.m(11, this.o);
        }
        if ((this.d & 128) == 128) {
            eVar.m(12, this.m);
        }
        if ((this.d & 1024) == 1024) {
            eVar.o(13, this.p);
        }
        if ((this.d & 2048) == 2048) {
            eVar.m(14, this.q);
        }
        aVar.a(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, eVar);
        eVar.r(this.c);
    }

    @Override // com.amazon.aps.iva.od0.q
    public final com.amazon.aps.iva.od0.p getDefaultInstanceForType() {
        return u;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i;
        int i2 = this.t;
        if (i2 != -1) {
            return i2;
        }
        if ((this.d & 4096) == 4096) {
            i = com.amazon.aps.iva.od0.e.b(1, this.r) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            i += com.amazon.aps.iva.od0.e.d(2, this.e.get(i3));
        }
        if ((this.d & 1) == 1) {
            i += com.amazon.aps.iva.od0.e.h(3) + 1;
        }
        if ((this.d & 2) == 2) {
            i += com.amazon.aps.iva.od0.e.b(4, this.g);
        }
        if ((this.d & 4) == 4) {
            i += com.amazon.aps.iva.od0.e.d(5, this.h);
        }
        if ((this.d & 16) == 16) {
            i += com.amazon.aps.iva.od0.e.b(6, this.j);
        }
        if ((this.d & 32) == 32) {
            i += com.amazon.aps.iva.od0.e.b(7, this.k);
        }
        if ((this.d & 8) == 8) {
            i += com.amazon.aps.iva.od0.e.b(8, this.i);
        }
        if ((this.d & 64) == 64) {
            i += com.amazon.aps.iva.od0.e.b(9, this.l);
        }
        if ((this.d & 256) == 256) {
            i += com.amazon.aps.iva.od0.e.d(10, this.n);
        }
        if ((this.d & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            i += com.amazon.aps.iva.od0.e.b(11, this.o);
        }
        if ((this.d & 128) == 128) {
            i += com.amazon.aps.iva.od0.e.b(12, this.m);
        }
        if ((this.d & 1024) == 1024) {
            i += com.amazon.aps.iva.od0.e.d(13, this.p);
        }
        if ((this.d & 2048) == 2048) {
            i += com.amazon.aps.iva.od0.e.b(14, this.q);
        }
        int size = this.c.size() + e() + i;
        this.t = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        boolean z;
        boolean z2;
        boolean z3;
        byte b2 = this.s;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < this.e.size(); i++) {
            if (!this.e.get(i).isInitialized()) {
                this.s = (byte) 0;
                return false;
            }
        }
        if ((this.d & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.h.isInitialized()) {
            this.s = (byte) 0;
            return false;
        }
        if ((this.d & 256) == 256) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !this.n.isInitialized()) {
            this.s = (byte) 0;
            return false;
        }
        if ((this.d & 1024) == 1024) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && !this.p.isInitialized()) {
            this.s = (byte) 0;
            return false;
        } else if (!d()) {
            this.s = (byte) 0;
            return false;
        } else {
            this.s = (byte) 1;
            return true;
        }
    }

    public final boolean l() {
        if ((this.d & 16) == 16) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.e = Collections.emptyList();
        this.f = false;
        this.g = 0;
        p pVar = u;
        this.h = pVar;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = pVar;
        this.o = 0;
        this.p = pVar;
        this.q = 0;
        this.r = 0;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final p.a newBuilderForType() {
        return new c();
    }

    public final c o() {
        return n(this);
    }

    @Override // com.amazon.aps.iva.od0.p
    public final p.a toBuilder() {
        return n(this);
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.od0.h implements com.amazon.aps.iva.od0.q {
        public static final b i;
        public static final a j = new a();
        public final com.amazon.aps.iva.od0.c b;
        public int c;
        public c d;
        public p e;
        public int f;
        public byte g;
        public int h;

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes4.dex */
        public static class a extends com.amazon.aps.iva.od0.b<b> {
            @Override // com.amazon.aps.iva.od0.r
            public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
                return new b(dVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: com.amazon.aps.iva.id0.p$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0375b extends h.b<b, C0375b> implements com.amazon.aps.iva.od0.q {
            public int c;
            public c d = c.INV;
            public p e = p.u;
            public int f;

            @Override // com.amazon.aps.iva.od0.a.AbstractC0569a, com.amazon.aps.iva.od0.p.a
            public final /* bridge */ /* synthetic */ p.a D(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws IOException {
                g(dVar, fVar);
                return this;
            }

            @Override // com.amazon.aps.iva.od0.a.AbstractC0569a
            public final /* bridge */ /* synthetic */ a.AbstractC0569a b(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws IOException {
                g(dVar, fVar);
                return this;
            }

            @Override // com.amazon.aps.iva.od0.p.a
            public final com.amazon.aps.iva.od0.p build() {
                b e = e();
                if (e.isInitialized()) {
                    return e;
                }
                throw new com.amazon.aps.iva.od0.v();
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final C0375b c() {
                C0375b c0375b = new C0375b();
                c0375b.f(e());
                return c0375b;
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final Object clone() throws CloneNotSupportedException {
                C0375b c0375b = new C0375b();
                c0375b.f(e());
                return c0375b;
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final /* bridge */ /* synthetic */ C0375b d(b bVar) {
                f(bVar);
                return this;
            }

            public final b e() {
                b bVar = new b(this);
                int i = this.c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                bVar.d = this.d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.e = this.e;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                bVar.f = this.f;
                bVar.c = i2;
                return bVar;
            }

            public final void f(b bVar) {
                boolean z;
                boolean z2;
                p pVar;
                if (bVar == b.i) {
                    return;
                }
                boolean z3 = true;
                if ((bVar.c & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c cVar = bVar.d;
                    cVar.getClass();
                    this.c |= 1;
                    this.d = cVar;
                }
                if ((bVar.c & 2) == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    p pVar2 = bVar.e;
                    if ((this.c & 2) == 2 && (pVar = this.e) != p.u) {
                        c n = p.n(pVar);
                        n.g(pVar2);
                        this.e = n.f();
                    } else {
                        this.e = pVar2;
                    }
                    this.c |= 2;
                }
                if ((bVar.c & 4) != 4) {
                    z3 = false;
                }
                if (z3) {
                    int i = bVar.f;
                    this.c |= 4;
                    this.f = i;
                }
                this.b = this.b.d(bVar.b);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void g(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
                /*
                    r1 = this;
                    com.amazon.aps.iva.id0.p$b$a r0 = com.amazon.aps.iva.id0.p.b.j     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    com.amazon.aps.iva.id0.p$b r0 = new com.amazon.aps.iva.id0.p$b     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    r0.<init>(r2, r3)     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    r1.f(r0)
                    return
                Le:
                    r2 = move-exception
                    goto L12
                L10:
                    r2 = move-exception
                    goto L19
                L12:
                    com.amazon.aps.iva.od0.p r3 = r2.b     // Catch: java.lang.Throwable -> L10
                    com.amazon.aps.iva.id0.p$b r3 = (com.amazon.aps.iva.id0.p.b) r3     // Catch: java.lang.Throwable -> L10
                    throw r2     // Catch: java.lang.Throwable -> L17
                L17:
                    r2 = move-exception
                    goto L1a
                L19:
                    r3 = 0
                L1a:
                    if (r3 == 0) goto L1f
                    r1.f(r3)
                L1f:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.p.b.C0375b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
            }
        }

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes4.dex */
        public enum c implements i.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            
            private static i.b<c> internalValueMap = new a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* loaded from: classes4.dex */
            public static class a implements i.b<c> {
                @Override // com.amazon.aps.iva.od0.i.b
                public final c findValueByNumber(int i) {
                    return c.valueOf(i);
                }
            }

            c(int i, int i2) {
                this.value = i2;
            }

            @Override // com.amazon.aps.iva.od0.i.a
            public final int getNumber() {
                return this.value;
            }

            public static c valueOf(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return STAR;
                        }
                        return INV;
                    }
                    return OUT;
                }
                return IN;
            }
        }

        static {
            b bVar = new b();
            i = bVar;
            bVar.d = c.INV;
            bVar.e = p.u;
            bVar.f = 0;
        }

        public b(h.b bVar) {
            super(0);
            this.g = (byte) -1;
            this.h = -1;
            this.b = bVar.b;
        }

        @Override // com.amazon.aps.iva.od0.p
        public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
            getSerializedSize();
            if ((this.c & 1) == 1) {
                eVar.l(1, this.d.getNumber());
            }
            if ((this.c & 2) == 2) {
                eVar.o(2, this.e);
            }
            if ((this.c & 4) == 4) {
                eVar.m(3, this.f);
            }
            eVar.r(this.b);
        }

        @Override // com.amazon.aps.iva.od0.p
        public final int getSerializedSize() {
            int i2 = this.h;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.c & 1) == 1) {
                i3 = 0 + com.amazon.aps.iva.od0.e.a(1, this.d.getNumber());
            }
            if ((this.c & 2) == 2) {
                i3 += com.amazon.aps.iva.od0.e.d(2, this.e);
            }
            if ((this.c & 4) == 4) {
                i3 += com.amazon.aps.iva.od0.e.b(3, this.f);
            }
            int size = this.b.size() + i3;
            this.h = size;
            return size;
        }

        @Override // com.amazon.aps.iva.od0.q
        public final boolean isInitialized() {
            boolean z;
            byte b = this.g;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if ((this.c & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z && !this.e.isInitialized()) {
                this.g = (byte) 0;
                return false;
            }
            this.g = (byte) 1;
            return true;
        }

        @Override // com.amazon.aps.iva.od0.p
        public final p.a newBuilderForType() {
            return new C0375b();
        }

        @Override // com.amazon.aps.iva.od0.p
        public final p.a toBuilder() {
            C0375b c0375b = new C0375b();
            c0375b.f(this);
            return c0375b;
        }

        public b() {
            this.g = (byte) -1;
            this.h = -1;
            this.b = com.amazon.aps.iva.od0.c.b;
        }

        public b(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            c cVar;
            this.g = (byte) -1;
            this.h = -1;
            this.d = c.INV;
            this.e = p.u;
            boolean z = false;
            this.f = 0;
            c.b bVar = new c.b();
            com.amazon.aps.iva.od0.e j2 = com.amazon.aps.iva.od0.e.j(bVar, 1);
            while (!z) {
                try {
                    try {
                        int n = dVar.n();
                        if (n != 0) {
                            if (n == 8) {
                                int k = dVar.k();
                                c valueOf = c.valueOf(k);
                                if (valueOf == null) {
                                    j2.v(n);
                                    j2.v(k);
                                } else {
                                    this.c |= 1;
                                    this.d = valueOf;
                                }
                            } else if (n == 18) {
                                if ((this.c & 2) == 2) {
                                    p pVar = this.e;
                                    pVar.getClass();
                                    cVar = p.n(pVar);
                                } else {
                                    cVar = null;
                                }
                                p pVar2 = (p) dVar.g(p.v, fVar);
                                this.e = pVar2;
                                if (cVar != null) {
                                    cVar.g(pVar2);
                                    this.e = cVar.f();
                                }
                                this.c |= 2;
                            } else if (n != 24) {
                                if (!dVar.q(n, j2)) {
                                }
                            } else {
                                this.c |= 4;
                                this.f = dVar.k();
                            }
                        }
                        z = true;
                    } catch (com.amazon.aps.iva.od0.j e) {
                        e.b = this;
                        throw e;
                    } catch (IOException e2) {
                        com.amazon.aps.iva.od0.j jVar = new com.amazon.aps.iva.od0.j(e2.getMessage());
                        jVar.b = this;
                        throw jVar;
                    }
                } catch (Throwable th) {
                    try {
                        j2.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.b = bVar.f();
                        throw th2;
                    }
                    this.b = bVar.f();
                    throw th;
                }
            }
            try {
                j2.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.b = bVar.f();
                throw th3;
            }
            this.b = bVar.f();
        }
    }

    public p(int i) {
        this.s = (byte) -1;
        this.t = -1;
        this.c = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        this.s = (byte) -1;
        this.t = -1;
        m();
        c.b bVar = new c.b();
        com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int n = dVar.n();
                    a aVar = v;
                    c cVar = null;
                    switch (n) {
                        case 0:
                            break;
                        case 8:
                            this.d |= 4096;
                            this.r = dVar.k();
                            continue;
                        case 18:
                            if (!(z2 & true)) {
                                this.e = new ArrayList();
                                z2 |= true;
                            }
                            this.e.add(dVar.g(b.j, fVar));
                            continue;
                        case 24:
                            this.d |= 1;
                            this.f = dVar.l() != 0;
                            continue;
                        case 32:
                            this.d |= 2;
                            this.g = dVar.k();
                            continue;
                        case 42:
                            if ((this.d & 4) == 4) {
                                p pVar = this.h;
                                pVar.getClass();
                                cVar = n(pVar);
                            }
                            p pVar2 = (p) dVar.g(aVar, fVar);
                            this.h = pVar2;
                            if (cVar != null) {
                                cVar.g(pVar2);
                                this.h = cVar.f();
                            }
                            this.d |= 4;
                            continue;
                        case 48:
                            this.d |= 16;
                            this.j = dVar.k();
                            continue;
                        case 56:
                            this.d |= 32;
                            this.k = dVar.k();
                            continue;
                        case 64:
                            this.d |= 8;
                            this.i = dVar.k();
                            continue;
                        case 72:
                            this.d |= 64;
                            this.l = dVar.k();
                            continue;
                        case 82:
                            if ((this.d & 256) == 256) {
                                p pVar3 = this.n;
                                pVar3.getClass();
                                cVar = n(pVar3);
                            }
                            p pVar4 = (p) dVar.g(aVar, fVar);
                            this.n = pVar4;
                            if (cVar != null) {
                                cVar.g(pVar4);
                                this.n = cVar.f();
                            }
                            this.d |= 256;
                            continue;
                        case 88:
                            this.d |= AdRequest.MAX_CONTENT_URL_LENGTH;
                            this.o = dVar.k();
                            continue;
                        case 96:
                            this.d |= 128;
                            this.m = dVar.k();
                            continue;
                        case 106:
                            if ((this.d & 1024) == 1024) {
                                p pVar5 = this.p;
                                pVar5.getClass();
                                cVar = n(pVar5);
                            }
                            p pVar6 = (p) dVar.g(aVar, fVar);
                            this.p = pVar6;
                            if (cVar != null) {
                                cVar.g(pVar6);
                                this.p = cVar.f();
                            }
                            this.d |= 1024;
                            continue;
                        case 112:
                            this.d |= 2048;
                            this.q = dVar.k();
                            continue;
                        default:
                            if (!j(dVar, j, fVar, n)) {
                                break;
                            } else {
                                continue;
                            }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    try {
                        j.i();
                    } catch (IOException unused) {
                        this.c = bVar.f();
                        h();
                        throw th;
                    } catch (Throwable th2) {
                        this.c = bVar.f();
                        throw th2;
                    }
                }
            } catch (com.amazon.aps.iva.od0.j e) {
                e.b = this;
                throw e;
            } catch (IOException e2) {
                com.amazon.aps.iva.od0.j jVar = new com.amazon.aps.iva.od0.j(e2.getMessage());
                jVar.b = this;
                throw jVar;
            }
        }
        if (z2 & true) {
            this.e = Collections.unmodifiableList(this.e);
        }
        try {
            j.i();
        } catch (IOException unused2) {
            this.c = bVar.f();
            h();
        } catch (Throwable th3) {
            this.c = bVar.f();
            throw th3;
        }
    }
}
