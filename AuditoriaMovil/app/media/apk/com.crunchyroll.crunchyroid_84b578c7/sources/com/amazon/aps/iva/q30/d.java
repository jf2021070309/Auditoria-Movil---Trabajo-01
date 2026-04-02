package com.amazon.aps.iva.q30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
/* compiled from: RecentSearchesAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends androidx.recyclerview.widget.v<b, a> {
    public final c b;

    /* compiled from: RecentSearchesAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.f0 {
        public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] e = {com.amazon.aps.iva.k.q.a(a.class, "title", "getTitle()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(a.class, "removeButton", "getRemoveButton()Landroid/view/View;", 0)};
        public final c b;
        public final com.amazon.aps.iva.xw.v c;
        public final com.amazon.aps.iva.xw.v d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, c cVar) {
            super(view);
            com.amazon.aps.iva.yb0.j.f(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.b = cVar;
            this.c = com.amazon.aps.iva.xw.g.g(this, R.id.recent_search_title);
            this.d = com.amazon.aps.iva.xw.g.g(this, R.id.remove_recent_search_button);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar) {
        super(j.a);
        com.amazon.aps.iva.yb0.j.f(qVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b = qVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        a aVar = (a) f0Var;
        com.amazon.aps.iva.yb0.j.f(aVar, "holder");
        Object obj = this.a.f.get(i);
        com.amazon.aps.iva.yb0.j.e(obj, "currentList[position]");
        b bVar = (b) obj;
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = a.e;
        ((TextView) aVar.c.getValue(aVar, lVarArr[0])).setText(bVar.e());
        aVar.itemView.setOnClickListener(new com.amazon.aps.iva.du.b(1, aVar, bVar));
        ((View) aVar.d.getValue(aVar, lVarArr[1])).setOnClickListener(new com.amazon.aps.iva.jm.s(3, aVar, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recent_search_chip, viewGroup, false);
        com.amazon.aps.iva.yb0.j.e(inflate, "from(parent.context).inf…      false\n            )");
        return new a(inflate, this.b);
    }
}
