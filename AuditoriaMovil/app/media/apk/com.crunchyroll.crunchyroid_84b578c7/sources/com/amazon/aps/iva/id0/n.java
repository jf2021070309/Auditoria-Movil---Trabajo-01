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
public final class n extends com.amazon.aps.iva.od0.h implements com.amazon.aps.iva.od0.q {
    public static final n f;
    public static final a g = new a();
    public final com.amazon.aps.iva.od0.c b;
    public List<c> c;
    public byte d;
    public int e;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<n> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new n(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.b<n, b> implements com.amazon.aps.iva.od0.q {
        public int c;
        public List<c> d = Collections.emptyList();

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
            n e = e();
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
        public final /* bridge */ /* synthetic */ b d(n nVar) {
            f(nVar);
            return this;
        }

        public final n e() {
            n nVar = new n(this);
            if ((this.c & 1) == 1) {
                this.d = Collections.unmodifiableList(this.d);
                this.c &= -2;
            }
            nVar.c = this.d;
            return nVar;
        }

        public final void f(n nVar) {
            if (nVar == n.f) {
                return;
            }
            if (!nVar.c.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = nVar.c;
                    this.c &= -2;
                } else {
                    if ((this.c & 1) != 1) {
                        this.d = new ArrayList(this.d);
                        this.c |= 1;
                    }
                    this.d.addAll(nVar.c);
                }
            }
            this.b = this.b.d(nVar.b);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.n$a r0 = com.amazon.aps.iva.id0.n.g     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.n r0 = new com.amazon.aps.iva.id0.n     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.n r3 = (com.amazon.aps.iva.id0.n) r3     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.n.b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        n nVar = new n();
        f = nVar;
        nVar.c = Collections.emptyList();
    }

    public n(h.b bVar) {
        super(0);
        this.d = (byte) -1;
        this.e = -1;
        this.b = bVar.b;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.c.size(); i++) {
            eVar.o(1, this.c.get(i));
        }
        eVar.r(this.b);
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            i2 += com.amazon.aps.iva.od0.e.d(1, this.c.get(i3));
        }
        int size = this.b.size() + i2;
        this.e = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        byte b2 = this.d;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < this.c.size(); i++) {
            if (!this.c.get(i).isInitialized()) {
                this.d = (byte) 0;
                return false;
            }
        }
        this.d = (byte) 1;
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

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.od0.h implements com.amazon.aps.iva.od0.q {
        public static final c i;
        public static final a j = new a();
        public final com.amazon.aps.iva.od0.c b;
        public int c;
        public int d;
        public int e;
        public EnumC0374c f;
        public byte g;
        public int h;

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes4.dex */
        public static class a extends com.amazon.aps.iva.od0.b<c> {
            @Override // com.amazon.aps.iva.od0.r
            public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
                return new c(dVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes4.dex */
        public static final class b extends h.b<c, b> implements com.amazon.aps.iva.od0.q {
            public int c;
            public int e;
            public int d = -1;
            public EnumC0374c f = EnumC0374c.PACKAGE;

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
                cVar.c = i2;
                return cVar;
            }

            public final void f(c cVar) {
                boolean z;
                boolean z2;
                if (cVar == c.i) {
                    return;
                }
                int i = cVar.c;
                boolean z3 = false;
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
                }
                if (z3) {
                    EnumC0374c enumC0374c = cVar.f;
                    enumC0374c.getClass();
                    this.c = 4 | this.c;
                    this.f = enumC0374c;
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
                    com.amazon.aps.iva.id0.n$c$a r2 = com.amazon.aps.iva.id0.n.c.j     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    r2.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                    com.amazon.aps.iva.id0.n$c r2 = new com.amazon.aps.iva.id0.n$c     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                    com.amazon.aps.iva.id0.n$c r2 = (com.amazon.aps.iva.id0.n.c) r2     // Catch: java.lang.Throwable -> L10
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
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.n.c.b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: com.amazon.aps.iva.id0.n$c$c  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public enum EnumC0374c implements i.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            
            private static i.b<EnumC0374c> internalValueMap = new a();
            private final int value;

            /* compiled from: ProtoBuf.java */
            /* renamed from: com.amazon.aps.iva.id0.n$c$c$a */
            /* loaded from: classes4.dex */
            public static class a implements i.b<EnumC0374c> {
                @Override // com.amazon.aps.iva.od0.i.b
                public final EnumC0374c findValueByNumber(int i) {
                    return EnumC0374c.valueOf(i);
                }
            }

            EnumC0374c(int i, int i2) {
                this.value = i2;
            }

            @Override // com.amazon.aps.iva.od0.i.a
            public final int getNumber() {
                return this.value;
            }

            public static EnumC0374c valueOf(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return LOCAL;
                    }
                    return PACKAGE;
                }
                return CLASS;
            }
        }

        static {
            c cVar = new c();
            i = cVar;
            cVar.d = -1;
            cVar.e = 0;
            cVar.f = EnumC0374c.PACKAGE;
        }

        public c(h.b bVar) {
            super(0);
            this.g = (byte) -1;
            this.h = -1;
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
            eVar.r(this.b);
        }

        @Override // com.amazon.aps.iva.od0.p
        public final int getSerializedSize() {
            int i2 = this.h;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.c & 1) == 1) {
                i3 = 0 + com.amazon.aps.iva.od0.e.b(1, this.d);
            }
            if ((this.c & 2) == 2) {
                i3 += com.amazon.aps.iva.od0.e.b(2, this.e);
            }
            if ((this.c & 4) == 4) {
                i3 += com.amazon.aps.iva.od0.e.a(3, this.f.getNumber());
            }
            int size = this.b.size() + i3;
            this.h = size;
            return size;
        }

        @Override // com.amazon.aps.iva.od0.q
        public final boolean isInitialized() {
            boolean z;
            byte b2 = this.g;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if ((this.c & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.g = (byte) 0;
                return false;
            }
            this.g = (byte) 1;
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
            this.g = (byte) -1;
            this.h = -1;
            this.b = com.amazon.aps.iva.od0.c.b;
        }

        public c(com.amazon.aps.iva.od0.d dVar) throws com.amazon.aps.iva.od0.j {
            this.g = (byte) -1;
            this.h = -1;
            this.d = -1;
            boolean z = false;
            this.e = 0;
            this.f = EnumC0374c.PACKAGE;
            c.b bVar = new c.b();
            com.amazon.aps.iva.od0.e j2 = com.amazon.aps.iva.od0.e.j(bVar, 1);
            while (!z) {
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
                            } else if (n != 24) {
                                if (!dVar.q(n, j2)) {
                                }
                            } else {
                                int k = dVar.k();
                                EnumC0374c valueOf = EnumC0374c.valueOf(k);
                                if (valueOf == null) {
                                    j2.v(n);
                                    j2.v(k);
                                } else {
                                    this.c |= 4;
                                    this.f = valueOf;
                                }
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        try {
                            j2.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.b = bVar.f();
                            throw th2;
                        }
                        this.b = bVar.f();
                        throw th;
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
            try {
                j2.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.b = bVar.f();
                throw th3;
            }
            this.b = bVar.f();
        }
    }

    public n() {
        this.d = (byte) -1;
        this.e = -1;
        this.b = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        this.d = (byte) -1;
        this.e = -1;
        this.c = Collections.emptyList();
        com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(new c.b(), 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int n = dVar.n();
                    if (n != 0) {
                        if (n != 10) {
                            if (!dVar.q(n, j)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.c = new ArrayList();
                                z2 |= true;
                            }
                            this.c.add(dVar.g(c.j, fVar));
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
                    this.c = Collections.unmodifiableList(this.c);
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
        try {
            j.i();
        } catch (IOException unused2) {
        } finally {
        }
    }
}
