package com.fyber.inneractive.sdk.h;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.h.n;
/* loaded from: classes.dex */
public final class o {
    public static void a(String str, String str2, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar) {
        n.a aVar = new n.a(m.CAUGHT_EXCEPTION, inneractiveAdRequest, eVar);
        aVar.a(new n.b().a("exception_name", str).a("description", str2));
        aVar.b(null);
    }
}
