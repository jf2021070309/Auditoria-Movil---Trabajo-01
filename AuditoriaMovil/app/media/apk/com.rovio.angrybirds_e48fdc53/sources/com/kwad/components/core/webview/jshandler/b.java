package com.kwad.components.core.webview.jshandler;

import android.text.TextUtils;
import com.kwad.sdk.service.ServiceProvider;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b implements com.kwad.sdk.core.webview.c.a {

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public boolean Tw;

        @Override // com.kwad.sdk.core.response.a.a, com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            com.kwad.sdk.utils.t.putValue(jSONObject, "isInstalled", this.Tw);
            return jSONObject;
        }
    }

    /* renamed from: com.kwad.components.core.webview.jshandler.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0219b extends com.kwad.sdk.core.response.a.a {
        public String packageName;
    }

    private static boolean aG(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return com.kwad.sdk.utils.ak.ak(ServiceProvider.getContext(), str);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        C0219b c0219b = new C0219b();
        try {
            c0219b.parseJson(new JSONObject(str));
        } catch (Exception e) {
        }
        a aVar = new a();
        aVar.Tw = aG(c0219b.packageName);
        cVar.a(aVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "isAppInstalled";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
