package com.kwad.sdk.core.request.model;

import android.location.Location;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.au;
import com.kwad.sdk.utils.t;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c implements com.kwad.sdk.core.b {
    private static c aus;
    private double aut;
    private double auu;

    public static c Ct() {
        c cVar = aus;
        if (cVar != null) {
            return cVar;
        }
        Location bW = au.bW(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext());
        if (bW != null) {
            c cVar2 = new c();
            aus = cVar2;
            cVar2.aut = bW.getLatitude();
            aus.auu = bW.getLongitude();
        }
        return aus;
    }

    @Override // com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
    }

    @Override // com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.putValue(jSONObject, "latitude", this.aut);
        t.putValue(jSONObject, "longitude", this.auu);
        return jSONObject;
    }
}
