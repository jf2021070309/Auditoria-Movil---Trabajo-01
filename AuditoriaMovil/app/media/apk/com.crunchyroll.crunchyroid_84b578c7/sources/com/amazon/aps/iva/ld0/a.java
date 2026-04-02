package com.amazon.aps.iva.ld0;

import com.amazon.aps.iva.id0.k;
import com.amazon.aps.iva.id0.m;
import com.amazon.aps.iva.id0.p;
import com.amazon.aps.iva.id0.r;
import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.e;
import com.amazon.aps.iva.od0.f;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.i;
import com.amazon.aps.iva.od0.j;
import com.amazon.aps.iva.od0.o;
import com.amazon.aps.iva.od0.p;
import com.amazon.aps.iva.od0.q;
import com.amazon.aps.iva.od0.v;
import com.amazon.aps.iva.od0.y;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.codec.binary.Hex;
/* compiled from: JvmProtoBuf.java */
/* loaded from: classes4.dex */
public final class a {
    public static final h.f<com.amazon.aps.iva.id0.c, b> a;
    public static final h.f<com.amazon.aps.iva.id0.h, b> b;
    public static final h.f<com.amazon.aps.iva.id0.h, Integer> c;
    public static final h.f<m, c> d;
    public static final h.f<m, Integer> e;
    public static final h.f<p, List<com.amazon.aps.iva.id0.a>> f;
    public static final h.f<p, Boolean> g;
    public static final h.f<r, List<com.amazon.aps.iva.id0.a>> h;
    public static final h.f<com.amazon.aps.iva.id0.b, Integer> i;
    public static final h.f<com.amazon.aps.iva.id0.b, List<m>> j;
    public static final h.f<com.amazon.aps.iva.id0.b, Integer> k;
    public static final h.f<com.amazon.aps.iva.id0.b, Integer> l;
    public static final h.f<k, Integer> m;
    public static final h.f<k, List<m>> n;

    static {
        com.amazon.aps.iva.id0.c cVar = com.amazon.aps.iva.id0.c.j;
        b bVar = b.h;
        y yVar = y.MESSAGE;
        a = h.c(cVar, bVar, bVar, 100, yVar, b.class);
        com.amazon.aps.iva.id0.h hVar = com.amazon.aps.iva.id0.h.v;
        b = h.c(hVar, bVar, bVar, 100, yVar, b.class);
        y yVar2 = y.INT32;
        c = h.c(hVar, 0, null, 101, yVar2, Integer.class);
        m mVar = m.v;
        c cVar2 = c.k;
        d = h.c(mVar, cVar2, cVar2, 100, yVar, c.class);
        e = h.c(mVar, 0, null, 101, yVar2, Integer.class);
        p pVar = p.u;
        com.amazon.aps.iva.id0.a aVar = com.amazon.aps.iva.id0.a.h;
        f = h.b(pVar, aVar, 100, yVar, com.amazon.aps.iva.id0.a.class);
        g = h.c(pVar, Boolean.FALSE, null, 101, y.BOOL, Boolean.class);
        h = h.b(r.n, aVar, 100, yVar, com.amazon.aps.iva.id0.a.class);
        com.amazon.aps.iva.id0.b bVar2 = com.amazon.aps.iva.id0.b.K;
        i = h.c(bVar2, 0, null, 101, yVar2, Integer.class);
        j = h.b(bVar2, mVar, MediaError.DetailedErrorCode.MEDIA_DECODE, yVar, m.class);
        k = h.c(bVar2, 0, null, MediaError.DetailedErrorCode.MEDIA_NETWORK, yVar2, Integer.class);
        l = h.c(bVar2, 0, null, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED, yVar2, Integer.class);
        k kVar = k.l;
        m = h.c(kVar, 0, null, 101, yVar2, Integer.class);
        n = h.b(kVar, mVar, MediaError.DetailedErrorCode.MEDIA_DECODE, yVar, m.class);
    }

    /* compiled from: JvmProtoBuf.java */
    /* renamed from: com.amazon.aps.iva.ld0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0478a extends h implements q {
        public static final C0478a h;
        public static final C0479a i = new C0479a();
        public final com.amazon.aps.iva.od0.c b;
        public int c;
        public int d;
        public int e;
        public byte f;
        public int g;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: com.amazon.aps.iva.ld0.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0479a extends com.amazon.aps.iva.od0.b<C0478a> {
            @Override // com.amazon.aps.iva.od0.r
            public final Object a(com.amazon.aps.iva.od0.d dVar, f fVar) throws j {
                return new C0478a(dVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: com.amazon.aps.iva.ld0.a$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends h.b<C0478a, b> implements q {
            public int c;
            public int d;
            public int e;

            @Override // com.amazon.aps.iva.od0.a.AbstractC0569a, com.amazon.aps.iva.od0.p.a
            public final /* bridge */ /* synthetic */ p.a D(com.amazon.aps.iva.od0.d dVar, f fVar) throws IOException {
                g(dVar, fVar);
                return this;
            }

            @Override // com.amazon.aps.iva.od0.a.AbstractC0569a
            public final /* bridge */ /* synthetic */ a.AbstractC0569a b(com.amazon.aps.iva.od0.d dVar, f fVar) throws IOException {
                g(dVar, fVar);
                return this;
            }

