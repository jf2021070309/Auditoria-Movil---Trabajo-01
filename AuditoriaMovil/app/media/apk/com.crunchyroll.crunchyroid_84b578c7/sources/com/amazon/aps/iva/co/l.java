package com.amazon.aps.iva.co;

import com.amazon.aps.iva.co.j;
import com.amazon.aps.iva.lb0.x;
import com.ellation.crunchyroll.api.etp.auth.model.FunUser;
import com.ellation.crunchyroll.api.etp.auth.model.MigrationStatus;
import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import com.ellation.crunchyroll.api.etp.subscription.model.BenefitKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: UserMigrationTypeProvider.kt */
/* loaded from: classes2.dex */
public final class l implements k {
    public final com.amazon.aps.iva.eo.a a;
    public final Map<String, String> b;
    public final a c;

    public l(com.amazon.aps.iva.eo.b bVar, Map map, a aVar) {
        this.a = bVar;
        this.b = map;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.co.k
    public final j a(List<Benefit> list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        MigrationStatus migrationStatus;
        boolean z6;
        com.amazon.aps.iva.yb0.j.f(list, "benefits");
        a aVar = this.c;
        aVar.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, String>> it = this.b.entrySet().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            List<Benefit> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (Benefit benefit : list2) {
                    if (com.amazon.aps.iva.yb0.j.a(benefit.getBenefit(), key) && BenefitKt.isFunBenefit(benefit)) {
                        z6 = true;
                        continue;
                    } else {
                        z6 = false;
                        continue;
                    }
                    if (z6) {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        List X0 = x.X0(linkedHashMap.values());
        aVar.d();
        List<Benefit> list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            for (Benefit benefit2 : list3) {
                if (BenefitKt.isPremium(benefit2) && BenefitKt.isCrBenefit(benefit2)) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        aVar.d();
        List<Benefit> list4 = list;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            for (Benefit benefit3 : list4) {
                if (BenefitKt.isPremium(benefit3) && BenefitKt.isFunBenefit(benefit3)) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                if (z4) {
                    z5 = true;
                    break;
                }
            }
        }
        z5 = false;
        FunUser funUser = this.a.getFunUser();
        if (funUser != null) {
            migrationStatus = funUser.getMigrationStatus();
        } else {
            migrationStatus = null;
        }
        z = (migrationStatus != MigrationStatus.NO_CONFLICT || z3) ? false : false;
        if (z5) {
            if (z3) {
                return j.e.b;
            }
            if (z) {
                return new j.f(X0);
            }
            return j.d.b;
        } else if (z3) {
            return j.b.b;
        } else {
            if (z) {
                return j.c.b;
            }
            return j.a.b;
        }
    }
}
