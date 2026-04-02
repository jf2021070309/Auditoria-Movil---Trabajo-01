package com.crunchyroll.music.featuredmusic;

import android.content.Context;
import androidx.lifecycle.p;
import com.amazon.aps.iva.di.e;
import com.amazon.aps.iva.di.f;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yh.f;
import com.amazon.aps.iva.yh.i;
/* compiled from: FeaturedMusicLayout.kt */
/* loaded from: classes.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.di.p> {
    public final /* synthetic */ e h;
    public final /* synthetic */ Context i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Context context) {
        super(1);
        this.h = fVar;
        this.i = context;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.di.p invoke(p pVar) {
        j.f(pVar, "it");
        i iVar = f.a.a;
        if (iVar != null) {
            return new com.amazon.aps.iva.di.p(this.h, new com.amazon.aps.iva.at.f(new c(iVar)), new com.amazon.aps.iva.yh.d(new com.amazon.aps.iva.yh.b(this.i)));
        }
        j.m("dependencies");
        throw null;
    }
}
