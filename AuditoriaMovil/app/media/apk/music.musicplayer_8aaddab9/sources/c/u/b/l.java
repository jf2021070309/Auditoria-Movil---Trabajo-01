package c.u.b;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class l {
    public static final Comparator<c> a = new a();

    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            return cVar.a - cVar2.a;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean a(int i2, int i3);

        public abstract boolean b(int i2, int i3);

        public abstract Object c(int i2, int i3);

        public abstract int d();

        public abstract int e();
    }

    /* loaded from: classes.dex */
    public static class c {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2646b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2647c;

        public c(int i2, int i3, int i4) {
            this.a = i2;
            this.f2646b = i3;
            this.f2647c = i4;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final List<c> a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f2648b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f2649c;

        /* renamed from: d  reason: collision with root package name */
        public final b f2650d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2651e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2652f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f2653g;

        public d(b bVar, List<c> list, int[] iArr, int[] iArr2, boolean z) {
            int i2;
            c cVar;
            int i3;
            this.a = list;
            this.f2648b = iArr;
            this.f2649c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f2650d = bVar;
            int e2 = bVar.e();
            this.f2651e = e2;
            int d2 = bVar.d();
            this.f2652f = d2;
            this.f2653g = z;
            c cVar2 = list.isEmpty() ? null : list.get(0);
            if (cVar2 == null || cVar2.a != 0 || cVar2.f2646b != 0) {
                list.add(0, new c(0, 0, 0));
            }
            list.add(new c(e2, d2, 0));
            for (c cVar3 : list) {
                for (int i4 = 0; i4 < cVar3.f2647c; i4++) {
                    int i5 = cVar3.a + i4;
                    int i6 = cVar3.f2646b + i4;
                    int i7 = this.f2650d.a(i5, i6) ? 1 : 2;
                    this.f2648b[i5] = (i6 << 4) | i7;
                    this.f2649c[i6] = (i5 << 4) | i7;
                }
            }
            if (this.f2653g) {
                int i8 = 0;
                for (c cVar4 : this.a) {
                    while (true) {
                        i2 = cVar4.a;
                        if (i8 < i2) {
                            if (this.f2648b[i8] == 0) {
                                int size = this.a.size();
                                int i9 = 0;
                                int i10 = 0;
                                while (true) {
                                    if (i9 < size) {
                                        cVar = this.a.get(i9);
                                        while (true) {
                                            i3 = cVar.f2646b;
                                            if (i10 < i3) {
                                                if (this.f2649c[i10] == 0 && this.f2650d.b(i8, i10)) {
                                                    int i11 = this.f2650d.a(i8, i10) ? 8 : 4;
                                                    this.f2648b[i8] = (i10 << 4) | i11;
                                                    this.f2649c[i10] = i11 | (i8 << 4);
                                                } else {
                                                    i10++;
                                                }
                                            }
                                        }
                                    }
                                    i10 = cVar.f2647c + i3;
                                    i9++;
                                }
                            }
                            i8++;
                        }
                    }
                    i8 = cVar4.f2647c + i2;
                }
            }
        }

        public static f b(Collection<f> collection, int i2, boolean z) {
            f fVar;
            Iterator<f> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = it.next();
                if (fVar.a == i2 && fVar.f2655c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f next = it.next();
                if (z) {
                    next.f2654b--;
                } else {
                    next.f2654b++;
                }
            }
            return fVar;
        }

        public void a(t tVar) {
            int i2;
            c.u.b.d dVar = tVar instanceof c.u.b.d ? (c.u.b.d) tVar : new c.u.b.d(tVar);
            int i3 = this.f2651e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i4 = this.f2651e;
            int i5 = this.f2652f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                c cVar = this.a.get(size);
                int i6 = cVar.a;
                int i7 = cVar.f2647c;
                int i8 = i6 + i7;
                int i9 = cVar.f2646b + i7;
                while (true) {
                    if (i4 <= i8) {
                        break;
                    }
                    i4--;
                    int i10 = this.f2648b[i4];
                    if ((i10 & 12) != 0) {
                        int i11 = i10 >> 4;
                        f b2 = b(arrayDeque, i11, false);
                        if (b2 != null) {
                            int i12 = (i3 - b2.f2654b) - 1;
                            dVar.a(i4, i12);
                            if ((i10 & 4) != 0) {
                                this.f2650d.c(i4, i11);
                                dVar.d(i12, 1, null);
                            }
                        } else {
                            arrayDeque.add(new f(i4, (i3 - i4) - 1, true));
                        }
                    } else {
                        dVar.c(i4, 1);
                        i3--;
                    }
                }
                while (i5 > i9) {
                    i5--;
                    int i13 = this.f2649c[i5];
                    if ((i13 & 12) != 0) {
                        int i14 = i13 >> 4;
                        f b3 = b(arrayDeque, i14, true);
                        if (b3 == null) {
                            arrayDeque.add(new f(i5, i3 - i4, false));
                        } else {
                            dVar.a((i3 - b3.f2654b) - 1, i4);
                            if ((i13 & 4) != 0) {
                                this.f2650d.c(i14, i5);
                                dVar.d(i4, 1, null);
                            }
                        }
                    } else {
                        dVar.b(i4, 1);
                        i3++;
                    }
                }
                int i15 = cVar.a;
                int i16 = cVar.f2646b;
                for (i2 = 0; i2 < cVar.f2647c; i2++) {
                    if ((this.f2648b[i15] & 15) == 2) {
                        this.f2650d.c(i15, i16);
                        dVar.d(i15, 1, null);
                    }
                    i15++;
                    i16++;
                }
                i4 = cVar.a;
                i5 = cVar.f2646b;
            }
            dVar.e();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T> {
    }

    /* loaded from: classes.dex */
    public static class f {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f2654b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2655c;

        public f(int i2, int i3, boolean z) {
            this.a = i2;
            this.f2654b = i3;
            this.f2655c = z;
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f2656b;

        /* renamed from: c  reason: collision with root package name */
        public int f2657c;

        /* renamed from: d  reason: collision with root package name */
        public int f2658d;

        public g() {
        }

        public g(int i2, int i3, int i4, int i5) {
            this.a = i2;
            this.f2656b = i3;
            this.f2657c = i4;
            this.f2658d = i5;
        }

        public int a() {
            return this.f2658d - this.f2657c;
        }

        public int b() {
            return this.f2656b - this.a;
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f2659b;

        /* renamed from: c  reason: collision with root package name */
        public int f2660c;

        /* renamed from: d  reason: collision with root package name */
        public int f2661d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2662e;

        public int a() {
            return Math.min(this.f2660c - this.a, this.f2661d - this.f2659b);
        }
    }

    public static d a(b bVar, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        g gVar;
        h hVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        g gVar2;
        g gVar3;
        c cVar;
        int i2;
        h hVar2;
        h hVar3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int e2 = bVar.e();
        int d2 = bVar.d();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new g(0, e2, 0, d2));
        int i9 = e2 + d2;
        int i10 = 1;
        int i11 = (((i9 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i11];
        int i12 = i11 / 2;
        int[] iArr2 = new int[i11];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            g gVar4 = (g) arrayList6.remove(arrayList6.size() - i10);
            if (gVar4.b() >= i10 && gVar4.a() >= i10) {
                int a2 = ((gVar4.a() + gVar4.b()) + i10) / 2;
                int i13 = i10 + i12;
                iArr[i13] = gVar4.a;
                iArr2[i13] = gVar4.f2656b;
                int i14 = 0;
                while (i14 < a2) {
                    boolean z3 = Math.abs(gVar4.b() - gVar4.a()) % 2 == i10;
                    int b2 = gVar4.b() - gVar4.a();
                    int i15 = -i14;
                    int i16 = i15;
                    while (true) {
                        if (i16 > i14) {
                            arrayList = arrayList7;
                            arrayList2 = arrayList6;
                            i2 = a2;
                            hVar2 = null;
                            break;
                        }
                        if (i16 == i15 || (i16 != i14 && iArr[i16 + 1 + i12] > iArr[(i16 - 1) + i12])) {
                            i6 = iArr[i16 + 1 + i12];
                            i7 = i6;
                        } else {
                            i6 = iArr[(i16 - 1) + i12];
                            i7 = i6 + 1;
                        }
                        i2 = a2;
                        arrayList2 = arrayList6;
                        int i17 = ((i7 - gVar4.a) + gVar4.f2657c) - i16;
                        if (i14 == 0 || i7 != i6) {
                            arrayList = arrayList7;
                            i8 = i17;
                        } else {
                            i8 = i17 - 1;
                            arrayList = arrayList7;
                        }
                        while (i7 < gVar4.f2656b && i17 < gVar4.f2658d && bVar.b(i7, i17)) {
                            i7++;
                            i17++;
                        }
                        iArr[i16 + i12] = i7;
                        if (z3) {
                            int i18 = b2 - i16;
                            z2 = z3;
                            if (i18 >= i15 + 1 && i18 <= i14 - 1 && iArr2[i18 + i12] <= i7) {
                                hVar2 = new h();
                                hVar2.a = i6;
                                hVar2.f2659b = i8;
                                hVar2.f2660c = i7;
                                hVar2.f2661d = i17;
                                hVar2.f2662e = false;
                                break;
                            }
                        } else {
                            z2 = z3;
                        }
                        i16 += 2;
                        a2 = i2;
                        arrayList6 = arrayList2;
                        arrayList7 = arrayList;
                        z3 = z2;
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        gVar = gVar4;
                        break;
                    }
                    boolean z4 = (gVar4.b() - gVar4.a()) % 2 == 0;
                    int b3 = gVar4.b() - gVar4.a();
                    int i19 = i15;
                    while (true) {
                        if (i19 > i14) {
                            gVar = gVar4;
                            hVar3 = null;
                            break;
                        }
                        if (i19 == i15 || (i19 != i14 && iArr2[i19 + 1 + i12] < iArr2[(i19 - 1) + i12])) {
                            i3 = iArr2[i19 + 1 + i12];
                            i4 = i3;
                        } else {
                            i3 = iArr2[(i19 - 1) + i12];
                            i4 = i3 - 1;
                        }
                        int i20 = gVar4.f2658d - ((gVar4.f2656b - i4) - i19);
                        int i21 = (i14 == 0 || i4 != i3) ? i20 : i20 + 1;
                        while (i4 > gVar4.a && i20 > gVar4.f2657c) {
                            int i22 = i4 - 1;
                            gVar = gVar4;
                            int i23 = i20 - 1;
                            if (!bVar.b(i22, i23)) {
                                break;
                            }
                            i4 = i22;
                            i20 = i23;
                            gVar4 = gVar;
                        }
                        gVar = gVar4;
                        iArr2[i19 + i12] = i4;
                        if (z4 && (i5 = b3 - i19) >= i15 && i5 <= i14 && iArr[i5 + i12] >= i4) {
                            hVar3 = new h();
                            hVar3.a = i4;
                            hVar3.f2659b = i20;
                            hVar3.f2660c = i3;
                            hVar3.f2661d = i21;
                            hVar3.f2662e = true;
                            break;
                        }
                        i19 += 2;
                        gVar4 = gVar;
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i14++;
                    a2 = i2;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList;
                    gVar4 = gVar;
                    i10 = 1;
                }
            }
            arrayList = arrayList7;
            arrayList2 = arrayList6;
            gVar = gVar4;
            hVar = null;
            if (hVar != null) {
                if (hVar.a() > 0) {
                    int i24 = hVar.f2661d;
                    int i25 = hVar.f2659b;
                    int i26 = i24 - i25;
                    int i27 = hVar.f2660c;
                    int i28 = hVar.a;
                    int i29 = i27 - i28;
                    if (!(i26 != i29)) {
                        cVar = new c(i28, i25, i29);
                    } else if (hVar.f2662e) {
                        cVar = new c(i28, i25, hVar.a());
                    } else {
                        cVar = i26 > i29 ? new c(i28, i25 + 1, hVar.a()) : new c(i28 + 1, i25, hVar.a());
                    }
                    arrayList5.add(cVar);
                }
                if (arrayList.isEmpty()) {
                    gVar2 = new g();
                    arrayList4 = arrayList;
                    gVar3 = gVar;
                    i10 = 1;
                } else {
                    i10 = 1;
                    arrayList4 = arrayList;
                    gVar2 = (g) arrayList4.remove(arrayList.size() - 1);
                    gVar3 = gVar;
                }
                gVar2.a = gVar3.a;
                gVar2.f2657c = gVar3.f2657c;
                gVar2.f2656b = hVar.a;
                gVar2.f2658d = hVar.f2659b;
                arrayList3 = arrayList2;
                arrayList3.add(gVar2);
                gVar3.f2656b = gVar3.f2656b;
                gVar3.f2658d = gVar3.f2658d;
                gVar3.a = hVar.f2660c;
                gVar3.f2657c = hVar.f2661d;
                arrayList3.add(gVar3);
            } else {
                arrayList3 = arrayList2;
                arrayList4 = arrayList;
                i10 = 1;
                arrayList4.add(gVar);
            }
            arrayList7 = arrayList4;
            arrayList6 = arrayList3;
        }
        Collections.sort(arrayList5, a);
        return new d(bVar, arrayList5, iArr, iArr2, z);
    }
}
