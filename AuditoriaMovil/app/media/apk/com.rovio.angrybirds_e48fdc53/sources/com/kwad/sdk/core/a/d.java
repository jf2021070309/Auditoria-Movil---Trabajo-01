package com.kwad.sdk.core.a;

import com.kwad.sdk.components.DevelopMangerComponents;
import java.util.Map;
/* loaded from: classes.dex */
public final class d {
    private static f aoy;

    public static void a(String str, Map<String, String> map, String str2) {
        nV().a(str, map, str2);
    }

    public static String cQ(String str) {
        return nV().cQ(str);
    }

    public static void e(Map<String, String> map) {
        nV().e(map);
    }

    public static String getResponseData(String str) {
        com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
        return nV().getResponseData(str);
    }

    private static f nV() {
        f aVar;
        f fVar = aoy;
        if (fVar != null) {
            return fVar;
        }
        com.kwad.sdk.components.f fVar2 = (com.kwad.sdk.components.f) com.kwad.sdk.components.c.f(com.kwad.sdk.components.f.class);
        if (fVar2 != null) {
            fVar2.nV();
            aVar = fVar2.nV();
        } else {
            aVar = new a();
        }
        aoy = aVar;
        return aoy;
    }
}
