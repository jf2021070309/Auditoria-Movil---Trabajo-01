package com.amazon.aps.iva.c50;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.b60.k;
import com.amazon.aps.iva.b60.l;
import com.amazon.aps.iva.b60.s;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: WatchlistAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends v<s, i> {
    public final g b;

    public b(d dVar) {
        super(com.amazon.aps.iva.c60.f.a);
        this.b = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        if (d(i) instanceof l) {
            return 101;
        }
        return 100;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        i iVar = (i) f0Var;
        j.f(iVar, "holder");
        if (iVar instanceof h) {
            h hVar = (h) iVar;
            s d = d(hVar.getBindingAdapterPosition());
            j.d(d, "null cannot be cast to non-null type com.ellation.crunchyroll.watchlist.WatchlistDataItemUiModel");
            k kVar = (k) d;
            int bindingAdapterPosition = hVar.getBindingAdapterPosition();
            View view = hVar.itemView;
            j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.watchlist.adapter.WatchlistItemLayout");
            ((e) view).b1(kVar, bindingAdapterPosition);
            hVar.b1(kVar.h);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        g gVar = this.b;
        if (i != 100) {
            if (i == 101) {
                return gVar.b(viewGroup);
            }
            throw new IllegalArgumentException(c0.a("Unsupported view type ", i));
        }
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return gVar.a(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i, List list) {
        i iVar = (i) f0Var;
        j.f(iVar, "holder");
        j.f(list, "payloads");
        if (!list.isEmpty()) {
            Object obj = list.get(0);
            if ((obj instanceof com.amazon.aps.iva.e60.a) && (iVar instanceof h)) {
                ((h) iVar).b1((com.amazon.aps.iva.e60.a) obj);
                return;
            }
            return;
        }
        super.onBindViewHolder(iVar, i, list);
    }
}
