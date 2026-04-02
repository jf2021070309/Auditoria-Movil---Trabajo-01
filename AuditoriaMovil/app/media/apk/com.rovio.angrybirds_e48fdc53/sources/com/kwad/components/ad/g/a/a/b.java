package com.kwad.components.ad.g.a.a;

import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class b implements com.kwad.sdk.core.webview.c.a {
    public static int nF = 1;
    public static int nG = 2;
    private com.kwad.sdk.core.webview.c.c nE;
    private int nH;
    private int nI;
    private InterfaceC0149b nK;
    private c nJ = new c(this, (byte) 0);
    private Runnable nL = null;

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public int nN;
        public int nO;
    }

    /* renamed from: com.kwad.components.ad.g.a.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0149b {
        void C(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        private boolean nP;
        private int nQ;

        private c() {
            this.nP = false;
            this.nQ = -1;
        }

        /* synthetic */ c(b bVar, byte b) {
            this();
        }

        public final void I(int i) {
            this.nQ = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.kwad.sdk.core.e.c.d("RegisterTimer", "TimerRunnable run timerPaused:  " + this.nP + ", currentTime: " + this.nQ);
            if (this.nP) {
                bj.a(this, null, 1000L);
                return;
            }
            int i = this.nQ;
            if (i < 0) {
                return;
            }
            b.this.H(i);
            this.nQ--;
            bj.a(this, null, 1000L);
        }

        public final void y(boolean z) {
            this.nP = z;
        }
    }

    private b(int i, int i2) {
        this.nH = i;
        this.nI = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(int i) {
        com.kwad.sdk.core.e.c.d("RegisterTimer", "updateTimer: " + i + ", mCallBackFunction: " + this.nE);
        if (i >= 0 && this.nE != null) {
            InterfaceC0149b interfaceC0149b = this.nK;
            if (interfaceC0149b != null && i == 0) {
                interfaceC0149b.C(this.nH);
            }
            a aVar = new a();
            aVar.nO = i;
            aVar.nN = this.nH;
            com.kwad.sdk.core.webview.c.c cVar = this.nE;
            if (cVar != null) {
                cVar.a(aVar);
            }
        }
    }

    private static int f(AdInfo adInfo) {
        int b = com.kwad.components.ad.interstitial.a.b.b(adInfo);
        if (b <= 0) {
            b = 60;
        }
        int i = adInfo.adInsertScreenInfo.autoCloseTime;
        return i > 0 ? Math.min(b, i) : b;
    }

    public static b o(AdTemplate adTemplate) {
        AdInfo ck = d.ck(adTemplate);
        if (!com.kwad.sdk.core.response.b.a.aU(ck)) {
            if (com.kwad.sdk.core.response.b.a.bv(ck)) {
                return new b(nG, f(ck));
            }
            if (ck.adInsertScreenInfo.autoCloseTime > 0) {
                return new b(nF, ck.adInsertScreenInfo.autoCloseTime);
            }
            return null;
        }
        return null;
    }

    public final void a(InterfaceC0149b interfaceC0149b) {
        this.nK = interfaceC0149b;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.nE = cVar;
        Runnable runnable = this.nL;
        if (runnable != null) {
            runnable.run();
            this.nL = null;
        }
    }

    public final void eZ() {
        com.kwad.sdk.core.e.c.d("RegisterTimer", "startTimer: mCallBackFunction: " + this.nE);
        if (this.nE == null) {
            this.nL = new Runnable() { // from class: com.kwad.components.ad.g.a.a.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.eZ();
                }
            };
            return;
        }
        this.nJ.I(this.nI);
        bj.runOnUiThread(this.nJ);
    }

    public final void fa() {
        this.nJ.y(true);
    }

    public final void fb() {
        this.nJ.y(false);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerTimerListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.nE = null;
    }
}
