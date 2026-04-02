package com.amazon.aps.iva.b10;

import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.presentation.download.notification.SummaryNotificationHandlerImpl;
import java.util.List;
/* compiled from: SummaryNotificationHandler.kt */
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<j, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ List<String> h;
    public final /* synthetic */ SummaryNotificationHandlerImpl i;
    public final /* synthetic */ Episode j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(List<String> list, SummaryNotificationHandlerImpl summaryNotificationHandlerImpl, Episode episode) {
        super(1);
        this.h = list;
        this.i = summaryNotificationHandlerImpl;
        this.j = episode;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(j jVar) {
        j jVar2 = jVar;
        com.amazon.aps.iva.yb0.j.f(jVar2, "data");
        boolean isEmpty = this.h.isEmpty();
        Episode episode = this.j;
        SummaryNotificationHandlerImpl summaryNotificationHandlerImpl = this.i;
        if (isEmpty) {
            summaryNotificationHandlerImpl.c.e(episode.getSeasonId().hashCode(), jVar2);
        } else if (jVar2.d != 0) {
            summaryNotificationHandlerImpl.c.e(episode.getSeasonId().hashCode(), jVar2);
        } else {
            summaryNotificationHandlerImpl.c.d(episode.getSeasonId().hashCode(), jVar2);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
