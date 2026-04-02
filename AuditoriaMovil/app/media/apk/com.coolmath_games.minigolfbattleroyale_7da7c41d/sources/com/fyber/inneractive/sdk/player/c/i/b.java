package com.fyber.inneractive.sdk.player.c.i;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.c.g.i;
import com.fyber.inneractive.sdk.player.c.i.e;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class b extends d {
    private static final int[] b = new int[0];
    private final e.a c;
    private final AtomicReference<C0063b> d;

    private static int a(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    private static boolean a(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.i.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0063b {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final int e;
        public final int f;
        public final int g;
        public final boolean h;
        public final boolean i;
        public final int j;
        public final int k;
        public final boolean l;

        public C0063b() {
            this((byte) 0);
        }

        private C0063b(byte b) {
            this.a = null;
            this.b = null;
            this.c = false;
            this.d = true;
            this.e = Integer.MAX_VALUE;
            this.f = Integer.MAX_VALUE;
            this.g = Integer.MAX_VALUE;
            this.h = true;
            this.i = true;
            this.j = Integer.MAX_VALUE;
            this.k = Integer.MAX_VALUE;
            this.l = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C0063b c0063b = (C0063b) obj;
                if (this.c == c0063b.c && this.d == c0063b.d && this.e == c0063b.e && this.f == c0063b.f && this.h == c0063b.h && this.i == c0063b.i && this.l == c0063b.l && this.j == c0063b.j && this.k == c0063b.k && this.g == c0063b.g && TextUtils.equals(this.a, c0063b.a) && TextUtils.equals(this.b, c0063b.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + this.j) * 31) + this.k;
        }
    }

    public b() {
        this((byte) 0);
    }

    private b(byte b2) {
        this.c = null;
        this.d = new AtomicReference<>(new C0063b());
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0123 A[LOOP:1: B:19:0x0059->B:47:0x0123, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.c.i.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.fyber.inneractive.sdk.player.c.i.e[] a(com.fyber.inneractive.sdk.player.c.o[] r36, com.fyber.inneractive.sdk.player.c.g.i[] r37, int[][][] r38) throws com.fyber.inneractive.sdk.player.c.d {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.i.b.a(com.fyber.inneractive.sdk.player.c.o[], com.fyber.inneractive.sdk.player.c.g.i[], int[][][]):com.fyber.inneractive.sdk.player.c.i.e[]");
    }

    private static int a(com.fyber.inneractive.sdk.player.c.g.h hVar, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue = list.get(i6).intValue();
            if (a(hVar.b[intValue], str, iArr[intValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    private static void b(com.fyber.inneractive.sdk.player.c.g.h hVar, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!a(hVar.b[intValue], str, iArr[intValue], i, i2, i3, i4)) {
                list.remove(size);
            }
        }
    }

    private static boolean a(com.fyber.inneractive.sdk.player.c.h hVar, String str, int i, int i2, int i3, int i4, int i5) {
        return a(i, false) && (i & i2) != 0 && (str == null || t.a(hVar.f, str)) && ((hVar.j == -1 || hVar.j <= i3) && ((hVar.k == -1 || hVar.k <= i4) && (hVar.b == -1 || hVar.b <= i5)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r3.j <= r22) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r3.k > r23) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r3.b > r24) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.fyber.inneractive.sdk.player.c.i.e a(com.fyber.inneractive.sdk.player.c.g.i r20, int[][] r21, int r22, int r23, int r24, int r25, int r26, boolean r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.i.b.a(com.fyber.inneractive.sdk.player.c.g.i, int[][], int, int, int, int, int, boolean, boolean, boolean):com.fyber.inneractive.sdk.player.c.i.e");
    }

    private static e a(i iVar, int[][] iArr, String str, boolean z, boolean z2, e.a aVar) {
        int[] iArr2;
        int a2;
        String str2;
        boolean z3;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < iVar.b; i4++) {
            com.fyber.inneractive.sdk.player.c.g.h hVar = iVar.c[i4];
            int[] iArr3 = iArr[i4];
            for (int i5 = 0; i5 < hVar.a; i5++) {
                if (a(iArr3[i5], z)) {
                    com.fyber.inneractive.sdk.player.c.h hVar2 = hVar.b[i5];
                    int i6 = iArr3[i5];
                    if ((hVar2.x & 1) != 0) {
                        str2 = str;
                        z3 = true;
                    } else {
                        str2 = str;
                        z3 = false;
                    }
                    int i7 = a(hVar2, str2) ? z3 ? 4 : 3 : z3 ? 2 : 1;
                    if (a(i6, false)) {
                        i7 += 1000;
                    }
                    if (i7 > i3) {
                        i = i4;
                        i2 = i5;
                        i3 = i7;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        com.fyber.inneractive.sdk.player.c.g.h hVar3 = iVar.c[i];
        if (aVar != null) {
            int[] iArr4 = iArr[i];
            HashSet hashSet = new HashSet();
            int i8 = 0;
            a aVar2 = null;
            for (int i9 = 0; i9 < hVar3.a; i9++) {
                com.fyber.inneractive.sdk.player.c.h hVar4 = hVar3.b[i9];
                a aVar3 = new a(hVar4.r, hVar4.s, z2 ? null : hVar4.f);
                if (hashSet.add(aVar3) && (a2 = a(hVar3, iArr4, aVar3)) > i8) {
                    i8 = a2;
                    aVar2 = aVar3;
                }
            }
            if (i8 > 1) {
                iArr2 = new int[i8];
                int i10 = 0;
                for (int i11 = 0; i11 < hVar3.a; i11++) {
                    if (a(hVar3.b[i11], iArr4[i11], aVar2)) {
                        iArr2[i10] = i11;
                        i10++;
                    }
                }
            } else {
                iArr2 = b;
            }
            if (iArr2.length > 0) {
                return aVar.a();
            }
        }
        return new c(hVar3, i2);
    }

    private static int a(com.fyber.inneractive.sdk.player.c.g.h hVar, int[] iArr, a aVar) {
        int i = 0;
        for (int i2 = 0; i2 < hVar.a; i2++) {
            if (a(hVar.b[i2], iArr[i2], aVar)) {
                i++;
            }
        }
        return i;
    }

    private static boolean a(com.fyber.inneractive.sdk.player.c.h hVar, int i, a aVar) {
        return a(i, false) && hVar.r == aVar.a && hVar.s == aVar.b && (aVar.c == null || TextUtils.equals(aVar.c, hVar.f));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0072 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.fyber.inneractive.sdk.player.c.i.e a(com.fyber.inneractive.sdk.player.c.g.i r18, int[][] r19, java.lang.String r20, java.lang.String r21, boolean r22) {
        /*
            r0 = r18
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = r2
            r5 = r3
            r6 = r5
        L8:
            int r7 = r0.b
            if (r3 >= r7) goto L7e
            com.fyber.inneractive.sdk.player.c.g.h[] r7 = r0.c
            r7 = r7[r3]
            r8 = r19[r3]
            r9 = r2
        L13:
            int r10 = r7.a
            if (r9 >= r10) goto L75
            r10 = r8[r9]
            r11 = r22
            boolean r10 = a(r10, r11)
            if (r10 == 0) goto L6e
            com.fyber.inneractive.sdk.player.c.h[] r10 = r7.b
            r10 = r10[r9]
            int r12 = r10.x
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L2d
            r12 = r13
            goto L2e
        L2d:
            r12 = r2
        L2e:
            int r14 = r10.x
            r15 = 2
            r14 = r14 & r15
            if (r14 == 0) goto L39
            r14 = r20
            r16 = r13
            goto L3d
        L39:
            r14 = r20
            r16 = r2
        L3d:
            boolean r17 = a(r10, r14)
            if (r17 == 0) goto L4d
            if (r12 == 0) goto L47
            r13 = 6
            goto L50
        L47:
            if (r16 != 0) goto L4b
            r13 = 5
            goto L50
        L4b:
            r13 = 4
            goto L50
        L4d:
            if (r12 == 0) goto L53
            r13 = 3
        L50:
            r12 = r21
            goto L5e
        L53:
            r12 = r21
            if (r16 == 0) goto L72
            boolean r10 = a(r10, r12)
            if (r10 == 0) goto L5e
            r13 = r15
        L5e:
            r10 = r8[r9]
            boolean r10 = a(r10, r2)
            if (r10 == 0) goto L68
            int r13 = r13 + 1000
        L68:
            if (r13 <= r6) goto L72
            r4 = r7
            r5 = r9
            r6 = r13
            goto L72
        L6e:
            r14 = r20
            r12 = r21
        L72:
            int r9 = r9 + 1
            goto L13
        L75:
            r14 = r20
            r12 = r21
            r11 = r22
            int r3 = r3 + 1
            goto L8
        L7e:
            if (r4 != 0) goto L81
            return r1
        L81:
            com.fyber.inneractive.sdk.player.c.i.c r0 = new com.fyber.inneractive.sdk.player.c.i.c
            r0.<init>(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.i.b.a(com.fyber.inneractive.sdk.player.c.g.i, int[][], java.lang.String, java.lang.String, boolean):com.fyber.inneractive.sdk.player.c.i.e");
    }

    private static e a(i iVar, int[][] iArr, boolean z) {
        com.fyber.inneractive.sdk.player.c.g.h hVar = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < iVar.b; i3++) {
            com.fyber.inneractive.sdk.player.c.g.h hVar2 = iVar.c[i3];
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < hVar2.a; i4++) {
                if (a(iArr2[i4], z)) {
                    int i5 = (hVar2.b[i4].x & 1) != 0 ? 2 : 1;
                    if (a(iArr2[i4], false)) {
                        i5 += 1000;
                    }
                    if (i5 > i2) {
                        hVar = hVar2;
                        i = i4;
                        i2 = i5;
                    }
                }
            }
        }
        if (hVar == null) {
            return null;
        }
        return new c(hVar, i);
    }

    private static boolean a(com.fyber.inneractive.sdk.player.c.h hVar, String str) {
        return str != null && TextUtils.equals(str, t.b(hVar.y));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<java.lang.Integer> a(com.fyber.inneractive.sdk.player.c.g.h r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.a
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L9:
            int r3 = r12.a
            if (r2 >= r3) goto L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L9
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto La9
            if (r14 != r2) goto L20
            goto La9
        L20:
            r3 = r1
            r4 = r2
        L22:
            int r5 = r12.a
            r6 = 1
            if (r3 >= r5) goto L83
            com.fyber.inneractive.sdk.player.c.h[] r5 = r12.b
            r5 = r5[r3]
            int r7 = r5.j
            if (r7 <= 0) goto L80
            int r7 = r5.k
            if (r7 <= 0) goto L80
            int r7 = r5.j
            int r8 = r5.k
            if (r15 == 0) goto L47
            if (r7 <= r8) goto L3d
            r9 = r6
            goto L3e
        L3d:
            r9 = r1
        L3e:
            if (r13 <= r14) goto L41
            goto L42
        L41:
            r6 = r1
        L42:
            if (r9 == r6) goto L47
            r6 = r13
            r9 = r14
            goto L49
        L47:
            r9 = r13
            r6 = r14
        L49:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L59
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.fyber.inneractive.sdk.player.c.k.t.a(r11, r7)
            r6.<init>(r9, r7)
            goto L63
        L59:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = com.fyber.inneractive.sdk.player.c.k.t.a(r10, r8)
            r7.<init>(r8, r6)
            r6 = r7
        L63:
            int r7 = r5.j
            int r8 = r5.k
            int r7 = r7 * r8
            int r8 = r5.j
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r8 < r9) goto L80
            int r5 = r5.k
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L80
            if (r7 >= r4) goto L80
            r4 = r7
        L80:
            int r3 = r3 + 1
            goto L22
        L83:
            if (r4 == r2) goto La9
            int r13 = r0.size()
            int r13 = r13 - r6
        L8a:
            if (r13 < 0) goto La9
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.fyber.inneractive.sdk.player.c.h[] r15 = r12.b
            r14 = r15[r14]
            int r14 = r14.a()
            r15 = -1
            if (r14 == r15) goto La3
            if (r14 <= r4) goto La6
        La3:
            r0.remove(r13)
        La6:
            int r13 = r13 + (-1)
            goto L8a
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.i.b.a(com.fyber.inneractive.sdk.player.c.g.h, int, int, boolean):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final String c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && TextUtils.equals(this.c, aVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }
}
