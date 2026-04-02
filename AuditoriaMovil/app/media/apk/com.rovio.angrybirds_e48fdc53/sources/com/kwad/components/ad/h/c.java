package com.kwad.components.ad.h;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.kwad.components.core.i.a;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.y;
import java.util.List;
/* loaded from: classes.dex */
public final class c implements Runnable {
    private static final Handler nZ = new Handler(Looper.getMainLooper());
    private static volatile boolean od;
    private final long oa;
    private final AdTemplate ob;
    private boolean oc = false;
    private d oe;

    public c(com.kwad.components.core.internal.api.a aVar) {
        AdTemplate adTemplate = aVar.getAdTemplate();
        this.ob = adTemplate;
        long cE = com.kwad.sdk.core.response.b.a.cE(com.kwad.sdk.core.response.b.d.ck(adTemplate));
        this.oa = cE;
        com.kwad.sdk.core.e.c.d("PushAdManager", "PushAdManager create adTemplate: " + adTemplate.hashCode() + ", " + cE);
    }

    private static void a(int i, Runnable runnable, long j) {
        Handler handler = nZ;
        Message obtain = Message.obtain(handler, runnable);
        obtain.what = i;
        handler.sendMessageDelayed(obtain, j);
    }

    static /* synthetic */ boolean access$002(boolean z) {
        od = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fh() {
        d dVar;
        if (!b.fc().fe()) {
            com.kwad.sdk.core.e.c.d("PushAdManager", "run preCheckResult false");
            return;
        }
        od = false;
        if (this.oc || (dVar = this.oe) == null || !dVar.fm()) {
            return;
        }
        this.oc = true;
        this.oe.c(new com.kwad.components.ad.b.a.b() { // from class: com.kwad.components.ad.h.c.3
            @Override // com.kwad.components.ad.b.a.b
            public final void T() {
                y.as(System.currentTimeMillis());
                e.fp().fl();
            }

            @Override // com.kwad.components.ad.b.a.b
            public final void U() {
                com.kwad.sdk.core.e.c.d("PushAdManager", "onAdClose: ");
                e.fp().fn();
                b.fc().a(c.this);
            }
        });
    }

    public final void d(com.kwad.components.core.internal.api.a aVar) {
        AdTemplate adTemplate = aVar.getAdTemplate();
        if (!adTemplate.equals(this.ob)) {
            com.kwad.sdk.core.e.c.d("PushAdManager", "onAdExit not current ad");
            return;
        }
        com.kwad.sdk.core.e.c.d("PushAdManager", "onAdExit showPushAdDelayTime: " + this.oa + ", adTemplate: " + adTemplate.hashCode());
        if (aVar.ae()) {
            a(1000001, this, this.oa);
        }
    }

    public final void fg() {
        com.kwad.sdk.core.e.c.w("PushAdManager", "startRequestPushAd processingPush: " + od);
        if (od || this.ob.mAdScene == null) {
            return;
        }
        od = true;
        com.kwad.components.core.i.a.b(this.ob.mAdScene, new a.InterfaceC0202a() { // from class: com.kwad.components.ad.h.c.1
            @Override // com.kwad.components.core.i.a.InterfaceC0202a
            public final void c(List<com.kwad.components.core.i.c> list) {
                com.kwad.sdk.core.e.c.d("PushAdManager", "onInnerAdLoad: " + list);
                if (list == null || list.size() <= 0) {
                    c.access$002(false);
                    return;
                }
                AdTemplate adTemplate = list.get(0).getAdTemplate();
                if (!com.kwad.sdk.core.response.b.a.cC(com.kwad.sdk.core.response.b.d.ck(adTemplate))) {
                    c.access$002(false);
                    com.kwad.sdk.core.e.c.d("PushAdManager", "pushAdInfo templateId invalid");
                    return;
                }
                com.kwad.sdk.core.e.c.d("PushAdManager", "loadPushTK");
                Context context = ServiceProvider.getContext();
                c.this.oe = new d(context, adTemplate);
            }

            @Override // com.kwad.components.core.i.a.InterfaceC0202a
            public final void onError(int i, String str) {
                com.kwad.sdk.core.e.c.d("PushAdManager", "onError: " + str);
                c.access$002(false);
            }

            @Override // com.kwad.components.core.i.a.InterfaceC0202a
            public final void onRequestResult(int i) {
            }
        });
    }

    public final void fi() {
        com.kwad.sdk.core.e.c.d("PushAdManager", "onOutSDKPage: ");
        if (nZ.hasMessages(1000001)) {
            return;
        }
        com.kwad.sdk.core.e.c.d("PushAdManager", "onOutSDKPage: sendMessageDelay MSG_WHAT_PAGE_OUT");
        a(1000002, this, 500L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.kwad.components.core.e.a.e.mR().isShowing()) {
            com.kwad.components.core.e.a.e.mR().a(new com.kwad.components.core.e.a.c() { // from class: com.kwad.components.ad.h.c.2
                @Override // com.kwad.components.core.e.a.c, com.kwad.components.core.e.a.b
                public final void fj() {
                    com.kwad.components.core.e.a.e.mR().b(this);
                    c.this.fh();
                }
            });
        } else {
            fh();
        }
    }
}
