package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzcvo {
    private final zzcxe zza;
    private final View zzb;
    private final zzfaa zzc;
    private final zzcml zzd;

    public zzcvo(View view, zzcml zzcmlVar, zzcxe zzcxeVar, zzfaa zzfaaVar) {
        this.zzb = view;
        this.zzd = zzcmlVar;
        this.zza = zzcxeVar;
        this.zzc = zzfaaVar;
    }

    public static final zzdih<zzdcq> zzf(final Context context, final zzcgz zzcgzVar, final zzezz zzezzVar, final zzfar zzfarVar) {
        return new zzdih<>(new zzdcq(context, zzcgzVar, zzezzVar, zzfarVar) { // from class: com.google.android.gms.internal.ads.zzcvm
            private final Context zza;
            private final zzcgz zzb;
            private final zzezz zzc;
            private final zzfar zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = context;
                this.zzb = zzcgzVar;
                this.zzc = zzezzVar;
                this.zzd = zzfarVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcq
            public final void zzf() {
                com.google.android.gms.ads.internal.zzt.zzm().zzg(this.zza, this.zzb.zza, this.zzc.zzC.toString(), this.zzd.zzf);
            }
        }, zzchg.zzf);
    }

    public static final Set<zzdih<zzdcq>> zzg(zzcwy zzcwyVar) {
        return Collections.singleton(new zzdih(zzcwyVar, zzchg.zzf));
    }

    public static final zzdih<zzdcq> zzh(zzcww zzcwwVar) {
        return new zzdih<>(zzcwwVar, zzchg.zze);
    }

    public final zzcml zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzcxe zzc() {
        return this.zza;
    }

    public final zzfaa zzd() {
        return this.zzc;
    }

    public zzdco zze(Set<zzdih<zzdcq>> set) {
        return new zzdco(set);
    }
}
