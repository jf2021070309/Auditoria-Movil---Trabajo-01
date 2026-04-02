package com.kwad.sdk.core.response.b;

import com.kwad.sdk.core.response.model.AdStyleInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class c {
    public static long bW(AdTemplate adTemplate) {
        if (adTemplate == null) {
            return 0L;
        }
        return ca(adTemplate).playDetailInfo.detailTopToolBarInfo.callButtonShowTime;
    }

    public static String bX(AdTemplate adTemplate) {
        return adTemplate == null ? "" : ca(adTemplate).playDetailInfo.detailTopToolBarInfo.callButtonDescription;
    }

    public static String bY(AdTemplate adTemplate) {
        return adTemplate == null ? "" : ca(adTemplate).playEndInfo.endTopToolBarInfo.callButtonDescription;
    }

    public static boolean bZ(AdTemplate adTemplate) {
        if (adTemplate != null && d.cc(adTemplate)) {
            return ca(adTemplate).slideClick;
        }
        return false;
    }

    private static AdStyleInfo ca(AdTemplate adTemplate) {
        return d.ck(adTemplate).adStyleInfo;
    }

    public static List<String> cb(AdTemplate adTemplate) {
        AdStyleInfo ca = ca(adTemplate);
        ArrayList arrayList = new ArrayList();
        try {
            for (AdStyleInfo.ExposeTagInfo exposeTagInfo : ca.extraDisplayInfo.exposeTagInfoList) {
                arrayList.add(exposeTagInfo.text);
            }
        } catch (Exception e) {
        }
        return arrayList;
    }
}
