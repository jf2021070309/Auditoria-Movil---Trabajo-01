package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.internal.NativeProtocol;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class aa extends x {
    /* JADX INFO: Access modifiers changed from: protected */
    public aa(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.b.c c = c(jSONObject);
        if (c == null) {
            return;
        }
        a(c);
        a("Pending reward handled: " + c);
    }

    private com.applovin.impl.sdk.b.c c(JSONObject jSONObject) {
        String str;
        try {
            JSONObject a = com.applovin.impl.sdk.utils.g.a(jSONObject);
            com.applovin.impl.sdk.utils.g.d(a, this.b);
            com.applovin.impl.sdk.utils.g.c(jSONObject, this.b);
            com.applovin.impl.sdk.utils.g.e(jSONObject, this.b);
            Map<String, String> stringMap = JsonUtils.toStringMap((JSONObject) a.get(NativeProtocol.WEB_DIALOG_PARAMS));
            try {
                str = a.getString(IronSourceConstants.EVENTS_RESULT);
            } catch (Throwable unused) {
                str = "network_timeout";
            }
            return com.applovin.impl.sdk.b.c.a(str, stringMap);
        } catch (JSONException e) {
            a("Unable to parse API response", e);
            return null;
        }
    }

    protected abstract void a(com.applovin.impl.sdk.b.c cVar);

    protected abstract boolean b();

    @Override // com.applovin.impl.sdk.e.x
    protected int h() {
        return ((Integer) this.b.a(com.applovin.impl.sdk.c.b.bn)).intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        a(i(), new b.c<JSONObject>() { // from class: com.applovin.impl.sdk.e.aa.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject) {
                if (aa.this.b()) {
                    aa aaVar = aa.this;
                    aaVar.d("Reward validation failed with error code " + i + " but task was cancelled already");
                    return;
                }
                aa aaVar2 = aa.this;
                aaVar2.d("Reward validation failed with code " + i + " and error: " + str);
                aa.this.a(i);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i) {
                if (!aa.this.b()) {
                    aa aaVar = aa.this;
                    aaVar.a("Reward validation succeeded with code " + i + " and response: " + jSONObject);
                    aa.this.b(jSONObject);
                    return;
                }
                aa aaVar2 = aa.this;
                aaVar2.d("Reward validation succeeded with code " + i + " but task was cancelled already");
                aa aaVar3 = aa.this;
                aaVar3.d("Response: " + jSONObject);
            }
        });
    }
}
