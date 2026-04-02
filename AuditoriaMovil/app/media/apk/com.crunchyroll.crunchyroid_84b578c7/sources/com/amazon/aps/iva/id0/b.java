package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.id0.p;
import com.amazon.aps.iva.id0.s;
import com.amazon.aps.iva.id0.v;
import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.i;
import com.amazon.aps.iva.od0.p;
import com.google.ads.AdSize;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public final class b extends h.d<b> {
    public static final b K;
    public static final a L = new a();
    public List<Integer> A;
    public int B;
    public List<p> C;
    public List<Integer> D;
    public int E;
    public s F;
    public List<Integer> G;
    public v H;
    public byte I;
    public int J;
    public final com.amazon.aps.iva.od0.c c;
    public int d;
    public int e;
    public int f;
    public int g;
    public List<r> h;
    public List<p> i;
    public List<Integer> j;
    public int k;
    public List<Integer> l;
    public int m;
    public List<p> n;
    public List<Integer> o;
    public int p;
    public List<com.amazon.aps.iva.id0.c> q;
    public List<h> r;
    public List<m> s;
    public List<q> t;
    public List<f> u;
    public List<Integer> v;
    public int w;
    public int x;
    public p y;
    public int z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<b> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new b(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: com.amazon.aps.iva.id0.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0373b extends h.c<b, C0373b> {
        public int e;
        public int g;
        public int h;
        public int u;
        public int w;
        public int f = 6;
        public List<r> i = Collections.emptyList();
        public List<p> j = Collections.emptyList();
        public List<Integer> k = Collections.emptyList();
        public List<Integer> l = Collections.emptyList();
        public List<p> m = Collections.emptyList();
        public List<Integer> n = Collections.emptyList();
        public List<com.amazon.aps.iva.id0.c> o = Collections.emptyList();
        public List<h> p = Collections.emptyList();
        public List<m> q = Collections.emptyList();
        public List<q> r = Collections.emptyList();
        public List<f> s = Collections.emptyList();
        public List<Integer> t = Collections.emptyList();
        public p v = p.u;
        public List<Integer> x = Collections.emptyList();
        public List<p> y = Collections.emptyList();
        public List<Integer> z = Collections.emptyList();
        public s A = s.h;
        public List<Integer> B = Collections.emptyList();
        public v C = v.f;

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
            b f = f();
            if (f.isInitialized()) {
                return f;
            }
            throw new com.amazon.aps.iva.od0.v();
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final h.b c() {
            C0373b c0373b = new C0373b();
            c0373b.g(f());
            return c0373b;
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final Object clone() throws CloneNotSupportedException {
            C0373b c0373b = new C0373b();
            c0373b.g(f());
            return c0373b;
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final /* bridge */ /* synthetic */ h.b d(com.amazon.aps.iva.od0.h hVar) {
            g((b) hVar);
            return this;
        }

        public final b f() {
            b bVar = new b(this);
            int i = this.e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            bVar.e = this.f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            bVar.f = this.g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            bVar.g = this.h;
            if ((i & 8) == 8) {
                this.i = Collections.unmodifiableList(this.i);
                this.e &= -9;
            }
            bVar.h = this.i;
            if ((this.e & 16) == 16) {
                this.j = Collections.unmodifiableList(this.j);
                this.e &= -17;
            }
            bVar.i = this.j;
            if ((this.e & 32) == 32) {
                this.k = Collections.unmodifiableList(this.k);
                this.e &= -33;
            }
            bVar.j = this.k;
            if ((this.e & 64) == 64) {
                this.l = Collections.unmodifiableList(this.l);
                this.e &= -65;
            }
            bVar.l = this.l;
            if ((this.e & 128) == 128) {
                this.m = Collections.unmodifiableList(this.m);
                this.e &= -129;
            }
            bVar.n = this.m;
            if ((this.e & 256) == 256) {
                this.n = Collections.unmodifiableList(this.n);
                this.e &= -257;
            }
            bVar.o = this.n;
            if ((this.e & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                this.o = Collections.unmodifiableList(this.o);
                this.e &= -513;
            }
            bVar.q = this.o;
            if ((this.e & 1024) == 1024) {
                this.p = Collections.unmodifiableList(this.p);
                this.e &= -1025;
            }
            bVar.r = this.p;
            if ((this.e & 2048) == 2048) {
                this.q = Collections.unmodifiableList(this.q);
                this.e &= -2049;
            }
            bVar.s = this.q;
            if ((this.e & 4096) == 4096) {
                this.r = Collections.unmodifiableList(this.r);
                this.e &= -4097;
            }
            bVar.t = this.r;
            if ((this.e & 8192) == 8192) {
                this.s = Collections.unmodifiableList(this.s);
                this.e &= -8193;
            }
            bVar.u = this.s;
            if ((this.e & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                this.t = Collections.unmodifiableList(this.t);
                this.e &= -16385;
            }
            bVar.v = this.t;
            if ((i & 32768) == 32768) {
                i2 |= 8;
            }
            bVar.x = this.u;
            if ((i & Cast.MAX_MESSAGE_LENGTH) == 65536) {
                i2 |= 16;
            }
            bVar.y = this.v;
            if ((i & 131072) == 131072) {
                i2 |= 32;
            }
            bVar.z = this.w;
            if ((this.e & 262144) == 262144) {
                this.x = Collections.unmodifiableList(this.x);
                this.e &= -262145;
            }
            bVar.A = this.x;
            if ((this.e & 524288) == 524288) {
                this.y = Collections.unmodifiableList(this.y);
                this.e &= -524289;
            }
            bVar.C = this.y;
            if ((this.e & 1048576) == 1048576) {
                this.z = Collections.unmodifiableList(this.z);
                this.e &= -1048577;
            }
            bVar.D = this.z;
            if ((i & 2097152) == 2097152) {
                i2 |= 64;
            }
            bVar.F = this.A;
            if ((this.e & 4194304) == 4194304) {
                this.B = Collections.unmodifiableList(this.B);
                this.e &= -4194305;
            }
            bVar.G = this.B;
            if ((i & 8388608) == 8388608) {
                i2 |= 128;
            }
            bVar.H = this.C;
            bVar.d = i2;
            return bVar;
        }

        public final void g(b bVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            v vVar;
            s sVar;
            p pVar;
            if (bVar == b.K) {
                return;
            }
            int i = bVar.d;
            boolean z8 = false;
            if ((i & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = bVar.e;
                this.e |= 1;
                this.f = i2;
            }
            if ((i & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i3 = bVar.f;
                this.e = 2 | this.e;
                this.g = i3;
            }
            if ((i & 4) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int i4 = bVar.g;
                this.e = 4 | this.e;
                this.h = i4;
            }
            if (!bVar.h.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = bVar.h;
                    this.e &= -9;
                } else {
                    if ((this.e & 8) != 8) {
                        this.i = new ArrayList(this.i);
                        this.e |= 8;
                    }
                    this.i.addAll(bVar.h);
                }
            }
            if (!bVar.i.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = bVar.i;
                    this.e &= -17;
                } else {
                    if ((this.e & 16) != 16) {
                        this.j = new ArrayList(this.j);
                        this.e |= 16;
                    }
                    this.j.addAll(bVar.i);
                }
            }
            if (!bVar.j.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = bVar.j;
                    this.e &= -33;
                } else {
                    if ((this.e & 32) != 32) {
                        this.k = new ArrayList(this.k);
                        this.e |= 32;
                    }
                    this.k.addAll(bVar.j);
                }
            }
            if (!bVar.l.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = bVar.l;
                    this.e &= -65;
                } else {
                    if ((this.e & 64) != 64) {
                        this.l = new ArrayList(this.l);
                        this.e |= 64;
                    }
                    this.l.addAll(bVar.l);
                }
            }
            if (!bVar.n.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = bVar.n;
                    this.e &= -129;
                } else {
                    if ((this.e & 128) != 128) {
                        this.m = new ArrayList(this.m);
                        this.e |= 128;
                    }
                    this.m.addAll(bVar.n);
                }
            }
            if (!bVar.o.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = bVar.o;
                    this.e &= -257;
                } else {
                    if ((this.e & 256) != 256) {
                        this.n = new ArrayList(this.n);
                        this.e |= 256;
                    }
                    this.n.addAll(bVar.o);
                }
            }
            if (!bVar.q.isEmpty()) {
                if (this.o.isEmpty()) {
                    this.o = bVar.q;
                    this.e &= -513;
                } else {
                    if ((this.e & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                        this.o = new ArrayList(this.o);
                        this.e |= AdRequest.MAX_CONTENT_URL_LENGTH;
                    }
                    this.o.addAll(bVar.q);
                }
            }
            if (!bVar.r.isEmpty()) {
                if (this.p.isEmpty()) {
                    this.p = bVar.r;
                    this.e &= -1025;
                } else {
                    if ((this.e & 1024) != 1024) {
                        this.p = new ArrayList(this.p);
                        this.e |= 1024;
                    }
                    this.p.addAll(bVar.r);
                }
            }
            if (!bVar.s.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = bVar.s;
                    this.e &= -2049;
                } else {
                    if ((this.e & 2048) != 2048) {
                        this.q = new ArrayList(this.q);
                        this.e |= 2048;
                    }
                    this.q.addAll(bVar.s);
                }
            }
            if (!bVar.t.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = bVar.t;
                    this.e &= -4097;
                } else {
                    if ((this.e & 4096) != 4096) {
                        this.r = new ArrayList(this.r);
                        this.e |= 4096;
                    }
                    this.r.addAll(bVar.t);
                }
            }
            if (!bVar.u.isEmpty()) {
                if (this.s.isEmpty()) {
                    this.s = bVar.u;
                    this.e &= -8193;
                } else {
                    if ((this.e & 8192) != 8192) {
                        this.s = new ArrayList(this.s);
                        this.e |= 8192;
                    }
                    this.s.addAll(bVar.u);
                }
            }
            if (!bVar.v.isEmpty()) {
                if (this.t.isEmpty()) {
                    this.t = bVar.v;
                    this.e &= -16385;
                } else {
                    if ((this.e & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                        this.t = new ArrayList(this.t);
                        this.e |= Http2.INITIAL_MAX_FRAME_SIZE;
                    }
                    this.t.addAll(bVar.v);
                }
            }
            int i5 = bVar.d;
            if ((i5 & 8) == 8) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                int i6 = bVar.x;
                this.e |= 32768;
                this.u = i6;
            }
            if ((i5 & 16) == 16) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                p pVar2 = bVar.y;
                if ((this.e & Cast.MAX_MESSAGE_LENGTH) == 65536 && (pVar = this.v) != p.u) {
                    p.c n = p.n(pVar);
                    n.g(pVar2);
                    this.v = n.f();
                } else {
                    this.v = pVar2;
                }
                this.e |= Cast.MAX_MESSAGE_LENGTH;
            }
            if ((bVar.d & 32) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                int i7 = bVar.z;
                this.e |= 131072;
                this.w = i7;
            }
            if (!bVar.A.isEmpty()) {
                if (this.x.isEmpty()) {
                    this.x = bVar.A;
                    this.e &= -262145;
                } else {
                    if ((this.e & 262144) != 262144) {
                        this.x = new ArrayList(this.x);
                        this.e |= 262144;
                    }
                    this.x.addAll(bVar.A);
                }
            }
            if (!bVar.C.isEmpty()) {
                if (this.y.isEmpty()) {
                    this.y = bVar.C;
                    this.e &= -524289;
                } else {
                    if ((this.e & 524288) != 524288) {
                        this.y = new ArrayList(this.y);
                        this.e |= 524288;
                    }
                    this.y.addAll(bVar.C);
                }
            }
            if (!bVar.D.isEmpty()) {
                if (this.z.isEmpty()) {
                    this.z = bVar.D;
                    this.e &= -1048577;
                } else {
                    if ((this.e & 1048576) != 1048576) {
                        this.z = new ArrayList(this.z);
                        this.e |= 1048576;
                    }
                    this.z.addAll(bVar.D);
                }
            }
            if ((bVar.d & 64) == 64) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                s sVar2 = bVar.F;
                if ((this.e & 2097152) == 2097152 && (sVar = this.A) != s.h) {
                    s.b d = s.d(sVar);
                    d.f(sVar2);
                    this.A = d.e();
                } else {
                    this.A = sVar2;
                }
                this.e |= 2097152;
            }
            if (!bVar.G.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = bVar.G;
                    this.e &= -4194305;
                } else {
                    if ((this.e & 4194304) != 4194304) {
                        this.B = new ArrayList(this.B);
                        this.e |= 4194304;
                    }
                    this.B.addAll(bVar.G);
                }
            }
            if ((bVar.d & 128) == 128) {
                z8 = true;
            }
            if (z8) {
                v vVar2 = bVar.H;
                if ((this.e & 8388608) == 8388608 && (vVar = this.C) != v.f) {
                    v.b bVar2 = new v.b();
                    bVar2.f(vVar);
                    bVar2.f(vVar2);
                    this.C = bVar2.e();
                } else {
                    this.C = vVar2;
                }
                this.e |= 8388608;
            }
            e(bVar);
            this.b = this.b.d(bVar.c);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.b$a r0 = com.amazon.aps.iva.id0.b.L     // Catch: java.lang.Throwable -> Le com.amazon.aps.iva.od0.j -> L10
                r0.getClass()     // Catch: java.lang.Throwable -> Le com.amazon.aps.iva.od0.j -> L10
                com.amazon.aps.iva.id0.b r0 = new com.amazon.aps.iva.id0.b     // Catch: java.lang.Throwable -> Le com.amazon.aps.iva.od0.j -> L10
                r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> Le com.amazon.aps.iva.od0.j -> L10
                r1.g(r0)
                return
            Le:
                r2 = move-exception
                goto L18
            L10:
                r2 = move-exception
                com.amazon.aps.iva.od0.p r3 = r2.b     // Catch: java.lang.Throwable -> Le
                com.amazon.aps.iva.id0.b r3 = (com.amazon.aps.iva.id0.b) r3     // Catch: java.lang.Throwable -> Le
                throw r2     // Catch: java.lang.Throwable -> L16
            L16:
                r2 = move-exception
                goto L19
            L18:
                r3 = 0
            L19:
                if (r3 == 0) goto L1e
                r1.g(r3)
            L1e:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.b.C0373b.h(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public enum c implements i.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        
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
            switch (i) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }
    }

    static {
        b bVar = new b(0);
        K = bVar;
        bVar.l();
    }

    public b() {
        throw null;
    }

    public b(h.c cVar) {
        super(cVar);
        this.k = -1;
        this.m = -1;
        this.p = -1;
        this.w = -1;
        this.B = -1;
        this.E = -1;
        this.I = (byte) -1;
        this.J = -1;
        this.c = cVar.b;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        h.d.a aVar = new h.d.a(this);
        if ((this.d & 1) == 1) {
            eVar.m(1, this.e);
        }
        if (this.j.size() > 0) {
            eVar.v(18);
            eVar.v(this.k);
        }
        for (int i = 0; i < this.j.size(); i++) {
            eVar.n(this.j.get(i).intValue());
        }
        if ((this.d & 2) == 2) {
            eVar.m(3, this.f);
        }
        if ((this.d & 4) == 4) {
            eVar.m(4, this.g);
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            eVar.o(5, this.h.get(i2));
        }
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            eVar.o(6, this.i.get(i3));
        }
        if (this.l.size() > 0) {
            eVar.v(58);
            eVar.v(this.m);
        }
        for (int i4 = 0; i4 < this.l.size(); i4++) {
            eVar.n(this.l.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.q.size(); i5++) {
            eVar.o(8, this.q.get(i5));
        }
        for (int i6 = 0; i6 < this.r.size(); i6++) {
            eVar.o(9, this.r.get(i6));
        }
        for (int i7 = 0; i7 < this.s.size(); i7++) {
            eVar.o(10, this.s.get(i7));
        }
        for (int i8 = 0; i8 < this.t.size(); i8++) {
            eVar.o(11, this.t.get(i8));
        }
        for (int i9 = 0; i9 < this.u.size(); i9++) {
            eVar.o(13, this.u.get(i9));
        }
        if (this.v.size() > 0) {
            eVar.v(130);
            eVar.v(this.w);
        }
        for (int i10 = 0; i10 < this.v.size(); i10++) {
            eVar.n(this.v.get(i10).intValue());
        }
        if ((this.d & 8) == 8) {
            eVar.m(17, this.x);
        }
        if ((this.d & 16) == 16) {
            eVar.o(18, this.y);
        }
        if ((this.d & 32) == 32) {
            eVar.m(19, this.z);
        }
        for (int i11 = 0; i11 < this.n.size(); i11++) {
            eVar.o(20, this.n.get(i11));
        }
        if (this.o.size() > 0) {
            eVar.v(170);
            eVar.v(this.p);
        }
        for (int i12 = 0; i12 < this.o.size(); i12++) {
            eVar.n(this.o.get(i12).intValue());
        }
        if (this.A.size() > 0) {
            eVar.v(178);
            eVar.v(this.B);
        }
        for (int i13 = 0; i13 < this.A.size(); i13++) {
            eVar.n(this.A.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.C.size(); i14++) {
            eVar.o(23, this.C.get(i14));
        }
        if (this.D.size() > 0) {
            eVar.v(194);
            eVar.v(this.E);
        }
        for (int i15 = 0; i15 < this.D.size(); i15++) {
            eVar.n(this.D.get(i15).intValue());
        }
        if ((this.d & 64) == 64) {
            eVar.o(30, this.F);
        }
        for (int i16 = 0; i16 < this.G.size(); i16++) {
            eVar.m(31, this.G.get(i16).intValue());
        }
        if ((this.d & 128) == 128) {
            eVar.o(32, this.H);
        }
        aVar.a(19000, eVar);
        eVar.r(this.c);
    }

    @Override // com.amazon.aps.iva.od0.q
    public final com.amazon.aps.iva.od0.p getDefaultInstanceForType() {
        return K;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i;
        int i2 = this.J;
        if (i2 != -1) {
            return i2;
        }
        if ((this.d & 1) == 1) {
            i = com.amazon.aps.iva.od0.e.b(1, this.e) + 0;
        } else {
            i = 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.j.size(); i4++) {
            i3 += com.amazon.aps.iva.od0.e.c(this.j.get(i4).intValue());
        }
        int i5 = i + i3;
        if (!this.j.isEmpty()) {
            i5 = i5 + 1 + com.amazon.aps.iva.od0.e.c(i3);
        }
        this.k = i3;
        if ((this.d & 2) == 2) {
            i5 += com.amazon.aps.iva.od0.e.b(3, this.f);
        }
        if ((this.d & 4) == 4) {
            i5 += com.amazon.aps.iva.od0.e.b(4, this.g);
        }
        for (int i6 = 0; i6 < this.h.size(); i6++) {
            i5 += com.amazon.aps.iva.od0.e.d(5, this.h.get(i6));
        }
        for (int i7 = 0; i7 < this.i.size(); i7++) {
            i5 += com.amazon.aps.iva.od0.e.d(6, this.i.get(i7));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.l.size(); i9++) {
            i8 += com.amazon.aps.iva.od0.e.c(this.l.get(i9).intValue());
        }
        int i10 = i5 + i8;
        if (!this.l.isEmpty()) {
            i10 = i10 + 1 + com.amazon.aps.iva.od0.e.c(i8);
        }
        this.m = i8;
        for (int i11 = 0; i11 < this.q.size(); i11++) {
            i10 += com.amazon.aps.iva.od0.e.d(8, this.q.get(i11));
        }
        for (int i12 = 0; i12 < this.r.size(); i12++) {
            i10 += com.amazon.aps.iva.od0.e.d(9, this.r.get(i12));
        }
        for (int i13 = 0; i13 < this.s.size(); i13++) {
            i10 += com.amazon.aps.iva.od0.e.d(10, this.s.get(i13));
        }
        for (int i14 = 0; i14 < this.t.size(); i14++) {
            i10 += com.amazon.aps.iva.od0.e.d(11, this.t.get(i14));
        }
        for (int i15 = 0; i15 < this.u.size(); i15++) {
            i10 += com.amazon.aps.iva.od0.e.d(13, this.u.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.v.size(); i17++) {
            i16 += com.amazon.aps.iva.od0.e.c(this.v.get(i17).intValue());
        }
        int i18 = i10 + i16;
        if (!this.v.isEmpty()) {
            i18 = i18 + 2 + com.amazon.aps.iva.od0.e.c(i16);
        }
        this.w = i16;
        if ((this.d & 8) == 8) {
            i18 += com.amazon.aps.iva.od0.e.b(17, this.x);
        }
        if ((this.d & 16) == 16) {
            i18 += com.amazon.aps.iva.od0.e.d(18, this.y);
        }
        if ((this.d & 32) == 32) {
            i18 += com.amazon.aps.iva.od0.e.b(19, this.z);
        }
        for (int i19 = 0; i19 < this.n.size(); i19++) {
            i18 += com.amazon.aps.iva.od0.e.d(20, this.n.get(i19));
        }
        int i20 = 0;
        for (int i21 = 0; i21 < this.o.size(); i21++) {
            i20 += com.amazon.aps.iva.od0.e.c(this.o.get(i21).intValue());
        }
        int i22 = i18 + i20;
        if (!this.o.isEmpty()) {
            i22 = i22 + 2 + com.amazon.aps.iva.od0.e.c(i20);
        }
        this.p = i20;
        int i23 = 0;
        for (int i24 = 0; i24 < this.A.size(); i24++) {
            i23 += com.amazon.aps.iva.od0.e.c(this.A.get(i24).intValue());
        }
        int i25 = i22 + i23;
        if (!this.A.isEmpty()) {
            i25 = i25 + 2 + com.amazon.aps.iva.od0.e.c(i23);
        }
        this.B = i23;
        for (int i26 = 0; i26 < this.C.size(); i26++) {
            i25 += com.amazon.aps.iva.od0.e.d(23, this.C.get(i26));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.D.size(); i28++) {
            i27 += com.amazon.aps.iva.od0.e.c(this.D.get(i28).intValue());
        }
        int i29 = i25 + i27;
        if (!this.D.isEmpty()) {
            i29 = i29 + 2 + com.amazon.aps.iva.od0.e.c(i27);
        }
        this.E = i27;
        if ((this.d & 64) == 64) {
            i29 += com.amazon.aps.iva.od0.e.d(30, this.F);
        }
        int i30 = 0;
        for (int i31 = 0; i31 < this.G.size(); i31++) {
            i30 += com.amazon.aps.iva.od0.e.c(this.G.get(i31).intValue());
        }
        int size = (this.G.size() * 2) + i29 + i30;
        if ((this.d & 128) == 128) {
            size += com.amazon.aps.iva.od0.e.d(32, this.H);
        }
        int size2 = this.c.size() + e() + size;
        this.J = size2;
        return size2;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        boolean z;
        boolean z2;
        boolean z3;
        byte b = this.I;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.d & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.I = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.h.size(); i++) {
            if (!this.h.get(i).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (!this.i.get(i2).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            if (!this.n.get(i3).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.q.size(); i4++) {
            if (!this.q.get(i4).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.r.size(); i5++) {
            if (!this.r.get(i5).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.s.size(); i6++) {
            if (!this.s.get(i6).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.t.size(); i7++) {
            if (!this.t.get(i7).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.u.size(); i8++) {
            if (!this.u.get(i8).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if ((this.d & 16) == 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !this.y.isInitialized()) {
            this.I = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.C.size(); i9++) {
            if (!this.C.get(i9).isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if ((this.d & 64) == 64) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && !this.F.isInitialized()) {
            this.I = (byte) 0;
            return false;
        } else if (!d()) {
            this.I = (byte) 0;
            return false;
        } else {
            this.I = (byte) 1;
            return true;
        }
    }

    public final void l() {
        this.e = 6;
        this.f = 0;
        this.g = 0;
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        this.l = Collections.emptyList();
        this.n = Collections.emptyList();
        this.o = Collections.emptyList();
        this.q = Collections.emptyList();
        this.r = Collections.emptyList();
        this.s = Collections.emptyList();
        this.t = Collections.emptyList();
        this.u = Collections.emptyList();
        this.v = Collections.emptyList();
        this.x = 0;
        this.y = p.u;
        this.z = 0;
        this.A = Collections.emptyList();
        this.C = Collections.emptyList();
        this.D = Collections.emptyList();
        this.F = s.h;
        this.G = Collections.emptyList();
        this.H = v.f;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final p.a newBuilderForType() {
        return new C0373b();
    }

    @Override // com.amazon.aps.iva.od0.p
    public final p.a toBuilder() {
        C0373b c0373b = new C0373b();
        c0373b.g(this);
        return c0373b;
    }

    public b(int i) {
        this.k = -1;
        this.m = -1;
        this.p = -1;
        this.w = -1;
        this.B = -1;
        this.E = -1;
        this.I = (byte) -1;
        this.J = -1;
        this.c = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        boolean z;
        v.b bVar;
        this.k = -1;
        this.m = -1;
        this.p = -1;
        this.w = -1;
        this.B = -1;
        this.E = -1;
        this.I = (byte) -1;
        this.J = -1;
        l();
        c.b n = com.amazon.aps.iva.od0.c.n();
        com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(n, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                try {
                    int n2 = dVar.n();
                    switch (n2) {
                        case 0:
                            z = true;
                            z2 = z;
                            break;
                        case 8:
                            z = true;
                            this.d |= 1;
                            this.e = dVar.f();
                            break;
                        case 16:
                            boolean z4 = (z3 ? 1 : 0) & true;
                            boolean z5 = z3;
                            if (!z4) {
                                this.j = new ArrayList();
                                z5 = (z3 ? 1 : 0) | true;
                            }
                            this.j.add(Integer.valueOf(dVar.f()));
                            z3 = z5;
                            z = true;
                            break;
                        case 18:
                            int d = dVar.d(dVar.k());
                            boolean z6 = (z3 ? 1 : 0) & true;
                            boolean z7 = z3;
                            if (!z6) {
                                z7 = z3;
                                if (dVar.b() > 0) {
                                    this.j = new ArrayList();
                                    z7 = (z3 ? 1 : 0) | true;
                                }
                            }
                            while (dVar.b() > 0) {
                                this.j.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d);
                            z3 = z7;
                            z = true;
                            break;
                        case 24:
                            this.d |= 2;
                            this.f = dVar.f();
                            z3 = z3;
                            z = true;
                            break;
                        case 32:
                            this.d |= 4;
                            this.g = dVar.f();
                            z3 = z3;
                            z = true;
                            break;
                        case 42:
                            boolean z8 = (z3 ? 1 : 0) & true;
                            boolean z9 = z3;
                            if (!z8) {
                                this.h = new ArrayList();
                                z9 = (z3 ? 1 : 0) | true;
                            }
                            this.h.add(dVar.g(r.o, fVar));
                            z3 = z9;
                            z = true;
                            break;
                        case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                            boolean z10 = (z3 ? 1 : 0) & true;
                            boolean z11 = z3;
                            if (!z10) {
                                this.i = new ArrayList();
                                z11 = (z3 ? 1 : 0) | true;
                            }
                            this.i.add(dVar.g(p.v, fVar));
                            z3 = z11;
                            z = true;
                            break;
                        case 56:
                            boolean z12 = (z3 ? 1 : 0) & true;
                            boolean z13 = z3;
                            if (!z12) {
                                this.l = new ArrayList();
                                z13 = (z3 ? 1 : 0) | true;
                            }
                            this.l.add(Integer.valueOf(dVar.f()));
                            z3 = z13;
                            z = true;
                            break;
                        case 58:
                            int d2 = dVar.d(dVar.k());
                            boolean z14 = (z3 ? 1 : 0) & true;
                            boolean z15 = z3;
                            if (!z14) {
                                z15 = z3;
                                if (dVar.b() > 0) {
                                    this.l = new ArrayList();
                                    z15 = (z3 ? 1 : 0) | true;
                                }
                            }
                            while (dVar.b() > 0) {
                                this.l.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d2);
                            z3 = z15;
                            z = true;
                            break;
                        case 66:
                            boolean z16 = (z3 ? 1 : 0) & true;
                            boolean z17 = z3;
                            if (!z16) {
                                this.q = new ArrayList();
                                z17 = (z3 ? 1 : 0) | true;
                            }
                            this.q.add(dVar.g(com.amazon.aps.iva.id0.c.k, fVar));
                            z3 = z17;
                            z = true;
                            break;
                        case 74:
                            boolean z18 = (z3 ? 1 : 0) & true;
                            boolean z19 = z3;
                            if (!z18) {
                                this.r = new ArrayList();
                                z19 = (z3 ? 1 : 0) | true;
                            }
                            this.r.add(dVar.g(h.w, fVar));
                            z3 = z19;
                            z = true;
                            break;
                        case 82:
                            boolean z20 = (z3 ? 1 : 0) & true;
                            boolean z21 = z3;
                            if (!z20) {
                                this.s = new ArrayList();
                                z21 = (z3 ? 1 : 0) | true;
                            }
                            this.s.add(dVar.g(m.w, fVar));
                            z3 = z21;
                            z = true;
                            break;
                        case 90:
                            boolean z22 = (z3 ? 1 : 0) & true;
                            boolean z23 = z3;
                            if (!z22) {
                                this.t = new ArrayList();
                                z23 = (z3 ? 1 : 0) | true;
                            }
                            this.t.add(dVar.g(q.q, fVar));
                            z3 = z23;
                            z = true;
                            break;
                        case 106:
                            boolean z24 = (z3 ? 1 : 0) & true;
                            boolean z25 = z3;
                            if (!z24) {
                                this.u = new ArrayList();
                                z25 = (z3 ? 1 : 0) | true;
                            }
                            this.u.add(dVar.g(f.i, fVar));
                            z3 = z25;
                            z = true;
                            break;
                        case 128:
                            boolean z26 = (z3 ? 1 : 0) & true;
                            boolean z27 = z3;
                            if (!z26) {
                                this.v = new ArrayList();
                                z27 = (z3 ? 1 : 0) | true;
                            }
                            this.v.add(Integer.valueOf(dVar.f()));
                            z3 = z27;
                            z = true;
                            break;
                        case 130:
                            int d3 = dVar.d(dVar.k());
                            boolean z28 = (z3 ? 1 : 0) & true;
                            boolean z29 = z3;
                            if (!z28) {
                                z29 = z3;
                                if (dVar.b() > 0) {
                                    this.v = new ArrayList();
                                    z29 = (z3 ? 1 : 0) | true;
                                }
                            }
                            while (dVar.b() > 0) {
                                this.v.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d3);
                            z3 = z29;
                            z = true;
                            break;
                        case 136:
                            this.d |= 8;
                            this.x = dVar.f();
                            z3 = z3;
                            z = true;
                            break;
                        case 146:
                            p.c o = (this.d & 16) == 16 ? this.y.o() : null;
                            p pVar = (p) dVar.g(p.v, fVar);
                            this.y = pVar;
                            if (o != null) {
                                o.g(pVar);
                                this.y = o.f();
                            }
                            this.d |= 16;
                            z3 = z3;
                            z = true;
                            break;
                        case 152:
                            this.d |= 32;
                            this.z = dVar.f();
                            z3 = z3;
                            z = true;
                            break;
                        case 162:
                            boolean z30 = (z3 ? 1 : 0) & true;
                            boolean z31 = z3;
                            if (!z30) {
                                this.n = new ArrayList();
                                z31 = (z3 ? 1 : 0) | true;
                            }
                            this.n.add(dVar.g(p.v, fVar));
                            z3 = z31;
                            z = true;
                            break;
                        case 168:
                            boolean z32 = (z3 ? 1 : 0) & true;
                            boolean z33 = z3;
                            if (!z32) {
                                this.o = new ArrayList();
                                z33 = (z3 ? 1 : 0) | true;
                            }
                            this.o.add(Integer.valueOf(dVar.f()));
                            z3 = z33;
                            z = true;
                            break;
                        case 170:
                            int d4 = dVar.d(dVar.k());
                            boolean z34 = (z3 ? 1 : 0) & true;
                            boolean z35 = z3;
                            if (!z34) {
                                z35 = z3;
                                if (dVar.b() > 0) {
                                    this.o = new ArrayList();
                                    z35 = (z3 ? 1 : 0) | true;
                                }
                            }
                            while (dVar.b() > 0) {
                                this.o.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d4);
                            z3 = z35;
                            z = true;
                            break;
                        case 176:
                            boolean z36 = (z3 ? 1 : 0) & true;
                            boolean z37 = z3;
                            if (!z36) {
                                this.A = new ArrayList();
                                z37 = (z3 ? 1 : 0) | true;
                            }
                            this.A.add(Integer.valueOf(dVar.f()));
                            z3 = z37;
                            z = true;
                            break;
                        case 178:
                            int d5 = dVar.d(dVar.k());
                            boolean z38 = (z3 ? 1 : 0) & true;
                            boolean z39 = z3;
                            if (!z38) {
                                z39 = z3;
                                if (dVar.b() > 0) {
                                    this.A = new ArrayList();
                                    z39 = (z3 ? 1 : 0) | true;
                                }
                            }
                            while (dVar.b() > 0) {
                                this.A.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d5);
                            z3 = z39;
                            z = true;
                            break;
                        case 186:
                            boolean z40 = (z3 ? 1 : 0) & true;
                            boolean z41 = z3;
                            if (!z40) {
                                this.C = new ArrayList();
                                z41 = (z3 ? 1 : 0) | true;
                            }
                            this.C.add(dVar.g(p.v, fVar));
                            z3 = z41;
                            z = true;
                            break;
                        case 192:
                            boolean z42 = (z3 ? 1 : 0) & true;
                            boolean z43 = z3;
                            if (!z42) {
                                this.D = new ArrayList();
                                z43 = (z3 ? 1 : 0) | true;
                            }
                            this.D.add(Integer.valueOf(dVar.f()));
                            z3 = z43;
                            z = true;
                            break;
                        case 194:
                            int d6 = dVar.d(dVar.k());
                            boolean z44 = (z3 ? 1 : 0) & true;
                            boolean z45 = z3;
                            if (!z44) {
                                z45 = z3;
                                if (dVar.b() > 0) {
                                    this.D = new ArrayList();
                                    z45 = (z3 ? 1 : 0) | true;
                                }
                            }
                            while (dVar.b() > 0) {
                                this.D.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d6);
                            z3 = z45;
                            z = true;
                            break;
                        case 242:
                            s.b e = (this.d & 64) == 64 ? this.F.e() : null;
                            s sVar = (s) dVar.g(s.i, fVar);
                            this.F = sVar;
                            if (e != null) {
                                e.f(sVar);
                                this.F = e.e();
                            }
                            this.d |= 64;
                            z3 = z3;
                            z = true;
                            break;
                        case 248:
                            boolean z46 = (z3 ? 1 : 0) & true;
                            boolean z47 = z3;
                            if (!z46) {
                                this.G = new ArrayList();
                                z47 = (z3 ? 1 : 0) | true;
                            }
                            this.G.add(Integer.valueOf(dVar.f()));
                            z3 = z47;
                            z = true;
                            break;
                        case 250:
                            int d7 = dVar.d(dVar.k());
                            boolean z48 = (z3 ? 1 : 0) & true;
                            boolean z49 = z3;
                            if (!z48) {
                                z49 = z3;
                                if (dVar.b() > 0) {
                                    this.G = new ArrayList();
                                    z49 = (z3 ? 1 : 0) | true;
                                }
                            }
                            while (dVar.b() > 0) {
                                this.G.add(Integer.valueOf(dVar.f()));
                            }
                            dVar.c(d7);
                            z3 = z49;
                            z = true;
                            break;
                        case 258:
                            if ((this.d & 128) == 128) {
                                v vVar = this.H;
                                vVar.getClass();
                                bVar = new v.b();
                                bVar.f(vVar);
                            } else {
                                bVar = null;
                            }
                            v vVar2 = (v) dVar.g(v.g, fVar);
                            this.H = vVar2;
                            if (bVar != null) {
                                bVar.f(vVar2);
                                this.H = bVar.e();
                            }
                            this.d |= 128;
                            z3 = z3;
                            z = true;
                            break;
                        default:
                            z = true;
                            if (j(dVar, j, fVar, n2)) {
                                break;
                            }
                            z2 = z;
                            break;
                    }
                    z3 = z3;
                } catch (Throwable th) {
                    if ((z3 ? 1 : 0) & true) {
                        this.j = Collections.unmodifiableList(this.j);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.h = Collections.unmodifiableList(this.h);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.q = Collections.unmodifiableList(this.q);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.r = Collections.unmodifiableList(this.r);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.s = Collections.unmodifiableList(this.s);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.t = Collections.unmodifiableList(this.t);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.u = Collections.unmodifiableList(this.u);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.v = Collections.unmodifiableList(this.v);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.n = Collections.unmodifiableList(this.n);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.o = Collections.unmodifiableList(this.o);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.A = Collections.unmodifiableList(this.A);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.C = Collections.unmodifiableList(this.C);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.D = Collections.unmodifiableList(this.D);
                    }
                    if ((z3 ? 1 : 0) & true) {
                        this.G = Collections.unmodifiableList(this.G);
                    }
                    try {
                        j.i();
                    } catch (IOException unused) {
                        this.c = n.f();
                        h();
                        throw th;
                    } catch (Throwable th2) {
                        this.c = n.f();
                        throw th2;
                    }
                }
            } catch (com.amazon.aps.iva.od0.j e2) {
                e2.a(this);
                throw e2;
            } catch (IOException e3) {
                com.amazon.aps.iva.od0.j jVar = new com.amazon.aps.iva.od0.j(e3.getMessage());
                jVar.a(this);
                throw jVar;
            }
        }
        if ((z3 ? 1 : 0) & true) {
            this.j = Collections.unmodifiableList(this.j);
        }
        if ((z3 ? 1 : 0) & true) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if ((z3 ? 1 : 0) & true) {
            this.i = Collections.unmodifiableList(this.i);
        }
        if ((z3 ? 1 : 0) & true) {
            this.l = Collections.unmodifiableList(this.l);
        }
        if ((z3 ? 1 : 0) & true) {
            this.q = Collections.unmodifiableList(this.q);
        }
        if ((z3 ? 1 : 0) & true) {
            this.r = Collections.unmodifiableList(this.r);
        }
        if ((z3 ? 1 : 0) & true) {
            this.s = Collections.unmodifiableList(this.s);
        }
        if ((z3 ? 1 : 0) & true) {
            this.t = Collections.unmodifiableList(this.t);
        }
        if ((z3 ? 1 : 0) & true) {
            this.u = Collections.unmodifiableList(this.u);
        }
        if ((z3 ? 1 : 0) & true) {
            this.v = Collections.unmodifiableList(this.v);
        }
        if ((z3 ? 1 : 0) & true) {
            this.n = Collections.unmodifiableList(this.n);
        }
        if ((z3 ? 1 : 0) & true) {
            this.o = Collections.unmodifiableList(this.o);
        }
        if ((z3 ? 1 : 0) & true) {
            this.A = Collections.unmodifiableList(this.A);
        }
        if ((z3 ? 1 : 0) & true) {
            this.C = Collections.unmodifiableList(this.C);
        }
        if ((z3 ? 1 : 0) & true) {
            this.D = Collections.unmodifiableList(this.D);
        }
        if ((z3 ? 1 : 0) & true) {
            this.G = Collections.unmodifiableList(this.G);
        }
        try {
            j.i();
        } catch (IOException unused2) {
            this.c = n.f();
            h();
        } catch (Throwable th3) {
            this.c = n.f();
            throw th3;
        }
    }
}
