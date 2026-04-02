package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
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

    public /* synthetic */ zzfar(zzfap zzfapVar, zzfaq zzfaqVar) {
        this.zze = zzfap.zzb(zzfapVar);
        this.zzf = zzfap.zzc(zzfapVar);
        this.zzq = zzfap.zzN(zzfapVar);
        int i2 = zzfap.zza(zzfapVar).zza;
        long j2 = zzfap.zza(zzfapVar).zzb;
        Bundle bundle = zzfap.zza(zzfapVar).zzc;
        int i3 = zzfap.zza(zzfapVar).zzd;
        List<String> list = zzfap.zza(zzfapVar).zze;
        boolean z = zzfap.zza(zzfapVar).zzf;
        int i4 = zzfap.zza(zzfapVar).zzg;
        boolean z2 = true;
        if (!zzfap.zza(zzfapVar).zzh && !zzfap.zze(zzfapVar)) {
            z2 = false;
        }
        this.zzd = new zzbdg(i2, j2, bundle, i3, list, z, i4, z2, zzfap.zza(zzfapVar).zzi, zzfap.zza(zzfapVar).zzj, zzfap.zza(zzfapVar).zzk, zzfap.zza(zzfapVar).zzl, zzfap.zza(zzfapVar).zzm, zzfap.zza(zzfapVar).zzn, zzfap.zza(zzfapVar).zzo, zzfap.zza(zzfapVar).zzp, zzfap.zza(zzfapVar).zzq, zzfap.zza(zzfapVar).zzr, zzfap.zza(zzfapVar).zzs, zzfap.zza(zzfapVar).zzt, zzfap.zza(zzfapVar).zzu, zzfap.zza(zzfapVar).zzv, com.google.android.gms.ads.internal.util.zzs.zze(zzfap.zza(zzfapVar).zzw), zzfap.zza(zzfapVar).zzx);
        this.zza = zzfap.zzd(zzfapVar) != null ? zzfap.zzd(zzfapVar) : zzfap.zzh(zzfapVar) != null ? zzfap.zzh(zzfapVar).zzf : null;
        this.zzg = zzfap.zzf(zzfapVar);
        this.zzh = zzfap.zzg(zzfapVar);
        this.zzi = zzfap.zzf(zzfapVar) == null ? null : zzfap.zzh(zzfapVar) == null ? new zzblv(new NativeAdOptions.Builder().build()) : zzfap.zzh(zzfapVar);
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
