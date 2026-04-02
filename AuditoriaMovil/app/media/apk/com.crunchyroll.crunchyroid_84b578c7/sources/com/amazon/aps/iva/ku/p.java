package com.amazon.aps.iva.ku;

import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import java.util.Locale;
/* compiled from: PostCommentModule.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, y> {
    public final /* synthetic */ q h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar) {
        super(1);
        this.h = qVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final y invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        q qVar = this.h;
        TalkboxService talkboxService = qVar.d;
        com.amazon.aps.iva.yb0.j.f(talkboxService, "talkboxService");
        com.amazon.aps.iva.xb0.a<Locale> aVar = qVar.e;
        com.amazon.aps.iva.yb0.j.f(aVar, "getLocale");
        i iVar = new i(talkboxService, aVar);
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        com.amazon.aps.iva.ff.b bVar = qVar.f;
        com.amazon.aps.iva.yb0.j.f(bVar, "currentAssetProvider");
        return new y(iVar, new c(cVar, bVar), qVar.b, qVar.c);
    }
}
