package com.google.android.gms.internal.pal;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzadt {
    private static final zzadt zza = new zzadp(null);
    private static final zzadt zzb = new zzadr(null);

    public /* synthetic */ zzadt(zzads zzadsVar) {
    }

    public static zzadt zzd() {
        return zza;
    }

    public static zzadt zze() {
        return zzb;
    }

    public abstract List zza(Object obj, long j);

    public abstract void zzb(Object obj, long j);

    public abstract void zzc(Object obj, Object obj2, long j);
}
