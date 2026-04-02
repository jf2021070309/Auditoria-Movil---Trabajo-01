package com.amazon.aps.iva.i4;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ListView;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import androidx.emoji2.text.g;
import com.amazon.aps.iva.a6.j1;
import com.amazon.aps.iva.g6.d;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.g6.x;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.metrics.types.Severity;
import com.amazon.aps.iva.n4.c0;
import com.amazon.aps.iva.o6.t;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.util.LogUtils;
import com.braze.events.FeedUpdatedEvent;
import com.braze.ui.BrazeFeedFragment;
import com.crunchyroll.player.interactiveads.InteractiveAdsManagerImpl;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i, Object obj2, Object obj3) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.c;
                d.i iVar = (d.i) this.d;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.e;
                bVar.getClass();
                try {
                    androidx.emoji2.text.g a = androidx.emoji2.text.a.a(bVar.a);
                    if (a != null) {
                        g.b bVar2 = (g.b) a.a;
                        synchronized (bVar2.d) {
                            bVar2.f = threadPoolExecutor;
                        }
                        a.a.a(new androidx.emoji2.text.e(iVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    iVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                Rect rect = (Rect) this.e;
                com.amazon.aps.iva.yb0.j.f((c0) this.c, "$impl");
                com.amazon.aps.iva.yb0.j.f(rect, "$lastInEpicenterRect");
                c0.g(rect, (View) this.d);
                return;
            case 2:
                Pair pair = (Pair) this.d;
                ((j1.a) this.c).c.h.Y(((Integer) pair.first).intValue(), (v.b) pair.second, (t) this.e);
                return;
            case 3:
                x xVar = (x) this.c;
                com.amazon.aps.iva.g6.d dVar = (com.amazon.aps.iva.g6.d) this.d;
                SettableFuture settableFuture = (SettableFuture) this.e;
                com.amazon.aps.iva.g6.b bVar3 = xVar.b;
                e.a aVar = xVar.e;
                try {
                    d.a error = dVar.getError();
                    if (dVar.getState() == 1) {
                        dVar.e(aVar);
                        bVar3.release();
                    }
                    settableFuture.set(error);
                    return;
                } catch (Throwable th2) {
                    settableFuture.setException(th2);
                    dVar.e(aVar);
                    bVar3.release();
                    return;
                }
            case 4:
                com.amazon.aps.iva.wa.b bVar4 = (com.amazon.aps.iva.wa.b) this.c;
                String str = (String) this.d;
                ValueCallback<String> valueCallback = (ValueCallback) this.e;
                bVar4.getClass();
                try {
                    WebView webView = bVar4.a;
                    if (webView != null) {
                        webView.evaluateJavascript(str, valueCallback);
                        return;
                    }
                    return;
                } catch (RuntimeException e) {
                    LogUtils.e("a", String.format("Unexpected exception in executeJS: %s", e));
                    bVar4.i.a(new MetricEvent("apsIva-runnableException", Severity.ERROR));
                    return;
                }
            case 5:
                ((BrazeFeedFragment) this.c).lambda$onViewCreated$2((FeedUpdatedEvent) this.d, (ListView) this.e);
                return;
            default:
                com.amazon.aps.iva.a6.m mVar = (com.amazon.aps.iva.a6.m) this.c;
                com.amazon.aps.iva.yb0.j.f((InteractiveAdsManagerImpl) this.d, "this$0");
                if (mVar != null) {
                    mVar.b();
                }
                com.amazon.aps.iva.yb0.j.m("ivaSdk");
                throw null;
        }
    }
}
