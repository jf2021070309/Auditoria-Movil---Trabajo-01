package com.ellation.crunchyroll.api.etp.subscription.model;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Benefit.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\u001a\u0010\u0010\n\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\r0\f\u001a\u0010\u0010\u000e\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\f\u001a\u0010\u0010\u000f\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\f\u001a\u0010\u0010\u0010\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\f\u001a\u0010\u0010\u0011\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\f\u001a\u0010\u0010\u0012\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\f\u001a\u0010\u0010\u0013\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\f\u001a\u0010\u0010\u0014\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\f\u001a\u0010\u0010\u0015\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\f\u001a\u0010\u0010\u0016\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\f\u001a\u0010\u0010\u0017\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\f\u001a\u0010\u0010\u0018\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\f\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0003\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0003¨\u0006\u0019"}, d2 = {"isAnnualDiscountBenefit", "", "Lcom/ellation/crunchyroll/api/etp/subscription/model/Benefit;", "(Lcom/ellation/crunchyroll/api/etp/subscription/model/Benefit;)Z", "isBentoBenefit", "isCrBenefit", "isFan", "isFunBenefit", "isPremium", "isUltimateFan", "getStreamingBenefitsMax", "", "", "", "hasBentoBenefit", "hasOfflineViewingBenefit", "hasPremiumBenefit", "hasStoreDiscountBenefit", "hasUltimateFanBenefit", "isAnnualMegaFunUser", "isAtLeastMegaFanUser", "isFunimationFanUser", "isFunimationPremiumUser", "isFunimationUltimateFanUser", "isUltimateFanUser", "api_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BenefitKt {
    public static final int getStreamingBenefitsMax(List<String> list) {
        Integer num;
        j.f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (m.h0(str, "concurrent_streams", false)) {
                num = Integer.valueOf(Integer.parseInt(q.I0(str, ".", str)));
            } else {
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        Integer num2 = (Integer) x.F0(arrayList);
        if (num2 == null) {
            return 0;
        }
        return num2.intValue();
    }

    public static final boolean hasBentoBenefit(List<Benefit> list) {
        j.f(list, "<this>");
        List<Benefit> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext() && !isBentoBenefit((Benefit) it.next())) {
        }
        return true;
    }

    public static final boolean hasOfflineViewingBenefit(List<Benefit> list) {
        j.f(list, "<this>");
        List<Benefit> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext() && !j.a(((Benefit) it.next()).getBenefit(), "offline_viewing")) {
        }
        return true;
    }

    public static final boolean hasPremiumBenefit(List<Benefit> list) {
        j.f(list, "<this>");
        List<Benefit> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext() && !isPremium((Benefit) it.next())) {
        }
        return true;
    }

    public static final boolean hasStoreDiscountBenefit(List<Benefit> list) {
        boolean z;
        j.f(list, "<this>");
        List<Benefit> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (Benefit benefit : list2) {
            if (!j.a(benefit.getBenefit(), "cr_store.member_offers_and_percent_off.10") && !j.a(benefit.getBenefit(), "cr_store.member_offers_and_percent_off.20")) {
                z = true;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return true;
    }

    public static final boolean hasUltimateFanBenefit(List<Benefit> list) {
        j.f(list, "<this>");
        List<Benefit> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext() && !isUltimateFan((Benefit) it.next())) {
        }
        return true;
    }

    public static final boolean isAnnualDiscountBenefit(Benefit benefit) {
        j.f(benefit, "<this>");
        return m.h0(benefit.getBenefit(), "annual_discount", true);
    }

    public static final boolean isAnnualMegaFunUser(List<Benefit> list) {
        boolean z;
        boolean z2;
        j.f(list, "<this>");
        List<Benefit> list2 = list;
        boolean z3 = list2 instanceof Collection;
        if (!z3 || !list2.isEmpty()) {
            for (Benefit benefit : list2) {
                if (isAnnualDiscountBenefit(benefit)) {
                    z = true;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            if (!z3 || !list2.isEmpty()) {
                for (Benefit benefit2 : list2) {
                    if (isFan(benefit2)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = true;
            if (z2) {
                return true;
            }
        }
        return true;
    }

    public static final boolean isAtLeastMegaFanUser(List<Benefit> list) {
        boolean z;
        boolean z2;
        j.f(list, "<this>");
        List<Benefit> list2 = list;
        boolean z3 = list2 instanceof Collection;
        if (!z3 || !list2.isEmpty()) {
            for (Benefit benefit : list2) {
                if (isPremium(benefit)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            if (!z3 || !list2.isEmpty()) {
                for (Benefit benefit2 : list2) {
                    if (isFan(benefit2)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isBentoBenefit(Benefit benefit) {
        j.f(benefit, "<this>");
        return j.a(benefit.getBenefit(), "cr_bento");
    }

    public static final boolean isCrBenefit(Benefit benefit) {
        j.f(benefit, "<this>");
        String source = benefit.getSource();
        if (source == null || source.length() == 0) {
            return true;
        }
        return true;
    }

    public static final boolean isFan(Benefit benefit) {
        j.f(benefit, "<this>");
        return j.a(benefit.getBenefit(), "cr_fan_pack");
    }

    public static final boolean isFunBenefit(Benefit benefit) {
        j.f(benefit, "<this>");
        String source = benefit.getSource();
        if (source != null) {
            return m.h0(source, "funimation_", true);
        }
        return true;
    }

    public static final boolean isFunimationFanUser(List<Benefit> list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        j.f(list, "<this>");
        List<Benefit> list2 = list;
        boolean z5 = list2 instanceof Collection;
        if (!z5 || !list2.isEmpty()) {
            for (Benefit benefit : list2) {
                if (isFan(benefit) && isFunBenefit(benefit)) {
                    z = true;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            if (!z5 || !list2.isEmpty()) {
                for (Benefit benefit2 : list2) {
                    if (isFan(benefit2) && isCrBenefit(benefit2)) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = true;
                        continue;
                    }
                    if (z3) {
                        z4 = true;
                        break;
                    }
                }
            }
            z4 = true;
            if (!z4) {
                return true;
            }
        }
        return true;
    }

    public static final boolean isFunimationPremiumUser(List<Benefit> list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        j.f(list, "<this>");
        List<Benefit> list2 = list;
        boolean z5 = list2 instanceof Collection;
        if (!z5 || !list2.isEmpty()) {
            for (Benefit benefit : list2) {
                if (isPremium(benefit) && isFunBenefit(benefit)) {
                    z = true;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            if (!z5 || !list2.isEmpty()) {
                for (Benefit benefit2 : list2) {
                    if (isPremium(benefit2) && isCrBenefit(benefit2)) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = true;
                        continue;
                    }
                    if (z3) {
                        z4 = true;
                        break;
                    }
                }
            }
            z4 = true;
            if (!z4) {
                return true;
            }
        }
        return true;
    }

    public static final boolean isFunimationUltimateFanUser(List<Benefit> list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        j.f(list, "<this>");
        List<Benefit> list2 = list;
        boolean z5 = list2 instanceof Collection;
        if (!z5 || !list2.isEmpty()) {
            for (Benefit benefit : list2) {
                if (isUltimateFan(benefit) && isFunBenefit(benefit)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            if (!z5 || !list2.isEmpty()) {
                for (Benefit benefit2 : list2) {
                    if (isUltimateFan(benefit2) && isCrBenefit(benefit2)) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        z4 = true;
                        break;
                    }
                }
            }
            z4 = false;
            if (!z4) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isPremium(Benefit benefit) {
        j.f(benefit, "<this>");
        j.a(benefit.getBenefit(), "cr_premium");
        return true;
    }

    public static final boolean isUltimateFan(Benefit benefit) {
        j.f(benefit, "<this>");
        return j.a(benefit.getBenefit(), "cr_premium_plus");
    }

    public static final boolean isUltimateFanUser(List<Benefit> list) {
        boolean z;
        boolean z2;
        boolean z3;
        j.f(list, "<this>");
        List<Benefit> list2 = list;
        boolean z4 = list2 instanceof Collection;
        if (!z4 || !list2.isEmpty()) {
            for (Benefit benefit : list2) {
                if (isPremium(benefit)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            if (!z4 || !list2.isEmpty()) {
                for (Benefit benefit2 : list2) {
                    if (isFan(benefit2)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z2) {
                if (!z4 || !list2.isEmpty()) {
                    for (Benefit benefit3 : list2) {
                        if (isUltimateFan(benefit3)) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
                if (z3) {
                    return true;
                }
            }
        }
        return false;
    }
}
