package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.id0.p;
import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.p;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public final class t extends h.d<t> {
    public static final t m;
    public static final a n = new a();
    public final com.amazon.aps.iva.od0.c c;
    public int d;
    public int e;
    public int f;
    public p g;
    public int h;
    public p i;
    public int j;
    public byte k;
    public int l;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<t> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new t(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.c<t, b> {
        public int e;
        public int f;
        public int g;
        public p h;
        public int i;
        public p j;
        public int k;

        public b() {
            p pVar = p.u;
            this.h = pVar;
            this.j = pVar;
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
            t f = f();
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
            g((t) hVar);
            return this;
        }

        public final t f() {
            t tVar = new t(this);
            int i = this.e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            tVar.e = this.f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            tVar.f = this.g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            tVar.g = this.h;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            tVar.h = this.i;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            tVar.i = this.j;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            tVar.j = this.k;
            tVar.d = i2;
            return tVar;
        }

        public final void g(t tVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            p pVar;
            p pVar2;
            if (tVar == t.m) {
                return;
            }
            int i = tVar.d;
            boolean z6 = false;
            if ((i & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = tVar.e;
                this.e |= 1;
                this.f = i2;
            }
            if ((i & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i3 = tVar.f;
                this.e = 2 | this.e;
                this.g = i3;
            }
            if ((i & 4) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                p pVar3 = tVar.g;
                if ((this.e & 4) == 4 && (pVar2 = this.h) != p.u) {
                    p.c n = p.n(pVar2);
                    n.g(pVar3);
                    this.h = n.f();
                } else {
                    this.h = pVar3;
                }
                this.e |= 4;
            }
            int i4 = tVar.d;
            if ((i4 & 8) == 8) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                int i5 = tVar.h;
                this.e = 8 | this.e;
                this.i = i5;
            }
            if ((i4 & 16) == 16) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                p pVar4 = tVar.i;
                if ((this.e & 16) == 16 && (pVar = this.j) != p.u) {
                    p.c n2 = p.n(pVar);
                    n2.g(pVar4);
                    this.j = n2.f();
                } else {
                    this.j = pVar4;
                }
                this.e |= 16;
            }
            if ((tVar.d & 32) == 32) {
                z6 = true;
            }
            if (z6) {
                int i6 = tVar.j;
                this.e = 32 | this.e;
                this.k = i6;
            }
            e(tVar);
            this.b = this.b.d(tVar.c);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.t$a r0 = com.amazon.aps.iva.id0.t.n     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.t r0 = new com.amazon.aps.iva.id0.t     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.t r3 = (com.amazon.aps.iva.id0.t) r3     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.t.b.h(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        t tVar = new t(0);
        m = tVar;
        tVar.e = 0;
        tVar.f = 0;
        p pVar = p.u;
        tVar.g = pVar;
        tVar.h = 0;
        tVar.i = pVar;
        tVar.j = 0;
    }

    public t() {
        throw null;
    }

    public t(h.c cVar) {
        super(cVar);
        this.k = (byte) -1;
        this.l = -1;
        this.c = cVar.b;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        h.d.a aVar = new h.d.a(this);
        if ((this.d & 1) == 1) {
            eVar.m(1, this.e);
        }
        if ((this.d & 2) == 2) {
            eVar.m(2, this.f);
        }
        if ((this.d & 4) == 4) {
            eVar.o(3, this.g);
        }
        if ((this.d & 16) == 16) {
            eVar.o(4, this.i);
        }
        if ((this.d & 8) == 8) {
            eVar.m(5, this.h);
        }
        if ((this.d & 32) == 32) {
            eVar.m(6, this.j);
        }
        aVar.a(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, eVar);
        eVar.r(this.c);
    }

    @Override // com.amazon.aps.iva.od0.q
    public final com.amazon.aps.iva.od0.p getDefaultInstanceForType() {
        return m;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i = this.l;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.d & 1) == 1) {
            i2 = 0 + com.amazon.aps.iva.od0.e.b(1, this.e);
        }
        if ((this.d & 2) == 2) {
            i2 += com.amazon.aps.iva.od0.e.b(2, this.f);
        }
        if ((this.d & 4) == 4) {
            i2 += com.amazon.aps.iva.od0.e.d(3, this.g);
        }
        if ((this.d & 16) == 16) {
            i2 += com.amazon.aps.iva.od0.e.d(4, this.i);
        }
        if ((this.d & 8) == 8) {
            i2 += com.amazon.aps.iva.od0.e.b(5, this.h);
        }
        if ((this.d & 32) == 32) {
            i2 += com.amazon.aps.iva.od0.e.b(6, this.j);
        }
        int size = this.c.size() + e() + i2;
        this.l = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        boolean z;
        boolean z2;
        boolean z3;
        byte b2 = this.k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i = this.d;
        if ((i & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.k = (byte) 0;
            return false;
        }
        if ((i & 4) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !this.g.isInitialized()) {
            this.k = (byte) 0;
            return false;
        }
        if ((this.d & 16) == 16) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && !this.i.isInitialized()) {
            this.k = (byte) 0;
            return false;
        } else if (!d()) {
            this.k = (byte) 0;
            return false;
        } else {
            this.k = (byte) 1;
            return true;
        }
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

    public t(int i) {
        this.k = (byte) -1;
        this.l = -1;
        this.c = com.amazon.aps.iva.od0.c.b;
    }

    public t(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        this.k = (byte) -1;
        this.l = -1;
        boolean z = false;
        this.e = 0;
        this.f = 0;
        p pVar = p.u;
        this.g = pVar;
        this.h = 0;
        this.i = pVar;
        this.j = 0;
        c.b bVar = new c.b();
        com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(bVar, 1);
        while (!z) {
            try {
                try {
                    int n2 = dVar.n();
                    if (n2 != 0) {
                        if (n2 == 8) {
                            this.d |= 1;
                            this.e = dVar.k();
                        } else if (n2 != 16) {
                            p.c cVar = null;
                            if (n2 == 26) {
                                if ((this.d & 4) == 4) {
                                    p pVar2 = this.g;
                                    pVar2.getClass();
                                    cVar = p.n(pVar2);
                                }
                                p pVar3 = (p) dVar.g(p.v, fVar);
                                this.g = pVar3;
                                if (cVar != null) {
                                    cVar.g(pVar3);
                                    this.g = cVar.f();
                                }
                                this.d |= 4;
                            } else if (n2 == 34) {
                                if ((this.d & 16) == 16) {
                                    p pVar4 = this.i;
                                    pVar4.getClass();
                                    cVar = p.n(pVar4);
                                }
                                p pVar5 = (p) dVar.g(p.v, fVar);
                                this.i = pVar5;
                                if (cVar != null) {
                                    cVar.g(pVar5);
                                    this.i = cVar.f();
                                }
                                this.d |= 16;
                            } else if (n2 == 40) {
                                this.d |= 8;
                                this.h = dVar.k();
                            } else if (n2 != 48) {
                                if (!j(dVar, j, fVar, n2)) {
                                }
                            } else {
                                this.d |= 32;
                                this.j = dVar.k();
                            }
                        } else {
                            this.d |= 2;
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
                    j.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.c = bVar.f();
                    throw th2;
                }
                this.c = bVar.f();
                h();
                throw th;
            }
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.c = bVar.f();
            throw th3;
        }
        this.c = bVar.f();
        h();
    }
}
