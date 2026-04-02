package com.fyber.inneractive.sdk.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.c.b;
import com.fyber.inneractive.sdk.c.c;
import com.fyber.inneractive.sdk.c.d;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
/* loaded from: classes.dex */
public class IAMraidKit extends BroadcastReceiver {
    private static final r.a sProvider = new r.a() { // from class: com.fyber.inneractive.sdk.mraid.IAMraidKit.1
        @Override // com.fyber.inneractive.sdk.util.r.a
        public final boolean a(String str) {
            return false;
        }

        @Override // com.fyber.inneractive.sdk.util.r.a
        public final r.b a() {
            return r.b.Mraid;
        }
    };

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IAlog.b("IAMraidKit: onReceive in package: %s", com.fyber.inneractive.sdk.util.k.a(context.getApplicationContext()));
        IAConfigManager.a(sProvider);
        c.b bVar = new c.b() { // from class: com.fyber.inneractive.sdk.mraid.IAMraidKit.2
            @Override // com.fyber.inneractive.sdk.c.c.b
            public final com.fyber.inneractive.sdk.j.b a() {
                return new com.fyber.inneractive.sdk.j.c();
            }

            @Override // com.fyber.inneractive.sdk.c.c.b
            public final /* synthetic */ com.fyber.inneractive.sdk.e.a b() {
                return new com.fyber.inneractive.sdk.d.e();
            }
        };
        c.a.a.a(com.fyber.inneractive.sdk.j.a.RETURNED_ADTYPE_HTML, bVar);
        c.a.a.a(com.fyber.inneractive.sdk.j.a.RETURNED_ADTYPE_MRAID, bVar);
        d.b.a.a(new d.a() { // from class: com.fyber.inneractive.sdk.mraid.IAMraidKit.3
            @Override // com.fyber.inneractive.sdk.c.d.a
            public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
                return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
            }

            @Override // com.fyber.inneractive.sdk.c.d.a
            public final com.fyber.inneractive.sdk.e.c b(InneractiveAdSpot inneractiveAdSpot) {
                return new com.fyber.inneractive.sdk.i.g();
            }
        });
        b.C0039b.a.a(new b.a() { // from class: com.fyber.inneractive.sdk.mraid.IAMraidKit.4
            @Override // com.fyber.inneractive.sdk.c.b.a
            public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
                return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
            }

            @Override // com.fyber.inneractive.sdk.c.b.a
            public final com.fyber.inneractive.sdk.e.b a() {
                return new com.fyber.inneractive.sdk.i.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isMRaidSpotContent(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof com.fyber.inneractive.sdk.d.m);
    }
}
