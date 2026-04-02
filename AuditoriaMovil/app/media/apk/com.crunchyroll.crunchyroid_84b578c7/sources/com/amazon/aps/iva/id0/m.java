package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.id0.p;
import com.amazon.aps.iva.id0.t;
import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.p;
import com.google.ads.AdSize;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public final class m extends h.d<m> {
    public static final m v;
    public static final a w = new a();
    public final com.amazon.aps.iva.od0.c c;
    public int d;
    public int e;
    public int f;
    public int g;
    public p h;
    public int i;
    public List<r> j;
    public p k;
    public int l;
    public List<p> m;
    public List<Integer> n;
    public int o;
    public t p;
    public int q;
    public int r;
    public List<Integer> s;
    public byte t;
    public int u;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<m> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new m(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.c<m, b> {
        public int e;
        public int f = 518;
        public int g = 2054;
        public int h;
        public p i;
        public int j;
        public List<r> k;
        public p l;
        public int m;
        public List<p> n;
        public List<Integer> o;
        public t p;
        public int q;
        public int r;
        public List<Integer> s;

        public b() {
            p pVar = p.u;
            this.i = pVar;
            this.k = Collections.emptyList();
            this.l = pVar;
            this.n = Collections.emptyList();
            this.o = Collections.emptyList();
            this.p = t.m;
            this.s = Collections.emptyList();
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
            m f = f();
            if (f.isInitialized()) {
                return f;
            }
            throw new com.amazon.aps.iva.od0.v();
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final h.b c() {
            b bVar = new b();
            bVar.g(f());
            return bVar;
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final Object clone() throws CloneNotSupportedException {
            b bVar = new b();
            bVar.g(f());
            return bVar;
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final /* bridge */ /* synthetic */ h.b d(com.amazon.aps.iva.od0.h hVar) {
            g((m) hVar);
            return this;
        }

        public final m f() {
            m mVar = new m(this);
            int i = this.e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            mVar.e = this.f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            mVar.f = this.g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            mVar.g = this.h;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            mVar.h = this.i;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            mVar.i = this.j;
            if ((i & 32) == 32) {
                this.k = Collections.unmodifiableList(this.k);
                this.e &= -33;
            }
            mVar.j = this.k;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            mVar.k = this.l;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            mVar.l = this.m;
            if ((this.e & 256) == 256) {
                this.n = Collections.unmodifiableList(this.n);
                this.e &= -257;
            }
            mVar.m = this.n;
            if ((this.e & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                this.o = Collections.unmodifiableList(this.o);
                this.e &= -513;
            }
            mVar.n = this.o;
            if ((i & 1024) == 1024) {
                i2 |= 128;
            }
            mVar.p = this.p;
            if ((i & 2048) == 2048) {
                i2 |= 256;
            }
            mVar.q = this.q;
            if ((i & 4096) == 4096) {
                i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            mVar.r = this.r;
            if ((this.e & 8192) == 8192) {
                this.s = Collections.unmodifiableList(this.s);
                this.e &= -8193;
            }
            mVar.s = this.s;
            mVar.d = i2;
            return mVar;
        }

        public final void g(m mVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            t tVar;
            p pVar;
            p pVar2;
            if (mVar == m.v) {
                return;
            }
            int i = mVar.d;
            boolean z10 = false;
            if ((i & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = mVar.e;
                this.e |= 1;
                this.f = i2;
            }
            if ((i & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i3 = mVar.f;
                this.e = 2 | this.e;
                this.g = i3;
            }
            if ((i & 4) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int i4 = mVar.g;
                this.e = 4 | this.e;
                this.h = i4;
            }
            if ((i & 8) == 8) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                p pVar3 = mVar.h;
                if ((this.e & 8) == 8 && (pVar2 = this.i) != p.u) {
                    p.c n = p.n(pVar2);
                    n.g(pVar3);
                    this.i = n.f();
                } else {
                    this.i = pVar3;
                }
                this.e |= 8;
            }
            if ((mVar.d & 16) == 16) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                int i5 = mVar.i;
                this.e = 16 | this.e;
                this.j = i5;
            }
            if (!mVar.j.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = mVar.j;
                    this.e &= -33;
                } else {
                    if ((this.e & 32) != 32) {
                        this.k = new ArrayList(this.k);
                        this.e |= 32;
                    }
                    this.k.addAll(mVar.j);
                }
            }
            if ((mVar.d & 32) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                p pVar4 = mVar.k;
                if ((this.e & 64) == 64 && (pVar = this.l) != p.u) {
                    p.c n2 = p.n(pVar);
                    n2.g(pVar4);
                    this.l = n2.f();
                } else {
                    this.l = pVar4;
                }
                this.e |= 64;
            }
            if ((mVar.d & 64) == 64) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                int i6 = mVar.l;
                this.e |= 128;
                this.m = i6;
            }
            if (!mVar.m.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = mVar.m;
                    this.e &= -257;
                } else {
                    if ((this.e & 256) != 256) {
                        this.n = new ArrayList(this.n);
                        this.e |= 256;
                    }
                    this.n.addAll(mVar.m);
                }
            }
            if (!mVar.n.isEmpty()) {
                if (this.o.isEmpty()) {
                    this.o = mVar.n;
                    this.e &= -513;
                } else {
                    if ((this.e & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                        this.o = new ArrayList(this.o);
                        this.e |= AdRequest.MAX_CONTENT_URL_LENGTH;
                    }
                    this.o.addAll(mVar.n);
                }
            }
            if ((mVar.d & 128) == 128) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                t tVar2 = mVar.p;
                if ((this.e & 1024) == 1024 && (tVar = this.p) != t.m) {
                    t.b bVar = new t.b();
                    bVar.g(tVar);
                    bVar.g(tVar2);
                    this.p = bVar.f();
                } else {
                    this.p = tVar2;
                }
                this.e |= 1024;
            }
            int i7 = mVar.d;
            if ((i7 & 256) == 256) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                int i8 = mVar.q;
                this.e |= 2048;
                this.q = i8;
            }
            if ((i7 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                z10 = true;
            }
            if (z10) {
                int i9 = mVar.r;
                this.e |= 4096;
                this.r = i9;
            }
            if (!mVar.s.isEmpty()) {
                if (this.s.isEmpty()) {
                    this.s = mVar.s;
                    this.e &= -8193;
                } else {
                    if ((this.e & 8192) != 8192) {
                        this.s = new ArrayList(this.s);
                        this.e |= 8192;
                    }
                    this.s.addAll(mVar.s);
                }
            }
            e(mVar);
            this.b = this.b.d(mVar.c);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.m$a r0 = com.amazon.aps.iva.id0.m.w     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.m r0 = new com.amazon.aps.iva.id0.m     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.m r3 = (com.amazon.aps.iva.id0.m) r3     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.m.b.h(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        m mVar = new m(0);
        v = mVar;
        mVar.l();
    }

    public m() {
        throw null;
    }

    public m(h.c cVar) {
        super(cVar);
        this.o = -1;
        this.t = (byte) -1;
        this.u = -1;
        this.c = cVar.b;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        h.d.a aVar = new h.d.a(this);
        if ((this.d & 2) == 2) {
            eVar.m(1, this.f);
        }
        if ((this.d & 4) == 4) {
            eVar.m(2, this.g);
        }
        if ((this.d & 8) == 8) {
            eVar.o(3, this.h);
        }
        for (int i = 0; i < this.j.size(); i++) {
            eVar.o(4, this.j.get(i));
        }
        if ((this.d & 32) == 32) {
            eVar.o(5, this.k);
        }
        if ((this.d & 128) == 128) {
            eVar.o(6, this.p);
        }
        if ((this.d & 256) == 256) {
            eVar.m(7, this.q);
        }
        if ((this.d & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            eVar.m(8, this.r);
        }
        if ((this.d & 16) == 16) {
            eVar.m(9, this.i);
        }
        if ((this.d & 64) == 64) {
            eVar.m(10, this.l);
        }
        if ((this.d & 1) == 1) {
            eVar.m(11, this.e);
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            eVar.o(12, this.m.get(i2));
        }
        if (this.n.size() > 0) {
            eVar.v(106);
            eVar.v(this.o);
        }
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            eVar.n(this.n.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.s.size(); i4++) {
            eVar.m(31, this.s.get(i4).intValue());
        }
        aVar.a(19000, eVar);
        eVar.r(this.c);
    }

    @Override // com.amazon.aps.iva.od0.q
    public final com.amazon.aps.iva.od0.p getDefaultInstanceForType() {
        return v;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i;
        int i2 = this.u;
        if (i2 != -1) {
            return i2;
        }
        if ((this.d & 2) == 2) {
            i = com.amazon.aps.iva.od0.e.b(1, this.f) + 0;
        } else {
            i = 0;
        }
        if ((this.d & 4) == 4) {
            i += com.amazon.aps.iva.od0.e.b(2, this.g);
        }
        if ((this.d & 8) == 8) {
            i += com.amazon.aps.iva.od0.e.d(3, this.h);
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            i += com.amazon.aps.iva.od0.e.d(4, this.j.get(i3));
        }
        if ((this.d & 32) == 32) {
            i += com.amazon.aps.iva.od0.e.d(5, this.k);
        }
        if ((this.d & 128) == 128) {
            i += com.amazon.aps.iva.od0.e.d(6, this.p);
        }
        if ((this.d & 256) == 256) {
            i += com.amazon.aps.iva.od0.e.b(7, this.q);
        }
        if ((this.d & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            i += com.amazon.aps.iva.od0.e.b(8, this.r);
        }
        if ((this.d & 16) == 16) {
            i += com.amazon.aps.iva.od0.e.b(9, this.i);
        }
        if ((this.d & 64) == 64) {
            i += com.amazon.aps.iva.od0.e.b(10, this.l);
        }
        if ((this.d & 1) == 1) {
            i += com.amazon.aps.iva.od0.e.b(11, this.e);
        }
        for (int i4 = 0; i4 < this.m.size(); i4++) {
            i += com.amazon.aps.iva.od0.e.d(12, this.m.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.n.size(); i6++) {
            i5 += com.amazon.aps.iva.od0.e.c(this.n.get(i6).intValue());
        }
        int i7 = i + i5;
        if (!this.n.isEmpty()) {
            i7 = i7 + 1 + com.amazon.aps.iva.od0.e.c(i5);
        }
        this.o = i5;
        int i8 = 0;
        for (int i9 = 0; i9 < this.s.size(); i9++) {
            i8 += com.amazon.aps.iva.od0.e.c(this.s.get(i9).intValue());
        }
        int size = this.c.size() + e() + (this.s.size() * 2) + i7 + i8;
        this.u = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        byte b2 = this.t;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i = this.d;
        if ((i & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.t = (byte) 0;
            return false;
        }
        if ((i & 8) == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !this.h.isInitialized()) {
            this.t = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            if (!this.j.get(i2).isInitialized()) {
                this.t = (byte) 0;
                return false;
            }
        }
        if ((this.d & 32) == 32) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && !this.k.isInitialized()) {
            this.t = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            if (!this.m.get(i3).isInitialized()) {
                this.t = (byte) 0;
                return false;
            }
        }
        if ((this.d & 128) == 128) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && !this.p.isInitialized()) {
            this.t = (byte) 0;
            return false;
        } else if (!d()) {
            this.t = (byte) 0;
            return false;
        } else {
            this.t = (byte) 1;
            return true;
        }
    }

    public final void l() {
        this.e = 518;
        this.f = 2054;
        this.g = 0;
        p pVar = p.u;
        this.h = pVar;
        this.i = 0;
        this.j = Collections.emptyList();
        this.k = pVar;
        this.l = 0;
        this.m = Collections.emptyList();
        this.n = Collections.emptyList();
        this.p = t.m;
        this.q = 0;
        this.r = 0;
        this.s = Collections.emptyList();
    }

    @Override // com.amazon.aps.iva.od0.p
    public final p.a newBuilderForType() {
        return new b();
    }

    @Override // com.amazon.aps.iva.od0.p
    public final p.a toBuilder() {
        b bVar = new b();
        bVar.g(this);
        return bVar;
    }

    public m(int i) {
        this.o = -1;
        this.t = (byte) -1;
        this.u = -1;
        this.c = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public m(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        this.o = -1;
        this.t = (byte) -1;
        this.u = -1;
        l();
        c.b bVar = new c.b();
        com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            ?? r5 = 256;
            if (!z) {
                try {
                    try {
                        int n = dVar.n();
                        p.c cVar = null;
                        t.b bVar2 = null;
                        p.c cVar2 = null;
                        switch (n) {
                            case 0:
                                break;
                            case 8:
                                this.d |= 2;
                                this.f = dVar.k();
                                continue;
                            case 16:
                                this.d |= 4;
                                this.g = dVar.k();
                                continue;
                            case 26:
                                if ((this.d & 8) == 8) {
                                    p pVar = this.h;
                                    pVar.getClass();
                                    cVar = p.n(pVar);
                                }
                                p pVar2 = (p) dVar.g(p.v, fVar);
                                this.h = pVar2;
                                if (cVar != null) {
                                    cVar.g(pVar2);
                                    this.h = cVar.f();
                                }
                                this.d |= 8;
                                continue;
                            case 34:
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.j = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.j.add(dVar.g(r.o, fVar));
                                continue;
                            case 42:
                                if ((this.d & 32) == 32) {
                                    p pVar3 = this.k;
                                    pVar3.getClass();
                                    cVar2 = p.n(pVar3);
                                }
                                p pVar4 = (p) dVar.g(p.v, fVar);
                                this.k = pVar4;
                                if (cVar2 != null) {
                                    cVar2.g(pVar4);
                                    this.k = cVar2.f();
                                }
                                this.d |= 32;
                                continue;
                            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                                if ((this.d & 128) == 128) {
                                    t tVar = this.p;
                                    tVar.getClass();
                                    bVar2 = new t.b();
                                    bVar2.g(tVar);
                                }
                                t tVar2 = (t) dVar.g(t.n, fVar);
                                this.p = tVar2;
                                if (bVar2 != null) {
                                    bVar2.g(tVar2);
                                    this.p = bVar2.f();
                                }
                                this.d |= 128;
                                continue;
                            case 56:
                                this.d |= 256;
                                this.q = dVar.k();
                                continue;
                            case 64:
                                this.d |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                this.r = dVar.k();
                                continue;
                            case 72:
                                this.d |= 16;
                                this.i = dVar.k();
                                continue;
                            case 80:
                                this.d |= 64;
                                this.l = dVar.k();
                                continue;
                            case 88:
                                this.d |= 1;
                                this.e = dVar.k();
                                continue;
                            case 98:
                                boolean z4 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z4) {
                                    this.m = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.m.add(dVar.g(p.v, fVar));
                                continue;
                            case MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED /* 104 */:
                                boolean z5 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z5) {
                                    this.n = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.n.add(Integer.valueOf(dVar.k()));
                                continue;
                            case 106:
                                int d = dVar.d(dVar.k());
                                boolean z6 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z6) {
                                    z2 = z2;
                                    if (dVar.b() > 0) {
                                        this.n = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                }
                                while (dVar.b() > 0) {
                                    this.n.add(Integer.valueOf(dVar.k()));
                                }
                                dVar.c(d);
                                continue;
                            case 248:
                                boolean z7 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z7) {
                                    this.s = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.s.add(Integer.valueOf(dVar.k()));
                                continue;
                            case 250:
                                int d2 = dVar.d(dVar.k());
                                boolean z8 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z8) {
                                    z2 = z2;
                                    if (dVar.b() > 0) {
                                        this.s = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                }
                                while (dVar.b() > 0) {
                                    this.s.add(Integer.valueOf(dVar.k()));
                                }
                                dVar.c(d2);
                                continue;
                            default:
                                r5 = j(dVar, j, fVar, n);
                                if (r5 == 0) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((z2 ? 1 : 0) & true) {
                            this.j = Collections.unmodifiableList(this.j);
                        }
                        if (((z2 ? 1 : 0) & true) == r5) {
                            this.m = Collections.unmodifiableList(this.m);
                        }
                        if ((z2 ? 1 : 0) & true) {
                            this.n = Collections.unmodifiableList(this.n);
                        }
                        if ((z2 ? 1 : 0) & true) {
                            this.s = Collections.unmodifiableList(this.s);
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
            } else {
                if ((z2 ? 1 : 0) & true) {
                    this.j = Collections.unmodifiableList(this.j);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                try {
                    j.i();
                } catch (IOException unused2) {
                    this.c = bVar.f();
                    h();
                    return;
                } catch (Throwable th3) {
                    this.c = bVar.f();
                    throw th3;
                }
            }
        }
    }
}
