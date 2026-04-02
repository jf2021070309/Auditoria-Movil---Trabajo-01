package com.amazon.aps.iva.l40;

import com.amazon.aps.iva.ez.g;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
/* compiled from: ShowPageActivity.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hg.e> {
    public final /* synthetic */ ShowPageActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ShowPageActivity showPageActivity) {
        super(0);
        this.h = showPageActivity;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.hg.e invoke() {
        g.c a;
        ShowPageActivity.a aVar = ShowPageActivity.K;
        ShowPageActivity showPageActivity = this.h;
        com.amazon.aps.iva.hg.g P = showPageActivity.ui().e().P();
        Season season = null;
        if (P == null) {
            return null;
        }
        T d = showPageActivity.ui().e().h0().d();
        com.amazon.aps.iva.yb0.j.c(d);
        g.c a2 = ((com.amazon.aps.iva.ez.g) d).a();
        com.amazon.aps.iva.yb0.j.c(a2);
        ContentContainer contentContainer = (ContentContainer) a2.a;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) showPageActivity.ui().e().q5().d();
        if (gVar != null && (a = gVar.a()) != null) {
            season = (Season) a.a;
        }
        return new com.amazon.aps.iva.hg.e(contentContainer, season, P);
    }
}
