package com.amazon.aps.iva.ru;

import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
/* compiled from: CommentRepliesModule.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, h0> {
    public final /* synthetic */ c h;
    public final /* synthetic */ r i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c cVar, r rVar) {
        super(1);
        this.h = cVar;
        this.i = rVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final h0 invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        com.amazon.aps.iva.bu.d dVar = new com.amazon.aps.iva.bu.d();
        c cVar = this.h;
        com.amazon.aps.iva.du.x xVar = cVar.c;
        r rVar = this.i;
        rVar.getClass();
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = r.s;
        com.amazon.aps.iva.fc0.l<?> lVar = lVarArr[0];
        com.amazon.aps.iva.fc0.l<?> lVar2 = lVarArr[2];
        String str = cVar.b;
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        TalkboxService talkboxService = rVar.b;
        com.amazon.aps.iva.yb0.j.f(talkboxService, "talkboxService");
        return new h0(dVar, xVar, (com.amazon.aps.iva.vt.x) rVar.e.getValue(rVar, lVar), (com.amazon.aps.iva.nu.i) rVar.g.getValue(rVar, lVar2), new e(str, talkboxService), new com.amazon.aps.iva.vt.e(str, talkboxService));
    }
}
