package c.b.c;

import android.view.View;
import c.i.k.d0;
import c.i.k.f0;
import c.i.k.h0;
/* loaded from: classes.dex */
public class s implements Runnable {
    public final /* synthetic */ o a;

    /* loaded from: classes.dex */
    public class a extends h0 {
        public a() {
        }

        @Override // c.i.k.g0
        public void b(View view) {
            s.this.a.v.setAlpha(1.0f);
            s.this.a.y.d(null);
            s.this.a.y = null;
        }

        @Override // c.i.k.h0, c.i.k.g0
        public void c(View view) {
            s.this.a.v.setVisibility(0);
        }
    }

    public s(o oVar) {
        this.a = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        o oVar = this.a;
        oVar.w.showAtLocation(oVar.v, 55, 0, 0);
        this.a.J();
        if (!this.a.W()) {
            this.a.v.setAlpha(1.0f);
            this.a.v.setVisibility(0);
            return;
        }
        this.a.v.setAlpha(0.0f);
        o oVar2 = this.a;
        f0 b2 = d0.b(oVar2.v);
        b2.a(1.0f);
        oVar2.y = b2;
        f0 f0Var = this.a.y;
        a aVar = new a();
        View view = f0Var.a.get();
        if (view != null) {
            f0Var.e(view, aVar);
        }
    }
}
