package com.kwad.components.ad.interstitial.a;

import com.kwad.sdk.core.response.model.AdInfo;
/* loaded from: classes.dex */
public final class b {
    public static int b(AdInfo adInfo) {
        int intValue = a.iR.getValue().intValue();
        if (com.kwad.sdk.core.response.b.a.aU(adInfo)) {
            int G = com.kwad.sdk.core.response.b.a.G(adInfo);
            return intValue == 0 ? G : Math.min(intValue, G);
        } else if (intValue > 60 || intValue <= 0) {
            return 60;
        } else {
            return intValue;
        }
    }

    public static boolean cB() {
        return a.iT.getValue().booleanValue();
    }

    public static boolean cC() {
        return a.iN.getValue().intValue() == 1;
    }

    public static int cD() {
        return a.iO.getValue().intValue();
    }

    public static boolean cE() {
        return a.iP.getValue().intValue() == 1;
    }

    public static boolean cF() {
        return a.iQ.getValue().intValue() == 1;
    }

    public static int cG() {
        return a.iV.getValue().intValue();
    }

    public static boolean cH() {
        return a.iS.getValue().intValue() == 1;
    }

    public static boolean cI() {
        return a.iU.getValue().intValue() == 1;
    }
}
