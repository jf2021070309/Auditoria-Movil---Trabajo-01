package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.StrictMode;
import android.webkit.WebView;
import androidx.preference.e;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzec implements AdsLoader {
    zzmt zza;
    private final Context zzb;
    private final zzvx zzc;
    private final zzfm zzd;
    private final zzfi zze;
    private final zzex zzf;
    private final List zzg;
    private final Map zzh;
    private final Map zzi;
    private final zzge zzj;
    private final ImaSdkSettings zzk;
    private final BaseDisplayContainer zzl;
    private final zzhg zzm;
    private final zzhu zzn;
    private final Object zzo;
    private final zzvr zzp;
    private final zzhc zzq;
    private final TestingConfiguration zzr;

    public zzec(Context context, Uri uri, ImaSdkSettings imaSdkSettings, BaseDisplayContainer baseDisplayContainer, ExecutorService executorService) {
        ImaSdkSettings imaSdkSettings2;
        zzfm zzfmVar = new zzfm(new zzft(new Handler(Looper.getMainLooper()), new WebView(context), uri), context, uri, imaSdkSettings, executorService);
        this.zzc = zzvx.zzp();
        this.zze = new zzea(this);
        this.zzg = new ArrayList(1);
        this.zzh = new HashMap();
        this.zzi = new HashMap();
        this.zzo = new Object();
        this.zzd = zzfmVar;
        this.zzb = context;
        if (imaSdkSettings == null) {
            imaSdkSettings2 = ImaSdkFactory.getInstance().createImaSdkSettings();
        } else {
            imaSdkSettings2 = imaSdkSettings;
        }
        this.zzk = imaSdkSettings2;
        this.zzl = baseDisplayContainer;
        zzvr zza = zzvw.zza(executorService);
        this.zzp = zza;
        TestingConfiguration testingConfig = imaSdkSettings.getTestingConfig();
        this.zzr = testingConfig;
        zzge zzgeVar = new zzge(zzfmVar, context);
        this.zzj = zzgeVar;
        zzhc zzhcVar = new zzhc(zzfmVar);
        this.zzq = zzhcVar;
        this.zzf = new zzex(zzhcVar);
        zzfmVar.zzh(zzgeVar);
        baseDisplayContainer.claim();
        this.zzm = new zzhg(context, zza, zzhcVar, testingConfig);
        this.zzn = new zzhu(context, zza, zzhcVar);
    }

    public static /* bridge */ /* synthetic */ void zzm(zzec zzecVar, AdsManagerLoadedEvent adsManagerLoadedEvent) {
        for (AdsLoader.AdsLoadedListener adsLoadedListener : zzecVar.zzg) {
            adsLoadedListener.onAdsManagerLoaded(adsManagerLoadedEvent);
        }
    }

    public static final Object zzr(Future future) {
        if (future == null) {
            return null;
        }
        try {
            return zzvd.zzc(future);
        } catch (Exception e) {
            zzhd.zzb("Error during initialization", e);
            return null;
        } catch (Throwable th) {
            zzhd.zzb("Error during initialization", new Exception(th));
            return null;
        }
    }

    private final zzeb zzs() {
        ActivityInfo activityInfo;
        PackageManager packageManager = this.zzb.getPackageManager();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ads.interactivemedia.v3")), Cast.MAX_MESSAGE_LENGTH);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo == null) {
                return null;
            }
            return zzeb.create(packageInfo.versionCode, activityInfo.packageName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final com.google.ads.interactivemedia.v3.impl.data.zzaw zzt() {
        String str;
        SharedPreferences a = e.a(this.zzb);
        if (a != null) {
            try {
                int i = a.getInt("IABTCF_gdprApplies", 0);
                if (!a.contains("IABTCF_gdprApplies")) {
                    str = "";
                } else {
                    str = String.valueOf(i);
                }
                return com.google.ads.interactivemedia.v3.impl.data.zzaw.create(str, a.getString("IABTCF_TCString", ""), a.getString("IABTCF_AddtlConsent", ""), a.getString("IABUSPrivacy_String", ""));
            } catch (ClassCastException e) {
                zzhd.zzb("Failed to read TCF Consent settings from SharedPreferences.", e);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.ads.interactivemedia.v3.impl.data.zzbu zzu() {
        /*
            r3 = this;
            android.content.Context r0 = r3.zzb
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = r0.checkCallingOrSelfPermission(r1)
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.String r0 = "Host application doesn't have ACCESS_NETWORK_STATE permission"
            com.google.ads.interactivemedia.v3.internal.zzhd.zzd(r0)
        L10:
            r0 = r1
            goto L32
        L12:
            android.content.Context r0 = r3.zzb
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 != 0) goto L1f
        L1e:
            goto L10
        L1f:
            android.net.Network r2 = r0.getActiveNetwork()
            android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r2)
            if (r0 != 0) goto L2a
            goto L1e
        L2a:
            int r0 = r0.getLinkDownstreamBandwidthKbps()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L32:
            if (r0 != 0) goto L35
            return r1
        L35:
            com.google.ads.interactivemedia.v3.impl.data.zzbu r0 = com.google.ads.interactivemedia.v3.impl.data.zzbu.create(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzec.zzu():com.google.ads.interactivemedia.v3.impl.data.zzbu");
    }

    private final String zzv() {
        TestingConfiguration testingConfiguration = this.zzr;
        if (testingConfiguration != null && testingConfiguration.ignoreStrictModeFalsePositives()) {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
            String uuid = UUID.randomUUID().toString();
            StrictMode.setThreadPolicy(threadPolicy);
            return uuid;
        }
        return UUID.randomUUID().toString();
    }

    private final String zzw() {
        return String.format("android%s:%s:%s", Build.VERSION.RELEASE, "3.30.3", this.zzb.getPackageName());
    }

    private final String zzx(Context context, boolean z) {
        int i;
        synchronized (this.zzo) {
            if (this.zza == null) {
                if (true != z) {
                    i = 2;
                } else {
                    i = 3;
                }
                zzl zza = zzm.zza();
                zza.zzd(i);
                zza.zzc("a.3.30.3");
                zza.zza(false);
                zza.zzb(false);
                try {
                    this.zza = new zzmt(this.zzb, this.zzp, (zzm) zza.zzak());
                } catch (RuntimeException unused) {
                    this.zza = null;
                }
            }
        }
        try {
            zzmt zzmtVar = this.zza;
            if (zzmtVar != null) {
                return zzmtVar.zza(context);
            }
            return "";
        } catch (RemoteException unused2) {
            return "";
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.zzf.zza(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void addAdsLoadedListener(AdsLoader.AdsLoadedListener adsLoadedListener) {
        this.zzg.add(adsLoadedListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void contentComplete() {
        this.zzd.zzp(new zzff(zzfd.adsLoader, zzfe.contentComplete, "*", null));
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final ImaSdkSettings getSettings() {
        return this.zzk;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void release() {
        this.zzl.destroy();
        zzfm zzfmVar = this.zzd;
        if (zzfmVar != null) {
            zzfmVar.zzm();
        }
        this.zzh.clear();
        this.zzg.clear();
        this.zzf.zzb();
        this.zzi.clear();
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.zzf.zzd(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void removeAdsLoadedListener(AdsLoader.AdsLoadedListener adsLoadedListener) {
        this.zzg.remove(adsLoadedListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final void requestAds(final AdsRequest adsRequest) {
        this.zzc.zzm(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzdv
            @Override // java.lang.Runnable
            public final void run() {
                zzec.this.zzo(adsRequest);
            }
        }, this.zzp);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsLoader
    public final String requestStream(final StreamRequest streamRequest) {
        String zzv = zzv();
        this.zzc.zzm(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzdu
            @Override // java.lang.Runnable
            public final void run() {
                zzec.this.zzp(streamRequest);
            }
        }, this.zzp);
        return zzv;
    }

    public final /* synthetic */ String zzg(JavaScriptMsgData javaScriptMsgData) throws Exception {
        return zzx(this.zzb, javaScriptMsgData.useAndroidAdshieldV2);
    }

    public final /* synthetic */ String zzh(JavaScriptMsgData javaScriptMsgData) throws Exception {
        return zzx(this.zzb, javaScriptMsgData.useAndroidAdshieldV2);
    }

    public final /* synthetic */ Void zzi(AdsRequest adsRequest, zzvq zzvqVar, AdDisplayContainer adDisplayContainer, zzvq zzvqVar2, zzvq zzvqVar3, zzvq zzvqVar4, String str) throws Exception {
        SecureSignals secureSignals = adsRequest.getSecureSignals();
        List list = (List) zzr(zzvqVar);
        zzhv.zza(secureSignals, list);
        com.google.ads.interactivemedia.v3.impl.data.zzbc zzbcVar = (com.google.ads.interactivemedia.v3.impl.data.zzbc) zzvd.zzc(zzvqVar2);
        String str2 = (String) zzvd.zzc(zzvqVar3);
        com.google.ads.interactivemedia.v3.impl.data.zzaw zzt = zzt();
        zzff zzffVar = new zzff(zzfd.adsLoader, zzfe.requestAds, str, com.google.ads.interactivemedia.v3.impl.data.zzba.create(adsRequest, zzw(), zzt, list, (Map) zzr(zzvqVar4), "android:0", zzu(), this.zzk, zzs(), zzgq.zzc(this.zzb, this.zzr), zzgq.zzb(this.zzb, this.zzr), str2, zzbcVar, adDisplayContainer));
        this.zzd.zzj(zzbcVar);
        this.zzd.zzp(zzffVar);
        return null;
    }

    public final /* synthetic */ Void zzj(StreamRequest streamRequest, zzvq zzvqVar, zzvq zzvqVar2, zzvq zzvqVar3, zzvq zzvqVar4, String str) throws Exception {
        SecureSignals secureSignals = streamRequest.getSecureSignals();
        List list = (List) zzr(zzvqVar);
        zzhv.zza(secureSignals, list);
        StreamDisplayContainer streamDisplayContainer = (StreamDisplayContainer) this.zzl;
        com.google.ads.interactivemedia.v3.impl.data.zzbc zzbcVar = (com.google.ads.interactivemedia.v3.impl.data.zzbc) zzvd.zzc(zzvqVar2);
        String str2 = (String) zzvd.zzc(zzvqVar3);
        com.google.ads.interactivemedia.v3.impl.data.zzaw zzt = zzt();
        zzff zzffVar = new zzff(zzfd.adsLoader, zzfe.requestStream, str, com.google.ads.interactivemedia.v3.impl.data.zzba.createFromStreamRequest(streamRequest, zzw(), zzt, list, (Map) zzr(zzvqVar4), "android:0", zzu(), this.zzk, zzs(), zzgq.zzc(this.zzb, this.zzr), zzgq.zzb(this.zzb, this.zzr), str2, zzbcVar, streamDisplayContainer));
        this.zzd.zzj(zzbcVar);
        this.zzd.zzp(zzffVar);
        return null;
    }

    public final /* synthetic */ void zzn(Task task) {
        List<String> list;
        JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) task.getResult();
        this.zzq.zzd(javaScriptMsgData.enableInstrumentation);
        Integer num = javaScriptMsgData.espAdapterTimeoutMs;
        if (num != null && (list = javaScriptMsgData.espAdapters) != null) {
            this.zzn.zzc(list, num);
            this.zzn.zzb();
        }
        this.zzm.zzb(javaScriptMsgData.platformSignalCollectorTimeoutMs);
        this.zzc.zzc(javaScriptMsgData);
    }

    public final /* synthetic */ void zzo(final AdsRequest adsRequest) {
        final String zzv = zzv();
        final JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) zzr(this.zzc);
        if (adsRequest == null) {
            this.zzf.zzc(new zzdl(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "AdsRequest cannot be null.")));
            return;
        }
        BaseDisplayContainer baseDisplayContainer = this.zzl;
        if (!(baseDisplayContainer instanceof AdDisplayContainer)) {
            this.zzf.zzc(new zzdl(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "AdsLoader must be constructed with AdDisplayContainer.")));
        } else if (baseDisplayContainer.getAdContainer() == null) {
            this.zzf.zzc(new zzdl(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad display container must have a UI container.")));
        } else if (zzro.zzc(adsRequest.getAdTagUrl()) && zzro.zzc(adsRequest.getAdsResponse())) {
            this.zzf.zzc(new zzdl(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad tag url must non-null and non empty.")));
        } else {
            final AdDisplayContainer adDisplayContainer = (AdDisplayContainer) this.zzl;
            if (adDisplayContainer.getPlayer() == null) {
                this.zzf.zzc(new zzdl(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.ADS_PLAYER_NOT_PROVIDED, "VideoAdPlayer must be set on AdDisplayContainer before requesting ads."), new Object()));
                return;
            }
            this.zzh.put(zzv, adsRequest);
            this.zzd.zzf(this.zze, zzv);
            this.zzd.zze(adDisplayContainer, zzv);
            final zzgx zzgxVar = new zzgx(this.zzb, new zzgu(javaScriptMsgData), this.zzq);
            final zzvq zza = this.zzp.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzdq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzgx.this.zza(adsRequest);
                }
            });
            final zzvq zza2 = this.zzp.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzdr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzec.this.zzg(javaScriptMsgData);
                }
            });
            zzvr zzvrVar = this.zzp;
            zzhu zzhuVar = this.zzn;
            zzhuVar.getClass();
            final zzvq zza3 = zzvrVar.zza(new zzds(zzhuVar));
            final zzvq zza4 = zzqx.zza(this.zzm.zza());
            this.zzq.zzc(zzvd.zza(zza, zza2, zza3, zza4).zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzdt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzec.this.zzi(adsRequest, zza3, adDisplayContainer, zza, zza2, zza4, zzv);
                    return null;
                }
            }, this.zzp), this.zzp, com.google.ads.interactivemedia.v3.impl.data.zzbe.ADS_LOADER, com.google.ads.interactivemedia.v3.impl.data.zzbf.REQUEST_ADS);
        }
    }

    public final /* synthetic */ void zzp(final StreamRequest streamRequest) {
        final String zzv = zzv();
        final JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) zzr(this.zzc);
        if (streamRequest == null) {
            this.zzf.zzc(new zzdl(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "StreamRequest cannot be null.")));
            return;
        }
        BaseDisplayContainer baseDisplayContainer = this.zzl;
        if (!(baseDisplayContainer instanceof StreamDisplayContainer)) {
            this.zzf.zzc(new zzdl(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "AdsLoader must be constructed with StreamDisplayContainer.")));
        } else if (((StreamDisplayContainer) baseDisplayContainer).getVideoStreamPlayer() == null) {
            this.zzf.zzc(new zzdl(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Stream requests must specify a player.")));
        } else {
            this.zzi.put(zzv, streamRequest);
            this.zzd.zzf(this.zze, zzv);
            this.zzd.zze(this.zzl, zzv);
            final zzgx zzgxVar = new zzgx(this.zzb, new zzgu(javaScriptMsgData), this.zzq);
            final zzvq zza = this.zzp.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzdw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzgx.this.zza(streamRequest);
                }
            });
            zzvr zzvrVar = this.zzp;
            zzhu zzhuVar = this.zzn;
            zzhuVar.getClass();
            final zzvq zza2 = zzvrVar.zza(new zzds(zzhuVar));
            final zzvq zza3 = this.zzp.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzdx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzec.this.zzh(javaScriptMsgData);
                }
            });
            final zzvq zza4 = zzqx.zza(this.zzm.zza());
            this.zzq.zzc(zzvd.zza(zza, zza2, zza3, zza4).zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzdy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzec.this.zzj(streamRequest, zza2, zza, zza3, zza4, zzv);
                    return null;
                }
            }, this.zzp), this.zzp, com.google.ads.interactivemedia.v3.impl.data.zzbe.ADS_LOADER, com.google.ads.interactivemedia.v3.impl.data.zzbf.REQUEST_STREAM);
        }
    }

    public final void zzq() {
        this.zzd.zzc().addOnCompleteListener(this.zzp, new OnCompleteListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzdz
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzec.this.zzn(task);
            }
        });
    }
}
