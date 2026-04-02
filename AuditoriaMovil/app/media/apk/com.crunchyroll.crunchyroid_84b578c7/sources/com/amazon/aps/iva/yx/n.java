package com.amazon.aps.iva.yx;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.xx.c;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: HeroItemDelegate.kt */
/* loaded from: classes2.dex */
public final class n implements p {
    public final Context a;
    public final ImageView b;

    public n(ImageView imageView, Context context) {
        com.amazon.aps.iva.yb0.j.f(imageView, "heroImageView");
        this.a = context;
        this.b = imageView;
    }

    @Override // com.amazon.aps.iva.yx.p
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        return new o(new com.amazon.aps.iva.ey.a(this.b, this.a));
    }

    @Override // com.amazon.aps.iva.yx.p
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        Panel panel = ((c.C0868c) lVar).f;
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        View view = ((o) f0Var).itemView;
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.feed.hero.HeroLayout");
        ((com.amazon.aps.iva.ey.a) view).G4(panel);
    }
}
