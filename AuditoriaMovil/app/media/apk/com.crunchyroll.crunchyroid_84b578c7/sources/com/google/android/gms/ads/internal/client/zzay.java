package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zzbrn;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzu;
import java.util.Random;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzay {
    private static final zzay zza = new zzay();
    private final zzbzh zzb;
    private final zzaw zzc;
    private final String zzd;
    private final zzbzu zze;
    private final Random zzf;

    public zzay() {
        zzbzh zzbzhVar = new zzbzh();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzeq(), new zzbgk(), new zzbvw(), new zzbrn(), new zzbgl());
        String zzd = zzbzh.zzd();
        zzbzu zzbzuVar = new zzbzu(0, 231004000, true, false, false);
        Random random = new Random();
        this.zzb = zzbzhVar;
        this.zzc = zzawVar;
        this.zzd = zzd;
        this.zze = zzbzuVar;
        this.zzf = random;
    }

    public static zzaw zza() {
        return zza.zzc;
    }

    public static zzbzh zzb() {
        return zza.zzb;
    }

    public static zzbzu zzc() {
        return zza.zze;
    }

    public static String zzd() {
        return zza.zzd;
    }

    public static Random zze() {
        return zza.zzf;
    }
}
