package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.r0;
import java.util.HashMap;
import java.util.Random;
/* compiled from: DefaultPlaybackSessionManager.java */
/* loaded from: classes.dex */
public final class m0 {
    public static final l0 h = new l0();
    public static final Random i = new Random();
    public o1 d;
    public String f;
    public final r0.d a = new r0.d();
    public final r0.b b = new r0.b();
    public final HashMap<String, a> c = new HashMap<>();
    public com.amazon.aps.iva.q5.r0 e = com.amazon.aps.iva.q5.r0.b;
    public long g = -1;

    /* compiled from: DefaultPlaybackSessionManager.java */
    /* loaded from: classes.dex */
    public final class a {
        public final String a;
        public int b;
        public long c;
        public final v.b d;
        public boolean e;
        public boolean f;

        public a(String str, int i, v.b bVar) {
            long j;
            this.a = str;
            this.b = i;
            if (bVar == null) {
                j = -1;
            } else {
                j = bVar.d;
            }
            this.c = j;
            if (bVar != null && bVar.a()) {
                this.d = bVar;
            }
        }

        public final boolean a(b.a aVar) {
            v.b bVar = aVar.d;
            if (bVar == null) {
                if (this.b != aVar.c) {
                    return true;
                }
                return false;
            }
            long j = this.c;
            if (j == -1) {
                return false;
            }
            if (bVar.d > j) {
                return true;
            }
            v.b bVar2 = this.d;
            if (bVar2 == null) {
                return false;
            }
            com.amazon.aps.iva.q5.r0 r0Var = aVar.b;
            int c = r0Var.c(bVar.a);
            int c2 = r0Var.c(bVar2.a);
            if (bVar.d < bVar2.d || c < c2) {
                return false;
            }
            if (c > c2) {
                return true;
            }
            boolean a = bVar.a();
            int i = bVar2.b;
            if (a) {
                int i2 = bVar.b;
                if (i2 > i) {
                    return true;
                }
                if (i2 == i) {
                    if (bVar.c > bVar2.c) {
                        return true;
                    }
                }
                return false;
            }
            int i3 = bVar.e;
            if (i3 == -1 || i3 > i) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
            if (r0 < r8.q()) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean b(com.amazon.aps.iva.q5.r0 r7, com.amazon.aps.iva.q5.r0 r8) {
            /*
                r6 = this;
                int r0 = r6.b
                int r1 = r7.q()
                r2 = 0
                r3 = -1
                if (r0 < r1) goto L13
                int r7 = r8.q()
                if (r0 >= r7) goto L11
                goto L38
            L11:
                r0 = r3
                goto L38
            L13:
                com.amazon.aps.iva.b6.m0 r1 = com.amazon.aps.iva.b6.m0.this
                com.amazon.aps.iva.q5.r0$d r4 = r1.a
                r7.o(r0, r4)
                com.amazon.aps.iva.q5.r0$d r0 = r1.a
                int r4 = r0.p
            L1e:
                int r5 = r0.q
                if (r4 > r5) goto L11
                java.lang.Object r5 = r7.n(r4)
                int r5 = r8.c(r5)
                if (r5 == r3) goto L35
                com.amazon.aps.iva.q5.r0$b r7 = r1.b
                com.amazon.aps.iva.q5.r0$b r7 = r8.h(r5, r7, r2)
                int r0 = r7.d
                goto L38
            L35:
                int r4 = r4 + 1
                goto L1e
            L38:
                r6.b = r0
                if (r0 != r3) goto L3d
                return r2
            L3d:
                r7 = 1
                com.amazon.aps.iva.o6.v$b r0 = r6.d
                if (r0 != 0) goto L43
                return r7
            L43:
                java.lang.Object r0 = r0.a
                int r8 = r8.c(r0)
                if (r8 == r3) goto L4c
                r2 = r7
            L4c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b6.m0.a.b(com.amazon.aps.iva.q5.r0, com.amazon.aps.iva.q5.r0):boolean");
        }
    }

    public final void a(a aVar) {
        long j = aVar.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r13 != (-1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r16 == r8.b) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        r10 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.b6.m0.a b(int r16, com.amazon.aps.iva.o6.v.b r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap<java.lang.String, com.amazon.aps.iva.b6.m0$a> r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto La0
            java.lang.Object r8 = r4.next()
            com.amazon.aps.iva.b6.m0$a r8 = (com.amazon.aps.iva.b6.m0.a) r8
            long r9 = r8.c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            int r9 = r8.b
            if (r1 != r9) goto L51
            if (r2 == 0) goto L51
            com.amazon.aps.iva.b6.m0 r9 = com.amazon.aps.iva.b6.m0.this
            java.util.HashMap<java.lang.String, com.amazon.aps.iva.b6.m0$a> r10 = r9.c
            java.lang.String r13 = r9.f
            java.lang.Object r10 = r10.get(r13)
            com.amazon.aps.iva.b6.m0$a r10 = (com.amazon.aps.iva.b6.m0.a) r10
            if (r10 == 0) goto L44
            long r13 = r10.c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L44
            goto L49
        L44:
            long r9 = r9.g
            r13 = 1
            long r13 = r13 + r9
        L49:
            long r9 = r2.d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L51
            r8.c = r9
        L51:
            com.amazon.aps.iva.o6.v$b r9 = r8.d
            if (r2 != 0) goto L5a
            int r10 = r8.b
            if (r1 != r10) goto L7f
            goto L7d
        L5a:
            long r13 = r2.d
            if (r9 != 0) goto L6b
            boolean r10 = r17.a()
            if (r10 != 0) goto L7f
            long r11 = r8.c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L7f
            goto L7d
        L6b:
            long r10 = r9.d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L7f
            int r10 = r2.b
            int r11 = r9.b
            if (r10 != r11) goto L7f
            int r10 = r2.c
            int r11 = r9.c
            if (r10 != r11) goto L7f
        L7d:
            r10 = 1
            goto L80
        L7f:
            r10 = 0
        L80:
            if (r10 == 0) goto L15
            long r10 = r8.c
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L9c
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8f
            goto L9c
        L8f:
            if (r12 != 0) goto L15
            int r10 = com.amazon.aps.iva.t5.g0.a
            com.amazon.aps.iva.o6.v$b r10 = r5.d
            if (r10 == 0) goto L15
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L9c:
            r5 = r8
            r6 = r10
            goto L15
        La0:
            if (r5 != 0) goto Lb2
            com.amazon.aps.iva.b6.l0 r4 = com.amazon.aps.iva.b6.m0.h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            com.amazon.aps.iva.b6.m0$a r5 = new com.amazon.aps.iva.b6.m0$a
            r5.<init>(r4, r1, r2)
            r3.put(r4, r5)
        Lb2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b6.m0.b(int, com.amazon.aps.iva.o6.v$b):com.amazon.aps.iva.b6.m0$a");
    }

    public final void c(b.a aVar) {
        v.b bVar;
        boolean r = aVar.b.r();
        HashMap<String, a> hashMap = this.c;
        if (r) {
            String str = this.f;
            if (str != null) {
                a aVar2 = hashMap.get(str);
                aVar2.getClass();
                a(aVar2);
                return;
            }
            return;
        }
        a aVar3 = hashMap.get(this.f);
        int i2 = aVar.c;
        v.b bVar2 = aVar.d;
        this.f = b(i2, bVar2).a;
        d(aVar);
        if (bVar2 != null && bVar2.a()) {
            long j = bVar2.d;
            if (aVar3 == null || aVar3.c != j || (bVar = aVar3.d) == null || bVar.b != bVar2.b || bVar.c != bVar2.c) {
                b(i2, new v.b(j, bVar2.a));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x00fb, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:28:0x0050, B:30:0x005c, B:31:0x0060, B:33:0x0065, B:35:0x006b, B:37:0x0082, B:38:0x00b0, B:40:0x00b4, B:41:0x00bb, B:43:0x00c5, B:45:0x00c9, B:47:0x00d8, B:50:0x00df), top: B:56:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(com.amazon.aps.iva.b6.b.a r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b6.m0.d(com.amazon.aps.iva.b6.b$a):void");
    }
}
