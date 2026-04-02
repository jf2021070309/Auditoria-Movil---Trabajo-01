package com.kwad.components.core.webview.jshandler;

import android.content.Context;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class aj implements com.kwad.sdk.core.webview.c.a {
    private AdTemplate mAdTemplate;
    private Context mContext;

    public aj(Context context, AdTemplate adTemplate) {
        this.mContext = context;
        this.mAdTemplate = adTemplate;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        com.kwad.components.core.webview.a.c cVar2 = new com.kwad.components.core.webview.a.c();
        if (this.mContext == null) {
            com.kwad.sdk.core.report.a.k(this.mAdTemplate, 2);
            cVar.onError(-1, "context为空");
        }
        try {
            cVar2.parseJson(new JSONObject(str));
            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
            if (com.kwad.sdk.core.response.b.a.M(ck) || com.kwad.components.core.e.d.e.a(this.mContext, ck.adConversionInfo.smallAppJumpInfo.mediaSmallAppId, cVar2.Tu, cVar2.Tv, this.mAdTemplate) != 1) {
                cVar.onError(-1, "跳转失败");
            } else {
                cVar.a(null);
            }
        } catch (Exception e) {
            com.kwad.sdk.core.report.a.k(this.mAdTemplate, 2);
            cVar.onError(-1, "解析失败");
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "openWechatMiniProgram";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
