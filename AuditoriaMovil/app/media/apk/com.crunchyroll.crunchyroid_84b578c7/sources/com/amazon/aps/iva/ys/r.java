package com.amazon.aps.iva.ys;

import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: UserInteractionTrackerConfig.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ms.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<s, com.amazon.aps.iva.kb0.q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(CrunchyrollApplication.f fVar) {
        super(1);
        this.h = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ms.a aVar) {
        com.amazon.aps.iva.ms.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "appConfig");
        Object c = aVar2.c(s.class, "user_interactions_tracking");
        if (c != null) {
            this.h.invoke((s) c);
            return com.amazon.aps.iva.kb0.q.a;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.application.UserInteractionTrackerConfig");
    }
}
