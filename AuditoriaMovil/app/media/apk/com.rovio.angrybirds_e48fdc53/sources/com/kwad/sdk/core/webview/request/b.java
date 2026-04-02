package com.kwad.sdk.core.webview.request;

import android.os.Handler;
import android.os.Looper;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.core.network.g;
import com.kwad.sdk.core.network.m;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.core.webview.d.b;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    private static final Handler mHandler = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public interface a {
        void a(WebCardGetDataResponse webCardGetDataResponse);

        void onError(int i, String str);
    }

    public final void a(final b.a aVar, final a aVar2) {
        new m<com.kwad.sdk.core.webview.request.a, WebCardGetDataResponse>() { // from class: com.kwad.sdk.core.webview.request.b.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.a
            /* renamed from: Ek */
            public com.kwad.sdk.core.webview.request.a createRequest() {
                return new com.kwad.sdk.core.webview.request.a(aVar.url, aVar.method, aVar.params) { // from class: com.kwad.sdk.core.webview.request.b.1.1
                    @Override // com.kwad.sdk.core.webview.request.a, com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
                    public final String getUrl() {
                        return aVar.url;
                    }
                };
            }

            private static WebCardGetDataResponse ek(String str) {
                JSONObject jSONObject = new JSONObject(str);
                WebCardGetDataResponse webCardGetDataResponse = new WebCardGetDataResponse();
                webCardGetDataResponse.parseJson(jSONObject);
                return webCardGetDataResponse;
            }

            @Override // com.kwad.sdk.core.network.m
            public final /* synthetic */ WebCardGetDataResponse parseData(String str) {
                return ek(str);
            }
        }.request(new p<com.kwad.sdk.core.webview.request.a, WebCardGetDataResponse>() { // from class: com.kwad.sdk.core.webview.request.b.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onStartRequest(com.kwad.sdk.core.webview.request.a aVar3) {
                super.onStartRequest(aVar3);
                c.d("WebCardGetDataRequestManager", "onStartRequest");
                b.mHandler.post(new Runnable() { // from class: com.kwad.sdk.core.webview.request.b.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }

            private void b(final WebCardGetDataResponse webCardGetDataResponse) {
                c.d("WebCardGetDataRequestManager", "onSuccess");
                b.mHandler.post(new Runnable() { // from class: com.kwad.sdk.core.webview.request.b.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar2.a(webCardGetDataResponse);
                    }
                });
            }

            private void m(final int i, final String str) {
                c.d("WebCardGetDataRequestManager", "onError errorCode=" + i + " errorMsg=" + str);
                b.mHandler.post(new Runnable() { // from class: com.kwad.sdk.core.webview.request.b.2.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.d("WebCardGetDataRequestManager", "load onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i), str));
                        aVar2.onError(i, str);
                    }
                });
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onError(g gVar, int i, String str) {
                m(i, str);
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onSuccess(g gVar, BaseResultData baseResultData) {
                b((WebCardGetDataResponse) baseResultData);
            }
        });
    }
}
