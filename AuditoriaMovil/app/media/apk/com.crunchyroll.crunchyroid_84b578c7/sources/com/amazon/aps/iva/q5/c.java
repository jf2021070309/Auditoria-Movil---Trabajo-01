package com.amazon.aps.iva.q5;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: AdPlaybackState.java */
/* loaded from: classes.dex */
public final class c implements k {
    public static final c h = new c(null, new a[0], 0, -9223372036854775807L, 0);
    public static final a i = new a(0).c(0);
    public static final String j = com.amazon.aps.iva.t5.g0.L(1);
    public static final String k = com.amazon.aps.iva.t5.g0.L(2);
    public static final String l = com.amazon.aps.iva.t5.g0.L(3);
    public static final String m = com.amazon.aps.iva.t5.g0.L(4);
    public static final com.amazon.aps.iva.g1.f n = new com.amazon.aps.iva.g1.f(1);
    public final Object b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    public final a[] g;

    /* compiled from: AdPlaybackState.java */
    /* loaded from: classes.dex */
    public static final class a implements k {
        public static final String j = com.amazon.aps.iva.t5.g0.L(0);
        public static final String k = com.amazon.aps.iva.t5.g0.L(1);
        public static final String l = com.amazon.aps.iva.t5.g0.L(2);
        public static final String m = com.amazon.aps.iva.t5.g0.L(3);
        public static final String n = com.amazon.aps.iva.t5.g0.L(4);
        public static final String o = com.amazon.aps.iva.t5.g0.L(5);
        public static final String p = com.amazon.aps.iva.t5.g0.L(6);
        public static final String q = com.amazon.aps.iva.t5.g0.L(7);
        public static final b r = new b(0);
        public final long b;
        public final int c;
        public final int d;
        public final Uri[] e;
        public final int[] f;
        public final long[] g;
        public final long h;
        public final boolean i;

