package com.kwad.sdk.core.network.b;

import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.f;
/* loaded from: classes.dex */
public final class c {
    public static b By() {
        f fVar = (f) ServiceProvider.get(f.class);
        return (fVar == null || !fVar.xC()) ? new a() : new d();
    }
}
