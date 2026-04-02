package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.id0.s;
import com.amazon.aps.iva.id0.v;
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
public final class k extends h.d<k> {
    public static final k l;
    public static final a m = new a();
    public final com.amazon.aps.iva.od0.c c;
    public int d;
    public List<h> e;
    public List<m> f;
    public List<q> g;
    public s h;
    public v i;
    public byte j;
    public int k;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<k> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new k(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.c<k, b> {
        public int e;
        public List<h> f = Collections.emptyList();
        public List<m> g = Collections.emptyList();
        public List<q> h = Collections.emptyList();
        public s i = s.h;
        public v j = v.f;

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
            k f = f();
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
            g((k) hVar);
            return this;
        }

        public final k f() {
            k kVar = new k(this);
            int i = this.e;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f = Collections.unmodifiableList(this.f);
                this.e &= -2;
            }
            kVar.e = this.f;
            if ((this.e & 2) == 2) {
                this.g = Collections.unmodifiableList(this.g);
                this.e &= -3;
            }
            kVar.f = this.g;
            if ((this.e & 4) == 4) {
                this.h = Collections.unmodifiableList(this.h);
                this.e &= -5;
            }
            kVar.g = this.h;
            if ((i & 8) != 8) {
                i2 = 0;
            }
            kVar.h = this.i;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            kVar.i = this.j;
            kVar.d = i2;
            return kVar;
        }

