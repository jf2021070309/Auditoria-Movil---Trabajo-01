package c.b.h.i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
public abstract class k implements p, m, AdapterView.OnItemClickListener {
    public Rect a;

    public static int l(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        f fVar = (f) listAdapter;
        int count = fVar.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = fVar.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = fVar.getView(i5, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    public static boolean t(g gVar) {
        int size = gVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = gVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // c.b.h.i.m
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override // c.b.h.i.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // c.b.h.i.m
    public void h(Context context, g gVar) {
    }

    public abstract void k(g gVar);

    public abstract void m(View view);

    public abstract void n(boolean z);

    public abstract void o(int i2);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (f) listAdapter).a.s((MenuItem) listAdapter.getItem(i2), this, (this instanceof d) ^ true ? 0 : 4);
    }

    public abstract void p(int i2);

    public abstract void q(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z);

    public abstract void s(int i2);
}
