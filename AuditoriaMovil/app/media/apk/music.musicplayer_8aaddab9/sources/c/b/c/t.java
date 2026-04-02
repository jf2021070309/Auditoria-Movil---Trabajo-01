package c.b.c;

import android.view.View;
import c.i.k.d0;
import c.i.k.h0;
/* loaded from: classes.dex */
public class t extends h0 {
    public final /* synthetic */ o a;

    public t(o oVar) {
        this.a = oVar;
    }

    @Override // c.i.k.g0
    public void b(View view) {
        this.a.v.setAlpha(1.0f);
        this.a.y.d(null);
        this.a.y = null;
    }

    @Override // c.i.k.h0, c.i.k.g0
    public void c(View view) {
        this.a.v.setVisibility(0);
        this.a.v.sendAccessibilityEvent(32);
        if (this.a.v.getParent() instanceof View) {
            d0.y((View) this.a.v.getParent());
        }
    }
}
