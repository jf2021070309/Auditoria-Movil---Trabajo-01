package c.b.c;

import android.os.Build;
import android.view.View;
import c.i.k.d0;
import c.i.k.j0;
/* loaded from: classes.dex */
public class p implements c.i.k.u {
    public final /* synthetic */ o a;

    public p(o oVar) {
        this.a = oVar;
    }

    @Override // c.i.k.u
    public j0 a(View view, j0 j0Var) {
        int e2 = j0Var.e();
        int Y = this.a.Y(j0Var, null);
        if (e2 != Y) {
            int c2 = j0Var.c();
            int d2 = j0Var.d();
            int b2 = j0Var.b();
            int i2 = Build.VERSION.SDK_INT;
            j0.e dVar = i2 >= 30 ? new j0.d(j0Var) : i2 >= 29 ? new j0.c(j0Var) : i2 >= 20 ? new j0.b(j0Var) : new j0.e(j0Var);
            dVar.d(c.i.e.c.b(c2, Y, d2, b2));
            j0Var = dVar.b();
        }
        return d0.t(view, j0Var);
    }
}
