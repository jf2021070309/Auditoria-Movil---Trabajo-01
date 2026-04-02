package com.kwad.sdk.core.network;

import android.util.Log;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.components.DevelopMangerComponents;
import com.kwad.sdk.core.request.model.StatusInfo;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes.dex */
public abstract class d extends b {
    public static final String TRACK_ID_KEY = "kuaishou-tracing-token";
    private static int sLiveSupportMode = 0;

    public d() {
        this(0, null);
    }

    public d(int i, SceneImpl sceneImpl) {
        putBody("deviceInfo", com.kwad.sdk.core.request.model.b.g(needAppList(), i));
        putBody("statusInfo", StatusInfo.b(sceneImpl));
    }

    @Override // com.kwad.sdk.core.network.b
    protected void buildBaseBody() {
        putBody("protocolVersion", "2.0");
        putBody("SDKVersion", BuildConfig.VERSION_NAME);
        putBody("SDKVersionCode", BuildConfig.VERSION_CODE);
        putBody("sdkApiVersion", ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getApiVersion());
        putBody("sdkApiVersionCode", ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getApiVersionCode());
        putBody("sdkType", 1);
        putBody("appInfo", com.kwad.sdk.core.request.model.a.Cq());
        putBody("tkVersion", "5.0.3");
        putBody("networkInfo", com.kwad.sdk.core.request.model.d.Cu());
        if (sLiveSupportMode == 0 && ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).oi()) {
            sLiveSupportMode = 1;
        }
        Log.d("CommonBaseRequest", "sLiveSupportMode :" + sLiveSupportMode);
        putBody("liveSupportMode", sLiveSupportMode);
        putBody("geoInfo", com.kwad.sdk.core.request.model.c.Ct());
        putBody("ext", com.kwad.sdk.core.request.model.e.Cw());
        putBody("userInfo", com.kwad.sdk.core.request.model.g.Cx());
        putBody("requestSessionData", r.Bi().cZ(getUrl()));
    }

    @Override // com.kwad.sdk.core.network.b
    protected void buildBaseHeader() {
        String url = getUrl();
        if (!com.kwad.framework.a.a.mp.booleanValue() || url == null || url.contains(com.kwad.sdk.h.xd())) {
            return;
        }
        com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
        addHeader("trace-context", "{\"laneId\":\"STAGING.online.u\"}");
        com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
    }

    protected boolean needAppList() {
        return false;
    }
}
