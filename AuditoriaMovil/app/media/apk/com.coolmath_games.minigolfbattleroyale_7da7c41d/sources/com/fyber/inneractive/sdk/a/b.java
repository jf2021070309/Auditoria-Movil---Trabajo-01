package com.fyber.inneractive.sdk.a;

import com.facebook.internal.NativeProtocol;
import com.fyber.inneractive.sdk.config.f;
import com.fyber.inneractive.sdk.config.i;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b implements a<i> {
    private static final String a = String.format("https://%sconfig_android.json", "cdn2.inner-active.mobi/ia-sdk-config/");

    @Override // com.fyber.inneractive.sdk.a.a
    public final String a() {
        return "IALastModifiedFromHeader.global";
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final /* bridge */ /* synthetic */ void a(i iVar) {
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final String b() {
        return "ia-global.config";
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final /* synthetic */ i a(String str) throws Exception {
        return b(str);
    }

    private static i b(String str) throws Exception {
        try {
            JSONObject jSONObject = new JSONObject(str);
            i iVar = new i();
            JSONObject optJSONObject = jSONObject.optJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("overrides");
            i.a(optJSONObject, iVar);
            i.b(optJSONObject2, iVar);
            return iVar;
        } catch (JSONException e) {
            IAlog.e("internal error while parsing global config file", new Object[0]);
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final String c() {
        return f.h() == null ? a : f.h();
    }
}
