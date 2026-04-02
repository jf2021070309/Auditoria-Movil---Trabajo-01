package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.z7.e0;
import com.google.common.primitives.UnsignedBytes;
/* compiled from: H265Reader.java */
/* loaded from: classes.dex */
public final class n implements j {
    public final a0 a;
    public String b;
    public com.amazon.aps.iva.x6.f0 c;
    public a d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final r g = new r(32);
    public final r h = new r(33);
    public final r i = new r(34);
    public final r j = new r(39);
    public final r k = new r(40);
    public long m = -9223372036854775807L;
    public final com.amazon.aps.iva.t5.v n = new com.amazon.aps.iva.t5.v();

    /* compiled from: H265Reader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final com.amazon.aps.iva.x6.f0 a;
        public long b;
        public boolean c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public long k;
        public long l;
        public boolean m;

        public a(com.amazon.aps.iva.x6.f0 f0Var) {
            this.a = f0Var;
        }
    }

    public n(a0 a0Var) {
        this.a = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021b  */
    @Override // com.amazon.aps.iva.z7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.amazon.aps.iva.t5.v r36) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z7.n.a(com.amazon.aps.iva.t5.v):void");
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void b() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        com.amazon.aps.iva.u5.d.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        a aVar = this.d;
        if (aVar != null) {
            aVar.f = false;
            aVar.g = false;
            aVar.h = false;
            aVar.i = false;
            aVar.j = false;
        }
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void d(com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        dVar.a();
        dVar.b();
        this.b = dVar.e;
        dVar.b();
        com.amazon.aps.iva.x6.f0 r = pVar.r(dVar.d, 2);
        this.c = r;
        this.d = new a(r);
        this.a.a(pVar, dVar);
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    public final void f(int i, byte[] bArr, int i2) {
        boolean z;
        a aVar = this.d;
        if (aVar.f) {
            int i3 = aVar.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                if ((bArr[i4] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.g = z;
                aVar.f = false;
            } else {
                aVar.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(i, bArr, i2);
            this.h.a(i, bArr, i2);
            this.i.a(i, bArr, i2);
        }
        this.j.a(i, bArr, i2);
        this.k.a(i, bArr, i2);
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void c() {
    }
}
