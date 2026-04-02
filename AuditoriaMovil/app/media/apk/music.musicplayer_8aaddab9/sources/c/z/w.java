package c.z;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
public class w extends v {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f2916h = true;

    @Override // c.z.z
    @SuppressLint({"NewApi"})
    public void d(View view, int i2, int i3, int i4, int i5) {
        if (f2916h) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f2916h = false;
            }
        }
    }
}
