package com.kwad.components.core.request;

import android.content.Context;
import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.core.network.m;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.core.response.model.SdkConfigData;
import com.kwad.sdk.core.threads.GlobalThreadPools;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.u;
import com.kwad.sdk.utils.x;
import com.kwad.sdk.utils.y;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f {
    private static Context PK;
    private static volatile boolean PI = false;
    private static volatile boolean PJ = false;
    private static final List<a> PL = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface a {
        void a(SdkConfigData sdkConfigData);

        void pJ();
    }

    public static synchronized void a(Context context, a aVar) {
        synchronized (f.class) {
            if (PI) {
                com.kwad.sdk.core.e.c.d("ConfigRequestManager", "config request manager has init-ed");
                return;
            }
            PI = true;
            PK = context;
            List<a> list = PL;
            list.add(aVar);
            list.add(new a() { // from class: com.kwad.components.core.request.f.1
                @Override // com.kwad.components.core.request.f.a
                public final void a(SdkConfigData sdkConfigData) {
                }

                @Override // com.kwad.components.core.request.f.a
                public final void pJ() {
                    try {
                        Map<String, String> parseJSON2MapString = u.parseJSON2MapString(com.kwad.sdk.core.config.c.amz.getValue());
                        for (String str : parseJSON2MapString.keySet()) {
                            GlobalThreadPools.n(str, Integer.parseInt(parseJSON2MapString.get(str)));
                        }
                        GlobalThreadPools.CO();
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.printStackTrace(th);
                    }
                }
            });
            com.kwad.sdk.utils.g.execute(new aw() { // from class: com.kwad.components.core.request.f.2
                @Override // com.kwad.sdk.utils.aw
                public final void doTask() {
                    y.j(f.PK, y.cc(f.PK) + 1);
                    com.kwad.sdk.core.config.d.aS(f.PK);
                    for (a aVar2 : f.PL) {
                        if (aVar2 != null) {
                            aVar2.pJ();
                        }
                    }
                    f.pH();
                }
            });
        }
    }

    public static void a(a aVar) {
        PL.add(aVar);
        if (isLoaded()) {
            aVar.pJ();
        }
        if (PJ) {
            aVar.a(com.kwad.sdk.core.config.d.zv());
        }
    }

    static /* synthetic */ boolean aC(boolean z) {
        PJ = true;
        return true;
    }

    private static boolean isLoaded() {
        return com.kwad.sdk.core.config.d.isLoaded();
    }

    public static void pH() {
        com.kwad.sdk.core.e.c.d("ConfigRequestManager", "load()");
        new m<e, SdkConfigData>() { // from class: com.kwad.components.core.request.f.3
            private static SdkConfigData aw(String str) {
                y.ag(f.PK, str);
                JSONObject jSONObject = new JSONObject(str);
                SdkConfigData sdkConfigData = new SdkConfigData();
                sdkConfigData.parseJson(jSONObject);
                try {
                    com.kwad.sdk.core.config.d.xr();
                    com.kwad.sdk.core.config.d.yZ();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTrace(th);
                }
                return sdkConfigData;
            }

            private static e pK() {
                return new e();
            }

            @Override // com.kwad.sdk.core.network.a
            public final /* synthetic */ com.kwad.sdk.core.network.g createRequest() {
                return pK();
            }

            @Override // com.kwad.sdk.core.network.m
            public final /* synthetic */ SdkConfigData parseData(String str) {
                return aw(str);
            }
        }.request(new p<e, SdkConfigData>() { // from class: com.kwad.components.core.request.f.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onStartRequest(e eVar) {
                com.kwad.sdk.core.e.c.d("ConfigRequestManager", "onStartRequest request url = " + eVar.getUrl());
                super.onStartRequest(eVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onError(e eVar, int i, String str) {
                super.onError(eVar, i, str);
                com.kwad.sdk.core.e.c.d("ConfigRequestManager", "onError errorCode=" + i + " errorMsg=" + str);
            }

            private static void b(SdkConfigData sdkConfigData) {
                com.kwad.sdk.core.config.b.aQ(f.PK);
                com.kwad.sdk.core.config.d.c(sdkConfigData);
                f.aC(true);
                for (a aVar : f.PL) {
                    if (aVar != null) {
                        aVar.a(sdkConfigData);
                    }
                }
                if (sdkConfigData != null) {
                    com.kwad.sdk.ip.direct.a.a(sdkConfigData.httpDnsInfo);
                }
                x.Il();
                x.If();
                y.j(f.PK, 0);
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onSuccess(com.kwad.sdk.core.network.g gVar, BaseResultData baseResultData) {
                b((SdkConfigData) baseResultData);
            }
        });
    }
}
