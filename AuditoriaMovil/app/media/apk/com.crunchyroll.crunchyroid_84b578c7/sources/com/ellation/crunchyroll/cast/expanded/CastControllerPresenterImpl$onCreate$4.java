package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
import kotlin.Metadata;
/* compiled from: CastControllerPresenter.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class CastControllerPresenterImpl$onCreate$4 extends i implements l<PlayableAsset, q> {
    public CastControllerPresenterImpl$onCreate$4(Object obj) {
        super(1, obj, CastControllerPresenterImpl.class, "bindCastContentStateLayer", "bindCastContentStateLayer(Lcom/ellation/crunchyroll/model/PlayableAsset;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(PlayableAsset playableAsset) {
        invoke2(playableAsset);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PlayableAsset playableAsset) {
        j.f(playableAsset, "p0");
        ((CastControllerPresenterImpl) this.receiver).bindCastContentStateLayer(playableAsset);
    }
}
