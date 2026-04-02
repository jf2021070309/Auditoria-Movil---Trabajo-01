package com.ellation.crunchyroll.ui.badges;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.cq.b;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.d0.d0;
import com.amazon.aps.iva.d0.d1;
import com.amazon.aps.iva.d0.g0;
import com.amazon.aps.iva.d0.q;
import com.amazon.aps.iva.d0.x;
import com.amazon.aps.iva.d0.z1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.pe0.a;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.ui.labels.LabelContentType;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
import com.ellation.crunchyroll.ui.labels.MaturityRatingType;
import kotlin.Metadata;
/* compiled from: CardBadges.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/amazon/aps/iva/o0/i;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CardBadgesKt$CardBadgesLayer$1 extends l implements p<i, Integer, q> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ LabelContentType $labelContentType;
    final /* synthetic */ MaturityRatingType $maturityRatingType;
    final /* synthetic */ f $modifier;
    final /* synthetic */ boolean $shouldAddMaturityRating;
    final /* synthetic */ boolean $shouldAddMovieBadge;
    final /* synthetic */ boolean $shouldAddNewBadge;
    final /* synthetic */ boolean $shouldAddNowPlayingBadge;
    final /* synthetic */ a<String> $statuses;

    /* compiled from: CardBadges.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/amazon/aps/iva/a2/c0;", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/amazon/aps/iva/a2/c0;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.ui.badges.CardBadgesKt$CardBadgesLayer$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ q invoke(c0 c0Var) {
            invoke2(c0Var);
            return q.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(c0 c0Var) {
            j.f(c0Var, "$this$semantics");
            y.e(c0Var, "card_badges");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBadgesKt$CardBadgesLayer$1(f fVar, MaturityRatingType maturityRatingType, boolean z, int i, boolean z2, LabelContentType labelContentType, boolean z3, boolean z4, a<String> aVar) {
        super(2);
        this.$modifier = fVar;
        this.$maturityRatingType = maturityRatingType;
        this.$shouldAddMaturityRating = z;
        this.$$dirty = i;
        this.$shouldAddNowPlayingBadge = z2;
        this.$labelContentType = labelContentType;
        this.$shouldAddMovieBadge = z3;
        this.$shouldAddNewBadge = z4;
        this.$statuses = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public /* bridge */ /* synthetic */ q invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return q.a;
    }

    public final void invoke(i iVar, int i) {
        if ((i & 11) == 2 && iVar.h()) {
            iVar.A();
            return;
        }
        e0.b bVar = e0.a;
        float f = 4;
        f a = o.a(d.e(this.$modifier, f), false, AnonymousClass1.INSTANCE);
        a.h g = com.amazon.aps.iva.d0.a.g(f);
        a.h g2 = com.amazon.aps.iva.d0.a.g(f);
        MaturityRatingType maturityRatingType = this.$maturityRatingType;
        boolean z = this.$shouldAddMaturityRating;
        int i2 = this.$$dirty;
        boolean z2 = this.$shouldAddNowPlayingBadge;
        LabelContentType labelContentType = this.$labelContentType;
        boolean z3 = this.$shouldAddMovieBadge;
        boolean z4 = this.$shouldAddNewBadge;
        com.amazon.aps.iva.pe0.a<String> aVar = this.$statuses;
        iVar.s(1098475987);
        q.e eVar = g0.a;
        iVar.s(1479255111);
        iVar.s(1618982084);
        boolean H = iVar.H(Integer.MAX_VALUE) | iVar.H(g) | iVar.H(g2);
        Object t = iVar.t();
        if (H || t == i.a.a) {
            Object xVar = new x(g.d, g2.d, g0.a, d1.Horizontal, z1.Wrap, new com.amazon.aps.iva.d0.c0(g), new d0(g2));
            iVar.n(xVar);
            t = xVar;
        }
        iVar.G();
        com.amazon.aps.iva.s1.d0 d0Var = (com.amazon.aps.iva.s1.d0) t;
        iVar.G();
        iVar.s(-1323940314);
        int S = b.S(iVar);
        c2 l = iVar.l();
        e.o0.getClass();
        e.a aVar2 = e.a.b;
        com.amazon.aps.iva.v0.a a2 = u.a(a);
        if (iVar.j() instanceof com.amazon.aps.iva.o0.d) {
            iVar.z();
            if (iVar.e()) {
                iVar.w(aVar2);
            } else {
                iVar.m();
            }
            b.k0(iVar, d0Var, e.a.e);
            b.k0(iVar, l, e.a.d);
            e.a.C0752a c0752a = e.a.f;
            if (iVar.e() || !j.a(iVar.t(), Integer.valueOf(S))) {
                b2.c(S, iVar, S, c0752a);
            }
            com.amazon.aps.iva.b8.i.c(0, a2, new x2(iVar), iVar, 2058660585);
            boolean z5 = maturityRatingType != MaturityRatingType.UNDEFINED;
            iVar.s(-1985780555);
            if (z && z5) {
                LabelsKt.m34MaturityRatingLabel6a0pyJM(maturityRatingType, null, 18, iVar, (i2 & 14) | 384, 2);
            }
            iVar.G();
            iVar.s(-1985780322);
            if (z2) {
                CardBadgesKt.NowPlayingBadge(null, iVar, 0, 1);
            }
            iVar.G();
            iVar.s(-1985780262);
            if (labelContentType == LabelContentType.MOVIE && z3) {
                CardBadgesKt.CardMovieBadge(null, iVar, 0, 1);
            }
            iVar.G();
            iVar.s(-1985780179);
            if (z4) {
                CardBadgesKt.CardNewBadge(null, iVar, 0, 1);
            }
            iVar.G();
            iVar.s(-1985780129);
            if (aVar.contains("comingSoon")) {
                CardBadgesKt.CardComingSoonBadge(null, iVar, 0, 1);
            }
            iVar.G();
            iVar.s(-1985780066);
            if (aVar.contains("premium")) {
                CardBadgesKt.CardPremiumBadge(null, iVar, 0, 1);
            }
            iVar.G();
            iVar.s(-125135947);
            if (aVar.contains("matureBlocked") && !z5) {
                CardBadgesKt.CardMatureBadge(null, iVar, 0, 1);
            }
            iVar.G();
            iVar.G();
            iVar.o();
            iVar.G();
            iVar.G();
            return;
        }
        b.W();
        throw null;
    }
}
