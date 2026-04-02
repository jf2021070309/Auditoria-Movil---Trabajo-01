package c.i.e;

import android.graphics.Path;
import android.util.Log;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.ads.AdSize;
/* loaded from: classes.dex */
public class d {
    public char a;

    /* renamed from: b  reason: collision with root package name */
    public float[] f2039b;

    public d(char c2, float[] fArr) {
        this.a = c2;
        this.f2039b = fArr;
    }

    public d(d dVar) {
        this.a = dVar.a;
        float[] fArr = dVar.f2039b;
        this.f2039b = c.i.a.m(fArr, 0, fArr.length);
    }

    public static void a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
        double d2;
        double d3;
        double radians = Math.toRadians(f8);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d4 = f2;
        Double.isNaN(d4);
        double d5 = f3;
        Double.isNaN(d5);
        double d6 = (d5 * sin) + (d4 * cos);
        double d7 = d4;
        double d8 = f6;
        Double.isNaN(d8);
        double d9 = d6 / d8;
        double d10 = -f2;
        Double.isNaN(d10);
        Double.isNaN(d5);
        double d11 = (d5 * cos) + (d10 * sin);
        double d12 = f7;
        Double.isNaN(d12);
        double d13 = d11 / d12;
        double d14 = d5;
        double d15 = f4;
        Double.isNaN(d15);
        double d16 = f5;
        Double.isNaN(d16);
        Double.isNaN(d8);
        double d17 = ((d16 * sin) + (d15 * cos)) / d8;
        double d18 = -f4;
        Double.isNaN(d18);
        Double.isNaN(d16);
        Double.isNaN(d12);
        double d19 = ((d16 * cos) + (d18 * sin)) / d12;
        double d20 = d9 - d17;
        double d21 = d13 - d19;
        double d22 = (d9 + d17) / 2.0d;
        double d23 = (d13 + d19) / 2.0d;
        double d24 = (d21 * d21) + (d20 * d20);
        if (d24 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d25 = (1.0d / d24) - 0.25d;
        if (d25 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d24);
            float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
            a(path, f2, f3, f4, f5, f6 * sqrt, f7 * sqrt, f8, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d25);
        double d26 = d20 * sqrt2;
        double d27 = sqrt2 * d21;
        if (z == z2) {
            d2 = d22 - d27;
            d3 = d23 + d26;
        } else {
            d2 = d22 + d27;
            d3 = d23 - d26;
        }
        double atan2 = Math.atan2(d13 - d3, d9 - d2);
        double atan22 = Math.atan2(d19 - d3, d17 - d2) - atan2;
        int i2 = 0;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        Double.isNaN(d8);
        double d28 = d2 * d8;
        Double.isNaN(d12);
        double d29 = d3 * d12;
        double d30 = (d28 * cos) - (d29 * sin);
        double d31 = (d29 * cos) + (d28 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        Double.isNaN(d8);
        double d32 = -d8;
        double d33 = d32 * cos2;
        Double.isNaN(d12);
        double d34 = d12 * sin2;
        double d35 = (d33 * sin3) - (d34 * cos3);
        double d36 = d32 * sin2;
        Double.isNaN(d12);
        double d37 = d12 * cos2;
        double d38 = (cos3 * d37) + (sin3 * d36);
        double d39 = ceil;
        Double.isNaN(d39);
        Double.isNaN(d39);
        double d40 = atan22 / d39;
        double d41 = atan2;
        while (i2 < ceil) {
            double d42 = d41 + d40;
            double sin4 = Math.sin(d42);
            double cos4 = Math.cos(d42);
            Double.isNaN(d8);
            double d43 = d40;
            double d44 = (((d8 * cos2) * cos4) + d30) - (d34 * sin4);
            Double.isNaN(d8);
            double d45 = d30;
            double d46 = (d37 * sin4) + (d8 * sin2 * cos4) + d31;
            double d47 = (d33 * sin4) - (d34 * cos4);
            double d48 = (cos4 * d37) + (sin4 * d36);
            double d49 = d42 - d41;
            double tan = Math.tan(d49 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d49)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d35 * sqrt3) + d7), (float) ((d38 * sqrt3) + d14), (float) (d44 - (sqrt3 * d47)), (float) (d46 - (sqrt3 * d48)), (float) d44, (float) d46);
            i2++;
            d37 = d37;
            d36 = d36;
            ceil = ceil;
            cos2 = cos2;
            d41 = d42;
            d8 = d8;
            d38 = d48;
            d35 = d47;
            d7 = d44;
            d14 = d46;
            d40 = d43;
            d30 = d45;
        }
    }

    public static void b(d[] dVarArr, Path path) {
        int i2;
        int i3;
        float[] fArr;
        char c2;
        int i4;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        d[] dVarArr2 = dVarArr;
        float[] fArr2 = new float[6];
        char c3 = 'm';
        char c4 = 0;
        char c5 = 'm';
        int i5 = 0;
        while (i5 < dVarArr2.length) {
            char c6 = dVarArr2[i5].a;
            float[] fArr3 = dVarArr2[i5].f2039b;
            float f21 = fArr2[c4];
            float f22 = fArr2[1];
            float f23 = fArr2[2];
            float f24 = fArr2[3];
            float f25 = fArr2[4];
            float f26 = fArr2[5];
            switch (c6) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case SyslogConstants.LOG_CRON /* 72 */:
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case AdSize.LARGE_AD_HEIGHT /* 90 */:
                case 'z':
                    path.close();
                    path.moveTo(f25, f26);
                    f21 = f25;
                    f23 = f21;
                    f22 = f26;
                    f24 = f22;
                default:
                    i2 = 2;
                    break;
            }
            float f27 = f25;
            float f28 = f26;
            float f29 = f21;
            float f30 = f22;
            int i6 = 0;
            while (i6 < fArr3.length) {
                if (c6 != 'A') {
                    if (c6 != 'C') {
                        if (c6 == 'H') {
                            i3 = i6;
                            fArr = fArr3;
                            c2 = c6;
                            i4 = i5;
                            int i7 = i3 + 0;
                            path.lineTo(fArr[i7], f30);
                            f29 = fArr[i7];
                        } else if (c6 == 'Q') {
                            i3 = i6;
                            fArr = fArr3;
                            c2 = c6;
                            i4 = i5;
                            int i8 = i3 + 0;
                            int i9 = i3 + 1;
                            int i10 = i3 + 2;
                            int i11 = i3 + 3;
                            path.quadTo(fArr[i8], fArr[i9], fArr[i10], fArr[i11]);
                            f2 = fArr[i8];
                            f3 = fArr[i9];
                            f29 = fArr[i10];
                            f30 = fArr[i11];
                        } else if (c6 == 'V') {
                            i3 = i6;
                            fArr = fArr3;
                            c2 = c6;
                            i4 = i5;
                            int i12 = i3 + 0;
                            path.lineTo(f29, fArr[i12]);
                            f30 = fArr[i12];
                        } else if (c6 != 'a') {
                            if (c6 != 'c') {
                                if (c6 == 'h') {
                                    i3 = i6;
                                    int i13 = i3 + 0;
                                    path.rLineTo(fArr3[i13], 0.0f);
                                    f29 += fArr3[i13];
                                } else if (c6 != 'q') {
                                    if (c6 == 'v') {
                                        i3 = i6;
                                        f11 = f30;
                                        int i14 = i3 + 0;
                                        path.rLineTo(0.0f, fArr3[i14]);
                                        f12 = fArr3[i14];
                                    } else if (c6 == 'L') {
                                        i3 = i6;
                                        int i15 = i3 + 0;
                                        int i16 = i3 + 1;
                                        path.lineTo(fArr3[i15], fArr3[i16]);
                                        f29 = fArr3[i15];
                                        f30 = fArr3[i16];
                                    } else if (c6 == 'M') {
                                        i3 = i6;
                                        int i17 = i3 + 0;
                                        float f31 = fArr3[i17];
                                        int i18 = i3 + 1;
                                        float f32 = fArr3[i18];
                                        if (i3 > 0) {
                                            path.lineTo(fArr3[i17], fArr3[i18]);
                                            f29 = f31;
                                            f30 = f32;
                                        } else {
                                            path.moveTo(fArr3[i17], fArr3[i18]);
                                            f27 = f31;
                                            f28 = f32;
                                            f29 = f27;
                                            f30 = f28;
                                        }
                                    } else if (c6 == 'S') {
                                        i3 = i6;
                                        float f33 = f30;
                                        float f34 = f29;
                                        if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                            f13 = (f33 * 2.0f) - f24;
                                            f14 = (f34 * 2.0f) - f23;
                                        } else {
                                            f14 = f34;
                                            f13 = f33;
                                        }
                                        int i19 = i3 + 0;
                                        int i20 = i3 + 1;
                                        int i21 = i3 + 2;
                                        int i22 = i3 + 3;
                                        path.cubicTo(f14, f13, fArr3[i19], fArr3[i20], fArr3[i21], fArr3[i22]);
                                        float f35 = fArr3[i19];
                                        float f36 = fArr3[i20];
                                        f10 = fArr3[i21];
                                        f9 = fArr3[i22];
                                        f23 = f35;
                                        f24 = f36;
                                        f29 = f10;
                                        f30 = f9;
                                    } else if (c6 == 'T') {
                                        i3 = i6;
                                        float f37 = f30;
                                        float f38 = f29;
                                        if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                            f15 = (f38 * 2.0f) - f23;
                                            f16 = (f37 * 2.0f) - f24;
                                        } else {
                                            f15 = f38;
                                            f16 = f37;
                                        }
                                        int i23 = i3 + 0;
                                        int i24 = i3 + 1;
                                        path.quadTo(f15, f16, fArr3[i23], fArr3[i24]);
                                        f24 = f16;
                                        f23 = f15;
                                        fArr = fArr3;
                                        c2 = c6;
                                        i4 = i5;
                                        f29 = fArr3[i23];
                                        f30 = fArr3[i24];
                                    } else if (c6 == 'l') {
                                        i3 = i6;
                                        f11 = f30;
                                        int i25 = i3 + 0;
                                        int i26 = i3 + 1;
                                        path.rLineTo(fArr3[i25], fArr3[i26]);
                                        f29 += fArr3[i25];
                                        f12 = fArr3[i26];
                                    } else if (c6 == c3) {
                                        i3 = i6;
                                        int i27 = i3 + 0;
                                        f29 += fArr3[i27];
                                        int i28 = i3 + 1;
                                        f30 += fArr3[i28];
                                        if (i3 > 0) {
                                            path.rLineTo(fArr3[i27], fArr3[i28]);
                                        } else {
                                            path.rMoveTo(fArr3[i27], fArr3[i28]);
                                            f28 = f30;
                                            f27 = f29;
                                            f29 = f27;
                                            f30 = f28;
                                        }
                                    } else if (c6 != 's') {
                                        if (c6 == 't') {
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f19 = f29 - f23;
                                                f20 = f30 - f24;
                                            } else {
                                                f20 = 0.0f;
                                                f19 = 0.0f;
                                            }
                                            int i29 = i6 + 0;
                                            int i30 = i6 + 1;
                                            path.rQuadTo(f19, f20, fArr3[i29], fArr3[i30]);
                                            float f39 = f19 + f29;
                                            float f40 = f20 + f30;
                                            f29 += fArr3[i29];
                                            f30 += fArr3[i30];
                                            f24 = f40;
                                            f23 = f39;
                                        }
                                        i3 = i6;
                                    } else {
                                        if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                            f17 = f30 - f24;
                                            f18 = f29 - f23;
                                        } else {
                                            f18 = 0.0f;
                                            f17 = 0.0f;
                                        }
                                        int i31 = i6 + 0;
                                        int i32 = i6 + 1;
                                        int i33 = i6 + 2;
                                        int i34 = i6 + 3;
                                        i3 = i6;
                                        f4 = f30;
                                        float f41 = f29;
                                        path.rCubicTo(f18, f17, fArr3[i31], fArr3[i32], fArr3[i33], fArr3[i34]);
                                        f5 = fArr3[i31] + f41;
                                        f6 = fArr3[i32] + f4;
                                        f7 = f41 + fArr3[i33];
                                        f8 = fArr3[i34];
                                    }
                                    f30 = f11 + f12;
                                } else {
                                    i3 = i6;
                                    f4 = f30;
                                    float f42 = f29;
                                    int i35 = i3 + 0;
                                    int i36 = i3 + 1;
                                    int i37 = i3 + 2;
                                    int i38 = i3 + 3;
                                    path.rQuadTo(fArr3[i35], fArr3[i36], fArr3[i37], fArr3[i38]);
                                    f5 = fArr3[i35] + f42;
                                    f6 = fArr3[i36] + f4;
                                    float f43 = f42 + fArr3[i37];
                                    float f44 = fArr3[i38];
                                    f7 = f43;
                                    f8 = f44;
                                }
                                fArr = fArr3;
                                c2 = c6;
                                i4 = i5;
                            } else {
                                i3 = i6;
                                f4 = f30;
                                float f45 = f29;
                                int i39 = i3 + 2;
                                int i40 = i3 + 3;
                                int i41 = i3 + 4;
                                int i42 = i3 + 5;
                                path.rCubicTo(fArr3[i3 + 0], fArr3[i3 + 1], fArr3[i39], fArr3[i40], fArr3[i41], fArr3[i42]);
                                f5 = fArr3[i39] + f45;
                                f6 = fArr3[i40] + f4;
                                f7 = f45 + fArr3[i41];
                                f8 = fArr3[i42];
                            }
                            f9 = f4 + f8;
                            f23 = f5;
                            f24 = f6;
                            f10 = f7;
                            f29 = f10;
                            f30 = f9;
                            fArr = fArr3;
                            c2 = c6;
                            i4 = i5;
                        } else {
                            i3 = i6;
                            float f46 = f30;
                            float f47 = f29;
                            int i43 = i3 + 5;
                            int i44 = i3 + 6;
                            fArr = fArr3;
                            c2 = c6;
                            i4 = i5;
                            a(path, f47, f46, fArr3[i43] + f47, fArr3[i44] + f46, fArr3[i3 + 0], fArr3[i3 + 1], fArr3[i3 + 2], fArr3[i3 + 3] != 0.0f, fArr3[i3 + 4] != 0.0f);
                            f29 = f47 + fArr[i43];
                            f30 = f46 + fArr[i44];
                        }
                        i6 = i3 + i2;
                        c5 = c2;
                        c6 = c5;
                        fArr3 = fArr;
                        i5 = i4;
                        c3 = 'm';
                    } else {
                        i3 = i6;
                        fArr = fArr3;
                        c2 = c6;
                        i4 = i5;
                        int i45 = i3 + 2;
                        int i46 = i3 + 3;
                        int i47 = i3 + 4;
                        int i48 = i3 + 5;
                        path.cubicTo(fArr[i3 + 0], fArr[i3 + 1], fArr[i45], fArr[i46], fArr[i47], fArr[i48]);
                        float f48 = fArr[i47];
                        float f49 = fArr[i48];
                        f2 = fArr[i45];
                        f29 = f48;
                        f30 = f49;
                        f3 = fArr[i46];
                    }
                    f23 = f2;
                    f24 = f3;
                    i6 = i3 + i2;
                    c5 = c2;
                    c6 = c5;
                    fArr3 = fArr;
                    i5 = i4;
                    c3 = 'm';
                } else {
                    i3 = i6;
                    fArr = fArr3;
                    c2 = c6;
                    i4 = i5;
                    int i49 = i3 + 5;
                    int i50 = i3 + 6;
                    a(path, f29, f30, fArr[i49], fArr[i50], fArr[i3 + 0], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3] != 0.0f, fArr[i3 + 4] != 0.0f);
                    f29 = fArr[i49];
                    f30 = fArr[i50];
                }
                f24 = f30;
                f23 = f29;
                i6 = i3 + i2;
                c5 = c2;
                c6 = c5;
                fArr3 = fArr;
                i5 = i4;
                c3 = 'm';
            }
            int i51 = i5;
            fArr2[0] = f29;
            fArr2[1] = f30;
            fArr2[2] = f23;
            fArr2[3] = f24;
            fArr2[4] = f27;
            fArr2[5] = f28;
            i5 = i51 + 1;
            c5 = dVarArr[i51].a;
            c3 = 'm';
            c4 = 0;
            dVarArr2 = dVarArr;
        }
    }
}
