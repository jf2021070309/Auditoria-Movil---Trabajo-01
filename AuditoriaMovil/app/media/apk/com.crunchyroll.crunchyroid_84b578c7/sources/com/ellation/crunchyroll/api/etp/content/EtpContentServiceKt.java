package com.ellation.crunchyroll.api.etp.content;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.UpNext;
import java.util.List;
import kotlin.Metadata;
/* compiled from: EtpContentService.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0007\u001a7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;", "", "containerId", "Lcom/amazon/aps/iva/x50/t;", "resourceType", "Lcom/ellation/crunchyroll/model/ContentContainer;", "loadContentContainer", "(Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;Ljava/lang/String;Lcom/amazon/aps/iva/x50/t;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/amazon/aps/iva/jf0/a0;", "Lcom/ellation/crunchyroll/api/etp/content/ContentApiResponse;", "Lcom/ellation/crunchyroll/model/UpNext;", "Lcom/ellation/crunchyroll/api/etp/content/EmptyMeta;", "getContainerUpNext", "(Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;Lcom/amazon/aps/iva/x50/t;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "assetId", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "loadAsset", "seasonId", "", "loadAssets", "(Lcom/ellation/crunchyroll/api/etp/content/EtpContentService;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/x50/t;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "CONTENT_LIST_TIMEOUT_MS_HEADER", "Ljava/lang/String;", "api_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EtpContentServiceKt {
    private static final String CONTENT_LIST_TIMEOUT_MS_HEADER = "read_timeout: 30000";

    /* compiled from: EtpContentService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.SERIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.EPISODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.MOVIE_LISTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.MOVIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.SEASON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Object getContainerUpNext(EtpContentService etpContentService, t tVar, String str, d<? super a0<ContentApiResponse<UpNext, EmptyMeta>>> dVar) {
        int i = WhenMappings.$EnumSwitchMapping$0[tVar.ordinal()];
        if (i != 1) {
            if (i == 3) {
                return etpContentService.getUpNextMovie(str, dVar);
            }
            throw new IllegalArgumentException("Unsupported Panel type: " + tVar);
        }
        return etpContentService.getUpNextEpisode(str, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object loadAsset(com.ellation.crunchyroll.api.etp.content.EtpContentService r5, java.lang.String r6, com.amazon.aps.iva.x50.t r7, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.PlayableAsset> r8) {
        /*
            boolean r0 = r8 instanceof com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt$loadAsset$1
            if (r0 == 0) goto L13
            r0 = r8
            com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt$loadAsset$1 r0 = (com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt$loadAsset$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt$loadAsset$1 r0 = new com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt$loadAsset$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L7f
        L36:
            com.amazon.aps.iva.ab.x.i0(r8)
            int[] r8 = com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt.WhenMappings.$EnumSwitchMapping$0
            int r2 = r7.ordinal()
            r8 = r8[r2]
            if (r8 == r4) goto L76
            if (r8 == r3) goto L76
            r2 = 3
            if (r8 == r2) goto L60
            r2 = 4
            if (r8 != r2) goto L4c
            goto L60
        L4c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Unsupported ResourceType: "
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L60:
            r0.label = r3
            java.lang.Object r8 = r5.getMovie(r6, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r8 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r8
            java.util.List r5 = r8.getData()
            java.lang.Object r5 = com.amazon.aps.iva.lb0.x.t0(r5)
            com.ellation.crunchyroll.model.PlayableAsset r5 = (com.ellation.crunchyroll.model.PlayableAsset) r5
            goto L8b
        L76:
            r0.label = r4
            java.lang.Object r8 = r5.getEpisode(r6, r0)
            if (r8 != r1) goto L7f
            return r1
        L7f:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r8 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r8
            java.util.List r5 = r8.getData()
            java.lang.Object r5 = com.amazon.aps.iva.lb0.x.t0(r5)
            com.ellation.crunchyroll.model.PlayableAsset r5 = (com.ellation.crunchyroll.model.PlayableAsset) r5
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt.loadAsset(com.ellation.crunchyroll.api.etp.content.EtpContentService, java.lang.String, com.amazon.aps.iva.x50.t, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static final Object loadAssets(EtpContentService etpContentService, String str, String str2, t tVar, d<? super List<? extends PlayableAsset>> dVar) {
        return z.p(new EtpContentServiceKt$loadAssets$2(tVar, etpContentService, str2, str, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object loadContentContainer(com.ellation.crunchyroll.api.etp.content.EtpContentService r7, java.lang.String r8, com.amazon.aps.iva.x50.t r9, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.ContentContainer> r10) {
        /*
            boolean r0 = r10 instanceof com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt$loadContentContainer$1
            if (r0 == 0) goto L13
            r0 = r10
            com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt$loadContentContainer$1 r0 = (com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt$loadContentContainer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt$loadContentContainer$1 r0 = new com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt$loadContentContainer$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L49
            if (r2 == r6) goto L44
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L86
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.L$0
            com.ellation.crunchyroll.api.etp.content.EtpContentService r7 = (com.ellation.crunchyroll.api.etp.content.EtpContentService) r7
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L6a
        L40:
            com.amazon.aps.iva.ab.x.i0(r10)
            goto Lb0
        L44:
            com.amazon.aps.iva.ab.x.i0(r10)
            goto Lc6
        L49:
            com.amazon.aps.iva.ab.x.i0(r10)
            int[] r10 = com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt.WhenMappings.$EnumSwitchMapping$0
            int r2 = r9.ordinal()
            r10 = r10[r2]
            if (r10 == r6) goto Lbd
            if (r10 == r5) goto Lbd
            if (r10 == r4) goto La7
            if (r10 == r3) goto La7
            r2 = 5
            if (r10 != r2) goto L93
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r10 = r7.getSeason(r8, r0)
            if (r10 != r1) goto L6a
            return r1
        L6a:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r10 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r10
            java.util.List r8 = r10.getData()
            java.lang.Object r8 = com.amazon.aps.iva.lb0.x.t0(r8)
            com.ellation.crunchyroll.api.cms.model.Season r8 = (com.ellation.crunchyroll.api.cms.model.Season) r8
            java.lang.String r8 = r8.getSeriesId()
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r10 = r7.getSeries(r8, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r10 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r10
            java.util.List r7 = r10.getData()
            java.lang.Object r7 = com.amazon.aps.iva.lb0.x.t0(r7)
            com.ellation.crunchyroll.model.ContentContainer r7 = (com.ellation.crunchyroll.model.ContentContainer) r7
            goto Ld2
        L93:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Unsupported Panel type: "
            r8.<init>(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        La7:
            r0.label = r5
            java.lang.Object r10 = r7.getMovieListing(r8, r0)
            if (r10 != r1) goto Lb0
            return r1
        Lb0:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r10 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r10
            java.util.List r7 = r10.getData()
            java.lang.Object r7 = com.amazon.aps.iva.lb0.x.t0(r7)
            com.ellation.crunchyroll.model.ContentContainer r7 = (com.ellation.crunchyroll.model.ContentContainer) r7
            goto Ld2
        Lbd:
            r0.label = r6
            java.lang.Object r10 = r7.getSeries(r8, r0)
            if (r10 != r1) goto Lc6
            return r1
        Lc6:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r10 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r10
            java.util.List r7 = r10.getData()
            java.lang.Object r7 = com.amazon.aps.iva.lb0.x.t0(r7)
            com.ellation.crunchyroll.model.ContentContainer r7 = (com.ellation.crunchyroll.model.ContentContainer) r7
        Ld2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt.loadContentContainer(com.ellation.crunchyroll.api.etp.content.EtpContentService, java.lang.String, com.amazon.aps.iva.x50.t, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
