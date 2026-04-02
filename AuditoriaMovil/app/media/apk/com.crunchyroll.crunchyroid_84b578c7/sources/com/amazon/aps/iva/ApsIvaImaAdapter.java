package com.amazon.aps.iva;

import android.content.Context;
import android.view.ViewGroup;
import com.amazon.aps.iva.ApsIvaImaAdapter;
import com.amazon.aps.iva.a9.w;
import com.amazon.aps.iva.f1.c0;
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
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lombok.NonNull;
/* loaded from: classes.dex */
public class ApsIvaImaAdapter implements ApsIvaSdk {
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
    public List<SimidCreative> l = new ArrayList();
    public String m;

    /* loaded from: classes.dex */
    public static class ApsIvaImaAdapterBuilder {
        public Context a;
        public ViewGroup b;
        public ApsIvaListener c;
        public EnvironmentData d;
        public List<SimidCreative> e;
        public LogUtils.LOG_LEVEL f;

        public ApsIvaImaAdapterBuilder apsIvaListener(@NonNull ApsIvaListener apsIvaListener) {
            if (apsIvaListener != null) {
                this.c = apsIvaListener;
                return this;
            }
            throw new NullPointerException("apsIvaListener is marked non-null but is null");
        }

        public ApsIvaImaAdapter build() {
            return new ApsIvaImaAdapter(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public ApsIvaImaAdapterBuilder context(@NonNull Context context) {
            if (context != null) {
                this.a = context;
                return this;
            }
            throw new NullPointerException("context is marked non-null but is null");
        }

        public ApsIvaImaAdapterBuilder environmentData(@NonNull EnvironmentData environmentData) {
            if (environmentData != null) {
                this.d = environmentData;
                return this;
            }
            throw new NullPointerException("environmentData is marked non-null but is null");
        }

        public ApsIvaImaAdapterBuilder logLevel(LogUtils.LOG_LEVEL log_level) {
            this.f = log_level;
            return this;
        }

        public ApsIvaImaAdapterBuilder simidCreativeList(List<SimidCreative> list) {
            this.e = list;
            return this;
        }

        public String toString() {
            return "ApsIvaImaAdapter.ApsIvaImaAdapterBuilder(context=" + this.a + ", viewGroup=" + this.b + ", apsIvaListener=" + this.c + ", environmentData=" + this.d + ", simidCreativeList=" + this.e + ", logLevel=" + this.f + ")";
        }

        public ApsIvaImaAdapterBuilder viewGroup(@NonNull ViewGroup viewGroup) {
            if (viewGroup != null) {
                this.b = viewGroup;
                return this;
            }
            throw new NullPointerException("viewGroup is marked non-null but is null");
        }
    }

    public ApsIvaImaAdapter(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull ApsIvaListener apsIvaListener, @NonNull EnvironmentData environmentData, List<SimidCreative> list, LogUtils.LOG_LEVEL log_level) {
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
                        this.f = new HashMap();
                        try {
                            this.i = new com.amazon.aps.iva.xa.a(this.h, new n(new com.amazon.aps.iva.l9.a(new URL(a.f))), environmentData, a);
                        } catch (MalformedURLException e) {
                            LogUtils.e("ApsIvaImaAdapter", String.format("Error Creating Metrics Logger: %s", e));
                            this.i = new r(1);
                        }
                        p pVar = new p();
                        this.j = pVar;
                        this.e = new com.amazon.aps.iva.ya.a(this.i);
                        LogUtils.setAppUUID(this.a.getAppId());
                        LogUtils.setLogLevel(log_level == null ? LogUtils.LOG_LEVEL.INFO : log_level);
                        LogUtils.d("ApsIvaImaAdapter", "Init:  %s", this.a.getVersion());
                        if (!this.b.b("enableIVA")) {
                            LogUtils.i("ApsIvaImaAdapter", "The Interactive Video Ads feature is disabled by Amazon APS. Please contact APS for more details.");
                            return;
                        }
                        try {
                            com.amazon.aps.iva.wa.b bVar = new com.amazon.aps.iva.wa.b(viewGroup, context, this.i, apsIvaListener, this.b, pVar);
                            this.k = bVar;
                            k kVar = new k(bVar, this.i, pVar);
                            pVar.a(new com.amazon.aps.iva.pa.b(this, 0));
                            pVar.d = new c0(this, 9);
                            this.c = new e(kVar);
                            if (list != null && list.size() > 0) {
                                this.f = this.e.parse(list);
                                return;
                            }
                            return;
                        } catch (UnsupportedOperationException e2) {
                            LogUtils.e("ApsIvaImaAdapter", String.format("UnsupportedOperationException: Error Initializing ApsIvaImaSdkImpl: %s", e2));
                            this.i.a(new MetricEvent("apsIva-unsupportedOperationExceptionCounter", Severity.ERROR));
                            return;
                        } catch (RuntimeException e3) {
                            LogUtils.e("ApsIvaImaAdapter", String.format("Error Initializing ApsIvaImaSdkImpl: %s", e3));
                            this.i.a(new MetricEvent("apsIva-runTimeExceptionSdkInitialization", Severity.ERROR));
                            return;
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

    public static ApsIvaImaAdapterBuilder builder(Context context, ApsIvaListener apsIvaListener, EnvironmentData environmentData, ViewGroup viewGroup) {
        return defaultBuilder().context(context).apsIvaListener(apsIvaListener).environmentData(environmentData).viewGroup(viewGroup);
    }

    public static ApsIvaImaAdapterBuilder defaultBuilder() {
        return new ApsIvaImaAdapterBuilder();
    }

    public final void a(String str, final boolean z) {
        try {
        } catch (com.amazon.aps.iva.ua.a e) {
            this.f.get(str).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
            this.i.a(new MetricEvent("apsIva-invalidArgumentsExceptionCounter", Severity.ERROR));
        } catch (com.amazon.aps.iva.ua.b e2) {
            this.f.get(str).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (Exception e3) {
            this.f.get(str).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Initializing Ad: %s", e3));
        }
        if (d(str)) {
            LogUtils.e("ApsIvaImaAdapter", "initializeAd: apsIvaAdManager object null or adId not present");
            this.i.a(new MetricEvent("apsIva-creativeDataListNullOrAdNullCounter", Severity.ERROR));
        } else if (this.f.get(str).getAdOverlayState() != AdOverlayState.UNINITIALIZED) {
            LogUtils.w("ApsIvaImaAdapter", "initializeAd: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
        } else if (!com.amazon.aps.iva.l9.a.c(this.f.get(str).getCreativeUrl())) {
            this.f.get(str).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
        } else {
            this.f.get(str).setAdOverlayState(AdOverlayState.PENDING_PRELOAD);
            this.j.c = new q() { // from class: com.amazon.aps.iva.pa.c
                @Override // com.amazon.aps.iva.wa.q
                public final void a(Object obj) {
                    PreloadCallbackArgs preloadCallbackArgs = (PreloadCallbackArgs) obj;
                    ApsIvaImaAdapter apsIvaImaAdapter = ApsIvaImaAdapter.this;
                    apsIvaImaAdapter.getClass();
                    boolean equalsIgnoreCase = preloadCallbackArgs.getDidPreload().equalsIgnoreCase(Boolean.TRUE.toString());
                    String adId = preloadCallbackArgs.getAdId();
                    if (apsIvaImaAdapter.d(adId)) {
                        LogUtils.e("ApsIvaImaAdapter", "apsIvaAdManager object null or adId not present");
                    } else if (!equalsIgnoreCase) {
                        apsIvaImaAdapter.f.get(adId).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
                        LogUtils.w("ApsIvaImaAdapter", "onPreloadCallback: An ad failed to preload");
                        apsIvaImaAdapter.i.a(new MetricEvent("apsIva-adPreloadFailureCounter", Severity.ERROR));
                    } else {
                        apsIvaImaAdapter.f.get(adId).setAdOverlayState(AdOverlayState.PRELOAD_SUCCEEDED);
                        LogUtils.i("ApsIvaImaAdapter", "Ad ID: %s preloaded successfully", adId);
                        if (!"FakeWarmUpAd".equals(adId)) {
                            apsIvaImaAdapter.i.a(new MetricEvent("apsIva-adPreloadSuccessCounter", Severity.INFO));
                        }
                        if (adId.equals(apsIvaImaAdapter.m)) {
                            apsIvaImaAdapter.adMediaPlayed(apsIvaImaAdapter.m);
                            apsIvaImaAdapter.m = null;
                        } else if (z) {
                            apsIvaImaAdapter.adMediaPlayed(adId);
                        }
                    }
                }
            };
            this.c.f(str, this.a, this.f.get(str));
            this.g.put(str, AdMediaState.builder().currentTime(0.0f).duration(15.0f).ended(false).fullscreen(true).muted(false).paused(false).volume(0.5f).build());
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaDurationChanged(String str, float f) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "adMediaDurationChanged: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaImaAdapter", "adMediaDurationChanged: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.c(str, f);
                        this.g.get(str).setDuration(f);
                    }
                }
                LogUtils.w("ApsIvaImaAdapter", "adMediaDurationChanged: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error occurred while changing the Ad's duration: %s", e3));
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
        LogUtils.d("ApsIvaImaAdapter", "adMediaEnded:  %s", objArr);
        try {
            String str3 = this.m;
            if (str3 != null && str3.equals(str)) {
                this.m = null;
            }
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "adMediaEnded: apsIvaAdManager object null or adId not present");
                return;
            }
            LoadStatus loadStatus = this.d;
            if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                    LogUtils.w("ApsIvaImaAdapter", "adMediaEnded: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    return;
                }
                this.c.b(str);
                a(str, EndCreativeCode.AUTO_CLOSE);
                return;
            }
            LogUtils.w("ApsIvaImaAdapter", "adMediaEnded: WebView not ready to run commands");
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error occurred while ending the Ad: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaPaused(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "adMediaPaused: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaImaAdapter", "adMediaPaused: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.g(str);
                    }
                }
                LogUtils.w("ApsIvaImaAdapter", "adMediaPaused: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Pausing Ad: %s", e3));
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
        LogUtils.d("ApsIvaImaAdapter", "adMediaPlayed:  %s", objArr);
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "adMediaPlayed: apsIvaAdManager object null or adId not present");
            } else if (b(str)) {
                LogUtils.w("ApsIvaImaAdapter", "adMediaPlayed: Ad or container is loading. Queued ad to play after loading");
                this.i.a(new MetricEvent("apsIva-playedAdWhilePreloadingCounter", Severity.WARNING));
                this.m = str;
            } else if (a(str)) {
                LogUtils.w("ApsIvaImaAdapter", "adMediaPlayed: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
            } else {
                this.c.i(str);
                f(str);
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Playing the Ad: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaPlaying(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "adMediaPlaying: apsIvaAdManager object null or adId not present");
            } else if (b(str)) {
                LogUtils.w("ApsIvaImaAdapter", "adMediaPlaying: Ad or container is loading. Queued ad to play after loading");
                this.m = str;
            } else if (a(str)) {
                LogUtils.w("ApsIvaImaAdapter", "adMediaPlaying: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
            } else {
                this.c.j(str);
                f(str);
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error occurred while the Ad was playing: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaSeeked(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "adMediaSeeked: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaImaAdapter", "adMediaSeeked: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.k(str);
                    }
                }
                LogUtils.w("ApsIvaImaAdapter", "adMediaSeeked: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error occurred while moving the playhead: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaSeeking(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "adMediaSeeking: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaImaAdapter", "adMediaSeeking: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.l(str);
                    }
                }
                LogUtils.w("ApsIvaImaAdapter", "adMediaSeeking: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error occurred while moving the playhead: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaStalled(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "adMediaStalled: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (a(str)) {
                        LogUtils.w("ApsIvaImaAdapter", "adMediaStalled: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.m(str);
                        this.c.e(str, EndCreativeCode.UNSPECIFIED);
                    }
                }
                LogUtils.w("ApsIvaImaAdapter", "adMediaStalled: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error occurred while informing media data isn't available for rendering. %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaVolumeChanged(String str, float f, boolean z) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "adMediaVolumeChanged: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaImaAdapter", "adMediaVolumeChanged: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.d(str, f, z);
                    }
                }
                LogUtils.w("ApsIvaImaAdapter", "adMediaVolumeChanged: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error updating the audio state: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void appBackgrounded(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "appBackgrounded: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    this.c.n(str);
                }
                LogUtils.w("ApsIvaImaAdapter", "appBackgrounded: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error while informing that app was backgrounded: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void appForegrounded(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "appForegrounded: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    this.c.o(str);
                }
                LogUtils.w("ApsIvaImaAdapter", "appForegrounded: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error while informing that app was foregrounded: %s", e3));
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
        LogUtils.d("ApsIvaImaAdapter", "clear");
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
            LogUtils.e("ApsIvaImaAdapter", String.format("Error destroying SDK. %s", e));
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

    public void f(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "startCreativePlayback: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() == AdOverlayState.PRELOAD_SUCCEEDED) {
                        this.f.get(str).setAdOverlayState(AdOverlayState.SHOWING);
                        this.c.p(str);
                    } else {
                        LogUtils.w("ApsIvaImaAdapter", "startCreativePlayback: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    }
                }
                LogUtils.w("ApsIvaImaAdapter", "startCreativePlayback: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            this.f.get(str).setAdOverlayState(AdOverlayState.START_FAILED);
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            this.f.get(str).setAdOverlayState(AdOverlayState.START_FAILED);
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (Exception e3) {
            this.f.get(str).setAdOverlayState(AdOverlayState.START_FAILED);
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Starting Ad: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void fatalError(String str, int i, String str2) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "fatalError: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaImaAdapter", "fatalError: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.a(i, str, str2);
                        a(str, EndCreativeCode.UNSPECIFIED);
                    }
                }
                LogUtils.w("ApsIvaImaAdapter", "fatalError: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error encountered by the player: %s", e3));
        }
    }

    public LoadStatus getContainerLoadStatus() {
        return this.d;
    }

    public void loadAndStartSimidCreative(SimidCreative simidCreative) {
        String str;
        Object[] objArr = new Object[1];
        if (simidCreative != null) {
            str = simidCreative.getPubProvidedAdId();
        } else {
            str = null;
        }
        objArr[0] = str;
        LogUtils.d("ApsIvaImaAdapter", "loadAndStartSimidCreative:  %s", objArr);
        try {
            if (simidCreative == null) {
                LogUtils.e("ApsIvaImaAdapter", "Ad extensions were null");
                this.i.a(new MetricEvent("apsIva-apsIvaImaSimidCreativeNullCounter", Severity.ERROR));
            } else if (this.c == null) {
                LogUtils.e("ApsIvaImaAdapter", "apsIvaAdManager object null");
                this.i.a(new MetricEvent("apsIva-apsIvaImaAdManagerNullCounter", Severity.ERROR));
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus != LoadStatus.PENDING_LOAD && loadStatus != LoadStatus.LOADING) {
                    if (loadStatus != LoadStatus.SUCCEEDED) {
                        LogUtils.w("ApsIvaImaAdapter", "WebView not ready to run commands");
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(simidCreative);
                        this.f = this.e.parse(arrayList);
                        a(simidCreative.getPubProvidedAdId(), true);
                    }
                }
                LogUtils.d("ApsIvaImaAdapter", String.format("Container loading, adding AdId: %s to pendingSimidCreativeList", simidCreative.getPubProvidedAdId()));
                this.l.add(simidCreative);
                this.m = simidCreative.getPubProvidedAdId();
            }
        } catch (RuntimeException e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error starting Simid Creative: %s", e));
        }
    }

    public void loadSimidCreatives(List<SimidCreative> list) {
        LogUtils.d("ApsIvaImaAdapter", "loadSimidCreatives");
        try {
            if (this.c == null) {
                LogUtils.e("ApsIvaImaAdapter", "apsIvaAdManager object null");
                this.i.a(new MetricEvent("apsIva-apsIvaImaAdManagerNullCounter", Severity.ERROR));
            } else if (this.d == LoadStatus.FAILED) {
                LogUtils.e("ApsIvaImaAdapter", "Container failed to load, can't load simid creatives");
            } else {
                if (list != null && !list.isEmpty()) {
                    LoadStatus loadStatus = this.d;
                    if (loadStatus != null && loadStatus != LoadStatus.PENDING_LOAD && loadStatus != LoadStatus.LOADING) {
                        this.l.addAll(list);
                        Map<String, CreativeData> parse = this.e.parse(this.l);
                        this.f = parse;
                        for (String str : parse.keySet()) {
                            a(str, false);
                        }
                        this.l.clear();
                        return;
                    }
                    LogUtils.d("ApsIvaImaAdapter", "Container loading, adding %d number of simid creatives to pendingSimidCreativeList", Integer.valueOf(list.size()));
                    this.l.addAll(list);
                    return;
                }
                LogUtils.w("ApsIvaImaAdapter", "Creative info list is null or empty");
            }
        } catch (RuntimeException e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error loading Simid Creative: %s", e));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void updateAdMediaState(String str, AdMediaState adMediaState) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(AdOverlayState.PENDING_PRELOAD, AdOverlayState.PRELOAD_SUCCEEDED, AdOverlayState.SHOWING));
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "updateAdMediaState: Missing ad id %s or apsIvaAdManager", str);
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (!arrayList.contains(this.f.get(str).getAdOverlayState())) {
                        LogUtils.w("ApsIvaImaAdapter", "updateAdMediaState: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.g.put(str, adMediaState);
                        this.c.h(str, adMediaState.getCurrentTime());
                    }
                }
                LogUtils.w("ApsIvaImaAdapter", "updateAdMediaState: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Updating Ad Time: %s", e3));
        }
    }

    public static ApsIvaImaAdapterBuilder builder(Context context, ApsIvaListener apsIvaListener, EnvironmentData environmentData, ViewGroup viewGroup, List<SimidCreative> list) {
        return defaultBuilder().context(context).apsIvaListener(apsIvaListener).environmentData(environmentData).viewGroup(viewGroup).simidCreativeList(list);
    }

    public void a(String str, EndCreativeCode endCreativeCode) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaImaAdapter", "endAd: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.d;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (endCreativeCode == null) {
                        LogUtils.e("ApsIvaImaAdapter", "endAd: argument invalid");
                    } else if (this.f.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaImaAdapter", "endAd: unexpected ad state %s", this.f.get(str).getAdOverlayState().name());
                    } else {
                        this.c.e(str, endCreativeCode);
                        this.f.remove(str);
                        this.g.remove(str);
                        this.i.a(new MetricEvent(String.format("apsIva-endCreative_%s_Counter", endCreativeCode.name()), Severity.INFO));
                    }
                }
                LogUtils.w("ApsIvaImaAdapter", "endAd: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            e(str);
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            e(str);
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Executing Command: %s", e2));
        } catch (Exception e3) {
            e(str);
            LogUtils.e("ApsIvaImaAdapter", String.format("Error Stopping Ad: %s", e3));
        }
    }

    public final boolean a(String str) {
        return ((this.f.get(str).getAdOverlayState() == AdOverlayState.PRELOAD_SUCCEEDED) || (this.f.get(str).getAdOverlayState() == AdOverlayState.SHOWING)) ? false : true;
    }
}
