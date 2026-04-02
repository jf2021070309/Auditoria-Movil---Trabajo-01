package com.amazon.aps.iva.t30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ProgressSearchResultItemDelegate.kt */
/* loaded from: classes2.dex */
public final class p implements r {
    @Override // com.amazon.aps.iva.t30.r
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.paginated_list_loader, viewGroup, false);
        com.amazon.aps.iva.yb0.j.e(inflate, "from(parent.context).inf…rent, false\n            )");
        return new q(inflate);
    }

    @Override // com.amazon.aps.iva.t30.r
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.s30.h hVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
    }
}
