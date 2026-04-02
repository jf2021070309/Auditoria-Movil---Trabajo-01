package com.amazon.aps.iva.yx;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ProgressItemDelegate.kt */
/* loaded from: classes2.dex */
public final class s implements p {
    @Override // com.amazon.aps.iva.yx.p
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.paginated_list_loader, viewGroup, false);
        inflate.setBackgroundColor(com.amazon.aps.iva.d3.a.getColor(viewGroup.getContext(), R.color.activity_background));
        return new t(inflate);
    }

    @Override // com.amazon.aps.iva.yx.p
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
    }
}
