package com.kwad.components.core.t;

import com.kwad.sdk.components.DevelopMangerComponents;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    private static volatile b Rj;

    private b() {
    }

    public static b ql() {
        if (Rj == null) {
            synchronized (b.class) {
                if (Rj == null) {
                    Rj = new b();
                }
            }
        }
        return Rj;
    }

    public final void a(final AdTemplate adTemplate, JSONObject jSONObject, com.kwad.sdk.core.report.j jVar) {
        if (((DevelopMangerComponents) com.kwad.sdk.components.c.f(DevelopMangerComponents.class)) != null) {
            com.kwad.sdk.core.e.c.d("AdEventHelper", "processAdImpress notImpression: false");
        }
        if (jVar != null) {
            jVar.a(adTemplate, null, null, null);
        }
        com.kwad.sdk.core.report.a.b(adTemplate, (JSONObject) null, jVar);
        com.kwad.sdk.utils.g.execute(new Runnable() { // from class: com.kwad.components.core.t.b.1
            @Override // java.lang.Runnable
            public final void run() {
                com.kwad.components.core.c.a mk = com.kwad.components.core.c.a.mk();
                if (mk != null) {
                    mk.o(com.kwad.sdk.core.response.b.d.cu(adTemplate));
                }
            }
        });
        com.kwad.components.core.c.f.my().M(adTemplate);
    }
}
