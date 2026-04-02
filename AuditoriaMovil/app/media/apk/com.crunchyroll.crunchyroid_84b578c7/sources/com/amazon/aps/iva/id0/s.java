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
public final class s extends com.amazon.aps.iva.od0.h implements com.amazon.aps.iva.od0.q {
    public static final s h;
    public static final a i = new a();
    public final com.amazon.aps.iva.od0.c b;
    public int c;
    public List<p> d;
    public int e;
    public byte f;
    public int g;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<s> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new s(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.b<s, b> implements com.amazon.aps.iva.od0.q {
        public int c;
        public List<p> d = Collections.emptyList();
        public int e = -1;

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
            s e = e();
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
        public final /* bridge */ /* synthetic */ b d(s sVar) {
            f(sVar);
            return this;
        }

        public final s e() {
            s sVar = new s(this);
            int i = this.c;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.d = Collections.unmodifiableList(this.d);
                this.c &= -2;
            }
            sVar.d = this.d;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            sVar.e = this.e;
            sVar.c = i2;
            return sVar;
        }

        public final void f(s sVar) {
            if (sVar == s.h) {
                return;
            }
            boolean z = true;
            if (!sVar.d.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = sVar.d;
                    this.c &= -2;
                } else {
                    if ((this.c & 1) != 1) {
                        this.d = new ArrayList(this.d);
                        this.c |= 1;
                    }
                    this.d.addAll(sVar.d);
                }
            }
            if ((sVar.c & 1) != 1) {
                z = false;
            }
            if (z) {
                int i = sVar.e;
                this.c |= 2;
                this.e = i;
            }
            this.b = this.b.d(sVar.b);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.s$a r0 = com.amazon.aps.iva.id0.s.i     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.s r0 = new com.amazon.aps.iva.id0.s     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.s r3 = (com.amazon.aps.iva.id0.s) r3     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.s.b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        s sVar = new s();
        h = sVar;
        sVar.d = Collections.emptyList();
        sVar.e = -1;
    }

    public s(h.b bVar) {
        super(0);
        this.f = (byte) -1;
        this.g = -1;
        this.b = bVar.b;
    }

    public static b d(s sVar) {
        b bVar = new b();
        bVar.f(sVar);
        return bVar;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            eVar.o(1, this.d.get(i2));
        }
        if ((this.c & 1) == 1) {
            eVar.m(2, this.e);
        }
        eVar.r(this.b);
    }

    public final b e() {
        return d(this);
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.d.size(); i4++) {
            i3 += com.amazon.aps.iva.od0.e.d(1, this.d.get(i4));
        }
        if ((this.c & 1) == 1) {
            i3 += com.amazon.aps.iva.od0.e.b(2, this.e);
        }
        int size = this.b.size() + i3;
        this.g = size;
        return size;
    }

    @Override // com.amazon.aps.iva.od0.q
    public final boolean isInitialized() {
        byte b2 = this.f;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            if (!this.d.get(i2).isInitialized()) {
                this.f = (byte) 0;
                return false;
            }
        }
        this.f = (byte) 1;
        return true;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final p.a newBuilderForType() {
        return new b();
    }

    @Override // com.amazon.aps.iva.od0.p
    public final p.a toBuilder() {
        return d(this);
    }

    public s() {
        this.f = (byte) -1;
        this.g = -1;
        this.b = com.amazon.aps.iva.od0.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        this.f = (byte) -1;
        this.g = -1;
        this.d = Collections.emptyList();
        this.e = -1;
        com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(new c.b(), 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int n = dVar.n();
                    if (n != 0) {
                        if (n == 10) {
                            if (!(z2 & true)) {
                                this.d = new ArrayList();
                                z2 |= true;
                            }
                            this.d.add(dVar.g(p.v, fVar));
                        } else if (n != 16) {
                            if (!dVar.q(n, j)) {
                            }
                        } else {
                            this.c |= 1;
                            this.e = dVar.k();
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
                    this.d = Collections.unmodifiableList(this.d);
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
            this.d = Collections.unmodifiableList(this.d);
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } finally {
        }
    }
}
