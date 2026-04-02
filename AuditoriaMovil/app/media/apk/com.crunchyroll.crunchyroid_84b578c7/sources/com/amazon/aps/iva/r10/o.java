package com.amazon.aps.iva.r10;

import androidx.recyclerview.widget.GridLayoutManager;
import com.amazon.aps.iva.r10.n;
import com.crunchyroll.crunchyroid.R;
/* compiled from: HistoryFragment.kt */
/* loaded from: classes2.dex */
public final class o extends GridLayoutManager.c {
    public final /* synthetic */ n c;

    public o(n nVar) {
        this.c = nVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        n.a aVar = n.w;
        n nVar = this.c;
        int itemViewType = ((androidx.recyclerview.widget.f) nVar.l.getValue()).getItemViewType(i);
        if (itemViewType != 301 && itemViewType != 302) {
            return nVar.getResources().getInteger(R.integer.history_number_of_columns);
        }
        return 1;
    }
}
