package com.ellation.crunchyroll.cast.skipnext;

import com.amazon.aps.iva.wy.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CastNextInteractor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/ellation/crunchyroll/cast/skipnext/CastNextInteractorImpl;", "Lcom/amazon/aps/iva/wy/a;", "Lcom/ellation/crunchyroll/cast/skipnext/CastNextInteractor;", "Lcom/ellation/crunchyroll/model/Episode;", "episode", "Lcom/amazon/aps/iva/kb0/j;", "Lcom/ellation/crunchyroll/model/ContentContainer;", "preloadNextEpisodeData", "(Lcom/ellation/crunchyroll/model/Episode;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/amazon/aps/iva/bf/a;", "nextAssetInteractor", "Lcom/amazon/aps/iva/bf/a;", "Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "contentService", "Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "<init>", "(Lcom/amazon/aps/iva/bf/a;Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastNextInteractorImpl extends a implements CastNextInteractor {
    private final EtpContentService contentService;
    private final com.amazon.aps.iva.bf.a nextAssetInteractor;

    public CastNextInteractorImpl(com.amazon.aps.iva.bf.a aVar, EtpContentService etpContentService) {
        j.f(aVar, "nextAssetInteractor");
        j.f(etpContentService, "contentService");
        this.nextAssetInteractor = aVar;
        this.contentService = etpContentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    @Override // com.ellation.crunchyroll.cast.skipnext.CastNextInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object preloadNextEpisodeData(com.ellation.crunchyroll.model.Episode r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.j<? extends com.ellation.crunchyroll.model.ContentContainer, com.ellation.crunchyroll.model.Episode>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.ellation.crunchyroll.cast.skipnext.CastNextInteractorImpl$preloadNextEpisodeData$1
            if (r0 == 0) goto L13
            r0 = r9
            com.ellation.crunchyroll.cast.skipnext.CastNextInteractorImpl$preloadNextEpisodeData$1 r0 = (com.ellation.crunchyroll.cast.skipnext.CastNextInteractorImpl$preloadNextEpisodeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.ellation.crunchyroll.cast.skipnext.CastNextInteractorImpl$preloadNextEpisodeData$1 r0 = new com.ellation.crunchyroll.cast.skipnext.CastNextInteractorImpl$preloadNextEpisodeData$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r8 = r0.L$0
            com.ellation.crunchyroll.model.ContentContainer r8 = (com.ellation.crunchyroll.model.ContentContainer) r8
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L74
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.L$1
            com.ellation.crunchyroll.model.Episode r8 = (com.ellation.crunchyroll.model.Episode) r8
            java.lang.Object r2 = r0.L$0
            com.ellation.crunchyroll.cast.skipnext.CastNextInteractorImpl r2 = (com.ellation.crunchyroll.cast.skipnext.CastNextInteractorImpl) r2
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L5b
        L42:
            com.amazon.aps.iva.ab.x.i0(r9)
            com.ellation.crunchyroll.api.etp.content.EtpContentService r9 = r7.contentService
            java.lang.String r2 = r8.getParentId()
            com.amazon.aps.iva.x50.t r5 = com.amazon.aps.iva.x50.t.SERIES
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt.loadContentContainer(r9, r2, r5, r0)
            if (r9 != r1) goto L5a
            return r1
        L5a:
            r2 = r7
        L5b:
            com.ellation.crunchyroll.model.ContentContainer r9 = (com.ellation.crunchyroll.model.ContentContainer) r9
            com.amazon.aps.iva.bf.a r2 = r2.nextAssetInteractor
            java.lang.String r8 = r8.getId()
            r0.L$0 = r9
            r4 = 0
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r8 = r2.c(r8, r0)
            if (r8 != r1) goto L71
            return r1
        L71:
            r6 = r9
            r9 = r8
            r8 = r6
        L74:
            com.amazon.aps.iva.yb0.j.c(r9)
            com.ellation.crunchyroll.model.Episode r9 = (com.ellation.crunchyroll.model.Episode) r9
            com.amazon.aps.iva.kb0.j r0 = new com.amazon.aps.iva.kb0.j
            r0.<init>(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.cast.skipnext.CastNextInteractorImpl.preloadNextEpisodeData(com.ellation.crunchyroll.model.Episode, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
