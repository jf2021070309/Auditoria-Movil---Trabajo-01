package c.i.k;

import android.view.View;
import c.i.k.d0;
/* loaded from: classes.dex */
public class c0 extends d0.a<Boolean> {
    public c0(int i2, Class cls, int i3) {
        super(i2, cls, i3);
    }

    @Override // c.i.k.d0.a
    public Boolean b(View view) {
        return Boolean.valueOf(d0.k.c(view));
    }

    @Override // c.i.k.d0.a
    public void c(View view, Boolean bool) {
        d0.k.g(view, bool.booleanValue());
    }

    @Override // c.i.k.d0.a
    public boolean f(Boolean bool, Boolean bool2) {
        return !a(bool, bool2);
    }
}
