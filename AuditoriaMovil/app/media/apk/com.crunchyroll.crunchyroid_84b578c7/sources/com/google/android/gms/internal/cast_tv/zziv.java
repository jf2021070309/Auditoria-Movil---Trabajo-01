package com.google.android.gms.internal.cast_tv;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zziv {
    private final zziu zza;

    private zziv(zzku zzkuVar, Object obj, zzku zzkuVar2, Object obj2) {
        this.zza = new zziu(zzkuVar, "", zzkuVar2, "");
    }

    public static int zzb(zziu zziuVar, Object obj, Object obj2) {
        return zzhm.zza(zziuVar.zza, 1, obj) + zzhm.zza(zziuVar.zzc, 2, obj2);
    }

    public static zziv zzd(zzku zzkuVar, Object obj, zzku zzkuVar2, Object obj2) {
        return new zziv(zzkuVar, "", zzkuVar2, "");
    }

    public static void zze(zzhc zzhcVar, zziu zziuVar, Object obj, Object obj2) throws IOException {
        zzhm.zze(zzhcVar, zziuVar.zza, 1, obj);
        zzhm.zze(zzhcVar, zziuVar.zzc, 2, obj2);
    }

    public final int zza(int i, Object obj, Object obj2) {
        int i2 = zzhc.zzb;
        int zzb = zzb(this.zza, obj, obj2);
        return zzhc.zzy(i << 3) + zzhc.zzy(zzb) + zzb;
    }

    public final zziu zzc() {
        return this.zza;
    }
}
