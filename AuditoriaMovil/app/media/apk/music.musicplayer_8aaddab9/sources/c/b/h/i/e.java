package c.b.h.i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import c.b.c.i;
import c.b.h.i.m;
import c.b.h.i.n;
import java.util.ArrayList;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {
    public Context a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f989b;

    /* renamed from: c  reason: collision with root package name */
    public g f990c;

    /* renamed from: d  reason: collision with root package name */
    public ExpandedMenuView f991d;

    /* renamed from: e  reason: collision with root package name */
    public m.a f992e;

    /* renamed from: f  reason: collision with root package name */
    public a f993f;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        public int a = -1;

        public a() {
            a();
        }

        public void a() {
            g gVar = e.this.f990c;
            i iVar = gVar.w;
            if (iVar != null) {
                gVar.i();
                ArrayList<i> arrayList = gVar.f1009k;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayList.get(i2) == iVar) {
                        this.a = i2;
                        return;
                    }
                }
            }
            this.a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public i getItem(int i2) {
            g gVar = e.this.f990c;
            gVar.i();
            ArrayList<i> arrayList = gVar.f1009k;
            Objects.requireNonNull(e.this);
            int i3 = i2 + 0;
            int i4 = this.a;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayList.get(i3);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            g gVar = e.this.f990c;
            gVar.i();
            int size = gVar.f1009k.size();
            Objects.requireNonNull(e.this);
            int i2 = size + 0;
            return this.a < 0 ? i2 : i2 - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = e.this.f989b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((n.a) view).d(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i2) {
        this.a = context;
        this.f989b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f993f == null) {
            this.f993f = new a();
        }
        return this.f993f;
    }

    @Override // c.b.h.i.m
    public void b(g gVar, boolean z) {
        m.a aVar = this.f992e;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // c.b.h.i.m
    public void c(boolean z) {
        a aVar = this.f993f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // c.b.h.i.m
    public boolean d() {
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
    public void g(m.a aVar) {
        this.f992e = aVar;
    }

    @Override // c.b.h.i.m
    public void h(Context context, g gVar) {
        if (this.a != null) {
            this.a = context;
            if (this.f989b == null) {
                this.f989b = LayoutInflater.from(context);
            }
        }
        this.f990c = gVar;
        a aVar = this.f993f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // c.b.h.i.m
    public boolean i(r rVar) {
        if (rVar.hasVisibleItems()) {
            h hVar = new h(rVar);
            i.a aVar = new i.a(rVar.f1000b);
            e eVar = new e(aVar.a.a, R.layout.abc_list_menu_item_layout);
            hVar.f1014c = eVar;
            eVar.f992e = hVar;
            g gVar = hVar.a;
            gVar.b(eVar, gVar.f1000b);
            ListAdapter a2 = hVar.f1014c.a();
            AlertController.b bVar = aVar.a;
            bVar.f137m = a2;
            bVar.f138n = hVar;
            View view = rVar.p;
            if (view != null) {
                bVar.f129e = view;
            } else {
                bVar.f127c = rVar.o;
                bVar.f128d = rVar.f1012n;
            }
            bVar.f135k = hVar;
            c.b.c.i a3 = aVar.a();
            hVar.f1013b = a3;
            a3.setOnDismissListener(hVar);
            WindowManager.LayoutParams attributes = hVar.f1013b.getWindow().getAttributes();
            attributes.type = 1003;
            attributes.flags |= 131072;
            hVar.f1013b.show();
            m.a aVar2 = this.f992e;
            if (aVar2 != null) {
                aVar2.c(rVar);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f990c.s(this.f993f.getItem(i2), this, 0);
    }
}
