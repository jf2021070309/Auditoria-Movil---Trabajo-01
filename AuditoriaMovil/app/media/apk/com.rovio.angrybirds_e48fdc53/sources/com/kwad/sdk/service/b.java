package com.kwad.sdk.service;

import com.ksad.annotation.invoker.ForInvoker;
import com.kwad.components.ad.feed.FeedDownloadActivityProxy;
import com.kwad.components.ad.fullscreen.KsFullScreenLandScapeVideoActivityProxy;
import com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy;
import com.kwad.components.ad.reward.KSRewardLandScapeVideoActivityProxy;
import com.kwad.components.ad.reward.KSRewardVideoActivityProxy;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.components.core.internal.api.VideoPlayConfigImpl;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.components.core.page.AdWebViewVideoActivityProxy;
import com.kwad.components.core.page.d;
import com.kwad.framework.filedownloader.services.FileDownloadServiceProxy;
import com.kwad.sdk.internal.api.SceneImpl;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class b {
    private static final Map<Class<?>, Class<?>> aHH = new HashMap();
    private static final Map<Class<?>, Class<?>> aHI = new HashMap();
    private static boolean aHJ = false;
    private static boolean aHK = false;

    private static synchronized void Hv() {
        synchronized (b.class) {
            if (aHJ) {
                return;
            }
            Hw();
            aHJ = true;
        }
    }

    @ForInvoker(methodId = "initComponentProxyForInvoker")
    private static void Hw() {
        FeedDownloadActivityProxy.register();
        KsFullScreenLandScapeVideoActivityProxy.register();
        KsFullScreenVideoActivityProxy.register();
        KSRewardLandScapeVideoActivityProxy.register();
        KSRewardVideoActivityProxy.register();
        com.kwad.components.core.page.a.register();
        AdWebViewActivityProxy.register();
        AdWebViewVideoActivityProxy.register();
        d.register();
        com.kwad.components.core.s.a.a.register();
        FileDownloadServiceProxy.register();
        com.kwad.sdk.collector.b.a.register();
        a.register();
    }

    private static synchronized void Hx() {
        synchronized (b.class) {
            if (aHK) {
                return;
            }
            Hy();
            aHK = true;
        }
    }

    @ForInvoker(methodId = "initModeImplForInvoker")
    private static void Hy() {
        KSAdVideoPlayConfigImpl.register();
        com.kwad.components.core.internal.api.d.register();
        VideoPlayConfigImpl.register();
        com.kwad.components.core.q.b.register();
        SceneImpl.register();
    }

    public static void a(Class<?> cls, Class<?> cls2) {
        aHH.put(cls, cls2);
    }

    public static void b(Class cls, Class cls2) {
        aHI.put(cls, cls2);
    }

    public static Class<?> g(Class<?> cls) {
        Hv();
        return aHH.get(cls);
    }

    public static Class<?> h(Class<?> cls) {
        Hx();
        return aHI.get(cls);
    }

    public static void init() {
        Hv();
        Hx();
    }
}
