package com.ellation.crunchyroll.cast.session;

import com.amazon.aps.iva.ye.b;
import com.amazon.aps.iva.ye.j;
import com.ellation.crunchyroll.cast.CastMediaProvider;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CastMediaLoaderImpl.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ellation/crunchyroll/cast/session/CastMediaLoaderImpl;", "Lcom/ellation/crunchyroll/cast/session/CastMediaLoaderInternal;", "Lcom/ellation/crunchyroll/model/ContentContainer;", FirebaseAnalytics.Param.CONTENT, "Lcom/ellation/crunchyroll/model/PlayableAsset;", "asset", "", "playheadMs", "Lcom/amazon/aps/iva/kb0/q;", "load", "Lcom/ellation/crunchyroll/cast/CastMediaProvider;", "castMediaProvider", "Lcom/ellation/crunchyroll/cast/CastMediaProvider;", "Lcom/amazon/aps/iva/ye/j;", "sessionManagerProvider", "Lcom/amazon/aps/iva/ye/j;", "<init>", "(Lcom/ellation/crunchyroll/cast/CastMediaProvider;Lcom/amazon/aps/iva/ye/j;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastMediaLoaderImpl implements CastMediaLoaderInternal {
    private final CastMediaProvider castMediaProvider;
    private final j sessionManagerProvider;

    public CastMediaLoaderImpl(CastMediaProvider castMediaProvider, j jVar) {
        com.amazon.aps.iva.yb0.j.f(castMediaProvider, "castMediaProvider");
        com.amazon.aps.iva.yb0.j.f(jVar, "sessionManagerProvider");
        this.castMediaProvider = castMediaProvider;
        this.sessionManagerProvider = jVar;
    }

    @Override // com.ellation.crunchyroll.cast.session.CastMediaLoaderInternal, com.amazon.aps.iva.ef.a
    public void load(ContentContainer contentContainer, PlayableAsset playableAsset, long j) {
        com.amazon.aps.iva.yb0.j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        b castSession = this.sessionManagerProvider.getCastSession();
        if (castSession != null) {
            castSession.load(this.castMediaProvider.getAssetMediaInfo(contentContainer, playableAsset, j), this.castMediaProvider.getMediaLoadOptions(j));
        }
    }
}
