package com.amazon.aps.iva.ru;

import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
/* compiled from: CommentRepliesModule.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.vt.x> {
    public final /* synthetic */ c h;
    public final /* synthetic */ r i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c cVar, r rVar) {
        super(1);
        this.h = cVar;
        this.i = rVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.vt.x invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        com.amazon.aps.iva.bu.d dVar = new com.amazon.aps.iva.bu.d();
        String str = this.h.b;
        TalkboxService talkboxService = this.i.b;
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        com.amazon.aps.iva.yb0.j.f(talkboxService, "talkboxService");
        return new com.amazon.aps.iva.vt.x(dVar, new com.amazon.aps.iva.vt.e(str, talkboxService));
    }
}
