package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.facebook.internal.NativeProtocol;
import com.ironsource.sdk.controller.w;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h {
    private static final String c = h.class.getCanonicalName();
    private final d a;
    private final t b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(d dVar, t tVar) {
        this.a = dVar;
        this.b = tVar;
    }

    private static String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put(NativeProtocol.WEB_DIALOG_PARAMS, SDKUtils.encodeString(str2));
            jSONObject.put("hash", SDKUtils.encodeString(str3));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public final void messageHandler(String str, String str2, String str3) {
        try {
            String str4 = c;
            Logger.i(str4, "messageHandler(" + str + " " + str3 + ")");
            if (this.b.a(str, str2, str3)) {
                this.a.a(str, str2);
                return;
            }
            d dVar = this.a;
            String a = a(str, str2, str3);
            if (dVar.a != null) {
                w.d dVar2 = dVar.a;
                w.this.b(w.a(w.this, "unauthorizedMessage", a, (String) null, (String) null));
            }
        } catch (Exception e) {
            e.printStackTrace();
            String str5 = c;
            Logger.i(str5, "messageHandler failed with exception " + e.getMessage());
        }
    }
}
