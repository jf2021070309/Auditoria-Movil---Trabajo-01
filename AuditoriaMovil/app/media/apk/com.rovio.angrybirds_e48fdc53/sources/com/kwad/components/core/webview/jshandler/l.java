package com.kwad.components.core.webview.jshandler;

import android.text.TextUtils;
import com.kwad.components.core.webview.jshandler.m;
import com.kwad.sdk.service.ServiceProvider;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class l implements com.kwad.sdk.core.webview.c.a {
    private static boolean aI(String str) {
        m.a aVar = new m.a();
        try {
            aVar.parseJson(new JSONObject(str));
        } catch (JSONException e) {
        }
        if (TextUtils.isEmpty(aVar.key)) {
            return false;
        }
        com.kwad.sdk.utils.y.h(ServiceProvider.getContext(), "ksadsdk_js_storage_cache_name", aVar.key);
        return true;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (TextUtils.isEmpty(str)) {
            cVar.onError(-1, "data is empty");
        } else if (aI(str)) {
            cVar.a(null);
        } else {
            cVar.onError(-1, "");
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "removeStorageItem";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
