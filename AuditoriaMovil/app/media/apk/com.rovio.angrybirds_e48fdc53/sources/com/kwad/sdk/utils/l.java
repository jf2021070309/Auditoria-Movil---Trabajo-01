package com.kwad.sdk.utils;

import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes3.dex */
public final class l {
    public static long aIn = -1;

    public static void cD(AdTemplate adTemplate) {
        if (adTemplate != null) {
            adTemplate.mVisibleTimeParam = aIn;
            adTemplate.mOutClickTimeParam = aIn;
        }
    }

    public static void cE(AdTemplate adTemplate) {
        if (adTemplate != null) {
            adTemplate.mOutClickTimeParam = System.currentTimeMillis();
        }
    }

    public static void cF(AdTemplate adTemplate) {
        if (adTemplate != null) {
            adTemplate.mVisibleTimeParam = System.currentTimeMillis();
        }
    }

    public static long cG(AdTemplate adTemplate) {
        return adTemplate == null ? System.currentTimeMillis() : adTemplate.mOutClickTimeParam > 0 ? adTemplate.mOutClickTimeParam : adTemplate.mVisibleTimeParam;
    }
}
