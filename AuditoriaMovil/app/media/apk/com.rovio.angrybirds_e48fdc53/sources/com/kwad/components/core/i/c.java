package com.kwad.components.core.i;

import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class c {
    private Object KY;
    private AdTemplate KZ;

    public c(AdTemplate adTemplate, int i) {
        this.KY = null;
        try {
            this.KY = new b(adTemplate, i);
        } catch (Throwable th) {
            this.KZ = adTemplate;
        }
    }

    public static List<AdTemplate> j(List<c> list) {
        ArrayList arrayList = new ArrayList();
        for (c cVar : list) {
            arrayList.add(cVar.getAdTemplate());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
        /*
            r1 = this;
            java.lang.Object r0 = r1.KY
            if (r0 == 0) goto Lc
            com.kwad.components.core.i.b r0 = (com.kwad.components.core.i.b) r0     // Catch: java.lang.Exception -> Lb
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()     // Catch: java.lang.Exception -> Lb
            goto Ld
        Lb:
            r0 = move-exception
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L11
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.KZ
        L11:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.core.i.c.getAdTemplate():com.kwad.sdk.core.response.model.AdTemplate");
    }

    public final Object getHost() {
        return this.KY;
    }
}
