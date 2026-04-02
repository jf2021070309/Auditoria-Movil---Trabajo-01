package com.google.android.gms.cast;

import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzu {
    private String zza = "com.google.android.gms.cast.CATEGORY_CAST";
    private String zzb;
    private Collection zzc;

    public /* synthetic */ zzu(zzt zztVar) {
    }

    public static /* synthetic */ zzu zza(zzu zzuVar, String str) {
        zzuVar.zzb = str;
        return zzuVar;
    }

    public static /* synthetic */ zzu zzb(zzu zzuVar, String str) {
        zzuVar.zza = "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK";
        return zzuVar;
    }

    public static /* synthetic */ zzu zzc(zzu zzuVar, Collection collection) {
        zzuVar.zzc = collection;
        return zzuVar;
    }

    public static /* bridge */ /* synthetic */ zzw zzd(zzu zzuVar) {
        return new zzw(zzuVar.zza, zzuVar.zzb, zzuVar.zzc, false, true, null);
    }

    private zzu() {
    }
}
