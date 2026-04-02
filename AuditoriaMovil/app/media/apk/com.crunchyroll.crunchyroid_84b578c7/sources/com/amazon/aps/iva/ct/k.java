package com.amazon.aps.iva.ct;

import android.content.Context;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import com.ellation.crunchyroll.api.etp.subscription.model.BenefitKt;
import com.google.gson.Gson;
/* compiled from: UserBenefitsStore.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.xe.c<Benefit> implements j {

    /* compiled from: UserBenefitsStore.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.xe.a<Benefit> {
        public a(Context context, String str, Gson gson) {
            super(Benefit.class, context, str, gson);
        }

        @Override // com.amazon.aps.iva.xe.a
        public final String getInternalCacheableId(Benefit benefit) {
            Benefit benefit2 = benefit;
            com.amazon.aps.iva.yb0.j.f(benefit2, "<this>");
            return String.valueOf(benefit2.hashCode());
        }
    }

    public k(Context context, String str) {
        super(new a(context, str.concat("_user_benefits_store"), GsonHolder.getInstance()));
    }

    @Override // com.amazon.aps.iva.ct.j
    public final boolean C() {
        return BenefitKt.isFunimationPremiumUser(q());
    }

    @Override // com.amazon.aps.iva.ct.j
    public final boolean G1() {
        return BenefitKt.isFunimationFanUser(q());
    }

    @Override // com.amazon.aps.iva.ct.j
    public final boolean R1() {
        return !q().isEmpty();
    }

    @Override // com.amazon.aps.iva.ct.j
    public final boolean getHasPremiumBenefit() {
        return BenefitKt.hasPremiumBenefit(q());
    }

    @Override // com.amazon.aps.iva.ct.j
    public final boolean m() {
        return BenefitKt.hasStoreDiscountBenefit(q());
    }

    @Override // com.amazon.aps.iva.ct.j
    public final boolean r() {
        return BenefitKt.hasOfflineViewingBenefit(q());
    }

    @Override // com.amazon.aps.iva.ct.j
    public final boolean z0() {
        return BenefitKt.isFunimationUltimateFanUser(q());
    }
}
