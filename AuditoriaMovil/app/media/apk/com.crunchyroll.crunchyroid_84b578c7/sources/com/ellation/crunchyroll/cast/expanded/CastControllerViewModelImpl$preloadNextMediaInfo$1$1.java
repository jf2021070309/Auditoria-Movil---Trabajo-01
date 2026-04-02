package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.cast.skipnext.CastNextInteractor;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Episode;
import kotlin.Metadata;
/* compiled from: CastControllerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.cast.expanded.CastControllerViewModelImpl$preloadNextMediaInfo$1$1", f = "CastControllerViewModel.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CastControllerViewModelImpl$preloadNextMediaInfo$1$1 extends i implements p<g0, d<? super q>, Object> {
    final /* synthetic */ Episode $it;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CastControllerViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastControllerViewModelImpl$preloadNextMediaInfo$1$1(CastControllerViewModelImpl castControllerViewModelImpl, Episode episode, d<? super CastControllerViewModelImpl$preloadNextMediaInfo$1$1> dVar) {
        super(2, dVar);
        this.this$0 = castControllerViewModelImpl;
        this.$it = episode;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        CastControllerViewModelImpl$preloadNextMediaInfo$1$1 castControllerViewModelImpl$preloadNextMediaInfo$1$1 = new CastControllerViewModelImpl$preloadNextMediaInfo$1$1(this.this$0, this.$it, dVar);
        castControllerViewModelImpl$preloadNextMediaInfo$1$1.L$0 = obj;
        return castControllerViewModelImpl$preloadNextMediaInfo$1$1;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((CastControllerViewModelImpl$preloadNextMediaInfo$1$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object H;
        CastNextInteractor castNextInteractor;
        CastControllerViewModelImpl castControllerViewModelImpl;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    castControllerViewModelImpl = (CastControllerViewModelImpl) this.L$0;
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                g0 g0Var = (g0) this.L$0;
                CastControllerViewModelImpl castControllerViewModelImpl2 = this.this$0;
                Episode episode = this.$it;
                castNextInteractor = castControllerViewModelImpl2.castNextInteractor;
                this.L$0 = castControllerViewModelImpl2;
                this.label = 1;
                Object preloadNextEpisodeData = castNextInteractor.preloadNextEpisodeData(episode, this);
                if (preloadNextEpisodeData == aVar) {
                    return aVar;
                }
                castControllerViewModelImpl = castControllerViewModelImpl2;
                obj = preloadNextEpisodeData;
            }
            j jVar = (j) obj;
            castControllerViewModelImpl.content = (ContentContainer) jVar.b;
            castControllerViewModelImpl.nextEpisode = (Episode) jVar.c;
            H = q.a;
        } catch (Throwable th) {
            H = x.H(th);
        }
        CastControllerViewModelImpl castControllerViewModelImpl3 = this.this$0;
        if (!(H instanceof k.a)) {
            q qVar = (q) H;
            castControllerViewModelImpl3.getSkipButtonVisibility().k(Boolean.TRUE);
        }
        k.a(H);
        return q.a;
    }
}
