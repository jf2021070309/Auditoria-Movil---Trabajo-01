package com.amazon.aps.iva.e1;

import android.content.Context;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.g8.r0;
import com.amazon.aps.iva.g8.t0;
import com.amazon.aps.iva.h8.j;
import com.amazon.aps.iva.h8.k;
import com.amazon.aps.iva.h8.l;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.x0.m;
import java.util.Arrays;
/* compiled from: Offset.kt */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.er.g, com.amazon.aps.iva.sm.c {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final d e = new d();
    public static com.amazon.aps.iva.xu.f f;

    public static final long d(float f2, float f3) {
        long floatToIntBits = (Float.floatToIntBits(f3) & 4294967295L) | (Float.floatToIntBits(f2) << 32);
        int i = c.e;
        return floatToIntBits;
    }

    public static final m0 e(Context context) {
        m0 m0Var = new m0(context);
        t0 t0Var = m0Var.w;
        t0Var.a(new com.amazon.aps.iva.h8.d(t0Var));
        t0Var.a(new com.amazon.aps.iva.h8.e());
        t0Var.a(new androidx.navigation.compose.d());
        return m0Var;
    }

    public static int f(float f2) {
        boolean z;
        float f3;
        boolean z2;
        float f4;
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f3 = f5 * f5 * f5;
        } else {
            f3 = f2 / 903.2963f;
        }
        float f6 = f5 * f5 * f5;
        if (f6 > 0.008856452f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f4 = f6;
        } else {
            f4 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z2) {
            f6 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return com.amazon.aps.iva.g3.e.b(f4 * fArr[0], f3 * fArr[1], f6 * fArr[2]);
    }

    public static final boolean g(long j) {
        boolean z;
        boolean z2;
        float c2 = c.c(j);
        if (!Float.isInfinite(c2) && !Float.isNaN(c2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float d2 = c.d(j);
            if (!Float.isInfinite(d2) && !Float.isNaN(d2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean h(long j) {
        int i = c.e;
        if (j != c.d) {
            return true;
        }
        return false;
    }

    public static float i(int i) {
        float pow;
        float f2 = i / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static /* synthetic */ void j(com.amazon.aps.iva.sd.b bVar, com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.sd.a aVar2, int i) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        bVar.a(aVar, aVar2);
    }

    public static final m0 k(r0[] r0VarArr, i iVar) {
        iVar.s(-312215566);
        e0.b bVar = e0.a;
        Context context = (Context) iVar.i(androidx.compose.ui.platform.d.b);
        m0 m0Var = (m0) i.A(Arrays.copyOf(r0VarArr, r0VarArr.length), m.a(j.h, new k(context)), new l(context), iVar, 4);
        for (r0 r0Var : r0VarArr) {
            m0Var.w.a(r0Var);
        }
        e0.b bVar2 = e0.a;
        iVar.G();
        return m0Var;
    }

    public static String l(int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Clip";
        }
        if (i == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "Ellipsis";
        }
        if (i == 3) {
            z3 = true;
        }
        if (z3) {
            return "Visible";
        }
        return "Invalid";
    }

    public static float m() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    @Override // com.amazon.aps.iva.sm.c
    public boolean c(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "username");
        return !com.amazon.aps.iva.oe0.m.b0(str);
    }

    @Override // com.amazon.aps.iva.er.g
    public void a(com.amazon.aps.iva.er.f fVar) {
    }

    @Override // com.amazon.aps.iva.er.h
    public void b(double d2) {
    }
}
