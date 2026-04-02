package com.amazon.aps.iva.dy;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.js.k;
import com.amazon.aps.iva.jt.a;
import com.amazon.aps.iva.xx.n;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.google.android.gms.cast.MediaError;
/* compiled from: MusicAssetDelegate.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.ay.b<n> {
    public final com.amazon.aps.iva.n70.d<n> a;
    public final DurationFormatter b;
    public final g c;
    public final e d;
    public final int e;

    public d(com.amazon.aps.iva.n70.d dVar, DurationFormatter durationFormatter, h hVar) {
        j.f(dVar, "overflowMenuProvider");
        j.f(durationFormatter, "durationFormatter");
        this.a = dVar;
        this.b = durationFormatter;
        this.c = hVar;
        this.d = e.a;
        this.e = MediaError.DetailedErrorCode.MEDIAKEYS_UNSUPPORTED;
    }

    @Override // com.amazon.aps.iva.ay.b
    public final com.amazon.aps.iva.z70.a a(ViewGroup viewGroup) {
        j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new com.amazon.aps.iva.z70.a(context);
    }

    @Override // com.amazon.aps.iva.ay.b
    public final void b(RecyclerView.f0 f0Var, n nVar, int i, int i2) {
        j.f(f0Var, "holder");
        ((com.amazon.aps.iva.z70.a) f0Var).b1(com.amazon.aps.iva.v0.b.c(-1726707729, new c(a.C0423a.a(k.COLLECTION, i2, i, null, null, 56), nVar, this), true));
    }

    @Override // com.amazon.aps.iva.ay.b
    public final n.e<com.amazon.aps.iva.xx.n> c() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ay.b
    public final int getType() {
        return this.e;
    }
}
