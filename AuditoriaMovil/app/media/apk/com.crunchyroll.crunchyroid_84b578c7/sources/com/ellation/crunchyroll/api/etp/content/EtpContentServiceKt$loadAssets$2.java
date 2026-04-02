package com.ellation.crunchyroll.api.etp.content;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.List;
import kotlin.Metadata;
/* compiled from: EtpContentService.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt$loadAssets$2", f = "EtpContentService.kt", l = {414, 415}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EtpContentServiceKt$loadAssets$2 extends i implements p<g0, d<? super List<? extends PlayableAsset>>, Object> {
    final /* synthetic */ String $containerId;
    final /* synthetic */ t $resourceType;
    final /* synthetic */ String $seasonId;
    final /* synthetic */ EtpContentService $this_loadAssets;
    int label;

    /* compiled from: EtpContentService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.EPISODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.SERIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.MOVIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.MOVIE_LISTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpContentServiceKt$loadAssets$2(t tVar, EtpContentService etpContentService, String str, String str2, d<? super EtpContentServiceKt$loadAssets$2> dVar) {
        super(2, dVar);
        this.$resourceType = tVar;
        this.$this_loadAssets = etpContentService;
        this.$seasonId = str;
        this.$containerId = str2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new EtpContentServiceKt$loadAssets$2(this.$resourceType, this.$this_loadAssets, this.$seasonId, this.$containerId, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super List<? extends PlayableAsset>> dVar) {
        return ((EtpContentServiceKt$loadAssets$2) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    x.i0(obj);
                    return ((ContentApiResponse) obj).getData();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.i0(obj);
            return ((ContentApiResponse) obj).getData();
        }
        x.i0(obj);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.$resourceType.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                t tVar = this.$resourceType;
                throw new IllegalArgumentException("Unsupported ResourceType: " + tVar);
            }
            EtpContentService etpContentService = this.$this_loadAssets;
            String str = this.$containerId;
            this.label = 2;
            obj = etpContentService.getMovies(str, this);
            if (obj == aVar) {
                return aVar;
            }
            return ((ContentApiResponse) obj).getData();
        }
        EtpContentService etpContentService2 = this.$this_loadAssets;
        String str2 = this.$seasonId;
        j.c(str2);
        this.label = 1;
        obj = etpContentService2.getEpisodes(str2, this);
        if (obj == aVar) {
            return aVar;
        }
        return ((ContentApiResponse) obj).getData();
    }
}
