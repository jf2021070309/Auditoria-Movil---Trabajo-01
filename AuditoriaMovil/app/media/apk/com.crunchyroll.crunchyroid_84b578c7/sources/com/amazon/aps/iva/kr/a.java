package com.amazon.aps.iva.kr;

import com.amazon.aps.iva.b30.j;
import com.amazon.aps.iva.fb0.d;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.mq.e;
import com.amazon.aps.iva.ur.c;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import okhttp3.CipherSuite;
/* compiled from: AndroidTracer.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.ur.c {
    public final com.amazon.aps.iva.ur.d r;
    public final boolean s;

    /* compiled from: AndroidTracer.kt */
    /* renamed from: com.amazon.aps.iva.kr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0455a {
        public final com.amazon.aps.iva.ur.d a;
        public boolean b;
        public final String c;
        public final int d;
        public final SecureRandom e;
        public final LinkedHashMap f;

        public C0455a() {
            com.amazon.aps.iva.sp.c cVar;
            e cVar2;
            CipherSuite[] cipherSuiteArr = com.amazon.aps.iva.lp.a.c;
            String str = com.amazon.aps.iva.lp.a.q;
            CipherSuite[] cipherSuiteArr2 = com.amazon.aps.iva.lp.a.c;
            com.amazon.aps.iva.jq.a aVar = com.amazon.aps.iva.jq.a.f;
            if (aVar.d()) {
                cVar = aVar.b.b();
            } else {
                com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "You're trying to create a Logger instance, but the SDK was not yet initialized. This Logger will not be able to send any messages. Please initialize the Datadog SDK first before creating a new Logger instance.\nPlease add the following code in your application's onCreate() method:\nval credentials = Credentials(\"<CLIENT_TOKEN>\", \"<ENVIRONMENT>\", \"<VARIANT>\", \"<APPLICATION_ID>\")\nDatadog.initialize(context, credentials, configuration, trackingConsent);", null, 6);
                cVar = null;
            }
            if (cVar == null) {
                cVar2 = new com.amazon.aps.iva.cq.b();
            } else {
                cVar2 = new com.amazon.aps.iva.mq.c(new com.amazon.aps.iva.kq.b(str, "trace", null, com.amazon.aps.iva.lp.a.k, com.amazon.aps.iva.lp.a.i, com.amazon.aps.iva.lp.a.s, com.amazon.aps.iva.lp.a.w, com.amazon.aps.iva.lp.a.x, com.amazon.aps.iva.lp.a.p), cVar, true, true, new com.amazon.aps.iva.zp.a(1.0f), -1);
            }
            this.a = new j(new com.amazon.aps.iva.iq.a(cVar2));
            this.b = true;
            this.c = com.amazon.aps.iva.lp.a.q;
            this.d = 5;
            this.e = new SecureRandom();
            this.f = new LinkedHashMap();
        }

        public final a a() {
            if (!com.amazon.aps.iva.lr.a.f.d()) {
                com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "You're trying to create an AndroidTracer instance, but either the SDK was not initialized or the Tracing feature was disabled in your Configuration. No tracing data will be sent.\nPlease add the following code in your application's onCreate() method:\nval credentials = Credentials(\"<CLIENT_TOKEN>\", \"<ENVIRONMENT>\", \"<VARIANT>\", \"<APPLICATION_ID>\")\nDatadog.initialize(context, credentials, configuration, trackingConsent);", null, 6);
            }
            if (this.b && !com.amazon.aps.iva.tq.c.f.d()) {
                com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "You're trying to bundle the traces with a RUM context, but the RUM feature was disabled in your Configuration. No RUM context will be attached to your traces in this case.", null, 6);
                this.b = false;
            }
            Properties properties = new Properties();
            properties.setProperty("service.name", this.c);
            properties.setProperty("trace.partial.flush.min.spans", String.valueOf(this.d));
            LinkedHashMap linkedHashMap = this.f;
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                arrayList.add(key + ":" + value);
            }
            properties.setProperty("tags", x.B0(arrayList, ",", null, null, null, 62));
            com.amazon.aps.iva.zr.a aVar = com.amazon.aps.iva.zr.a.v0;
            if (!properties.isEmpty()) {
                aVar = new com.amazon.aps.iva.zr.a(properties, aVar);
            }
            com.amazon.aps.iva.yb0.j.e(aVar, "get(properties())");
            return new a(aVar, new com.amazon.aps.iva.mr.a(com.amazon.aps.iva.lr.a.f.b.b()), this.e, this.a, this.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.zr.a aVar, com.amazon.aps.iva.mr.a aVar2, SecureRandom secureRandom, com.amazon.aps.iva.ur.d dVar, boolean z) {
        super(aVar, aVar2, secureRandom);
        com.amazon.aps.iva.yb0.j.f(secureRandom, "random");
        com.amazon.aps.iva.yb0.j.f(dVar, "logsHandler");
        this.r = dVar;
        this.s = z;
    }

    @Override // com.amazon.aps.iva.ur.c, com.amazon.aps.iva.fb0.d
    public final d.a e0() {
        c.b bVar = new c.b(this.e);
        com.amazon.aps.iva.ur.d dVar = this.r;
        if (dVar != null) {
            bVar.h = dVar;
        }
        if (this.s) {
            com.amazon.aps.iva.vq.a a = com.amazon.aps.iva.sq.c.a();
            bVar.b("application_id", a.a);
            bVar.b("session_id", a.b);
            bVar.b("view.id", a.c);
            bVar.b("user_action.id", a.f);
        }
        return bVar;
    }
}
