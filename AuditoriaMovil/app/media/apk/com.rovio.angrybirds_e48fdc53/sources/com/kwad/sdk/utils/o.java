package com.kwad.sdk.utils;

import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes3.dex */
public final class o {
    private static boolean aIs;
    private static boolean aIt;

    public static boolean HU() {
        return (!((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(2L)) & aIs;
    }

    public static boolean HV() {
        return (!((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(4L)) & aIs;
    }

    public static boolean HW() {
        return ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).xu() && aIs;
    }

    public static boolean HX() {
        return (!((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(16L)) & aIs;
    }

    public static boolean HY() {
        return (!((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(4096L)) & aIs;
    }

    public static boolean HZ() {
        return (!((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(1L)) & aIs;
    }

    public static boolean Ia() {
        return (!((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(128L)) & aIs;
    }

    public static boolean Ib() {
        return (!((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(128L)) & aIs;
    }

    public static synchronized void bE(boolean z) {
        synchronized (o.class) {
            if (aIt) {
                return;
            }
            aIt = true;
            aIs = true;
            ((com.kwad.sdk.service.a.b) ServiceProvider.get(com.kwad.sdk.service.a.b.class)).xp();
        }
    }
}
