package com.amazon.aps.iva.k8;

import android.graphics.Color;
import com.amazon.aps.iva.g3.e;
import com.amazon.aps.iva.k8.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
/* compiled from: ColorCutQuantizer.java */
/* loaded from: classes.dex */
public final class a {
    public static final C0436a f = new C0436a();
    public final int[] a;
    public final int[] b;
    public final ArrayList c;
    public final b.c[] d;
    public final float[] e = new float[3];

    /* compiled from: ColorCutQuantizer.java */
    /* renamed from: com.amazon.aps.iva.k8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0436a implements Comparator<b> {
        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            return (((bVar4.i - bVar4.h) + 1) * (((bVar4.g - bVar4.f) + 1) * ((bVar4.e - bVar4.d) + 1))) - (((bVar3.i - bVar3.h) + 1) * (((bVar3.g - bVar3.f) + 1) * ((bVar3.e - bVar3.d) + 1)));
        }
    }

    /* compiled from: ColorCutQuantizer.java */
    /* loaded from: classes.dex */
    public class b {
        public final int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
            a();
        }

        public final void a() {
            a aVar = a.this;
            int[] iArr = aVar.a;
            int[] iArr2 = aVar.b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = 0;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = this.a; i8 <= this.b; i8++) {
                int i9 = iArr[i8];
                i4 += iArr2[i9];
                int i10 = (i9 >> 10) & 31;
                int i11 = (i9 >> 5) & 31;
                int i12 = i9 & 31;
                if (i10 > i7) {
                    i7 = i10;
                }
                if (i10 < i) {
                    i = i10;
                }
                if (i11 > i2) {
                    i2 = i11;
                }
                if (i11 < i5) {
                    i5 = i11;
                }
                if (i12 > i3) {
                    i3 = i12;
                }
                if (i12 < i6) {
                    i6 = i12;
                }
            }
            this.d = i;
            this.e = i7;
            this.f = i5;
            this.g = i2;
            this.h = i6;
            this.i = i3;
            this.c = i4;
        }
    }

    public a(int[] iArr, int i, b.c[] cVarArr) {
        boolean z;
        b bVar;
        int i2;
        int i3;
        int i4;
        boolean z2;
        this.d = cVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            int b2 = b(Color.blue(i7), 8, 5) | (b(Color.red(i7), 8, 5) << 10) | (b(Color.green(i7), 8, 5) << 5);
            iArr[i6] = b2;
            iArr2[b2] = iArr2[b2] + 1;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < 32768; i9++) {
            if (iArr2[i9] > 0) {
                int rgb = Color.rgb(b((i9 >> 10) & 31, 5, 8), b((i9 >> 5) & 31, 5, 8), b(i9 & 31, 5, 8));
                ThreadLocal<double[]> threadLocal = e.a;
                int red = Color.red(rgb);
                int green = Color.green(rgb);
                int blue = Color.blue(rgb);
                float[] fArr = this.e;
                e.a(red, green, blue, fArr);
                b.c[] cVarArr2 = this.d;
                if (cVarArr2 != null && cVarArr2.length > 0) {
                    for (b.c cVar : cVarArr2) {
                        if (!cVar.a(fArr)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    iArr2[i9] = 0;
                }
            }
            if (iArr2[i9] > 0) {
                i8++;
            }
        }
        int[] iArr3 = new int[i8];
        this.a = iArr3;
        int i10 = 0;
        for (int i11 = 0; i11 < 32768; i11++) {
            if (iArr2[i11] > 0) {
                iArr3[i10] = i11;
                i10++;
            }
        }
        if (i8 <= i) {
            this.c = new ArrayList();
            while (i5 < i8) {
                int i12 = iArr3[i5];
                this.c.add(new b.d(Color.rgb(b((i12 >> 10) & 31, 5, 8), b((i12 >> 5) & 31, 5, 8), b(i12 & 31, 5, 8)), iArr2[i12]));
                i5++;
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f);
        priorityQueue.offer(new b(0, this.a.length - 1));
        while (priorityQueue.size() < i && (bVar = (b) priorityQueue.poll()) != null) {
            int i13 = bVar.b;
            int i14 = bVar.a;
            if ((i13 + 1) - i14 > 1) {
                i2 = 1;
            } else {
                i2 = i5;
            }
            if (i2 == 0) {
                break;
            }
            if ((i13 + 1) - i14 > 1) {
                i3 = 1;
            } else {
                i3 = i5;
            }
            if (i3 != 0) {
                int i15 = bVar.e - bVar.d;
                int i16 = bVar.g - bVar.f;
                int i17 = bVar.i - bVar.h;
                if (i15 >= i16 && i15 >= i17) {
                    i4 = -3;
                } else if (i16 >= i15 && i16 >= i17) {
                    i4 = -2;
                } else {
                    i4 = -1;
                }
                a aVar = a.this;
                int[] iArr4 = aVar.a;
                a(i4, i14, i13, iArr4);
                Arrays.sort(iArr4, i14, bVar.b + 1);
                a(i4, i14, bVar.b, iArr4);
                int i18 = bVar.c / 2;
                int i19 = i5;
                int i20 = i14;
                while (true) {
                    int i21 = bVar.b;
                    if (i20 <= i21) {
                        i19 += aVar.b[iArr4[i20]];
                        if (i19 >= i18) {
                            i14 = Math.min(i21 - 1, i20);
                            break;
                        }
                        i20++;
                    }
                }
                b bVar2 = new b(i14 + 1, bVar.b);
                bVar.b = i14;
                bVar.a();
                priorityQueue.offer(bVar2);
                priorityQueue.offer(bVar);
                i5 = 0;
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            b bVar3 = (b) it.next();
            a aVar2 = a.this;
            int[] iArr5 = aVar2.a;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            for (int i26 = bVar3.a; i26 <= bVar3.b; i26++) {
                int i27 = iArr5[i26];
                int i28 = aVar2.b[i27];
                i23 += i28;
                i22 = (((i27 >> 10) & 31) * i28) + i22;
                i24 = (((i27 >> 5) & 31) * i28) + i24;
                i25 += i28 * (i27 & 31);
            }
            float f2 = i23;
            b.d dVar = new b.d(Color.rgb(b(Math.round(i22 / f2), 5, 8), b(Math.round(i24 / f2), 5, 8), b(Math.round(i25 / f2), 5, 8)), i23);
            float[] b3 = dVar.b();
            b.c[] cVarArr3 = this.d;
            if (cVarArr3 != null && cVarArr3.length > 0) {
                for (b.c cVar2 : cVarArr3) {
                    if (!cVar2.a(b3)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                arrayList.add(dVar);
            }
        }
        this.c = arrayList;
    }

    public static void a(int i, int i2, int i3, int[] iArr) {
        if (i != -2) {
            if (i == -1) {
                while (i2 <= i3) {
                    int i4 = iArr[i2];
                    iArr[i2] = ((i4 >> 10) & 31) | ((i4 & 31) << 10) | (((i4 >> 5) & 31) << 5);
                    i2++;
                }
                return;
            }
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = (i5 & 31) | (((i5 >> 5) & 31) << 10) | (((i5 >> 10) & 31) << 5);
            i2++;
        }
    }

    public static int b(int i, int i2, int i3) {
        int i4;
        if (i3 > i2) {
            i4 = i << (i3 - i2);
        } else {
            i4 = i >> (i2 - i3);
        }
        return i4 & ((1 << i3) - 1);
    }
}
