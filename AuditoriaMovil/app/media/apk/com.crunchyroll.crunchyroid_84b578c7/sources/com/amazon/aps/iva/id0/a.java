package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.i;
import com.amazon.aps.iva.od0.p;
import com.google.android.gms.ads.AdRequest;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public final class a extends com.amazon.aps.iva.od0.h implements com.amazon.aps.iva.od0.q {
    public static final a h;
    public static final C0366a i = new C0366a();
    public final com.amazon.aps.iva.od0.c b;
    public int c;
    public int d;
    public List<b> e;
    public byte f;
    public int g;

    /* compiled from: ProtoBuf.java */
    /* renamed from: com.amazon.aps.iva.id0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0366a extends com.amazon.aps.iva.od0.b<a> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new a(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class c extends h.b<a, c> implements com.amazon.aps.iva.od0.q {
        public int c;
        public int d;
        public List<b> e = Collections.emptyList();

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
            a e = e();
            if (e.isInitialized()) {
                return e;
            }
            throw new com.amazon.aps.iva.od0.v();
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final c c() {
            c cVar = new c();
            cVar.f(e());
            return cVar;
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final Object clone() throws CloneNotSupportedException {
            c cVar = new c();
            cVar.f(e());
            return cVar;
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final /* bridge */ /* synthetic */ c d(a aVar) {
            f(aVar);
            return this;
        }

        public final a e() {
            a aVar = new a(this);
            int i = this.c;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            aVar.d = this.d;
            if ((i & 2) == 2) {
                this.e = Collections.unmodifiableList(this.e);
                this.c &= -3;
            }
            aVar.e = this.e;
            aVar.c = i2;
            return aVar;
        }

        public final void f(a aVar) {
            boolean z;
            if (aVar == a.h) {
                return;
            }
            if ((aVar.c & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i = aVar.d;
                this.c = 1 | this.c;
                this.d = i;
            }
            if (!aVar.e.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = aVar.e;
                    this.c &= -3;
                } else {
                    if ((this.c & 2) != 2) {
                        this.e = new ArrayList(this.e);
                        this.c |= 2;
                    }
                    this.e.addAll(aVar.e);
                }
            }
            this.b = this.b.d(aVar.b);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.a$a r0 = com.amazon.aps.iva.id0.a.i     // Catch: java.lang.Throwable -> Lc com.amazon.aps.iva.od0.j -> Le
                java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Lc com.amazon.aps.iva.od0.j -> Le
                com.amazon.aps.iva.id0.a r2 = (com.amazon.aps.iva.id0.a) r2     // Catch: java.lang.Throwable -> Lc com.amazon.aps.iva.od0.j -> Le
                r1.f(r2)
                return
            Lc:
                r2 = move-exception
                goto L16
            Le:
                r2 = move-exception
                com.amazon.aps.iva.od0.p r3 = r2.b     // Catch: java.lang.Throwable -> Lc
                com.amazon.aps.iva.id0.a r3 = (com.amazon.aps.iva.id0.a) r3     // Catch: java.lang.Throwable -> Lc
                throw r2     // Catch: java.lang.Throwable -> L14
            L14:
                r2 = move-exception
                goto L17
            L16:
                r3 = 0
            L17:
                if (r3 == 0) goto L1c
                r1.f(r3)
            L1c:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.a.c.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        a aVar = new a();
        h = aVar;
        aVar.d = 0;
        aVar.e = Collections.emptyList();
    }

    public a(h.b bVar) {
        super(0);
        this.f = (byte) -1;
        this.g = -1;
        this.b = bVar.b;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        if ((this.c & 1) == 1) {
            eVar.m(1, this.d);
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            eVar.o(2, this.e.get(i2));
        }
        eVar.r(this.b);
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i2;
        int i3 = this.g;
        if (i3 != -1) {
            return i3;
        }
        if ((this.c & 1) == 1) {
            i2 = com.amazon.aps.iva.od0.e.b(1, this.d) + 0;
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < this.e.size(); i4++) {
            i2 += com.amazon.aps.iva.od0.e.d(2, this.e.get(i4));
        }
        int size = this.b.size() + i2;
        this.g = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        boolean z;
        byte b2 = this.f;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.c & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            if (!this.e.get(i2).isInitialized()) {
                this.f = (byte) 0;
                return false;
            }
        }
        this.f = (byte) 1;
        return true;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final p.a newBuilderForType() {
        return new c();
    }

    @Override // com.amazon.aps.iva.od0.p
    public final p.a toBuilder() {
        c cVar = new c();
        cVar.f(this);
        return cVar;
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.od0.h implements com.amazon.aps.iva.od0.q {
        public static final b h;
        public static final C0367a i = new C0367a();
        public final com.amazon.aps.iva.od0.c b;
        public int c;
        public int d;
        public c e;
        public byte f;
        public int g;

        /* compiled from: ProtoBuf.java */
        /* renamed from: com.amazon.aps.iva.id0.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0367a extends com.amazon.aps.iva.od0.b<b> {
            @Override // com.amazon.aps.iva.od0.r
            public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
                return new b(dVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: com.amazon.aps.iva.id0.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0368b extends h.b<b, C0368b> implements com.amazon.aps.iva.od0.q {
            public int c;
            public int d;
            public c e = c.q;

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
            public final C0368b c() {
                C0368b c0368b = new C0368b();
                c0368b.f(e());
                return c0368b;
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final Object clone() throws CloneNotSupportedException {
                C0368b c0368b = new C0368b();
                c0368b.f(e());
                return c0368b;
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final /* bridge */ /* synthetic */ C0368b d(b bVar) {
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
                bVar.c = i2;
                return bVar;
            }

            public final void f(b bVar) {
                boolean z;
                c cVar;
                if (bVar == b.h) {
                    return;
                }
                int i = bVar.c;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i2 = bVar.d;
                    this.c |= 1;
                    this.d = i2;
                }
                if ((i & 2) == 2) {
                    z2 = true;
                }
                if (z2) {
                    c cVar2 = bVar.e;
                    if ((this.c & 2) == 2 && (cVar = this.e) != c.q) {
                        c.C0370b c0370b = new c.C0370b();
                        c0370b.f(cVar);
                        c0370b.f(cVar2);
                        this.e = c0370b.e();
                    } else {
                        this.e = cVar2;
                    }
                    this.c |= 2;
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
                    com.amazon.aps.iva.id0.a$b$a r0 = com.amazon.aps.iva.id0.a.b.i     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    com.amazon.aps.iva.id0.a$b r0 = new com.amazon.aps.iva.id0.a$b     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                    com.amazon.aps.iva.id0.a$b r3 = (com.amazon.aps.iva.id0.a.b) r3     // Catch: java.lang.Throwable -> L10
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
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.a.b.C0368b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
            }
        }

        static {
            b bVar = new b();
            h = bVar;
            bVar.d = 0;
            bVar.e = c.q;
        }

        public b(h.b bVar) {
            super(0);
            this.f = (byte) -1;
            this.g = -1;
            this.b = bVar.b;
        }

        @Override // com.amazon.aps.iva.od0.p
        public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
            getSerializedSize();
            if ((this.c & 1) == 1) {
                eVar.m(1, this.d);
            }
            if ((this.c & 2) == 2) {
                eVar.o(2, this.e);
            }
            eVar.r(this.b);
        }

        @Override // com.amazon.aps.iva.od0.p
        public final int getSerializedSize() {
            int i2 = this.g;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.c & 1) == 1) {
                i3 = 0 + com.amazon.aps.iva.od0.e.b(1, this.d);
            }
            if ((this.c & 2) == 2) {
                i3 += com.amazon.aps.iva.od0.e.d(2, this.e);
            }
            int size = this.b.size() + i3;
            this.g = size;
            return size;
        }

        @Override // com.amazon.aps.iva.od0.q
        public final boolean isInitialized() {
            boolean z;
            boolean z2;
            byte b = this.f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            int i2 = this.c;
            if ((i2 & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f = (byte) 0;
                return false;
            }
            if ((i2 & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                this.f = (byte) 0;
                return false;
            } else if (!this.e.isInitialized()) {
                this.f = (byte) 0;
                return false;
            } else {
                this.f = (byte) 1;
                return true;
            }
        }

        @Override // com.amazon.aps.iva.od0.p
        public final p.a newBuilderForType() {
            return new C0368b();
        }

        @Override // com.amazon.aps.iva.od0.p
        public final p.a toBuilder() {
            C0368b c0368b = new C0368b();
            c0368b.f(this);
            return c0368b;
        }

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes4.dex */
        public static final class c extends com.amazon.aps.iva.od0.h implements com.amazon.aps.iva.od0.q {
            public static final c q;
            public static final C0369a r = new C0369a();
            public final com.amazon.aps.iva.od0.c b;
            public int c;
            public EnumC0371c d;
            public long e;
            public float f;
            public double g;
            public int h;
            public int i;
            public int j;
            public a k;
            public List<c> l;
            public int m;
            public int n;
            public byte o;
            public int p;

            /* compiled from: ProtoBuf.java */
            /* renamed from: com.amazon.aps.iva.id0.a$b$c$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static class C0369a extends com.amazon.aps.iva.od0.b<c> {
                @Override // com.amazon.aps.iva.od0.r
                public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
                    return new c(dVar, fVar);
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: com.amazon.aps.iva.id0.a$b$c$b  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0370b extends h.b<c, C0370b> implements com.amazon.aps.iva.od0.q {
                public int c;
                public long e;
                public float f;
                public double g;
                public int h;
                public int i;
                public int j;
                public int m;
                public int n;
                public EnumC0371c d = EnumC0371c.BYTE;
                public a k = a.h;
                public List<c> l = Collections.emptyList();

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
                    c e = e();
                    if (e.isInitialized()) {
                        return e;
                    }
                    throw new com.amazon.aps.iva.od0.v();
                }

                @Override // com.amazon.aps.iva.od0.h.b
                public final C0370b c() {
                    C0370b c0370b = new C0370b();
                    c0370b.f(e());
                    return c0370b;
                }

                @Override // com.amazon.aps.iva.od0.h.b
                public final Object clone() throws CloneNotSupportedException {
                    C0370b c0370b = new C0370b();
                    c0370b.f(e());
                    return c0370b;
                }

                @Override // com.amazon.aps.iva.od0.h.b
                public final /* bridge */ /* synthetic */ C0370b d(c cVar) {
                    f(cVar);
                    return this;
                }

                public final c e() {
                    c cVar = new c(this);
                    int i = this.c;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    cVar.d = this.d;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    cVar.e = this.e;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    cVar.f = this.f;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    cVar.g = this.g;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    cVar.h = this.h;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    cVar.i = this.i;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    cVar.j = this.j;
                    if ((i & 128) == 128) {
                        i2 |= 128;
                    }
                    cVar.k = this.k;
                    if ((i & 256) == 256) {
                        this.l = Collections.unmodifiableList(this.l);
                        this.c &= -257;
                    }
                    cVar.l = this.l;
                    if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                        i2 |= 256;
                    }
                    cVar.m = this.m;
                    if ((i & 1024) == 1024) {
                        i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                    }
                    cVar.n = this.n;
                    cVar.c = i2;
                    return cVar;
                }

                public final void f(c cVar) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    boolean z5;
                    boolean z6;
                    boolean z7;
                    boolean z8;
                    boolean z9;
                    a aVar;
                    if (cVar == c.q) {
                        return;
                    }
                    boolean z10 = true;
                    if ((cVar.c & 1) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        EnumC0371c enumC0371c = cVar.d;
                        enumC0371c.getClass();
                        this.c |= 1;
                        this.d = enumC0371c;
                    }
                    int i = cVar.c;
                    if ((i & 2) == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        long j = cVar.e;
                        this.c |= 2;
                        this.e = j;
                    }
                    if ((i & 4) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        float f = cVar.f;
                        this.c = 4 | this.c;
                        this.f = f;
                    }
                    if ((i & 8) == 8) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        double d = cVar.g;
                        this.c |= 8;
                        this.g = d;
                    }
                    if ((i & 16) == 16) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        int i2 = cVar.h;
                        this.c = 16 | this.c;
                        this.h = i2;
                    }
                    if ((i & 32) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        int i3 = cVar.i;
                        this.c = 32 | this.c;
                        this.i = i3;
                    }
                    if ((i & 64) == 64) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        int i4 = cVar.j;
                        this.c = 64 | this.c;
                        this.j = i4;
                    }
                    if ((i & 128) == 128) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        a aVar2 = cVar.k;
                        if ((this.c & 128) == 128 && (aVar = this.k) != a.h) {
                            c cVar2 = new c();
                            cVar2.f(aVar);
                            cVar2.f(aVar2);
                            this.k = cVar2.e();
                        } else {
                            this.k = aVar2;
                        }
                        this.c |= 128;
                    }
                    if (!cVar.l.isEmpty()) {
                        if (this.l.isEmpty()) {
                            this.l = cVar.l;
                            this.c &= -257;
                        } else {
                            if ((this.c & 256) != 256) {
                                this.l = new ArrayList(this.l);
                                this.c |= 256;
                            }
                            this.l.addAll(cVar.l);
                        }
                    }
                    int i5 = cVar.c;
                    if ((i5 & 256) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        int i6 = cVar.m;
                        this.c |= AdRequest.MAX_CONTENT_URL_LENGTH;
                        this.m = i6;
                    }
                    if ((i5 & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                        z10 = false;
                    }
                    if (z10) {
                        int i7 = cVar.n;
                        this.c |= 1024;
                        this.n = i7;
                    }
                    this.b = this.b.d(cVar.b);
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void g(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
                    /*
                        r1 = this;
                        com.amazon.aps.iva.id0.a$b$c$a r0 = com.amazon.aps.iva.id0.a.b.c.r     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                        r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                        com.amazon.aps.iva.id0.a$b$c r0 = new com.amazon.aps.iva.id0.a$b$c     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                        com.amazon.aps.iva.id0.a$b$c r3 = (com.amazon.aps.iva.id0.a.b.c) r3     // Catch: java.lang.Throwable -> L10
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
                    throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.a.b.c.C0370b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: com.amazon.aps.iva.id0.a$b$c$c  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public enum EnumC0371c implements i.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                
                private static i.b<EnumC0371c> internalValueMap = new C0372a();
                private final int value;

                /* compiled from: ProtoBuf.java */
                /* renamed from: com.amazon.aps.iva.id0.a$b$c$c$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static class C0372a implements i.b<EnumC0371c> {
                    @Override // com.amazon.aps.iva.od0.i.b
                    public final EnumC0371c findValueByNumber(int i) {
                        return EnumC0371c.valueOf(i);
                    }
                }

                EnumC0371c(int i, int i2) {
                    this.value = i2;
                }

                @Override // com.amazon.aps.iva.od0.i.a
                public final int getNumber() {
                    return this.value;
                }

                public static EnumC0371c valueOf(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }
            }

            static {
                c cVar = new c();
                q = cVar;
                cVar.d();
            }

            public c(h.b bVar) {
                super(0);
                this.o = (byte) -1;
                this.p = -1;
                this.b = bVar.b;
            }

            @Override // com.amazon.aps.iva.od0.p
            public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
                getSerializedSize();
                if ((this.c & 1) == 1) {
                    eVar.l(1, this.d.getNumber());
                }
                if ((this.c & 2) == 2) {
                    long j = this.e;
                    eVar.x(2, 0);
                    eVar.w((j >> 63) ^ (j << 1));
                }
                if ((this.c & 4) == 4) {
                    float f = this.f;
                    eVar.x(3, 5);
                    eVar.t(Float.floatToRawIntBits(f));
                }
                if ((this.c & 8) == 8) {
                    double d = this.g;
                    eVar.x(4, 1);
                    eVar.u(Double.doubleToRawLongBits(d));
                }
                if ((this.c & 16) == 16) {
                    eVar.m(5, this.h);
                }
                if ((this.c & 32) == 32) {
                    eVar.m(6, this.i);
                }
                if ((this.c & 64) == 64) {
                    eVar.m(7, this.j);
                }
                if ((this.c & 128) == 128) {
                    eVar.o(8, this.k);
                }
                for (int i = 0; i < this.l.size(); i++) {
                    eVar.o(9, this.l.get(i));
                }
                if ((this.c & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    eVar.m(10, this.n);
                }
                if ((this.c & 256) == 256) {
                    eVar.m(11, this.m);
                }
                eVar.r(this.b);
            }

            public final void d() {
                this.d = EnumC0371c.BYTE;
                this.e = 0L;
                this.f = 0.0f;
                this.g = 0.0d;
                this.h = 0;
                this.i = 0;
                this.j = 0;
                this.k = a.h;
                this.l = Collections.emptyList();
                this.m = 0;
                this.n = 0;
            }

            @Override // com.amazon.aps.iva.od0.p
            public final int getSerializedSize() {
                int i;
                int i2 = this.p;
                if (i2 != -1) {
                    return i2;
                }
                if ((this.c & 1) == 1) {
                    i = com.amazon.aps.iva.od0.e.a(1, this.d.getNumber()) + 0;
                } else {
                    i = 0;
                }
                if ((this.c & 2) == 2) {
                    long j = this.e;
                    i += com.amazon.aps.iva.od0.e.g((j >> 63) ^ (j << 1)) + com.amazon.aps.iva.od0.e.h(2);
                }
                if ((this.c & 4) == 4) {
                    i += com.amazon.aps.iva.od0.e.h(3) + 4;
                }
                if ((this.c & 8) == 8) {
                    i += com.amazon.aps.iva.od0.e.h(4) + 8;
                }
                if ((this.c & 16) == 16) {
                    i += com.amazon.aps.iva.od0.e.b(5, this.h);
                }
                if ((this.c & 32) == 32) {
                    i += com.amazon.aps.iva.od0.e.b(6, this.i);
                }
                if ((this.c & 64) == 64) {
                    i += com.amazon.aps.iva.od0.e.b(7, this.j);
                }
                if ((this.c & 128) == 128) {
                    i += com.amazon.aps.iva.od0.e.d(8, this.k);
                }
                for (int i3 = 0; i3 < this.l.size(); i3++) {
                    i += com.amazon.aps.iva.od0.e.d(9, this.l.get(i3));
                }
                if ((this.c & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    i += com.amazon.aps.iva.od0.e.b(10, this.n);
                }
                if ((this.c & 256) == 256) {
                    i += com.amazon.aps.iva.od0.e.b(11, this.m);
                }
                int size = this.b.size() + i;
                this.p = size;
                return size;
            }

            @Override // com.amazon.aps.iva.od0.q
            public final boolean isInitialized() {
                boolean z;
                byte b = this.o;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if ((this.c & 128) == 128) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !this.k.isInitialized()) {
                    this.o = (byte) 0;
                    return false;
                }
                for (int i = 0; i < this.l.size(); i++) {
                    if (!this.l.get(i).isInitialized()) {
                        this.o = (byte) 0;
                        return false;
                    }
                }
                this.o = (byte) 1;
                return true;
            }

            @Override // com.amazon.aps.iva.od0.p
            public final p.a newBuilderForType() {
                return new C0370b();
            }

            @Override // com.amazon.aps.iva.od0.p
            public final p.a toBuilder() {
                C0370b c0370b = new C0370b();
                c0370b.f(this);
                return c0370b;
            }

            public c() {
                this.o = (byte) -1;
                this.p = -1;
                this.b = com.amazon.aps.iva.od0.c.b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public c(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
                c cVar;
                this.o = (byte) -1;
                this.p = -1;
                d();
                com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(new c.b(), 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        try {
                            int n = dVar.n();
                            switch (n) {
                                case 0:
                                    break;
                                case 8:
                                    int k = dVar.k();
                                    EnumC0371c valueOf = EnumC0371c.valueOf(k);
                                    if (valueOf == null) {
                                        j.v(n);
                                        j.v(k);
                                    } else {
                                        this.c |= 1;
                                        this.d = valueOf;
                                        continue;
                                    }
                                case 16:
                                    this.c |= 2;
                                    long l = dVar.l();
                                    this.e = (-(l & 1)) ^ (l >>> 1);
                                    continue;
                                case 29:
                                    this.c |= 4;
                                    this.f = Float.intBitsToFloat(dVar.i());
                                    continue;
                                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                                    this.c |= 8;
                                    this.g = Double.longBitsToDouble(dVar.j());
                                    continue;
                                case 40:
                                    this.c |= 16;
                                    this.h = dVar.k();
                                    continue;
                                case 48:
                                    this.c |= 32;
                                    this.i = dVar.k();
                                    continue;
                                case 56:
                                    this.c |= 64;
                                    this.j = dVar.k();
                                    continue;
                                case 66:
                                    if ((this.c & 128) == 128) {
                                        a aVar = this.k;
                                        aVar.getClass();
                                        cVar = new c();
                                        cVar.f(aVar);
                                    } else {
                                        cVar = null;
                                    }
                                    a aVar2 = (a) dVar.g(a.i, fVar);
                                    this.k = aVar2;
                                    if (cVar != null) {
                                        cVar.f(aVar2);
                                        this.k = cVar.e();
                                    }
                                    this.c |= 128;
                                    continue;
                                case 74:
                                    if (!(z2 & true)) {
                                        this.l = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.l.add(dVar.g(r, fVar));
                                    continue;
                                case 80:
                                    this.c |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    this.n = dVar.k();
                                    continue;
                                case 88:
                                    this.c |= 256;
                                    this.m = dVar.k();
                                    continue;
                                default:
                                    if (!dVar.q(n, j)) {
                                        break;
                                    } else {
                                        continue;
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
                        if (z2 & true) {
                            this.l = Collections.unmodifiableList(this.l);
                        }
                        try {
                            j.i();
                        } catch (IOException unused) {
                            throw th;
                        } finally {
                        }
                    }
                }
                if (z2 & true) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                try {
                    j.i();
                } catch (IOException unused2) {
                } finally {
                }
            }
        }

        public b() {
            this.f = (byte) -1;
            this.g = -1;
            this.b = com.amazon.aps.iva.od0.c.b;
        }

        public b(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            c.C0370b c0370b;
            this.f = (byte) -1;
            this.g = -1;
            boolean z = false;
            this.d = 0;
            this.e = c.q;
            c.b bVar = new c.b();
            com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(bVar, 1);
            while (!z) {
                try {
                    try {
                        try {
                            int n = dVar.n();
                            if (n != 0) {
                                if (n == 8) {
                                    this.c |= 1;
                                    this.d = dVar.k();
                                } else if (n != 18) {
                                    if (!dVar.q(n, j)) {
                                    }
                                } else {
                                    if ((this.c & 2) == 2) {
                                        c cVar = this.e;
                                        cVar.getClass();
                                        c0370b = new c.C0370b();
                                        c0370b.f(cVar);
                                    } else {
                                        c0370b = null;
                                    }
                                    c cVar2 = (c) dVar.g(c.r, fVar);
                                    this.e = cVar2;
                                    if (c0370b != null) {
                                        c0370b.f(cVar2);
                                        this.e = c0370b.e();
                                    }
                                    this.c |= 2;
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            com.amazon.aps.iva.od0.j jVar = new com.amazon.aps.iva.od0.j(e.getMessage());
                            jVar.b = this;
                            throw jVar;
                        }
                    } catch (com.amazon.aps.iva.od0.j e2) {
                        e2.b = this;
                        throw e2;
                    }
                } catch (Throwable th) {
                    try {
                        j.i();
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
                j.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.b = bVar.f();
                throw th3;
            }
            this.b = bVar.f();
        }
    }

    public a() {
        this.f = (byte) -1;
        this.g = -1;
        this.b = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        this.f = (byte) -1;
        this.g = -1;
        boolean z = false;
        this.d = 0;
        this.e = Collections.emptyList();
        com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(new c.b(), 1);
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int n = dVar.n();
                    if (n != 0) {
                        if (n == 8) {
                            this.c |= 1;
                            this.d = dVar.k();
                        } else if (n != 18) {
                            if (!dVar.q(n, j)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.e = new ArrayList();
                                z2 |= true;
                            }
                            this.e.add(dVar.g(b.i, fVar));
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
                        throw th;
                    } finally {
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
        } finally {
        }
    }
}
