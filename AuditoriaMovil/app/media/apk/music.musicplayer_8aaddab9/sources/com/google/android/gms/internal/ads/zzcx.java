package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzcx {
    private final zzain zza;
    private zzfoj<zzhf> zzb = zzfoj.zzi();
    private zzfon<zzhf, zzaiq> zzc = zzfon.zza();
    private zzhf zzd;
    private zzhf zze;
    private zzhf zzf;

    public zzcx(zzain zzainVar) {
        this.zza = zzainVar;
    }

    private final void zzj(zzaiq zzaiqVar) {
        zzfom<zzhf, zzaiq> zzfomVar = new zzfom<>();
        if (this.zzb.isEmpty()) {
            zzk(zzfomVar, this.zze, zzaiqVar);
            if (!zzflt.zza(this.zzf, this.zze)) {
                zzk(zzfomVar, this.zzf, zzaiqVar);
            }
            if (!zzflt.zza(this.zzd, this.zze) && !zzflt.zza(this.zzd, this.zzf)) {
                zzk(zzfomVar, this.zzd, zzaiqVar);
            }
        } else {
            for (int i2 = 0; i2 < this.zzb.size(); i2++) {
                zzk(zzfomVar, this.zzb.get(i2), zzaiqVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfomVar, this.zzd, zzaiqVar);
            }
        }
        this.zzc = zzfomVar.zzc();
    }

    private final void zzk(zzfom<zzhf, zzaiq> zzfomVar, zzhf zzhfVar, zzaiq zzaiqVar) {
        if (zzhfVar == null) {
            return;
        }
        if (zzaiqVar.zzi(zzhfVar.zza) != -1) {
            zzfomVar.zza(zzhfVar, zzaiqVar);
            return;
        }
        zzaiq zzaiqVar2 = this.zzc.get(zzhfVar);
        if (zzaiqVar2 != null) {
            zzfomVar.zza(zzhfVar, zzaiqVar2);
        }
    }

    private static zzhf zzl(zzahp zzahpVar, zzfoj<zzhf> zzfojVar, zzhf zzhfVar, zzain zzainVar) {
        zzaiq zzF = zzahpVar.zzF();
        int zzu = zzahpVar.zzu();
        Object zzj = zzF.zzt() ? null : zzF.zzj(zzu);
        int zzf = (zzahpVar.zzA() || zzF.zzt()) ? -1 : zzF.zzh(zzu, zzainVar, false).zzf(zzadx.zzb(zzahpVar.zzx()));
        for (int i2 = 0; i2 < zzfojVar.size(); i2++) {
            zzhf zzhfVar2 = zzfojVar.get(i2);
            if (zzm(zzhfVar2, zzj, zzahpVar.zzA(), zzahpVar.zzB(), zzahpVar.zzC(), zzf)) {
                return zzhfVar2;
            }
        }
        if (zzfojVar.isEmpty() && zzhfVar != null) {
            if (zzm(zzhfVar, zzj, zzahpVar.zzA(), zzahpVar.zzB(), zzahpVar.zzC(), zzf)) {
                return zzhfVar;
            }
        }
        return null;
    }

    private static boolean zzm(zzhf zzhfVar, Object obj, boolean z, int i2, int i3, int i4) {
        if (zzhfVar.zza.equals(obj)) {
            if (z) {
                if (zzhfVar.zzb != i2 || zzhfVar.zzc != i3) {
                    return false;
                }
            } else if (zzhfVar.zzb != -1 || zzhfVar.zze != i4) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final zzhf zzb() {
        return this.zzd;
    }

    public final zzhf zzc() {
        return this.zze;
    }

    public final zzhf zzd() {
        return this.zzf;
    }

    public final zzhf zze() {
        zzhf next;
        zzhf zzhfVar;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfoj<zzhf> zzfojVar = this.zzb;
        if (!(zzfojVar instanceof List)) {
            Iterator<zzhf> it = zzfojVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            zzhfVar = next;
        } else if (zzfojVar.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            zzhfVar = zzfojVar.get(zzfojVar.size() - 1);
        }
        return zzhfVar;
    }

    public final zzaiq zzf(zzhf zzhfVar) {
        return this.zzc.get(zzhfVar);
    }

    public final void zzg(zzahp zzahpVar) {
        this.zzd = zzl(zzahpVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(zzahp zzahpVar) {
        this.zzd = zzl(zzahpVar, this.zzb, this.zze, this.zza);
        zzj(zzahpVar.zzF());
    }

    public final void zzi(List<zzhf> list, zzhf zzhfVar, zzahp zzahpVar) {
        this.zzb = zzfoj.zzp(list);
        if (!list.isEmpty()) {
            this.zze = list.get(0);
            Objects.requireNonNull(zzhfVar);
            this.zzf = zzhfVar;
        }
        if (this.zzd == null) {
            this.zzd = zzl(zzahpVar, this.zzb, this.zze, this.zza);
        }
        zzj(zzahpVar.zzF());
    }
}
