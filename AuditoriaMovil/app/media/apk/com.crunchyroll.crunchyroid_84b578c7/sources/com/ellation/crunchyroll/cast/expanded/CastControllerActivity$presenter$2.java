package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.at.c;
import com.amazon.aps.iva.gy.t;
import com.amazon.aps.iva.hl.w;
import com.amazon.aps.iva.jh.f;
import com.amazon.aps.iva.k50.g;
import com.amazon.aps.iva.kh.d;
import com.amazon.aps.iva.kh.e;
import com.amazon.aps.iva.rf.b;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.ye.h;
import com.ellation.crunchyroll.cast.CastFeature;
import com.ellation.crunchyroll.cast.expanded.CastControllerPresenter;
import com.ellation.crunchyroll.cast.expanded.mature.ChromecastMatureFlowViewModelImpl;
import com.ellation.crunchyroll.cast.stateoverlay.CastContentStateAnalytics;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CastControllerActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerPresenter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CastControllerActivity$presenter$2 extends l implements a<CastControllerPresenter> {
    final /* synthetic */ CastControllerActivity this$0;

    /* compiled from: CastControllerActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0001R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"com/ellation/crunchyroll/cast/expanded/CastControllerActivity$presenter$2$1", "Lcom/amazon/aps/iva/rf/b;", "Lcom/amazon/aps/iva/kh/e;", "", "systemLanguageTag", "getSupportedAudioLanguageTag", "language", "getTitleForLanguage", "getTruncatedTitleForLanguage", "", "Lcom/amazon/aps/iva/jh/f;", "getOptions", "()Ljava/util/List;", "options", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.cast.expanded.CastControllerActivity$presenter$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 implements b, e {
        private final /* synthetic */ e $$delegate_0;

        public AnonymousClass1(CastControllerActivity castControllerActivity) {
            d dVar = t.a;
            if (dVar != null) {
                this.$$delegate_0 = dVar.a(castControllerActivity);
            } else {
                j.m("instance");
                throw null;
            }
        }

        @Override // com.amazon.aps.iva.kh.e
        public List<f> getOptions() {
            return this.$$delegate_0.getOptions();
        }

        @Override // com.amazon.aps.iva.kh.e
        public String getSupportedAudioLanguageTag(String str) {
            j.f(str, "systemLanguageTag");
            return this.$$delegate_0.getSupportedAudioLanguageTag(str);
        }

        @Override // com.amazon.aps.iva.rf.b, com.amazon.aps.iva.kh.e
        public String getTitleForLanguage(String str) {
            j.f(str, "language");
            return this.$$delegate_0.getTitleForLanguage(str);
        }

        @Override // com.amazon.aps.iva.kh.e
        public String getTruncatedTitleForLanguage(String str) {
            j.f(str, "language");
            return this.$$delegate_0.getTruncatedTitleForLanguage(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastControllerActivity$presenter$2(CastControllerActivity castControllerActivity) {
        super(0);
        this.this$0 = castControllerActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final CastControllerPresenter invoke() {
        CastControllerViewModelImpl viewModel;
        ChromecastMatureFlowViewModelImpl matureFlowViewModel;
        CastControllerPresenter.Companion companion = CastControllerPresenter.Companion;
        viewModel = this.this$0.getViewModel();
        matureFlowViewModel = this.this$0.getMatureFlowViewModel();
        CastFeature.Companion companion2 = CastFeature.Companion;
        c cVar = new c(companion2.getDependencies$cast_release().getHasPremiumBenefit());
        boolean c = k.n(this.this$0).c();
        w a = companion2.getDependencies$cast_release().getPlayerFeature().a();
        CastContentStateAnalytics create = CastContentStateAnalytics.Companion.create(com.amazon.aps.iva.ds.c.b, companion2.getDependencies$cast_release().getHasPremiumBenefit());
        h versionsChromecastMessenger = companion2.getFeature$cast_release().getVersionsChromecastMessenger();
        com.amazon.aps.iva.tl.b g = companion2.getDependencies$cast_release().getPlayerFeature().g();
        com.amazon.aps.iva.k50.j createSubscriptionFlowRouter = companion2.getDependencies$cast_release().getRouters().createSubscriptionFlowRouter(this.this$0);
        g createSettingsRouter = companion2.getDependencies$cast_release().getRouters().createSettingsRouter(this.this$0);
        CastControllerActivity castControllerActivity = this.this$0;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(castControllerActivity);
        j.f(castControllerActivity, "context");
        return companion.create(this.this$0, viewModel, matureFlowViewModel, cVar, a, versionsChromecastMessenger, g, createSubscriptionFlowRouter, createSettingsRouter, new com.amazon.aps.iva.rf.d(castControllerActivity, anonymousClass1), c, create);
    }
}
