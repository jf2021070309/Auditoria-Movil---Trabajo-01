package com.amazon.aps.iva.kf;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.kf.g;
/* compiled from: ConnectedAppsAdapter.kt */
/* loaded from: classes.dex */
public final class a extends androidx.recyclerview.widget.v<c0, w> {
    public final com.amazon.aps.iva.xb0.p<c0, com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> b;

    public a(g.b bVar) {
        super(z.a);
        this.b = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        w wVar = (w) f0Var;
        com.amazon.aps.iva.yb0.j.f(wVar, "holder");
        c0 d = d(i);
        com.amazon.aps.iva.yb0.j.e(d, "getItem(position)");
        c0 c0Var = d;
        b0 b0Var = wVar.b;
        b0Var.getClass();
        com.amazon.aps.iva.xb0.p<c0, com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> pVar = this.b;
        com.amazon.aps.iva.yb0.j.f(pVar, "onConnectedAppItemClick");
        com.amazon.aps.iva.lf.b bVar = b0Var.b;
        bVar.d.setText(c0Var.b);
        bVar.c.setText(c0Var.c);
        TextView textView = bVar.b;
        textView.setText(c0Var.d);
        ImageView imageView = bVar.e;
        imageView.setImageResource(c0Var.f);
        imageView.setContentDescription(b0Var.getContext().getString(c0Var.g));
        bVar.f.setImageResource(c0Var.e);
        textView.setOnClickListener(new com.amazon.aps.iva.dc.b(1, pVar, c0Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "parent.context");
        return new w(new b0(context, null, 0));
    }
}
