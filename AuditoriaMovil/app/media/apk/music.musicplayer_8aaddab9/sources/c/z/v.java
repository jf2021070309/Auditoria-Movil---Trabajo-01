package c.z;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
public class v extends u {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f2914f = true;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f2915g = true;

    @Override // c.z.z
    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (f2914f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f2914f = false;
            }
        }
    }

    @Override // c.z.z
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f2915g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f2915g = false;
            }
        }
    }
}
