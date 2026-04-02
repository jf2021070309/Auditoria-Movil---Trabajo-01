package com.amazon.aps.iva.ru;

import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
/* compiled from: CommentRepliesModule.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.nu.i> {
    public final /* synthetic */ r h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar) {
        super(1);
        this.h = rVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.nu.i invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        TalkboxService talkboxService = this.h.b;
        com.amazon.aps.iva.yb0.j.f(talkboxService, "talkboxService");
        return new com.amazon.aps.iva.nu.i(new com.amazon.aps.iva.qu.b(talkboxService));
    }
}
