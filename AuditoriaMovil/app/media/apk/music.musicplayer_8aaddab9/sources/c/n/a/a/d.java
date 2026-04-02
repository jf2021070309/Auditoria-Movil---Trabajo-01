package c.n.a.a;

import android.view.animation.Interpolator;
/* loaded from: classes.dex */
public abstract class d implements Interpolator {
    public final float[] a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2424b;

    public d(float[] fArr) {
        this.a = fArr;
        this.f2424b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f2424b;
        float f4 = (f2 - (min * f3)) / f3;
        float[] fArr2 = this.a;
        return e.a.d.a.a.a(fArr2[min + 1], fArr2[min], f4, fArr2[min]);
    }
}
