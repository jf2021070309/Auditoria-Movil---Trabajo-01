package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.p;
import java.io.IOException;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public final class o extends com.amazon.aps.iva.od0.h implements com.amazon.aps.iva.od0.q {
    public static final o f;
    public static final a g = new a();
    public final com.amazon.aps.iva.od0.c b;
    public com.amazon.aps.iva.od0.n c;
    public byte d;
    public int e;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<o> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new o(dVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.b<o, b> implements com.amazon.aps.iva.od0.q {
        public int c;
        public com.amazon.aps.iva.od0.n d = com.amazon.aps.iva.od0.m.c;

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
            o e = e();
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
        public final /* bridge */ /* synthetic */ b d(o oVar) {
            f(oVar);
            return this;
        }

        public final o e() {
            o oVar = new o(this);
            if ((this.c & 1) == 1) {
                this.d = this.d.getUnmodifiableView();
                this.c &= -2;
            }
            oVar.c = this.d;
            return oVar;
        }

        public final void f(o oVar) {
            if (oVar == o.f) {
                return;
            }
            if (!oVar.c.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = oVar.c;
                    this.c &= -2;
                } else {
                    if ((this.c & 1) != 1) {
                        this.d = new com.amazon.aps.iva.od0.m(this.d);
                        this.c |= 1;
                    }
                    this.d.addAll(oVar.c);
                }
            }
            this.b = this.b.d(oVar.b);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(com.amazon.aps.iva.od0.d r1, com.amazon.aps.iva.od0.f r2) throws java.io.IOException {
            /*
                r0 = this;
                com.amazon.aps.iva.id0.o$a r2 = com.amazon.aps.iva.id0.o.g     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r2.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.o r2 = new com.amazon.aps.iva.id0.o     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.o r2 = (com.amazon.aps.iva.id0.o) r2     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.o.b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        o oVar = new o();
        f = oVar;
        oVar.c = com.amazon.aps.iva.od0.m.c;
    }

    public o(h.b bVar) {
        super(0);
        this.d = (byte) -1;
        this.e = -1;
        this.b = bVar.b;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.c.size(); i++) {
            com.amazon.aps.iva.od0.c byteString = this.c.getByteString(i);
            eVar.x(1, 2);
            eVar.v(byteString.size());
            eVar.r(byteString);
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
            com.amazon.aps.iva.od0.c byteString = this.c.getByteString(i3);
            i2 += byteString.size() + com.amazon.aps.iva.od0.e.f(byteString.size());
        }
        int size = this.b.size() + (this.c.size() * 1) + 0 + i2;
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

    public o() {
        this.d = (byte) -1;
        this.e = -1;
        this.b = com.amazon.aps.iva.od0.c.b;
    }

    public o(com.amazon.aps.iva.od0.d dVar) throws com.amazon.aps.iva.od0.j {
        this.d = (byte) -1;
        this.e = -1;
        this.c = com.amazon.aps.iva.od0.m.c;
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
                            com.amazon.aps.iva.od0.o e = dVar.e();
                            if (!(z2 & true)) {
                                this.c = new com.amazon.aps.iva.od0.m();
                                z2 |= true;
                            }
                            this.c.s(e);
                        }
                    }
                    z = true;
                } catch (com.amazon.aps.iva.od0.j e2) {
                    e2.b = this;
                    throw e2;
                } catch (IOException e3) {
                    com.amazon.aps.iva.od0.j jVar = new com.amazon.aps.iva.od0.j(e3.getMessage());
                    jVar.b = this;
                    throw jVar;
                }
            } catch (Throwable th) {
                if (z2 & true) {
                    this.c = this.c.getUnmodifiableView();
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
            this.c = this.c.getUnmodifiableView();
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } finally {
        }
    }
}
