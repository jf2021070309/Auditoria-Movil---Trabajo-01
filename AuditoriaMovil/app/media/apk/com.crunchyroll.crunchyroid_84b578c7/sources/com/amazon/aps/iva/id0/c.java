package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public final class c extends h.d<c> {
    public static final c j;
    public static final a k = new a();
    public final com.amazon.aps.iva.od0.c c;
    public int d;
    public int e;
    public List<t> f;
    public List<Integer> g;
    public byte h;
    public int i;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<c> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new c(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.c<c, b> {
        public int e;
        public int f = 6;
        public List<t> g = Collections.emptyList();
        public List<Integer> h = Collections.emptyList();

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
            c f = f();
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
            g((c) hVar);
            return this;
        }

        public final c f() {
            c cVar = new c(this);
            int i = this.e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            cVar.e = this.f;
            if ((i & 2) == 2) {
                this.g = Collections.unmodifiableList(this.g);
                this.e &= -3;
            }
            cVar.f = this.g;
            if ((this.e & 4) == 4) {
                this.h = Collections.unmodifiableList(this.h);
                this.e &= -5;
            }
            cVar.g = this.h;
            cVar.d = i2;
            return cVar;
        }

        public final void g(c cVar) {
            boolean z;
            if (cVar == c.j) {
                return;
            }
            if ((cVar.d & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i = cVar.e;
                this.e = 1 | this.e;
                this.f = i;
            }
            if (!cVar.f.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = cVar.f;
                    this.e &= -3;
                } else {
                    if ((this.e & 2) != 2) {
                        this.g = new ArrayList(this.g);
                        this.e |= 2;
                    }
                    this.g.addAll(cVar.f);
                }
            }
            if (!cVar.g.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = cVar.g;
                    this.e &= -5;
                } else {
                    if ((this.e & 4) != 4) {
                        this.h = new ArrayList(this.h);
                        this.e |= 4;
                    }
                    this.h.addAll(cVar.g);
                }
            }
            e(cVar);
            this.b = this.b.d(cVar.c);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.c$a r0 = com.amazon.aps.iva.id0.c.k     // Catch: java.lang.Throwable -> Lc com.amazon.aps.iva.od0.j -> Le
                java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Lc com.amazon.aps.iva.od0.j -> Le
                com.amazon.aps.iva.id0.c r2 = (com.amazon.aps.iva.id0.c) r2     // Catch: java.lang.Throwable -> Lc com.amazon.aps.iva.od0.j -> Le
                r1.g(r2)
                return
            Lc:
                r2 = move-exception
                goto L16
            Le:
                r2 = move-exception
                com.amazon.aps.iva.od0.p r3 = r2.b     // Catch: java.lang.Throwable -> Lc
                com.amazon.aps.iva.id0.c r3 = (com.amazon.aps.iva.id0.c) r3     // Catch: java.lang.Throwable -> Lc
                throw r2     // Catch: java.lang.Throwable -> L14
            L14:
                r2 = move-exception
                goto L17
            L16:
                r3 = 0
            L17:
                if (r3 == 0) goto L1c
                r1.g(r3)
            L1c:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.c.b.h(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        c cVar = new c(0);
        j = cVar;
        cVar.e = 6;
        cVar.f = Collections.emptyList();
        cVar.g = Collections.emptyList();
    }

    public c() {
        throw null;
    }

    public c(h.c cVar) {
        super(cVar);
        this.h = (byte) -1;
        this.i = -1;
        this.c = cVar.b;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        h.d.a aVar = new h.d.a(this);
        if ((this.d & 1) == 1) {
            eVar.m(1, this.e);
        }
        for (int i = 0; i < this.f.size(); i++) {
            eVar.o(2, this.f.get(i));
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            eVar.m(31, this.g.get(i2).intValue());
        }
        aVar.a(19000, eVar);
        eVar.r(this.c);
    }

    @Override // com.amazon.aps.iva.od0.q
    public final com.amazon.aps.iva.od0.p getDefaultInstanceForType() {
        return j;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i;
        int i2 = this.i;
        if (i2 != -1) {
            return i2;
        }
        if ((this.d & 1) == 1) {
            i = com.amazon.aps.iva.od0.e.b(1, this.e) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            i += com.amazon.aps.iva.od0.e.d(2, this.f.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.g.size(); i5++) {
            i4 += com.amazon.aps.iva.od0.e.c(this.g.get(i5).intValue());
        }
        int size = this.c.size() + e() + (this.g.size() * 2) + i + i4;
        this.i = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        byte b2 = this.h;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < this.f.size(); i++) {
            if (!this.f.get(i).isInitialized()) {
                this.h = (byte) 0;
                return false;
            }
        }
        if (!d()) {
            this.h = (byte) 0;
            return false;
        }
        this.h = (byte) 1;
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

    public c(int i) {
        this.h = (byte) -1;
        this.i = -1;
        this.c = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        this.h = (byte) -1;
        this.i = -1;
        this.e = 6;
        this.f = Collections.emptyList();
        this.g = Collections.emptyList();
        c.b bVar = new c.b();
        com.amazon.aps.iva.od0.e j2 = com.amazon.aps.iva.od0.e.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int n = dVar.n();
                    if (n != 0) {
                        if (n == 8) {
                            this.d |= 1;
                            this.e = dVar.k();
                        } else if (n == 18) {
                            if (!(z2 & true)) {
                                this.f = new ArrayList();
                                z2 |= true;
                            }
                            this.f.add(dVar.g(t.n, fVar));
                        } else if (n == 248) {
                            if (!(z2 & true)) {
                                this.g = new ArrayList();
                                z2 |= true;
                            }
                            this.g.add(Integer.valueOf(dVar.k()));
                        } else if (n != 250) {
                            if (!j(dVar, j2, fVar, n)) {
                            }
                        } else {
                            int d = dVar.d(dVar.k());
                            if (!(z2 & true) && dVar.b() > 0) {
                                this.g = new ArrayList();
                                z2 |= true;
                            }
                            while (dVar.b() > 0) {
                                this.g.add(Integer.valueOf(dVar.k()));
                            }
                            dVar.c(d);
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    if (z2 & true) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    try {
                        j2.i();
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
        }
        if (z2 & true) {
            this.f = Collections.unmodifiableList(this.f);
        }
        if (z2 & true) {
            this.g = Collections.unmodifiableList(this.g);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
            this.c = bVar.f();
            h();
        } catch (Throwable th3) {
            this.c = bVar.f();
            throw th3;
        }
    }
}
