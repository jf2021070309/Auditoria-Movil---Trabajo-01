package com.amazon.aps.iva.yx;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: HeroArtistItemDelegate.kt */
/* loaded from: classes2.dex */
public final class l implements p {
    public final Context a;
    public final ImageView b;

    public l(ImageView imageView, Context context) {
        com.amazon.aps.iva.yb0.j.f(imageView, "heroImageView");
        this.a = context;
        this.b = imageView;
    }

    @Override // com.amazon.aps.iva.yx.p
    public final RecyclerView.f0 a(ViewGroup viewGroup) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        return new m(new com.amazon.aps.iva.fy.a(this.b, this.a));
    }

    @Override // com.amazon.aps.iva.yx.p
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.l lVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        View view = ((m) f0Var).itemView;
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.feed.heromusic.HeroMusicLayout");
        ((com.amazon.aps.iva.fy.a) view).G4((com.amazon.aps.iva.xx.p) lVar);
    }
}
