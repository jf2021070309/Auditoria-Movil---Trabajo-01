package com.ellation.crunchyroll.cast.expanded;

import androidx.lifecycle.p;
import com.amazon.aps.iva.mt.m;
import com.amazon.aps.iva.mt.n;
import com.amazon.aps.iva.mt.o;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.cast.CastFeature;
import com.ellation.crunchyroll.cast.CastMediaProvider;
import com.ellation.crunchyroll.cast.controller.UIMediaControllerWrapper;
import com.ellation.crunchyroll.cast.session.CastMediaLoaderInternal;
import com.ellation.crunchyroll.cast.skipnext.CastNextInteractor;
import kotlin.Metadata;
/* compiled from: CastControllerActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerViewModelImpl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CastControllerActivity$viewModel$2 extends l implements a<CastControllerViewModelImpl> {
    final /* synthetic */ CastControllerActivity this$0;

    /* compiled from: CastControllerActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/p;", "it", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerViewModelImpl;", "invoke", "(Landroidx/lifecycle/p;)Lcom/ellation/crunchyroll/cast/expanded/CastControllerViewModelImpl;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.cast.expanded.CastControllerActivity$viewModel$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends l implements com.amazon.aps.iva.xb0.l<p, CastControllerViewModelImpl> {
        final /* synthetic */ CastControllerActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CastControllerActivity castControllerActivity) {
            super(1);
            this.this$0 = castControllerActivity;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CastControllerViewModelImpl invoke(p pVar) {
            m mVar;
            j.f(pVar, "it");
            CastNextInteractor.Companion companion = CastNextInteractor.Companion;
            CastFeature.Companion companion2 = CastFeature.Companion;
            CastNextInteractor create = companion.create(companion2.getDependencies$cast_release().getNextAssetInteractor(), companion2.getDependencies$cast_release().getContentService());
            UIMediaControllerWrapper create2 = UIMediaControllerWrapper.Companion.create(this.this$0.getUIMediaController());
            CastMediaLoaderInternal.Companion companion3 = CastMediaLoaderInternal.Companion;
            CastMediaProvider.Companion companion4 = CastMediaProvider.Companion;
            int i = n.a;
            CastControllerActivity castControllerActivity = this.this$0;
            if (true && true) {
                int i2 = com.amazon.aps.iva.mt.l.a;
                j.f(castControllerActivity, "context");
                mVar = new m(castControllerActivity);
            } else {
                mVar = null;
            }
            j.f(castControllerActivity, "context");
            j.f(mVar, "seasonAndEpisodeFormatter");
            return new CastControllerViewModelImpl(create, create2, CastMediaLoaderInternal.Companion.create$default(companion3, CastMediaProvider.Companion.create$default(companion4, new o(castControllerActivity, mVar), null, null, 6, null), null, 2, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastControllerActivity$viewModel$2(CastControllerActivity castControllerActivity) {
        super(0);
        this.this$0 = castControllerActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final CastControllerViewModelImpl invoke() {
        CastControllerActivity castControllerActivity = this.this$0;
        return (CastControllerViewModelImpl) com.amazon.aps.iva.ez.l.a(castControllerActivity, CastControllerViewModelImpl.class, new AnonymousClass1(castControllerActivity));
    }
}
