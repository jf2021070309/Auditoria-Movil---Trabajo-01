package com.amazon.aps.iva.t7;

import android.graphics.Bitmap;
import com.amazon.aps.iva.q7.c;
import com.amazon.aps.iva.q7.d;
import com.amazon.aps.iva.q7.f;
import com.amazon.aps.iva.s5.a;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.v;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
/* compiled from: PgsDecoder.java */
/* loaded from: classes.dex */
public final class a extends c {
    public final v m = new v();
    public final v n = new v();
    public final C0735a o = new C0735a();
    public Inflater p;

    /* compiled from: PgsDecoder.java */
    /* renamed from: com.amazon.aps.iva.t7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0735a {
        public final v a = new v();
        public final int[] b = new int[256];
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.amazon.aps.iva.q7.c
    public final d g(int i, byte[] bArr, boolean z) throws f {
        char c;
        com.amazon.aps.iva.s5.a aVar;
        int i2;
        int i3;
        int u;
        int i4;
        int i5;
        int w;
        v vVar = this.m;
        vVar.D(i, bArr);
        int i6 = vVar.c;
        int i7 = vVar.b;
        char c2 = 255;
        if (i6 - i7 > 0 && (vVar.a[i7] & UnsignedBytes.MAX_VALUE) == 120) {
            if (this.p == null) {
                this.p = new Inflater();
            }
            Inflater inflater = this.p;
            v vVar2 = this.n;
            if (g0.K(vVar, vVar2, inflater)) {
                vVar.D(vVar2.c, vVar2.a);
            }
        }
        C0735a c0735a = this.o;
        int i8 = 0;
        c0735a.d = 0;
        c0735a.e = 0;
        c0735a.f = 0;
        c0735a.g = 0;
        c0735a.h = 0;
        c0735a.i = 0;
        c0735a.a.C(0);
        c0735a.c = false;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i9 = vVar.c;
            if (i9 - vVar.b >= 3) {
                int u2 = vVar.u();
                int z2 = vVar.z();
                int i10 = vVar.b + z2;
                if (i10 > i9) {
                    vVar.F(i9);
                    c = c2;
                    aVar = null;
                } else {
                    int[] iArr = c0735a.b;
                    v vVar3 = c0735a.a;
                    if (u2 != 128) {
                        switch (u2) {
                            case 20:
                                if (z2 % 5 == 2) {
                                    vVar.G(2);
                                    Arrays.fill(iArr, i8);
                                    int i11 = z2 / 5;
                                    int i12 = i8;
                                    while (i12 < i11) {
                                        int u3 = vVar.u();
                                        int[] iArr2 = iArr;
                                        double u4 = vVar.u();
                                        double u5 = vVar.u() - 128;
                                        double u6 = vVar.u() - 128;
                                        iArr2[u3] = (g0.i((int) ((u4 - (0.34414d * u6)) - (u5 * 0.71414d)), 0, 255) << 8) | (g0.i((int) ((1.402d * u5) + u4), 0, 255) << 16) | (vVar.u() << 24) | g0.i((int) ((u6 * 1.772d) + u4), 0, 255);
                                        i12++;
                                        iArr = iArr2;
                                        i11 = i11;
                                        c2 = 255;
                                    }
                                    c = c2;
                                    c0735a.c = true;
                                    break;
                                }
                                c = c2;
                                break;
                            case 21:
                                if (z2 >= 4) {
                                    vVar.G(3);
                                    if ((128 & vVar.u()) != 0) {
                                        i5 = 1;
                                    } else {
                                        i5 = i8;
                                    }
                                    int i13 = z2 - 4;
                                    if (i5 != 0) {
                                        if (i13 >= 7 && (w = vVar.w()) >= 4) {
                                            c0735a.h = vVar.z();
                                            c0735a.i = vVar.z();
                                            vVar3.C(w - 4);
                                            i13 -= 7;
                                        }
                                    }
                                    int i14 = vVar3.b;
                                    int i15 = vVar3.c;
                                    if (i14 < i15 && i13 > 0) {
                                        int min = Math.min(i13, i15 - i14);
                                        vVar.d(i14, vVar3.a, min);
                                        vVar3.F(i14 + min);
                                    }
                                }
                                c = c2;
                                break;
                            case 22:
                                if (z2 >= 19) {
                                    c0735a.d = vVar.z();
                                    c0735a.e = vVar.z();
                                    vVar.G(11);
                                    c0735a.f = vVar.z();
                                    c0735a.g = vVar.z();
                                }
                                c = c2;
                                break;
                            default:
                                c = c2;
                                break;
                        }
                        i8 = 0;
                        aVar = null;
                    } else {
                        c = c2;
                        if (c0735a.d != 0 && c0735a.e != 0 && c0735a.h != 0 && c0735a.i != 0 && (i2 = vVar3.c) != 0 && vVar3.b == i2 && c0735a.c) {
                            vVar3.F(0);
                            int i16 = c0735a.h * c0735a.i;
                            int[] iArr3 = new int[i16];
                            int i17 = 0;
                            while (i17 < i16) {
                                int u7 = vVar3.u();
                                if (u7 != 0) {
                                    i3 = i17 + 1;
                                    iArr3[i17] = iArr[u7];
                                } else {
                                    int u8 = vVar3.u();
                                    if (u8 != 0) {
                                        if ((u8 & 64) == 0) {
                                            u = u8 & 63;
                                        } else {
                                            u = ((u8 & 63) << 8) | vVar3.u();
                                        }
                                        if ((u8 & 128) == 0) {
                                            i4 = 0;
                                        } else {
                                            i4 = iArr[vVar3.u()];
                                        }
                                        i3 = u + i17;
                                        Arrays.fill(iArr3, i17, i3, i4);
                                    }
                                }
                                i17 = i3;
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(iArr3, c0735a.h, c0735a.i, Bitmap.Config.ARGB_8888);
                            a.C0695a c0695a = new a.C0695a();
                            c0695a.b = createBitmap;
                            float f = c0735a.d;
                            c0695a.h = c0735a.f / f;
                            c0695a.i = 0;
                            float f2 = c0735a.e;
                            c0695a.e = c0735a.g / f2;
                            c0695a.f = 0;
                            c0695a.g = 0;
                            c0695a.l = c0735a.h / f;
                            c0695a.m = c0735a.i / f2;
                            aVar = c0695a.a();
                        } else {
                            aVar = null;
                        }
                        i8 = 0;
                        c0735a.d = 0;
                        c0735a.e = 0;
                        c0735a.f = 0;
                        c0735a.g = 0;
                        c0735a.h = 0;
                        c0735a.i = 0;
                        vVar3.C(0);
                        c0735a.c = false;
                    }
                    vVar.F(i10);
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
                c2 = c;
            } else {
                return new b(Collections.unmodifiableList(arrayList));
            }
        }
    }
}
