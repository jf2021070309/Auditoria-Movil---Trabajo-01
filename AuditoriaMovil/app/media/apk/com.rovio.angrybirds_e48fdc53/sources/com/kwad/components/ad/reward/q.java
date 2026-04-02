package com.kwad.components.ad.reward;

import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.bc;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class q {

    /* loaded from: classes.dex */
    static class a {
        private String errorMsg;
        private boolean qF;

        public a(String str) {
            JSONObject jSONObject;
            this.errorMsg = "-";
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable th) {
                th.printStackTrace();
                this.qF = false;
                this.errorMsg = "数据解析失败";
                jSONObject = null;
            }
            parseJson(jSONObject);
        }

        private void parseJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.qF = jSONObject.optBoolean("isValid");
                this.errorMsg = jSONObject.toString();
            }
        }

        public final boolean isValid() {
            return this.qF;
        }
    }

    public static void b(final AdTemplate adTemplate, AdInfo adInfo) {
        final String bC = com.kwad.sdk.core.response.b.a.bC(adInfo);
        com.kwad.sdk.core.e.c.d("ServerCallbackHandle", "handleRewardVerify callbackUrl: " + bC);
        if (bc.isNullString(bC)) {
            return;
        }
        com.kwad.sdk.utils.g.execute(new Runnable() { // from class: com.kwad.components.ad.reward.q.1
            private void N(String str) {
                com.kwad.components.core.p.a.pC().d(adTemplate, 1, str);
            }

            private void gD() {
                com.kwad.components.core.p.a.pC().d(adTemplate, 0, "success");
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                try {
                    com.kwad.sdk.core.network.c doGet = com.kwad.sdk.g.wW().doGet(bC, null);
                    if (doGet == null) {
                        str = "Network Error: url invalid";
                    } else if (doGet.code != 200) {
                        N("Network Error: " + doGet.aoR);
                        return;
                    } else {
                        a aVar = new a(doGet.aoR);
                        if (aVar.isValid()) {
                            gD();
                            return;
                        }
                        str = aVar.errorMsg;
                    }
                    N(str);
                } catch (Throwable th) {
                    N("Request Error: " + th.getMessage());
                }
            }
        });
    }
}