            @Override // com.amazon.aps.iva.od0.p.a
            public final com.amazon.aps.iva.od0.p build() {
                C0478a e = e();
                if (e.isInitialized()) {
                    return e;
                }
                throw new v();
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final b c() {
                b bVar = new b();
                bVar.f(e());
                return bVar;
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final Object clone() throws CloneNotSupportedException {
                b bVar = new b();
                bVar.f(e());
                return bVar;
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final /* bridge */ /* synthetic */ b d(C0478a c0478a) {
                f(c0478a);
                return this;
            }

            public final C0478a e() {
                C0478a c0478a = new C0478a(this);
                int i = this.c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                c0478a.d = this.d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                c0478a.e = this.e;
                c0478a.c = i2;
                return c0478a;
            }

            public final void f(C0478a c0478a) {
                boolean z;
                if (c0478a == C0478a.h) {
                    return;
                }
                int i = c0478a.c;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i2 = c0478a.d;
                    this.c |= 1;
                    this.d = i2;
                }
                if ((i & 2) == 2) {
                    z2 = true;
                }
                if (z2) {
                    int i3 = c0478a.e;
                    this.c = 2 | this.c;
                    this.e = i3;
                }
                this.b = this.b.d(c0478a.b);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void g(com.amazon.aps.iva.od0.d r1, com.amazon.aps.iva.od0.f r2) throws java.io.IOException {
                /*
                    r0 = this;
                    com.amazon.aps.iva.ld0.a$a$a r2 = com.amazon.aps.iva.ld0.a.C0478a.i     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    r2.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    com.amazon.aps.iva.ld0.a$a r2 = new com.amazon.aps.iva.ld0.a$a     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    r2.<init>(r1)     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    r0.f(r2)
                    return
                Le:
                    r1 = move-exception
                    goto L12
                L10:
                    r1 = move-exception
                    goto L19
                L12:
                    com.amazon.aps.iva.od0.p r2 = r1.b     // Catch: java.lang.Throwable -> L10
                    com.amazon.aps.iva.ld0.a$a r2 = (com.amazon.aps.iva.ld0.a.C0478a) r2     // Catch: java.lang.Throwable -> L10
                    throw r1     // Catch: java.lang.Throwable -> L17
                L17:
                    r1 = move-exception
                    goto L1a
                L19:
                    r2 = 0
                L1a:
                    if (r2 == 0) goto L1f
                    r0.f(r2)
                L1f:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ld0.a.C0478a.b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
            }
        }

        static {
            C0478a c0478a = new C0478a();
            h = c0478a;
            c0478a.d = 0;
            c0478a.e = 0;
        }

        public C0478a(h.b bVar) {
            super(0);
            this.f = (byte) -1;
            this.g = -1;
            this.b = bVar.b;
        }

        @Override // com.amazon.aps.iva.od0.p
        public final void a(e eVar) throws IOException {
            getSerializedSize();
            if ((this.c & 1) == 1) {
                eVar.m(1, this.d);
            }
            if ((this.c & 2) == 2) {
                eVar.m(2, this.e);
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
                i3 = 0 + e.b(1, this.d);
            }
            if ((this.c & 2) == 2) {
                i3 += e.b(2, this.e);
            }
            int size = this.b.size() + i3;
            this.g = size;
            return size;
        }

        @Override // com.amazon.aps.iva.od0.q
        public final boolean isInitialized() {
            byte b2 = this.f;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f = (byte) 1;
            return true;
        }

        @Override // com.amazon.aps.iva.od0.p
        public final p.a newBuilderForType() {
            return new b();
        }

        @Override // com.amazon.aps.iva.od0.p
        public final p.a toBuilder() {
            b bVar = new b();
            bVar.f(this);
            return bVar;
        }

        public C0478a() {
            this.f = (byte) -1;
            this.g = -1;
            this.b = com.amazon.aps.iva.od0.c.b;
        }

        public C0478a(com.amazon.aps.iva.od0.d dVar) throws j {
            this.f = (byte) -1;
            this.g = -1;
            boolean z = false;
            this.d = 0;
            this.e = 0;
            c.b bVar = new c.b();
            e j = e.j(bVar, 1);
            while (!z) {
                try {
                    try {
                        int n = dVar.n();
                        if (n != 0) {
                            if (n == 8) {
                                this.c |= 1;
                                this.d = dVar.k();
                            } else if (n != 16) {
                                if (!dVar.q(n, j)) {
                                }
                            } else {
                                this.c |= 2;
                                this.e = dVar.k();
                            }
                        }
                        z = true;
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
                } catch (j e) {
                    e.b = this;
                    throw e;
                } catch (IOException e2) {
                    j jVar = new j(e2.getMessage());
                    jVar.b = this;
                    throw jVar;
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

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h implements q {
        public static final b h;
        public static final C0480a i = new C0480a();
        public final com.amazon.aps.iva.od0.c b;
        public int c;
        public int d;
        public int e;
        public byte f;
        public int g;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: com.amazon.aps.iva.ld0.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0480a extends com.amazon.aps.iva.od0.b<b> {
            @Override // com.amazon.aps.iva.od0.r
            public final Object a(com.amazon.aps.iva.od0.d dVar, f fVar) throws j {
                return new b(dVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: com.amazon.aps.iva.ld0.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0481b extends h.b<b, C0481b> implements q {
            public int c;
            public int d;
            public int e;

            @Override // com.amazon.aps.iva.od0.a.AbstractC0569a, com.amazon.aps.iva.od0.p.a
            public final /* bridge */ /* synthetic */ p.a D(com.amazon.aps.iva.od0.d dVar, f fVar) throws IOException {
                g(dVar, fVar);
                return this;
            }

            @Override // com.amazon.aps.iva.od0.a.AbstractC0569a
            public final /* bridge */ /* synthetic */ a.AbstractC0569a b(com.amazon.aps.iva.od0.d dVar, f fVar) throws IOException {
                g(dVar, fVar);
                return this;
            }

            @Override // com.amazon.aps.iva.od0.p.a
            public final com.amazon.aps.iva.od0.p build() {
                b e = e();
                if (e.isInitialized()) {
                    return e;
                }
                throw new v();
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final C0481b c() {
                C0481b c0481b = new C0481b();
                c0481b.f(e());
                return c0481b;
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final Object clone() throws CloneNotSupportedException {
                C0481b c0481b = new C0481b();
                c0481b.f(e());
                return c0481b;
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final /* bridge */ /* synthetic */ C0481b d(b bVar) {
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
                    int i3 = bVar.e;
                    this.c = 2 | this.c;
                    this.e = i3;
                }
                this.b = this.b.d(bVar.b);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void g(com.amazon.aps.iva.od0.d r1, com.amazon.aps.iva.od0.f r2) throws java.io.IOException {
                /*
                    r0 = this;
                    com.amazon.aps.iva.ld0.a$b$a r2 = com.amazon.aps.iva.ld0.a.b.i     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    r2.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    com.amazon.aps.iva.ld0.a$b r2 = new com.amazon.aps.iva.ld0.a$b     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    r2.<init>(r1)     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    r0.f(r2)
                    return
                Le:
                    r1 = move-exception
                    goto L12
                L10:
                    r1 = move-exception
                    goto L19
                L12:
                    com.amazon.aps.iva.od0.p r2 = r1.b     // Catch: java.lang.Throwable -> L10
                    com.amazon.aps.iva.ld0.a$b r2 = (com.amazon.aps.iva.ld0.a.b) r2     // Catch: java.lang.Throwable -> L10
                    throw r1     // Catch: java.lang.Throwable -> L17
                L17:
                    r1 = move-exception
                    goto L1a
                L19:
                    r2 = 0
                L1a:
                    if (r2 == 0) goto L1f
                    r0.f(r2)
                L1f:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ld0.a.b.C0481b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
            }
        }

        static {
            b bVar = new b();
            h = bVar;
            bVar.d = 0;
            bVar.e = 0;
        }

        public b(h.b bVar) {
            super(0);
            this.f = (byte) -1;
            this.g = -1;
            this.b = bVar.b;
        }

        public static C0481b d(b bVar) {
            C0481b c0481b = new C0481b();
            c0481b.f(bVar);
            return c0481b;
        }

        @Override // com.amazon.aps.iva.od0.p
        public final void a(e eVar) throws IOException {
            getSerializedSize();
            if ((this.c & 1) == 1) {
                eVar.m(1, this.d);
            }
            if ((this.c & 2) == 2) {
                eVar.m(2, this.e);
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
                i3 = 0 + e.b(1, this.d);
            }
            if ((this.c & 2) == 2) {
                i3 += e.b(2, this.e);
            }
            int size = this.b.size() + i3;
            this.g = size;
            return size;
        }

        @Override // com.amazon.aps.iva.od0.q
        public final boolean isInitialized() {
            byte b = this.f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f = (byte) 1;
            return true;
        }

        @Override // com.amazon.aps.iva.od0.p
        public final p.a newBuilderForType() {
            return new C0481b();
        }

        @Override // com.amazon.aps.iva.od0.p
        public final p.a toBuilder() {
            return d(this);
        }

        public b() {
            this.f = (byte) -1;
            this.g = -1;
            this.b = com.amazon.aps.iva.od0.c.b;
        }

        public b(com.amazon.aps.iva.od0.d dVar) throws j {
            this.f = (byte) -1;
            this.g = -1;
            boolean z = false;
            this.d = 0;
            this.e = 0;
            c.b bVar = new c.b();
            e j = e.j(bVar, 1);
            while (!z) {
                try {
                    try {
                        int n = dVar.n();
                        if (n != 0) {
                            if (n == 8) {
                                this.c |= 1;
                                this.d = dVar.k();
                            } else if (n != 16) {
                                if (!dVar.q(n, j)) {
                                }
                            } else {
                                this.c |= 2;
                                this.e = dVar.k();
                            }
                        }
                        z = true;
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
                } catch (j e) {
                    e.b = this;
                    throw e;
                } catch (IOException e2) {
                    j jVar = new j(e2.getMessage());
                    jVar.b = this;
                    throw jVar;
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

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class c extends h implements q {
        public static final c k;
        public static final C0482a l = new C0482a();
        public final com.amazon.aps.iva.od0.c b;
        public int c;
        public C0478a d;
        public b e;
        public b f;
        public b g;
        public b h;
        public byte i;
        public int j;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: com.amazon.aps.iva.ld0.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0482a extends com.amazon.aps.iva.od0.b<c> {
            @Override // com.amazon.aps.iva.od0.r
            public final Object a(com.amazon.aps.iva.od0.d dVar, f fVar) throws j {
                return new c(dVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* loaded from: classes4.dex */
        public static final class b extends h.b<c, b> implements q {
            public int c;
            public C0478a d = C0478a.h;
            public b e;
            public b f;
            public b g;
            public b h;

            public b() {
                b bVar = b.h;
                this.e = bVar;
                this.f = bVar;
                this.g = bVar;
                this.h = bVar;
            }

            @Override // com.amazon.aps.iva.od0.a.AbstractC0569a, com.amazon.aps.iva.od0.p.a
            public final /* bridge */ /* synthetic */ p.a D(com.amazon.aps.iva.od0.d dVar, f fVar) throws IOException {
                g(dVar, fVar);
                return this;
            }

            @Override // com.amazon.aps.iva.od0.a.AbstractC0569a
            public final /* bridge */ /* synthetic */ a.AbstractC0569a b(com.amazon.aps.iva.od0.d dVar, f fVar) throws IOException {
                g(dVar, fVar);
                return this;
            }

            @Override // com.amazon.aps.iva.od0.p.a
            public final com.amazon.aps.iva.od0.p build() {
                c e = e();
                if (e.isInitialized()) {
                    return e;
                }
                throw new v();
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final b c() {
                b bVar = new b();
                bVar.f(e());
                return bVar;
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final Object clone() throws CloneNotSupportedException {
                b bVar = new b();
                bVar.f(e());
                return bVar;
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final /* bridge */ /* synthetic */ b d(c cVar) {
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
                cVar.c = i2;
                return cVar;
            }

            public final void f(c cVar) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                b bVar;
                b bVar2;
                b bVar3;
                b bVar4;
                C0478a c0478a;
                if (cVar == c.k) {
                    return;
                }
                boolean z5 = true;
                if ((cVar.c & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C0478a c0478a2 = cVar.d;
                    if ((this.c & 1) == 1 && (c0478a = this.d) != C0478a.h) {
                        C0478a.b bVar5 = new C0478a.b();
                        bVar5.f(c0478a);
                        bVar5.f(c0478a2);
                        this.d = bVar5.e();
                    } else {
                        this.d = c0478a2;
                    }
                    this.c |= 1;
                }
                if ((cVar.c & 2) == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    b bVar6 = cVar.e;
                    if ((this.c & 2) == 2 && (bVar4 = this.e) != b.h) {
                        b.C0481b d = b.d(bVar4);
                        d.f(bVar6);
                        this.e = d.e();
                    } else {
                        this.e = bVar6;
                    }
                    this.c |= 2;
                }
                if ((cVar.c & 4) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    b bVar7 = cVar.f;
                    if ((this.c & 4) == 4 && (bVar3 = this.f) != b.h) {
                        b.C0481b d2 = b.d(bVar3);
                        d2.f(bVar7);
                        this.f = d2.e();
                    } else {
                        this.f = bVar7;
                    }
                    this.c |= 4;
                }
                if ((cVar.c & 8) == 8) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    b bVar8 = cVar.g;
                    if ((this.c & 8) == 8 && (bVar2 = this.g) != b.h) {
                        b.C0481b d3 = b.d(bVar2);
                        d3.f(bVar8);
                        this.g = d3.e();
                    } else {
                        this.g = bVar8;
                    }
                    this.c |= 8;
                }
                if ((cVar.c & 16) != 16) {
                    z5 = false;
                }
                if (z5) {
                    b bVar9 = cVar.h;
                    if ((this.c & 16) == 16 && (bVar = this.h) != b.h) {
                        b.C0481b d4 = b.d(bVar);
                        d4.f(bVar9);
                        this.h = d4.e();
                    } else {
                        this.h = bVar9;
                    }
                    this.c |= 16;
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
                    com.amazon.aps.iva.ld0.a$c$a r0 = com.amazon.aps.iva.ld0.a.c.l     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    com.amazon.aps.iva.ld0.a$c r0 = new com.amazon.aps.iva.ld0.a$c     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                    com.amazon.aps.iva.ld0.a$c r3 = (com.amazon.aps.iva.ld0.a.c) r3     // Catch: java.lang.Throwable -> L10
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
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ld0.a.c.b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
            }
        }

        static {
            c cVar = new c();
            k = cVar;
            cVar.d = C0478a.h;
            b bVar = b.h;
            cVar.e = bVar;
            cVar.f = bVar;
            cVar.g = bVar;
            cVar.h = bVar;
        }

        public c(h.b bVar) {
            super(0);
            this.i = (byte) -1;
            this.j = -1;
            this.b = bVar.b;
        }

        @Override // com.amazon.aps.iva.od0.p
        public final void a(e eVar) throws IOException {
            getSerializedSize();
            if ((this.c & 1) == 1) {
                eVar.o(1, this.d);
            }
            if ((this.c & 2) == 2) {
                eVar.o(2, this.e);
            }
            if ((this.c & 4) == 4) {
                eVar.o(3, this.f);
            }
            if ((this.c & 8) == 8) {
                eVar.o(4, this.g);
            }
            if ((this.c & 16) == 16) {
                eVar.o(5, this.h);
            }
            eVar.r(this.b);
        }

        @Override // com.amazon.aps.iva.od0.p
        public final int getSerializedSize() {
            int i = this.j;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.c & 1) == 1) {
                i2 = 0 + e.d(1, this.d);
            }
            if ((this.c & 2) == 2) {
                i2 += e.d(2, this.e);
            }
            if ((this.c & 4) == 4) {
                i2 += e.d(3, this.f);
            }
            if ((this.c & 8) == 8) {
                i2 += e.d(4, this.g);
            }
            if ((this.c & 16) == 16) {
                i2 += e.d(5, this.h);
            }
            int size = this.b.size() + i2;
            this.j = size;
            return size;
        }

        @Override // com.amazon.aps.iva.od0.q
        public final boolean isInitialized() {
            byte b2 = this.i;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.i = (byte) 1;
            return true;
        }

        @Override // com.amazon.aps.iva.od0.p
        public final p.a newBuilderForType() {
            return new b();
        }

        @Override // com.amazon.aps.iva.od0.p
        public final p.a toBuilder() {
            b bVar = new b();
            bVar.f(this);
            return bVar;
        }

        public c() {
            this.i = (byte) -1;
            this.j = -1;
            this.b = com.amazon.aps.iva.od0.c.b;
        }

        public c(com.amazon.aps.iva.od0.d dVar, f fVar) throws j {
            this.i = (byte) -1;
            this.j = -1;
            this.d = C0478a.h;
            b bVar = b.h;
            this.e = bVar;
            this.f = bVar;
            this.g = bVar;
            this.h = bVar;
            c.b bVar2 = new c.b();
            e j = e.j(bVar2, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int n = dVar.n();
                        if (n != 0) {
                            b.C0481b c0481b = null;
                            C0478a.b bVar3 = null;
                            b.C0481b c0481b2 = null;
                            b.C0481b c0481b3 = null;
                            b.C0481b c0481b4 = null;
                            if (n == 10) {
                                if ((this.c & 1) == 1) {
                                    C0478a c0478a = this.d;
                                    c0478a.getClass();
                                    bVar3 = new C0478a.b();
                                    bVar3.f(c0478a);
                                }
                                C0478a c0478a2 = (C0478a) dVar.g(C0478a.i, fVar);
                                this.d = c0478a2;
                                if (bVar3 != null) {
                                    bVar3.f(c0478a2);
                                    this.d = bVar3.e();
                                }
                                this.c |= 1;
                            } else if (n == 18) {
                                if ((this.c & 2) == 2) {
                                    b bVar4 = this.e;
                                    bVar4.getClass();
                                    c0481b2 = b.d(bVar4);
                                }
                                b bVar5 = (b) dVar.g(b.i, fVar);
                                this.e = bVar5;
                                if (c0481b2 != null) {
                                    c0481b2.f(bVar5);
                                    this.e = c0481b2.e();
                                }
                                this.c |= 2;
                            } else if (n == 26) {
                                if ((this.c & 4) == 4) {
                                    b bVar6 = this.f;
                                    bVar6.getClass();
                                    c0481b3 = b.d(bVar6);
                                }
                                b bVar7 = (b) dVar.g(b.i, fVar);
                                this.f = bVar7;
                                if (c0481b3 != null) {
                                    c0481b3.f(bVar7);
                                    this.f = c0481b3.e();
                                }
                                this.c |= 4;
                            } else if (n == 34) {
                                if ((this.c & 8) == 8) {
                                    b bVar8 = this.g;
                                    bVar8.getClass();
                                    c0481b4 = b.d(bVar8);
                                }
                                b bVar9 = (b) dVar.g(b.i, fVar);
                                this.g = bVar9;
                                if (c0481b4 != null) {
                                    c0481b4.f(bVar9);
                                    this.g = c0481b4.e();
                                }
                                this.c |= 8;
                            } else if (n != 42) {
                                if (!dVar.q(n, j)) {
                                }
                            } else {
                                if ((this.c & 16) == 16) {
                                    b bVar10 = this.h;
                                    bVar10.getClass();
                                    c0481b = b.d(bVar10);
                                }
                                b bVar11 = (b) dVar.g(b.i, fVar);
                                this.h = bVar11;
                                if (c0481b != null) {
                                    c0481b.f(bVar11);
                                    this.h = c0481b.e();
                                }
                                this.c |= 16;
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        try {
                            j.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.b = bVar2.f();
                            throw th2;
                        }
                        this.b = bVar2.f();
                        throw th;
                    }
                } catch (j e) {
                    e.b = this;
                    throw e;
                } catch (IOException e2) {
                    j jVar = new j(e2.getMessage());
                    jVar.b = this;
                    throw jVar;
                }
            }
            try {
                j.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.b = bVar2.f();
                throw th3;
            }
            this.b = bVar2.f();
        }
    }

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class d extends h implements q {
        public static final d h;
        public static final C0483a i = new C0483a();
        public final com.amazon.aps.iva.od0.c b;
        public List<c> c;
        public List<Integer> d;
        public int e;
        public byte f;
        public int g;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: com.amazon.aps.iva.ld0.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0483a extends com.amazon.aps.iva.od0.b<d> {
            @Override // com.amazon.aps.iva.od0.r
            public final Object a(com.amazon.aps.iva.od0.d dVar, f fVar) throws j {
                return new d(dVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* loaded from: classes4.dex */
        public static final class b extends h.b<d, b> implements q {
            public int c;
            public List<c> d = Collections.emptyList();
            public List<Integer> e = Collections.emptyList();

            @Override // com.amazon.aps.iva.od0.a.AbstractC0569a, com.amazon.aps.iva.od0.p.a
            public final /* bridge */ /* synthetic */ p.a D(com.amazon.aps.iva.od0.d dVar, f fVar) throws IOException {
                g(dVar, fVar);
                return this;
            }

            @Override // com.amazon.aps.iva.od0.a.AbstractC0569a
            public final /* bridge */ /* synthetic */ a.AbstractC0569a b(com.amazon.aps.iva.od0.d dVar, f fVar) throws IOException {
                g(dVar, fVar);
                return this;
            }

            @Override // com.amazon.aps.iva.od0.p.a
            public final com.amazon.aps.iva.od0.p build() {
                d e = e();
                if (e.isInitialized()) {
                    return e;
                }
                throw new v();
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final b c() {
                b bVar = new b();
                bVar.f(e());
                return bVar;
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final Object clone() throws CloneNotSupportedException {
                b bVar = new b();
                bVar.f(e());
                return bVar;
            }

            @Override // com.amazon.aps.iva.od0.h.b
            public final /* bridge */ /* synthetic */ b d(d dVar) {
                f(dVar);
                return this;
            }

            public final d e() {
                d dVar = new d(this);
                if ((this.c & 1) == 1) {
                    this.d = Collections.unmodifiableList(this.d);
                    this.c &= -2;
                }
                dVar.c = this.d;
                if ((this.c & 2) == 2) {
                    this.e = Collections.unmodifiableList(this.e);
                    this.c &= -3;
                }
                dVar.d = this.e;
                return dVar;
            }

            public final void f(d dVar) {
                if (dVar == d.h) {
                    return;
                }
                if (!dVar.c.isEmpty()) {
                    if (this.d.isEmpty()) {
                        this.d = dVar.c;
                        this.c &= -2;
                    } else {
                        if ((this.c & 1) != 1) {
                            this.d = new ArrayList(this.d);
                            this.c |= 1;
                        }
                        this.d.addAll(dVar.c);
                    }
                }
                if (!dVar.d.isEmpty()) {
                    if (this.e.isEmpty()) {
                        this.e = dVar.d;
                        this.c &= -3;
                    } else {
                        if ((this.c & 2) != 2) {
                            this.e = new ArrayList(this.e);
                            this.c |= 2;
                        }
                        this.e.addAll(dVar.d);
                    }
                }
                this.b = this.b.d(dVar.b);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void g(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
                /*
                    r1 = this;
                    com.amazon.aps.iva.ld0.a$d$a r0 = com.amazon.aps.iva.ld0.a.d.i     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    com.amazon.aps.iva.ld0.a$d r0 = new com.amazon.aps.iva.ld0.a$d     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                    com.amazon.aps.iva.ld0.a$d r3 = (com.amazon.aps.iva.ld0.a.d) r3     // Catch: java.lang.Throwable -> L10
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
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ld0.a.d.b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
            }
        }

        static {
            d dVar = new d();
            h = dVar;
            dVar.c = Collections.emptyList();
            dVar.d = Collections.emptyList();
        }

        public d(h.b bVar) {
            super(0);
            this.e = -1;
            this.f = (byte) -1;
            this.g = -1;
            this.b = bVar.b;
        }

        @Override // com.amazon.aps.iva.od0.p
        public final void a(e eVar) throws IOException {
            getSerializedSize();
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                eVar.o(1, this.c.get(i2));
            }
            if (this.d.size() > 0) {
                eVar.v(42);
                eVar.v(this.e);
            }
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                eVar.n(this.d.get(i3).intValue());
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
            for (int i4 = 0; i4 < this.c.size(); i4++) {
                i3 += e.d(1, this.c.get(i4));
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.d.size(); i6++) {
                i5 += e.c(this.d.get(i6).intValue());
            }
            int i7 = i3 + i5;
            if (!this.d.isEmpty()) {
                i7 = i7 + 1 + e.c(i5);
            }
            this.e = i5;
            int size = this.b.size() + i7;
            this.g = size;
            return size;
        }

        @Override // com.amazon.aps.iva.od0.q
        public final boolean isInitialized() {
            byte b2 = this.f;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f = (byte) 1;
            return true;
        }

        @Override // com.amazon.aps.iva.od0.p
        public final p.a newBuilderForType() {
            return new b();
        }

        @Override // com.amazon.aps.iva.od0.p
        public final p.a toBuilder() {
            b bVar = new b();
            bVar.f(this);
            return bVar;
        }

        /* compiled from: JvmProtoBuf.java */
        /* loaded from: classes4.dex */
        public static final class c extends h implements q {
            public static final c n;
            public static final C0484a o = new C0484a();
            public final com.amazon.aps.iva.od0.c b;
            public int c;
            public int d;
            public int e;
            public Object f;
            public EnumC0485c g;
            public List<Integer> h;
            public int i;
            public List<Integer> j;
            public int k;
            public byte l;
            public int m;

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: com.amazon.aps.iva.ld0.a$d$c$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static class C0484a extends com.amazon.aps.iva.od0.b<c> {
                @Override // com.amazon.aps.iva.od0.r
                public final Object a(com.amazon.aps.iva.od0.d dVar, f fVar) throws j {
                    return new c(dVar);
                }
            }

            /* compiled from: JvmProtoBuf.java */
            /* loaded from: classes4.dex */
            public static final class b extends h.b<c, b> implements q {
                public int c;
                public int e;
                public int d = 1;
                public Object f = "";
                public EnumC0485c g = EnumC0485c.NONE;
                public List<Integer> h = Collections.emptyList();
                public List<Integer> i = Collections.emptyList();

                @Override // com.amazon.aps.iva.od0.a.AbstractC0569a, com.amazon.aps.iva.od0.p.a
                public final /* bridge */ /* synthetic */ p.a D(com.amazon.aps.iva.od0.d dVar, f fVar) throws IOException {
                    g(dVar, fVar);
                    return this;
                }

                @Override // com.amazon.aps.iva.od0.a.AbstractC0569a
                public final /* bridge */ /* synthetic */ a.AbstractC0569a b(com.amazon.aps.iva.od0.d dVar, f fVar) throws IOException {
                    g(dVar, fVar);
                    return this;
                }

                @Override // com.amazon.aps.iva.od0.p.a
                public final com.amazon.aps.iva.od0.p build() {
                    c e = e();
                    if (e.isInitialized()) {
                        return e;
                    }
                    throw new v();
                }

                @Override // com.amazon.aps.iva.od0.h.b
                public final b c() {
                    b bVar = new b();
                    bVar.f(e());
                    return bVar;
                }

                @Override // com.amazon.aps.iva.od0.h.b
                public final Object clone() throws CloneNotSupportedException {
                    b bVar = new b();
                    bVar.f(e());
                    return bVar;
                }

                @Override // com.amazon.aps.iva.od0.h.b
                public final /* bridge */ /* synthetic */ b d(c cVar) {
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
                        this.h = Collections.unmodifiableList(this.h);
                        this.c &= -17;
                    }
                    cVar.h = this.h;
                    if ((this.c & 32) == 32) {
                        this.i = Collections.unmodifiableList(this.i);
                        this.c &= -33;
                    }
                    cVar.j = this.i;
                    cVar.c = i2;
                    return cVar;
                }

                public final void f(c cVar) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    if (cVar == c.n) {
                        return;
                    }
                    int i = cVar.c;
                    boolean z4 = false;
                    if ((i & 1) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i2 = cVar.d;
                        this.c |= 1;
                        this.d = i2;
                    }
                    if ((i & 2) == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = cVar.e;
                        this.c = 2 | this.c;
                        this.e = i3;
                    }
                    if ((i & 4) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        this.c |= 4;
                        this.f = cVar.f;
                    }
                    if ((i & 8) == 8) {
                        z4 = true;
                    }
                    if (z4) {
                        EnumC0485c enumC0485c = cVar.g;
                        enumC0485c.getClass();
                        this.c = 8 | this.c;
                        this.g = enumC0485c;
                    }
                    if (!cVar.h.isEmpty()) {
                        if (this.h.isEmpty()) {
                            this.h = cVar.h;
                            this.c &= -17;
                        } else {
                            if ((this.c & 16) != 16) {
                                this.h = new ArrayList(this.h);
                                this.c |= 16;
                            }
                            this.h.addAll(cVar.h);
                        }
                    }
                    if (!cVar.j.isEmpty()) {
                        if (this.i.isEmpty()) {
                            this.i = cVar.j;
                            this.c &= -33;
                        } else {
                            if ((this.c & 32) != 32) {
                                this.i = new ArrayList(this.i);
                                this.c |= 32;
                            }
                            this.i.addAll(cVar.j);
                        }
                    }
                    this.b = this.b.d(cVar.b);
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void g(com.amazon.aps.iva.od0.d r1, com.amazon.aps.iva.od0.f r2) throws java.io.IOException {
                    /*
                        r0 = this;
                        com.amazon.aps.iva.ld0.a$d$c$a r2 = com.amazon.aps.iva.ld0.a.d.c.o     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                        r2.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                        com.amazon.aps.iva.ld0.a$d$c r2 = new com.amazon.aps.iva.ld0.a$d$c     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                        r2.<init>(r1)     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                        r0.f(r2)
                        return
                    Le:
                        r1 = move-exception
                        goto L12
                    L10:
                        r1 = move-exception
                        goto L19
                    L12:
                        com.amazon.aps.iva.od0.p r2 = r1.b     // Catch: java.lang.Throwable -> L10
                        com.amazon.aps.iva.ld0.a$d$c r2 = (com.amazon.aps.iva.ld0.a.d.c) r2     // Catch: java.lang.Throwable -> L10
                        throw r1     // Catch: java.lang.Throwable -> L17
                    L17:
                        r1 = move-exception
                        goto L1a
                    L19:
                        r2 = 0
                    L1a:
                        if (r2 == 0) goto L1f
                        r0.f(r2)
                    L1f:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ld0.a.d.c.b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
                }
            }

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: com.amazon.aps.iva.ld0.a$d$c$c  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public enum EnumC0485c implements i.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                
                private static i.b<EnumC0485c> internalValueMap = new C0486a();
                private final int value;

                /* compiled from: JvmProtoBuf.java */
                /* renamed from: com.amazon.aps.iva.ld0.a$d$c$c$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static class C0486a implements i.b<EnumC0485c> {
                    @Override // com.amazon.aps.iva.od0.i.b
                    public final EnumC0485c findValueByNumber(int i) {
                        return EnumC0485c.valueOf(i);
                    }
                }

                EnumC0485c(int i, int i2) {
                    this.value = i2;
                }

                @Override // com.amazon.aps.iva.od0.i.a
                public final int getNumber() {
                    return this.value;
                }

                public static EnumC0485c valueOf(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                return null;
                            }
                            return DESC_TO_CLASS_ID;
                        }
                        return INTERNAL_TO_CLASS_ID;
                    }
                    return NONE;
                }
            }

            static {
                c cVar = new c();
                n = cVar;
                cVar.d = 1;
                cVar.e = 0;
                cVar.f = "";
                cVar.g = EnumC0485c.NONE;
                cVar.h = Collections.emptyList();
                cVar.j = Collections.emptyList();
            }

            public c(h.b bVar) {
                super(0);
                this.i = -1;
                this.k = -1;
                this.l = (byte) -1;
                this.m = -1;
                this.b = bVar.b;
            }

            @Override // com.amazon.aps.iva.od0.p
            public final void a(e eVar) throws IOException {
                com.amazon.aps.iva.od0.c cVar;
                getSerializedSize();
                if ((this.c & 1) == 1) {
                    eVar.m(1, this.d);
                }
                if ((this.c & 2) == 2) {
                    eVar.m(2, this.e);
                }
                if ((this.c & 8) == 8) {
                    eVar.l(3, this.g.getNumber());
                }
                if (this.h.size() > 0) {
                    eVar.v(34);
                    eVar.v(this.i);
                }
                for (int i = 0; i < this.h.size(); i++) {
                    eVar.n(this.h.get(i).intValue());
                }
                if (this.j.size() > 0) {
                    eVar.v(42);
                    eVar.v(this.k);
                }
                for (int i2 = 0; i2 < this.j.size(); i2++) {
                    eVar.n(this.j.get(i2).intValue());
                }
                if ((this.c & 4) == 4) {
                    Object obj = this.f;
                    if (obj instanceof String) {
                        try {
                            cVar = new o(((String) obj).getBytes(Hex.DEFAULT_CHARSET_NAME));
                            this.f = cVar;
                        } catch (UnsupportedEncodingException e) {
                            throw new RuntimeException("UTF-8 not supported?", e);
                        }
                    } else {
                        cVar = (com.amazon.aps.iva.od0.c) obj;
                    }
                    eVar.x(6, 2);
                    eVar.v(cVar.size());
                    eVar.r(cVar);
                }
                eVar.r(this.b);
            }

            @Override // com.amazon.aps.iva.od0.p
            public final int getSerializedSize() {
                int i;
                com.amazon.aps.iva.od0.c cVar;
                int i2 = this.m;
                if (i2 != -1) {
                    return i2;
                }
                if ((this.c & 1) == 1) {
                    i = e.b(1, this.d) + 0;
                } else {
                    i = 0;
                }
                if ((this.c & 2) == 2) {
                    i += e.b(2, this.e);
                }
                if ((this.c & 8) == 8) {
                    i += e.a(3, this.g.getNumber());
                }
                int i3 = 0;
                for (int i4 = 0; i4 < this.h.size(); i4++) {
                    i3 += e.c(this.h.get(i4).intValue());
                }
                int i5 = i + i3;
                if (!this.h.isEmpty()) {
                    i5 = i5 + 1 + e.c(i3);
                }
                this.i = i3;
                int i6 = 0;
                for (int i7 = 0; i7 < this.j.size(); i7++) {
                    i6 += e.c(this.j.get(i7).intValue());
                }
                int i8 = i5 + i6;
                if (!this.j.isEmpty()) {
                    i8 = i8 + 1 + e.c(i6);
                }
                this.k = i6;
                if ((this.c & 4) == 4) {
                    Object obj = this.f;
                    if (obj instanceof String) {
                        try {
                            cVar = new o(((String) obj).getBytes(Hex.DEFAULT_CHARSET_NAME));
                            this.f = cVar;
                        } catch (UnsupportedEncodingException e) {
                            throw new RuntimeException("UTF-8 not supported?", e);
                        }
                    } else {
                        cVar = (com.amazon.aps.iva.od0.c) obj;
                    }
                    i8 += cVar.size() + e.f(cVar.size()) + e.h(6);
                }
                int size = this.b.size() + i8;
                this.m = size;
                return size;
            }

            @Override // com.amazon.aps.iva.od0.q
            public final boolean isInitialized() {
                byte b2 = this.l;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.l = (byte) 1;
                return true;
            }

            @Override // com.amazon.aps.iva.od0.p
            public final p.a newBuilderForType() {
                return new b();
            }

            @Override // com.amazon.aps.iva.od0.p
            public final p.a toBuilder() {
                b bVar = new b();
                bVar.f(this);
                return bVar;
            }

            public c() {
                this.i = -1;
                this.k = -1;
                this.l = (byte) -1;
                this.m = -1;
                this.b = com.amazon.aps.iva.od0.c.b;
            }

            public c(com.amazon.aps.iva.od0.d dVar) throws j {
                this.i = -1;
                this.k = -1;
                this.l = (byte) -1;
                this.m = -1;
                this.d = 1;
                boolean z = false;
                this.e = 0;
                this.f = "";
                this.g = EnumC0485c.NONE;
                this.h = Collections.emptyList();
                this.j = Collections.emptyList();
                e j = e.j(new c.b(), 1);
                boolean z2 = false;
                while (!z) {
                    try {
                        try {
                            int n2 = dVar.n();
                            if (n2 != 0) {
                                if (n2 == 8) {
                                    this.c |= 1;
                                    this.d = dVar.k();
                                } else if (n2 == 16) {
                                    this.c |= 2;
                                    this.e = dVar.k();
                                } else if (n2 == 24) {
                                    int k = dVar.k();
                                    EnumC0485c valueOf = EnumC0485c.valueOf(k);
                                    if (valueOf == null) {
                                        j.v(n2);
                                        j.v(k);
                                    } else {
                                        this.c |= 8;
                                        this.g = valueOf;
                                    }
                                } else if (n2 == 32) {
                                    if (!(z2 & true)) {
                                        this.h = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.h.add(Integer.valueOf(dVar.k()));
                                } else if (n2 == 34) {
                                    int d = dVar.d(dVar.k());
                                    if (!(z2 & true) && dVar.b() > 0) {
                                        this.h = new ArrayList();
                                        z2 |= true;
                                    }
                                    while (dVar.b() > 0) {
                                        this.h.add(Integer.valueOf(dVar.k()));
                                    }
                                    dVar.c(d);
                                } else if (n2 == 40) {
                                    if (!(z2 & true)) {
                                        this.j = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.j.add(Integer.valueOf(dVar.k()));
                                } else if (n2 == 42) {
                                    int d2 = dVar.d(dVar.k());
                                    if (!(z2 & true) && dVar.b() > 0) {
                                        this.j = new ArrayList();
                                        z2 |= true;
                                    }
                                    while (dVar.b() > 0) {
                                        this.j.add(Integer.valueOf(dVar.k()));
                                    }
                                    dVar.c(d2);
                                } else if (n2 != 50) {
                                    if (!dVar.q(n2, j)) {
                                    }
                                } else {
                                    o e = dVar.e();
                                    this.c |= 4;
                                    this.f = e;
                                }
                            }
                            z = true;
                        } catch (Throwable th) {
                            if (z2 & true) {
                                this.h = Collections.unmodifiableList(this.h);
                            }
                            if (z2 & true) {
                                this.j = Collections.unmodifiableList(this.j);
                            }
                            try {
                                j.i();
                            } catch (IOException unused) {
                                throw th;
                            } finally {
                            }
                        }
                    } catch (j e2) {
                        e2.b = this;
                        throw e2;
                    } catch (IOException e3) {
                        j jVar = new j(e3.getMessage());
                        jVar.b = this;
                        throw jVar;
                    }
                }
                if (z2 & true) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if (z2 & true) {
                    this.j = Collections.unmodifiableList(this.j);
                }
                try {
                    j.i();
                } catch (IOException unused2) {
                } finally {
                }
            }
        }

        public d() {
            this.e = -1;
            this.f = (byte) -1;
            this.g = -1;
            this.b = com.amazon.aps.iva.od0.c.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(com.amazon.aps.iva.od0.d dVar, f fVar) throws j {
            this.e = -1;
            this.f = (byte) -1;
            this.g = -1;
            this.c = Collections.emptyList();
            this.d = Collections.emptyList();
            e j = e.j(new c.b(), 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int n = dVar.n();
                        if (n != 0) {
                            if (n == 10) {
                                if (!(z2 & true)) {
                                    this.c = new ArrayList();
                                    z2 |= true;
                                }
                                this.c.add(dVar.g(c.o, fVar));
                            } else if (n == 40) {
                                if (!(z2 & true)) {
                                    this.d = new ArrayList();
                                    z2 |= true;
                                }
                                this.d.add(Integer.valueOf(dVar.k()));
                            } else if (n != 42) {
                                if (!dVar.q(n, j)) {
                                }
                            } else {
                                int d = dVar.d(dVar.k());
                                if (!(z2 & true) && dVar.b() > 0) {
                                    this.d = new ArrayList();
                                    z2 |= true;
                                }
                                while (dVar.b() > 0) {
                                    this.d.add(Integer.valueOf(dVar.k()));
                                }
                                dVar.c(d);
                            }
                        }
                        z = true;
                    } catch (j e) {
                        e.b = this;
                        throw e;
                    } catch (IOException e2) {
                        j jVar = new j(e2.getMessage());
                        jVar.b = this;
                        throw jVar;
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.c = Collections.unmodifiableList(this.c);
                    }
                    if (z2 & true) {
                        this.d = Collections.unmodifiableList(this.d);
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
                this.c = Collections.unmodifiableList(this.c);
            }
            if (z2 & true) {
                this.d = Collections.unmodifiableList(this.d);
            }
            try {
                j.i();
            } catch (IOException unused2) {
            } finally {
            }
        }
    }
}
