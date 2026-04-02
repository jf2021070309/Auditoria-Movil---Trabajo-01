package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.model.ContentContainer;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<ContentContainer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v vVar) {
        super(1);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(ContentContainer contentContainer) {
        ContentContainer contentContainer2 = contentContainer;
        com.amazon.aps.iva.yb0.j.f(contentContainer2, FirebaseAnalytics.Param.CONTENT);
        v vVar = this.h;
        vVar.l.a(contentContainer2.getId());
        boolean z = vVar.b;
        if (z) {
            v.q6(vVar).Sh(contentContainer2);
            v.q6(vVar).F9(contentContainer2);
        }
        v.q6(vVar).Ja(z, new com.amazon.aps.iva.bv.d(contentContainer2.getId(), contentContainer2.getTitle(), contentContainer2.getResourceType(), contentContainer2.getChannelId()));
        if (!z) {
            v.q6(vVar).f5(new com.amazon.aps.iva.kg.b(contentContainer2.getId(), contentContainer2.getResourceType()));
        }
        vVar.d.c1(contentContainer2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
