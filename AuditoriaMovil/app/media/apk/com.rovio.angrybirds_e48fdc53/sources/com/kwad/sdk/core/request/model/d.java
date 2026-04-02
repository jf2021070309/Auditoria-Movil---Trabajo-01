package com.kwad.sdk.core.request.model;

import android.content.Context;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.at;
import com.kwad.sdk.utils.au;
import com.kwad.sdk.utils.t;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d implements com.kwad.sdk.core.b {
    private String auv;
    private int auw;
    private int aux;

    public static d Cu() {
        Context context = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext();
        d dVar = new d();
        dVar.auv = au.cy(context);
        dVar.auw = ag.cl(context);
        dVar.aux = ag.d(context, au.cB(context), at.Jd());
        return dVar;
    }

    public static d Cv() {
        d dVar = new d();
        dVar.auw = ag.cl(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext());
        return dVar;
    }

    @Override // com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
    }

    @Override // com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.putValue(jSONObject, "mac", this.auv);
        t.putValue(jSONObject, "connectionType", this.auw);
        t.putValue(jSONObject, "operatorType", this.aux);
        return jSONObject;
    }
}
