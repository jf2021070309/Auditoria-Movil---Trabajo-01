package com.amazon.aps.iva.m6;

import android.os.SystemClock;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.amazon.aps.iva.m6.f;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.metrics.types.MetricEventCollection;
import com.amazon.aps.iva.metrics.types.Severity;
import com.amazon.aps.iva.types.LoadStatus;
import com.amazon.aps.iva.util.LogUtils;
import com.braze.ui.BrazeFeedFragment;
import com.google.net.cronet.okhttptransport.CronetInterceptor;
import java.io.IOException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                f fVar = (f) this.c;
                f.a aVar = fVar.h;
                aVar.getClass();
                aVar.a(fVar);
                return;
            case 1:
                ((com.amazon.aps.iva.c8.t) this.c).i(2);
                return;
            case 2:
                final com.amazon.aps.iva.wa.b bVar = (com.amazon.aps.iva.wa.b) this.c;
                com.amazon.aps.iva.ta.a aVar2 = bVar.f;
                try {
                    WebView webView = bVar.a;
                    if (webView != null) {
                        WebSettings settings = webView.getSettings();
                        settings.setCacheMode(-1);
                        settings.setDomStorageEnabled(true);
                        settings.setJavaScriptEnabled(true);
                        bVar.a.setBackgroundColor(0);
                        bVar.a.setVisibility(8);
                        bVar.a.addJavascriptInterface(bVar.e, aVar2.e);
                        bVar.a.setWebViewClient(bVar.c);
                        bVar.a.setWebChromeClient(bVar.d);
                        final long elapsedRealtime = SystemClock.elapsedRealtime();
                        bVar.h.a(new com.amazon.aps.iva.wa.q() { // from class: com.amazon.aps.iva.wa.a
                            @Override // com.amazon.aps.iva.wa.q
                            public final void a(Object obj) {
                                long j = elapsedRealtime;
                                LoadStatus loadStatus = (LoadStatus) obj;
                                com.amazon.aps.iva.xa.b bVar2 = b.this.i;
                                try {
                                    if (loadStatus == LoadStatus.SUCCEEDED) {
                                        bVar2.a(new MetricEvent("apsIva-simidContainerLoadSuccessCounter", Severity.INFO));
                                        bVar2.a(new MetricEvent("apsIva-simidContainerLoadTimer", SystemClock.elapsedRealtime() - j));
                                    } else if (loadStatus == LoadStatus.FAILED) {
                                        bVar2.a(new MetricEvent("apsIva-simidContainerLoadFailureCounter", Severity.ERROR));
                                    }
                                } catch (RuntimeException e) {
                                    LogUtils.e("a", String.format("Unexpected exception in getOnContainerLoadStatusChangeHandler: %s", e));
                                    bVar2.a(new MetricEvent("apsIva-runnableException", Severity.ERROR));
                                }
                            }
                        });
                        bVar.a.loadUrl(aVar2.d);
                        return;
                    }
                    return;
                } catch (RuntimeException e) {
                    LogUtils.e("a", String.format("Unexpected exception in getPrepareWebViewRunnable: %s", e));
                    bVar.i.a(new MetricEvent("apsIva-runnableException", Severity.ERROR));
                    return;
                }
            case 3:
                com.amazon.aps.iva.xa.a aVar3 = (com.amazon.aps.iva.xa.a) this.c;
                synchronized (aVar3.f) {
                    if (aVar3.f.size() == 0) {
                        LogUtils.d("a", "No events available to report metrics on.");
                    } else {
                        MetricEventCollection metricEventCollection = new MetricEventCollection(aVar3.f);
                        int i = 0;
                        while (true) {
                            if (i < 1) {
                                LogUtils.d("a", "Metric event: %s", Integer.valueOf(aVar3.f.size()));
                                try {
                                    z = aVar3.d.b(metricEventCollection);
                                } catch (Exception unused) {
                                    z = false;
                                }
                                if (z) {
                                    LogUtils.d("a", "Metric event: before clear %s", Integer.valueOf(aVar3.f.size()));
                                    aVar3.f.clear();
                                    z2 = true;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
                LogUtils.d("a", "Flushed Buffer: %s", String.valueOf(z2));
                return;
            case 4:
                ((BrazeFeedFragment) this.c).lambda$onRefresh$5();
                return;
            case 5:
                com.amazon.aps.iva.sj.a aVar4 = (com.amazon.aps.iva.sj.a) this.c;
                aVar4.getClass();
                aVar4.j0(new IOException("Ad loading timed out"));
                aVar4.A0();
                return;
            case 6:
                com.amazon.aps.iva.jk.a aVar5 = (com.amazon.aps.iva.jk.a) this.c;
                com.amazon.aps.iva.yb0.j.f(aVar5, "this$0");
                aVar5.X();
                aVar5.W();
                return;
            case 7:
                View view = (View) this.c;
                com.amazon.aps.iva.yb0.j.f(view, "$it");
                view.setVisibility(0);
                return;
            default:
                CronetInterceptor.a((CronetInterceptor) this.c);
                return;
        }
    }
}
