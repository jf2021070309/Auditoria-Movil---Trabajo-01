package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbqc extends zzbpp {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private MediationAppOpenAd zzd;
    private String zze = "";

    public zzbqc(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.zza.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    private static final Bundle zzw(String str) throws RemoteException {
        zzbzo.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                c cVar = new c(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = cVar.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, cVar.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (b e) {
            zzbzo.zzh("", e);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(zzl zzlVar) {
        if (!zzlVar.zzf) {
            zzay.zzb();
            if (!zzbzh.zzr()) {
                return false;
            }
            return true;
        }
        return true;
    }

    private static final String zzy(String str, zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new c(str).getString("max_ad_content_rating");
        } catch (b unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final zzdq zze() {
        RtbAdapter rtbAdapter = this.zza;
        if (rtbAdapter instanceof zza) {
            try {
                return ((zza) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                zzbzo.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final zzbqe zzf() throws RemoteException {
        return zzbqe.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final zzbqe zzg() throws RemoteException {
        return zzbqe.zza(this.zza.getSDKVersionInfo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzq zzqVar, zzbpt zzbptVar) throws RemoteException {
        char c;
        AdFormat adFormat;
        try {
            zzbqa zzbqaVar = new zzbqa(this, zzbptVar);
            RtbAdapter rtbAdapter = this.zza;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1167692200:
                    if (str.equals(FirebaseAnalytics.Event.APP_OPEN)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c == 5) {
                                    adFormat = AdFormat.APP_OPEN_AD;
                                } else {
                                    throw new IllegalArgumentException("Internal Error");
                                }
                            } else {
                                adFormat = AdFormat.NATIVE;
                            }
                        } else {
                            adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        }
                    } else {
                        adFormat = AdFormat.REWARDED;
                    }
                } else {
                    adFormat = AdFormat.INTERSTITIAL;
                }
            } else {
                adFormat = AdFormat.BANNER;
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), zzbqaVar);
        } catch (Throwable th) {
            throw a.c("Error generating signals for RTB", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzi(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpb zzbpbVar, zzbnz zzbnzVar) throws RemoteException {
        try {
            this.zza.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze), new zzbpz(this, zzbpbVar, zzbnzVar));
        } catch (Throwable th) {
            throw a.c("Adapter failed to render app open ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzj(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, zzbnz zzbnzVar, zzq zzqVar) throws RemoteException {
        try {
            this.zza.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.zze), new zzbpv(this, zzbpeVar, zzbnzVar));
        } catch (Throwable th) {
            throw a.c("Adapter failed to render banner ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzk(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, zzbnz zzbnzVar, zzq zzqVar) throws RemoteException {
        try {
            this.zza.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.zze), new zzbpw(this, zzbpeVar, zzbnzVar));
        } catch (Throwable th) {
            throw a.c("Adapter failed to render interscroller ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzl(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbph zzbphVar, zzbnz zzbnzVar) throws RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze), new zzbpx(this, zzbphVar, zzbnzVar));
        } catch (Throwable th) {
            throw a.c("Adapter failed to render interstitial ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzm(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpk zzbpkVar, zzbnz zzbnzVar) throws RemoteException {
        zzn(str, str2, zzlVar, iObjectWrapper, zzbpkVar, zzbnzVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzn(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpk zzbpkVar, zzbnz zzbnzVar, zzbdz zzbdzVar) throws RemoteException {
        try {
            this.zza.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze, zzbdzVar), new zzbpy(this, zzbpkVar, zzbnzVar));
        } catch (Throwable th) {
            throw a.c("Adapter failed to render native ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzo(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpn zzbpnVar, zzbnz zzbnzVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze), new zzbqb(this, zzbpnVar, zzbnzVar));
        } catch (Throwable th) {
            throw a.c("Adapter failed to render rewarded interstitial ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzp(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpn zzbpnVar, zzbnz zzbnzVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze), new zzbqb(this, zzbpnVar, zzbnzVar));
        } catch (Throwable th) {
            throw a.c("Adapter failed to render rewarded ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zzq(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationAppOpenAd mediationAppOpenAd = this.zzd;
        if (mediationAppOpenAd != null) {
            try {
                mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                zzbzo.zzh("", th);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd != null) {
            try {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                zzbzo.zzh("", th);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd != null) {
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                zzbzo.zzh("", th);
                return true;
            }
        }
        return false;
    }
}
