package com.amazon.aps.iva.w20;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ct.j;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ve0.v0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import com.ellation.crunchyroll.api.etp.subscription.model.BenefitKt;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
/* compiled from: MembershipCardViewModel.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.ez.b {
    public final v0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.v20.e eVar, j jVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        Date date;
        long j;
        int i;
        boolean z;
        boolean z2;
        Integer num;
        Integer valueOf;
        com.amazon.aps.iva.yb0.j.f(eVar, "getUserState");
        com.amazon.aps.iva.yb0.j.f(jVar, "userBenefitsStore");
        boolean z3 = false;
        AccountApiModel m0 = ((com.amazon.aps.iva.bo.f) eVar.invoke()).m0();
        String str = (m0 == null || (r1 = m0.getEmail()) == null) ? "" : "";
        AccountApiModel m02 = ((com.amazon.aps.iva.bo.f) eVar.invoke()).m0();
        if (m02 != null) {
            date = m02.getCreated();
        } else {
            date = null;
        }
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        int i2 = calendar.get(1);
        String b = ((com.amazon.aps.iva.bo.f) eVar.invoke()).b();
        if (jVar.getHasPremiumBenefit()) {
            j = com.amazon.aps.iva.ao.a.a;
        } else {
            j = com.amazon.aps.iva.ao.a.m;
        }
        if (jVar.getHasPremiumBenefit()) {
            i = R.drawable.membership_card_premium_hime;
        } else {
            i = R.drawable.membership_card_free_hime;
        }
        int i3 = i;
        List<Benefit> R0 = jVar.R0();
        if (!(R0 instanceof Collection) || !R0.isEmpty()) {
            for (Benefit benefit : R0) {
                if (BenefitKt.isUltimateFan(benefit)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            valueOf = Integer.valueOf((int) R.drawable.ic_membership_card_ultimate_fan_crown);
        } else {
            List<Benefit> R02 = jVar.R0();
            if (!(R02 instanceof Collection) || !R02.isEmpty()) {
                for (Benefit benefit2 : R02) {
                    if (BenefitKt.isFan(benefit2)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z2) {
                valueOf = Integer.valueOf((int) R.drawable.ic_membership_card_mega_fan_crown);
            } else {
                List<Benefit> R03 = jVar.R0();
                if (!(R03 instanceof Collection) || !R03.isEmpty()) {
                    Iterator<T> it = R03.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (BenefitKt.isPremium((Benefit) it.next())) {
                                z3 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z3) {
                    valueOf = Integer.valueOf((int) R.drawable.ic_membership_card_fan_crown);
                } else {
                    num = null;
                    this.b = x.e(new com.amazon.aps.iva.v20.f(str, i2, b, j, f1.D(jVar.R0()), i3, num));
                }
            }
        }
        num = valueOf;
        this.b = x.e(new com.amazon.aps.iva.v20.f(str, i2, b, j, f1.D(jVar.R0()), i3, num));
    }
}
