package com.amazon.aps.iva.s6;

import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.s6.r;
import com.amazon.aps.iva.t5.g0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* compiled from: AdaptiveTrackSelection.java */
/* loaded from: classes.dex */
public final class a extends c {
    public final com.amazon.aps.iva.t6.d g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final ImmutableList<C0696a> o;
    public final com.amazon.aps.iva.t5.d p;
    public float q;
    public int r;
    public int s;
    public long t;
    public com.amazon.aps.iva.q6.m u;

    /* compiled from: AdaptiveTrackSelection.java */
    /* renamed from: com.amazon.aps.iva.s6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0696a {
        public final long a;
        public final long b;

        public C0696a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0696a)) {
                return false;
            }
            C0696a c0696a = (C0696a) obj;
            if (this.a == c0696a.a && this.b == c0696a.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    /* compiled from: AdaptiveTrackSelection.java */
    /* loaded from: classes.dex */
    public static class b implements r.b {
        @Override // com.amazon.aps.iva.s6.r.b
        public final r[] a(r.a[] aVarArr, com.amazon.aps.iva.t6.d dVar) {
            r aVar;
            ImmutableList v = a.v(aVarArr);
            r[] rVarArr = new r[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                r.a aVar2 = aVarArr[i];
                if (aVar2 != null) {
                    int[] iArr = aVar2.b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            aVar = new s(iArr[0], aVar2.c, aVar2.a);
                        } else {
                            long j = 25000;
                            aVar = new a(aVar2.a, iArr, aVar2.c, dVar, 10000, j, j, 1279, 719, 0.7f, 0.75f, (ImmutableList) v.get(i), com.amazon.aps.iva.t5.d.a);
                        }
                        rVarArr[i] = aVar;
                    }
                }
            }
            return rVarArr;
        }
    }

    public a(s0 s0Var, int[] iArr, int i, com.amazon.aps.iva.t6.d dVar, long j, long j2, long j3, int i2, int i3, float f, float f2, ImmutableList immutableList, com.amazon.aps.iva.t5.d dVar2) {
        super(s0Var, iArr);
        com.amazon.aps.iva.t6.d dVar3;
        long j4;
        if (j3 < j) {
            com.amazon.aps.iva.t5.p.g();
            dVar3 = dVar;
            j4 = j;
        } else {
            dVar3 = dVar;
            j4 = j3;
        }
        this.g = dVar3;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j4 * 1000;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = ImmutableList.copyOf((Collection) immutableList);
        this.p = dVar2;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static ImmutableList v(r.a[] aVarArr) {
        int i;
        ImmutableList build;
        int i2;
        double d;
        long j;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= aVarArr.length) {
                break;
            }
            r.a aVar = aVarArr[i4];
            if (aVar != null && aVar.b.length > 1) {
                ImmutableList.Builder builder = ImmutableList.builder();
                builder.add((ImmutableList.Builder) new C0696a(0L, 0L));
                arrayList.add(builder);
            } else {
                arrayList.add(null);
            }
            i4++;
        }
        int length = aVarArr.length;
        long[][] jArr = new long[length];
        for (int i5 = 0; i5 < aVarArr.length; i5++) {
            r.a aVar2 = aVarArr[i5];
            if (aVar2 == null) {
                jArr[i5] = new long[0];
            } else {
                int[] iArr = aVar2.b;
                jArr[i5] = new long[iArr.length];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    long j2 = aVar2.a.e[iArr[i6]].i;
                    long[] jArr2 = jArr[i5];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i6] = j2;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i7 = 0; i7 < length; i7++) {
            long[] jArr4 = jArr[i7];
            if (jArr4.length == 0) {
                j = 0;
            } else {
                j = jArr4[0];
            }
            jArr3[i7] = j;
        }
        w(arrayList, jArr3);
        Multimap build2 = MultimapBuilder.treeKeys().arrayListValues().build();
        int i8 = 0;
        while (i8 < length) {
            long[] jArr5 = jArr[i8];
            if (jArr5.length <= i) {
                i2 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i9 = i3;
                while (true) {
                    long[] jArr6 = jArr[i8];
                    double d2 = 0.0d;
                    if (i9 >= jArr6.length) {
                        break;
                    }
                    int i10 = length;
                    long j3 = jArr6[i9];
                    if (j3 != -1) {
                        d2 = Math.log(j3);
                    }
                    dArr[i9] = d2;
                    i9++;
                    length = i10;
                }
                i2 = length;
                int i11 = length2 - 1;
                double d3 = dArr[i11] - dArr[0];
                int i12 = 0;
                while (i12 < i11) {
                    double d4 = dArr[i12];
                    i12++;
                    double d5 = (d4 + dArr[i12]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d5 - dArr[0]) / d3;
                    }
                    build2.put(Double.valueOf(d), Integer.valueOf(i8));
                }
            }
            i8++;
            length = i2;
            i3 = 0;
            i = 1;
        }
        ImmutableList copyOf = ImmutableList.copyOf(build2.values());
        for (int i13 = 0; i13 < copyOf.size(); i13++) {
            int intValue = ((Integer) copyOf.get(i13)).intValue();
            int i14 = iArr2[intValue] + 1;
            iArr2[intValue] = i14;
            jArr3[intValue] = jArr[intValue][i14];
            w(arrayList, jArr3);
        }
        for (int i15 = 0; i15 < aVarArr.length; i15++) {
            if (arrayList.get(i15) != null) {
                jArr3[i15] = jArr3[i15] * 2;
            }
        }
        w(arrayList, jArr3);
        ImmutableList.Builder builder2 = ImmutableList.builder();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ImmutableList.Builder builder3 = (ImmutableList.Builder) arrayList.get(i16);
            if (builder3 == null) {
                build = ImmutableList.of();
            } else {
                build = builder3.build();
            }
            builder2.add((ImmutableList.Builder) build);
        }
        return builder2.build();
    }

    public static void w(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ImmutableList.Builder builder = (ImmutableList.Builder) arrayList.get(i);
            if (builder != null) {
                builder.add((ImmutableList.Builder) new C0696a(j, jArr[i]));
            }
        }
    }

    public static long y(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        com.amazon.aps.iva.q6.m mVar = (com.amazon.aps.iva.q6.m) Iterables.getLast(list);
        long j = mVar.g;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = mVar.h;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 - j;
    }

    @Override // com.amazon.aps.iva.s6.c, com.amazon.aps.iva.s6.r
    public final void a() {
        this.u = null;
    }

    @Override // com.amazon.aps.iva.s6.r
    public final int c() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    @Override // com.amazon.aps.iva.s6.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r14, long r16, long r18, java.util.List<? extends com.amazon.aps.iva.q6.m> r20, com.amazon.aps.iva.q6.n[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            com.amazon.aps.iva.t5.d r2 = r0.p
            long r2 = r2.elapsedRealtime()
            int r4 = r0.r
            int r5 = r1.length
            if (r4 >= r5) goto L23
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L23
            int r4 = r0.r
            r1 = r1[r4]
            long r4 = r1.b()
            long r6 = r1.a()
            goto L37
        L23:
            int r4 = r1.length
            r5 = 0
        L25:
            if (r5 >= r4) goto L3c
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L39
            long r4 = r6.b()
            long r6 = r6.a()
        L37:
            long r4 = r4 - r6
            goto L40
        L39:
            int r5 = r5 + 1
            goto L25
        L3c:
            long r4 = y(r20)
        L40:
            int r1 = r0.s
            if (r1 != 0) goto L4e
            r1 = 1
            r0.s = r1
            int r1 = r13.x(r2, r4)
            r0.r = r1
            return
        L4e:
            int r6 = r0.r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L59
            r7 = r8
            goto L65
        L59:
            java.lang.Object r7 = com.google.common.collect.Iterables.getLast(r20)
            com.amazon.aps.iva.q6.m r7 = (com.amazon.aps.iva.q6.m) r7
            com.amazon.aps.iva.q5.v r7 = r7.d
            int r7 = r13.d(r7)
        L65:
            if (r7 == r8) goto L70
            java.lang.Object r1 = com.google.common.collect.Iterables.getLast(r20)
            com.amazon.aps.iva.q6.m r1 = (com.amazon.aps.iva.q6.m) r1
            int r1 = r1.e
            r6 = r7
        L70:
            int r7 = r13.x(r2, r4)
            if (r7 == r6) goto Lb4
            boolean r2 = r13.b(r6, r2)
            if (r2 != 0) goto Lb4
            com.amazon.aps.iva.q5.v[] r2 = r0.d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.h
            if (r10 != 0) goto L8e
            goto La0
        L8e:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L95
            long r4 = r18 - r4
            goto L97
        L95:
            r4 = r18
        L97:
            float r4 = (float) r4
            float r5 = r0.n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        La0:
            int r2 = r2.i
            int r3 = r3.i
            if (r2 <= r3) goto Lab
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lab
            goto Lb3
        Lab:
            if (r2 >= r3) goto Lb4
            long r2 = r0.i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb4
        Lb3:
            r7 = r6
        Lb4:
            if (r7 != r6) goto Lb7
            goto Lb8
        Lb7:
            r1 = 3
        Lb8:
            r0.s = r1
            r0.r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s6.a.g(long, long, long, java.util.List, com.amazon.aps.iva.q6.n[]):void");
    }

    @Override // com.amazon.aps.iva.s6.c, com.amazon.aps.iva.s6.r
    public final void i(float f) {
        this.q = f;
    }

    @Override // com.amazon.aps.iva.s6.r
    public final Object j() {
        return null;
    }

    @Override // com.amazon.aps.iva.s6.c, com.amazon.aps.iva.s6.r
    public final void o() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // com.amazon.aps.iva.s6.r
    public final int s() {
        return this.s;
    }

    @Override // com.amazon.aps.iva.s6.c, com.amazon.aps.iva.s6.r
    public final int u(List list, long j) {
        boolean z;
        com.amazon.aps.iva.q6.m mVar;
        int i;
        int i2;
        long elapsedRealtime = this.p.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((com.amazon.aps.iva.q6.m) Iterables.getLast(list)).equals(this.u))) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return list.size();
        }
        this.t = elapsedRealtime;
        if (list.isEmpty()) {
            mVar = null;
        } else {
            mVar = (com.amazon.aps.iva.q6.m) Iterables.getLast(list);
        }
        this.u = mVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long B = g0.B(((com.amazon.aps.iva.q6.m) list.get(size - 1)).g - j, this.q);
        long j3 = this.j;
        if (B < j3) {
            return size;
        }
        com.amazon.aps.iva.q5.v vVar = this.d[x(elapsedRealtime, y(list))];
        for (int i3 = 0; i3 < size; i3++) {
            com.amazon.aps.iva.q6.m mVar2 = (com.amazon.aps.iva.q6.m) list.get(i3);
            com.amazon.aps.iva.q5.v vVar2 = mVar2.d;
            if (g0.B(mVar2.g - j, this.q) >= j3 && vVar2.i < vVar.i && (i = vVar2.s) != -1 && i <= this.l && (i2 = vVar2.r) != -1 && i2 <= this.k && i < vVar.s) {
                return i3;
            }
        }
        return size;
    }

    public final int x(long j, long j2) {
        boolean z;
        long j3;
        long e = (((float) this.g.e()) * this.m) / this.q;
        ImmutableList<C0696a> immutableList = this.o;
        if (!immutableList.isEmpty()) {
            int i = 1;
            while (i < immutableList.size() - 1 && immutableList.get(i).a < e) {
                i++;
            }
            C0696a c0696a = immutableList.get(i - 1);
            C0696a c0696a2 = immutableList.get(i);
            long j4 = c0696a.a;
            long j5 = c0696a2.b;
            e = ((((float) (e - j4)) / ((float) (c0696a2.a - j4))) * ((float) (j5 - j3))) + c0696a.b;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !b(i3, j)) {
                if (e(i3).i <= e) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
