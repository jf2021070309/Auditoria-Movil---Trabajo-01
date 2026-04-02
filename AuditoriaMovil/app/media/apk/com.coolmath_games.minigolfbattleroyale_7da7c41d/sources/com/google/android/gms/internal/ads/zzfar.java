package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfar {
    public final zzbis zza;
    public final zzbrx zzb;
    public final zzeli zzc;
    public final zzbdg zzd;
    public final zzbdl zze;
    public final String zzf;
    public final ArrayList<String> zzg;
    public final ArrayList<String> zzh;
    public final zzblv zzi;
    public final zzbdr zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final zzbfu zzn;
    public final zzfah zzo;
    public final boolean zzp;
    public final zzbfy zzq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfar(zzfap zzfapVar, zzfaq zzfaqVar) {
        zzbis zzbisVar;
        zzblv zzblvVar;
        this.zze = zzfap.zzb(zzfapVar);
        this.zzf = zzfap.zzc(zzfapVar);
        this.zzq = zzfap.zzN(zzfapVar);
        int i = zzfap.zza(zzfapVar).zza;
        long j = zzfap.zza(zzfapVar).zzb;
        Bundle bundle = zzfap.zza(zzfapVar).zzc;
        int i2 = zzfap.zza(zzfapVar).zzd;
        List<String> list = zzfap.zza(zzfapVar).zze;
        boolean z = zzfap.zza(zzfapVar).zzf;
        int i3 = zzfap.zza(zzfapVar).zzg;
        boolean z2 = true;
        if (!zzfap.zza(zzfapVar).zzh && !zzfap.zze(zzfapVar)) {
            z2 = false;
        }
        this.zzd = new zzbdg(i, j, bundle, i2, list, z, i3, z2, zzfap.zza(zzfapVar).zzi, zzfap.zza(zzfapVar).zzj, zzfap.zza(zzfapVar).zzk, zzfap.zza(zzfapVar).zzl, zzfap.zza(zzfapVar).zzm, zzfap.zza(zzfapVar).zzn, zzfap.zza(zzfapVar).zzo, zzfap.zza(zzfapVar).zzp, zzfap.zza(zzfapVar).zzq, zzfap.zza(zzfapVar).zzr, zzfap.zza(zzfapVar).zzs, zzfap.zza(zzfapVar).zzt, zzfap.zza(zzfapVar).zzu, zzfap.zza(zzfapVar).zzv, com.google.android.gms.ads.internal.util.zzs.zze(zzfap.zza(zzfapVar).zzw), zzfap.zza(zzfapVar).zzx);
        if (zzfap.zzd(zzfapVar) != null) {
            zzbisVar = zzfap.zzd(zzfapVar);
        } else {
            zzbisVar = zzfap.zzh(zzfapVar) != null ? zzfap.zzh(zzfapVar).zzf : null;
        }
        this.zza = zzbisVar;
        this.zzg = zzfap.zzf(zzfapVar);
        this.zzh = zzfap.zzg(zzfapVar);
        if (zzfap.zzf(zzfapVar) == null) {
            zzblvVar = null;
        } else {
            zzblvVar = zzfap.zzh(zzfapVar) == null ? new zzblv(new NativeAdOptions.Builder().build()) : zzfap.zzh(zzfapVar);
        }
        this.zzi = zzblvVar;
        this.zzj = zzfap.zzi(zzfapVar);
        this.zzk = zzfap.zzm(zzfapVar);
        this.zzl = zzfap.zzj(zzfapVar);
        this.zzm = zzfap.zzk(zzfapVar);
        this.zzn = zzfap.zzl(zzfapVar);
        this.zzb = zzfap.zzn(zzfapVar);
        this.zzo = new zzfah(zzfap.zzo(zzfapVar), null);
        this.zzp = zzfap.zzp(zzfapVar);
        this.zzc = zzfap.zzq(zzfapVar);
    }

    public final zzbny zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzc() : this.zzl.zza();
    }
}
