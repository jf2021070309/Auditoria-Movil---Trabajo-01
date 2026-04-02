package com.amazon.aps.iva.mv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ov.h;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.overflow.OverflowButton;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.List;
/* compiled from: CrunchylistsAdapter.kt */
/* loaded from: classes2.dex */
public final class f extends v<com.amazon.aps.iva.nv.b, RecyclerView.f0> {
    public final l<com.amazon.aps.iva.nv.e, q> b;
    public final l<com.amazon.aps.iva.nv.e, q> c;
    public final l<com.amazon.aps.iva.nv.e, q> d;

    public f(com.amazon.aps.iva.lv.b bVar, com.amazon.aps.iva.lv.c cVar, com.amazon.aps.iva.lv.d dVar) {
        super(b.a);
        this.b = bVar;
        this.c = cVar;
        this.d = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        if (d(i) instanceof com.amazon.aps.iva.nv.a) {
            return 502;
        }
        return 501;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        j.f(f0Var, "holder");
        if (f0Var instanceof e) {
            Object obj = this.a.f.get(i);
            j.d(obj, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.crunchyliststab.list.item.CrunchylistItemUiModel");
            com.amazon.aps.iva.nv.e eVar = (com.amazon.aps.iva.nv.e) obj;
            l<com.amazon.aps.iva.nv.e, q> lVar = this.b;
            j.f(lVar, "onCrunchylistItemClick");
            l<com.amazon.aps.iva.nv.e, q> lVar2 = this.c;
            j.f(lVar2, "onCrunchylistItemRename");
            l<com.amazon.aps.iva.nv.e, q> lVar3 = this.d;
            j.f(lVar3, "onCrunchylistItemDelete");
            com.amazon.aps.iva.nv.c cVar = ((e) f0Var).b;
            cVar.getClass();
            com.amazon.aps.iva.nv.d dVar = cVar.b;
            dVar.getClass();
            dVar.getView().L1(eVar.e);
            dVar.getView().K0(eVar.f);
            String format = dVar.b.format(eVar.g);
            j.e(format, "dateFormat.format(model.modifiedAt)");
            dVar.getView().Hf(format);
            h hVar = cVar.c;
            hVar.a.setOnClickListener(new com.amazon.aps.iva.dc.b(2, lVar, eVar));
            OverflowButton overflowButton = hVar.e;
            j.e(overflowButton, "binding.crunchylistOverflowButton");
            List<com.amazon.aps.iva.n70.b> a = new d(lVar2, lVar3).a(eVar);
            int i2 = OverflowButton.h;
            overflowButton.G(a, null, null, null, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        if (i != 501) {
            if (i == 502) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_crunchylist_empty_item, viewGroup, false);
                int i2 = R.id.crunchylist_item_empty_number_of_items;
                if (z.u(R.id.crunchylist_item_empty_number_of_items, inflate) != null) {
                    i2 = R.id.crunchylist_item_placeholder_title;
                    if (z.u(R.id.crunchylist_item_placeholder_title, inflate) != null) {
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
                        j.e(shimmerFrameLayout, "inflate(\n               …se\n                ).root");
                        return new c(shimmerFrameLayout);
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            }
            throw new IllegalArgumentException(c0.a("Unsupported view type ", i));
        }
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new e(new com.amazon.aps.iva.nv.c(context, null, 0));
    }
}
