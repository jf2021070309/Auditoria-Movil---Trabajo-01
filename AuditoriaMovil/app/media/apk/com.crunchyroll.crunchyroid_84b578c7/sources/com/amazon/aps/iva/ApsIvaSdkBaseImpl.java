package com.amazon.aps.iva;

import android.content.Context;
import android.view.ViewGroup;
import com.amazon.aps.iva.ApsIvaSdkBaseImpl;
import com.amazon.aps.iva.a9.w;
import com.amazon.aps.iva.g1.m;
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
import com.amazon.aps.iva.util.LogUtils;
import com.amazon.aps.iva.wa.e;
import com.amazon.aps.iva.wa.k;
import com.amazon.aps.iva.wa.p;
import com.amazon.aps.iva.wa.q;
import com.amazon.aps.iva.wa.s;
import com.amazon.aps.iva.xa.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import lombok.NonNull;
/* loaded from: classes.dex */
public class ApsIvaSdkBaseImpl implements ApsIvaSdk {
    public EnvironmentData a;
    public a b;
    public p c;
    public Map<String, AdMediaState> d;
    public e e;
    public LoadStatus f;
    public Map<String, CreativeData> g;
    public b h;
    public s i;
    public String j;

    public void a(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull ApsIvaListener apsIvaListener, @NonNull EnvironmentData environmentData, @NonNull b bVar, @NonNull q<LoadStatus> qVar, LogUtils.LOG_LEVEL log_level) {
        if (qVar != null) {
            this.a = environmentData;
            this.d = new LinkedHashMap();
            a a = com.amazon.aps.iva.l9.a.d().a();
            this.b = a;
            a.a(context);
            this.h = bVar;
            this.c = new p();
            LogUtils.setAppUUID(this.a.getAppId());
            if (log_level == null) {
                log_level = LogUtils.LOG_LEVEL.INFO;
            }
            LogUtils.setLogLevel(log_level);
            LogUtils.d("ApsIvaSdkBaseImpl", "Init:  %s", this.a.getVersion());
            if (!this.b.b("enableIVA")) {
                LogUtils.i("ApsIvaSdkBaseImpl", "The Interactive Video Ads feature is disabled by Amazon APS. Please contact APS for more details.");
                return;
            }
            try {
                this.c.a(qVar);
                com.amazon.aps.iva.wa.b bVar2 = new com.amazon.aps.iva.wa.b(viewGroup, context, this.h, apsIvaListener, this.b, this.c);
                this.i = bVar2;
                k kVar = new k(bVar2, this.h, this.c);
                this.c.d = new m(this);
                this.e = new e(kVar);
                return;
            } catch (UnsupportedOperationException e) {
                LogUtils.e("ApsIvaSdkBaseImpl", String.format("UnsupportedOperationException: Error Initializing ApsIvaSdkBaseImpl: %s", e));
                this.h.a(new MetricEvent("apsIva-unsupportedOperationExceptionCounter", Severity.ERROR));
                return;
            } catch (RuntimeException e2) {
                LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Initializing ApsIvaSdkBaseImpl: %s", e2));
                this.h.a(new MetricEvent("apsIva-runTimeExceptionSdkInitialization", Severity.ERROR));
                return;
            }
        }
        throw new NullPointerException("containerLoadStatusEventHandler is marked non-null but is null");
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaDurationChanged(String str, float f) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "adMediaDurationChanged: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.f;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.g.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkBaseImpl", "adMediaDurationChanged: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
                    } else {
                        this.e.c(str, f);
                        this.d.get(str).setDuration(f);
                    }
                }
                LogUtils.w("ApsIvaSdkBaseImpl", "adMediaDurationChanged: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error occurred while changing the Ad's duration: %s", e3));
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
        LogUtils.d("ApsIvaSdkBaseImpl", "adMediaEnded:  %s", objArr);
        try {
            String str3 = this.j;
            if (str3 != null && str3.equals(str)) {
                this.j = null;
            }
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "adMediaEnded: apsIvaAdManager object null or adId not present");
                return;
            }
            LoadStatus loadStatus = this.f;
            if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                if (this.g.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                    LogUtils.w("ApsIvaSdkBaseImpl", "adMediaEnded: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
                    return;
                }
                this.e.b(str);
                endAd(str, EndCreativeCode.AUTO_CLOSE);
                return;
            }
            LogUtils.w("ApsIvaSdkBaseImpl", "adMediaEnded: WebView not ready to run commands");
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error occurred while ending the Ad: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaPaused(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "adMediaPaused: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.f;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.g.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkBaseImpl", "adMediaPaused: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
                    } else {
                        this.e.g(str);
                    }
                }
                LogUtils.w("ApsIvaSdkBaseImpl", "adMediaPaused: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Pausing Ad: %s", e3));
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
        LogUtils.d("ApsIvaSdkBaseImpl", "adMediaPlayed:  %s", objArr);
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "adMediaPlayed: apsIvaAdManager object null or adId not present");
            } else if (b(str)) {
                LogUtils.w("ApsIvaSdkBaseImpl", "adMediaPlayed: Ad or container is loading. Queued ad to play after loading");
                this.h.a(new MetricEvent("apsIva-playedAdWhilePreloadingCounter", Severity.WARNING));
                this.j = str;
            } else if (a(str)) {
                LogUtils.w("ApsIvaSdkBaseImpl", "adMediaPlayed: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
            } else {
                this.e.i(str);
                e(str);
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Playing the Ad: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaPlaying(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "adMediaPlaying: apsIvaAdManager object null or adId not present");
            } else if (b(str)) {
                LogUtils.w("ApsIvaSdkBaseImpl", "adMediaPlaying: Ad or container is loading. Queued ad to play after loading");
                this.j = str;
            } else if (a(str)) {
                LogUtils.w("ApsIvaSdkBaseImpl", "adMediaPlaying: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
            } else {
                this.e.j(str);
                e(str);
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error occurred while the Ad was playing: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaSeeked(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "adMediaSeeked: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.f;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.g.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkBaseImpl", "adMediaSeeked: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
                    } else {
                        this.e.k(str);
                    }
                }
                LogUtils.w("ApsIvaSdkBaseImpl", "adMediaSeeked: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error occurred while moving the playhead: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaSeeking(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "adMediaSeeking: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.f;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.g.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkBaseImpl", "adMediaSeeking: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
                    } else {
                        this.e.l(str);
                    }
                }
                LogUtils.w("ApsIvaSdkBaseImpl", "adMediaSeeking: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error occurred while moving the playhead: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaStalled(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "adMediaStalled: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.f;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (a(str)) {
                        LogUtils.w("ApsIvaSdkBaseImpl", "adMediaStalled: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
                    } else {
                        this.e.m(str);
                        this.e.e(str, EndCreativeCode.UNSPECIFIED);
                    }
                }
                LogUtils.w("ApsIvaSdkBaseImpl", "adMediaStalled: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error occurred while informing media data isn't available for rendering. %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void adMediaVolumeChanged(String str, float f, boolean z) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "adMediaVolumeChanged: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.f;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.g.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkBaseImpl", "adMediaVolumeChanged: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
                    } else {
                        this.e.d(str, f, z);
                    }
                }
                LogUtils.w("ApsIvaSdkBaseImpl", "adMediaVolumeChanged: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error updating the audio state: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void appBackgrounded(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "appBackgrounded: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.f;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    this.e.n(str);
                }
                LogUtils.w("ApsIvaSdkBaseImpl", "appBackgrounded: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error while informing that app was backgrounded: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void appForegrounded(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "appForegrounded: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.f;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    this.e.o(str);
                }
                LogUtils.w("ApsIvaSdkBaseImpl", "appForegrounded: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error while informing that app was foregrounded: %s", e3));
        }
    }

    public final boolean b(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.g.get(str).getAdOverlayState() == AdOverlayState.PENDING_PRELOAD) {
            z = true;
        } else {
            z = false;
        }
        LoadStatus loadStatus = this.f;
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
        LogUtils.d("ApsIvaSdkBaseImpl", "clear");
        try {
            s sVar = this.i;
            if (sVar != null) {
                ((com.amazon.aps.iva.wa.b) sVar).b();
            }
            com.amazon.aps.iva.l9.a.d().a = null;
            w.c().c = null;
            this.h.a();
            com.amazon.aps.iva.va.b.c().a();
        } catch (RuntimeException e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error destroying SDK. %s", e));
        }
    }

    public final boolean d(String str) {
        Map<String, CreativeData> map;
        if (this.e != null && str != null && (map = this.g) != null && map.get(str) != null) {
            return false;
        }
        return true;
    }

    public void e(String str) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "startCreativePlayback: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.f;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.g.get(str).getAdOverlayState() == AdOverlayState.PRELOAD_SUCCEEDED) {
                        this.g.get(str).setAdOverlayState(AdOverlayState.SHOWING);
                        this.e.p(str);
                    } else {
                        LogUtils.w("ApsIvaSdkBaseImpl", "startCreativePlayback: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
                    }
                }
                LogUtils.w("ApsIvaSdkBaseImpl", "startCreativePlayback: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            this.g.get(str).setAdOverlayState(AdOverlayState.START_FAILED);
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            this.g.get(str).setAdOverlayState(AdOverlayState.START_FAILED);
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            this.g.get(str).setAdOverlayState(AdOverlayState.START_FAILED);
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Starting Ad: %s", e3));
        }
    }

    public void endAd(String str, EndCreativeCode endCreativeCode) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "endAd: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.f;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (endCreativeCode == null) {
                        LogUtils.e("ApsIvaSdkBaseImpl", "endAd: argument invalid");
                    } else if (this.g.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkBaseImpl", "endAd: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
                    } else {
                        this.e.e(str, endCreativeCode);
                        this.g.remove(str);
                        this.d.remove(str);
                        this.h.a(new MetricEvent(String.format("apsIva-endCreative_%s_Counter", endCreativeCode.name()), Severity.INFO));
                    }
                }
                LogUtils.w("ApsIvaSdkBaseImpl", "endAd: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            setAdEndingFailed(str);
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            setAdEndingFailed(str);
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            setAdEndingFailed(str);
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Stopping Ad: %s", e3));
        }
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void fatalError(String str, int i, String str2) {
        try {
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "fatalError: apsIvaAdManager object null or adId not present");
            } else {
                LoadStatus loadStatus = this.f;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (this.g.get(str).getAdOverlayState() != AdOverlayState.SHOWING) {
                        LogUtils.w("ApsIvaSdkBaseImpl", "fatalError: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
                    } else {
                        this.e.a(i, str, str2);
                        endAd(str, EndCreativeCode.UNSPECIFIED);
                    }
                }
                LogUtils.w("ApsIvaSdkBaseImpl", "fatalError: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error encountered by the player: %s", e3));
        }
    }

    public LoadStatus getContainerLoadStatus() {
        return this.f;
    }

    public void initializeAd(String str, final boolean z) {
        try {
        } catch (com.amazon.aps.iva.ua.a e) {
            this.g.get(str).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
            this.h.a(new MetricEvent("apsIva-invalidArgumentsExceptionCounter", Severity.ERROR));
        } catch (com.amazon.aps.iva.ua.b e2) {
            this.g.get(str).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            this.g.get(str).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Initializing Ad: %s", e3));
        }
        if (d(str)) {
            LogUtils.e("ApsIvaSdkBaseImpl", "initializeAd: apsIvaAdManager object null or adId not present");
            this.h.a(new MetricEvent("apsIva-creativeDataMapNullOrAdNullCounter", Severity.ERROR));
            return;
        }
        LoadStatus loadStatus = this.f;
        if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
            if (this.g.get(str).getAdOverlayState() != AdOverlayState.UNINITIALIZED) {
                LogUtils.w("ApsIvaSdkBaseImpl", "initializeAd: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
                return;
            } else if (!com.amazon.aps.iva.l9.a.c(this.g.get(str).getCreativeUrl())) {
                this.g.get(str).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
                return;
            } else {
                this.g.get(str).setAdOverlayState(AdOverlayState.PENDING_PRELOAD);
                this.c.c = new q() { // from class: com.amazon.aps.iva.pa.d
                    @Override // com.amazon.aps.iva.wa.q
                    public final void a(Object obj) {
                        PreloadCallbackArgs preloadCallbackArgs = (PreloadCallbackArgs) obj;
                        ApsIvaSdkBaseImpl apsIvaSdkBaseImpl = ApsIvaSdkBaseImpl.this;
                        apsIvaSdkBaseImpl.getClass();
                        boolean equalsIgnoreCase = preloadCallbackArgs.getDidPreload().equalsIgnoreCase(Boolean.TRUE.toString());
                        String adId = preloadCallbackArgs.getAdId();
                        if (apsIvaSdkBaseImpl.d(adId)) {
                            LogUtils.e("ApsIvaSdkBaseImpl", "apsIvaAdManager object null or adId not present");
                        } else if (!equalsIgnoreCase) {
                            apsIvaSdkBaseImpl.g.get(adId).setAdOverlayState(AdOverlayState.PRELOAD_FAILED);
                            LogUtils.w("ApsIvaSdkBaseImpl", "onPreloadCallback: An ad failed to preload");
                            apsIvaSdkBaseImpl.h.a(new MetricEvent("apsIva-adPreloadFailureCounter", Severity.ERROR));
                        } else {
                            apsIvaSdkBaseImpl.g.get(adId).setAdOverlayState(AdOverlayState.PRELOAD_SUCCEEDED);
                            LogUtils.i("ApsIvaSdkBaseImpl", "Ad ID: %s preloaded successfully", adId);
                            if (!"FakeWarmUpAd".equals(adId)) {
                                apsIvaSdkBaseImpl.h.a(new MetricEvent("apsIva-adPreloadSuccessCounter", Severity.INFO));
                            }
                            if (adId.equals(apsIvaSdkBaseImpl.j)) {
                                apsIvaSdkBaseImpl.adMediaPlayed(apsIvaSdkBaseImpl.j);
                                apsIvaSdkBaseImpl.j = null;
                            } else if (z) {
                                apsIvaSdkBaseImpl.adMediaPlayed(adId);
                            }
                        }
                    }
                };
                this.e.f(str, this.a, this.g.get(str));
                this.d.put(str, AdMediaState.builder().currentTime(0.0f).duration(15.0f).ended(false).fullscreen(true).muted(false).paused(false).volume(0.5f).build());
                return;
            }
        }
        LogUtils.w("ApsIvaSdkBaseImpl", "initializeAd: WebView not ready to run commands");
    }

    public void setAdEndingFailed(String str) {
        if (!d(str)) {
            this.g.get(str).setAdOverlayState(AdOverlayState.ENDING_FAILED);
        }
    }

    public void setCreativeDataMap(Map<String, CreativeData> map) {
        this.g = map;
    }

    public void setMetricsLogger(b bVar) {
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.ApsIvaSdk
    public void updateAdMediaState(String str, AdMediaState adMediaState) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(AdOverlayState.PENDING_PRELOAD, AdOverlayState.PRELOAD_SUCCEEDED, AdOverlayState.SHOWING));
            if (d(str)) {
                LogUtils.e("ApsIvaSdkBaseImpl", "updateAdMediaState: Missing ad id %s or apsIvaAdManager", str);
            } else {
                LoadStatus loadStatus = this.f;
                if (loadStatus != null && loadStatus == LoadStatus.SUCCEEDED) {
                    if (!arrayList.contains(this.g.get(str).getAdOverlayState())) {
                        LogUtils.w("ApsIvaSdkBaseImpl", "updateAdMediaState: unexpected ad state %s", this.g.get(str).getAdOverlayState().name());
                    } else {
                        this.d.put(str, adMediaState);
                        this.e.h(str, adMediaState.getCurrentTime());
                    }
                }
                LogUtils.w("ApsIvaSdkBaseImpl", "updateAdMediaState: WebView not ready to run commands");
            }
        } catch (com.amazon.aps.iva.ua.a e) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Validating Arguments: %s", e));
        } catch (com.amazon.aps.iva.ua.b e2) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Executing Command: %s", e2));
        } catch (RuntimeException e3) {
            LogUtils.e("ApsIvaSdkBaseImpl", String.format("Error Updating Ad Time: %s", e3));
        }
    }

    public final boolean a(String str) {
        return ((this.g.get(str).getAdOverlayState() == AdOverlayState.PRELOAD_SUCCEEDED) || (this.g.get(str).getAdOverlayState() == AdOverlayState.SHOWING)) ? false : true;
    }
}
