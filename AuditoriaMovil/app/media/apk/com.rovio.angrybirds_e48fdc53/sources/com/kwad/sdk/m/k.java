package com.kwad.sdk.m;

import android.content.Context;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ah;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class k {
    private static a aMS;

    /* loaded from: classes3.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public List<String> aMT;
        public List<C0270a> aMU;

        /* renamed from: com.kwad.sdk.m.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0270a extends com.kwad.sdk.core.response.a.a {
            public String aMV;
            public String aMW;
        }
    }

    private static a KQ() {
        a aVar = aMS;
        if (aVar != null) {
            return aVar;
        }
        JSONObject jSONObject = (JSONObject) ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).getAppConfigData(null, new com.kwad.sdk.g.b<JSONObject, JSONObject>() { // from class: com.kwad.sdk.m.k.1
            private static JSONObject F(JSONObject jSONObject2) {
                if (jSONObject2 != null) {
                    jSONObject2.optJSONObject("wrapperBlackConfig");
                    return null;
                }
                return null;
            }

            @Override // com.kwad.sdk.g.b
            public final /* synthetic */ JSONObject apply(JSONObject jSONObject2) {
                return F(jSONObject2);
            }
        });
        a aVar2 = new a();
        aMS = aVar2;
        if (jSONObject == null) {
            return aVar2;
        }
        try {
            aVar2.parseJson(jSONObject);
        } catch (Throwable th) {
        }
        return aMS;
    }

    private static boolean a(Context context, a aVar) {
        String name = context.getClass().getName();
        for (String str : new CopyOnWriteArrayList(aVar.aMT)) {
            if (ah.a(str, name)) {
                com.kwad.sdk.core.e.c.d("WrapperBlackHelper", "isBlackClass");
                return true;
            }
        }
        return false;
    }

    private static boolean a(StackTraceElement stackTraceElement, a aVar) {
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        for (a.C0270a c0270a : new CopyOnWriteArrayList(aVar.aMU)) {
            String str = c0270a.aMV;
            String str2 = c0270a.aMW;
            if (ah.a(str, className) && ah.a(str2, methodName)) {
                com.kwad.sdk.core.e.c.d("WrapperBlackHelper", "isBlackMethod");
                return true;
            }
        }
        return false;
    }

    public static boolean dr(Context context) {
        a KQ = KQ();
        if (ah.K(KQ.aMT) || ah.K(KQ.aMU) || !a(context, KQ)) {
            return false;
        }
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (a(stackTraceElement, KQ)) {
                return true;
            }
        }
        return false;
    }
}
