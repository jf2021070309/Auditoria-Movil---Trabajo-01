package com.kwad.components.core.c;

import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.components.DevelopMangerComponents;
import com.kwad.sdk.utils.v;
/* loaded from: classes.dex */
public final class b {
    private static void ah(String str) {
        if (!mm() || KsAdSDKImpl.get() == null || KsAdSDKImpl.get().getContext() == null) {
            return;
        }
        v.L(KsAdSDKImpl.get().getContext(), str);
    }

    public static void b(e eVar) {
        int mu = eVar.mu();
        ah("使用缓存策略: " + mu);
    }

    public static boolean mm() {
        DevelopMangerComponents developMangerComponents = (DevelopMangerComponents) com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
        return false;
    }
}
