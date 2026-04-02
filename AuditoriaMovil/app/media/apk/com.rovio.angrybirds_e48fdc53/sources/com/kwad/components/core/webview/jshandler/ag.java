package com.kwad.components.core.webview.jshandler;

import com.kwad.components.core.webview.jshandler.as;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ag implements com.kwad.sdk.core.webview.c.a {
    private List<c> mHolders = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.download.a.a {
        private c Ve;

        public a(c cVar) {
            this.Ve = cVar;
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onDownloadFailed() {
            ag.a(this.Ve, 1, 0.0f);
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onDownloadFinished() {
            ag.a(this.Ve, 5, 1.0f);
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onIdle() {
            ag.a(this.Ve, 1, 0.0f);
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onInstalled() {
            ag.a(this.Ve, 6, 1.0f);
        }

        @Override // com.kwad.sdk.core.download.a.a
        public final void onPaused(int i) {
            ag.a(this.Ve, 3, (i * 1.0f) / 100.0f);
        }

        @Override // com.kwad.sdk.api.KsAppDownloadListener
        public final void onProgressUpdate(int i) {
            ag.a(this.Ve, 2, (i * 1.0f) / 100.0f);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends com.kwad.sdk.core.response.a.a {
        public long creativeId = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        private com.kwad.components.core.e.d.c Vf;
        private a Vg;
        private AdTemplate mAdTemplate;
        private com.kwad.sdk.core.webview.c.c nE;

        public c(com.kwad.components.core.e.d.c cVar, AdTemplate adTemplate) {
            this.Vf = cVar;
            this.mAdTemplate = adTemplate;
        }

        public final void a(a aVar) {
            this.Vf.b(aVar);
            this.Vg = aVar;
        }

        public final void destroy() {
            a aVar;
            com.kwad.components.core.e.d.c cVar = this.Vf;
            if (cVar == null || (aVar = this.Vg) == null) {
                return;
            }
            cVar.c(aVar);
        }

        public final long rA() {
            AdTemplate adTemplate = this.mAdTemplate;
            if (adTemplate == null) {
                return -1L;
            }
            return com.kwad.sdk.core.response.b.d.cu(adTemplate);
        }
    }

    public ag(List<AdTemplate> list, List<com.kwad.components.core.e.d.c> list2) {
        if (list == null || list2 == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.mHolders.add(new c(list2.get(i), list.get(i)));
        }
    }

    private c D(long j) {
        if (j == -1) {
            return null;
        }
        for (c cVar : this.mHolders) {
            if (cVar.rA() == j) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(c cVar, int i, float f) {
        if (cVar == null || cVar.nE == null) {
            return;
        }
        com.kwad.sdk.core.e.c.d("MultiProgressListener", "notifyDownloadProgress: " + cVar.nE + f);
        com.kwad.sdk.core.webview.c.c cVar2 = cVar.nE;
        as.a aVar = new as.a();
        aVar.Vy = f;
        aVar.status = i;
        aVar.creativeId = cVar.rA();
        aVar.totalBytes = com.kwad.sdk.core.response.b.d.ck(cVar.mAdTemplate).totalBytes;
        cVar2.a(aVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                b bVar = new b();
                bVar.parseJson(jSONObject);
                c D = D(bVar.creativeId);
                if (D != null) {
                    D.nE = cVar;
                    D.a(new a(D));
                }
            } catch (Exception e) {
            }
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerMultiProgressListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        for (c cVar : this.mHolders) {
            cVar.destroy();
        }
    }
}
