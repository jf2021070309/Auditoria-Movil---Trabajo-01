package com.amazon.aps.iva.cy;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaError;
/* compiled from: ArtistsDelegate.kt */
/* loaded from: classes2.dex */
public final class g implements com.amazon.aps.iva.ay.b<com.amazon.aps.iva.xx.b> {
    public final com.amazon.aps.iva.n70.d<com.amazon.aps.iva.xx.b> a;
    public final b b;
    public final h c;
    public final int d;

    public g(com.amazon.aps.iva.n70.d dVar, c cVar) {
        j.f(dVar, "overflowMenuProvider");
        this.a = dVar;
        this.b = cVar;
        this.c = h.a;
        this.d = MediaError.DetailedErrorCode.MEDIAKEYS_NETWORK;
    }

    @Override // com.amazon.aps.iva.ay.b
    public final com.amazon.aps.iva.z70.a a(ViewGroup viewGroup) {
        j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }

    @Override // com.amazon.aps.iva.ay.b
    public final void b(RecyclerView.f0 f0Var, com.amazon.aps.iva.xx.b bVar, int i, int i2) {
        j.f(f0Var, "holder");
        ((com.amazon.aps.iva.z70.a) f0Var).b1(com.amazon.aps.iva.v0.b.c(-363013488, new f(i2, i, bVar, this), true));
    }

    @Override // com.amazon.aps.iva.ay.b
    public final n.e<com.amazon.aps.iva.xx.b> c() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ay.b
    public final int getType() {
        return this.d;
    }
}
