package com.kwad.sdk.i;

import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.core.config.d;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.report.p;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.g;
import com.kwad.sdk.utils.s;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class b {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* loaded from: classes3.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int aDf;
        public String aDg;
        public String sdkVersion;
    }

    /* renamed from: com.kwad.sdk.i.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0268b extends com.kwad.sdk.core.response.a.a {
        public int aDh;
        public String aDi;
        public String aDj;
        public String aDk;
        public String aDl;
        public String aDm;
    }

    public static void Gd() {
        g.execute(new aw() { // from class: com.kwad.sdk.i.b.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                b.Ge();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Ge() {
        a a2;
        JSONObject jSONObject = (JSONObject) d.zv().getAppConfigData(null, new com.kwad.sdk.g.b<JSONObject, JSONObject>() { // from class: com.kwad.sdk.i.b.2
            private static JSONObject F(JSONObject jSONObject2) {
                return jSONObject2.optJSONObject("sdkTTPerfMonitor");
            }

            @Override // com.kwad.sdk.g.b
            public final /* synthetic */ JSONObject apply(JSONObject jSONObject2) {
                return F(jSONObject2);
            }
        });
        if (jSONObject == null) {
            return;
        }
        C0268b c0268b = new C0268b();
        try {
            c0268b.parseJson(jSONObject);
            if (c0268b.aDh == 1 && (a2 = a(ServiceProvider.getContext().getClassLoader(), c0268b)) != null) {
                KSLoggerReporter.a(new p.a().dz(ILoggerReporter.Category.APM_LOG).b(BusinessType.OTHER).a(SubBusinessType.OTHER).dA("ad_sdk_tt_sdk_info").C(a2.toJson()).Cc());
            }
        } catch (Throwable th) {
        }
    }

    private static a a(ClassLoader classLoader, C0268b c0268b) {
        Class<?> a2 = s.a(c0268b.aDi, classLoader);
        if (a2 == null) {
            return null;
        }
        a aVar = new a();
        aVar.aDf = s.fu(c0268b.aDj) ? 1 : 0;
        Object b = s.b(a2, c0268b.aDk, new Object[0]);
        if (b != null) {
            aVar.sdkVersion = (String) s.f(b, c0268b.aDl, new Object[0]);
            aVar.aDg = (String) s.f(b, c0268b.aDm, new Object[0]);
            return aVar;
        }
        throw new AssertionError();
    }
}