        public final void g(k kVar) {
            boolean z;
            v vVar;
            s sVar;
            if (kVar == k.l) {
                return;
            }
            boolean z2 = true;
            if (!kVar.e.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = kVar.e;
                    this.e &= -2;
                } else {
                    if ((this.e & 1) != 1) {
                        this.f = new ArrayList(this.f);
                        this.e |= 1;
                    }
                    this.f.addAll(kVar.e);
                }
            }
            if (!kVar.f.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = kVar.f;
                    this.e &= -3;
                } else {
                    if ((this.e & 2) != 2) {
                        this.g = new ArrayList(this.g);
                        this.e |= 2;
                    }
                    this.g.addAll(kVar.f);
                }
            }
            if (!kVar.g.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = kVar.g;
                    this.e &= -5;
                } else {
                    if ((this.e & 4) != 4) {
                        this.h = new ArrayList(this.h);
                        this.e |= 4;
                    }
                    this.h.addAll(kVar.g);
                }
            }
            if ((kVar.d & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                s sVar2 = kVar.h;
                if ((this.e & 8) == 8 && (sVar = this.i) != s.h) {
                    s.b d = s.d(sVar);
                    d.f(sVar2);
                    this.i = d.e();
                } else {
                    this.i = sVar2;
                }
                this.e |= 8;
            }
            if ((kVar.d & 2) != 2) {
                z2 = false;
            }
            if (z2) {
                v vVar2 = kVar.i;
                if ((this.e & 16) == 16 && (vVar = this.j) != v.f) {
                    v.b bVar = new v.b();
                    bVar.f(vVar);
                    bVar.f(vVar2);
                    this.j = bVar.e();
                } else {
                    this.j = vVar2;
                }
                this.e |= 16;
            }
            e(kVar);
            this.b = this.b.d(kVar.c);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.k$a r0 = com.amazon.aps.iva.id0.k.m     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.k r0 = new com.amazon.aps.iva.id0.k     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.k r3 = (com.amazon.aps.iva.id0.k) r3     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.k.b.h(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        k kVar = new k(0);
        l = kVar;
        kVar.e = Collections.emptyList();
        kVar.f = Collections.emptyList();
        kVar.g = Collections.emptyList();
        kVar.h = s.h;
        kVar.i = v.f;
    }

    public k() {
        throw null;
    }

    public k(h.c cVar) {
        super(cVar);
        this.j = (byte) -1;
        this.k = -1;
        this.c = cVar.b;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        h.d.a aVar = new h.d.a(this);
        for (int i = 0; i < this.e.size(); i++) {
            eVar.o(3, this.e.get(i));
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            eVar.o(4, this.f.get(i2));
        }
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            eVar.o(5, this.g.get(i3));
        }
        if ((this.d & 1) == 1) {
            eVar.o(30, this.h);
        }
        if ((this.d & 2) == 2) {
            eVar.o(32, this.i);
        }
        aVar.a(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, eVar);
        eVar.r(this.c);
    }

    @Override // com.amazon.aps.iva.od0.q
    public final com.amazon.aps.iva.od0.p getDefaultInstanceForType() {
        return l;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            i2 += com.amazon.aps.iva.od0.e.d(3, this.e.get(i3));
        }
        for (int i4 = 0; i4 < this.f.size(); i4++) {
            i2 += com.amazon.aps.iva.od0.e.d(4, this.f.get(i4));
        }
        for (int i5 = 0; i5 < this.g.size(); i5++) {
            i2 += com.amazon.aps.iva.od0.e.d(5, this.g.get(i5));
        }
        if ((this.d & 1) == 1) {
            i2 += com.amazon.aps.iva.od0.e.d(30, this.h);
        }
        if ((this.d & 2) == 2) {
            i2 += com.amazon.aps.iva.od0.e.d(32, this.i);
        }
        int size = this.c.size() + e() + i2;
        this.k = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        boolean z;
        byte b2 = this.j;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < this.e.size(); i++) {
            if (!this.e.get(i).isInitialized()) {
                this.j = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            if (!this.f.get(i2).isInitialized()) {
                this.j = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            if (!this.g.get(i3).isInitialized()) {
                this.j = (byte) 0;
                return false;
            }
        }
        if ((this.d & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.h.isInitialized()) {
            this.j = (byte) 0;
            return false;
        } else if (!d()) {
            this.j = (byte) 0;
            return false;
        } else {
            this.j = (byte) 1;
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

    public k(int i) {
        this.j = (byte) -1;
        this.k = -1;
        this.c = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        this.j = (byte) -1;
        this.k = -1;
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
        this.g = Collections.emptyList();
        this.h = s.h;
        this.i = v.f;
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
                            if (n == 26) {
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.e = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.e.add(dVar.g(h.w, fVar));
                            } else if (n == 34) {
                                boolean z4 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z4) {
                                    this.f = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.f.add(dVar.g(m.w, fVar));
                            } else if (n != 42) {
                                v.b bVar2 = null;
                                s.b bVar3 = null;
                                if (n == 242) {
                                    if ((this.d & 1) == 1) {
                                        s sVar = this.h;
                                        sVar.getClass();
                                        bVar3 = s.d(sVar);
                                    }
                                    s sVar2 = (s) dVar.g(s.i, fVar);
                                    this.h = sVar2;
                                    if (bVar3 != null) {
                                        bVar3.f(sVar2);
                                        this.h = bVar3.e();
                                    }
                                    this.d |= 1;
                                } else if (n != 258) {
                                    if (!j(dVar, j, fVar, n)) {
                                    }
                                } else {
                                    if ((this.d & 2) == 2) {
                                        v vVar = this.i;
                                        vVar.getClass();
                                        bVar2 = new v.b();
                                        bVar2.f(vVar);
                                    }
                                    v vVar2 = (v) dVar.g(v.g, fVar);
                                    this.i = vVar2;
                                    if (bVar2 != null) {
                                        bVar2.f(vVar2);
                                        this.i = bVar2.e();
                                    }
                                    this.d |= 2;
                                }
                            } else {
                                boolean z5 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z5) {
                                    this.g = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.g.add(dVar.g(q.q, fVar));
                            }
                        }
                        z = true;
                    } catch (com.amazon.aps.iva.od0.j e) {
                        e.b = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    com.amazon.aps.iva.od0.j jVar = new com.amazon.aps.iva.od0.j(e2.getMessage());
                    jVar.b = this;
                    throw jVar;
                }
            } catch (Throwable th) {
                if ((z2 ? 1 : 0) & true) {
                    this.e = Collections.unmodifiableList(this.e);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.f = Collections.unmodifiableList(this.f);
                }
                if ((z2 ? 1 : 0) & true) {
                    this.g = Collections.unmodifiableList(this.g);
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
            this.e = Collections.unmodifiableList(this.e);
        }
        if ((z2 ? 1 : 0) & true) {
            this.f = Collections.unmodifiableList(this.f);
        }
        if ((z2 ? 1 : 0) & true) {
            this.g = Collections.unmodifiableList(this.g);
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
