package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzagj {
    public final Uri zza;
    public final List zze;
    public final List zzg;
    public final String zzb = null;
    public final zzagf zzc = null;
    public final zzaga zzd = null;
    public final String zzf = null;
    public final Object zzh = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzagj(Uri uri, String str, zzagf zzagfVar, zzaga zzagaVar, List list, String str2, List list2, Object obj, zzagi zzagiVar) {
        this.zza = uri;
        this.zze = list;
        this.zzg = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzagj) {
            zzagj zzagjVar = (zzagj) obj;
            if (this.zza.equals(zzagjVar.zza)) {
                String str = zzagjVar.zzb;
                if (zzamq.zzc(null, null)) {
                    zzagf zzagfVar = zzagjVar.zzc;
                    if (zzamq.zzc(null, null)) {
                        zzaga zzagaVar = zzagjVar.zzd;
                        if (zzamq.zzc(null, null) && this.zze.equals(zzagjVar.zze)) {
                            String str2 = zzagjVar.zzf;
                            if (zzamq.zzc(null, null) && this.zzg.equals(zzagjVar.zzg)) {
                                Object obj2 = zzagjVar.zzh;
                                if (zzamq.zzc(null, null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31;
    }
}
