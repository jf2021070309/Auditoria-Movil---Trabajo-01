package com.amazon.aps.iva.q1;

import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.yb0.j;
/* compiled from: VelocityTracker.kt */
/* loaded from: classes.dex */
public final class b {
    public final boolean a;
    public final a b;
    public final int c;
    public final com.amazon.aps.iva.q1.a[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    /* compiled from: VelocityTracker.kt */
    /* loaded from: classes.dex */
    public enum a {
        Lsq2,
        Impulse
    }

    /* compiled from: VelocityTracker.kt */
    /* renamed from: com.amazon.aps.iva.q1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0631b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public b() {
        a aVar = a.Lsq2;
        j.f(aVar, "strategy");
        this.a = false;
        this.b = aVar;
        int i = C0631b.a[aVar.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                i2 = 3;
            } else {
                throw new h();
            }
        }
        this.c = i2;
        this.d = new com.amazon.aps.iva.q1.a[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final float a() {
        float[] fArr;
        float[] fArr2;
        float signum;
        boolean z;
        float f;
        boolean z2;
        float f2;
        int i = this.e;
        com.amazon.aps.iva.q1.a[] aVarArr = this.d;
        com.amazon.aps.iva.q1.a aVar = aVarArr[i];
        if (aVar == null) {
            return 0.0f;
        }
        com.amazon.aps.iva.q1.a aVar2 = aVar;
        int i2 = 0;
        while (true) {
            com.amazon.aps.iva.q1.a aVar3 = aVarArr[i];
            fArr = this.f;
            fArr2 = this.g;
            if (aVar3 != null) {
                long j = aVar.a;
                long j2 = aVar3.a;
                float f3 = (float) (j - j2);
                float abs = (float) Math.abs(j2 - aVar2.a);
                if (f3 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i2] = aVar3.b;
                fArr2[i2] = -f3;
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                aVar2 = aVar3;
            } else {
                break;
            }
        }
        if (i2 >= this.c) {
            int i3 = C0631b.a[this.b.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    try {
                        float[] fArr3 = this.h;
                        com.amazon.aps.iva.cq.b.e0(fArr2, fArr, i2, fArr3);
                        signum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    throw new h();
                }
            } else {
                if (i2 >= 2) {
                    boolean z3 = this.a;
                    if (i2 == 2) {
                        float f4 = fArr2[0];
                        float f5 = fArr2[1];
                        if (f4 == f5) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            if (z3) {
                                f2 = fArr[0];
                            } else {
                                f2 = fArr[0] - fArr[1];
                            }
                            signum = f2 / (f4 - f5);
                        }
                    } else {
                        int i4 = i2 - 1;
                        int i5 = i4;
                        float f6 = 0.0f;
                        while (i5 > 0) {
                            int i6 = i5 - 1;
                            if (fArr2[i5] == fArr2[i6]) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                float signum2 = Math.signum(f6) * ((float) Math.sqrt(Math.abs(f6) * 2));
                                if (z3) {
                                    f = -fArr[i6];
                                } else {
                                    f = fArr[i5] - fArr[i6];
                                }
                                float f7 = f / (fArr2[i5] - fArr2[i6]);
                                float abs2 = (Math.abs(f7) * (f7 - signum2)) + f6;
                                if (i5 == i4) {
                                    abs2 *= 0.5f;
                                }
                                f6 = abs2;
                            }
                            i5 = i6;
                        }
                        signum = Math.signum(f6) * ((float) Math.sqrt(Math.abs(f6) * 2));
                    }
                }
                signum = 0.0f;
            }
            return signum * 1000;
        }
        return 0.0f;
    }
}
