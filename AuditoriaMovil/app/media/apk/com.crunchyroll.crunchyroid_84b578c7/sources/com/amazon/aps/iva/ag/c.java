package com.amazon.aps.iva.ag;

import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.jp.d;
import com.amazon.aps.iva.jp.g;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.l;
import okhttp3.CipherSuite;
/* compiled from: DatadogWrapperFactory.kt */
/* loaded from: classes.dex */
public final class c {
    public static b b;
    public static final c a = new c();
    public static final m c = f.b(a.h);

    /* compiled from: DatadogWrapperFactory.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ag.a> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ag.a invoke() {
            com.amazon.aps.iva.sp.c cVar;
            com.amazon.aps.iva.mq.e cVar2;
            g gVar = new g(z.b, new com.amazon.aps.iva.hc.m(), com.amazon.aps.iva.lp.a.f, new n(), new com.amazon.aps.iva.zp.a(20.0f / 100), com.amazon.aps.iva.jp.f.h);
            d.a aVar = new d.a();
            CipherSuite[] cipherSuiteArr = com.amazon.aps.iva.lp.a.c;
            String str = com.amazon.aps.iva.lp.a.q;
            String str2 = com.amazon.aps.iva.lp.a.o;
            com.amazon.aps.iva.jq.a aVar2 = com.amazon.aps.iva.jq.a.f;
            if (aVar2.d()) {
                cVar = aVar2.b.b();
            } else {
                com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "You're trying to create a Logger instance, but the SDK was not yet initialized. This Logger will not be able to send any messages. Please initialize the Datadog SDK first before creating a new Logger instance.\nPlease add the following code in your application's onCreate() method:\nval credentials = Credentials(\"<CLIENT_TOKEN>\", \"<ENVIRONMENT>\", \"<VARIANT>\", \"<APPLICATION_ID>\")\nDatadog.initialize(context, credentials, configuration, trackingConsent);", null, 6);
                cVar = null;
            }
            if (cVar == null) {
                cVar2 = new com.amazon.aps.iva.cq.b();
            } else {
                cVar2 = new com.amazon.aps.iva.mq.c(new com.amazon.aps.iva.kq.b(str, str2, com.amazon.aps.iva.lp.a.g, com.amazon.aps.iva.lp.a.k, com.amazon.aps.iva.lp.a.i, com.amazon.aps.iva.lp.a.s, com.amazon.aps.iva.lp.a.w, com.amazon.aps.iva.lp.a.x, com.amazon.aps.iva.lp.a.p), cVar, true, true, new com.amazon.aps.iva.zp.a(1.0f), 7);
            }
            return new com.amazon.aps.iva.ag.a(gVar, aVar, new com.amazon.aps.iva.jr.a(new com.amazon.aps.iva.iq.a(cVar2)));
        }
    }
}
