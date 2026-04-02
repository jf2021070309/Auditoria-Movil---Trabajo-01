package com.amazon.aps.iva;

import android.content.Context;
import android.view.ViewGroup;
import com.amazon.aps.iva.ApsIvaSdkImpl;
import com.amazon.aps.iva.a9.w;
import com.amazon.aps.iva.h6.r;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.metrics.types.Severity;
import com.amazon.aps.iva.ta.a;
import com.amazon.aps.iva.types.AdMediaState;
import com.amazon.aps.iva.types.AdOverlayState;
import com.amazon.aps.iva.types.CreativeData;
import com.amazon.aps.iva.types.EndCreativeCode;
import com.amazon.aps.iva.types.EnvironmentData;
import com.amazon.aps.iva.types.LoadStatus;
import com.amazon.aps.iva.types.PreloadCallbackArgs;
import com.amazon.aps.iva.types.SimidCreative;
import com.amazon.aps.iva.u1.n;
import com.amazon.aps.iva.util.LogUtils;
import com.amazon.aps.iva.wa.e;
import com.amazon.aps.iva.wa.g;
import com.amazon.aps.iva.wa.k;
import com.amazon.aps.iva.wa.p;
import com.amazon.aps.iva.wa.q;
import com.amazon.aps.iva.wa.s;
import com.amazon.aps.iva.xa.b;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lombok.NonNull;
/* loaded from: classes.dex */
public class ApsIvaSdkImpl implements ApsIvaSdk {
    public final EnvironmentData a;
    public final a b;
    public e c;
    public LoadStatus d;
    public SimidCreativeParser e;
    public Map<String, CreativeData> f;
    public Map<String, AdMediaState> g;
    public g h;
    public b i;
    public final p j;
    public s k;
    public String l;

    /* loaded from: classes.dex */
    public static class ApsIvaSdkImplBuilder {
        public Context a;
        public ViewGroup b;
        public HttpURLConnection c;
        public List<SimidCreative> d;
        public ApsIvaListener e;
        public EnvironmentData f;
        public LogUtils.LOG_LEVEL g;

        public ApsIvaSdkImplBuilder apsIvaListener(@NonNull ApsIvaListener apsIvaListener) {
            if (apsIvaListener != null) {
                this.e = apsIvaListener;
                return this;
            }
            throw new NullPointerException("apsIvaListener is marked non-null but is null");
        }

        public ApsIvaSdkImpl build() {
            return new ApsIvaSdkImpl(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }

        public ApsIvaSdkImplBuilder context(@NonNull Context context) {
            if (context != null) {
                this.a = context;
                return this;
            }
            throw new NullPointerException("context is marked non-null but is null");
        }

        public ApsIvaSdkImplBuilder environmentData(@NonNull EnvironmentData environmentData) {
            if (environmentData != null) {
                this.f = environmentData;
                return this;
            }
            throw new NullPointerException("environmentData is marked non-null but is null");
        }

        public ApsIvaSdkImplBuilder httpURLConnection(HttpURLConnection httpURLConnection) {
            this.c = httpURLConnection;
            return this;
        }

        public ApsIvaSdkImplBuilder logLevel(LogUtils.LOG_LEVEL log_level) {
            this.g = log_level;
            return this;
        }

        public ApsIvaSdkImplBuilder simidCreativeList(List<SimidCreative> list) {
            this.d = list;
            return this;
        }

        public String toString() {
            return "ApsIvaSdkImpl.ApsIvaSdkImplBuilder(context=" + this.a + ", viewGroup=" + this.b + ", httpURLConnection=" + this.c + ", simidCreativeList=" + this.d + ", apsIvaListener=" + this.e + ", environmentData=" + this.f + ", logLevel=" + this.g + ")";
        }

        public ApsIvaSdkImplBuilder viewGroup(@NonNull ViewGroup viewGroup) {
            if (viewGroup != null) {
                this.b = viewGroup;
                return this;
            }
            throw new NullPointerException("viewGroup is marked non-null but is null");
        }
    }

