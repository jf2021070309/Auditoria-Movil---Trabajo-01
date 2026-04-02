package com.amazon.aps.iva.jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.jm.d;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: AvatarCollectionAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends androidx.recyclerview.widget.v<d, RecyclerView.f0> {
    public final u b;

    /* compiled from: AvatarCollectionAdapter.kt */
    /* renamed from: com.amazon.aps.iva.jm.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0422a extends com.amazon.aps.iva.wy.h {
        void Pd(List<? extends r> list);

        void fc();

        void setTitle(String str);

        void w8();
    }

    /* compiled from: AvatarCollectionAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.f0 implements InterfaceC0422a {
        public final com.amazon.aps.iva.mj.i b;
        public final t c;
        public final c d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.mj.i iVar, u uVar) {
            super(iVar.a());
            com.amazon.aps.iva.yb0.j.f(uVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.b = iVar;
            t tVar = new t(uVar);
            this.c = tVar;
            this.d = new c(this);
            RecyclerView recyclerView = (RecyclerView) iVar.e;
            recyclerView.addItemDecoration(new v());
            recyclerView.setAdapter(tVar);
        }

        @Override // com.amazon.aps.iva.jm.a.InterfaceC0422a
        public final void Pd(List<? extends r> list) {
            com.amazon.aps.iva.yb0.j.f(list, FirebaseAnalytics.Param.ITEMS);
            this.c.e(list);
        }

        @Override // com.amazon.aps.iva.jm.a.InterfaceC0422a
        public final void fc() {
            View view = this.b.d;
            com.amazon.aps.iva.yb0.j.e(view, "binding.collectionEmptyTitle");
            view.setVisibility(8);
        }

        @Override // com.amazon.aps.iva.jm.a.InterfaceC0422a
        public final void setTitle(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "title");
            this.b.b.setText(str);
        }

        @Override // com.amazon.aps.iva.jm.a.InterfaceC0422a
        public final void w8() {
            View view = this.b.d;
            com.amazon.aps.iva.yb0.j.e(view, "binding.collectionEmptyTitle");
            view.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar) {
        super(com.amazon.aps.iva.jm.b.a);
        com.amazon.aps.iva.yb0.j.f(hVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        if (f0Var instanceof b) {
            d d = d(i);
            com.amazon.aps.iva.yb0.j.e(d, "getItem(position)");
            d dVar = d;
            c cVar = ((b) f0Var).d;
            cVar.getClass();
            cVar.getView().Pd(dVar.b());
            if (dVar instanceof d.a) {
                cVar.getView().w8();
            } else if (dVar instanceof d.b) {
                cVar.getView().fc();
                cVar.getView().setTitle(((d.b) dVar).c);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.avatar_collection_item_layout, viewGroup, false);
        int i2 = R.id.collection_empty_title;
        View u = z.u(R.id.collection_empty_title, inflate);
        if (u != null) {
            i2 = R.id.collection_items_recycler;
            RecyclerView recyclerView = (RecyclerView) z.u(R.id.collection_items_recycler, inflate);
            if (recyclerView != null) {
                i2 = R.id.collection_title;
                TextView textView = (TextView) z.u(R.id.collection_title, inflate);
                if (textView != null) {
                    return new b(new com.amazon.aps.iva.mj.i((ConstraintLayout) inflate, u, recyclerView, textView), this.b);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
