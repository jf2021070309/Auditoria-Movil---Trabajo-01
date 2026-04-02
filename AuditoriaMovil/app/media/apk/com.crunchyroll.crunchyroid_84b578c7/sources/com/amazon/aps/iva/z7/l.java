package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.z7.e0;
import java.util.Arrays;
/* compiled from: H263Reader.java */
/* loaded from: classes.dex */
public final class l implements j {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final f0 a;
    public b f;
    public long g;
    public String h;
    public com.amazon.aps.iva.x6.f0 i;
    public boolean j;
    public final boolean[] c = new boolean[4];
    public final a d = new a();
    public long k = -9223372036854775807L;
    public final r e = new r(178);
    public final com.amazon.aps.iva.t5.v b = new com.amazon.aps.iva.t5.v();

    /* compiled from: H263Reader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static final byte[] f = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public int d;
        public byte[] e = new byte[128];

        public final void a(int i, byte[] bArr, int i2) {
            if (!this.a) {
                return;
            }
            int i3 = i2 - i;
            byte[] bArr2 = this.e;
            int length = bArr2.length;
            int i4 = this.c;
            if (length < i4 + i3) {
                this.e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.e, this.c, i3);
            this.c += i3;
        }
    }

    /* compiled from: H263Reader.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final com.amazon.aps.iva.x6.f0 a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public long g;
        public long h;

        public b(com.amazon.aps.iva.x6.f0 f0Var) {
            this.a = f0Var;
        }

        public final void a(int i, byte[] bArr, int i2) {
            boolean z;
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    if (((bArr[i4] & 192) >> 6) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.d = z;
                    this.c = false;
                    return;
                }
                this.f = (i2 - i) + i3;
            }
        }
    }

    public l(f0 f0Var) {
        this.a = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0260 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01dc  */
    @Override // com.amazon.aps.iva.z7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.amazon.aps.iva.t5.v r25) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z7.l.a(com.amazon.aps.iva.t5.v):void");
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void b() {
        com.amazon.aps.iva.u5.d.a(this.c);
        a aVar = this.d;
        aVar.a = false;
        aVar.c = 0;
        aVar.b = 0;
        b bVar = this.f;
        if (bVar != null) {
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            bVar.e = -1;
        }
        r rVar = this.e;
        if (rVar != null) {
            rVar.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void d(com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        dVar.a();
        dVar.b();
        this.h = dVar.e;
        dVar.b();
        com.amazon.aps.iva.x6.f0 r = pVar.r(dVar.d, 2);
        this.i = r;
        this.f = new b(r);
        f0 f0Var = this.a;
        if (f0Var != null) {
            f0Var.b(pVar, dVar);
        }
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void c() {
    }
}
