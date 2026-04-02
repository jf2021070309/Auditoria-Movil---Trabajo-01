package c.b.h.i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import c.b.h.i.n;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f extends BaseAdapter {
    public g a;

    /* renamed from: b  reason: collision with root package name */
    public int f995b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f996c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f997d;

    /* renamed from: e  reason: collision with root package name */
    public final LayoutInflater f998e;

    /* renamed from: f  reason: collision with root package name */
    public final int f999f;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f997d = z;
        this.f998e = layoutInflater;
        this.a = gVar;
        this.f999f = i2;
        a();
    }

    public void a() {
        g gVar = this.a;
        i iVar = gVar.w;
        if (iVar != null) {
            gVar.i();
            ArrayList<i> arrayList = gVar.f1009k;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayList.get(i2) == iVar) {
                    this.f995b = i2;
                    return;
                }
            }
        }
        this.f995b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public i getItem(int i2) {
        ArrayList<i> l2;
        if (this.f997d) {
            g gVar = this.a;
            gVar.i();
            l2 = gVar.f1009k;
        } else {
            l2 = this.a.l();
        }
        int i3 = this.f995b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return l2.get(i2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> l2;
        if (this.f997d) {
            g gVar = this.a;
            gVar.i();
            l2 = gVar.f1009k;
        } else {
            l2 = this.a.l();
        }
        return this.f995b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f998e.inflate(this.f999f, viewGroup, false);
        }
        int i3 = getItem(i2).f1015b;
        int i4 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.a.m() && i3 != (i4 >= 0 ? getItem(i4).f1015b : i3));
        n.a aVar = (n.a) view;
        if (this.f996c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
