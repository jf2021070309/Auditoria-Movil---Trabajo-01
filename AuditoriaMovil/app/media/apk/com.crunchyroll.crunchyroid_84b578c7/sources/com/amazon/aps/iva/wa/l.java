package com.amazon.aps.iva.wa;

import android.webkit.JavascriptInterface;
import com.amazon.aps.iva.ApsIvaListener;
import com.amazon.aps.iva.a9.w;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.metrics.types.Severity;
import com.amazon.aps.iva.types.AdMediaState;
import com.amazon.aps.iva.types.ApsIvaRejectResponse;
import com.amazon.aps.iva.types.ApsIvaReportTrackingArgs;
import com.amazon.aps.iva.types.ApsIvaResolveResponse;
import com.amazon.aps.iva.types.FatalErrorArgs;
import com.amazon.aps.iva.types.IVAErrorCode;
import com.amazon.aps.iva.types.LoadStatus;
import com.amazon.aps.iva.util.LogUtils;
import com.google.gson.Gson;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import lombok.NonNull;
/* compiled from: ApsIvaSimidContainerToPlayerAdapter.java */
/* loaded from: classes.dex */
public final class l {
    public final ApsIvaListener a;
    public final p b;
    public final m c;
    public final com.amazon.aps.iva.xa.b d;
    public final Gson e = w.c().b();

    public l(@NonNull ApsIvaListener apsIvaListener, @NonNull p pVar, @NonNull com.amazon.aps.iva.xa.b bVar) {
        this.a = apsIvaListener;
        this.b = pVar;
        this.d = bVar;
        this.c = new m(bVar);
    }

    @JavascriptInterface
    public void creativeLog(@NonNull String str, String... strArr) {
        if (str != null) {
            LogUtils.d("i", "[Log Message from Creative]: %s", str);
            if (strArr != null) {
                for (String str2 : strArr) {
                    LogUtils.d("i", "[Log Parameters from Creative]: %s", str2);
                }
                return;
            }
            return;
        }
        throw new NullPointerException("logMessage is marked non-null but is null");
    }

    @JavascriptInterface
    public void fatalError(String str, String str2) {
        com.amazon.aps.iva.xa.b bVar = this.d;
        if (str != null && str2 != null) {
            LogUtils.e("i", String.format("Fatal error occurred for adId: [%s]. %s", str, str2));
            Severity severity = Severity.ERROR;
            bVar.a(new MetricEvent("apsIva-ivaFatalErrorListenerCounter", severity));
            hideWebView(str);
            bVar.a(new MetricEvent(String.format("apsIva-fatalException-%s-Counter", Integer.valueOf(((FatalErrorArgs) this.e.fromJson(str2, (Class<Object>) FatalErrorArgs.class)).getErrorCode())), severity));
            bVar.a(new MetricEvent("apsIva-fatalExceptionCounter", severity));
            return;
        }
        bVar.a(new MetricEvent("apsIva-invalidArgumentsFatalExceptionCounter", Severity.ERROR));
        LogUtils.e("i", "Invalid Argument");
    }

    @JavascriptInterface
    public String getMediaState(String str) {
        Object apsIvaRejectResponse;
        boolean f = com.amazon.aps.iva.e.w.f(str);
        Gson gson = this.e;
        if (f) {
            LogUtils.e("i", "Invalid Argument - adId is not defined");
            return gson.toJson(new ApsIvaRejectResponse(IVAErrorCode.GENERIC_ERROR_CODE, "GetMediaState Error"));
        }
        try {
            AdMediaState a = this.b.d.a(str);
            LogUtils.i("i", "Sending Response for [adId: %s] %s", str, gson.toJson(a));
            apsIvaRejectResponse = new ApsIvaResolveResponse(a);
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("i", String.format("Exception in GetMediaState for adId: [%s]. %s", str, e));
            apsIvaRejectResponse = new ApsIvaRejectResponse(IVAErrorCode.GENERIC_ERROR_CODE, String.format("GetMediaStateError : There is no ad present with adId: %s", str));
        } catch (RuntimeException e2) {
            LogUtils.e("i", String.format("Exception in GetMediaState for adId: [%s]. %s", str, e2));
            apsIvaRejectResponse = new ApsIvaRejectResponse(IVAErrorCode.GENERIC_ERROR_CODE, "GetMediaState Error");
        }
        return gson.toJson(apsIvaRejectResponse);
    }

    @JavascriptInterface
    public void hideWebView(String str) {
        p pVar = this.b;
        if (pVar != null) {
            if (str != null) {
                pVar.b.a(str);
                AdMediaState a = pVar.d.a(str);
                if (a != null) {
                    if (a.isPaused() || a.isEnded()) {
                        this.a.onIvaCreativeRequestPlay(str);
                        return;
                    }
                    return;
                }
                return;
            }
            LogUtils.e("i", "Invalid Argument");
            return;
        }
        LogUtils.e("i", "Container Listener not defined");
    }

