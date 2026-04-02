package com.amazon.aps.iva.id0;

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
public final class r extends h.d<r> {
    public static final r n;
    public static final a o = new a();
    public final com.amazon.aps.iva.od0.c c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public c h;
    public List<p> i;
    public List<Integer> j;
    public int k;
    public byte l;
    public int m;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<r> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new r(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.c<r, b> {
        public int e;
        public int f;
        public int g;
        public boolean h;
        public c i = c.INV;
        public List<p> j = Collections.emptyList();
        public List<Integer> k = Collections.emptyList();

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
            r f = f();
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
            g((r) hVar);
            return this;
        }

        public final r f() {
            r rVar = new r(this);
            int i = this.e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            rVar.e = this.f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            rVar.f = this.g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            rVar.g = this.h;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            rVar.h = this.i;
            if ((i & 16) == 16) {
                this.j = Collections.unmodifiableList(this.j);
                this.e &= -17;
            }
            rVar.i = this.j;
            if ((this.e & 32) == 32) {
                this.k = Collections.unmodifiableList(this.k);
                this.e &= -33;
            }
            rVar.j = this.k;
            rVar.d = i2;
            return rVar;
        }

        public final void g(r rVar) {
            boolean z;
            boolean z2;
            boolean z3;
            if (rVar == r.n) {
                return;
            }
            int i = rVar.d;
            boolean z4 = false;
            if ((i & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = rVar.e;
                this.e |= 1;
                this.f = i2;
            }
            if ((i & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i3 = rVar.f;
                this.e = 2 | this.e;
                this.g = i3;
            }
            if ((i & 4) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                boolean z5 = rVar.g;
                this.e = 4 | this.e;
                this.h = z5;
            }
            if ((i & 8) == 8) {
                z4 = true;
            }
            if (z4) {
                c cVar = rVar.h;
                cVar.getClass();
                this.e = 8 | this.e;
                this.i = cVar;
            }
            if (!rVar.i.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = rVar.i;
                    this.e &= -17;
                } else {
                    if ((this.e & 16) != 16) {
                        this.j = new ArrayList(this.j);
                        this.e |= 16;
                    }
                    this.j.addAll(rVar.i);
                }
            }
            if (!rVar.j.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = rVar.j;
                    this.e &= -33;
                } else {
                    if ((this.e & 32) != 32) {
                        this.k = new ArrayList(this.k);
                        this.e |= 32;
                    }
                    this.k.addAll(rVar.j);
                }
            }
            e(rVar);
            this.b = this.b.d(rVar.c);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.r$a r0 = com.amazon.aps.iva.id0.r.o     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.r r0 = new com.amazon.aps.iva.id0.r     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.r r3 = (com.amazon.aps.iva.id0.r) r3     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.r.b.h(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public enum c implements i.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        
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
                    return INV;
                }
                return OUT;
            }
            return IN;
        }
    }

    static {
        r rVar = new r(0);
        n = rVar;
        rVar.e = 0;
        rVar.f = 0;
        rVar.g = false;
        rVar.h = c.INV;
        rVar.i = Collections.emptyList();
        rVar.j = Collections.emptyList();
    }

    public r() {
        throw null;
    }

    public r(h.c cVar) {
        super(cVar);
        this.k = -1;
        this.l = (byte) -1;
        this.m = -1;
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
            boolean z = this.g;
            eVar.x(3, 0);
            eVar.q(z ? 1 : 0);
        }
        if ((this.d & 8) == 8) {
            eVar.l(4, this.h.getNumber());
        }
        for (int i = 0; i < this.i.size(); i++) {
            eVar.o(5, this.i.get(i));
        }
        if (this.j.size() > 0) {
            eVar.v(50);
            eVar.v(this.k);
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            eVar.n(this.j.get(i2).intValue());
        }
        aVar.a(1000, eVar);
        eVar.r(this.c);
    }

    @Override // com.amazon.aps.iva.od0.q
    public final com.amazon.aps.iva.od0.p getDefaultInstanceForType() {
        return n;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i;
        int i2 = this.m;
        if (i2 != -1) {
            return i2;
        }
        if ((this.d & 1) == 1) {
            i = com.amazon.aps.iva.od0.e.b(1, this.e) + 0;
        } else {
            i = 0;
        }
        if ((this.d & 2) == 2) {
            i += com.amazon.aps.iva.od0.e.b(2, this.f);
        }
        if ((this.d & 4) == 4) {
            i += com.amazon.aps.iva.od0.e.h(3) + 1;
        }
        if ((this.d & 8) == 8) {
            i += com.amazon.aps.iva.od0.e.a(4, this.h.getNumber());
        }
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            i += com.amazon.aps.iva.od0.e.d(5, this.i.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.j.size(); i5++) {
            i4 += com.amazon.aps.iva.od0.e.c(this.j.get(i5).intValue());
        }
        int i6 = i + i4;
        if (!this.j.isEmpty()) {
            i6 = i6 + 1 + com.amazon.aps.iva.od0.e.c(i4);
        }
        this.k = i4;
        int size = this.c.size() + e() + i6;
        this.m = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        boolean z;
        boolean z2;
        byte b2 = this.l;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i = this.d;
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.l = (byte) 0;
            return false;
        }
        if ((i & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            this.l = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (!this.i.get(i2).isInitialized()) {
                this.l = (byte) 0;
                return false;
            }
        }
        if (!d()) {
            this.l = (byte) 0;
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
        bVar.g(this);
        return bVar;
    }

    public r(int i) {
        this.k = -1;
        this.l = (byte) -1;
        this.m = -1;
        this.c = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        this.k = -1;
        this.l = (byte) -1;
        this.m = -1;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = c.INV;
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        c.b bVar = new c.b();
        com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int n2 = dVar.n();
                        if (n2 != 0) {
                            if (n2 == 8) {
                                this.d |= 1;
                                this.e = dVar.k();
                            } else if (n2 == 16) {
                                this.d |= 2;
                                this.f = dVar.k();
                            } else if (n2 == 24) {
                                this.d |= 4;
                                this.g = dVar.l() != 0;
                            } else if (n2 == 32) {
                                int k = dVar.k();
                                c valueOf = c.valueOf(k);
                                if (valueOf == null) {
                                    j.v(n2);
                                    j.v(k);
                                } else {
                                    this.d |= 8;
                                    this.h = valueOf;
                                }
                            } else if (n2 == 42) {
                                if (!(z2 & true)) {
                                    this.i = new ArrayList();
                                    z2 |= true;
                                }
                                this.i.add(dVar.g(p.v, fVar));
                            } else if (n2 == 48) {
                                if (!(z2 & true)) {
                                    this.j = new ArrayList();
                                    z2 |= true;
                                }
                                this.j.add(Integer.valueOf(dVar.k()));
                            } else if (n2 != 50) {
                                if (!j(dVar, j, fVar, n2)) {
                                }
                            } else {
                                int d = dVar.d(dVar.k());
                                if (!(z2 & true) && dVar.b() > 0) {
                                    this.j = new ArrayList();
                                    z2 |= true;
                                }
                                while (dVar.b() > 0) {
                                    this.j.add(Integer.valueOf(dVar.k()));
                                }
                                dVar.c(d);
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
                if (z2 & true) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if (z2 & true) {
                    this.j = Collections.unmodifiableList(this.j);
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
        if (z2 & true) {
            this.i = Collections.unmodifiableList(this.i);
        }
        if (z2 & true) {
            this.j = Collections.unmodifiableList(this.j);
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
