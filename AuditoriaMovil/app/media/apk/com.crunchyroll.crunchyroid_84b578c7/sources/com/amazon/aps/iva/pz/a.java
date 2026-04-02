package com.amazon.aps.iva.pz;

import android.content.Context;
import android.view.View;
import com.amazon.aps.iva.a70.h;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ActionMenu.kt */
/* loaded from: classes2.dex */
public final class a<T> implements e<T> {
    public final Context b;
    public final View c;
    public final int d;
    public final int e;
    public final int f;
    public final d g;

    /* compiled from: ActionMenu.kt */
    /* renamed from: com.amazon.aps.iva.pz.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0628a extends i implements l<com.amazon.aps.iva.a70.b, q> {
        public C0628a(d dVar) {
            super(1, dVar, c.class, "onMenuItemSelected", "onMenuItemSelected(Lcom/ellation/widgets/actionmenu/ActionMenuItem;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.a70.b bVar) {
            com.amazon.aps.iva.a70.b bVar2 = bVar;
            j.f(bVar2, "p0");
            ((c) this.receiver).e3(bVar2);
            return q.a;
        }
    }

    public a(Context context, View view, com.amazon.aps.iva.a70.c cVar, Object obj, l lVar, int i) {
        int i2;
        int i3;
        Object obj2 = (i & 8) != 0 ? null : obj;
        if ((i & 32) != 0) {
            i2 = R.color.primary;
        } else {
            i2 = 0;
        }
        if ((i & 64) != 0) {
            i3 = R.color.color_white;
        } else {
            i3 = 0;
        }
        int i4 = (i & 128) != 0 ? com.ellation.crunchyroll.ui.R.layout.bottom_sheet_container : 0;
        j.f(context, "context");
        j.f(view, "anchor");
        this.b = context;
        this.c = view;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = new d(this, cVar, obj2, k.n(context), lVar);
    }

    @Override // com.amazon.aps.iva.pz.e
    public final void Qg(int i, ArrayList arrayList) {
        Context context = this.b;
        int i2 = this.d;
        new h(context, arrayList, i, Integer.valueOf((int) R.style.CxTheme), this.e, i2, new b(this.g)).G(this.c);
    }

    @Override // com.amazon.aps.iva.pz.e
    public final void jd(com.amazon.aps.iva.a70.c<T> cVar, int i) {
        j.f(cVar, "uiModel");
        new com.amazon.aps.iva.a70.e(this.b, cVar, i, this.f, this.d, this.e, new C0628a(this.g)).show();
    }

    public final void show() {
        boolean z;
        boolean z2;
        d dVar = this.g;
        boolean c = dVar.d.c();
        T t = dVar.c;
        int i = -1;
        com.amazon.aps.iva.a70.c<T> cVar = dVar.b;
        if (c) {
            e<T> view = dVar.getView();
            List<com.amazon.aps.iva.a70.a<T>> list = cVar.a;
            ArrayList arrayList = new ArrayList(r.Y(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.amazon.aps.iva.a70.a) it.next()).a);
            }
            Iterator<com.amazon.aps.iva.a70.a<T>> it2 = cVar.a.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                com.amazon.aps.iva.a70.a<T> next = it2.next();
                if (t != null && j.a(next.b, t)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i = i2;
                    break;
                }
                i2++;
            }
            view.Qg(i, arrayList);
            return;
        }
        e<T> view2 = dVar.getView();
        Iterator<com.amazon.aps.iva.a70.a<T>> it3 = cVar.a.iterator();
        int i3 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            com.amazon.aps.iva.a70.a<T> next2 = it3.next();
            if (t != null && j.a(next2.b, t)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = i3;
                break;
            }
            i3++;
        }
        view2.jd(cVar, i);
    }
}
