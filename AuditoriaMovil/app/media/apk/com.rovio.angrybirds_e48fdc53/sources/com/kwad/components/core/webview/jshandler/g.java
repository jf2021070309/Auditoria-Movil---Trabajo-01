package com.kwad.components.core.webview.jshandler;

import android.text.TextUtils;
import com.kwad.components.core.webview.jshandler.m;
import com.kwad.sdk.service.ServiceProvider;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g implements com.kwad.sdk.core.webview.c.a {
    private static String aH(String str) {
        m.a aVar = new m.a();
        try {
            aVar.parseJson(new JSONObject(str));
        } catch (JSONException e) {
        }
        return TextUtils.isEmpty(aVar.key) ? "" : com.kwad.sdk.utils.y.b(ServiceProvider.getContext(), "ksadsdk_js_storage_cache_name", aVar.key, "");
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (TextUtils.isEmpty(str)) {
            cVar.onError(-1, "data is empty");
            return;
        }
        String aH = aH(str);
        m.a aVar = new m.a();
        aVar.value = aH;
        cVar.a(aVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "getStorageItem";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
