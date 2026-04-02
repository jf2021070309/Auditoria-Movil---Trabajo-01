package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ef.a;
import com.amazon.aps.iva.ez.b;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.controller.UIMediaControllerWrapper;
import com.ellation.crunchyroll.cast.skipnext.CastNextInteractor;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* compiled from: CastControllerViewModel.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b0\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0002J7\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$R(\u0010.\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010,0,0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010$¨\u00062"}, d2 = {"Lcom/ellation/crunchyroll/cast/expanded/CastControllerViewModelImpl;", "Lcom/amazon/aps/iva/ez/b;", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerViewModel;", "Lcom/amazon/aps/iva/kb0/q;", "preloadNextMediaInfo", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/amazon/aps/iva/i5/v;", "newValue", "Lkotlin/Function0;", "onUpdated", "updateIfNeeded", "(Lcom/amazon/aps/iva/i5/v;Ljava/lang/Object;Lcom/amazon/aps/iva/xb0/a;)V", "onMetaDataUpdated", "loadNextEpisode", "Lcom/ellation/crunchyroll/cast/skipnext/CastNextInteractor;", "castNextInteractor", "Lcom/ellation/crunchyroll/cast/skipnext/CastNextInteractor;", "Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerWrapper;", "mediaController", "Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerWrapper;", "Lcom/amazon/aps/iva/ef/a;", "mediaLoader", "Lcom/amazon/aps/iva/ef/a;", "Lcom/amazon/aps/iva/se0/j1;", "nextMediaInfoJob", "Lcom/amazon/aps/iva/se0/j1;", "Lcom/ellation/crunchyroll/model/ContentContainer;", FirebaseAnalytics.Param.CONTENT, "Lcom/ellation/crunchyroll/model/ContentContainer;", "Lcom/ellation/crunchyroll/model/Episode;", "nextEpisode", "Lcom/ellation/crunchyroll/model/Episode;", "", "title", "Lcom/amazon/aps/iva/i5/v;", "getTitle", "()Lcom/amazon/aps/iva/i5/v;", MediaTrack.ROLE_SUBTITLE, "getSubtitle", "imageUrl", "getImageUrl", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "currentAsset", "getCurrentAsset", "", "kotlin.jvm.PlatformType", "skipButtonVisibility", "getSkipButtonVisibility", "<init>", "(Lcom/ellation/crunchyroll/cast/skipnext/CastNextInteractor;Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerWrapper;Lcom/amazon/aps/iva/ef/a;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastControllerViewModelImpl extends b implements CastControllerViewModel {
    private final CastNextInteractor castNextInteractor;
    private ContentContainer content;
    private final v<PlayableAsset> currentAsset;
    private final v<String> imageUrl;
    private final UIMediaControllerWrapper mediaController;
    private final a mediaLoader;
    private Episode nextEpisode;
    private j1 nextMediaInfoJob;
    private final v<Boolean> skipButtonVisibility;
    private final v<String> subtitle;
    private final v<String> title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastControllerViewModelImpl(CastNextInteractor castNextInteractor, UIMediaControllerWrapper uIMediaControllerWrapper, a aVar) {
        super(castNextInteractor);
        j.f(castNextInteractor, "castNextInteractor");
        j.f(uIMediaControllerWrapper, "mediaController");
        j.f(aVar, "mediaLoader");
        this.castNextInteractor = castNextInteractor;
        this.mediaController = uIMediaControllerWrapper;
        this.mediaLoader = aVar;
        this.title = new v<>();
        this.subtitle = new v<>();
        this.imageUrl = new v<>();
        this.currentAsset = new v<>();
        this.skipButtonVisibility = new v<>(Boolean.FALSE);
        onMetaDataUpdated();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void preloadNextMediaInfo() {
        Episode currentEpisode = this.mediaController.getCurrentEpisode();
        if (currentEpisode != null) {
            getSkipButtonVisibility().k(Boolean.FALSE);
            j1 j1Var = this.nextMediaInfoJob;
            if (j1Var != null) {
                j1Var.a(null);
            }
            this.nextMediaInfoJob = i.d(w.D(this), null, null, new CastControllerViewModelImpl$preloadNextMediaInfo$1$1(this, currentEpisode, null), 3);
        }
    }

    private final <T> void updateIfNeeded(v<T> vVar, T t, com.amazon.aps.iva.xb0.a<q> aVar) {
        if (!j.a(vVar.d(), t)) {
            vVar.k(t);
            aVar.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateIfNeeded$default(CastControllerViewModelImpl castControllerViewModelImpl, v vVar, Object obj, com.amazon.aps.iva.xb0.a aVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            aVar = CastControllerViewModelImpl$updateIfNeeded$1.INSTANCE;
        }
        castControllerViewModelImpl.updateIfNeeded(vVar, obj, aVar);
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerViewModel
    public void loadNextEpisode() {
        Episode episode = this.nextEpisode;
        if (episode != null) {
            a aVar = this.mediaLoader;
            ContentContainer contentContainer = this.content;
            if (contentContainer != null) {
                aVar.load(contentContainer, episode, 0L);
            } else {
                j.m(FirebaseAnalytics.Param.CONTENT);
                throw null;
            }
        }
        preloadNextMediaInfo();
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerViewModel
    public void onMetaDataUpdated() {
        String str;
        String str2;
        String str3;
        v<String> title = getTitle();
        String metadataString = this.mediaController.getMetadataString(MediaMetadata.KEY_TITLE);
        if (metadataString == null) {
            str = "";
        } else {
            str = metadataString;
        }
        updateIfNeeded$default(this, title, str, null, 2, null);
        v<String> subtitle = getSubtitle();
        String metadataString2 = this.mediaController.getMetadataString(MediaMetadata.KEY_SUBTITLE);
        if (metadataString2 == null) {
            str2 = "";
        } else {
            str2 = metadataString2;
        }
        updateIfNeeded$default(this, subtitle, str2, null, 2, null);
        v<String> imageUrl = getImageUrl();
        String str4 = (String) x.E0(this.mediaController.getImagesUrls());
        if (str4 == null) {
            str3 = "";
        } else {
            str3 = str4;
        }
        updateIfNeeded$default(this, imageUrl, str3, null, 2, null);
        PlayableAsset currentAsset = this.mediaController.getCurrentAsset();
        if (currentAsset != null) {
            updateIfNeeded(getCurrentAsset(), currentAsset, new CastControllerViewModelImpl$onMetaDataUpdated$1$1(this));
        }
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerViewModel
    public v<PlayableAsset> getCurrentAsset() {
        return this.currentAsset;
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerViewModel
    public v<String> getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerViewModel
    public v<Boolean> getSkipButtonVisibility() {
        return this.skipButtonVisibility;
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerViewModel
    public v<String> getSubtitle() {
        return this.subtitle;
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerViewModel
    public v<String> getTitle() {
        return this.title;
    }
}
