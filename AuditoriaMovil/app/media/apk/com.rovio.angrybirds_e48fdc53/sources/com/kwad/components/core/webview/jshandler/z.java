package com.kwad.components.core.webview.jshandler;

import android.content.Context;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.be;
/* loaded from: classes.dex */
public final class z implements com.kwad.sdk.core.webview.c.a {

    /* loaded from: classes.dex */
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public int UA;
        public String Uk;
        public int Ul;
        public String Um;
        public int Un;
        public int Uo;
        public String Up;
        public String Uq;
        public String Ur;
        public int Us;
        public String Ut;
        public int Uu;
        public String Uv;
        public String Uw;
        public int Ux;
        public int Uy;
        public int Uz;
        public String appId;
        public String appName;
        public String appVersion;
        public String model;

        public static a ry() {
            a aVar = new a();
            aVar.Uk = BuildConfig.VERSION_NAME;
            aVar.Ul = BuildConfig.VERSION_CODE;
            aVar.Um = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getApiVersion();
            aVar.Un = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getApiVersionCode();
            aVar.Uo = 1;
            Context context = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext();
            aVar.appVersion = com.kwad.sdk.utils.k.bS(context);
            aVar.appName = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getAppName();
            aVar.appId = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getAppId();
            aVar.Up = String.valueOf(com.kwad.sdk.utils.ag.cl(context));
            aVar.Uq = be.JQ();
            aVar.model = be.JH();
            aVar.Ur = be.JJ();
            aVar.Us = 1;
            aVar.Ut = be.getOsVersion();
            aVar.Uu = be.JT();
            aVar.Uv = be.getLanguage();
            aVar.Uw = be.getLocale();
            aVar.Ux = be.getScreenWidth(context);
            aVar.Uy = be.getScreenHeight(context);
            aVar.Uz = com.kwad.sdk.d.a.a.getStatusBarHeight(context);
            aVar.UA = com.kwad.sdk.d.a.a.a(context, 50.0f);
            return aVar;
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        cVar.a(a.ry());
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "getKsPlayableDeviceInfo";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
