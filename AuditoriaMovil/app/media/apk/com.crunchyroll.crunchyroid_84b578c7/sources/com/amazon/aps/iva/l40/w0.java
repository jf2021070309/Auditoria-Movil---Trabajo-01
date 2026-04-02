package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.model.ContentContainer;
import java.util.List;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class w0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;
    public final /* synthetic */ ContentContainer i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(v vVar, ContentContainer contentContainer) {
        super(0);
        this.h = vVar;
        this.i = contentContainer;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        com.amazon.aps.iva.oh.g gVar = this.h.n;
        ContentContainer contentContainer = this.i;
        List J = com.amazon.aps.iva.ee0.f1.J(new com.amazon.aps.iva.nz.a("", contentContainer.getId()));
        com.amazon.aps.iva.xb0.l lVar = com.amazon.aps.iva.e.w.e;
        if (lVar != null) {
            gVar.H8(new com.amazon.aps.iva.oh.a(J, new com.amazon.aps.iva.ks.e(com.amazon.aps.iva.us.s.a(contentContainer.getChannelId(), lVar), com.amazon.aps.iva.us.s.e(contentContainer.getId(), contentContainer.getResourceType()), contentContainer.getId(), "", contentContainer.getTitle(), null, null, null, 480)));
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("getChannelById");
        throw null;
    }
}
