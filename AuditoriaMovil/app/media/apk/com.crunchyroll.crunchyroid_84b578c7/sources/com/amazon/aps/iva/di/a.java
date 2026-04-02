package com.amazon.aps.iva.di;

import com.amazon.aps.iva.ez.g;
import java.util.Collection;
import java.util.List;
/* compiled from: FeaturedMusicDataProvider.kt */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.ei.i>>, Boolean> {
    public static final a h = new a();

    public a() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.ei.i>> gVar) {
        com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.ei.i>> gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "it");
        boolean z = true;
        if (!(gVar2 instanceof g.a) && (!(gVar2 instanceof g.c) || !(!((Collection) ((g.c) gVar2).a).isEmpty()))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
