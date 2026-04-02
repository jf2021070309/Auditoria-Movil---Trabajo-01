package c.b.i;

import android.view.MenuItem;
import c.b.h.i.g;
import c.b.i.p0;
/* loaded from: classes.dex */
public class n0 implements g.a {
    public final /* synthetic */ p0 a;

    public n0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // c.b.h.i.g.a
    public boolean a(c.b.h.i.g gVar, MenuItem menuItem) {
        p0.a aVar = this.a.f1216d;
        if (aVar != null) {
            return aVar.onMenuItemClick(menuItem);
        }
        return false;
    }

    @Override // c.b.h.i.g.a
    public void b(c.b.h.i.g gVar) {
    }
}
