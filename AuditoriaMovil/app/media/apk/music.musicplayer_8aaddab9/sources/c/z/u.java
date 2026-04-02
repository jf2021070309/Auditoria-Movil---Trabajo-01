package c.z;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
public class u extends z {

    /* renamed from: e  reason: collision with root package name */
    public static boolean f2913e = true;

    @Override // c.z.z
    public void a(View view) {
    }

    @Override // c.z.z
    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (f2913e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f2913e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // c.z.z
    public void c(View view) {
    }

    @Override // c.z.z
    @SuppressLint({"NewApi"})
    public void e(View view, float f2) {
        if (f2913e) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f2913e = false;
            }
        }
        view.setAlpha(f2);
    }
}
