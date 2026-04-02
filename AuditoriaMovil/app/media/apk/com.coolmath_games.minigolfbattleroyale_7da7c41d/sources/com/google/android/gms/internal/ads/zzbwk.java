package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbwk<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends zzbvi {
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> zza;
    private final NETWORK_EXTRAS zzb;

    public zzbwk(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.zza = mediationAdapter;
        this.zzb = network_extras;
    }

    private final SERVER_PARAMETERS zzb(String str) throws RemoteException {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.zza.getServerParametersType();
            if (serverParametersType != null) {
                SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
                newInstance.load(hashMap);
                return newInstance;
            }
            return null;
        } catch (Throwable th) {
            zzcgt.zzg("", th);
            throw new RemoteException();
        }
    }

    private static final boolean zzc(zzbdg zzbdgVar) {
        if (zzbdgVar.zzf) {
            return true;
        }
        zzber.zza();
        return zzcgm.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzA(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbhc zzB() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbvv zzC() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzD(IObjectWrapper iObjectWrapper, zzbdg zzbdgVar, String str, zzbvm zzbvmVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzF(IObjectWrapper iObjectWrapper, zzbrp zzbrpVar, List<zzbrv> list) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzG(IObjectWrapper iObjectWrapper, zzbdg zzbdgVar, String str, zzbvm zzbvmVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbya zzH() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbya zzI() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzJ(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, zzbdg zzbdgVar, String str, String str2, zzbvm zzbvmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbvp zzK() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzL(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbvr zzM() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbvs zzN() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, zzbdg zzbdgVar, String str, zzbvm zzbvmVar) throws RemoteException {
        zzj(iObjectWrapper, zzbdlVar, zzbdgVar, str, null, zzbvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final IObjectWrapper zzf() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zza;
        if (mediationAdapter instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) mediationAdapter).getBannerView());
            } catch (Throwable th) {
                zzcgt.zzg("", th);
                throw new RemoteException();
            }
        }
        String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
        zzcgt.zzi(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzg(IObjectWrapper iObjectWrapper, zzbdg zzbdgVar, String str, zzbvm zzbvmVar) throws RemoteException {
        zzk(iObjectWrapper, zzbdgVar, str, null, zzbvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzh() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zza;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzcgt.zzi(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzcgt.zzd("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zza).showInterstitial();
        } catch (Throwable th) {
            zzcgt.zzg("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzj(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, zzbdg zzbdgVar, String str, String str2, zzbvm zzbvmVar) throws RemoteException {
        AdSize adSize;
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zza;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzcgt.zzi(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzcgt.zzd("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zza;
            zzbww zzbwwVar = new zzbww(zzbvmVar);
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
            SERVER_PARAMETERS zzb = zzb(str);
            int i = 0;
            AdSize[] adSizeArr = {AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
            while (true) {
                if (i >= 6) {
                    adSize = new AdSize(com.google.android.gms.ads.zza.zza(zzbdlVar.zze, zzbdlVar.zzb, zzbdlVar.zza));
                    break;
                } else if (adSizeArr[i].getWidth() == zzbdlVar.zze && adSizeArr[i].getHeight() == zzbdlVar.zzb) {
                    adSize = adSizeArr[i];
                    break;
                } else {
                    i++;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzbwwVar, activity, zzb, adSize, zzbwx.zzb(zzbdgVar, zzc(zzbdgVar)), this.zzb);
        } catch (Throwable th) {
            zzcgt.zzg("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzk(IObjectWrapper iObjectWrapper, zzbdg zzbdgVar, String str, String str2, zzbvm zzbvmVar) throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zza;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzcgt.zzi(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzcgt.zzd("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zza).requestInterstitialAd(new zzbww(zzbvmVar), (Activity) ObjectWrapper.unwrap(iObjectWrapper), zzb(str), zzbwx.zzb(zzbdgVar, zzc(zzbdgVar)), this.zzb);
        } catch (Throwable th) {
            zzcgt.zzg("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzn(IObjectWrapper iObjectWrapper, zzbdg zzbdgVar, String str, zzcck zzcckVar, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzo(zzbdg zzbdgVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final boolean zzq() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzr(IObjectWrapper iObjectWrapper, zzbdg zzbdgVar, String str, String str2, zzbvm zzbvmVar, zzblv zzblvVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final Bundle zzs() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final Bundle zzt() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final Bundle zzu() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzv(zzbdg zzbdgVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final boolean zzx() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzy(IObjectWrapper iObjectWrapper, zzcck zzcckVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final zzbnb zzz() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzi() throws RemoteException {
        try {
            this.zza.destroy();
        } catch (Throwable th) {
            zzcgt.zzg("", th);
            throw new RemoteException();
        }
    }
}
