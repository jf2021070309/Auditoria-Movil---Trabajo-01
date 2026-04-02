package com.kwad.sdk.service;

import com.kwad.sdk.service.a.d;
/* loaded from: classes3.dex */
public final class c {
    public static void gatherException(Throwable th) {
        d dVar = (d) ServiceProvider.get(d.class);
        if (dVar != null) {
            dVar.gatherException(th);
        }
    }
}
