package com.amazon.aps.iva.hl;

import com.ellation.crunchyroll.api.etp.model.Image;
import java.util.List;
/* compiled from: RestrictionOverlayProvider.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.restrictionoverlay.RestrictionOverlayProviderImpl$getThumbnails$3", f = "RestrictionOverlayProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<List<? extends Image>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ k0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, com.amazon.aps.iva.ob0.d<? super j0> dVar) {
        super(2, dVar);
        this.i = k0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        j0 j0Var = new j0(this.i, dVar);
        j0Var.h = obj;
        return j0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(List<? extends Image> list, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((j0) create(list, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        this.i.f.setValue((List) this.h);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
