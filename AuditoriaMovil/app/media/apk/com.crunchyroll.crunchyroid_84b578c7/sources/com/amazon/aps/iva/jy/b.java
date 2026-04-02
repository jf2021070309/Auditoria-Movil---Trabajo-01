package com.amazon.aps.iva.jy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.iy.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mt.l;
import com.amazon.aps.iva.mt.m;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.ot.a;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
/* compiled from: EpisodesCarouselItemDelegate.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.jy.a<a> {
    public final com.amazon.aps.iva.ws.d a;
    public final l b;
    public final DurationFormatter c;
    public final com.amazon.aps.iva.k50.e d;
    public final com.amazon.aps.iva.rt.b e;
    public final int f;

    /* compiled from: EpisodesCarouselItemDelegate.kt */
    /* loaded from: classes2.dex */
    public final class a extends g {

        /* compiled from: EpisodesCarouselItemDelegate.kt */
        /* renamed from: com.amazon.aps.iva.jy.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0425a extends com.amazon.aps.iva.yb0.l implements p<i, Integer, q> {
            public final /* synthetic */ b h;
            public final /* synthetic */ Panel i;
            public final /* synthetic */ com.amazon.aps.iva.jt.a j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0425a(b bVar, Panel panel, com.amazon.aps.iva.jt.a aVar) {
                super(2);
                this.h = bVar;
                this.i = panel;
                this.j = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final q invoke(i iVar, Integer num) {
                String str;
                String str2;
                i iVar2 = iVar;
                if ((num.intValue() & 11) == 2 && iVar2.h()) {
                    iVar2.A();
                } else {
                    e0.b bVar = e0.a;
                    b bVar2 = this.h;
                    com.amazon.aps.iva.rt.b bVar3 = bVar2.e;
                    bVar3.getClass();
                    Panel panel = this.i;
                    j.f(panel, "panel");
                    String id = panel.getId();
                    String title = panel.getTitle();
                    String parentTitle = panel.getEpisodeMetadata().getParentTitle();
                    String seasonNumber = panel.getEpisodeMetadata().getSeasonNumber();
                    if (seasonNumber == null) {
                        str = "";
                    } else {
                        str = seasonNumber;
                    }
                    String episodeNumber = panel.getEpisodeMetadata().getEpisodeNumber();
                    if (episodeNumber == null) {
                        str2 = "";
                    } else {
                        str2 = episodeNumber;
                    }
                    com.amazon.aps.iva.rt.a aVar = new com.amazon.aps.iva.rt.a(id, title, parentTitle, str, str2, panel.getEpisodeMetadata().getDurationMs(), x.m0(panel.getThumbnails()), LabelUiModelKt.toLabelUiModel$default(panel, false, 1, null), a.c.a(bVar3.a.e(panel)));
                    l lVar = bVar2.b;
                    DurationFormatter durationFormatter = bVar2.c;
                    com.amazon.aps.iva.k50.e eVar = bVar2.d;
                    j.f(eVar, "panelContentRouter");
                    com.amazon.aps.iva.ws.d dVar = bVar2.a;
                    j.f(dVar, "panelAnalytics");
                    com.amazon.aps.iva.jt.a aVar2 = this.j;
                    j.f(aVar2, "feedAnalyticsData");
                    com.amazon.aps.iva.rt.e.a(aVar, new com.amazon.aps.iva.rt.d(panel, eVar, dVar, aVar2), lVar, durationFormatter, null, iVar2, Image.$stable | LabelUiModel.$stable | 0 | 4608, 16);
                }
                return q.a;
            }
        }

        public a(ComposeView composeView) {
            super(composeView);
        }

        @Override // com.amazon.aps.iva.iy.g
        public final void U2(Panel panel, com.amazon.aps.iva.jt.a aVar) {
            b1(panel, aVar);
        }

        @Override // com.amazon.aps.iva.iy.g
        public final void b1(Panel panel, com.amazon.aps.iva.jt.a aVar) {
            View view = this.itemView;
            j.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
            ((ComposeView) view).setContent(com.amazon.aps.iva.v0.b.c(-1835919855, new C0425a(b.this, panel, aVar), true));
        }
    }

    public b(com.amazon.aps.iva.ws.d dVar, m mVar, DurationFormatter durationFormatter, com.amazon.aps.iva.k50.e eVar, com.amazon.aps.iva.rt.b bVar) {
        j.f(durationFormatter, "durationFormatter");
        j.f(eVar, "panelContentRouter");
        this.a = dVar;
        this.b = mVar;
        this.c = durationFormatter;
        this.d = eVar;
        this.e = bVar;
        this.f = 112;
    }

    @Override // com.amazon.aps.iva.jy.a
    public final int a() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.jy.a
    public final a b(ViewGroup viewGroup) {
        j.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        j.e(context, "parent.context");
        return new a(new ComposeView(context, null, 6));
    }
}
