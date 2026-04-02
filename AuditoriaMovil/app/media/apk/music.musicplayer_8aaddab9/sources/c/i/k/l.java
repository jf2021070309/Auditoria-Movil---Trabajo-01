package c.i.k;

import android.graphics.drawable.ColorDrawable;
import android.view.MenuItem;
import com.android.music.QueryBrowserActivity;
/* loaded from: classes.dex */
public class l implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ m a;

    public l(m mVar) {
        this.a = mVar;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        QueryBrowserActivity.this.finish();
        return false;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        QueryBrowserActivity.d dVar = (QueryBrowserActivity.d) this.a;
        if (QueryBrowserActivity.this.u() != null) {
            QueryBrowserActivity.this.u().m(new ColorDrawable(-16777216));
            return true;
        }
        return true;
    }
}
