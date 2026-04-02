package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public final class e extends BaseAdapter {
    public final f b;
    public int c = -1;
    public boolean d;
    public final boolean e;
    public final LayoutInflater f;
    public final int g;

    public e(f fVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.e = z;
        this.f = layoutInflater;
        this.b = fVar;
        this.g = i;
        b();
    }

    public final void b() {
        f fVar = this.b;
        h expandedItem = fVar.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<h> nonActionItems = fVar.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (nonActionItems.get(i) == expandedItem) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public final h getItem(int i) {
        ArrayList<h> visibleItems;
        boolean z = this.e;
        f fVar = this.b;
        if (z) {
            visibleItems = fVar.getNonActionItems();
        } else {
            visibleItems = fVar.getVisibleItems();
        }
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return visibleItems.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<h> visibleItems;
        boolean z = this.e;
        f fVar = this.b;
        if (z) {
            visibleItems = fVar.getNonActionItems();
        } else {
            visibleItems = fVar.getVisibleItems();
        }
        if (this.c < 0) {
            return visibleItems.size();
        }
        return visibleItems.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        if (view == null) {
            view = this.f.inflate(this.g, viewGroup, false);
        }
        int i3 = getItem(i).b;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).b;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.b.isGroupDividerEnabled() && i3 != i2) {
            z = true;
        } else {
            z = false;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        k.a aVar = (k.a) view;
        if (this.d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.initialize(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
