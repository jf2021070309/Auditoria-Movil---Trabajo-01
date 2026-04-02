package com.amazon.aps.iva.hl;

import com.amazon.aps.iva.nf.c;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import com.ellation.crunchyroll.api.etp.subscription.model.BenefitKt;
import com.ellation.crunchyroll.api.etp.subscription.model.Product;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: RestrictionOverlayMapperImpl.kt */
/* loaded from: classes2.dex */
public final class w implements v {
    public final com.amazon.aps.iva.at.a a;
    public final com.amazon.aps.iva.aj.a b;
    public final com.amazon.aps.iva.wh.d c;
    public final com.amazon.aps.iva.xb0.a<List<Benefit>> d;
    public final com.amazon.aps.iva.vs.a e;

    public w(com.amazon.aps.iva.at.c cVar, com.amazon.aps.iva.aj.a aVar, com.amazon.aps.iva.wh.d dVar, com.amazon.aps.iva.xb0.a aVar2) {
        com.amazon.aps.iva.e.w wVar = com.amazon.aps.iva.e.w.d;
        com.amazon.aps.iva.yb0.j.f(aVar, "maturityRestriction");
        com.amazon.aps.iva.yb0.j.f(dVar, "subscriptionProductsStore");
        com.amazon.aps.iva.yb0.j.f(aVar2, "currentUserBenefits");
        this.a = cVar;
        this.b = aVar;
        this.c = dVar;
        this.d = aVar2;
        this.e = wVar;
    }

    @Override // com.amazon.aps.iva.hl.v
    public final c.j a() {
        int i;
        List<Benefit> invoke = this.d.invoke();
        List<Benefit> list = invoke;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
        for (Benefit benefit : list) {
            arrayList.add(benefit.getBenefit());
        }
        int streamingBenefitsMax = BenefitKt.getStreamingBenefitsMax(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = this.c.c().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (BenefitKt.getStreamingBenefitsMax(((Product) next).getBenefitPackage().getBenefitsKeys()) <= streamingBenefitsMax) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        boolean z2 = !arrayList2.isEmpty();
        if (!BenefitKt.hasPremiumBenefit(invoke)) {
            i = R.string.go_premium;
        } else {
            i = R.string.upgrade_now;
        }
        return new c.j(z2, i);
    }

    @Override // com.amazon.aps.iva.hl.v
    public final com.amazon.aps.iva.nf.c b(PlayableAsset playableAsset) {
        String str;
        String system;
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        ExtendedMaturityRating extendedMaturityRating = playableAsset.getExtendedMaturityRating();
        if (extendedMaturityRating != null) {
            str = extendedMaturityRating.getRating();
        } else {
            str = null;
        }
        com.amazon.aps.iva.aj.a aVar = this.b;
        if (aVar.b(str)) {
            String a = aVar.a();
            String str2 = "";
            if (a == null) {
                a = "";
            }
            ExtendedMaturityRating extendedMaturityRating2 = playableAsset.getExtendedMaturityRating();
            String str3 = (extendedMaturityRating2 == null || (str3 = extendedMaturityRating2.getRating()) == null) ? "" : "";
            ExtendedMaturityRating extendedMaturityRating3 = playableAsset.getExtendedMaturityRating();
            if (extendedMaturityRating3 != null && (system = extendedMaturityRating3.getSystem()) != null) {
                str2 = system;
            }
            return new c.i(new com.amazon.aps.iva.ks.p(a, str3, str2), this.e.c(playableAsset.getId(), playableAsset.getTitle(), com.amazon.aps.iva.dj.c.a(playableAsset.getResourceType())));
        }
        String a2 = this.a.a(playableAsset);
        switch (a2.hashCode()) {
            case -665462704:
                if (a2.equals("unavailable")) {
                    return c.k.a;
                }
                break;
            case -318452137:
                if (a2.equals("premium")) {
                    return x.a(playableAsset.getAudioLocale(), playableAsset.getVersions());
                }
                break;
            case -108217148:
                if (a2.equals("matureBlocked")) {
                    return c.d.a;
                }
                break;
            case 1894333340:
                if (a2.equals("comingSoon")) {
                    return c.a.a;
                }
                break;
        }
        return c.e.a;
    }
}
