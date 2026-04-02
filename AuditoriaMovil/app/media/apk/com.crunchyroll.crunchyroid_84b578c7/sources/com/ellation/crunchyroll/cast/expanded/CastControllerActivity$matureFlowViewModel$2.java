package com.ellation.crunchyroll.cast.expanded;

import androidx.lifecycle.p;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.cast.CastFeature;
import com.ellation.crunchyroll.cast.expanded.mature.ChromecastMatureFlowViewModelImpl;
import kotlin.Metadata;
/* compiled from: CastControllerActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ellation/crunchyroll/cast/expanded/mature/ChromecastMatureFlowViewModelImpl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CastControllerActivity$matureFlowViewModel$2 extends l implements a<ChromecastMatureFlowViewModelImpl> {
    final /* synthetic */ CastControllerActivity this$0;

    /* compiled from: CastControllerActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/p;", "it", "Lcom/ellation/crunchyroll/cast/expanded/mature/ChromecastMatureFlowViewModelImpl;", "invoke", "(Landroidx/lifecycle/p;)Lcom/ellation/crunchyroll/cast/expanded/mature/ChromecastMatureFlowViewModelImpl;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.cast.expanded.CastControllerActivity$matureFlowViewModel$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends l implements com.amazon.aps.iva.xb0.l<p, ChromecastMatureFlowViewModelImpl> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final ChromecastMatureFlowViewModelImpl invoke(p pVar) {
            j.f(pVar, "it");
            return new ChromecastMatureFlowViewModelImpl(CastFeature.Companion.getDependencies$cast_release().getMaturePreferenceInteractor());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastControllerActivity$matureFlowViewModel$2(CastControllerActivity castControllerActivity) {
        super(0);
        this.this$0 = castControllerActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final ChromecastMatureFlowViewModelImpl invoke() {
        return (ChromecastMatureFlowViewModelImpl) com.amazon.aps.iva.ez.l.a(this.this$0, ChromecastMatureFlowViewModelImpl.class, AnonymousClass1.INSTANCE);
    }
}
