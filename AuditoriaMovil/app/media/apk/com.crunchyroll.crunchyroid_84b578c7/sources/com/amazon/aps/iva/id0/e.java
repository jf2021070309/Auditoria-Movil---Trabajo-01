package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.id0.g;
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
public final class e extends com.amazon.aps.iva.od0.h implements com.amazon.aps.iva.od0.q {
    public static final e j;
    public static final a k = new a();
    public final com.amazon.aps.iva.od0.c b;
    public int c;
    public c d;
    public List<g> e;
    public g f;
    public d g;
    public byte h;
    public int i;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<e> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new e(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.b<e, b> implements com.amazon.aps.iva.od0.q {
        public int c;
        public c d = c.RETURNS_CONSTANT;
        public List<g> e = Collections.emptyList();
        public g f = g.m;
        public d g = d.AT_MOST_ONCE;

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
            e e = e();
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
        public final /* bridge */ /* synthetic */ b d(e eVar) {
            f(eVar);
            return this;
        }

        public final e e() {
            e eVar = new e(this);
            int i = this.c;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            eVar.d = this.d;
            if ((i & 2) == 2) {
                this.e = Collections.unmodifiableList(this.e);
                this.c &= -3;
            }
            eVar.e = this.e;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            eVar.f = this.f;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            eVar.g = this.g;
            eVar.c = i2;
            return eVar;
        }

        public final void f(e eVar) {
            boolean z;
            boolean z2;
            g gVar;
            if (eVar == e.j) {
                return;
            }
            boolean z3 = true;
            if ((eVar.c & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c cVar = eVar.d;
                cVar.getClass();
                this.c |= 1;
                this.d = cVar;
            }
            if (!eVar.e.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = eVar.e;
                    this.c &= -3;
                } else {
                    if ((this.c & 2) != 2) {
                        this.e = new ArrayList(this.e);
                        this.c |= 2;
                    }
                    this.e.addAll(eVar.e);
                }
            }
            if ((eVar.c & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                g gVar2 = eVar.f;
                if ((this.c & 4) == 4 && (gVar = this.f) != g.m) {
                    g.b bVar = new g.b();
                    bVar.f(gVar);
                    bVar.f(gVar2);
                    this.f = bVar.e();
                } else {
                    this.f = gVar2;
                }
                this.c |= 4;
            }
            if ((eVar.c & 4) != 4) {
                z3 = false;
            }
            if (z3) {
                d dVar = eVar.g;
                dVar.getClass();
                this.c |= 8;
                this.g = dVar;
            }
            this.b = this.b.d(eVar.b);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.e$a r0 = com.amazon.aps.iva.id0.e.k     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.e r0 = new com.amazon.aps.iva.id0.e     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.e r3 = (com.amazon.aps.iva.id0.e) r3     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.e.b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public enum c implements i.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        
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
                    return RETURNS_NOT_NULL;
                }
                return CALLS;
            }
            return RETURNS_CONSTANT;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public enum d implements i.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        
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
                    return AT_LEAST_ONCE;
                }
                return EXACTLY_ONCE;
            }
            return AT_MOST_ONCE;
        }
    }

    static {
        e eVar = new e();
        j = eVar;
        eVar.d = c.RETURNS_CONSTANT;
        eVar.e = Collections.emptyList();
        eVar.f = g.m;
        eVar.g = d.AT_MOST_ONCE;
    }

    public e(h.b bVar) {
        super(0);
        this.h = (byte) -1;
        this.i = -1;
        this.b = bVar.b;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        if ((this.c & 1) == 1) {
            eVar.l(1, this.d.getNumber());
        }
        for (int i = 0; i < this.e.size(); i++) {
            eVar.o(2, this.e.get(i));
        }
        if ((this.c & 2) == 2) {
            eVar.o(3, this.f);
        }
        if ((this.c & 4) == 4) {
            eVar.l(4, this.g.getNumber());
        }
        eVar.r(this.b);
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i;
        int i2 = this.i;
        if (i2 != -1) {
            return i2;
        }
        if ((this.c & 1) == 1) {
            i = com.amazon.aps.iva.od0.e.a(1, this.d.getNumber()) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            i += com.amazon.aps.iva.od0.e.d(2, this.e.get(i3));
        }
        if ((this.c & 2) == 2) {
            i += com.amazon.aps.iva.od0.e.d(3, this.f);
        }
        if ((this.c & 4) == 4) {
            i += com.amazon.aps.iva.od0.e.a(4, this.g.getNumber());
        }
        int size = this.b.size() + i;
        this.i = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        boolean z;
        byte b2 = this.h;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < this.e.size(); i++) {
            if (!this.e.get(i).isInitialized()) {
                this.h = (byte) 0;
                return false;
            }
        }
        if ((this.c & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.f.isInitialized()) {
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
        bVar.f(this);
        return bVar;
    }

    public e() {
        this.h = (byte) -1;
        this.i = -1;
        this.b = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        g.b bVar;
        this.h = (byte) -1;
        this.i = -1;
        this.d = c.RETURNS_CONSTANT;
        this.e = Collections.emptyList();
        this.f = g.m;
        this.g = d.AT_MOST_ONCE;
        com.amazon.aps.iva.od0.e j2 = com.amazon.aps.iva.od0.e.j(new c.b(), 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int n = dVar.n();
                        if (n != 0) {
                            if (n == 8) {
                                int k2 = dVar.k();
                                c valueOf = c.valueOf(k2);
                                if (valueOf == null) {
                                    j2.v(n);
                                    j2.v(k2);
                                } else {
                                    this.c |= 1;
                                    this.d = valueOf;
                                }
                            } else if (n == 18) {
                                if (!(z2 & true)) {
                                    this.e = new ArrayList();
                                    z2 |= true;
                                }
                                this.e.add(dVar.g(g.n, fVar));
                            } else if (n == 26) {
                                if ((this.c & 2) == 2) {
                                    g gVar = this.f;
                                    gVar.getClass();
                                    bVar = new g.b();
                                    bVar.f(gVar);
                                } else {
                                    bVar = null;
                                }
                                g gVar2 = (g) dVar.g(g.n, fVar);
                                this.f = gVar2;
                                if (bVar != null) {
                                    bVar.f(gVar2);
                                    this.f = bVar.e();
                                }
                                this.c |= 2;
                            } else if (n != 32) {
                                if (!dVar.q(n, j2)) {
                                }
                            } else {
                                int k3 = dVar.k();
                                d valueOf2 = d.valueOf(k3);
                                if (valueOf2 == null) {
                                    j2.v(n);
                                    j2.v(k3);
                                } else {
                                    this.c |= 4;
                                    this.g = valueOf2;
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
                if (z2 & true) {
                    this.e = Collections.unmodifiableList(this.e);
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                    throw th;
                } finally {
                }
            }
        }
        if (z2 & true) {
            this.e = Collections.unmodifiableList(this.e);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } finally {
        }
    }
}
