package com.fyber.inneractive.sdk.player.c.d.d;

import android.util.Pair;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.c.d.d.a;
import com.fyber.inneractive.sdk.player.c.d.n;
import com.fyber.inneractive.sdk.player.c.k.r;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes.dex */
public final class e implements com.fyber.inneractive.sdk.player.c.d.f {
    public static final com.fyber.inneractive.sdk.player.c.d.i a = new com.fyber.inneractive.sdk.player.c.d.i() { // from class: com.fyber.inneractive.sdk.player.c.d.d.e.1
        @Override // com.fyber.inneractive.sdk.player.c.d.i
        public final com.fyber.inneractive.sdk.player.c.d.f[] a() {
            return new com.fyber.inneractive.sdk.player.c.d.f[]{new e()};
        }
    };
    private static final int b = t.e("seig");
    private static final byte[] c = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private int A;
    private int B;
    private boolean C;
    private com.fyber.inneractive.sdk.player.c.d.h D;
    private n E;
    private n[] F;
    private boolean G;
    private final int d;
    private final i e;
    private final SparseArray<b> f;
    private final com.fyber.inneractive.sdk.player.c.k.k g;
    private final com.fyber.inneractive.sdk.player.c.k.k h;
    private final com.fyber.inneractive.sdk.player.c.k.k i;
    private final com.fyber.inneractive.sdk.player.c.k.k j;
    private final r k;
    private final com.fyber.inneractive.sdk.player.c.k.k l;
    private final byte[] m;
    private final Stack<a.C0055a> n;
    private final LinkedList<a> o;
    private int p;
    private int q;
    private long r;
    private int s;
    private com.fyber.inneractive.sdk.player.c.k.k t;
    private long u;
    private int v;
    private long w;
    private long x;
    private b y;
    private int z;

    public e() {
        this(0);
    }

    public e(int i) {
        this(i, (byte) 0);
    }

    private e(int i, byte b2) {
        this(i, (char) 0);
    }

