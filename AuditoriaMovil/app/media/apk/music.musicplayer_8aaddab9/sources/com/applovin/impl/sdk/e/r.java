package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class r extends com.applovin.impl.sdk.e.a {
    private final AppLovinAdLoadListener a;

    /* renamed from: c  reason: collision with root package name */
    private final a f4083c;

    /* loaded from: classes.dex */
    public static final class a extends com.applovin.impl.a.e {
        public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.m mVar) {
            super(jSONObject, jSONObject2, bVar, mVar);
        }

        public void a(com.applovin.impl.sdk.utils.q qVar) {
            if (qVar == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.a.add(qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends r {
        private final String a;

        public b(String str, com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
            super(eVar, appLovinAdLoadListener, mVar);
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a(e(this.a));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends r {
        private final JSONObject a;

        public c(com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
            super(eVar, appLovinAdLoadListener, mVar);
            this.a = eVar.c();
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.a.f fVar;
            a("Processing SDK JSON response...");
            String string = JsonUtils.getString(this.a, "xml", null);
            if (!StringUtils.isValidString(string)) {
                d("No VAST response received.");
                fVar = com.applovin.impl.a.f.NO_WRAPPER_RESPONSE;
            } else if (string.length() < ((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.ek)).intValue()) {
                a(e(string));
                return;
            } else {
                d("VAST response is over max length");
                fVar = com.applovin.impl.a.f.XML_PARSING;
            }
            a(fVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends r {
        private final com.applovin.impl.sdk.utils.q a;

        public d(com.applovin.impl.sdk.utils.q qVar, com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
            super(eVar, appLovinAdLoadListener, mVar);
            if (qVar == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (eVar == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.a = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a("Processing VAST Wrapper response...");
            a(this.a);
        }
    }

    public r(com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super("TaskProcessVastResponse", mVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.a = appLovinAdLoadListener;
        this.f4083c = (a) eVar;
    }

    public static r a(com.applovin.impl.sdk.utils.q qVar, com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        return new d(qVar, eVar, appLovinAdLoadListener, mVar);
    }

    public static r a(String str, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        return new b(str, new a(jSONObject, jSONObject2, bVar, mVar), appLovinAdLoadListener, mVar);
    }

    public static r a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        return new c(new a(jSONObject, jSONObject2, bVar, mVar), appLovinAdLoadListener, mVar);
    }

    public void a(com.applovin.impl.a.f fVar) {
        d("Failed to process VAST response due to VAST error code " + fVar);
        com.applovin.impl.a.l.a(this.f4083c, this.a, fVar, -6, this.f4020b);
    }

    public void a(com.applovin.impl.sdk.utils.q qVar) {
        com.applovin.impl.a.f fVar;
        com.applovin.impl.sdk.e.a tVar;
        int a2 = this.f4083c.a();
        a("Finished parsing XML at depth " + a2);
        this.f4083c.a(qVar);
        if (!com.applovin.impl.a.l.a(qVar)) {
            if (com.applovin.impl.a.l.b(qVar)) {
                a("VAST response is inline. Rendering ad...");
                tVar = new t(this.f4083c, this.a, this.f4020b);
                this.f4020b.S().a(tVar);
                return;
            }
            d("VAST response is an error");
            fVar = com.applovin.impl.a.f.NO_WRAPPER_RESPONSE;
            a(fVar);
        }
        int intValue = ((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.el)).intValue();
        if (a2 < intValue) {
            a("VAST response is wrapper. Resolving...");
            tVar = new x(this.f4083c, this.a, this.f4020b);
            this.f4020b.S().a(tVar);
            return;
        }
        d("Reached beyond max wrapper depth of " + intValue);
        fVar = com.applovin.impl.a.f.WRAPPER_LIMIT_REACHED;
        a(fVar);
    }

    public com.applovin.impl.sdk.utils.q e(String str) {
        try {
            return com.applovin.impl.sdk.utils.r.a(str, this.f4020b);
        } catch (Throwable th) {
            a("Failed to process VAST response", th);
            a(com.applovin.impl.a.f.XML_PARSING);
            return null;
        }
    }
}
