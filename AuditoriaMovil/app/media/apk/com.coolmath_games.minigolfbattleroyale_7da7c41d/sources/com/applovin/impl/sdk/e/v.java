package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.internal.NativeProtocol;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class v extends x {
    /* JADX INFO: Access modifiers changed from: protected */
    public v(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private JSONObject a(com.applovin.impl.sdk.b.c cVar) {
        JSONObject i = i();
        JsonUtils.putString(i, IronSourceConstants.EVENTS_RESULT, cVar.b());
        Map<String, String> a = cVar.a();
        if (a != null) {
            JsonUtils.putJSONObject(i, NativeProtocol.WEB_DIALOG_PARAMS, new JSONObject(a));
        }
        return i;
    }

    protected abstract com.applovin.impl.sdk.b.c b();

    protected abstract void b(JSONObject jSONObject);

    protected abstract void c();

    @Override // com.applovin.impl.sdk.e.x
    protected int h() {
        return ((Integer) this.b.a(com.applovin.impl.sdk.c.b.bo)).intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.b.c b = b();
        if (b == null) {
            d("Pending reward not found");
            c();
            return;
        }
        a("Reporting pending reward: " + b + "...");
        a(a(b), new b.c<JSONObject>() { // from class: com.applovin.impl.sdk.e.v.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject) {
                v.this.a(i);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i) {
                v.this.b(jSONObject);
            }
        });
    }
}
