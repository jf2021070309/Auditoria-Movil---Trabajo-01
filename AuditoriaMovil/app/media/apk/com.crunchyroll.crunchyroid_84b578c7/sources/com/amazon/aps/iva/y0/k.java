package com.amazon.aps.iva.y0;

import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.internal.http.StatusLine;
/* compiled from: SnapshotIdSet.kt */
/* loaded from: classes.dex */
public final class k implements Iterable<Integer>, com.amazon.aps.iva.zb0.a {
    public static final k f = new k(0, 0, 0, null);
    public final long b;
    public final long c;
    public final int d;
    public final int[] e;

    /* compiled from: SnapshotIdSet.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ne0.j<? super Integer>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int[] i;
        public int j;
        public int k;
        public int l;
        public /* synthetic */ Object m;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.m = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.ne0.j<? super Integer> jVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0074 -> B:19:0x0077). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ab -> B:32:0x00af). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ae -> B:32:0x00af). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e5 -> B:45:0x00ea). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y0.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k(long j, long j2, int i, int[] iArr) {
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = iArr;
    }

    public final k b(k kVar) {
        int[] iArr;
        com.amazon.aps.iva.yb0.j.f(kVar, "bits");
        k kVar2 = f;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar2;
        }
        int i = this.d;
        if (kVar.d == i && kVar.e == (iArr = this.e)) {
            return new k(this.b & (~kVar.b), (~kVar.c) & this.c, i, iArr);
        }
        Iterator<Integer> it = kVar.iterator();
        k kVar3 = this;
        while (it.hasNext()) {
            kVar3 = kVar3.d(it.next().intValue());
        }
        return kVar3;
    }

    public final k d(int i) {
        int[] iArr;
        int p;
        int i2 = this.d;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.c;
            if ((j2 & j) != 0) {
                return new k(this.b, j2 & (~j), i2, this.e);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new k(j4 & (~j3), this.c, i2, this.e);
            }
        } else if (i3 < 0 && (iArr = this.e) != null && (p = com.amazon.aps.iva.cq.b.p(i, iArr)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new k(this.b, this.c, this.d, null);
            }
            int[] iArr2 = new int[length];
            if (p > 0) {
                com.amazon.aps.iva.lb0.m.C(0, 0, iArr, iArr2, p);
            }
            if (p < length) {
                com.amazon.aps.iva.lb0.m.C(p, p + 1, iArr, iArr2, length + 1);
            }
            return new k(this.b, this.c, this.d, iArr2);
        }
        return this;
    }

    public final boolean e(int i) {
        int[] iArr;
        int i2 = i - this.d;
        boolean z = true;
        if (i2 >= 0 && i2 < 64) {
            if (((1 << i2) & this.c) != 0) {
                return true;
            }
            return false;
        } else if (i2 >= 64 && i2 < 128) {
            if (((1 << (i2 - 64)) & this.b) != 0) {
                return true;
            }
            return false;
        } else if (i2 > 0 || (iArr = this.e) == null) {
            return false;
        } else {
            if (com.amazon.aps.iva.cq.b.p(i, iArr) < 0) {
                z = false;
            }
            return z;
        }
    }

    public final k g(k kVar) {
        int[] iArr;
        com.amazon.aps.iva.yb0.j.f(kVar, "bits");
        k kVar2 = f;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar;
        }
        int i = this.d;
        if (kVar.d == i && kVar.e == (iArr = this.e)) {
            return new k(this.b | kVar.b, this.c | kVar.c, i, iArr);
        }
        if (this.e == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                kVar = kVar.j(it.next().intValue());
            }
            return kVar;
        }
        Iterator<Integer> it2 = kVar.iterator();
        k kVar3 = this;
        while (it2.hasNext()) {
            kVar3 = kVar3.j(it2.next().intValue());
        }
        return kVar3;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        a aVar = new a(null);
        com.amazon.aps.iva.ne0.i iVar = new com.amazon.aps.iva.ne0.i();
        iVar.e = com.amazon.aps.iva.a60.b.o(aVar, iVar, iVar);
        return iVar;
    }

    public final k j(int i) {
        long j;
        int i2;
        int i3 = this.d;
        int i4 = i - i3;
        long j2 = this.c;
        if (i4 >= 0 && i4 < 64) {
            long j3 = 1 << i4;
            if ((j2 & j3) == 0) {
                return new k(this.b, j2 | j3, i3, this.e);
            }
        } else {
            long j4 = this.b;
            if (i4 >= 64 && i4 < 128) {
                long j5 = 1 << (i4 - 64);
                if ((j4 & j5) == 0) {
                    return new k(j4 | j5, j2, i3, this.e);
                }
            } else {
                int[] iArr = this.e;
                if (i4 >= 128) {
                    if (!e(i)) {
                        int i5 = ((i + 1) / 64) * 64;
                        int i6 = this.d;
                        ArrayList arrayList = null;
                        long j6 = j4;
                        while (true) {
                            if (i6 < i5) {
                                if (j2 != 0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        if (iArr != null) {
                                            for (int i7 : iArr) {
                                                arrayList.add(Integer.valueOf(i7));
                                            }
                                        }
                                    }
                                    for (int i8 = 0; i8 < 64; i8++) {
                                        if (((1 << i8) & j2) != 0) {
                                            arrayList.add(Integer.valueOf(i8 + i6));
                                        }
                                    }
                                }
                                if (j6 == 0) {
                                    i2 = i5;
                                    j = 0;
                                    break;
                                }
                                i6 += 64;
                                j2 = j6;
                                j6 = 0;
                            } else {
                                j = j2;
                                i2 = i6;
                                break;
                            }
                        }
                        if (arrayList != null) {
                            iArr = com.amazon.aps.iva.lb0.x.W0(arrayList);
                        }
                        return new k(j6, j, i2, iArr).j(i);
                    }
                } else if (iArr == null) {
                    return new k(j4, j2, i3, new int[]{i});
                } else {
                    int p = com.amazon.aps.iva.cq.b.p(i, iArr);
                    if (p < 0) {
                        int i9 = -(p + 1);
                        int length = iArr.length + 1;
                        int[] iArr2 = new int[length];
                        com.amazon.aps.iva.lb0.m.C(0, 0, iArr, iArr2, i9);
                        com.amazon.aps.iva.lb0.m.C(i9 + 1, i9, iArr, iArr2, length - 1);
                        iArr2[i9] = i;
                        return new k(this.b, this.c, this.d, iArr2);
                    }
                }
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(this));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            boolean z = true;
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null) {
                z = obj instanceof CharSequence;
            }
            if (z) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        String sb3 = sb2.toString();
        com.amazon.aps.iva.yb0.j.e(sb3, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb.append(sb3);
        sb.append(']');
        return sb.toString();
    }
}
