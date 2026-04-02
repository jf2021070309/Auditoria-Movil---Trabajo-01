package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import e.a.d.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzbxy extends zzbxm {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private String zzd = "";

    public zzbxy(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzs(zzbdg zzbdgVar) {
        Bundle bundle;
        Bundle bundle2 = zzbdgVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzt(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzcgt.zzi(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException e2) {
            zzcgt.zzg("", e2);
            throw new RemoteException();
        }
    }

    private static final boolean zzu(zzbdg zzbdgVar) {
        if (zzbdgVar.zzf) {
            return true;
        }
        zzber.zza();
        return zzcgm.zzm();
    }

    private static final String zzv(String str, zzbdg zzbdgVar) {
        String str2 = zzbdgVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzbdl zzbdlVar, zzbxq zzbxqVar) throws RemoteException {
        char c2;
        AdFormat adFormat;
        try {
            zzbxw zzbxwVar = new zzbxw(this, zzbxqVar);
            RtbAdapter rtbAdapter = this.zza;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                adFormat = AdFormat.BANNER;
            } else if (c2 == 1) {
                adFormat = AdFormat.INTERSTITIAL;
            } else if (c2 == 2) {
                adFormat = AdFormat.REWARDED;
            } else if (c2 == 3) {
                adFormat = AdFormat.REWARDED_INTERSTITIAL;
            } else if (c2 != 4) {
                throw new IllegalArgumentException("Internal Error");
            } else {
                adFormat = AdFormat.NATIVE;
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zza.zza(zzbdlVar.zze, zzbdlVar.zzb, zzbdlVar.zza)), zzbxwVar);
        } catch (Throwable th) {
            throw a.I("Error generating signals for RTB", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final zzbya zzf() throws RemoteException {
        return zzbya.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final zzbya zzg() throws RemoteException {
        return zzbya.zza(this.zza.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final zzbhc zzh() {
        RtbAdapter rtbAdapter = this.zza;
        if (rtbAdapter instanceof com.google.android.gms.ads.mediation.zzb) {
            try {
                return ((com.google.android.gms.ads.mediation.zzb) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                zzcgt.zzg("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzi(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxb zzbxbVar, zzbvm zzbvmVar, zzbdl zzbdlVar) throws RemoteException {
        try {
            this.zza.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzbdgVar), zzu(zzbdgVar), zzbdgVar.zzk, zzbdgVar.zzg, zzbdgVar.zzt, zzv(str2, zzbdgVar), com.google.android.gms.ads.zza.zza(zzbdlVar.zze, zzbdlVar.zzb, zzbdlVar.zza), this.zzd), new zzbxs(this, zzbxbVar, zzbvmVar));
        } catch (Throwable th) {
            throw a.I("Adapter failed to render banner ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzj(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxe zzbxeVar, zzbvm zzbvmVar) throws RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzbdgVar), zzu(zzbdgVar), zzbdgVar.zzk, zzbdgVar.zzg, zzbdgVar.zzt, zzv(str2, zzbdgVar), this.zzd), new zzbxu(this, zzbxeVar, zzbvmVar));
        } catch (Throwable th) {
            throw a.I("Adapter failed to render interstitial ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzb != null) {
            try {
                Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
                return true;
            } catch (Throwable th) {
                zzcgt.zzg("", th);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzl(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxk zzbxkVar, zzbvm zzbvmVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzbdgVar), zzu(zzbdgVar), zzbdgVar.zzk, zzbdgVar.zzg, zzbdgVar.zzt, zzv(str2, zzbdgVar), this.zzd), new zzbxx(this, zzbxkVar, zzbvmVar));
        } catch (Throwable th) {
            throw a.I("Adapter failed to render rewarded ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzc != null) {
            try {
                Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
                return true;
            } catch (Throwable th) {
                zzcgt.zzg("", th);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzn(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbvm zzbvmVar) throws RemoteException {
        zzr(str, str2, zzbdgVar, iObjectWrapper, zzbxhVar, zzbvmVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzo(String str) {
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzp(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxk zzbxkVar, zzbvm zzbvmVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzbdgVar), zzu(zzbdgVar), zzbdgVar.zzk, zzbdgVar.zzg, zzbdgVar.zzt, zzv(str2, zzbdgVar), this.zzd), new zzbxx(this, zzbxkVar, zzbvmVar));
        } catch (Throwable th) {
            throw a.I("Adapter failed to render rewarded interstitial ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzq(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxb zzbxbVar, zzbvm zzbvmVar, zzbdl zzbdlVar) throws RemoteException {
        try {
            this.zza.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzbdgVar), zzu(zzbdgVar), zzbdgVar.zzk, zzbdgVar.zzg, zzbdgVar.zzt, zzv(str2, zzbdgVar), com.google.android.gms.ads.zza.zza(zzbdlVar.zze, zzbdlVar.zzb, zzbdlVar.zza), this.zzd), new zzbxt(this, zzbxbVar, zzbvmVar));
        } catch (Throwable th) {
            throw a.I("Adapter failed to render interscroller ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzr(String str, String str2, zzbdg zzbdgVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbvm zzbvmVar, zzblv zzblvVar) throws RemoteException {
        try {
            this.zza.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzt(str2), zzs(zzbdgVar), zzu(zzbdgVar), zzbdgVar.zzk, zzbdgVar.zzg, zzbdgVar.zzt, zzv(str2, zzbdgVar), this.zzd, zzblvVar), new zzbxv(this, zzbxhVar, zzbvmVar));
        } catch (Throwable th) {
            throw a.I("Adapter failed to render native ad.", th);
        }
    }
}
