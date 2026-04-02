package com.kwad.components.core.webview.jshandler;

import android.text.TextUtils;
import com.kwad.sdk.service.ServiceProvider;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class m implements com.kwad.sdk.core.webview.c.a {

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public String key;
        public String value;
    }

    private static boolean aJ(String str) {
        a aVar = new a();
        try {
            aVar.parseJson(new JSONObject(str));
        } catch (JSONException e) {
        }
        if (TextUtils.isEmpty(aVar.key) || TextUtils.isEmpty(aVar.value)) {
            return false;
        }
        com.kwad.sdk.utils.y.a(ServiceProvider.getContext(), "ksadsdk_js_storage_cache_name", aVar.key, aVar.value);
        return true;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (TextUtils.isEmpty(str)) {
            cVar.onError(-1, "data is empty");
        } else if (aJ(str)) {
            cVar.a(null);
        } else {
            cVar.onError(-1, "");
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "setStorageItem";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
