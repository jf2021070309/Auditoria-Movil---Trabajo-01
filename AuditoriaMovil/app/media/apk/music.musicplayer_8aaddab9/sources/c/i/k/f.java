package c.i.k;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public abstract class f {
    public a a;

    /* loaded from: classes.dex */
    public interface a {
    }

    public f(Context context) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h(a aVar) {
        if (this.a != null) {
            StringBuilder y = e.a.d.a.a.y("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            y.append(getClass().getSimpleName());
            y.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", y.toString());
        }
        this.a = aVar;
    }
}
