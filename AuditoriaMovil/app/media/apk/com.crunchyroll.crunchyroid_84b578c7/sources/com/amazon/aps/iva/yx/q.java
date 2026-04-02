package com.amazon.aps.iva.yx;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: LegalDisclaimerItemDelegate.kt */
/* loaded from: classes2.dex */
public final class q implements p {
    @Override // com.amazon.aps.iva.yx.p
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_legal_disclaimer, viewGroup, false);
        com.amazon.aps.iva.yb0.j.d(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new r((ViewGroup) inflate);
    }

    @Override // com.amazon.aps.iva.yx.p
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
    }
}
