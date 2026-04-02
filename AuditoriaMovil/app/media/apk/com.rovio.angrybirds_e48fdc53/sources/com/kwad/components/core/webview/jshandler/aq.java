package com.kwad.components.core.webview.jshandler;

import android.os.Handler;
import android.os.Looper;
import com.facebook.appevents.AppEventsConstants;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class aq implements com.kwad.sdk.core.webview.c.a {
    private final Handler TW = new Handler(Looper.getMainLooper());
    private com.kwad.sdk.core.webview.c.c Tx;
    private final c Vs;

    /* loaded from: classes.dex */
    public static final class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
        public int likeUserCount;
        public long liveDuration;
        public int status;
        public long totalWatchingDuration;
        public int watchingUserCount;
        public String displayWatchingUserCount = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        public String displayLikeUserCount = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }

    /* loaded from: classes.dex */
    public static final class b {
        WeakReference<com.kwad.sdk.core.webview.c.c> Ry;

        public b(com.kwad.sdk.core.webview.c.c cVar) {
            this.Ry = new WeakReference<>(cVar);
        }

        public final void a(a aVar) {
            com.kwad.sdk.core.webview.c.c cVar = this.Ry.get();
            if (cVar != null) {
                cVar.a(aVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(b bVar);
    }

    public aq(c cVar) {
        this.Vs = cVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.Tx = cVar;
        this.TW.post(new Runnable() { // from class: com.kwad.components.core.webview.jshandler.aq.1
            @Override // java.lang.Runnable
            public final void run() {
                aq.this.Vs.a(new b(aq.this.Tx));
            }
        });
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerLiveListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.Tx = null;
        this.TW.removeCallbacksAndMessages(null);
    }
}
