package com.amazon.aps.iva.w6;

import android.opengl.Matrix;
import com.amazon.aps.iva.t5.a0;
/* compiled from: FrameRotationQueue.java */
/* loaded from: classes.dex */
public final class c {
    public final float[] a = new float[16];
    public final float[] b = new float[16];
    public final a0<float[]> c = new a0<>();
    public boolean d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10];
        fArr[0] = f3 / sqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3 / sqrt;
    }
}
