package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* compiled from: DiffUtil.java */
/* loaded from: classes.dex */
public final class n {
    public static final a a = new a();

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return cVar.a - cVar2.a;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class c {
        public final int a;
        public final int b;
        public final int c;

        public c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class d {
        public final List<c> a;
        public final int[] b;
        public final int[] c;
        public final b d;
        public final int e;
        public final int f;
        public final boolean g;

        public d(b bVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
            c cVar;
            b bVar2;
            int[] iArr3;
            int[] iArr4;
            int i;
            c cVar2;
            int i2;
            int i3;
            int i4;
            this.a = arrayList;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.d = bVar;
            int oldListSize = bVar.getOldListSize();
            this.e = oldListSize;
            int newListSize = bVar.getNewListSize();
            this.f = newListSize;
            this.g = true;
            if (arrayList.isEmpty()) {
                cVar = null;
            } else {
                cVar = (c) arrayList.get(0);
            }
            if (cVar == null || cVar.a != 0 || cVar.b != 0) {
                arrayList.add(0, new c(0, 0, 0));
            }
            arrayList.add(new c(oldListSize, newListSize, 0));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                bVar2 = this.d;
                iArr3 = this.c;
                iArr4 = this.b;
                if (!hasNext) {
                    break;
                }
                c cVar3 = (c) it.next();
                for (int i5 = 0; i5 < cVar3.c; i5++) {
                    int i6 = cVar3.a + i5;
                    int i7 = cVar3.b + i5;
                    if (bVar2.areContentsTheSame(i6, i7)) {
                        i4 = 1;
                    } else {
                        i4 = 2;
                    }
                    iArr4[i6] = (i7 << 4) | i4;
                    iArr3[i7] = (i6 << 4) | i4;
                }
            }
            if (this.g) {
                Iterator it2 = arrayList.iterator();
                int i8 = 0;
                while (it2.hasNext()) {
                    c cVar4 = (c) it2.next();
                    while (true) {
                        i = cVar4.a;
                        if (i8 < i) {
                            if (iArr4[i8] == 0) {
                                int size = arrayList.size();
                                int i9 = 0;
                                int i10 = 0;
                                while (true) {
                                    if (i9 < size) {
                                        cVar2 = (c) arrayList.get(i9);
                                        while (true) {
                                            i2 = cVar2.b;
                                            if (i10 < i2) {
                                                if (iArr3[i10] == 0 && bVar2.areItemsTheSame(i8, i10)) {
                                                    if (bVar2.areContentsTheSame(i8, i10)) {
                                                        i3 = 8;
                                                    } else {
                                                        i3 = 4;
                                                    }
                                                    iArr4[i8] = (i10 << 4) | i3;
                                                    iArr3[i10] = i3 | (i8 << 4);
                                                } else {
                                                    i10++;
                                                }
                                            }
                                        }
                                    }
                                    i10 = cVar2.c + i2;
                                    i9++;
                                }
                            }
                            i8++;
                        }
                    }
                    i8 = cVar4.c + i;
                }
            }
        }

        public static f b(ArrayDeque arrayDeque, int i, boolean z) {
            f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (it.hasNext()) {
                    fVar = (f) it.next();
                    if (fVar.a == i && fVar.c == z) {
                        it.remove();
                        break;
                    }
                } else {
                    fVar = null;
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (z) {
                    fVar2.b--;
                } else {
                    fVar2.b++;
                }
            }
            return fVar;
        }

        public final void a(com.amazon.aps.iva.o8.b bVar) {
            com.amazon.aps.iva.o8.a aVar;
            int i;
            int[] iArr;
            b bVar2;
            int i2;
            List<c> list;
            int i3;
            d dVar = this;
            if (bVar instanceof com.amazon.aps.iva.o8.a) {
                aVar = (com.amazon.aps.iva.o8.a) bVar;
            } else {
                aVar = new com.amazon.aps.iva.o8.a(bVar);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            List<c> list2 = dVar.a;
            int size = list2.size() - 1;
            int i4 = dVar.e;
            int i5 = dVar.f;
            int i6 = i4;
            while (size >= 0) {
                c cVar = list2.get(size);
                int i7 = cVar.a;
                int i8 = cVar.c;
                int i9 = i7 + i8;
                int i10 = cVar.b;
                int i11 = i8 + i10;
                while (true) {
                    i = 0;
                    iArr = dVar.b;
                    bVar2 = dVar.d;
                    if (i6 <= i9) {
                        break;
                    }
                    i6--;
                    int i12 = iArr[i6];
                    if ((i12 & 12) != 0) {
                        list = list2;
                        int i13 = i12 >> 4;
                        f b = b(arrayDeque, i13, false);
                        if (b != null) {
                            i3 = i5;
                            int i14 = (i4 - b.b) - 1;
                            aVar.d(i6, i14);
                            if ((i12 & 4) != 0) {
                                aVar.c(i14, 1, bVar2.getChangePayload(i6, i13));
                            }
                        } else {
                            i3 = i5;
                            arrayDeque.add(new f(i6, (i4 - i6) - 1, true));
                        }
                    } else {
                        list = list2;
                        i3 = i5;
                        aVar.b(i6, 1);
                        i4--;
                    }
                    list2 = list;
                    i5 = i3;
                }
                List<c> list3 = list2;
                while (i5 > i11) {
                    i5--;
                    int i15 = dVar.c[i5];
                    if ((i15 & 12) != 0) {
                        int i16 = i15 >> 4;
                        f b2 = b(arrayDeque, i16, true);
                        if (b2 == null) {
                            arrayDeque.add(new f(i5, i4 - i6, false));
                            i2 = 0;
                        } else {
                            i2 = 0;
                            aVar.d((i4 - b2.b) - 1, i6);
                            if ((i15 & 4) != 0) {
                                aVar.c(i6, 1, bVar2.getChangePayload(i16, i5));
                            }
                        }
                    } else {
                        i2 = i;
                        aVar.a(i6, 1);
                        i4++;
                    }
                    dVar = this;
                    i = i2;
                }
                i6 = cVar.a;
                int i17 = i6;
                int i18 = i10;
                while (i < i8) {
                    if ((iArr[i17] & 15) == 2) {
                        aVar.c(i17, 1, bVar2.getChangePayload(i17, i18));
                    }
                    i17++;
                    i18++;
                    i++;
                }
                size--;
                dVar = this;
                i5 = i10;
                list2 = list3;
            }
            aVar.e();
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static abstract class e<T> {
        public abstract boolean areContentsTheSame(T t, T t2);

        public abstract boolean areItemsTheSame(T t, T t2);

        public Object getChangePayload(T t, T t2) {
            return null;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class f {
        public final int a;
        public int b;
        public final boolean c;

        public f(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class g {
        public int a;
        public int b;
        public int c;
        public int d;

        public g() {
        }

        public g(int i, int i2) {
            this.a = 0;
            this.b = i;
            this.c = 0;
            this.d = i2;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class h {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        public final int a() {
            return Math.min(this.c - this.a, this.d - this.b);
        }
    }

    public static d a(b bVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        g gVar;
        h hVar;
        ArrayList arrayList3;
        int i;
        g gVar2;
        g gVar3;
        boolean z;
        c cVar;
        boolean z2;
        int i2;
        int i3;
        int i4;
        boolean z3;
        h hVar2;
        boolean z4;
        h hVar3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new g(oldListSize, newListSize));
        int i13 = oldListSize + newListSize;
        int i14 = 1;
        int i15 = (((i13 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i15];
        int i16 = i15 / 2;
        int[] iArr2 = new int[i15];
        ArrayList arrayList6 = new ArrayList();
        while (!arrayList5.isEmpty()) {
            g gVar4 = (g) arrayList5.remove(arrayList5.size() - i14);
            int i17 = gVar4.b;
            int i18 = gVar4.a;
            int i19 = i17 - i18;
            if (i19 >= i14 && (i2 = gVar4.d - gVar4.c) >= i14) {
                int i20 = ((i2 + i19) + i14) / 2;
                int i21 = i14 + i16;
                iArr[i21] = i18;
                iArr2[i21] = i17;
                int i22 = 0;
                while (i22 < i20) {
                    if (Math.abs((gVar4.b - gVar4.a) - (gVar4.d - gVar4.c)) % 2 == i14) {
                        i3 = i14;
                    } else {
                        i3 = 0;
                    }
                    int i23 = (gVar4.b - gVar4.a) - (gVar4.d - gVar4.c);
                    int i24 = -i22;
                    int i25 = i24;
                    while (true) {
                        if (i25 <= i22) {
                            if (i25 != i24 && (i25 == i22 || iArr[i25 + 1 + i16] <= iArr[(i25 - 1) + i16])) {
                                i9 = iArr[(i25 - 1) + i16];
                                i10 = i9 + 1;
                            } else {
                                i9 = iArr[i25 + 1 + i16];
                                i10 = i9;
                            }
                            i4 = i20;
                            arrayList = arrayList5;
                            int i26 = ((i10 - gVar4.a) + gVar4.c) - i25;
                            if (i22 != 0 && i10 == i9) {
                                i11 = i26 - 1;
                            } else {
                                i11 = i26;
                            }
                            arrayList2 = arrayList6;
                            while (i10 < gVar4.b && i26 < gVar4.d && bVar.areItemsTheSame(i10, i26)) {
                                i10++;
                                i26++;
                            }
                            iArr[i25 + i16] = i10;
                            if (i3 != 0) {
                                int i27 = i23 - i25;
                                i12 = i3;
                                if (i27 >= i24 + 1 && i27 <= i22 - 1 && iArr2[i27 + i16] <= i10) {
                                    hVar2 = new h();
                                    hVar2.a = i9;
                                    hVar2.b = i11;
                                    hVar2.c = i10;
                                    hVar2.d = i26;
                                    z3 = false;
                                    hVar2.e = false;
                                    break;
                                }
                            } else {
                                i12 = i3;
                            }
                            i25 += 2;
                            i20 = i4;
                            arrayList5 = arrayList;
                            arrayList6 = arrayList2;
                            i3 = i12;
                        } else {
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            i4 = i20;
                            z3 = false;
                            hVar2 = null;
                            break;
                        }
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        gVar = gVar4;
                        break;
                    }
                    int i28 = (gVar4.b - gVar4.a) - (gVar4.d - gVar4.c);
                    if (i28 % 2 == 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    int i29 = i24;
                    while (true) {
                        if (i29 <= i22) {
                            if (i29 != i24 && (i29 == i22 || iArr2[i29 + 1 + i16] >= iArr2[(i29 - 1) + i16])) {
                                i5 = iArr2[(i29 - 1) + i16];
                                i6 = i5 - 1;
                            } else {
                                i5 = iArr2[i29 + 1 + i16];
                                i6 = i5;
                            }
                            int i30 = gVar4.d - ((gVar4.b - i6) - i29);
                            if (i22 != 0 && i6 == i5) {
                                i7 = i30 + 1;
                            } else {
                                i7 = i30;
                            }
                            while (i6 > gVar4.a && i30 > gVar4.c) {
                                int i31 = i6 - 1;
                                gVar = gVar4;
                                int i32 = i30 - 1;
                                if (!bVar.areItemsTheSame(i31, i32)) {
                                    break;
                                }
                                i6 = i31;
                                i30 = i32;
                                gVar4 = gVar;
                            }
                            gVar = gVar4;
                            iArr2[i29 + i16] = i6;
                            if (z4 && (i8 = i28 - i29) >= i24 && i8 <= i22 && iArr[i8 + i16] >= i6) {
                                hVar3 = new h();
                                hVar3.a = i6;
                                hVar3.b = i30;
                                hVar3.c = i5;
                                hVar3.d = i7;
                                hVar3.e = true;
                                break;
                            }
                            i29 += 2;
                            gVar4 = gVar;
                        } else {
                            gVar = gVar4;
                            hVar3 = null;
                            break;
                        }
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i22++;
                    i20 = i4;
                    arrayList5 = arrayList;
                    arrayList6 = arrayList2;
                    gVar4 = gVar;
                    i14 = 1;
                }
            }
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            gVar = gVar4;
            hVar = null;
            if (hVar != null) {
                if (hVar.a() > 0) {
                    int i33 = hVar.d;
                    int i34 = hVar.b;
                    int i35 = i33 - i34;
                    int i36 = hVar.c;
                    int i37 = hVar.a;
                    int i38 = i36 - i37;
                    if (i35 != i38) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (hVar.e) {
                            cVar = new c(i37, i34, hVar.a());
                        } else {
                            if (i35 > i38) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                cVar = new c(i37, i34 + 1, hVar.a());
                            } else {
                                cVar = new c(i37 + 1, i34, hVar.a());
                            }
                        }
                    } else {
                        cVar = new c(i37, i34, i38);
                    }
                    arrayList4.add(cVar);
                }
                if (arrayList2.isEmpty()) {
                    gVar2 = new g();
                    arrayList6 = arrayList2;
                    gVar3 = gVar;
                    i = 1;
                } else {
                    i = 1;
                    arrayList6 = arrayList2;
                    gVar2 = (g) arrayList6.remove(arrayList2.size() - 1);
                    gVar3 = gVar;
                }
                gVar2.a = gVar3.a;
                gVar2.c = gVar3.c;
                gVar2.b = hVar.a;
                gVar2.d = hVar.b;
                arrayList3 = arrayList;
                arrayList3.add(gVar2);
                gVar3.b = gVar3.b;
                gVar3.d = gVar3.d;
                gVar3.a = hVar.c;
                gVar3.c = hVar.d;
                arrayList3.add(gVar3);
            } else {
                arrayList3 = arrayList;
                arrayList6 = arrayList2;
                i = 1;
                arrayList6.add(gVar);
            }
            i14 = i;
            arrayList5 = arrayList3;
        }
        Collections.sort(arrayList4, a);
        return new d(bVar, arrayList4, iArr, iArr2);
    }
}