    public ApsIvaSdkImpl(@NonNull Context context, @NonNull ViewGroup viewGroup, HttpURLConnection httpURLConnection, List<SimidCreative> list, @NonNull ApsIvaListener apsIvaListener, @NonNull EnvironmentData environmentData, LogUtils.LOG_LEVEL log_level) {
        LogUtils.LOG_LEVEL log_level2;
        if (context != null) {
            if (viewGroup != null) {
                if (apsIvaListener != null) {
                    if (environmentData != null) {
                        this.a = environmentData;
                        this.g = new LinkedHashMap();
                        a a = com.amazon.aps.iva.l9.a.d().a();
                        this.b = a;
                        a.a(context);
                        this.h = com.amazon.aps.iva.va.b.c().b();
                        try {
                            this.i = new com.amazon.aps.iva.xa.a(this.h, new n(new com.amazon.aps.iva.l9.a(new URL(a.f))), environmentData, a);
                        } catch (MalformedURLException e) {
                            LogUtils.e("ApsIvaSdkImpl", String.format("Error Creating Metrics Logger: %s", e));
                            this.i = new r(1);
                        }
                        p pVar = new p();
                        this.j = pVar;
                        this.e = new com.amazon.aps.iva.ya.b(this.i);
                        LogUtils.setAppUUID(this.a.getAppId());
                        if (log_level == null) {
                            log_level2 = LogUtils.LOG_LEVEL.INFO;
                        } else {
                            log_level2 = log_level;
                        }
                        LogUtils.setLogLevel(log_level2);
                        LogUtils.d("ApsIvaSdkImpl", "Init:  %s", this.a.getVersion());
                        if (!a(list, httpURLConnection)) {
                            LogUtils.e("ApsIvaSdkImpl", "Error Initializing ApsIvaSdkImpl");
                            this.i.a(new MetricEvent("apsIva-sdkInitializationFailureCounter", Severity.ERROR));
                            return;
                        } else if (!this.b.b("enableIVA")) {
                            LogUtils.i("ApsIvaSdkImpl", "The Interactive Video Ads feature is disabled by Amazon APS. Please contact APS for more details.");
                            return;
                        } else {
                            try {
                                com.amazon.aps.iva.wa.b bVar = new com.amazon.aps.iva.wa.b(viewGroup, context, this.i, apsIvaListener, this.b, pVar);
                                this.k = bVar;
                                k kVar = new k(bVar, this.i, pVar);
                                pVar.a(new q() { // from class: com.amazon.aps.iva.pa.f
                                    @Override // com.amazon.aps.iva.wa.q
                                    public final void a(Object obj) {
                                        LoadStatus loadStatus = (LoadStatus) obj;
                                        ApsIvaSdkImpl apsIvaSdkImpl = ApsIvaSdkImpl.this;
                                        apsIvaSdkImpl.getClass();
                                        LogUtils.i("ApsIvaSdkImpl", "Ad container status changed to : %s", loadStatus.toString());
                                        apsIvaSdkImpl.d = loadStatus;
                                        LoadStatus loadStatus2 = LoadStatus.SUCCEEDED;
                                        if (loadStatus == loadStatus2) {
                                            if (apsIvaSdkImpl.c == null) {
                                                LogUtils.e("ApsIvaSdkImpl", "apsIvaAdManager object null");
                                                apsIvaSdkImpl.i.a(new MetricEvent("apsIva-apsIvaAdManagerNullCounter", Severity.ERROR));
                                            } else if (loadStatus != loadStatus2) {
                                                LogUtils.w("ApsIvaSdkImpl", "initializeAds: WebView not ready to run commands");
                                            } else {
                                                for (String str : apsIvaSdkImpl.f.keySet()) {
                                                    apsIvaSdkImpl.initializeAd(str);
                                                }
                                            }
                                        }
                                    }
                                });
                                pVar.d = new com.amazon.aps.iva.g1.q(this, 7);
                                this.c = new e(kVar);
                                this.f = this.e.parse(list);
                                return;
                            } catch (UnsupportedOperationException e2) {
                                LogUtils.e("ApsIvaSdkImpl", String.format("UnsupportedOperationException: Error Initializing ApsIvaSdkImpl: %s", e2));
                                this.i.a(new MetricEvent("apsIva-unsupportedOperationExceptionCounter", Severity.ERROR));
                                return;
                            } catch (RuntimeException e3) {
                                LogUtils.e("ApsIvaSdkImpl", String.format("Error Initializing ApsIvaSdkImpl: %s", e3));
                                this.i.a(new MetricEvent("apsIva-runTimeExceptionSdkInitialization", Severity.ERROR));
                                return;
                            }
                        }
                    }
                    throw new NullPointerException("environmentData is marked non-null but is null");
                }
                throw new NullPointerException("apsIvaListener is marked non-null but is null");
            }
            throw new NullPointerException("viewGroup is marked non-null but is null");
        }
        throw new NullPointerException("context is marked non-null but is null");
    }

