package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {
    public Context b;
    public LayoutInflater c;
    public f d;
    public ExpandedMenuView e;
    public j.a f;
    public a g;

    /* compiled from: ListMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        public int b = -1;

        public a() {
            b();
        }

        public final void b() {
            d dVar = d.this;
            h expandedItem = dVar.d.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<h> nonActionItems = dVar.d.getNonActionItems();
                int size = nonActionItems.size();
                for (int i = 0; i < size; i++) {
                    if (nonActionItems.get(i) == expandedItem) {
                        this.b = i;
                        return;
                    }
                }
            }
            this.b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: c */
        public final h getItem(int i) {
            d dVar = d.this;
            ArrayList<h> nonActionItems = dVar.d.getNonActionItems();
            dVar.getClass();
            int i2 = i + 0;
            int i3 = this.b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return nonActionItems.get(i2);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            d dVar = d.this;
            int size = dVar.d.getNonActionItems().size();
            dVar.getClass();
            int i = size + 0;
            if (this.b < 0) {
                return i;
            }
            return i - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).initialize(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context) {
        this.b = context;
        this.c = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean collapseItemActionView(f fVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean expandItemActionView(f fVar, h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void initForMenu(Context context, f fVar) {
        if (this.b != null) {
            this.b = context;
            if (this.c == null) {
                this.c = LayoutInflater.from(context);
            }
        }
        this.d = fVar;
        a aVar = this.g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void onCloseMenu(f fVar, boolean z) {
        j.a aVar = this.f;
        if (aVar != null) {
            aVar.onCloseMenu(fVar, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.d.performItemAction(this.g.getItem(i), this, 0);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable onSaveInstanceState() {
        if (this.e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean onSubMenuSelected(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g(mVar);
        e.a aVar = new e.a(mVar.getContext());
        d dVar = new d(aVar.getContext());
        gVar.d = dVar;
        dVar.f = gVar;
        mVar.addMenuPresenter(dVar);
        d dVar2 = gVar.d;
        if (dVar2.g == null) {
            dVar2.g = new a();
        }
        aVar.setAdapter(dVar2.g, gVar);
        View headerView = mVar.getHeaderView();
        if (headerView != null) {
            aVar.setCustomTitle(headerView);
        } else {
            aVar.setIcon(mVar.getHeaderIcon()).setTitle(mVar.getHeaderTitle());
        }
        aVar.setOnKeyListener(gVar);
        androidx.appcompat.app.e create = aVar.create();
        gVar.c = create;
        create.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.c.show();
        j.a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.a(mVar);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void setCallback(j.a aVar) {
        this.f = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void updateMenuView(boolean z) {
        a aVar = this.g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }
}
