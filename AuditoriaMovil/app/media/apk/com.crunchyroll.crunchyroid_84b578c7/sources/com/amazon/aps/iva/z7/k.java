package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.z7.e0;
import java.util.Arrays;
/* compiled from: H262Reader.java */
/* loaded from: classes.dex */
public final class k implements j {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public com.amazon.aps.iva.x6.f0 b;
    public final f0 c;
    public final com.amazon.aps.iva.t5.v d;
    public final r e;
    public final boolean[] f = new boolean[4];
    public final a g = new a();
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    /* compiled from: H262Reader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static final byte[] e = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public byte[] d = new byte[128];

        public final void a(int i, byte[] bArr, int i2) {
            if (!this.a) {
                return;
            }
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.b;
            if (length < i4 + i3) {
                this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.d, this.b, i3);
            this.b += i3;
        }
    }

    public k(f0 f0Var) {
        this.c = f0Var;
        if (f0Var != null) {
            this.e = new r(178);
            this.d = new com.amazon.aps.iva.t5.v();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e6  */
    @Override // com.amazon.aps.iva.z7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.amazon.aps.iva.t5.v r21) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z7.k.a(com.amazon.aps.iva.t5.v):void");
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void b() {
        com.amazon.aps.iva.u5.d.a(this.f);
        a aVar = this.g;
        aVar.a = false;
        aVar.b = 0;
        aVar.c = 0;
        r rVar = this.e;
        if (rVar != null) {
            rVar.c();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void d(com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        dVar.a();
        dVar.b();
        this.a = dVar.e;
        dVar.b();
        this.b = pVar.r(dVar.d, 2);
        f0 f0Var = this.c;
        if (f0Var != null) {
            f0Var.b(pVar, dVar);
        }
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void e(int i, long j) {
        this.l = j;
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void c() {
    }
}
