package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class q extends com.applovin.impl.sdk.e.a {
    private final AppLovinAdLoadListener a;
    private final a c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends com.applovin.impl.a.c {
        a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.a.b bVar, com.applovin.impl.sdk.k kVar) {
            super(jSONObject, jSONObject2, bVar, kVar);
        }

        void a(com.applovin.impl.sdk.utils.p pVar) {
            if (pVar == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.a.add(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends q {
        private final JSONObject a;

        b(com.applovin.impl.a.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(cVar, appLovinAdLoadListener, kVar);
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.a = cVar.c();
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.a.d dVar;
            a("Processing SDK JSON response...");
            String string = JsonUtils.getString(this.a, "xml", null);
            if (StringUtils.isValidString(string)) {
                if (string.length() < ((Integer) this.b.a(com.applovin.impl.sdk.c.b.ee)).intValue()) {
                    try {
                        a(com.applovin.impl.sdk.utils.q.a(string, this.b));
                        return;
                    } catch (Throwable th) {
                        a("Unable to parse VAST response", th);
                    }
                } else {
                    d("VAST response is over max length");
                }
                dVar = com.applovin.impl.a.d.XML_PARSING;
            } else {
                d("No VAST response received.");
                dVar = com.applovin.impl.a.d.NO_WRAPPER_RESPONSE;
            }
            a(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends q {
        private final com.applovin.impl.sdk.utils.p a;

        c(com.applovin.impl.sdk.utils.p pVar, com.applovin.impl.a.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(cVar, appLovinAdLoadListener, kVar);
            if (pVar == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (cVar == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.a = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a("Processing VAST Wrapper response...");
            a(this.a);
        }
    }

    q(com.applovin.impl.a.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessVastResponse", kVar);
        if (cVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.a = appLovinAdLoadListener;
        this.c = (a) cVar;
    }

    public static q a(com.applovin.impl.sdk.utils.p pVar, com.applovin.impl.a.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new c(pVar, cVar, appLovinAdLoadListener, kVar);
    }

    public static q a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.a.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new b(new a(jSONObject, jSONObject2, bVar, kVar), appLovinAdLoadListener, kVar);
    }

    void a(com.applovin.impl.a.d dVar) {
        d("Failed to process VAST response due to VAST error code " + dVar);
        com.applovin.impl.a.i.a(this.c, this.a, dVar, -6, this.b);
    }

    void a(com.applovin.impl.sdk.utils.p pVar) {
        com.applovin.impl.a.d dVar;
        com.applovin.impl.sdk.e.a sVar;
        int a2 = this.c.a();
        a("Finished parsing XML at depth " + a2);
        this.c.a(pVar);
        if (!com.applovin.impl.a.i.a(pVar)) {
            if (com.applovin.impl.a.i.b(pVar)) {
                a("VAST response is inline. Rendering ad...");
                sVar = new s(this.c, this.a, this.b);
                this.b.Q().a(sVar);
                return;
            }
            d("VAST response is an error");
            dVar = com.applovin.impl.a.d.NO_WRAPPER_RESPONSE;
            a(dVar);
        }
        int intValue = ((Integer) this.b.a(com.applovin.impl.sdk.c.b.ef)).intValue();
        if (a2 < intValue) {
            a("VAST response is wrapper. Resolving...");
            sVar = new w(this.c, this.a, this.b);
            this.b.Q().a(sVar);
            return;
        }
        d("Reached beyond max wrapper depth of " + intValue);
        dVar = com.applovin.impl.a.d.WRAPPER_LIMIT_REACHED;
        a(dVar);
    }
}
