package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.mraid.f;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
import com.fyber.inneractive.sdk.util.u;
import java.util.Map;
/* loaded from: classes.dex */
public final class l extends a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Map<String, String> map, com.fyber.inneractive.sdk.m.d dVar, aj ajVar) {
        super(map, dVar, ajVar);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public final void d() {
        String b = b("url");
        IAlog.a("IAmraidActionOpen: opening Internal Browser For Url: %s", b);
        if (this.c != null) {
            u.a c = this.c.c(b, this.d);
            if (c.a == u.c.FAILED) {
                this.c.a(f.a.OPEN, c.b == null ? "unknown error" : c.b.getMessage());
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public final void c() {
        super.c();
        if (this.c != null) {
            this.c.a(f.a.OPEN, "No native click was detected in a timely fashion");
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public final String a() {
        return b("url");
    }
}
