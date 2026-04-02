package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.id0.k;
import com.amazon.aps.iva.id0.n;
import com.amazon.aps.iva.id0.o;
import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.p;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public final class l extends h.d<l> {
    public static final l k;
    public static final a l = new a();
    public final com.amazon.aps.iva.od0.c c;
    public int d;
    public o e;
    public n f;
    public k g;
    public List<com.amazon.aps.iva.id0.b> h;
    public byte i;
    public int j;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<l> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new l(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.c<l, b> {
        public int e;
        public o f = o.f;
        public n g = n.f;
        public k h = k.l;
        public List<com.amazon.aps.iva.id0.b> i = Collections.emptyList();

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
            l f = f();
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
            g((l) hVar);
            return this;
        }

        public final l f() {
            l lVar = new l(this);
            int i = this.e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            lVar.e = this.f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            lVar.f = this.g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            lVar.g = this.h;
            if ((i & 8) == 8) {
                this.i = Collections.unmodifiableList(this.i);
                this.e &= -9;
            }
            lVar.h = this.i;
            lVar.d = i2;
            return lVar;
        }

        public final void g(l lVar) {
            boolean z;
            boolean z2;
            k kVar;
            n nVar;
            o oVar;
            if (lVar == l.k) {
                return;
            }
            boolean z3 = true;
            if ((lVar.d & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                o oVar2 = lVar.e;
                if ((this.e & 1) == 1 && (oVar = this.f) != o.f) {
                    o.b bVar = new o.b();
                    bVar.f(oVar);
                    bVar.f(oVar2);
                    this.f = bVar.e();
                } else {
                    this.f = oVar2;
                }
                this.e |= 1;
            }
            if ((lVar.d & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                n nVar2 = lVar.f;
                if ((this.e & 2) == 2 && (nVar = this.g) != n.f) {
                    n.b bVar2 = new n.b();
                    bVar2.f(nVar);
                    bVar2.f(nVar2);
                    this.g = bVar2.e();
                } else {
                    this.g = nVar2;
                }
                this.e |= 2;
            }
            if ((lVar.d & 4) != 4) {
                z3 = false;
            }
            if (z3) {
                k kVar2 = lVar.g;
                if ((this.e & 4) == 4 && (kVar = this.h) != k.l) {
                    k.b bVar3 = new k.b();
                    bVar3.g(kVar);
                    bVar3.g(kVar2);
                    this.h = bVar3.f();
                } else {
                    this.h = kVar2;
                }
                this.e |= 4;
            }
            if (!lVar.h.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = lVar.h;
                    this.e &= -9;
                } else {
                    if ((this.e & 8) != 8) {
                        this.i = new ArrayList(this.i);
                        this.e |= 8;
                    }
                    this.i.addAll(lVar.h);
                }
            }
            e(lVar);
            this.b = this.b.d(lVar.c);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.l$a r0 = com.amazon.aps.iva.id0.l.l     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.l r0 = new com.amazon.aps.iva.id0.l     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.l r3 = (com.amazon.aps.iva.id0.l) r3     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.l.b.h(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        l lVar = new l(0);
        k = lVar;
        lVar.e = o.f;
        lVar.f = n.f;
        lVar.g = k.l;
        lVar.h = Collections.emptyList();
    }

    public l() {
        throw null;
    }

    public l(h.c cVar) {
        super(cVar);
        this.i = (byte) -1;
        this.j = -1;
        this.c = cVar.b;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        h.d.a aVar = new h.d.a(this);
        if ((this.d & 1) == 1) {
            eVar.o(1, this.e);
        }
        if ((this.d & 2) == 2) {
            eVar.o(2, this.f);
        }
        if ((this.d & 4) == 4) {
            eVar.o(3, this.g);
        }
        for (int i = 0; i < this.h.size(); i++) {
            eVar.o(4, this.h.get(i));
        }
        aVar.a(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, eVar);
        eVar.r(this.c);
    }

    @Override // com.amazon.aps.iva.od0.q
    public final com.amazon.aps.iva.od0.p getDefaultInstanceForType() {
        return k;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i;
        int i2 = this.j;
        if (i2 != -1) {
            return i2;
        }
        if ((this.d & 1) == 1) {
            i = com.amazon.aps.iva.od0.e.d(1, this.e) + 0;
        } else {
            i = 0;
        }
        if ((this.d & 2) == 2) {
            i += com.amazon.aps.iva.od0.e.d(2, this.f);
        }
        if ((this.d & 4) == 4) {
            i += com.amazon.aps.iva.od0.e.d(3, this.g);
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            i += com.amazon.aps.iva.od0.e.d(4, this.h.get(i3));
        }
        int size = this.c.size() + e() + i;
        this.j = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        boolean z;
        boolean z2;
        byte b2 = this.i;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.d & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.f.isInitialized()) {
            this.i = (byte) 0;
            return false;
        }
        if ((this.d & 4) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !this.g.isInitialized()) {
            this.i = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.h.size(); i++) {
            if (!this.h.get(i).isInitialized()) {
                this.i = (byte) 0;
                return false;
            }
        }
        if (!d()) {
            this.i = (byte) 0;
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
        bVar.g(this);
        return bVar;
    }

    public l(int i) {
        this.i = (byte) -1;
        this.j = -1;
        this.c = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        this.i = (byte) -1;
        this.j = -1;
        this.e = o.f;
        this.f = n.f;
        this.g = k.l;
        this.h = Collections.emptyList();
        c.b bVar = new c.b();
        com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int n = dVar.n();
                        if (n != 0) {
                            k.b bVar2 = null;
                            o.b bVar3 = null;
                            n.b bVar4 = null;
                            if (n == 10) {
                                if ((this.d & 1) == 1) {
                                    o oVar = this.e;
                                    oVar.getClass();
                                    bVar3 = new o.b();
                                    bVar3.f(oVar);
                                }
                                o oVar2 = (o) dVar.g(o.g, fVar);
                                this.e = oVar2;
                                if (bVar3 != null) {
                                    bVar3.f(oVar2);
                                    this.e = bVar3.e();
                                }
                                this.d |= 1;
                            } else if (n == 18) {
                                if ((this.d & 2) == 2) {
                                    n nVar = this.f;
                                    nVar.getClass();
                                    bVar4 = new n.b();
                                    bVar4.f(nVar);
                                }
                                n nVar2 = (n) dVar.g(n.g, fVar);
                                this.f = nVar2;
                                if (bVar4 != null) {
                                    bVar4.f(nVar2);
                                    this.f = bVar4.e();
                                }
                                this.d |= 2;
                            } else if (n == 26) {
                                if ((this.d & 4) == 4) {
                                    k kVar = this.g;
                                    kVar.getClass();
                                    bVar2 = new k.b();
                                    bVar2.g(kVar);
                                }
                                k kVar2 = (k) dVar.g(k.m, fVar);
                                this.g = kVar2;
                                if (bVar2 != null) {
                                    bVar2.g(kVar2);
                                    this.g = bVar2.f();
                                }
                                this.d |= 4;
                            } else if (n != 34) {
                                if (!j(dVar, j, fVar, n)) {
                                }
                            } else {
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.h = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.h.add(dVar.g(com.amazon.aps.iva.id0.b.L, fVar));
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
                if ((z2 ? 1 : 0) & true) {
                    this.h = Collections.unmodifiableList(this.h);
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
        }
        if ((z2 ? 1 : 0) & true) {
            this.h = Collections.unmodifiableList(this.h);
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
