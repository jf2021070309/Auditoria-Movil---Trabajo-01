package c.i.k.l0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
/* loaded from: classes.dex */
public class a implements Interpolator {
    public final float[] a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f2207b;

    public a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i2 = ((int) (length / 0.002f)) + 1;
        this.a = new float[i2];
        this.f2207b = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((i3 * length) / (i2 - 1), fArr, null);
            this.a[i3] = fArr[0];
            this.f2207b[i3] = fArr[1];
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.a;
        float f3 = fArr[length] - fArr[i2];
        if (f3 == 0.0f) {
            return this.f2207b[i2];
        }
        float[] fArr2 = this.f2207b;
        float f4 = fArr2[i2];
        return e.a.d.a.a.a(fArr2[length], f4, (f2 - fArr[i2]) / f3, f4);
    }
}