    public static ApsIvaSdkImplBuilder builder(Context context, ApsIvaListener apsIvaListener, EnvironmentData environmentData, ViewGroup viewGroup) {
        return defaultBuilder().context(context).apsIvaListener(apsIvaListener).environmentData(environmentData).viewGroup(viewGroup);
    }

    public static ApsIvaSdkImplBuilder defaultBuilder() {
        return new ApsIvaSdkImplBuilder();
    }

    public final boolean a(List<SimidCreative> list, HttpURLConnection httpURLConnection) {
        return (list != null && httpURLConnection == null) || (list == null && httpURLConnection != null);
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaDurationChanged(String str, float f) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "adMediaDurationChanged: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkImpl", "adMediaDurationChanged: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.c(str, f);
                        this.g.get(str).setDuration(f);
                    }
                }
                LogUtils.w("ApsIvaSdkImpl", "adMediaDurationChanged: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error occurred while changing the Ad's duration: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaEnded(String str) {
        String str2;
        Object[] objArr = new Object[1];
        if (d(str)) {
            str2 = null;
        } else {
            str2 = str;
        }
        objArr[0] = str2;
        LogUtils.d("ApsIvaSdkImpl", "adMediaEnded:  %s", objArr);
        try {
            String str3 = this.l;
            if (str3 != null && str3.equals(str)) {
                this.l = null;
            }
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "adMediaEnded: apsIvaAdManager object null or adId not present");
                return;
            }
            LoadStatus loadStatus = this.d;
            if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                    LogUtils.w("ApsIvaSdkImpl", "adMediaEnded: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    return;
                }
                this.c.b(str);
                endAd(str, EndCreativeCode.AUTO_CLOSE);
                return;
            }
            LogUtils.w("ApsIvaSdkImpl", "adMediaEnded: WebView not ready to run commands");
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error occurred while ending the Ad: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaPaused(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "adMediaPaused: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkImpl", "adMediaPaused: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.g(str);
                    }
                }
                LogUtils.w("ApsIvaSdkImpl", "adMediaPaused: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Pausing Ad: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaPlayed(String str) {
        String str2;
        Object[] objArr = new Object[1];
        if (d(str)) {
            str2 = null;
        } else {
            str2 = str;
        }
        objArr[0] = str2;
        LogUtils.d("ApsIvaSdkImpl", "adMediaPlayed:  %s", objArr);
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "adMediaPlayed: apsIvaAdManager object null or adId not present");
            } else if (b(str)) {
                LogUtils.w("ApsIvaSdkImpl", "adMediaPlayed: Ad or container is loading. Queued ad to play after loading");
                this.i.a(new MetricEvent("apsIva-playedAdWhilePreloadingCounter", Severity.WARNING));
                this.l = str;
            } else if (a(str)) {
                LogUtils.w("ApsIvaSdkImpl", "adMediaPlayed: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
            } else {
                this.c.i(str);
                f(str);
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Playing the Ad: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaPlaying(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "adMediaPlaying: apsIvaAdManager object null or adId not present");
            } else if (b(str)) {
                LogUtils.w("ApsIvaSdkImpl", "adMediaPlaying: Ad or container is loading. Queued ad to play after loading");
                this.l = str;
            } else if (a(str)) {
                LogUtils.w("ApsIvaSdkImpl", "adMediaPlaying: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
            } else {
                this.c.j(str);
                f(str);
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error occurred while the Ad was playing: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaSeeked(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "adMediaSeeked: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkImpl", "adMediaSeeked: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.k(str);
                    }
                }
                LogUtils.w("ApsIvaSdkImpl", "adMediaSeeked: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error occurred while moving the playhead: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaSeeking(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "adMediaSeeking: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkImpl", "adMediaSeeking: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.l(str);
                    }
                }
                LogUtils.w("ApsIvaSdkImpl", "adMediaSeeking: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error occurred while moving the playhead: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaStalled(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "adMediaStalled: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (a(str)) {
                        LogUtils.w("ApsIvaSdkImpl", "adMediaStalled: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.m(str);
                        this.c.e(str, EndCreativeCode.UNSPECIFIED);
                    }
                }
                LogUtils.w("ApsIvaSdkImpl", "adMediaStalled: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error occurred while informing media data isn't available for rendering. %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaVolumeChanged(String str, float f, boolean z) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "adMediaVolumeChanged: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkImpl", "adMediaVolumeChanged: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.d(str, f, z);
                    }
                }
                LogUtils.w("ApsIvaSdkImpl", "adMediaVolumeChanged: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error updating the audio state: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void appBackgrounded(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "appBackgrounded: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    this.c.n(str);
                }
                LogUtils.w("ApsIvaSdkImpl", "appBackgrounded: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error while informing that app was backgrounded: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void appForegrounded(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "appForegrounded: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    this.c.o(str);
                }
                LogUtils.w("ApsIvaSdkImpl", "appForegrounded: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error while informing that app was foregrounded: %s", e3));
        }
    }

    public final boolean b(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.f.get(str).getAdOverlayState() == AdOverlayState.PENDING_PRELOAD) {
            z = true;
        } else {
            z = false;
        }
        LoadStatus loadStatus = this.d;
        if (loadStatus == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (loadStatus == LoadStatus.LOADING) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (loadStatus == LoadStatus.PENDING_LOAD) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 || z3 || z4 || z) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void clear() {
        LogUtils.d("ApsIvaSdkImpl", "clear");
        try {
            s sVar = this.k;
            if (sVar != null) {
                ((com.amazon.aps.iva.wa.b) sVar).b();
            }
            com.amazon.aps.iva.l9.a.d().a = null;
            w.c().c = null;
            this.i.a();
            com.amazon.aps.iva.va.b.c().a();
        } catch (RuntimeException e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error destroying SDK. %s", e));
        }
    }

    public final boolean d(String str) {
        Map<String, CreativeData> map;
        if (this.c != null && str != null && (map = this.f) != null && map.get(str) != null) {
            return false;
        }
        return true;
    }

    public final void e(String str) {
        if (!d(str)) {
            this.f.get(str).setAdOverlayState(AdOverlayState.ENDING_FAILED);
        }
    }

    public void endAd(String str, EndCreativeCode endCreativeCode) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "endAd: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (endCreativeCode == null) {
                        LogUtils.e("ApsIvaSdkImpl", "endAd: argument invalid");
                    } else if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkImpl", "endAd: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.e(str, endCreativeCode);
                        this.f.remove(str);
                        this.g.remove(str);
                        this.i.a(new MetricEvent(String.format("apsIva-endCreative_%s_Counter", endCreativeCode.name()), Severity.INFO));
                    }
                }
                LogUtils.w("ApsIvaSdkImpl", "endAd: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            e(str);
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            e(str);
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            e(str);
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Stopping Ad: %s", e3));
        }
    }

    public void f(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "startCreativePlayback: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() == AdOverlayState.PRELOAD_SUCCEEDED) {
                        this.f.get(str).setAdOverlayState(AdOverlayState.SHOWING);
                        this.c.p(str);
                    } else {
                        LogUtils.w("ApsIvaSdkImpl", "startCreativePlayback: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    }
                }
                LogUtils.w("ApsIvaSdkImpl", "startCreativePlayback: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            this.f.get(str).setAdOverlayState(AdOverlayState.START_FAILED);
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            this.f.get(str).setAdOverlayState(AdOverlayState.START_FAILED);
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (Exception e3) {
            this.f.get(str).setAdOverlayState(AdOverlayState.START_FAILED);
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Starting Ad: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void fatalError(String str, int i, String str2) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "fatalError: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkImpl", "fatalError: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.a(i, str, str2);
                        endAd(str, EndCreativeCode.UNSPECIFIED);
                    }
                }
                LogUtils.w("ApsIvaSdkImpl", "fatalError: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error encountered by the player: %s", e3));
        }
    }

    public LoadStatus getContainerLoadStatus() {
        return this.d;
    }

    public void initializeAd(String str) {
        try {
        } catch (com.amazon.aps.iva.ua.a e) {
            this.f.get(str).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
            this.i.a(new MetricEvent("apsIva-invalidArgumentsExceptionCounter", Severity.ERROR));
        } catch (com.amazon.aps.iva.ua.b e2) {
            this.f.get(str).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            this.f.get(str).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Initializing Ad: %s", e3));
        }
        if (d(str)) {
            LogUtils.e("ApsIvaSdkImpl", "initializeAd: apsIvaAdManager object null or adId not present");
            this.i.a(new MetricEvent("apsIva-creativeDataListNullOrAdNullCounter", Severity.ERROR));
            return;
        }
        LoadStatus loadStatus = this.d;
        if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
            if (this.f.get(str).getAdOverlayState() != AdOverlayState.UNINITIALIZED) {
                LogUtils.w("ApsIvaSdkImpl", "initializeAd: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                return;
            } else if (!com.amazon.aps.iva.l9.a.c(this.f.get(str).getCreativeUrl())) {
                this.f.get(str).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
                return;
            } else {
                this.f.get(str).setAdOverlayState(AdOverlayState.PENDING_PRELOAD);
                this.j.c = new q() { // from class: com.amazon.aps.iva.pa.e
                    @Override // com.amazon.aps.iva.wa.q
                    public final void a(Object obj) {
                        PreloadCallbackArgs preloadCallbackArgs = (PreloadCallbackArgs) obj;
                        ApsIvaSdkImpl apsIvaSdkImpl = ApsIvaSdkImpl.this;
                        apsIvaSdkImpl.getClass();
                        String didPreload = preloadCallbackArgs.getDidPreload();
                        String adId = preloadCallbackArgs.getAdId();
                        if (apsIvaSdkImpl.d(adId)) {
                            LogUtils.e("ApsIvaSdkImpl", "apsIvaAdManager object null or adId not present");
                        } else if (Boolean.TRUE.toString().equalsIgnoreCase(didPreload)) {
                            apsIvaSdkImpl.f.get(adId).setAdOverlayState(AdOverlayState.PRELOAD_SUCCEEDED);
                            LogUtils.i("ApsIvaSdkImpl", String.format("Successfully preloaded Ad ID: %s", adId));
                            if (!"FakeWarmUpAd".equals(adId)) {
                                apsIvaSdkImpl.i.a(new MetricEvent("apsIva-adPreloadSuccessCounter", Severity.INFO));
                            }
                            if (adId.equals(apsIvaSdkImpl.l)) {
                                apsIvaSdkImpl.adMediaPlayed(apsIvaSdkImpl.l);
                                apsIvaSdkImpl.l = null;
                            }
                        } else {
                            apsIvaSdkImpl.f.get(adId).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
                            LogUtils.w("ApsIvaSdkImpl", "onPreloadCallback: An ad failed to preload");
                            apsIvaSdkImpl.i.a(new MetricEvent("apsIva-adPreloadFailureCounter", Severity.ERROR));
                        }
                    }
                };
                this.c.f(str, this.a, this.f.get(str));
                this.g.put(str, AdMediaState.builder().currentTime(0.0f).duration(15.0f).ended(false).fullscreen(true).muted(false).paused(false).volume(0.5f).build());
                return;
            }
        }
        LogUtils.w("ApsIvaSdkImpl", "initializeAd: WebView not ready to run commands");
    }

    public void setMetricsLogger(b bVar) {
        this.i = bVar;
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void updateAdMediaState(String str, AdMediaState adMediaState) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(AdOverlayState.PENDING_PRELOAD, AdOverlayState.PRELOAD_SUCCEEDED, AdOverlayState.SHOWING));
            if (d(str)) {
                LogUtils.e("ApsIvaSdkImpl", "updateAdMediaState: Missing ad id %s or apsIvaAdManager", str);
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (!arrayList.contains(this.f.get(str).getAdOverlayState())) {
                        LogUtils.w("ApsIvaSdkImpl", "updateAdMediaState: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.g.put(str, adMediaState);
                        this.c.h(str, adMediaState.getCurrentTime());
                    }
                }
                LogUtils.w("ApsIvaSdkImpl", "updateAdMediaState: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkImpl", String.format("Error Updating Ad Time: %s", e3));
        }
    }

    public final boolean a(String str) {
        return ((this.f.get(str).getAdOverlayState() == AdOverlayState.PRELOAD_SUCCEEDED) || (this.f.get(str).getAdOverlayState() == AdOverlayState.SHOWING)) ? false : true;
    }
}
