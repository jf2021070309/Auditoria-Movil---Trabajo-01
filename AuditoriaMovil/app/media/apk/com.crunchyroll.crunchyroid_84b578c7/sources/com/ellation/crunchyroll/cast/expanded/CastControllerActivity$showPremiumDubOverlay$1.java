package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.fs.b;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.rf.c;
import com.amazon.aps.iva.rf.e;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: CastControllerActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/aps/iva/a1/f;", "modifier", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/amazon/aps/iva/a1/f;Lcom/amazon/aps/iva/o0/i;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastControllerActivity$showPremiumDubOverlay$1 extends l implements q<f, i, Integer, com.amazon.aps.iva.kb0.q> {
    final /* synthetic */ c $premiumDubFormatter;
    final /* synthetic */ com.amazon.aps.iva.rf.f $premiumDubUiModel;
    final /* synthetic */ CastControllerActivity this$0;

    /* compiled from: CastControllerActivity.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.ellation.crunchyroll.cast.expanded.CastControllerActivity$showPremiumDubOverlay$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class AnonymousClass1 extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<b, com.amazon.aps.iva.kb0.q> {
        public AnonymousClass1(Object obj) {
            super(1, obj, CastControllerPresenter.class, "onPremiumCtaClick", "onPremiumCtaClick(Lcom/ellation/analytics/helpers/AnalyticsClickedView;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(b bVar) {
            invoke2(bVar);
            return com.amazon.aps.iva.kb0.q.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(b bVar) {
            j.f(bVar, "p0");
            ((CastControllerPresenter) this.receiver).onPremiumCtaClick(bVar);
        }
    }

    /* compiled from: CastControllerActivity.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.ellation.crunchyroll.cast.expanded.CastControllerActivity$showPremiumDubOverlay$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class AnonymousClass2 extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public AnonymousClass2(Object obj) {
            super(1, obj, CastControllerPresenter.class, "onPlayFallbackAssetClick", "onPlayFallbackAssetClick(Ljava/lang/String;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(String str) {
            invoke2(str);
            return com.amazon.aps.iva.kb0.q.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            j.f(str, "p0");
            ((CastControllerPresenter) this.receiver).onPlayFallbackAssetClick(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastControllerActivity$showPremiumDubOverlay$1(com.amazon.aps.iva.rf.f fVar, c cVar, CastControllerActivity castControllerActivity) {
        super(3);
        this.$premiumDubUiModel = fVar;
        this.$premiumDubFormatter = cVar;
        this.this$0 = castControllerActivity;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(f fVar, i iVar, Integer num) {
        invoke(fVar, iVar, num.intValue());
        return com.amazon.aps.iva.kb0.q.a;
    }

    public final void invoke(f fVar, i iVar, int i) {
        CastControllerPresenter presenter;
        CastControllerPresenter presenter2;
        j.f(fVar, "modifier");
        if ((i & 14) == 0) {
            i |= iVar.H(fVar) ? 4 : 2;
        }
        if ((i & 91) == 18 && iVar.h()) {
            iVar.A();
            return;
        }
        e0.b bVar = e0.a;
        com.amazon.aps.iva.rf.f fVar2 = this.$premiumDubUiModel;
        c cVar = this.$premiumDubFormatter;
        presenter = this.this$0.getPresenter();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(presenter);
        presenter2 = this.this$0.getPresenter();
        e.a(fVar2, cVar, anonymousClass1, new AnonymousClass2(presenter2), fVar, iVar, 64 | ((i << 12) & 57344), 0);
    }
}
