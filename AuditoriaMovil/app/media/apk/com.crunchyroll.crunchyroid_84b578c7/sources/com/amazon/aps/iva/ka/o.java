package com.amazon.aps.iva.ka;

import android.graphics.Color;
import android.graphics.PointF;
import com.amazon.aps.iva.la.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: GradientColorParser.java */
/* loaded from: classes.dex */
public final class o implements l0<com.amazon.aps.iva.ha.c> {
    public int a;

    public o(int i) {
        this.a = i;
    }

    @Override // com.amazon.aps.iva.ka.l0
    public final com.amazon.aps.iva.ha.c a(com.amazon.aps.iva.la.c cVar, float f) throws IOException {
        boolean z;
        int i;
        float f2;
        int i2;
        int i3;
        int argb;
        int i4;
        ArrayList arrayList = new ArrayList();
        int i5 = 1;
        if (cVar.t() == c.b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar.a();
        }
        while (cVar.k()) {
            arrayList.add(Float.valueOf((float) cVar.n()));
        }
        int i6 = 4;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.a = 2;
        }
        if (z) {
            cVar.f();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int i7 = this.a;
        float[] fArr = new float[i7];
        int[] iArr = new int[i7];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i = this.a * i6;
            if (i8 >= i) {
                break;
            }
            int i11 = i8 / 4;
            double floatValue = ((Float) arrayList.get(i8)).floatValue();
            int i12 = i8 % 4;
            if (i12 != 0) {
                if (i12 != i5) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            iArr[i11] = Color.argb(255, i9, i10, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i10 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i9 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i11 > 0) {
                    float f3 = (float) floatValue;
                    if (fArr[i11 - 1] >= f3) {
                        fArr[i11] = f3 + 0.01f;
                    }
                }
                fArr[i11] = (float) floatValue;
            }
            i8++;
            i5 = 1;
            i6 = 4;
        }
        com.amazon.aps.iva.ha.c cVar2 = new com.amazon.aps.iva.ha.c(iArr, fArr);
        if (arrayList.size() > i) {
            int size = (arrayList.size() - i) / 2;
            float[] fArr2 = new float[size];
            float[] fArr3 = new float[size];
            int i13 = 0;
            while (i < arrayList.size()) {
                if (i % 2 == 0) {
                    fArr2[i13] = ((Float) arrayList.get(i)).floatValue();
                } else {
                    fArr3[i13] = ((Float) arrayList.get(i)).floatValue();
                    i13++;
                }
                i++;
            }
            float[] fArr4 = cVar2.a;
            if (fArr4.length == 0) {
                fArr4 = fArr2;
            } else if (size != 0) {
                int length = fArr4.length + size;
                float[] fArr5 = new float[length];
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                for (int i17 = 0; i17 < length; i17++) {
                    float f4 = Float.NaN;
                    if (i15 < fArr4.length) {
                        f2 = fArr4[i15];
                    } else {
                        f2 = Float.NaN;
                    }
                    if (i16 < size) {
                        f4 = fArr2[i16];
                    }
                    if (!Float.isNaN(f4) && f2 >= f4) {
                        if (!Float.isNaN(f2) && f4 >= f2) {
                            fArr5[i17] = f2;
                            i15++;
                            i16++;
                            i14++;
                        } else {
                            fArr5[i17] = f4;
                            i16++;
                        }
                    } else {
                        fArr5[i17] = f2;
                        i15++;
                    }
                }
                if (i14 == 0) {
                    fArr4 = fArr5;
                } else {
                    fArr4 = Arrays.copyOf(fArr5, length - i14);
                }
            }
            int length2 = fArr4.length;
            int[] iArr2 = new int[length2];
            int i18 = 0;
            while (i18 < length2) {
                float f5 = fArr4[i18];
                int binarySearch = Arrays.binarySearch(fArr, f5);
                int binarySearch2 = Arrays.binarySearch(fArr2, f5);
                int[] iArr3 = cVar2.b;
                if (binarySearch >= 0 && binarySearch2 <= 0) {
                    int i19 = iArr3[binarySearch];
                    if (size >= 2 && f5 > fArr2[0]) {
                        for (int i20 = 1; i20 < size; i20++) {
                            float f6 = fArr2[i20];
                            int i21 = (f6 > f5 ? 1 : (f6 == f5 ? 0 : -1));
                            if (i21 >= 0 || i20 == size - 1) {
                                if (i21 <= 0) {
                                    i4 = (int) (fArr3[i20] * 255.0f);
                                } else {
                                    int i22 = i20 - 1;
                                    float f7 = fArr2[i22];
                                    float f8 = (f5 - f7) / (f6 - f7);
                                    float f9 = fArr3[i22];
                                    float f10 = fArr3[i20];
                                    PointF pointF = com.amazon.aps.iva.ma.f.a;
                                    i4 = (int) ((((f10 - f9) * f8) + f9) * 255.0f);
                                }
                                argb = Color.argb(i4, Color.red(i19), Color.green(i19), Color.blue(i19));
                            }
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    argb = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i19), Color.green(i19), Color.blue(i19));
                    iArr2[i18] = argb;
                    i2 = i7;
                } else {
                    if (binarySearch2 < 0) {
                        binarySearch2 = -(binarySearch2 + 1);
                    }
                    float f11 = fArr3[binarySearch2];
                    if (iArr3.length >= 2 && f5 != fArr[0]) {
                        for (int i23 = 1; i23 < i7; i23++) {
                            float f12 = fArr[i23];
                            if (f12 >= f5 || i23 == i7 - 1) {
                                int i24 = i23 - 1;
                                float f13 = fArr[i24];
                                float f14 = (f5 - f13) / (f12 - f13);
                                int i25 = iArr3[i23];
                                int i26 = iArr3[i24];
                                i2 = i7;
                                i3 = Color.argb((int) (f11 * 255.0f), com.amazon.aps.iva.gr.n.s(Color.red(i26), f14, Color.red(i25)), com.amazon.aps.iva.gr.n.s(Color.green(i26), f14, Color.green(i25)), com.amazon.aps.iva.gr.n.s(Color.blue(i26), f14, Color.blue(i25)));
                            }
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    i2 = i7;
                    i3 = iArr3[0];
                    iArr2[i18] = i3;
                }
                i18++;
                i7 = i2;
            }
            return new com.amazon.aps.iva.ha.c(iArr2, fArr4);
        }
        return cVar2;
    }
}