    private e(int i, char c2) {
        this.d = i | 0;
        this.k = null;
        this.e = null;
        this.l = new com.fyber.inneractive.sdk.player.c.k.k(16);
        this.g = new com.fyber.inneractive.sdk.player.c.k.k(com.fyber.inneractive.sdk.player.c.k.i.a);
        this.h = new com.fyber.inneractive.sdk.player.c.k.k(5);
        this.i = new com.fyber.inneractive.sdk.player.c.k.k();
        this.j = new com.fyber.inneractive.sdk.player.c.k.k(1);
        this.m = new byte[16];
        this.n = new Stack<>();
        this.o = new LinkedList<>();
        this.f = new SparseArray<>();
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final boolean a(com.fyber.inneractive.sdk.player.c.d.g gVar) throws IOException, InterruptedException {
        return h.a(gVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar) {
        this.D = hVar;
        if (this.e != null) {
            b bVar = new b(hVar.a(0));
            bVar.a(this.e, new c(0, 0, 0, 0));
            this.f.put(0, bVar);
            b();
            this.D.b();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(long j, long j2) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            this.f.valueAt(i).a();
        }
        this.o.clear();
        this.v = 0;
        this.n.clear();
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x027f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0004 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.c.d.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.c.d.g r27, com.fyber.inneractive.sdk.player.c.d.l r28) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.d.e.a(com.fyber.inneractive.sdk.player.c.d.g, com.fyber.inneractive.sdk.player.c.d.l):int");
    }

    private void a() {
        this.p = 0;
        this.s = 0;
    }

    private void a(long j) throws com.fyber.inneractive.sdk.player.c.l {
        i a2;
        while (!this.n.isEmpty() && this.n.peek().aQ == j) {
            a.C0055a pop = this.n.pop();
            if (pop.aP != com.fyber.inneractive.sdk.player.c.d.d.a.B) {
                if (pop.aP == com.fyber.inneractive.sdk.player.c.d.d.a.K) {
                    a(pop);
                } else if (!this.n.isEmpty()) {
                    this.n.peek().a(pop);
                }
            } else {
                com.fyber.inneractive.sdk.player.c.k.a.b(this.e == null, "Unexpected moov box.");
                com.fyber.inneractive.sdk.player.c.c.a a3 = a(pop.aR);
                a.C0055a e = pop.e(com.fyber.inneractive.sdk.player.c.d.d.a.M);
                SparseArray sparseArray = new SparseArray();
                int size = e.aR.size();
                long j2 = -9223372036854775807L;
                for (int i = 0; i < size; i++) {
                    a.b bVar = e.aR.get(i);
                    if (bVar.aP == com.fyber.inneractive.sdk.player.c.d.d.a.y) {
                        com.fyber.inneractive.sdk.player.c.k.k kVar = bVar.aQ;
                        kVar.c(12);
                        Pair create = Pair.create(Integer.valueOf(kVar.j()), new c(kVar.n() - 1, kVar.n(), kVar.n(), kVar.j()));
                        sparseArray.put(((Integer) create.first).intValue(), create.second);
                    } else if (bVar.aP == com.fyber.inneractive.sdk.player.c.d.d.a.N) {
                        com.fyber.inneractive.sdk.player.c.k.k kVar2 = bVar.aQ;
                        kVar2.c(8);
                        j2 = com.fyber.inneractive.sdk.player.c.d.d.a.a(kVar2.j()) == 0 ? kVar2.h() : kVar2.p();
                    }
                }
                SparseArray sparseArray2 = new SparseArray();
                int size2 = pop.aS.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    a.C0055a c0055a = pop.aS.get(i2);
                    if (c0055a.aP == com.fyber.inneractive.sdk.player.c.d.d.a.D && (a2 = com.fyber.inneractive.sdk.player.c.d.d.b.a(c0055a, pop.d(com.fyber.inneractive.sdk.player.c.d.d.a.C), j2, a3, false)) != null) {
                        sparseArray2.put(a2.a, a2);
                    }
                }
                int size3 = sparseArray2.size();
                if (this.f.size() == 0) {
                    for (int i3 = 0; i3 < size3; i3++) {
                        i iVar = (i) sparseArray2.valueAt(i3);
                        b bVar2 = new b(this.D.a(i3));
                        bVar2.a(iVar, (c) sparseArray.get(iVar.a));
                        this.f.put(iVar.a, bVar2);
                        this.w = Math.max(this.w, iVar.e);
                    }
                    b();
                    this.D.b();
                } else {
                    com.fyber.inneractive.sdk.player.c.k.a.b(this.f.size() == size3);
                    for (int i4 = 0; i4 < size3; i4++) {
                        i iVar2 = (i) sparseArray2.valueAt(i4);
                        this.f.get(iVar2.a).a(iVar2, (c) sparseArray.get(iVar2.a));
                    }
                }
            }
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.fyber.inneractive.sdk.player.c.d.d.a.C0055a r53) throws com.fyber.inneractive.sdk.player.c.l {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.d.e.a(com.fyber.inneractive.sdk.player.c.d.d.a$a):void");
    }

    private void b() {
        if ((this.d & 4) != 0 && this.E == null) {
            n a2 = this.D.a(this.f.size());
            this.E = a2;
            a2.a(com.fyber.inneractive.sdk.player.c.h.a("application/x-emsg", LongCompanionObject.MAX_VALUE));
        }
        if ((this.d & 8) == 0 || this.F != null) {
            return;
        }
        n a3 = this.D.a(this.f.size() + 1);
        a3.a(com.fyber.inneractive.sdk.player.c.h.a((String) null, "application/cea-608", 0, (String) null, (com.fyber.inneractive.sdk.player.c.c.a) null));
        this.F = new n[]{a3};
    }

    private static void a(com.fyber.inneractive.sdk.player.c.k.k kVar, int i, k kVar2) throws com.fyber.inneractive.sdk.player.c.l {
        kVar.c(i + 8);
        int b2 = com.fyber.inneractive.sdk.player.c.d.d.a.b(kVar.j());
        if ((b2 & 1) != 0) {
            throw new com.fyber.inneractive.sdk.player.c.l("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (b2 & 2) != 0;
        int n = kVar.n();
        if (n != kVar2.f) {
            throw new com.fyber.inneractive.sdk.player.c.l("Length mismatch: " + n + ", " + kVar2.f);
        }
        Arrays.fill(kVar2.n, 0, n, z);
        kVar2.a(kVar.b());
        kVar.a(kVar2.q.a, 0, kVar2.p);
        kVar2.q.c(0);
        kVar2.r = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.fyber.inneractive.sdk.player.c.c.a a(java.util.List<com.fyber.inneractive.sdk.player.c.d.d.a.b> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L8:
            if (r3 >= r0) goto Lb2
            java.lang.Object r5 = r14.get(r3)
            com.fyber.inneractive.sdk.player.c.d.d.a$b r5 = (com.fyber.inneractive.sdk.player.c.d.d.a.b) r5
            int r6 = r5.aP
            int r7 = com.fyber.inneractive.sdk.player.c.d.d.a.U
            if (r6 != r7) goto Lae
            if (r4 != 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1d:
            com.fyber.inneractive.sdk.player.c.k.k r5 = r5.aQ
            byte[] r5 = r5.a
            com.fyber.inneractive.sdk.player.c.k.k r6 = new com.fyber.inneractive.sdk.player.c.k.k
            r6.<init>(r5)
            int r7 = r6.c
            r8 = 32
            if (r7 >= r8) goto L2e
        L2c:
            r6 = r2
            goto L92
        L2e:
            r6.c(r1)
            int r7 = r6.j()
            int r8 = r6.b()
            int r8 = r8 + 4
            if (r7 == r8) goto L3e
            goto L2c
        L3e:
            int r7 = r6.j()
            int r8 = com.fyber.inneractive.sdk.player.c.d.d.a.U
            if (r7 == r8) goto L47
            goto L2c
        L47:
            int r7 = r6.j()
            int r7 = com.fyber.inneractive.sdk.player.c.d.d.a.a(r7)
            r8 = 1
            if (r7 <= r8) goto L66
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Unsupported pssh version: "
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L2c
        L66:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.l()
            long r12 = r6.l()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L7e
            int r7 = r6.n()
            int r7 = r7 * 16
            r6.d(r7)
        L7e:
            int r7 = r6.n()
            int r8 = r6.b()
            if (r7 == r8) goto L89
            goto L2c
        L89:
            byte[] r8 = new byte[r7]
            r6.a(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L92:
            if (r6 != 0) goto L96
            r6 = r2
            goto L9a
        L96:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L9a:
            if (r6 != 0) goto La4
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lae
        La4:
            com.fyber.inneractive.sdk.player.c.c.a$a r7 = new com.fyber.inneractive.sdk.player.c.c.a$a
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        Lae:
            int r3 = r3 + 1
            goto L8
        Lb2:
            if (r4 != 0) goto Lb5
            return r2
        Lb5:
            com.fyber.inneractive.sdk.player.c.c.a r14 = new com.fyber.inneractive.sdk.player.c.c.a
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.d.e.a(java.util.List):com.fyber.inneractive.sdk.player.c.c.a");
    }

    /* loaded from: classes.dex */
    private static final class a {
        public final long a;
        public final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        public final k a = new k();
        public final n b;
        public i c;
        public c d;
        public int e;
        public int f;
        public int g;

        public b(n nVar) {
            this.b = nVar;
        }

        public final void a(i iVar, c cVar) {
            this.c = (i) com.fyber.inneractive.sdk.player.c.k.a.a(iVar);
            this.d = (c) com.fyber.inneractive.sdk.player.c.k.a.a(cVar);
            this.b.a(iVar.f);
            a();
        }

        public final void a() {
            k kVar = this.a;
            kVar.e = 0;
            kVar.s = 0L;
            kVar.m = false;
            kVar.r = false;
            kVar.o = null;
            this.e = 0;
            this.g = 0;
            this.f = 0;
        }
    }
}
