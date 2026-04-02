package com.kwad.sdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.utils.ac;
/* loaded from: classes3.dex */
public final class ab {
    public static String a(Context context, String str, ac.a aVar, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String aj = ac.aj(context, ac.a(str, aVar));
        String cy = au.cy(context);
        if (!TextUtils.isEmpty(cy)) {
            aj = aj.replace("__MAC__", cy).replace("__MAC2__", ad.bq(cy)).replace("__MAC3__", ad.bq(cy.replace(":", "")));
        }
        String cw = au.cw(context);
        if (!TextUtils.isEmpty(cw)) {
            aj = aj.replace("__IMEI__", cw).replace("__IMEI2__", ad.bq(cw)).replace("__IMEI3__", ad.fx(cw));
        }
        String oaid = au.getOaid();
        if (!TextUtils.isEmpty(oaid)) {
            aj = aj.replace("__OAID__", oaid).replace("__OAID2__", ad.bq(oaid));
        }
        String cx = au.cx(context);
        if (!TextUtils.isEmpty(cx)) {
            aj = aj.replace("__ANDROIDID2__", ad.bq(cx)).replace("__ANDROIDID3__", ad.fx(cx)).replace("__ANDROIDID__", cx);
        }
        return ac.c(context, aj, z);
    }
}
