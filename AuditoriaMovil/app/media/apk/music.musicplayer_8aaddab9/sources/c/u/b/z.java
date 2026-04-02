package c.u.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class z extends e0 {

    /* renamed from: c  reason: collision with root package name */
    public x f2736c;

    /* renamed from: d  reason: collision with root package name */
    public x f2737d;

    @Override // c.u.b.e0
    public int[] a(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.g()) {
            iArr[0] = c(view, e(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.h()) {
            iArr[1] = c(view, f(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int c(View view, x xVar) {
        return ((xVar.c(view) / 2) + xVar.e(view)) - ((xVar.l() / 2) + xVar.k());
    }

    public final View d(RecyclerView.m mVar, x xVar) {
        int A = mVar.A();
        View view = null;
        if (A == 0) {
            return null;
        }
        int l2 = (xVar.l() / 2) + xVar.k();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < A; i3++) {
            View z = mVar.z(i3);
            int abs = Math.abs(((xVar.c(z) / 2) + xVar.e(z)) - l2);
            if (abs < i2) {
                view = z;
                i2 = abs;
            }
        }
        return view;
    }

    public final x e(RecyclerView.m mVar) {
        x xVar = this.f2737d;
        if (xVar == null || xVar.a != mVar) {
            this.f2737d = new v(mVar);
        }
        return this.f2737d;
    }

    public final x f(RecyclerView.m mVar) {
        x xVar = this.f2736c;
        if (xVar == null || xVar.a != mVar) {
            this.f2736c = new w(mVar);
        }
        return this.f2736c;
    }
}
