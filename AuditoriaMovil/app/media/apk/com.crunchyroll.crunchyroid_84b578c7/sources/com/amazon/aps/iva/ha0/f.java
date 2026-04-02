package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.fa0.t;
import com.google.android.gms.cast.framework.media.NotificationOptions;
/* loaded from: classes4.dex */
public final class f extends c {
    public long d;
    public final com.amazon.aps.iva.ia0.a e;
    public boolean f;

    public f(com.amazon.aps.iva.da0.f fVar) {
        super(fVar);
        this.d = 0L;
        this.f = false;
        this.e = new com.amazon.aps.iva.ia0.a();
    }

    @Override // com.amazon.aps.iva.ha0.c, com.amazon.aps.iva.da0.g
    public final void b(com.amazon.aps.iva.da0.e eVar) {
        boolean t = eVar.t();
        com.amazon.aps.iva.ia0.a aVar = this.e;
        if (t) {
            this.d = aVar.a();
        } else if (eVar.w()) {
            if (eVar.getType() == "internalheartbeat") {
                if (!this.f) {
                    this.d = 0L;
                }
                this.f = true;
            } else if (eVar.getType() == "internalheartbeatend") {
                this.f = false;
            }
            if (this.f) {
                long j = this.d;
                if (j > 0 && j + NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS < aVar.a()) {
                    this.d = aVar.a();
                    c(new com.amazon.aps.iva.fa0.m(((t) eVar).d, 0));
                }
            }
        }
    }
}
