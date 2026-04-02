package com.fyber.inneractive.sdk.dv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.c.b;
import com.fyber.inneractive.sdk.c.c;
import com.fyber.inneractive.sdk.c.d;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k;
/* loaded from: classes.dex */
public class DVKit extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IAlog.b("DVKit: onReceive in package: %s", k.a(context.getApplicationContext()));
        c.a.a.a(com.fyber.inneractive.sdk.j.a.RETURNED_ADTYPE_MOBILE_ADS, new c.b() { // from class: com.fyber.inneractive.sdk.dv.DVKit.1
            @Override // com.fyber.inneractive.sdk.c.c.b
            public final com.fyber.inneractive.sdk.j.b a() {
                return new d();
            }

            @Override // com.fyber.inneractive.sdk.c.c.b
            public final /* synthetic */ com.fyber.inneractive.sdk.e.a b() {
                return new b();
            }
        });
        d.b.a.a(new d.a() { // from class: com.fyber.inneractive.sdk.dv.DVKit.2
            @Override // com.fyber.inneractive.sdk.c.d.a
            public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
                return IAConfigManager.d() != null && (inneractiveAdSpot.getAdContent() instanceof a);
            }

            @Override // com.fyber.inneractive.sdk.c.d.a
            public final com.fyber.inneractive.sdk.e.c b(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveAdRequest g = inneractiveAdSpot.getAdContent().g();
                boolean z = g == null || g.getAllowFullscreen();
                if (inneractiveAdSpot.getAdContent().a_() && z) {
                    if (inneractiveAdSpot.getAdContent().f().r == UnitDisplayType.INTERSTITIAL) {
                        return new com.fyber.inneractive.sdk.dv.d.d();
                    }
                    return new com.fyber.inneractive.sdk.dv.e.c();
                }
                return null;
            }
        });
        b.C0039b.a.a(new b.a() { // from class: com.fyber.inneractive.sdk.dv.DVKit.3
            @Override // com.fyber.inneractive.sdk.c.b.a
            public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
                return DVKit.a(inneractiveAdSpot);
            }

            @Override // com.fyber.inneractive.sdk.c.b.a
            public final com.fyber.inneractive.sdk.e.b a() {
                return new com.fyber.inneractive.sdk.dv.a.b();
            }
        });
    }

    static /* synthetic */ boolean a(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof a);
    }
}
