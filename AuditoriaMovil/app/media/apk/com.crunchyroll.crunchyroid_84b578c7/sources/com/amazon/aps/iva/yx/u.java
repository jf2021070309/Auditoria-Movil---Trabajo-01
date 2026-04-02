package com.amazon.aps.iva.yx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ViewAllItemDelegate.kt */
/* loaded from: classes2.dex */
public final class u implements p {
    @Override // com.amazon.aps.iva.yx.p
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_view_all, viewGroup, false);
        com.amazon.aps.iva.yb0.j.d(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        com.amazon.aps.iva.vx.k kVar = defpackage.i.f;
        if (kVar != null) {
            Context context = viewGroup.getContext();
            com.amazon.aps.iva.yb0.j.e(context, "parent.context");
            View o = kVar.a.o(context);
            o.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            viewGroup2.addView(o);
            return new v(viewGroup2);
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.yx.p
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
    }
}
