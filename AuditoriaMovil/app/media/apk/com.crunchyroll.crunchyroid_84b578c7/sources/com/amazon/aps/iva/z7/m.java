package com.amazon.aps.iva.z7;

import android.util.SparseArray;
import com.amazon.aps.iva.u5.d;
import com.amazon.aps.iva.z7.e0;
/* compiled from: H264Reader.java */
/* loaded from: classes.dex */
public final class m implements j {
    public final a0 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public com.amazon.aps.iva.x6.f0 j;
    public a k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final r d = new r(7);
    public final r e = new r(8);
    public final r f = new r(6);
    public long m = -9223372036854775807L;
    public final com.amazon.aps.iva.t5.v o = new com.amazon.aps.iva.t5.v();

    /* compiled from: H264Reader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final com.amazon.aps.iva.x6.f0 a;
        public final boolean b;
        public final boolean c;
        public final com.amazon.aps.iva.t5.u f;
        public byte[] g;
        public int h;
        public int i;
        public long j;
        public long l;
        public long p;
        public long q;
        public boolean r;
        public final SparseArray<d.c> d = new SparseArray<>();
        public final SparseArray<d.b> e = new SparseArray<>();
        public C0914a m = new C0914a();
        public C0914a n = new C0914a();
        public boolean k = false;
        public boolean o = false;

        /* compiled from: H264Reader.java */
        /* renamed from: com.amazon.aps.iva.z7.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0914a {
            public boolean a;
            public boolean b;
            public d.c c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public boolean k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;
        }

        public a(com.amazon.aps.iva.x6.f0 f0Var, boolean z, boolean z2) {
            this.a = f0Var;
            this.b = z;
            this.c = z2;
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new com.amazon.aps.iva.t5.u(bArr, 0, 0);
            C0914a c0914a = this.n;
            c0914a.b = false;
            c0914a.a = false;
        }
    }

    public m(a0 a0Var, boolean z, boolean z2) {
        this.a = a0Var;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x02aa, code lost:
        if (r5 != 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f2, code lost:
        if (r6.n != r7.n) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0203, code lost:
        if (r6.p != r7.p) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0211, code lost:
        if (r6.l != r7.l) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0217, code lost:
        if (r6 == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025a  */
    @Override // com.amazon.aps.iva.z7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.amazon.aps.iva.t5.v r29) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z7.m.a(com.amazon.aps.iva.t5.v):void");
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void b() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        com.amazon.aps.iva.u5.d.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        a aVar = this.k;
        if (aVar != null) {
            aVar.k = false;
            aVar.o = false;
            a.C0914a c0914a = aVar.n;
            c0914a.b = false;
            c0914a.a = false;
        }
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void d(com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        dVar.a();
        dVar.b();
        this.i = dVar.e;
        dVar.b();
        com.amazon.aps.iva.x6.f0 r = pVar.r(dVar.d, 2);
        this.j = r;
        this.k = new a(r, this.b, this.c);
        this.a.a(pVar, dVar);
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void e(int i, long j) {
        boolean z;
        if (j != -9223372036854775807L) {
            this.m = j;
        }
        boolean z2 = this.n;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.n = z | z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r18, byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z7.m.f(int, byte[], int):void");
    }

    @Override // com.amazon.aps.iva.z7.j
    public final void c() {
    }
}
