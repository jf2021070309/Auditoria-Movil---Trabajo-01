package com.amazon.aps.iva.id0;

import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.c;
import com.amazon.aps.iva.od0.h;
import com.amazon.aps.iva.od0.p;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
/* compiled from: ProtoBuf.java */
/* loaded from: classes4.dex */
public final class f extends h.d<f> {
    public static final f h;
    public static final a i = new a();
    public final com.amazon.aps.iva.od0.c c;
    public int d;
    public int e;
    public byte f;
    public int g;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static class a extends com.amazon.aps.iva.od0.b<f> {
        @Override // com.amazon.aps.iva.od0.r
        public final Object a(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
            return new f(dVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes4.dex */
    public static final class b extends h.c<f, b> {
        public int e;
        public int f;

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
            f fVar = new f(this);
            int i = 1;
            if ((this.e & 1) != 1) {
                i = 0;
            }
            fVar.e = this.f;
            fVar.d = i;
            if (fVar.isInitialized()) {
                return fVar;
            }
            throw new com.amazon.aps.iva.od0.v();
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final h.b c() {
            b bVar = new b();
            f fVar = new f(this);
            int i = 1;
            if ((this.e & 1) != 1) {
                i = 0;
            }
            fVar.e = this.f;
            fVar.d = i;
            bVar.f(fVar);
            return bVar;
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final Object clone() throws CloneNotSupportedException {
            b bVar = new b();
            f fVar = new f(this);
            int i = 1;
            if ((this.e & 1) != 1) {
                i = 0;
            }
            fVar.e = this.f;
            fVar.d = i;
            bVar.f(fVar);
            return bVar;
        }

        @Override // com.amazon.aps.iva.od0.h.b
        public final /* bridge */ /* synthetic */ h.b d(com.amazon.aps.iva.od0.h hVar) {
            f((f) hVar);
            return this;
        }

        public final void f(f fVar) {
            boolean z;
            if (fVar == f.h) {
                return;
            }
            if ((fVar.d & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i = fVar.e;
                this.e = 1 | this.e;
                this.f = i;
            }
            e(fVar);
            this.b = this.b.d(fVar.c);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(com.amazon.aps.iva.od0.d r2, com.amazon.aps.iva.od0.f r3) throws java.io.IOException {
            /*
                r1 = this;
                com.amazon.aps.iva.id0.f$a r0 = com.amazon.aps.iva.id0.f.i     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                r0.getClass()     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
                com.amazon.aps.iva.id0.f r0 = new com.amazon.aps.iva.id0.f     // Catch: com.amazon.aps.iva.od0.j -> Le java.lang.Throwable -> L10
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
                com.amazon.aps.iva.id0.f r3 = (com.amazon.aps.iva.id0.f) r3     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.id0.f.b.g(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.f):void");
        }
    }

    static {
        f fVar = new f(0);
        h = fVar;
        fVar.e = 0;
    }

    public f() {
        throw null;
    }

    public f(h.c cVar) {
        super(cVar);
        this.f = (byte) -1;
        this.g = -1;
        this.c = cVar.b;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final void a(com.amazon.aps.iva.od0.e eVar) throws IOException {
        getSerializedSize();
        h.d<MessageType>.a i2 = i();
        if ((this.d & 1) == 1) {
            eVar.m(1, this.e);
        }
        i2.a(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, eVar);
        eVar.r(this.c);
    }

    @Override // com.amazon.aps.iva.od0.q
    public final com.amazon.aps.iva.od0.p getDefaultInstanceForType() {
        return h;
    }

    @Override // com.amazon.aps.iva.od0.p
    public final int getSerializedSize() {
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.d & 1) == 1) {
            i3 = 0 + com.amazon.aps.iva.od0.e.b(1, this.e);
        }
        int size = this.c.size() + e() + i3;
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
        if (!d()) {
            this.f = (byte) 0;
            return false;
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
        b bVar = new b();
        bVar.f(this);
        return bVar;
    }

    public f(int i2) {
        this.f = (byte) -1;
        this.g = -1;
        this.c = com.amazon.aps.iva.od0.c.b;
    }

    public f(com.amazon.aps.iva.od0.d dVar, com.amazon.aps.iva.od0.f fVar) throws com.amazon.aps.iva.od0.j {
        this.f = (byte) -1;
        this.g = -1;
        boolean z = false;
        this.e = 0;
        c.b bVar = new c.b();
        com.amazon.aps.iva.od0.e j = com.amazon.aps.iva.od0.e.j(bVar, 1);
        while (!z) {
            try {
                try {
                    int n = dVar.n();
                    if (n != 0) {
                        if (n != 8) {
                            if (!j(dVar, j, fVar, n)) {
                            }
                        } else {
                            this.d |= 1;
                            this.e = dVar.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        j.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.c = bVar.f();
                        throw th2;
                    }
                    this.c = bVar.f();
                    h();
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
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.c = bVar.f();
            throw th3;
        }
        this.c = bVar.f();
        h();
    }
}
