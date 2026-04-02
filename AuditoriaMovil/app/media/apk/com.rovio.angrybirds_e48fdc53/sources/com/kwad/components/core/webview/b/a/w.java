package com.kwad.components.core.webview.b.a;

import com.kwad.sdk.core.response.model.TKAdLiveShopItemInfo;
import com.kwad.sdk.utils.bj;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class w implements com.kwad.sdk.core.webview.c.a {
    private a WT;

    /* loaded from: classes.dex */
    public interface a {
        void a(TKAdLiveShopItemInfo tKAdLiveShopItemInfo);
    }

    public w(a aVar) {
        this.WT = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        try {
            com.kwad.sdk.core.e.c.d("UpdateLiveCurrentShopInfoHandler", "handleJsCall: " + str);
            final TKAdLiveShopItemInfo tKAdLiveShopItemInfo = new TKAdLiveShopItemInfo();
            tKAdLiveShopItemInfo.parseJson(new JSONObject(str));
            bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.b.a.w.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (w.this.WT != null) {
                        w.this.WT.a(tKAdLiveShopItemInfo);
                    }
                }
            });
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "updateLiveCurrentShopInfo";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
