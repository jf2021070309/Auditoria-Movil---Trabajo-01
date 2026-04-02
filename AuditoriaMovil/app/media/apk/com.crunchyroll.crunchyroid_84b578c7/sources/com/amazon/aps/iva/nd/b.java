package com.amazon.aps.iva.nd;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.yb0.j;
import com.braze.ui.contentcards.adapters.EmptyContentCardsAdapter;
/* compiled from: EmptyPersistentMessageCenterAdapter.kt */
/* loaded from: classes.dex */
public final class b extends EmptyContentCardsAdapter {
    @Override // com.braze.ui.contentcards.adapters.EmptyContentCardsAdapter, androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        j.f(f0Var, "viewHolder");
        super.onBindViewHolder(f0Var, i);
        ((com.amazon.aps.iva.z70.a) f0Var).b1(a.b);
    }

    @Override // com.braze.ui.contentcards.adapters.EmptyContentCardsAdapter, androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        j.e(context, "viewGroup.context");
        com.amazon.aps.iva.z70.a aVar = new com.amazon.aps.iva.z70.a(context);
        aVar.itemView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        return aVar;
    }
}
