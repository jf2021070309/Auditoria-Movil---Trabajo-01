package com.amazon.aps.iva.w40;

import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.model.SeasonListContainerKt;
import com.ellation.crunchyroll.model.simulcast.SimulcastSeason;
import java.io.IOException;
import java.util.List;
/* compiled from: SimulcastSeasonsInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.simulcast.SimulcastSeasonsInteractorImpl$getSeasons$1", f = "SimulcastSeasonsInteractor.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ l0 i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<SimulcastSeason>, com.amazon.aps.iva.kb0.q> j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(l0 l0Var, com.amazon.aps.iva.xb0.l<? super List<SimulcastSeason>, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar2, com.amazon.aps.iva.ob0.d<? super k0> dVar) {
        super(2, dVar);
        this.i = l0Var;
        this.j = lVar;
        this.k = lVar2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new k0(this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((k0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        List<SimulcastSeason> simulcastSeasons;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        try {
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                EtpContentService etpContentService = this.i.b;
                this.h = 1;
                obj = etpContentService.getSeasonList(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            simulcastSeasons = SeasonListContainerKt.toSimulcastSeasons(((ContentApiResponse) obj).getData());
        } catch (IOException e) {
            this.k.invoke(e);
        }
        if (!simulcastSeasons.isEmpty()) {
            this.j.invoke(simulcastSeasons);
            return com.amazon.aps.iva.kb0.q.a;
        }
        throw new IOException("Simulcast seasons cannot be empty");
    }
}
