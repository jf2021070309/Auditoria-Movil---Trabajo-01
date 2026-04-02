package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.id0.d;
import com.amazon.aps.iva.id0.p;
import com.amazon.aps.iva.id0.s;
import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.p;
import com.google.ads.AdSize;
import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public final class h extends h.d<h> {
    public static final h v;
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
    public List<t> p;
    public s q;
    public List<Integer> r;
    public d s;
    public byte t;
    public int u;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<h> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new h(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.c<h, b> {
        public int e;
        public int f = 6;
        public int g = 6;
        public int h;
        public p i;
        public int j;
        public List<r> k;
        public p l;
        public int m;
        public List<p> n;
        public List<Integer> o;
        public List<t> p;
        public s q;
        public List<Integer> r;
        public d s;

        public b() {
            p pVar = p.u;
            this.i = pVar;
            this.k = Collections.emptyList();
            this.l = pVar;
            this.n = Collections.emptyList();
            this.o = Collections.emptyList();
            this.p = Collections.emptyList();
            this.q = s.h;
            this.r = Collections.emptyList();
            this.s = d.f;
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
            h f = f();
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
            g((h) hVar);
            return this;
        }

        public final h f() {
            h hVar = new h(this);
            int i = this.e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            hVar.e = this.f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            hVar.f = this.g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            hVar.g = this.h;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            hVar.h = this.i;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            hVar.i = this.j;
            if ((i & 32) == 32) {
                this.k = Collections.unmodifiableList(this.k);
                this.e &= -33;
            }
            hVar.j = this.k;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            hVar.k = this.l;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            hVar.l = this.m;
            if ((this.e & 256) == 256) {
                this.n = Collections.unmodifiableList(this.n);
                this.e &= -257;
            }
            hVar.m = this.n;
            if ((this.e & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                this.o = Collections.unmodifiableList(this.o);
                this.e &= -513;
            }
            hVar.n = this.o;
            if ((this.e & 1024) == 1024) {
                this.p = Collections.unmodifiableList(this.p);
                this.e &= -1025;
            }
            hVar.p = this.p;
            if ((i & 2048) == 2048) {
                i2 |= 128;
            }
            hVar.q = this.q;
            if ((this.e & 4096) == 4096) {
                this.r = Collections.unmodifiableList(this.r);
                this.e &= -4097;
            }
            hVar.r = this.r;
            if ((i & 8192) == 8192) {
                i2 |= 256;
            }
            hVar.s = this.s;
            hVar.d = i2;
            return hVar;
        }

        public final void g(h hVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            d dVar;
            s sVar;
            p pVar;
            p pVar2;
            if (hVar == h.v) {
                return;
            }
            int i = hVar.d;
            boolean z9 = false;
            if ((i & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = hVar.e;
                this.e |= 1;
                this.f = i2;
            }
            if ((i & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i3 = hVar.f;
                this.e = 2 | this.e;
                this.g = i3;
            }
            if ((i & 4) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int i4 = hVar.g;
                this.e = 4 | this.e;
                this.h = i4;
            }
            if ((i & 8) == 8) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                p pVar3 = hVar.h;
                if ((this.e & 8) == 8 && (pVar2 = this.i) != p.u) {
                    p.c n = p.n(pVar2);
                    n.g(pVar3);
                    this.i = n.f();
                } else {
                    this.i = pVar3;
                }
                this.e |= 8;
            }
            if ((hVar.d & 16) == 16) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                int i5 = hVar.i;
                this.e = 16 | this.e;
                this.j = i5;
            }
            if (!hVar.j.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = hVar.j;
                    this.e &= -33;
                } else {
                    if ((this.e & 32) != 32) {
                        this.k = new ArrayList(this.k);
                        this.e |= 32;
                    }
                    this.k.addAll(hVar.j);
                }
            }
            if ((hVar.d & 32) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                p pVar4 = hVar.k;
                if ((this.e & 64) == 64 && (pVar = this.l) != p.u) {
                    p.c n2 = p.n(pVar);
                    n2.g(pVar4);
                    this.l = n2.f();
                } else {
                    this.l = pVar4;
                }
                this.e |= 64;
            }
            if ((hVar.d & 64) == 64) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                int i6 = hVar.l;
                this.e |= 128;
                this.m = i6;
            }
            if (!hVar.m.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = hVar.m;
                    this.e &= -257;
                } else {
                    if ((this.e & 256) != 256) {
                        this.n = new ArrayList(this.n);
                        this.e |= 256;
                    }
                    this.n.addAll(hVar.m);
                }
            }
            if (!hVar.n.isEmpty()) {
                if (this.o.isEmpty()) {
                    this.o = hVar.n;
                    this.e &= -513;
                } else {
                    if ((this.e & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                        this.o = new ArrayList(this.o);
                        this.e |= AdRequest.MAX_CONTENT_URL_LENGTH;
                    }
                    this.o.addAll(hVar.n);
                }
            }
            if (!hVar.p.isEmpty()) {
                if (this.p.isEmpty()) {
                    this.p = hVar.p;
                    this.e &= -1025;
                } else {
                    if ((this.e & 1024) != 1024) {
                        this.p = new ArrayList(this.p);
                        this.e |= 1024;
                    }
                    this.p.addAll(hVar.p);
                }
            }
            if ((hVar.d & 128) == 128) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                s sVar2 = hVar.q;
                if ((this.e & 2048) == 2048 && (sVar = this.q) != s.h) {
                    s.b d = s.d(sVar);
                    d.f(sVar2);
                    this.q = d.e();
                } else {
                    this.q = sVar2;
                }
                this.e |= 2048;
            }
            if (!hVar.r.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = hVar.r;
                    this.e &= -4097;
                } else {
                    if ((this.e & 4096) != 4096) {
                        this.r = new ArrayList(this.r);
                        this.e |= 4096;
                    }
                    this.r.addAll(hVar.r);
                }
            }
            if ((hVar.d & 256) == 256) {
                z9 = true;
            }
            if (z9) {
                d dVar2 = hVar.s;
                if ((this.e & 8192) == 8192 && (dVar = this.s) != d.f) {
                    d.b bVar = new d.b();
                    bVar.f(dVar);
                    bVar.f(dVar2);
                    this.s = bVar.e();
                } else {
                    this.s = dVar2;
                }
                this.e |= 8192;
            }
            e(hVar);
            this.b = this.b.d(hVar.c);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.h$a r0 = com.amazon.aps.iva.id0.h.w     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.h r0 = new com.amazon.aps.iva.id0.h     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.h r3 = (com.amazon.aps.iva.id0.h) r3     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.h.b.h(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        h hVar = new h(0);
        v = hVar;
        hVar.l();
    }

    public h() {
        throw null;
    }

    public h(h.c cVar) {
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
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            eVar.o(6, this.p.get(i2));
        }
        if ((this.d & 16) == 16) {
            eVar.m(7, this.i);
        }
        if ((this.d & 64) == 64) {
            eVar.m(8, this.l);
        }
        if ((this.d & 1) == 1) {
            eVar.m(9, this.e);
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            eVar.o(10, this.m.get(i3));
        }
        if (this.n.size() > 0) {
            eVar.v(90);
            eVar.v(this.o);
        }
        for (int i4 = 0; i4 < this.n.size(); i4++) {
            eVar.n(this.n.get(i4).intValue());
        }
        if ((this.d & 128) == 128) {
            eVar.o(30, this.q);
        }
        for (int i5 = 0; i5 < this.r.size(); i5++) {
            eVar.m(31, this.r.get(i5).intValue());
        }
        if ((this.d & 256) == 256) {
            eVar.o(32, this.s);
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
        for (int i4 = 0; i4 < this.p.size(); i4++) {
            i += com.amazon.aps.iva.od0.e.d(6, this.p.get(i4));
        }
        if ((this.d & 16) == 16) {
            i += com.amazon.aps.iva.od0.e.b(7, this.i);
        }
        if ((this.d & 64) == 64) {
            i += com.amazon.aps.iva.od0.e.b(8, this.l);
        }
        if ((this.d & 1) == 1) {
            i += com.amazon.aps.iva.od0.e.b(9, this.e);
        }
        for (int i5 = 0; i5 < this.m.size(); i5++) {
            i += com.amazon.aps.iva.od0.e.d(10, this.m.get(i5));
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.n.size(); i7++) {
            i6 += com.amazon.aps.iva.od0.e.c(this.n.get(i7).intValue());
        }
        int i8 = i + i6;
        if (!this.n.isEmpty()) {
            i8 = i8 + 1 + com.amazon.aps.iva.od0.e.c(i6);
        }
        this.o = i6;
        if ((this.d & 128) == 128) {
            i8 += com.amazon.aps.iva.od0.e.d(30, this.q);
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.r.size(); i10++) {
            i9 += com.amazon.aps.iva.od0.e.c(this.r.get(i10).intValue());
        }
        int size = (this.r.size() * 2) + i8 + i9;
        if ((this.d & 256) == 256) {
            size += com.amazon.aps.iva.od0.e.d(32, this.s);
        }
        int size2 = this.c.size() + e() + size;
        this.u = size2;
        return size2;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
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
        for (int i4 = 0; i4 < this.p.size(); i4++) {
            if (!this.p.get(i4).isInitialized()) {
                this.t = (byte) 0;
                return false;
            }
        }
        if ((this.d & 128) == 128) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && !this.q.isInitialized()) {
            this.t = (byte) 0;
            return false;
        }
        if ((this.d & 256) == 256) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 && !this.s.isInitialized()) {
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
        this.e = 6;
        this.f = 6;
        this.g = 0;
        p pVar = p.u;
        this.h = pVar;
        this.i = 0;
        this.j = Collections.emptyList();
        this.k = pVar;
        this.l = 0;
        this.m = Collections.emptyList();
        this.n = Collections.emptyList();
        this.p = Collections.emptyList();
        this.q = s.h;
        this.r = Collections.emptyList();
        this.s = d.f;
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

    public h(int i) {
        this.o = -1;
        this.t = (byte) -1;
        this.u = -1;
        this.c = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public h(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        this.o = -1;
        this.t = (byte) -1;
        this.u = -1;
        l();
        c.b bVar = new c.b();
        com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            ?? r5 = 1024;
            if (!z) {
                try {
                    try {
                        int n = dVar.n();
                        p.c cVar = null;
                        d.b bVar2 = null;
                        s.b bVar3 = null;
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
                                boolean z4 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z4) {
                                    this.p = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.p.add(dVar.g(t.n, fVar));
                                continue;
                            case 56:
                                this.d |= 16;
                                this.i = dVar.k();
                                continue;
                            case 64:
                                this.d |= 64;
                                this.l = dVar.k();
                                continue;
                            case 72:
                                this.d |= 1;
                                this.e = dVar.k();
                                continue;
                            case 82:
                                boolean z5 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z5) {
                                    this.m = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.m.add(dVar.g(p.v, fVar));
                                continue;
                            case 88:
                                boolean z6 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z6) {
                                    this.n = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.n.add(Integer.valueOf(dVar.k()));
                                continue;
                            case 90:
                                int d = dVar.d(dVar.k());
                                boolean z7 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z7) {
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
                            case 242:
                                if ((this.d & 128) == 128) {
                                    s sVar = this.q;
                                    sVar.getClass();
                                    bVar3 = s.d(sVar);
                                }
                                s sVar2 = (s) dVar.g(s.i, fVar);
                                this.q = sVar2;
                                if (bVar3 != null) {
                                    bVar3.f(sVar2);
                                    this.q = bVar3.e();
                                }
                                this.d |= 128;
                                continue;
                            case 248:
                                boolean z8 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z8) {
                                    this.r = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.r.add(Integer.valueOf(dVar.k()));
                                continue;
                            case 250:
                                int d2 = dVar.d(dVar.k());
                                boolean z9 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z9) {
                                    z2 = z2;
                                    if (dVar.b() > 0) {
                                        this.r = new ArrayList();
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                }
                                while (dVar.b() > 0) {
                                    this.r.add(Integer.valueOf(dVar.k()));
                                }
                                dVar.c(d2);
                                continue;
                            case 258:
                                if ((this.d & 256) == 256) {
                                    d dVar2 = this.s;
                                    dVar2.getClass();
                                    bVar2 = new d.b();
                                    bVar2.f(dVar2);
                                }
                                d dVar3 = (d) dVar.g(d.g, fVar);
                                this.s = dVar3;
                                if (bVar2 != null) {
                                    bVar2.f(dVar3);
                                    this.s = bVar2.e();
                                }
                                this.d |= 256;
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
                            this.p = Collections.unmodifiableList(this.p);
                        }
                        if ((z2 ? 1 : 0) & true) {
                            this.m = Collections.unmodifiableList(this.m);
                        }
                        if ((z2 ? 1 : 0) & true) {
                            this.n = Collections.unmodifiableList(this.n);
                        }
                        if ((z2 ? 1 : 0) & true) {
                            this.r = Collections.unmodifiableList(this.r);
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
                    this.p = Collections.unmodifiableList(this.p);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.r = Collections.unmodifiableList(this.r);
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
