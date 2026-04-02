package c.u.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c.u.b.e;
/* loaded from: classes.dex */
public class a0 implements e.b {
    public final /* synthetic */ RecyclerView a;

    public a0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public View a(int i2) {
        return this.a.getChildAt(i2);
    }

    public int b() {
        return this.a.getChildCount();
    }

    public void c(int i2) {
        View childAt = this.a.getChildAt(i2);
        if (childAt != null) {
            this.a.s(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i2);
    }
}
