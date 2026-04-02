package com.amazon.aps.iva.wa;

import android.webkit.ValueCallback;
import com.amazon.aps.iva.a9.w;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.metrics.types.Severity;
import com.amazon.aps.iva.q.e1;
import com.amazon.aps.iva.types.CreativeData;
import com.amazon.aps.iva.types.DurationChangeArgs;
import com.amazon.aps.iva.types.EndCreativeArgs;
import com.amazon.aps.iva.types.EndCreativeCode;
import com.amazon.aps.iva.types.EnvironmentData;
import com.amazon.aps.iva.types.FatalErrorArgs;
import com.amazon.aps.iva.types.InitParams;
import com.amazon.aps.iva.types.PreloadCallbackArgs;
import com.amazon.aps.iva.types.TimeUpdateArgs;
import com.amazon.aps.iva.types.VolumeChangeArgs;
import com.amazon.aps.iva.util.LogUtils;
import com.google.gson.Gson;
/* compiled from: ApsIvaAdManager.java */
/* loaded from: classes.dex */
public final class e {
    public final Gson a = w.c().b();
    public final k b;

    public e(k kVar) {
        this.b = kVar;
    }

    public final void a(int i, String str, String str2) {
        String json = this.a.toJson(FatalErrorArgs.builder().errorCode(i).errorMessage(str2).build());
        k kVar = this.b;
        kVar.getClass();
        if (str != null && json != null) {
            kVar.a(String.format("window.fatalError('%s', '%s');", str, json));
        } else {
            LogUtils.e("h", "Validation failed for player media fatal error");
            throw new com.amazon.aps.iva.ua.a();
        }
    }

    public final void b(String str) {
        k kVar = this.b;
        kVar.getClass();
        if (str != null) {
            kVar.a(String.format("window.postMediaEnded('%s');", str));
            kVar.b.a(new MetricEvent("apsIva-endAdCounter", Severity.INFO));
            return;
        }
        LogUtils.e("h", "Validation failed for player media end");
        throw new com.amazon.aps.iva.ua.a();
    }

    public final void c(String str, float f) {
        String json = this.a.toJson(DurationChangeArgs.builder().duration(f).build());
        k kVar = this.b;
        kVar.getClass();
        if (str != null && json != null) {
            kVar.a(String.format("window.postMediaDurationChange('%s', '%s');", str, json));
        } else {
            LogUtils.e("h", "Validation failed for player media duration change");
            throw new com.amazon.aps.iva.ua.a();
        }
    }

    public final void d(String str, float f, boolean z) {
        String json = this.a.toJson(VolumeChangeArgs.builder().volume(f).muted(z).build());
        k kVar = this.b;
        kVar.getClass();
        if (str != null && json != null) {
            kVar.a(String.format("window.postMediaVolumeChange('%s', '%s');", str, json));
        } else {
            LogUtils.e("h", "Validation failed for player/media volume change");
            throw new com.amazon.aps.iva.ua.a();
        }
    }

    public final void e(String str, EndCreativeCode endCreativeCode) {
        String json = this.a.toJson(EndCreativeArgs.builder().endCreativeCode(endCreativeCode.getEndCreativeCode()).endCreativeMessage(endCreativeCode.getEndCreativeMessage()).build());
        k kVar = this.b;
        b bVar = (b) kVar.a;
        bVar.getClass();
        bVar.j.post(new e1(bVar, 3));
        if (str != null && json != null) {
            kVar.a(String.format("window.endCreative('%s', '%s');", str, json));
        } else {
            LogUtils.e("h", "Validation failed for endAd");
            throw new com.amazon.aps.iva.ua.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.amazon.aps.iva.wa.j] */
    public final void f(final String str, EnvironmentData environmentData, CreativeData creativeData) {
        InitParams build = InitParams.builder().creativeData(creativeData).environmentData(environmentData).build();
        String creativeUrl = creativeData.getCreativeUrl();
        String json = this.a.toJson(build);
        final k kVar = this.b;
        kVar.getClass();
        if (str != null && creativeUrl != null && json != null && kVar.c != null) {
            kVar.b(String.format("window.preload('%s', '%s', '%s');", creativeUrl, str, json), new ValueCallback() { // from class: com.amazon.aps.iva.wa.j
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    k kVar2 = k.this;
                    kVar2.getClass();
                    kVar2.c.c.a(new PreloadCallbackArgs((String) obj, str));
                }
            });
            return;
        }
        LogUtils.e("h", "Validation failed for preload");
        throw new com.amazon.aps.iva.ua.a();
    }

