package com.kwad.sdk.core.request.model;

import com.facebook.AccessToken;
import com.kwad.sdk.utils.t;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g implements com.kwad.sdk.core.b {
    private String auF;
    private String auG;
    public int thirdAge;
    public int thirdGender;
    public String thirdInterest;

    public static g Cx() {
        return new g();
    }

    public final void dC(String str) {
        this.auG = str;
    }

    @Override // com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
    }

    @Override // com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.putValue(jSONObject, AccessToken.USER_ID_KEY, this.auF);
        t.putValue(jSONObject, "thirdUserId", this.auG);
        int i = this.thirdAge;
        if (i != 0) {
            t.putValue(jSONObject, "thirdAge", i);
        }
        int i2 = this.thirdGender;
        if (i2 != 0) {
            t.putValue(jSONObject, "thirdGender", i2);
        }
        t.putValue(jSONObject, "thirdInterest", this.thirdInterest);
        return jSONObject;
    }
}
