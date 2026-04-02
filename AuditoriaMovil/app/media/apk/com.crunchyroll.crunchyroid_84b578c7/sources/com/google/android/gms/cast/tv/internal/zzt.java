package com.google.android.gms.cast.tv.internal;

import android.os.IBinder;
import com.google.android.gms.internal.cast_tv.zzcl;
import com.google.android.gms.internal.cast_tv.zzej;
import java.util.HashSet;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
final class zzt {
    public final zzej zza;
    public final IBinder.DeathRecipient zzb;
    public zzcl zzc;
    public final Set zzd = new HashSet();

    public zzt(zzej zzejVar, zzcl zzclVar, IBinder.DeathRecipient deathRecipient) {
        this.zza = zzejVar;
        this.zzc = zzclVar;
        this.zzb = deathRecipient;
    }
}
