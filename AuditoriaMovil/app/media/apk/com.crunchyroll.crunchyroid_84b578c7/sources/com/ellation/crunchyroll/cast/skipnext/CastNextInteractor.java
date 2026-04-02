package com.ellation.crunchyroll.cast.skipnext;

import com.amazon.aps.iva.bf.a;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Episode;
import kotlin.Metadata;
/* compiled from: CastNextInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/cast/skipnext/CastNextInteractor;", "Lcom/amazon/aps/iva/wy/j;", "Lcom/ellation/crunchyroll/model/Episode;", "episode", "Lcom/amazon/aps/iva/kb0/j;", "Lcom/ellation/crunchyroll/model/ContentContainer;", "preloadNextEpisodeData", "(Lcom/ellation/crunchyroll/model/Episode;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastNextInteractor extends j {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastNextInteractor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/cast/skipnext/CastNextInteractor$Companion;", "", "Lcom/amazon/aps/iva/bf/a;", "nextAssetInteractor", "Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "contentService", "Lcom/ellation/crunchyroll/cast/skipnext/CastNextInteractor;", "create", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CastNextInteractor create(a aVar, EtpContentService etpContentService) {
            com.amazon.aps.iva.yb0.j.f(aVar, "nextAssetInteractor");
            com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
            return new CastNextInteractorImpl(aVar, etpContentService);
        }
    }

    /* compiled from: CastNextInteractor.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void cancelRunningApiCalls(CastNextInteractor castNextInteractor) {
        }
    }

    @Override // com.amazon.aps.iva.wy.j
    /* synthetic */ void cancelRunningApiCalls();

    Object preloadNextEpisodeData(Episode episode, d<? super com.amazon.aps.iva.kb0.j<? extends ContentContainer, Episode>> dVar);
}
