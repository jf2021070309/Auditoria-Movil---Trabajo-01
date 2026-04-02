package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.e.o;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdType;
import java.util.HashSet;
/* loaded from: classes.dex */
class s extends a {
    private com.applovin.impl.a.c a;
    private final AppLovinAdLoadListener c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(com.applovin.impl.a.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderVastAd", kVar);
        this.c = appLovinAdLoadListener;
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a("Rendering VAST ad...");
        int size = this.a.b().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        com.applovin.impl.a.f fVar = null;
        com.applovin.impl.a.j jVar = null;
        com.applovin.impl.a.b bVar = null;
        String str2 = "";
        for (com.applovin.impl.sdk.utils.p pVar : this.a.b()) {
            com.applovin.impl.sdk.utils.p c = pVar.c(com.applovin.impl.a.i.a(pVar) ? "Wrapper" : "InLine");
            if (c != null) {
                com.applovin.impl.sdk.utils.p c2 = c.c("AdSystem");
                if (c2 != null) {
                    fVar = com.applovin.impl.a.f.a(c2, fVar, this.b);
                }
                str = com.applovin.impl.a.i.a(c, "AdTitle", str);
                str2 = com.applovin.impl.a.i.a(c, "Description", str2);
                com.applovin.impl.a.i.a(c.a("Impression"), hashSet, this.a, this.b);
                com.applovin.impl.sdk.utils.p b = c.b("ViewableImpression");
                if (b != null) {
                    com.applovin.impl.a.i.a(b.a("Viewable"), hashSet, this.a, this.b);
                }
                com.applovin.impl.a.i.a(c.a("Error"), hashSet2, this.a, this.b);
                com.applovin.impl.sdk.utils.p b2 = c.b("Creatives");
                if (b2 != null) {
                    for (com.applovin.impl.sdk.utils.p pVar2 : b2.d()) {
                        com.applovin.impl.sdk.utils.p b3 = pVar2.b("Linear");
                        if (b3 != null) {
                            jVar = com.applovin.impl.a.j.a(b3, jVar, this.a, this.b);
                        } else {
                            com.applovin.impl.sdk.utils.p c3 = pVar2.c("CompanionAds");
                            if (c3 != null) {
                                com.applovin.impl.sdk.utils.p c4 = c3.c("Companion");
                                if (c4 != null) {
                                    bVar = com.applovin.impl.a.b.a(c4, bVar, this.a, this.b);
                                }
                            } else {
                                d("Received and will skip rendering for an unidentified creative: " + pVar2);
                            }
                        }
                    }
                }
            } else {
                d("Did not find wrapper or inline response for node: " + pVar);
            }
        }
        com.applovin.impl.a.a a = com.applovin.impl.a.a.aS().a(this.b).a(this.a.c()).b(this.a.d()).a(this.a.e()).a(this.a.f()).a(str).b(str2).a(fVar).a(jVar).a(bVar).a(hashSet).b(hashSet2).a();
        com.applovin.impl.a.d a2 = com.applovin.impl.a.i.a(a);
        if (a2 != null) {
            com.applovin.impl.a.i.a(this.a, this.c, a2, -6, this.b);
            return;
        }
        e eVar = new e(a, this.b, this.c);
        o.a aVar = o.a.CACHING_OTHER;
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.be)).booleanValue()) {
            if (a.getType() == AppLovinAdType.REGULAR) {
                aVar = o.a.CACHING_INTERSTITIAL;
            } else if (a.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar = o.a.CACHING_INCENTIVIZED;
            }
        }
        this.b.Q().a(eVar, aVar);
    }
}
