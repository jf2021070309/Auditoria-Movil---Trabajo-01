package com.facebook.ads.internal.adapters;

import com.adcolony.sdk.AdColonyAppOptions;
/* loaded from: classes2.dex */
public class y {
    public static String a(g gVar) {
        switch (gVar) {
            case ADMOB:
                return AdColonyAppOptions.ADMOB;
            case YAHOO:
                return "Flurry";
            case INMOBI:
                return "InMobi";
            case AN:
                return "Audience Network";
            default:
                return "";
        }
    }
}
