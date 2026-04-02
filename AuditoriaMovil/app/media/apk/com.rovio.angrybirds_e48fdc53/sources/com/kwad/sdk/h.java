package com.kwad.sdk;

import com.kwad.sdk.components.DevelopMangerComponents;
/* loaded from: classes.dex */
public final class h {
    public static String wY() {
        String str = "https://" + com.kwad.sdk.core.network.idc.a.Bm().M("api", "open.e.kuaishou.com");
        com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
        return str;
    }

    public static String wZ() {
        return wY() + "/rest/e/v3/open/univ";
    }

    public static String xa() {
        return wY() + "/rest/e/v4/open/univ";
    }

    public static String xb() {
        return wY() + "/rest/e/v4/open/univ/bidding";
    }

    public static String xc() {
        return wY() + "/rest/e/v4/open/univ/getMaterial";
    }

    public static String xd() {
        return wY() + "/rest/e/v3/open/logBatch";
    }

    public static String xe() {
        return wY() + "/rest/e/v3/open/config";
    }

    public static String xf() {
        return wY() + "/rest/e/v3/open/callback";
    }

    public static String xg() {
        return wY() + "/rest/e/v3/open/crashLog";
    }

    public static String xh() {
        return wY() + "/rest/e/v3/open/appCheck";
    }

    public static String xi() {
        return wY() + "/rest/e/v3/open/collect";
    }

    public static String xj() {
        return wY() + "/rest/e/v3/open/checkReward";
    }
}
