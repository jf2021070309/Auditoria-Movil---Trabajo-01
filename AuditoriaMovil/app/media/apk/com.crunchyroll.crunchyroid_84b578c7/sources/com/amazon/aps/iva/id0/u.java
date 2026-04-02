package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.i;
import com.amazon.aps.iva.od0.p;
import java.io.IOException;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public final class u extends com.amazon.aps.iva.od0.h implements com.amazon.aps.iva.od0.q {
    public static final u l;
    public static final a m = new a();
    public final com.amazon.aps.iva.od0.c b;
    public int c;
    public int d;
    public int e;
    public c f;
    public int g;
    public int h;
    public d i;
    public byte j;
    public int k;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<u> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new u(dVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.b<u, b> implements com.amazon.aps.iva.od0.q {
        public int c;
        public int d;
        public int e;
        public int g;
        public int h;
        public c f = c.ERROR;
        public d i = d.LANGUAGE_VERSION;

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
            u e = e();
            if (e.isInitialized()) {
                return e;
            }
            throw new com.amazon.aps.iva.od0.v();
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
        public final /* bridge */ /* synthetic */ b d(u uVar) {
            f(uVar);
            return this;
        }

        public final u e() {
            u uVar = new u(this);
            int i = this.c;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            uVar.d = this.d;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            uVar.e = this.e;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            uVar.f = this.f;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            uVar.g = this.g;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            uVar.h = this.h;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            uVar.i = this.i;
            uVar.c = i2;
            return uVar;
        }

        public final void f(u uVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            if (uVar == u.l) {
                return;
            }
            int i = uVar.c;
            boolean z6 = true;
            if ((i & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = uVar.d;
                this.c |= 1;
                this.d = i2;
            }
            if ((i & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i3 = uVar.e;
                this.c = 2 | this.c;
                this.e = i3;
            }
            if ((i & 4) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                c cVar = uVar.f;
                cVar.getClass();
                this.c = 4 | this.c;
                this.f = cVar;
            }
            int i4 = uVar.c;
            if ((i4 & 8) == 8) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                int i5 = uVar.g;
                this.c = 8 | this.c;
                this.g = i5;
            }
            if ((i4 & 16) == 16) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                int i6 = uVar.h;
                this.c = 16 | this.c;
                this.h = i6;
            }
            if ((i4 & 32) != 32) {
                z6 = false;
            }
            if (z6) {
                d dVar = uVar.i;
                dVar.getClass();
                this.c = 32 | this.c;
                this.i = dVar;
            }
            this.b = this.b.d(uVar.b);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(com.amazon.aps.iva.od0.d r1, com.amazon.aps.iva.od0.f r2) throws java.io.IOException {
            /*
                r0 = this;
                com.amazon.aps.iva.id0.u$a r2 = com.amazon.aps.iva.id0.u.m     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r2.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.u r2 = new com.amazon.aps.iva.id0.u     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.u r2 = (com.amazon.aps.iva.id0.u) r2     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.u.b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public enum c implements i.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        
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
                        return null;
                    }
                    return HIDDEN;
                }
                return ERROR;
            }
            return WARNING;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public enum d implements i.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        
        private static i.b<d> internalValueMap = new a();
        private final int value;

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes4.dex */
        public static class a implements i.b<d> {
            @Override // com.amazon.aps.iva.od0.i.b
            public final d findValueByNumber(int i) {
                return d.valueOf(i);
            }
        }

        d(int i, int i2) {
            this.value = i2;
        }

        @Override // com.amazon.aps.iva.od0.i.a
        public final int getNumber() {
            return this.value;
        }

        public static d valueOf(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return API_VERSION;
                }
                return COMPILER_VERSION;
            }
            return LANGUAGE_VERSION;
        }
    }

    static {
        u uVar = new u();
        l = uVar;
        uVar.d = 0;
        uVar.e = 0;
        uVar.f = c.ERROR;
        uVar.g = 0;
        uVar.h = 0;
        uVar.i = d.LANGUAGE_VERSION;
    }

    public u(h.b bVar) {
        super(0);
        this.j = (byte) -1;
        this.k = -1;
        this.b = bVar.b;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        if ((this.c & 1) == 1) {
            eVar.m(1, this.d);
        }
        if ((this.c & 2) == 2) {
            eVar.m(2, this.e);
        }
        if ((this.c & 4) == 4) {
            eVar.l(3, this.f.getNumber());
        }
        if ((this.c & 8) == 8) {
            eVar.m(4, this.g);
        }
        if ((this.c & 16) == 16) {
            eVar.m(5, this.h);
        }
        if ((this.c & 32) == 32) {
            eVar.l(6, this.i.getNumber());
        }
        eVar.r(this.b);
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.c & 1) == 1) {
            i2 = 0 + com.amazon.aps.iva.od0.e.b(1, this.d);
        }
        if ((this.c & 2) == 2) {
            i2 += com.amazon.aps.iva.od0.e.b(2, this.e);
        }
        if ((this.c & 4) == 4) {
            i2 += com.amazon.aps.iva.od0.e.a(3, this.f.getNumber());
        }
        if ((this.c & 8) == 8) {
            i2 += com.amazon.aps.iva.od0.e.b(4, this.g);
        }
        if ((this.c & 16) == 16) {
            i2 += com.amazon.aps.iva.od0.e.b(5, this.h);
        }
        if ((this.c & 32) == 32) {
            i2 += com.amazon.aps.iva.od0.e.a(6, this.i.getNumber());
        }
        int size = this.b.size() + i2;
        this.k = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        byte b2 = this.j;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.j = (byte) 1;
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

    public u() {
        this.j = (byte) -1;
        this.k = -1;
        this.b = com.amazon.aps.iva.od0.c.b;
    }

    public u(com.amazon.aps.iva.od0.d dVar) throws com.amazon.aps.iva.od0.j {
        this.j = (byte) -1;
        this.k = -1;
        boolean z = false;
        this.d = 0;
        this.e = 0;
        this.f = c.ERROR;
        this.g = 0;
        this.h = 0;
        this.i = d.LANGUAGE_VERSION;
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
                            } else if (n == 16) {
                                this.c |= 2;
                                this.e = dVar.k();
                            } else if (n == 24) {
                                int k = dVar.k();
                                c valueOf = c.valueOf(k);
                                if (valueOf == null) {
                                    j.v(n);
                                    j.v(k);
                                } else {
                                    this.c |= 4;
                                    this.f = valueOf;
                                }
                            } else if (n == 32) {
                                this.c |= 8;
                                this.g = dVar.k();
                            } else if (n == 40) {
                                this.c |= 16;
                                this.h = dVar.k();
                            } else if (n != 48) {
                                if (!dVar.q(n, j)) {
                                }
                            } else {
                                int k2 = dVar.k();
                                d valueOf2 = d.valueOf(k2);
                                if (valueOf2 == null) {
                                    j.v(n);
                                    j.v(k2);
                                } else {
                                    this.c |= 32;
                                    this.i = valueOf2;
                                }
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
