package com.amazon.aps.iva.qn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.sortandfilters.filters.empty.EmptyFilterResultLayout;
/* compiled from: FiltersAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends v<com.amazon.aps.iva.mn.b, a> {
    public final p<com.amazon.aps.iva.mn.b, com.amazon.aps.iva.fs.b, q> b;

    /* compiled from: FiltersAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.f0 {
        public static final /* synthetic */ int d = 0;
        public final com.amazon.aps.iva.on.c b;
        public final p<com.amazon.aps.iva.mn.b, com.amazon.aps.iva.fs.b, q> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.on.c cVar, p<? super com.amazon.aps.iva.mn.b, ? super com.amazon.aps.iva.fs.b, q> pVar) {
            super(cVar.b);
            j.f(pVar, "onClearFilter");
            this.b = cVar;
            this.c = pVar;
        }
    }

    public d(EmptyFilterResultLayout.b bVar) {
        super(e.a);
        this.b = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        a aVar = (a) f0Var;
        j.f(aVar, "holder");
        Object obj = this.a.f.get(i);
        j.e(obj, "currentList[position]");
        com.amazon.aps.iva.mn.b bVar = (com.amazon.aps.iva.mn.b) obj;
        com.amazon.aps.iva.on.c cVar = aVar.b;
        cVar.c.setText(bVar.getTitle());
        ((ImageButton) cVar.d).setOnClickListener(new com.amazon.aps.iva.dc.c(1, aVar, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_filter_chip, viewGroup, false);
        int i2 = R.id.filter_chip_remove_button;
        ImageButton imageButton = (ImageButton) z.u(R.id.filter_chip_remove_button, inflate);
        if (imageButton != null) {
            i2 = R.id.filter_chip_title;
            TextView textView = (TextView) z.u(R.id.filter_chip_title, inflate);
            if (textView != null) {
                return new a(new com.amazon.aps.iva.on.c((LinearLayout) inflate, imageButton, textView, 0), this.b);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
