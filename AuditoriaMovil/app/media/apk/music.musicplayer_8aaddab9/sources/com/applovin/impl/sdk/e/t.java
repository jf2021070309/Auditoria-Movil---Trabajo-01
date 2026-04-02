package com.applovin.impl.sdk.e;

import com.applovin.impl.a.a;
import com.applovin.impl.sdk.e.o;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdType;
import java.util.HashSet;
/* loaded from: classes.dex */
public class t extends a {
    private final com.applovin.impl.a.e a;

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinAdLoadListener f4087c;

    public t(com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super("TaskRenderVastAd", mVar);
        this.f4087c = appLovinAdLoadListener;
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a("Rendering VAST ad...");
        int size = this.a.b().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        com.applovin.impl.a.i iVar = null;
        com.applovin.impl.a.m mVar = null;
        com.applovin.impl.a.d dVar = null;
        com.applovin.impl.a.c cVar = null;
        String str2 = "";
        for (com.applovin.impl.sdk.utils.q qVar : this.a.b()) {
            com.applovin.impl.sdk.utils.q c2 = qVar.c(com.applovin.impl.a.l.a(qVar) ? "Wrapper" : "InLine");
            if (c2 != null) {
                com.applovin.impl.sdk.utils.q c3 = c2.c("AdSystem");
                if (c3 != null) {
                    iVar = com.applovin.impl.a.i.a(c3, iVar, this.f4020b);
                }
                str = com.applovin.impl.a.l.a(c2, "AdTitle", str);
                str2 = com.applovin.impl.a.l.a(c2, "Description", str2);
                com.applovin.impl.a.l.a(c2.a("Impression"), hashSet, this.a, this.f4020b);
                com.applovin.impl.sdk.utils.q b2 = c2.b("ViewableImpression");
                if (b2 != null) {
                    com.applovin.impl.a.l.a(b2.a("Viewable"), hashSet, this.a, this.f4020b);
                }
                com.applovin.impl.sdk.utils.q c4 = c2.c("AdVerifications");
                if (c4 != null) {
                    cVar = com.applovin.impl.a.c.a(c4, cVar, this.a, this.f4020b);
                }
                com.applovin.impl.a.l.a(c2.a("Error"), hashSet2, this.a, this.f4020b);
                com.applovin.impl.sdk.utils.q b3 = c2.b("Creatives");
                if (b3 != null) {
                    for (com.applovin.impl.sdk.utils.q qVar2 : b3.d()) {
                        com.applovin.impl.sdk.utils.q b4 = qVar2.b("Linear");
                        if (b4 != null) {
                            mVar = com.applovin.impl.a.m.a(b4, mVar, this.a, this.f4020b);
                        } else {
                            com.applovin.impl.sdk.utils.q c5 = qVar2.c("CompanionAds");
                            if (c5 != null) {
                                com.applovin.impl.sdk.utils.q c6 = c5.c("Companion");
                                if (c6 != null) {
                                    dVar = com.applovin.impl.a.d.a(c6, dVar, this.a, this.f4020b);
                                }
                            } else {
                                d("Received and will skip rendering for an unidentified creative: " + qVar2);
                            }
                        }
                    }
                }
            } else {
                d("Did not find wrapper or inline response for node: " + qVar);
            }
        }
        com.applovin.impl.a.a a = new a.C0065a().a(this.f4020b).a(this.a.c()).b(this.a.d()).a(this.a.e()).a(this.a.f()).a(str).b(str2).a(iVar).a(mVar).a(dVar).a(cVar).a(hashSet).a(cVar).b(hashSet2).a();
        com.applovin.impl.a.f a2 = com.applovin.impl.a.l.a(a);
        if (a2 != null) {
            com.applovin.impl.a.l.a(this.a, this.f4087c, a2, -6, this.f4020b);
            return;
        }
        a("Finished rendering VAST ad: " + a);
        a.getAdEventTracker().b();
        e eVar = new e(a, this.f4020b, this.f4087c);
        o.a aVar = o.a.CACHING_OTHER;
        if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.bo)).booleanValue()) {
            if (a.getType() == AppLovinAdType.REGULAR) {
                aVar = o.a.CACHING_INTERSTITIAL;
            } else if (a.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar = o.a.CACHING_INCENTIVIZED;
            }
        }
        this.f4020b.S().a(eVar, aVar);
    }
}
