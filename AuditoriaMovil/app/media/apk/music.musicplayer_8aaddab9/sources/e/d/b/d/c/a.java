package e.d.b.d.c;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* loaded from: classes2.dex */
public class a {
    public static final TimeInterpolator a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f6327b = new c.n.a.a.b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f6328c = new c.n.a.a.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f6329d = new c.n.a.a.c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f6330e = new DecelerateInterpolator();

    public static float a(float f2, float f3, float f4) {
        return e.a.d.a.a.a(f3, f2, f4, f2);
    }

    public static float b(float f2, float f3, float f4, float f5, float f6) {
        return f6 < f4 ? f2 : f6 > f5 ? f3 : a(f2, f3, (f6 - f4) / (f5 - f4));
    }
}
