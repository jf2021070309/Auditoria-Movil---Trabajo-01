package com.amazon.aps.iva.b10;

import com.amazon.aps.iva.yb0.d0;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.presentation.download.notification.SummaryNotificationHandlerImpl;
import java.util.List;
/* compiled from: SummaryNotificationHandler.kt */
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends String>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ SummaryNotificationHandlerImpl h;
    public final /* synthetic */ Episode i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(SummaryNotificationHandlerImpl summaryNotificationHandlerImpl, Episode episode, boolean z) {
        super(1);
        this.h = summaryNotificationHandlerImpl;
        this.i = episode;
        this.j = z;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends String> list) {
        List<? extends String> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "seasonQueue");
        Episode episode = this.i;
        SummaryNotificationHandlerImpl summaryNotificationHandlerImpl = this.h;
        u uVar = new u(list2, summaryNotificationHandlerImpl, episode);
        summaryNotificationHandlerImpl.getClass();
        d0 d0Var = new d0();
        d0 d0Var2 = new d0();
        d0 d0Var3 = new d0();
        t tVar = new t(d0Var, d0Var2, d0Var3, summaryNotificationHandlerImpl, episode, uVar);
        String parentId = episode.getParentId();
        String seasonId = episode.getSeasonId();
        boolean z = this.j;
        summaryNotificationHandlerImpl.W2(parentId, seasonId, new q(d0Var, z, episode, tVar));
        summaryNotificationHandlerImpl.t8(episode.getParentId(), episode.getSeasonId(), new r(d0Var2, z, episode, tVar));
        summaryNotificationHandlerImpl.j8(episode.getParentId(), episode.getSeasonId(), new s(d0Var3, z, episode, tVar));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
