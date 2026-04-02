package com.kwad.sdk.core.request.model;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.bf;
import com.kwad.sdk.utils.k;
import com.kwad.sdk.utils.t;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a implements com.kwad.sdk.core.b {
    private static JSONObject atQ;
    private String appId;
    private String atR;
    private String name;
    private String packageName;
    private String version;

    public static JSONObject Cq() {
        if (!E(atQ)) {
            atQ = Cr().toJson();
        }
        return atQ;
    }

    public static a Cr() {
        a aVar = new a();
        com.kwad.sdk.service.a.e eVar = (com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class);
        aVar.appId = eVar.getAppId();
        aVar.name = eVar.getAppName();
        Context context = eVar.getContext();
        if (context != null) {
            aVar.packageName = context.getPackageName();
            aVar.version = k.bS(context);
        }
        aVar.atR = com.kwad.sdk.utils.e.bI(context);
        if (!TextUtils.isEmpty(bf.getAppId())) {
            aVar.appId = bf.getAppId();
        }
        if (!TextUtils.isEmpty(bf.getPackageName())) {
            aVar.packageName = bf.getPackageName();
        }
        return aVar;
    }

    private static boolean E(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString("appId");
        String optString2 = jSONObject.optString("name");
        return !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString) && optString.equals(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getAppId()) && optString2.equals(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getAppName());
    }

    @Override // com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
    }

    @Override // com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.putValue(jSONObject, "appId", this.appId);
        t.putValue(jSONObject, "name", this.name);
        t.putValue(jSONObject, DBDefinition.PACKAGE_NAME, this.packageName);
        t.putValue(jSONObject, "version", this.version);
        t.putValue(jSONObject, "sha1", this.atR);
        return jSONObject;
    }
}
