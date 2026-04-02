package com.kwad.sdk.core.webview.d;

import android.content.Context;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.components.c;
import com.kwad.sdk.components.f;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.e;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.au;
import com.kwad.sdk.utils.be;
import com.kwad.sdk.utils.k;
import com.kwad.sdk.utils.y;
/* loaded from: classes.dex */
public final class a implements com.kwad.sdk.core.webview.c.a {

    /* renamed from: com.kwad.sdk.core.webview.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0262a extends com.kwad.sdk.core.response.a.a {
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
        public String amJ;
        public String amK;
        public String appId;
        public String appName;
        public String appVersion;
        public String ass;
        public String auc;
        public String auh;
        public String aui;
        public String auv;
        public String aze;
        public String azf;
        public boolean azg;
        public String azh;
        public String model;

        public static C0262a Ei() {
            C0262a c0262a = new C0262a();
            c0262a.Uk = BuildConfig.VERSION_NAME;
            c0262a.Ul = BuildConfig.VERSION_CODE;
            c0262a.ass = "5.0.3";
            c0262a.azh = "1.2";
            c0262a.Um = ((e) ServiceProvider.get(e.class)).getApiVersion();
            c0262a.Un = ((e) ServiceProvider.get(e.class)).getApiVersionCode();
            c0262a.Uo = 1;
            Context context = ((e) ServiceProvider.get(e.class)).getContext();
            c0262a.appVersion = k.bS(context);
            c0262a.appName = ((e) ServiceProvider.get(e.class)).getAppName();
            c0262a.appId = ((e) ServiceProvider.get(e.class)).getAppId();
            c0262a.aze = "";
            c0262a.aui = y.Iw();
            f fVar = (f) c.f(f.class);
            if (fVar != null) {
                c0262a.auh = fVar.nU();
            }
            c0262a.Up = String.valueOf(ag.cl(context));
            c0262a.Uq = be.JQ();
            c0262a.model = be.JH();
            c0262a.Ur = be.JJ();
            c0262a.Us = 1;
            c0262a.Ut = be.getOsVersion();
            c0262a.Uu = be.JT();
            c0262a.Uv = be.getLanguage();
            c0262a.Uw = be.getLocale();
            c0262a.azg = ((e) ServiceProvider.get(e.class)).getIsExternal();
            c0262a.azf = au.getDeviceId();
            c0262a.Ux = be.getScreenWidth(context);
            c0262a.Uy = be.getScreenHeight(context);
            c0262a.amJ = au.cw(context);
            c0262a.amK = au.getOaid();
            c0262a.auc = au.cx(context);
            c0262a.auv = au.cy(context);
            c0262a.Uz = com.kwad.sdk.d.a.a.getStatusBarHeight(context);
            c0262a.UA = com.kwad.sdk.d.a.a.a(context, 50.0f);
            return c0262a;
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        cVar.a(C0262a.Ei());
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "getDeviceInfo";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
