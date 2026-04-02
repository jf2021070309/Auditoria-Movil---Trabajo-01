package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.aj;
import java.util.Map;
/* loaded from: classes.dex */
public final class e extends a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Map<String, String> map, com.fyber.inneractive.sdk.m.d dVar, aj ajVar) {
        super(map, dVar, ajVar);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public final void d() {
        int a = a("w");
        int a2 = a("h");
        this.c.a(b("url"), a <= 0 ? -1 : a, a2 <= 0 ? -1 : a2, c("shouldUseCustomClose"), c("lockOrientation"));
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public final String a() {
        return b("url");
    }
}
