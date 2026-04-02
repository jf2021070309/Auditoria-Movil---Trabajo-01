package com.ellation.crunchyroll.cast.mini;

import com.amazon.aps.iva.at.a;
import com.amazon.aps.iva.wy.b;
import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.cast.stateoverlay.CastContentStateUiModel;
import com.ellation.crunchyroll.model.PlayableAsset;
import kotlin.Metadata;
/* compiled from: CastMiniContentStatePresenter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStatePresenterImpl;", "Lcom/amazon/aps/iva/wy/b;", "Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStateView;", "Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStatePresenter;", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "asset", "Lcom/amazon/aps/iva/kb0/q;", "bind", "Lcom/amazon/aps/iva/at/a;", "contentAvailabilityProvider", "Lcom/amazon/aps/iva/at/a;", "view", "<init>", "(Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStateView;Lcom/amazon/aps/iva/at/a;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class CastMiniContentStatePresenterImpl extends b<CastMiniContentStateView> implements CastMiniContentStatePresenter {
    private final a contentAvailabilityProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastMiniContentStatePresenterImpl(CastMiniContentStateView castMiniContentStateView, a aVar) {
        super(castMiniContentStateView, new j[0]);
        com.amazon.aps.iva.yb0.j.f(castMiniContentStateView, "view");
        com.amazon.aps.iva.yb0.j.f(aVar, "contentAvailabilityProvider");
        this.contentAvailabilityProvider = aVar;
    }

    @Override // com.ellation.crunchyroll.cast.mini.CastMiniContentStatePresenter
    public void bind(PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        String a = this.contentAvailabilityProvider.a(playableAsset);
        int hashCode = a.hashCode();
        if (hashCode != -665462704) {
            if (hashCode != -318452137) {
                if (hashCode == 1894333340 && a.equals("comingSoon")) {
                    getView().showContentState(CastContentStateUiModel.ComingSoon);
                    return;
                }
            } else if (a.equals("premium")) {
                getView().showContentState(CastContentStateUiModel.Premium);
                return;
            }
        } else if (a.equals("unavailable")) {
            getView().showContentState(CastContentStateUiModel.Unavailable);
            return;
        }
        getView().hideContentState();
    }
}
