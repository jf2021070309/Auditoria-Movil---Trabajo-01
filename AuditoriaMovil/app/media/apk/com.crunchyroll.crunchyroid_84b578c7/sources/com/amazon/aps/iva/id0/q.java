package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.id0.p;
import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.p;
import com.google.ads.AdSize;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public final class q extends h.d<q> {
    public static final q p;
    public static final a q = new a();
    public final com.amazon.aps.iva.od0.c c;
    public int d;
    public int e;
    public int f;
    public List<r> g;
    public p h;
    public int i;
    public p j;
    public int k;
    public List<com.amazon.aps.iva.id0.a> l;
    public List<Integer> m;
    public byte n;
    public int o;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<q> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new q(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.c<q, b> {
        public int e;
        public int g;
        public p i;
        public int j;
        public p k;
        public int l;
        public List<com.amazon.aps.iva.id0.a> m;
        public List<Integer> n;
        public int f = 6;
        public List<r> h = Collections.emptyList();

        public b() {
            p pVar = p.u;
            this.i = pVar;
            this.k = pVar;
            this.m = Collections.emptyList();
            this.n = Collections.emptyList();
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
            q f = f();
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
            g((q) hVar);
            return this;
        }

        public final q f() {
            q qVar = new q(this);
            int i = this.e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            qVar.e = this.f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            qVar.f = this.g;
            if ((i & 4) == 4) {
                this.h = Collections.unmodifiableList(this.h);
                this.e &= -5;
            }
            qVar.g = this.h;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            qVar.h = this.i;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            qVar.i = this.j;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            qVar.j = this.k;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            qVar.k = this.l;
            if ((this.e & 128) == 128) {
                this.m = Collections.unmodifiableList(this.m);
                this.e &= -129;
            }
            qVar.l = this.m;
            if ((this.e & 256) == 256) {
                this.n = Collections.unmodifiableList(this.n);
                this.e &= -257;
            }
            qVar.m = this.n;
            qVar.d = i2;
            return qVar;
        }

        public final void g(q qVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            p pVar;
            p pVar2;
            if (qVar == q.p) {
                return;
            }
            int i = qVar.d;
            boolean z6 = false;
            if ((i & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = qVar.e;
                this.e |= 1;
                this.f = i2;
            }
            if ((i & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i3 = qVar.f;
                this.e = 2 | this.e;
                this.g = i3;
            }
            if (!qVar.g.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = qVar.g;
                    this.e &= -5;
                } else {
                    if ((this.e & 4) != 4) {
                        this.h = new ArrayList(this.h);
                        this.e |= 4;
                    }
                    this.h.addAll(qVar.g);
                }
            }
            if ((qVar.d & 4) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                p pVar3 = qVar.h;
                if ((this.e & 8) == 8 && (pVar2 = this.i) != p.u) {
                    p.c n = p.n(pVar2);
                    n.g(pVar3);
                    this.i = n.f();
                } else {
                    this.i = pVar3;
                }
                this.e |= 8;
            }
            int i4 = qVar.d;
            if ((i4 & 8) == 8) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                int i5 = qVar.i;
                this.e |= 16;
                this.j = i5;
            }
            if ((i4 & 16) == 16) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                p pVar4 = qVar.j;
                if ((this.e & 32) == 32 && (pVar = this.k) != p.u) {
                    p.c n2 = p.n(pVar);
                    n2.g(pVar4);
                    this.k = n2.f();
                } else {
                    this.k = pVar4;
                }
                this.e |= 32;
            }
            if ((qVar.d & 32) == 32) {
                z6 = true;
            }
            if (z6) {
                int i6 = qVar.k;
                this.e |= 64;
                this.l = i6;
            }
            if (!qVar.l.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = qVar.l;
                    this.e &= -129;
                } else {
                    if ((this.e & 128) != 128) {
                        this.m = new ArrayList(this.m);
                        this.e |= 128;
                    }
                    this.m.addAll(qVar.l);
                }
            }
            if (!qVar.m.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = qVar.m;
                    this.e &= -257;
                } else {
                    if ((this.e & 256) != 256) {
                        this.n = new ArrayList(this.n);
                        this.e |= 256;
                    }
                    this.n.addAll(qVar.m);
                }
            }
            e(qVar);
            this.b = this.b.d(qVar.c);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.q$a r0 = com.amazon.aps.iva.id0.q.q     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.q r0 = new com.amazon.aps.iva.id0.q     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.q r3 = (com.amazon.aps.iva.id0.q) r3     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.q.b.h(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        q qVar = new q(0);
        p = qVar;
        qVar.l();
    }

    public q() {
        throw null;
    }

    public q(h.c cVar) {
        super(cVar);
        this.n = (byte) -1;
        this.o = -1;
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
        for (int i = 0; i < this.g.size(); i++) {
            eVar.o(3, this.g.get(i));
        }
        if ((this.d & 4) == 4) {
            eVar.o(4, this.h);
        }
        if ((this.d & 8) == 8) {
            eVar.m(5, this.i);
        }
        if ((this.d & 16) == 16) {
            eVar.o(6, this.j);
        }
        if ((this.d & 32) == 32) {
            eVar.m(7, this.k);
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            eVar.o(8, this.l.get(i2));
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            eVar.m(31, this.m.get(i3).intValue());
        }
        aVar.a(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, eVar);
        eVar.r(this.c);
    }

    @Override // com.amazon.aps.iva.od0.q
    public final com.amazon.aps.iva.od0.p getDefaultInstanceForType() {
        return p;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i;
        int i2 = this.o;
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
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            i += com.amazon.aps.iva.od0.e.d(3, this.g.get(i3));
        }
        if ((this.d & 4) == 4) {
            i += com.amazon.aps.iva.od0.e.d(4, this.h);
        }
        if ((this.d & 8) == 8) {
            i += com.amazon.aps.iva.od0.e.b(5, this.i);
        }
        if ((this.d & 16) == 16) {
            i += com.amazon.aps.iva.od0.e.d(6, this.j);
        }
        if ((this.d & 32) == 32) {
            i += com.amazon.aps.iva.od0.e.b(7, this.k);
        }
        for (int i4 = 0; i4 < this.l.size(); i4++) {
            i += com.amazon.aps.iva.od0.e.d(8, this.l.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.m.size(); i6++) {
            i5 += com.amazon.aps.iva.od0.e.c(this.m.get(i6).intValue());
        }
        int size = this.c.size() + e() + (this.m.size() * 2) + i + i5;
        this.o = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        boolean z;
        boolean z2;
        boolean z3;
        byte b2 = this.n;
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
        if (!z) {
            this.n = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            if (!this.g.get(i).isInitialized()) {
                this.n = (byte) 0;
                return false;
            }
        }
        if ((this.d & 4) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !this.h.isInitialized()) {
            this.n = (byte) 0;
            return false;
        }
        if ((this.d & 16) == 16) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && !this.j.isInitialized()) {
            this.n = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (!this.l.get(i2).isInitialized()) {
                this.n = (byte) 0;
                return false;
            }
        }
        if (!d()) {
            this.n = (byte) 0;
            return false;
        }
        this.n = (byte) 1;
        return true;
    }

    public final void l() {
        this.e = 6;
        this.f = 0;
        this.g = Collections.emptyList();
        p pVar = p.u;
        this.h = pVar;
        this.i = 0;
        this.j = pVar;
        this.k = 0;
        this.l = Collections.emptyList();
        this.m = Collections.emptyList();
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

    public q(int i) {
        this.n = (byte) -1;
        this.o = -1;
        this.c = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public q(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        this.n = (byte) -1;
        this.o = -1;
        l();
        c.b bVar = new c.b();
        com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            ?? r5 = 128;
            if (!z) {
                try {
                    try {
                        try {
                            int n = dVar.n();
                            p.c cVar = null;
                            switch (n) {
                                case 0:
                                    break;
                                case 8:
                                    this.d |= 1;
                                    this.e = dVar.k();
                                    continue;
                                case 16:
                                    this.d |= 2;
                                    this.f = dVar.k();
                                    continue;
                                case 26:
                                    if (!(z2 & true)) {
                                        this.g = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.g.add(dVar.g(r.o, fVar));
                                    continue;
                                case 34:
                                    if ((this.d & 4) == 4) {
                                        p pVar = this.h;
                                        pVar.getClass();
                                        cVar = p.n(pVar);
                                    }
                                    p pVar2 = (p) dVar.g(p.v, fVar);
                                    this.h = pVar2;
                                    if (cVar != null) {
                                        cVar.g(pVar2);
                                        this.h = cVar.f();
                                    }
                                    this.d |= 4;
                                    continue;
                                case 40:
                                    this.d |= 8;
                                    this.i = dVar.k();
                                    continue;
                                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                                    if ((this.d & 16) == 16) {
                                        p pVar3 = this.j;
                                        pVar3.getClass();
                                        cVar = p.n(pVar3);
                                    }
                                    p pVar4 = (p) dVar.g(p.v, fVar);
                                    this.j = pVar4;
                                    if (cVar != null) {
                                        cVar.g(pVar4);
                                        this.j = cVar.f();
                                    }
                                    this.d |= 16;
                                    continue;
                                case 56:
                                    this.d |= 32;
                                    this.k = dVar.k();
                                    continue;
                                case 66:
                                    if (!(z2 & true)) {
                                        this.l = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.l.add(dVar.g(com.amazon.aps.iva.id0.a.i, fVar));
                                    continue;
                                case 248:
                                    if (!(z2 & true)) {
                                        this.m = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.m.add(Integer.valueOf(dVar.k()));
                                    continue;
                                case 250:
                                    int d = dVar.d(dVar.k());
                                    if (!(z2 & true) && dVar.b() > 0) {
                                        this.m = new ArrayList();
                                        z2 |= true;
                                    }
                                    while (dVar.b() > 0) {
                                        this.m.add(Integer.valueOf(dVar.k()));
                                    }
                                    dVar.c(d);
                                    continue;
                                    break;
                                default:
                                    r5 = j(dVar, j, fVar, n);
                                    if (r5 == 0) {
                                        break;
                                    } else {
                                        continue;
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
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    if ((z2 & true) == r5) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    if (z2 & true) {
                        this.m = Collections.unmodifiableList(this.m);
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
            } else {
                if (z2 & true) {
                    this.g = Collections.unmodifiableList(this.g);
                }
                if (z2 & true) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if (z2 & true) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                try {
                    j.i();
                } catch (IOException unused2) {
                    this.c = bVar.f();
                    h();
                    return;
                } catch (Throwable th3) {
                    this.c = bVar.f();
                    throw th3;
                }
            }
        }
    }
}
