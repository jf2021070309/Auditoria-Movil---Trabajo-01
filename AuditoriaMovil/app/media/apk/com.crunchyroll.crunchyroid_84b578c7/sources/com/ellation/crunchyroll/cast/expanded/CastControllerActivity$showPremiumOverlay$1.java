package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.fs.b;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.qf.c;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: CastControllerActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/aps/iva/a1/f;", "modifier", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/amazon/aps/iva/a1/f;Lcom/amazon/aps/iva/o0/i;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastControllerActivity$showPremiumOverlay$1 extends l implements q<f, i, Integer, com.amazon.aps.iva.kb0.q> {
    final /* synthetic */ CastControllerActivity this$0;

    /* compiled from: CastControllerActivity.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.ellation.crunchyroll.cast.expanded.CastControllerActivity$showPremiumOverlay$1$1  reason: invalid class name */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastControllerActivity$showPremiumOverlay$1(CastControllerActivity castControllerActivity) {
        super(3);
        this.this$0 = castControllerActivity;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(f fVar, i iVar, Integer num) {
        invoke(fVar, iVar, num.intValue());
        return com.amazon.aps.iva.kb0.q.a;
    }

    public final void invoke(f fVar, i iVar, int i) {
        CastControllerPresenter presenter;
        j.f(fVar, "modifier");
        if ((i & 14) == 0) {
            i |= iVar.H(fVar) ? 4 : 2;
        }
        if ((i & 91) == 18 && iVar.h()) {
            iVar.A();
            return;
        }
        e0.b bVar = e0.a;
        com.amazon.aps.iva.qf.b bVar2 = new com.amazon.aps.iva.qf.b(R.string.premium_overlay_title, R.string.premium_overlay_episodes_subtitle, R.string.premium_overlay_cta_text);
        presenter = this.this$0.getPresenter();
        c.a(bVar2, new AnonymousClass1(presenter), fVar, iVar, 0 | ((i << 6) & 896), 0);
    }
}