        public a(long j2) {
            this(j2, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public static long[] a(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        public final int b(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f;
                if (i3 >= iArr.length || this.i || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final a c(int i) {
            int[] iArr = this.f;
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            long[] a = a(this.g, i);
            return new a(this.b, i, this.d, copyOf, (Uri[]) Arrays.copyOf(this.e, i), a, this.h, this.i);
        }

        public final a d(int i, int i2) {
            boolean z;
            boolean z2 = false;
            int i3 = this.c;
            if (i3 != -1 && i2 >= i3) {
                z = false;
            } else {
                z = true;
            }
            com.amazon.aps.iva.cq.b.t(z);
            int[] iArr = this.f;
            int length = iArr.length;
            int max = Math.max(i2 + 1, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            int i4 = copyOf[i2];
            if (i4 == 0 || i4 == 1 || i4 == i) {
                z2 = true;
            }
            com.amazon.aps.iva.cq.b.t(z2);
            long[] jArr = this.g;
            if (jArr.length != copyOf.length) {
                jArr = a(jArr, copyOf.length);
            }
            long[] jArr2 = jArr;
            Uri[] uriArr = this.e;
            if (uriArr.length != copyOf.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, copyOf.length);
            }
            copyOf[i2] = i;
            return new a(this.b, this.c, this.d, copyOf, uriArr, jArr2, this.h, this.i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f) && Arrays.equals(this.g, aVar.g) && this.h == aVar.h && this.i == aVar.i) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            long j2 = this.b;
            int hashCode = Arrays.hashCode(this.f);
            int hashCode2 = Arrays.hashCode(this.g);
            long j3 = this.h;
            return ((((hashCode2 + ((hashCode + (((((((this.c * 31) + this.d) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.e)) * 31)) * 31)) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.i ? 1 : 0);
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(j, this.b);
            bundle.putInt(k, this.c);
            bundle.putInt(q, this.d);
            bundle.putParcelableArrayList(l, new ArrayList<>(Arrays.asList(this.e)));
            bundle.putIntArray(m, this.f);
            bundle.putLongArray(n, this.g);
            bundle.putLong(o, this.h);
            bundle.putBoolean(p, this.i);
            return bundle;
        }

        public a(long j2, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j3, boolean z) {
            com.amazon.aps.iva.cq.b.t(iArr.length == uriArr.length);
            this.b = j2;
            this.c = i;
            this.d = i2;
            this.f = iArr;
            this.e = uriArr;
            this.g = jArr;
            this.h = j3;
            this.i = z;
        }
    }

    public c(Object obj, a[] aVarArr, long j2, long j3, int i2) {
        this.b = obj;
        this.d = j2;
        this.e = j3;
        this.c = aVarArr.length + i2;
        this.g = aVarArr;
        this.f = i2;
    }

    public final a a(int i2) {
        int i3 = this.f;
        if (i2 < i3) {
            return i;
        }
        return this.g[i2 - i3];
    }

    public final int b(long j2, long j3) {
        int i2;
        boolean z;
        if (j2 == Long.MIN_VALUE) {
            return -1;
        }
        if (j3 != -9223372036854775807L && j2 >= j3) {
            return -1;
        }
        int i3 = this.f;
        while (true) {
            i2 = this.c;
            if (i3 >= i2) {
                break;
            }
            if (a(i3).b == Long.MIN_VALUE || a(i3).b > j2) {
                a a2 = a(i3);
                int i4 = a2.c;
                if (i4 != -1 && a2.b(-1) >= i4) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    break;
                }
            }
            i3++;
        }
        if (i3 >= i2) {
            return -1;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d A[LOOP:0: B:3:0x0009->B:24:0x003d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0040 A[EDGE_INSN: B:42:0x0040->B:25:0x0040 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(long r10, long r12) {
        /*
            r9 = this;
            int r0 = r9.c
            r1 = 1
            int r0 = r0 - r1
            boolean r2 = r9.d(r0)
            int r0 = r0 - r2
        L9:
            r2 = 0
            r3 = -1
            if (r0 < 0) goto L40
            r4 = -9223372036854775808
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 != 0) goto L14
            goto L3a
        L14:
            com.amazon.aps.iva.q5.c$a r6 = r9.a(r0)
            long r7 = r6.b
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L34
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 == 0) goto L38
            boolean r4 = r6.i
            if (r4 == 0) goto L2f
            int r4 = r6.c
            if (r4 == r3) goto L38
        L2f:
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 >= 0) goto L3a
            goto L38
        L34:
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 >= 0) goto L3a
        L38:
            r4 = r1
            goto L3b
        L3a:
            r4 = r2
        L3b:
            if (r4 == 0) goto L40
            int r0 = r0 + (-1)
            goto L9
        L40:
            if (r0 < 0) goto L5e
            com.amazon.aps.iva.q5.c$a r10 = r9.a(r0)
            int r11 = r10.c
            if (r11 != r3) goto L4b
            goto L5b
        L4b:
            r12 = r2
        L4c:
            if (r12 >= r11) goto L5a
            int[] r13 = r10.f
            r13 = r13[r12]
            if (r13 == 0) goto L5b
            if (r13 != r1) goto L57
            goto L5b
        L57:
            int r12 = r12 + 1
            goto L4c
        L5a:
            r1 = r2
        L5b:
            if (r1 == 0) goto L5e
            goto L5f
        L5e:
            r0 = r3
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q5.c.c(long, long):int");
    }

    public final boolean d(int i2) {
        boolean z;
        if (i2 == this.c - 1) {
            a a2 = a(i2);
            if (a2.i && a2.b == Long.MIN_VALUE && a2.c == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final c e(int i2, int i3) {
        boolean z;
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        int i4 = i2 - this.f;
        a[] aVarArr = this.g;
        if (aVarArr[i4].c == i3) {
            return this;
        }
        a[] aVarArr2 = (a[]) com.amazon.aps.iva.t5.g0.S(aVarArr, aVarArr.length);
        aVarArr2[i4] = aVarArr[i4].c(i3);
        return new c(this.b, aVarArr2, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (com.amazon.aps.iva.t5.g0.a(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && Arrays.equals(this.g, cVar.g)) {
            return true;
        }
        return false;
    }

    public final c f(int i2, int i3) {
        int i4 = i2 - this.f;
        a[] aVarArr = this.g;
        a[] aVarArr2 = (a[]) com.amazon.aps.iva.t5.g0.S(aVarArr, aVarArr.length);
        aVarArr2[i4] = aVarArr2[i4].d(4, i3);
        return new c(this.b, aVarArr2, this.d, this.e, this.f);
    }

    public final c g(int i2, int i3) {
        int i4 = i2 - this.f;
        a[] aVarArr = this.g;
        a[] aVarArr2 = (a[]) com.amazon.aps.iva.t5.g0.S(aVarArr, aVarArr.length);
        aVarArr2[i4] = aVarArr2[i4].d(2, i3);
        return new c(this.b, aVarArr2, this.d, this.e, this.f);
    }

    public final c h(int i2) {
        a aVar;
        int i3 = i2 - this.f;
        a[] aVarArr = this.g;
        a[] aVarArr2 = (a[]) com.amazon.aps.iva.t5.g0.S(aVarArr, aVarArr.length);
        a aVar2 = aVarArr2[i3];
        if (aVar2.c == -1) {
            aVar = new a(aVar2.b, 0, aVar2.d, new int[0], new Uri[0], new long[0], aVar2.h, aVar2.i);
        } else {
            int[] iArr = aVar2.f;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = copyOf[i4];
                if (i5 == 1 || i5 == 0) {
                    copyOf[i4] = 2;
                }
            }
            aVar = new a(aVar2.b, length, aVar2.d, copyOf, aVar2.e, aVar2.g, aVar2.h, aVar2.i);
        }
        aVarArr2[i3] = aVar;
        return new c(this.b, aVarArr2, this.d, this.e, this.f);
    }

    public final int hashCode() {
        int hashCode;
        int i2 = this.c * 31;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i2 + hashCode) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + this.f) * 31) + Arrays.hashCode(this.g);
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (a aVar : this.g) {
            arrayList.add(aVar.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(j, arrayList);
        }
        long j2 = this.d;
        if (j2 != 0) {
            bundle.putLong(k, j2);
        }
        long j3 = this.e;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(l, j3);
        }
        int i2 = this.f;
        if (i2 != 0) {
            bundle.putInt(m, i2);
        }
        return bundle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.b);
        sb.append(", adResumePositionUs=");
        sb.append(this.d);
        sb.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.g;
            if (i2 < aVarArr.length) {
                sb.append("adGroup(timeUs=");
                sb.append(aVarArr[i2].b);
                sb.append(", ads=[");
                for (int i3 = 0; i3 < aVarArr[i2].f.length; i3++) {
                    sb.append("ad(state=");
                    int i4 = aVarArr[i2].f[i3];
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 != 4) {
                                        sb.append('?');
                                    } else {
                                        sb.append('!');
                                    }
                                } else {
                                    sb.append('P');
                                }
                            } else {
                                sb.append('S');
                            }
                        } else {
                            sb.append('R');
                        }
                    } else {
                        sb.append('_');
                    }
                    sb.append(", durationUs=");
                    sb.append(aVarArr[i2].g[i3]);
                    sb.append(')');
                    if (i3 < aVarArr[i2].f.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i2 < aVarArr.length - 1) {
                    sb.append(", ");
                }
                i2++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.Object r10, long... r11) {
        /*
            r9 = this;
            int r0 = r11.length
            com.amazon.aps.iva.q5.c$a[] r3 = new com.amazon.aps.iva.q5.c.a[r0]
            r1 = 0
        L4:
            if (r1 >= r0) goto L12
            com.amazon.aps.iva.q5.c$a r2 = new com.amazon.aps.iva.q5.c$a
            r4 = r11[r1]
            r2.<init>(r4)
            r3[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            r4 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            r1 = r9
            r2 = r10
            r1.<init>(r2, r3, r4, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q5.c.<init>(java.lang.Object, long[]):void");
    }
}
