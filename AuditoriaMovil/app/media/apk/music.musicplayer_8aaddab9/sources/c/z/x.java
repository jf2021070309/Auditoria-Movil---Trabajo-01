package c.z;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
/* loaded from: classes.dex */
public class x extends w {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f2917i = true;

    @Override // c.z.z
    @SuppressLint({"NewApi"})
    public void f(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i2);
        } else if (f2917i) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                f2917i = false;
            }
        }
    }
}
