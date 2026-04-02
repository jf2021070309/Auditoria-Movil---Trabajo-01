package com.amazon.aps.iva.a70;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.pz.a;
import com.amazon.aps.iva.xw.k;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: BottomSheetActionMenu.kt */
/* loaded from: classes2.dex */
public final class e extends BottomSheetDialog implements g {
    public static final /* synthetic */ l<Object>[] i = {q.a(e.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), q.a(e.class, "list", "getList()Landroid/widget/ListView;", 0)};
    public final c<?> b;
    public final int c;
    public final int d;
    public final int e;
    public final v f;
    public final v g;
    public final f h;

    /* compiled from: BottomSheetActionMenu.kt */
    /* loaded from: classes2.dex */
    public static final class a extends ArrayAdapter<String> {

        /* compiled from: BottomSheetActionMenu.kt */
        /* renamed from: com.amazon.aps.iva.a70.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0106a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ TextView h;
            public final /* synthetic */ a i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0106a(TextView textView, a aVar) {
                super(1);
                this.h = textView;
                this.i = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
                this.h.setTextColor(com.amazon.aps.iva.d3.a.getColor(this.i.getContext(), num.intValue()));
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: BottomSheetActionMenu.kt */
        /* loaded from: classes2.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ TextView h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(TextView textView) {
                super(1);
                this.h = textView;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
                this.h.setEnabled(bool.booleanValue());
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public a(Context context, int i, int i2, ArrayList arrayList) {
            super(context, i, i2, arrayList);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            j.f(viewGroup, "parent");
            View view2 = super.getView(i, view, viewGroup);
            j.e(view2, "super.getView(position, convertView, parent)");
            TextView textView = (TextView) view2.findViewById(R.id.item_title);
            e.this.h.q6(i, new C0106a(textView, this), new b(textView));
            return view2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, c cVar, int i2, int i3, int i4, int i5, a.C0628a c0628a) {
        super(context);
        j.f(context, "context");
        j.f(cVar, "uiModel");
        this.b = cVar;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        int i6 = R.id.title;
        k kVar = k.h;
        this.f = new v(new com.amazon.aps.iva.xw.f(i6, kVar));
        this.g = com.amazon.aps.iva.xw.g.h(R.id.popupList, kVar);
        Iterable<com.amazon.aps.iva.a70.a> iterable = cVar.a;
        ArrayList arrayList = new ArrayList(r.Y(iterable));
        for (com.amazon.aps.iva.a70.a aVar : iterable) {
            arrayList.add(aVar.a);
        }
        this.h = new f(this, arrayList, c0628a, i2, this.e, this.d);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, com.amazon.aps.iva.k.o, com.amazon.aps.iva.e.j, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.c);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(Integer.MIN_VALUE);
            window.setFlags(256, 256);
            window.setStatusBarColor(com.amazon.aps.iva.d3.a.getColor(window.getContext(), R.color.status_bar_translucent_color));
            window.setLayout(-1, -2);
            window.setGravity(80);
        }
        l<?>[] lVarArr = i;
        TextView textView = (TextView) this.f.getValue(this, lVarArr[0]);
        c<?> cVar = this.b;
        if (textView != null) {
            textView.setText(cVar.b);
        }
        l<?> lVar = lVarArr[1];
        v vVar = this.g;
        ListView listView = (ListView) vVar.getValue(this, lVar);
        Context context = getContext();
        int i2 = R.layout.bottom_sheet_menu_item;
        int i3 = R.id.item_title;
        List<com.amazon.aps.iva.a70.a<?>> list = cVar.a;
        ArrayList arrayList = new ArrayList(r.Y(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(getContext().getString(((com.amazon.aps.iva.a70.a) it.next()).a.a));
        }
        listView.setAdapter((ListAdapter) new a(context, i2, i3, arrayList));
        ((ListView) vVar.getValue(this, lVarArr[1])).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.amazon.aps.iva.a70.d
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
                e eVar = e.this;
                j.f(eVar, "this$0");
                eVar.h.r6(i4);
            }
        });
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, com.amazon.aps.iva.e.j, android.app.Dialog
    public final void onStart() {
        super.onStart();
        getBehavior().setState(3);
    }
}
