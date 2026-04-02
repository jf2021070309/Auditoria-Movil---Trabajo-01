package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzg {
    public final zzg zza;
    final zzax zzb;
    final Map<String, zzap> zzc = new HashMap();
    final Map<String, Boolean> zzd = new HashMap();

    public zzg(zzg zzgVar, zzax zzaxVar) {
        this.zza = zzgVar;
        this.zzb = zzaxVar;
    }

    public final zzap zza(zzap zzapVar) {
        return this.zzb.zzb(this, zzapVar);
    }

    public final zzap zzb(zzae zzaeVar) {
        zzap zzapVar = zzap.zzf;
        Iterator<Integer> zzg = zzaeVar.zzg();
        while (zzg.hasNext()) {
            zzapVar = this.zzb.zzb(this, zzaeVar.zzl(zzg.next().intValue()));
            if (zzapVar instanceof zzag) {
                break;
            }
        }
        return zzapVar;
    }

    public final zzg zzc() {
        return new zzg(this, this.zzb);
    }

    public final boolean zzd(String str) {
        if (this.zzc.containsKey(str)) {
            return true;
        }
        zzg zzgVar = this.zza;
        if (zzgVar != null) {
            return zzgVar.zzd(str);
        }
        return false;
    }

    public final void zze(String str, zzap zzapVar) {
        zzg zzgVar;
        if (this.zzc.containsKey(str) || (zzgVar = this.zza) == null || !zzgVar.zzd(str)) {
            if (this.zzd.containsKey(str)) {
                return;
            }
            if (zzapVar == null) {
                this.zzc.remove(str);
                return;
            } else {
                this.zzc.put(str, zzapVar);
                return;
            }
        }
        this.zza.zze(str, zzapVar);
    }

    public final void zzf(String str, zzap zzapVar) {
        if (this.zzd.containsKey(str)) {
            return;
        }
        if (zzapVar == null) {
            this.zzc.remove(str);
        } else {
            this.zzc.put(str, zzapVar);
        }
    }

    public final void zzg(String str, zzap zzapVar) {
        zzf(str, zzapVar);
        this.zzd.put(str, true);
    }

    public final zzap zzh(String str) {
        if (this.zzc.containsKey(str)) {
            return this.zzc.get(str);
        }
        zzg zzgVar = this.zza;
        if (zzgVar == null) {
            throw new IllegalArgumentException(String.format("%s is not defined", str));
        }
        return zzgVar.zzh(str);
    }
}
