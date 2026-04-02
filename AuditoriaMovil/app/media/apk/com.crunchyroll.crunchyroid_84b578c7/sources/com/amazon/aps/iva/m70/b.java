package com.amazon.aps.iva.m70;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.m70.a;
import com.amazon.aps.iva.yb0.j;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: LoadingStateAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.h<RecyclerView.f0> {
    public a a = a.c.a;

    public final void d(a aVar) {
        j.f(aVar, "value");
        this.a = aVar;
        notifyItemChanged(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        if (this.a instanceof a.C0505a) {
            return WebSocketProtocol.CLOSE_NO_STATUS_CODE;
        }
        return 1004;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        j.f(f0Var, "holder");
        if (f0Var instanceof g) {
            a aVar = this.a;
            j.f(aVar, "loadingState");
            View view = ((g) f0Var).itemView;
            j.d(view, "null cannot be cast to non-null type com.ellation.widgets.loadingstateadapter.LoadingStateLayout");
            e eVar = ((c) view).c;
            eVar.getClass();
            eVar.b = aVar;
            if (aVar instanceof a.c) {
                eVar.getView().a();
            } else if (aVar instanceof a.b) {
                a.b bVar = (a.b) aVar;
                eVar.getView().L4(bVar.a, bVar.b, new d(eVar));
            } else if (aVar instanceof a.C0505a) {
                a.C0505a c0505a = (a.C0505a) aVar;
                eVar.getView().q3(c0505a.a, c0505a.b, c0505a.c);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new g(new c(context));
    }
}
