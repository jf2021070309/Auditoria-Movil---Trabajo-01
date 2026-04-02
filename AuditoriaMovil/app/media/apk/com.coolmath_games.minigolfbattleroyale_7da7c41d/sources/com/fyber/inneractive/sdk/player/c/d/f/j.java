package com.fyber.inneractive.sdk.player.c.d.f;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.c.d.f.v;
import com.fyber.inneractive.sdk.player.c.k.i;
/* loaded from: classes.dex */
public final class j implements h {
    private final s a;
    private final boolean b;
    private final boolean c;
    private long g;
    private String i;
    private com.fyber.inneractive.sdk.player.c.d.n j;
    private a k;
    private boolean l;
    private long m;
    private final boolean[] h = new boolean[3];
    private final n d = new n(7);
    private final n e = new n(8);
    private final n f = new n(6);
    private final com.fyber.inneractive.sdk.player.c.k.k n = new com.fyber.inneractive.sdk.player.c.k.k();

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void b() {
    }

    public j(s sVar, boolean z, boolean z2) {
        this.a = sVar;
        this.b = z;
        this.c = z2;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a() {
        com.fyber.inneractive.sdk.player.c.k.i.a(this.h);
        this.d.a();
        this.e.a();
        this.f.a();
        this.k.a();
        this.g = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        dVar.a();
        this.i = dVar.c();
        this.j = hVar.a(dVar.b());
        this.k = new a(this.j, this.b, this.c);
        this.a.a(hVar, dVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(long j, boolean z) {
        this.m = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.f.j.a(byte[], int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        final com.fyber.inneractive.sdk.player.c.d.n a;
        final boolean b;
        final boolean c;
        int h;
        int i;
        long j;
        boolean k;
        long l;
        boolean o;
        long p;
        long q;
        boolean r;
        final SparseArray<i.b> d = new SparseArray<>();
        final SparseArray<i.a> e = new SparseArray<>();
        C0058a m = new C0058a((byte) 0);
        C0058a n = new C0058a((byte) 0);
        byte[] g = new byte[128];
        final com.fyber.inneractive.sdk.player.c.k.l f = new com.fyber.inneractive.sdk.player.c.k.l(this.g, 0, 0);

        public a(com.fyber.inneractive.sdk.player.c.d.n nVar, boolean z, boolean z2) {
            this.a = nVar;
            this.b = z;
            this.c = z2;
            a();
        }

        public final void a(i.b bVar) {
            this.d.append(bVar.a, bVar);
        }

        public final void a(i.a aVar) {
            this.e.append(aVar.a, aVar);
        }

        public final void a() {
            this.k = false;
            this.o = false;
            this.n.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.fyber.inneractive.sdk.player.c.d.f.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0058a {
            boolean a;
            boolean b;
            i.b c;
            int d;
            int e;
            int f;
            int g;
            boolean h;
            boolean i;
            boolean j;
            boolean k;
            int l;
            int m;
            int n;
            int o;
            int p;

            private C0058a() {
            }

            /* synthetic */ C0058a(byte b) {
                this();
            }

            public final void a() {
                this.b = false;
                this.a = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0232, code lost:
        if ((r2.b && (r2.e == 7 || r2.e == 2)) != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x026b, code lost:
        if (r3.i != 1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e2, code lost:
        if ((r3.a && !(r4.a && r3.f == r4.f && r3.g == r4.g && r3.h == r4.h && ((!r3.i || !r4.i || r3.j == r4.j) && ((r3.d == r4.d || (r3.d != 0 && r4.d != 0)) && ((r3.c.h != 0 || r4.c.h != 0 || (r3.m == r4.m && r3.n == r4.n)) && ((r3.c.h != 1 || r4.c.h != 1 || (r3.o == r4.o && r3.p == r4.p)) && r3.k == r4.k && (!r3.k || !r4.k || r3.l == r4.l))))))) != false) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0218  */
    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fyber.inneractive.sdk.player.c.k.k r26) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.f.j.a(com.fyber.inneractive.sdk.player.c.k.k):void");
    }
}
