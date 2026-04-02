package c.z;

import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
public class y extends x {
    @Override // c.z.u, c.z.z
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // c.z.w, c.z.z
    public void d(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // c.z.u, c.z.z
    public void e(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // c.z.x, c.z.z
    public void f(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    @Override // c.z.v, c.z.z
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // c.z.v, c.z.z
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
