package com.crunchyroll.music.featuredmusic;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yh.f;
/* compiled from: FeaturedMusicLayout.kt */
/* loaded from: classes.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fi.a, q> {
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(1);
        this.h = context;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.fi.a aVar) {
        com.amazon.aps.iva.fi.a aVar2 = aVar;
        j.f(aVar2, "it");
        com.amazon.aps.iva.hi.a aVar3 = f.a.b;
        if (aVar3 != null) {
            Activity a = com.amazon.aps.iva.xw.q.a(this.h);
            j.c(a);
            aVar3.a(a, new com.amazon.aps.iva.l50.c(aVar2.a, t.MUSIC_VIDEO));
            return q.a;
        }
        j.m("watchMusicScreenRouter");
        throw null;
    }
}
