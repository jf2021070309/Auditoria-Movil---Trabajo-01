package com.amazon.aps.iva.p;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
/* compiled from: MenuPopup.java */
/* loaded from: classes.dex */
public abstract class d implements f, j, AdapterView.OnItemClickListener {
    public Rect b;

    public static int c(androidx.appcompat.view.menu.e eVar, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = eVar.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = eVar.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = eVar.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean k(androidx.appcompat.view.menu.f fVar) {
        int size = fVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = fVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public abstract void b(androidx.appcompat.view.menu.f fVar);

    @Override // androidx.appcompat.view.menu.j
    public final boolean collapseItemActionView(androidx.appcompat.view.menu.f fVar, h hVar) {
        return false;
    }

    public abstract void d(View view);

    public abstract void e(boolean z);

    @Override // androidx.appcompat.view.menu.j
    public final boolean expandItemActionView(androidx.appcompat.view.menu.f fVar, h hVar) {
        return false;
    }

    public abstract void f(int i);

    public abstract void g(int i);

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return 0;
    }

    public abstract void h(PopupWindow.OnDismissListener onDismissListener);

    public abstract void i(boolean z);

    public abstract void j(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        androidx.appcompat.view.menu.e eVar;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            eVar = (androidx.appcompat.view.menu.e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            eVar = (androidx.appcompat.view.menu.e) listAdapter;
        }
        androidx.appcompat.view.menu.f fVar = eVar.b;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof androidx.appcompat.view.menu.b)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        fVar.performItemAction(menuItem, this, i2);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void initForMenu(Context context, androidx.appcompat.view.menu.f fVar) {
    }
}
