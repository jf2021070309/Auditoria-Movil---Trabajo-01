package com.kwad.sdk.core.request.model;

import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.t;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class StatusInfo extends com.kwad.sdk.core.response.a.a {
    public SplashAdInfo auB;
    public NativeAdRequestInfo auC;
    public int auz = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).isPersonalRecommend() ? 1 : 0;
    public int auA = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).isProgrammaticRecommend() ? 1 : 0;
    public List<f> auD = com.kwad.sdk.core.d.a.AX();

    /* loaded from: classes.dex */
    public static final class NativeAdRequestInfo extends com.kwad.sdk.core.response.a.a implements Serializable {
        private static final long serialVersionUID = -7917397487136276024L;
        public NativeAdStyleControl nativeAdStyleControl;

        public static NativeAdRequestInfo create(SceneImpl sceneImpl) {
            NativeAdRequestInfo nativeAdRequestInfo = new NativeAdRequestInfo();
            nativeAdRequestInfo.nativeAdStyleControl = com.kwad.sdk.utils.b.d(sceneImpl);
            return nativeAdRequestInfo;
        }
    }

    /* loaded from: classes.dex */
    public static final class NativeAdStyleControl extends com.kwad.sdk.core.response.a.a implements Serializable {
        private static final long serialVersionUID = -6047032783829467891L;
        public boolean enableShake;

        @Override // com.kwad.sdk.core.response.a.a
        public final void afterToJson(JSONObject jSONObject) {
            super.afterToJson(jSONObject);
            t.putValue(jSONObject, "enableShake", this.enableShake);
        }
    }

    /* loaded from: classes.dex */
    public static final class SplashAdInfo extends com.kwad.sdk.core.response.a.a implements Serializable {
        private static final long serialVersionUID = 7910709346852904072L;
        public int dailyShowCount;
        public SplashStyleControl splashStyleControl;

        public static SplashAdInfo create(SceneImpl sceneImpl) {
            SplashAdInfo splashAdInfo = new SplashAdInfo();
            splashAdInfo.dailyShowCount = com.kwad.sdk.utils.b.HC();
            splashAdInfo.splashStyleControl = com.kwad.sdk.utils.b.c(sceneImpl);
            return splashAdInfo;
        }
    }

    /* loaded from: classes.dex */
    public static final class SplashStyleControl extends com.kwad.sdk.core.response.a.a implements Serializable {
        private static final long serialVersionUID = -6510852657198503314L;
        public boolean disableRotate;
        public boolean disableShake;
        public boolean disableSlide;
    }

    private StatusInfo(SceneImpl sceneImpl) {
        this.auC = NativeAdRequestInfo.create(sceneImpl);
        this.auB = SplashAdInfo.create(sceneImpl);
    }

    public static StatusInfo b(SceneImpl sceneImpl) {
        return new StatusInfo(sceneImpl);
    }
}
