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
public final class v extends com.amazon.aps.iva.od0.h implements com.amazon.aps.iva.od0.q {
    public static final v f;
    public static final a g = new a();
    public final com.amazon.aps.iva.od0.c b;
    public List<u> c;
    public byte d;
    public int e;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<v> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new v(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.b<v, b> implements com.amazon.aps.iva.od0.q {
        public int c;
        public List<u> d = Collections.emptyList();

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
            v e = e();
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
        public final /* bridge */ /* synthetic */ b d(v vVar) {
            f(vVar);
            return this;
        }

        public final v e() {
            v vVar = new v(this);
            if ((this.c & 1) == 1) {
                this.d = Collections.unmodifiableList(this.d);
                this.c &= -2;
            }
            vVar.c = this.d;
            return vVar;
        }

        public final void f(v vVar) {
            if (vVar == v.f) {
                return;
            }
            if (!vVar.c.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = vVar.c;
                    this.c &= -2;
                } else {
                    if ((this.c & 1) != 1) {
                        this.d = new ArrayList(this.d);
                        this.c |= 1;
                    }
                    this.d.addAll(vVar.c);
                }
            }
            this.b = this.b.d(vVar.b);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.v$a r0 = com.amazon.aps.iva.id0.v.g     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.v r0 = new com.amazon.aps.iva.id0.v     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.v r3 = (com.amazon.aps.iva.id0.v) r3     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.v.b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        v vVar = new v();
        f = vVar;
        vVar.c = Collections.emptyList();
    }

    public v(h.b bVar) {
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

    public v() {
        this.d = (byte) -1;
        this.e = -1;
        this.b = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
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
                            this.c.add(dVar.g(u.m, fVar));
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
