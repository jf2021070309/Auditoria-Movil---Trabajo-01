package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzavu {
    private zzbu zza;
    private final Context zzb;
    private final String zzc;
    private final zzdx zzd;
    @AppOpenAd.AppOpenAdOrientation
    private final int zze;
    private final AppOpenAd.AppOpenAdLoadCallback zzf;
    private final zzbnq zzg = new zzbnq();
    private final zzp zzh = zzp.zza;

    public zzavu(Context context, String str, zzdx zzdxVar, @AppOpenAd.AppOpenAdOrientation int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzdxVar;
        this.zze = i;
        this.zzf = appOpenAdLoadCallback;
    }

    public final void zza() {
        try {
            zzbu zzd = zzay.zza().zzd(this.zzb, zzq.zzb(), this.zzc, this.zzg);
            this.zza = zzd;
            if (zzd != null) {
                if (this.zze != 3) {
                    this.zza.zzI(new zzw(this.zze));
                }
                this.zza.zzH(new zzavh(this.zzf, this.zzc));
                this.zza.zzaa(this.zzh.zza(this.zzb, this.zzd));
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
