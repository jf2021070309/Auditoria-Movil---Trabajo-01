package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.mraid.f;
import com.fyber.inneractive.sdk.util.aj;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g extends b {
    @Override // com.fyber.inneractive.sdk.mraid.b
    public final boolean b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Map<String, String> map, com.fyber.inneractive.sdk.m.d dVar, aj ajVar) {
        super(map, dVar, ajVar);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public final void d() {
        this.c.a(f.a.GET_CURRENT_POSITION, "Unsupported action getCurrentPosition");
    }
}
