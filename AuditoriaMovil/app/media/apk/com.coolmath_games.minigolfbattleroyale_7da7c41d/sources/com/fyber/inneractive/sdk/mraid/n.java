package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.aj;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n extends b {
    @Override // com.fyber.inneractive.sdk.mraid.b
    public final boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Map<String, String> map, com.fyber.inneractive.sdk.m.d dVar, aj ajVar) {
        super(map, dVar, ajVar);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public final void d() {
        int a = a("w");
        int a2 = a("h");
        int a3 = a("offsetX");
        int a4 = a("offsetY");
        boolean c = c("allowOffscreen");
        b("customClosePosition");
        if (a <= 0) {
            a = this.c.y;
        }
        int i = a;
        if (a2 <= 0) {
            a2 = this.c.z;
        }
        this.c.a(i, a2, a3, a4, c);
    }
}