    @JavascriptInterface
    public String pauseAd(String str) {
        Object apsIvaRejectResponse;
        com.amazon.aps.iva.xa.b bVar = this.d;
        boolean f = com.amazon.aps.iva.e.w.f(str);
        Gson gson = this.e;
        if (f) {
            LogUtils.e("i", "Invalid Argument - adId is not defined");
            return gson.toJson(new ApsIvaRejectResponse(IVAErrorCode.NO_AD_PARAMETERS, "Error pausing Ad"));
        }
        try {
            this.a.onIvaCreativeRequestPause(str);
            apsIvaRejectResponse = null;
        } catch (RuntimeException e) {
            LogUtils.e("i", String.format("Exception in Pausing ad with adId: [%s]. %s", str, e));
            bVar.a(new MetricEvent("apsIva-pauseAdFailureCounter", Severity.ERROR));
            apsIvaRejectResponse = new ApsIvaRejectResponse(IVAErrorCode.GENERIC_ERROR_CODE, "Error pausing Ad");
        }
        if (apsIvaRejectResponse == null) {
            apsIvaRejectResponse = new ApsIvaResolveResponse();
            bVar.a(new MetricEvent("apsIva-pauseAdSuccessCounter", Severity.INFO));
        }
        return gson.toJson(apsIvaRejectResponse);
    }

    @JavascriptInterface
    public String reportTracking(String str, String str2) {
        boolean equals = "FakeWarmUpAd".equals(str);
        Gson gson = this.e;
        if (equals) {
            return gson.toJson(new ApsIvaResolveResponse());
        }
        if (!com.amazon.aps.iva.e.w.f(str) && !com.amazon.aps.iva.e.w.f(str2)) {
            try {
                ApsIvaReportTrackingArgs apsIvaReportTrackingArgs = (ApsIvaReportTrackingArgs) gson.fromJson(str2, (Class<Object>) ApsIvaReportTrackingArgs.class);
                List<URL> trackingUrls = apsIvaReportTrackingArgs.getTrackingUrls();
                apsIvaReportTrackingArgs.getMessageId();
                this.d.a(new MetricEvent("apsIva-reportTrackingCounter", Severity.INFO));
                this.c.c(trackingUrls);
                return gson.toJson(new ApsIvaResolveResponse());
            } catch (RuntimeException unused) {
                return gson.toJson(new ApsIvaRejectResponse(IVAErrorCode.GENERIC_ERROR_CODE, String.format("Invalid trackingUrls or messageId in messageArgs: %s", str2)));
            }
        }
        LogUtils.e("i", "Invalid Argument - adId or message arguments are not defined");
        return gson.toJson(new ApsIvaRejectResponse(IVAErrorCode.GENERIC_ERROR_CODE, "Empty adId or message argument"));
    }

    @JavascriptInterface
    public String resumeAd(String str) {
        Object apsIvaRejectResponse;
        com.amazon.aps.iva.xa.b bVar = this.d;
        boolean f = com.amazon.aps.iva.e.w.f(str);
        Gson gson = this.e;
        if (f) {
            LogUtils.e("i", "Invalid Argument - adId is not defined");
            return gson.toJson(new ApsIvaRejectResponse(IVAErrorCode.NO_AD_PARAMETERS, "Error resuming Ad"));
        }
        try {
            this.a.onIvaCreativeRequestPlay(str);
            apsIvaRejectResponse = null;
        } catch (RuntimeException e) {
            LogUtils.e("i", String.format("Exception in Playing ad with adId: %s", str, e));
            bVar.a(new MetricEvent("apsIva-resumeAdFailureCounter", Severity.ERROR));
            apsIvaRejectResponse = new ApsIvaRejectResponse(IVAErrorCode.GENERIC_ERROR_CODE, "Error resuming Ad");
        }
        if (apsIvaRejectResponse == null) {
            apsIvaRejectResponse = new ApsIvaResolveResponse();
            bVar.a(new MetricEvent("apsIva-resumeAdSuccessCounter", Severity.INFO));
        }
        return gson.toJson(apsIvaRejectResponse);
    }

    @JavascriptInterface
    public void sendContainerStatus(String str, String str2, String str3) {
        try {
            LoadStatus valueOf = LoadStatus.valueOf(str);
            p pVar = this.b;
            if (pVar != null && (valueOf != LoadStatus.FAILED || (str2 != null && str3 != null))) {
                if (valueOf != null) {
                    Iterator it = pVar.e.iterator();
                    while (it.hasNext()) {
                        ((q) it.next()).a(valueOf);
                    }
                    return;
                }
                throw new NullPointerException("loadStatus is marked non-null but is null");
            }
            LogUtils.e("i", "Container Listener not defined");
        } catch (RuntimeException unused) {
            LogUtils.e("i", "Invalid Argument");
        }
    }

    @JavascriptInterface
    public void showWebView(String str) {
        p pVar = this.b;
        if (pVar == null) {
            LogUtils.e("i", "Container Listener not defined");
        } else if (str == null) {
            LogUtils.e("i", "Invalid Argument");
        } else {
            pVar.a.a(str);
            if (!"FakeWarmUpAd".equals(str)) {
                this.d.a(new MetricEvent("apsIva-ivaImpressionsCounter", Severity.INFO));
            }
        }
    }
}
