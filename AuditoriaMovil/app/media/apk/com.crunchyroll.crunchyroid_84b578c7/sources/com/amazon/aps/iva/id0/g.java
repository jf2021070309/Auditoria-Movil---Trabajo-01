package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.id0.p;
import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.i;
import com.amazon.aps.iva.od0.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public final class g extends com.amazon.aps.iva.od0.h implements com.amazon.aps.iva.od0.q {
    public static final g m;
    public static final a n = new a();
    public final com.amazon.aps.iva.od0.c b;
    public int c;
    public int d;
    public int e;
    public c f;
    public p g;
    public int h;
    public List<g> i;
    public List<g> j;
    public byte k;
    public int l;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<g> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new g(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.b<g, b> implements com.amazon.aps.iva.od0.q {
        public int c;
        public int d;
        public int e;
        public int h;
        public c f = c.TRUE;
        public p g = p.u;
        public List<g> i = Collections.emptyList();
        public List<g> j = Collections.emptyList();

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
            g e = e();
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
        public final /* bridge */ /* synthetic */ b d(g gVar) {
            f(gVar);
            return this;
        }

        public final g e() {
            g gVar = new g(this);
            int i = this.c;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            gVar.d = this.d;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            gVar.e = this.e;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            gVar.f = this.f;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            gVar.g = this.g;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            gVar.h = this.h;
            if ((i & 32) == 32) {
                this.i = Collections.unmodifiableList(this.i);
                this.c &= -33;
            }
            gVar.i = this.i;
            if ((this.c & 64) == 64) {
                this.j = Collections.unmodifiableList(this.j);
                this.c &= -65;
            }
            gVar.j = this.j;
            gVar.c = i2;
            return gVar;
        }

        public final void f(g gVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            p pVar;
            if (gVar == g.m) {
                return;
            }
            int i = gVar.c;
            boolean z5 = false;
            if ((i & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = gVar.d;
                this.c |= 1;
                this.d = i2;
            }
            if ((i & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i3 = gVar.e;
                this.c = 2 | this.c;
                this.e = i3;
            }
            if ((i & 4) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                c cVar = gVar.f;
                cVar.getClass();
                this.c = 4 | this.c;
                this.f = cVar;
            }
            if ((gVar.c & 8) == 8) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                p pVar2 = gVar.g;
                if ((this.c & 8) == 8 && (pVar = this.g) != p.u) {
                    p.c n = p.n(pVar);
                    n.g(pVar2);
                    this.g = n.f();
                } else {
                    this.g = pVar2;
                }
                this.c |= 8;
            }
            if ((gVar.c & 16) == 16) {
                z5 = true;
            }
            if (z5) {
                int i4 = gVar.h;
                this.c = 16 | this.c;
                this.h = i4;
            }
            if (!gVar.i.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = gVar.i;
                    this.c &= -33;
                } else {
                    if ((this.c & 32) != 32) {
                        this.i = new ArrayList(this.i);
                        this.c |= 32;
                    }
                    this.i.addAll(gVar.i);
                }
            }
            if (!gVar.j.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = gVar.j;
                    this.c &= -65;
                } else {
                    if ((this.c & 64) != 64) {
                        this.j = new ArrayList(this.j);
                        this.c |= 64;
                    }
                    this.j.addAll(gVar.j);
                }
            }
            this.b = this.b.d(gVar.b);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.g$a r0 = com.amazon.aps.iva.id0.g.n     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.g r0 = new com.amazon.aps.iva.id0.g     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.g r3 = (com.amazon.aps.iva.id0.g) r3     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.g.b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public enum c implements i.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        
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
                    return NULL;
                }
                return FALSE;
            }
            return TRUE;
        }
    }

    static {
        g gVar = new g();
        m = gVar;
        gVar.d = 0;
        gVar.e = 0;
        gVar.f = c.TRUE;
        gVar.g = p.u;
        gVar.h = 0;
        gVar.i = Collections.emptyList();
        gVar.j = Collections.emptyList();
    }

    public g(h.b bVar) {
        super(0);
        this.k = (byte) -1;
        this.l = -1;
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
            eVar.o(4, this.g);
        }
        if ((this.c & 16) == 16) {
            eVar.m(5, this.h);
        }
        for (int i = 0; i < this.i.size(); i++) {
            eVar.o(6, this.i.get(i));
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            eVar.o(7, this.j.get(i2));
        }
        eVar.r(this.b);
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i;
        int i2 = this.l;
        if (i2 != -1) {
            return i2;
        }
        if ((this.c & 1) == 1) {
            i = com.amazon.aps.iva.od0.e.b(1, this.d) + 0;
        } else {
            i = 0;
        }
        if ((this.c & 2) == 2) {
            i += com.amazon.aps.iva.od0.e.b(2, this.e);
        }
        if ((this.c & 4) == 4) {
            i += com.amazon.aps.iva.od0.e.a(3, this.f.getNumber());
        }
        if ((this.c & 8) == 8) {
            i += com.amazon.aps.iva.od0.e.d(4, this.g);
        }
        if ((this.c & 16) == 16) {
            i += com.amazon.aps.iva.od0.e.b(5, this.h);
        }
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            i += com.amazon.aps.iva.od0.e.d(6, this.i.get(i3));
        }
        for (int i4 = 0; i4 < this.j.size(); i4++) {
            i += com.amazon.aps.iva.od0.e.d(7, this.j.get(i4));
        }
        int size = this.b.size() + i;
        this.l = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        boolean z;
        byte b2 = this.k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.c & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.g.isInitialized()) {
            this.k = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.i.size(); i++) {
            if (!this.i.get(i).isInitialized()) {
                this.k = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            if (!this.j.get(i2).isInitialized()) {
                this.k = (byte) 0;
                return false;
            }
        }
        this.k = (byte) 1;
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

    public g() {
        this.k = (byte) -1;
        this.l = -1;
        this.b = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        p.c cVar;
        this.k = (byte) -1;
        this.l = -1;
        boolean z = false;
        this.d = 0;
        this.e = 0;
        this.f = c.TRUE;
        this.g = p.u;
        this.h = 0;
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(new c.b(), 1);
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
                            c valueOf = c.valueOf(k);
                            if (valueOf == null) {
                                j.v(n2);
                                j.v(k);
                            } else {
                                this.c |= 4;
                                this.f = valueOf;
                            }
                        } else if (n2 == 34) {
                            if ((this.c & 8) == 8) {
                                p pVar = this.g;
                                pVar.getClass();
                                cVar = p.n(pVar);
                            } else {
                                cVar = null;
                            }
                            p pVar2 = (p) dVar.g(p.v, fVar);
                            this.g = pVar2;
                            if (cVar != null) {
                                cVar.g(pVar2);
                                this.g = cVar.f();
                            }
                            this.c |= 8;
                        } else if (n2 != 40) {
                            a aVar = n;
                            if (n2 == 50) {
                                if (!(z2 & true)) {
                                    this.i = new ArrayList();
                                    z2 |= true;
                                }
                                this.i.add(dVar.g(aVar, fVar));
                            } else if (n2 != 58) {
                                if (!dVar.q(n2, j)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.j = new ArrayList();
                                    z2 |= true;
                                }
                                this.j.add(dVar.g(aVar, fVar));
                            }
                        } else {
                            this.c |= 16;
                            this.h = dVar.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.i = Collections.unmodifiableList(this.i);
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
            this.i = Collections.unmodifiableList(this.i);
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
