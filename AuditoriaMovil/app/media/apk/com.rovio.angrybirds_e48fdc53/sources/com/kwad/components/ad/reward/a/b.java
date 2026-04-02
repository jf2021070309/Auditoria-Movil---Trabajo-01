package com.kwad.components.ad.reward.a;

import com.kwad.sdk.core.response.model.AdInfo;
/* loaded from: classes.dex */
public final class b {
    public static int gE() {
        return a.qG.getValue().intValue();
    }

    public static String gF() {
        return a.qK.getValue();
    }

    public static int gG() {
        return a.qH.getValue().intValue();
    }

    public static boolean gH() {
        return a.qJ.getValue().booleanValue();
    }

    public static int gI() {
        return a.qI.getValue().intValue();
    }

    private static boolean gJ() {
        return a.qM.getValue().intValue() == 1;
    }

    public static float gK() {
        return a.qR.getValue().floatValue();
    }

    public static boolean gL() {
        return a.qR.getValue().floatValue() > 0.0f && a.qR.getValue().floatValue() < 1.0f;
    }

    public static boolean gM() {
        return a.qS.getValue().booleanValue();
    }

    public static long gN() {
        return a.qP.getValue().intValue();
    }

    public static int gO() {
        return a.qQ.getValue().intValue();
    }

    public static int gP() {
        return a.qT.getValue().intValue();
    }

    public static boolean gQ() {
        return a.qU.getValue().booleanValue();
    }

    public static boolean gR() {
        return a.qV.getValue().intValue() == 1 || a.qV.getValue().intValue() == 3;
    }

    public static boolean i(AdInfo adInfo) {
        return !j(adInfo) && com.kwad.sdk.core.response.b.a.cu(adInfo) && gJ();
    }

    public static boolean j(AdInfo adInfo) {
        return com.kwad.sdk.core.response.b.a.cu(adInfo) && a.qO.getValue().intValue() == 1;
    }

    public static boolean k(AdInfo adInfo) {
        return i(adInfo);
    }
}
