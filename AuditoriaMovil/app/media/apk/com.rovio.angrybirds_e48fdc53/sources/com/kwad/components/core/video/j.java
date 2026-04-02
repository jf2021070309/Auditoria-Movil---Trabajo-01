package com.kwad.components.core.video;

import com.kwad.sdk.core.network.a.a;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ad;
import java.io.File;
/* loaded from: classes.dex */
public final class j {
    public static boolean a(String str, String str2, a.C0256a c0256a) {
        String bq = ad.bq(str2);
        long currentTimeMillis = System.currentTimeMillis();
        com.kwad.sdk.core.e.c.i("VideoCacheHelper", "start cache video key:" + bq + "--url:" + str);
        boolean b = com.kwad.sdk.core.diskcache.b.a.At().b(str, str2, c0256a);
        long currentTimeMillis2 = System.currentTimeMillis();
        com.kwad.sdk.core.e.c.i("VideoCacheHelper", "finish cache video key:" + bq + "--cache time:" + (currentTimeMillis2 - currentTimeMillis) + "--success:" + b);
        return b;
    }

    public static boolean m(AdTemplate adTemplate) {
        File bP = com.kwad.sdk.core.diskcache.b.a.At().bP(com.kwad.sdk.core.response.b.a.F(com.kwad.sdk.core.response.b.d.ck(adTemplate)));
        return bP != null && bP.exists();
    }
}
