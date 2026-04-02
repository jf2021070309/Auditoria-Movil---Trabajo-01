package com.amazon.aps.iva.b10;

import com.amazon.aps.iva.yb0.d0;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.presentation.download.notification.SummaryNotificationHandlerImpl;
import java.util.List;
/* compiled from: SummaryNotificationHandler.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ d0<List<PlayableAsset>> h;
    public final /* synthetic */ d0<List<PlayableAsset>> i;
    public final /* synthetic */ d0<List<PlayableAsset>> j;
    public final /* synthetic */ SummaryNotificationHandlerImpl k;
    public final /* synthetic */ Episode l;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<j, com.amazon.aps.iva.kb0.q> m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(d0 d0Var, d0 d0Var2, d0 d0Var3, SummaryNotificationHandlerImpl summaryNotificationHandlerImpl, Episode episode, u uVar) {
        super(0);
        this.h = d0Var;
        this.i = d0Var2;
        this.j = d0Var3;
        this.k = summaryNotificationHandlerImpl;
        this.l = episode;
        this.m = uVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        d0<List<PlayableAsset>> d0Var = this.h;
        if (d0Var.b != null) {
            d0<List<PlayableAsset>> d0Var2 = this.i;
            if (d0Var2.b != null) {
                d0<List<PlayableAsset>> d0Var3 = this.j;
                if (d0Var3.b != null) {
                    Episode episode = this.l;
                    int m7 = this.k.m7(episode.getParentId(), episode.getSeasonId());
                    Episode episode2 = this.l;
                    List<PlayableAsset> list = d0Var.b;
                    com.amazon.aps.iva.yb0.j.c(list);
                    int size = list.size();
                    List<PlayableAsset> list2 = d0Var2.b;
                    com.amazon.aps.iva.yb0.j.c(list2);
                    int size2 = list2.size();
                    List<PlayableAsset> list3 = d0Var3.b;
                    com.amazon.aps.iva.yb0.j.c(list3);
                    this.m.invoke(new j(episode2, size, m7, size2, list3.size()));
                }
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
