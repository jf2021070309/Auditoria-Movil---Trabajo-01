package com.amazon.aps.iva.m10;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.q.c0;
import com.ellation.crunchyroll.ui.pagination.PaginationDiffCallback;
/* compiled from: GenresListAdapter.kt */
/* loaded from: classes2.dex */
public final class g extends v<e, RecyclerView.f0> {
    public final k b;

    public g(l lVar) {
        super(new PaginationDiffCallback());
        this.b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        e d = d(i);
        if (d instanceof d) {
            return 101;
        }
        if (d instanceof b) {
            return 100;
        }
        throw new com.amazon.aps.iva.kb0.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        if (f0Var instanceof f) {
            e d = d(i);
            com.amazon.aps.iva.yb0.j.d(d, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.genres.adapter.GenreDataItemUiModel");
            View view = ((f) f0Var).itemView;
            com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.genres.adapter.GenresListItemLayout");
            i iVar = ((h) view).e;
            iVar.getClass();
            com.amazon.aps.iva.l10.a aVar = ((b) d).e;
            iVar.c = aVar;
            if (aVar != null) {
                iVar.getView().setBackgroundImage(aVar.e);
                iVar.getView().setTitle(aVar.c);
                com.amazon.aps.iva.l10.a aVar2 = iVar.c;
                if (aVar2 != null) {
                    if (!aVar2.d.isEmpty()) {
                        iVar.getView().w1();
                        j view2 = iVar.getView();
                        com.amazon.aps.iva.l10.a aVar3 = iVar.c;
                        if (aVar3 != null) {
                            view2.setIcon(aVar3.d);
                            return;
                        } else {
                            com.amazon.aps.iva.yb0.j.m("genre");
                            throw null;
                        }
                    }
                    iVar.getView().k1();
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("genre");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("genre");
            throw null;
        } else if (f0Var instanceof com.amazon.aps.iva.z70.a) {
            ((com.amazon.aps.iva.z70.a) f0Var).b1(a.b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        if (i != 100) {
            if (i == 101) {
                Context context = viewGroup.getContext();
                com.amazon.aps.iva.yb0.j.e(context, "parent.context");
                return new com.amazon.aps.iva.z70.a(context);
            }
            throw new IllegalArgumentException(c0.a("Unsupported view type ", i));
        }
        Context context2 = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context2, "parent.context");
        return this.b.a(context2);
    }
}
