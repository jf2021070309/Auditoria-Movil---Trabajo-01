package com.ellation.crunchyroll.cast.mini;

import com.amazon.aps.iva.wy.b;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.ye.i;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CastMiniControllerPresenter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerPresenterImpl;", "Lcom/amazon/aps/iva/wy/b;", "Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerView;", "Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerPresenter;", "Lcom/amazon/aps/iva/kb0/q;", "onInit", "Lcom/amazon/aps/iva/ye/i;", "playServicesStatusChecker", "Lcom/amazon/aps/iva/ye/i;", "view", "<init>", "(Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerView;Lcom/amazon/aps/iva/ye/i;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastMiniControllerPresenterImpl extends b<CastMiniControllerView> implements CastMiniControllerPresenter {
    private final i playServicesStatusChecker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastMiniControllerPresenterImpl(CastMiniControllerView castMiniControllerView, i iVar) {
        super(castMiniControllerView, new j[0]);
        com.amazon.aps.iva.yb0.j.f(castMiniControllerView, "view");
        com.amazon.aps.iva.yb0.j.f(iVar, "playServicesStatusChecker");
        this.playServicesStatusChecker = iVar;
    }

    @Override // com.ellation.crunchyroll.cast.mini.CastMiniControllerPresenter
    public void onInit() {
        if (this.playServicesStatusChecker.isCastApiAvailable()) {
            getView().enableCastMiniController();
        }
    }
}
