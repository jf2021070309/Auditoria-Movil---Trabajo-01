package com.ironsource.sdk.a;

import com.ironsource.mediationsdk.C0119m;
import com.ironsource.sdk.g.d;
/* loaded from: classes2.dex */
public class e {
    private C0119m a = new C0119m();

    public static d.e a(com.ironsource.sdk.g.c cVar, d.e eVar) {
        return (cVar == null || cVar.d == null || cVar.d.get("rewarded") == null) ? eVar : Boolean.parseBoolean(cVar.d.get("rewarded")) ? d.e.RewardedVideo : d.e.Interstitial;
    }

    public static boolean a(com.ironsource.sdk.g.c cVar) {
        if (cVar == null || cVar.d.get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(cVar.d.get("inAppBidding"));
    }

    public void a(int i) {
        C0119m.a("sdia", Integer.valueOf(i));
    }

    public void b(int i) {
        C0119m.a("sdra", Integer.valueOf(i));
    }

    public void c(int i) {
        C0119m.a("sdba", Integer.valueOf(i));
    }
}