    public final void g(String str) {
        k kVar = this.b;
        kVar.getClass();
        if (str != null) {
            kVar.a(String.format("window.postMediaPause('%s');", str));
        } else {
            LogUtils.e("h", "Validation failed for player/media pause");
            throw new com.amazon.aps.iva.ua.a();
        }
    }

    public final void h(String str, float f) {
        String json = this.a.toJson(TimeUpdateArgs.builder().currentTime(f).build());
        k kVar = this.b;
        kVar.getClass();
        if (str != null && json != null) {
            kVar.a(String.format("window.postMediaTimeUpdate('%s', '%s');", str, json));
        } else {
            LogUtils.e("h", "Validation failed for player media time update");
            throw new com.amazon.aps.iva.ua.a();
        }
    }

    public final void i(String str) {
        k kVar = this.b;
        kVar.getClass();
        if (str != null) {
            kVar.a(String.format("window.postMediaPlay('%s');", str));
            if (!"FakeWarmUpAd".equals(str)) {
                kVar.b.a(new MetricEvent("apsIva-playAdCounter", Severity.INFO));
                return;
            }
            return;
        }
        LogUtils.e("h", "Validation failed for player media play");
        throw new com.amazon.aps.iva.ua.a();
    }

    public final void j(String str) {
        k kVar = this.b;
        kVar.getClass();
        if (str != null) {
            kVar.a(String.format("window.postMediaPlay('%s');", str));
        } else {
            LogUtils.e("h", "Validation failed for player/media playing");
            throw new com.amazon.aps.iva.ua.a();
        }
    }

    public final void k(String str) {
        k kVar = this.b;
        kVar.getClass();
        if (str != null) {
            kVar.a(String.format("window.postMediaSeeked('%s');", str));
        } else {
            LogUtils.e("h", "Validation failed for player media seeked");
            throw new com.amazon.aps.iva.ua.a();
        }
    }

    public final void l(String str) {
        k kVar = this.b;
        kVar.getClass();
        if (str != null) {
            kVar.a(String.format("window.postMediaSeeking('%s');", str));
        } else {
            LogUtils.e("h", "Validation failed for player seek");
            throw new com.amazon.aps.iva.ua.a();
        }
    }

    public final void m(String str) {
        k kVar = this.b;
        kVar.getClass();
        if (str != null) {
            kVar.a(String.format("window.postMediaStalled('%s');", str));
        } else {
            LogUtils.e("h", "Validation failed for media stalled");
            throw new com.amazon.aps.iva.ua.a();
        }
    }

    public final void n(String str) {
        k kVar = this.b;
        kVar.getClass();
        if (str != null) {
            kVar.a(String.format("window.appForegrounded('%s');", str));
        } else {
            LogUtils.e("h", "Validation failed for app backgrounded");
            throw new com.amazon.aps.iva.ua.a();
        }
    }

    public final void o(String str) {
        k kVar = this.b;
        kVar.getClass();
        if (str != null) {
            kVar.a(String.format("window.appBackgrounded('%s');", str));
        } else {
            LogUtils.e("h", "Validation failed for app foregrounded");
            throw new com.amazon.aps.iva.ua.a();
        }
    }

    public final void p(String str) {
        k kVar = this.b;
        kVar.getClass();
        if (str != null) {
            kVar.a(String.format("window.startCreative('%s');", str));
            if (!str.equals("FakeWarmUpAd")) {
                b bVar = (b) kVar.a;
                bVar.getClass();
                bVar.j.post(new com.amazon.aps.iva.e.d(bVar, 11));
                kVar.b.a(new MetricEvent("apsIva-startCreativeCounter", Severity.INFO));
                return;
            }
            return;
        }
        LogUtils.e("h", "Validation failed for startAd");
        throw new com.amazon.aps.iva.ua.a();
    }
}
