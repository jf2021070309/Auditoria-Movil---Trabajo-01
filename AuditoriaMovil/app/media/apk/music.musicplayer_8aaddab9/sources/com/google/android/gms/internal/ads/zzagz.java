package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class zzagz {
    private final zzagy zzd;
    private final zzho zze;
    private final zzfa zzf;
    private final HashMap<zzagx, zzagw> zzg;
    private final Set<zzagx> zzh;
    private boolean zzi;
    private zzay zzj;
    private zzix zzk = new zzix(0);
    private final IdentityHashMap<zzhe, zzagx> zzb = new IdentityHashMap<>();
    private final Map<Object, zzagx> zzc = new HashMap();
    private final List<zzagx> zza = new ArrayList();

    public zzagz(zzagy zzagyVar, zzcy zzcyVar, Handler handler) {
        this.zzd = zzagyVar;
        zzho zzhoVar = new zzho();
        this.zze = zzhoVar;
        zzfa zzfaVar = new zzfa();
        this.zzf = zzfaVar;
        this.zzg = new HashMap<>();
        this.zzh = new HashSet();
        zzhoVar.zzb(handler, zzcyVar);
        zzfaVar.zzb(handler, zzcyVar);
    }

    private final void zzp() {
        Iterator<zzagx> it = this.zzh.iterator();
        while (it.hasNext()) {
            zzagx next = it.next();
            if (next.zzc.isEmpty()) {
                zzq(next);
                it.remove();
            }
        }
    }

    private final void zzq(zzagx zzagxVar) {
        zzagw zzagwVar = this.zzg.get(zzagxVar);
        if (zzagwVar != null) {
            zzagwVar.zza.zzq(zzagwVar.zzb);
        }
    }

    private final void zzr(int i2, int i3) {
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            }
            zzagx remove = this.zza.remove(i3);
            this.zzc.remove(remove.zzb);
            zzs(i3, -remove.zza.zzy().zza());
            remove.zze = true;
            if (this.zzi) {
                zzu(remove);
            }
        }
    }

    private final void zzs(int i2, int i3) {
        while (i2 < this.zza.size()) {
            this.zza.get(i2).zzd += i3;
            i2++;
        }
    }

    private final void zzt(zzagx zzagxVar) {
        zzhb zzhbVar = zzagxVar.zza;
        zzhg zzhgVar = new zzhg(this) { // from class: com.google.android.gms.internal.ads.zzagu
            private final zzagz zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzhg
            public final void zza(zzhh zzhhVar, zzaiq zzaiqVar) {
                this.zza.zzi(zzhhVar, zzaiqVar);
            }
        };
        zzagv zzagvVar = new zzagv(this, zzagxVar);
        this.zzg.put(zzagxVar, new zzagw(zzhbVar, zzhgVar, zzagvVar));
        zzhbVar.zzk(new Handler(zzamq.zzk(), null), zzagvVar);
        zzhbVar.zzm(new Handler(zzamq.zzk(), null), zzagvVar);
        zzhbVar.zzo(zzhgVar, this.zzj);
    }

    private final void zzu(zzagx zzagxVar) {
        if (zzagxVar.zze && zzagxVar.zzc.isEmpty()) {
            zzagw remove = this.zzg.remove(zzagxVar);
            Objects.requireNonNull(remove);
            remove.zza.zzr(remove.zzb);
            remove.zza.zzl(remove.zzc);
            remove.zza.zzn(remove.zzc);
            this.zzh.remove(zzagxVar);
        }
    }

    public final boolean zzc() {
        return this.zzi;
    }

    public final int zzd() {
        return this.zza.size();
    }

    public final void zze(zzay zzayVar) {
        zzakt.zzd(!this.zzi);
        this.zzj = zzayVar;
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            zzagx zzagxVar = this.zza.get(i2);
            zzt(zzagxVar);
            this.zzh.add(zzagxVar);
        }
        this.zzi = true;
    }

    public final void zzf(zzhe zzheVar) {
        zzagx remove = this.zzb.remove(zzheVar);
        Objects.requireNonNull(remove);
        remove.zza.zzA(zzheVar);
        remove.zzc.remove(((zzgy) zzheVar).zza);
        if (!this.zzb.isEmpty()) {
            zzp();
        }
        zzu(remove);
    }

    public final void zzg() {
        for (zzagw zzagwVar : this.zzg.values()) {
            try {
                zzagwVar.zza.zzr(zzagwVar.zzb);
            } catch (RuntimeException e2) {
                zzaln.zzb("MediaSourceList", "Failed to release child source.", e2);
            }
            zzagwVar.zza.zzl(zzagwVar.zzc);
            zzagwVar.zza.zzn(zzagwVar.zzc);
        }
        this.zzg.clear();
        this.zzh.clear();
        this.zzi = false;
    }

    public final zzaiq zzh() {
        if (this.zza.isEmpty()) {
            return zzaiq.zzc;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zza.size(); i3++) {
            zzagx zzagxVar = this.zza.get(i3);
            zzagxVar.zzd = i2;
            i2 += zzagxVar.zza.zzy().zza();
        }
        return new zzaht(this.zza, this.zzk, null);
    }

    public final /* synthetic */ void zzi(zzhh zzhhVar, zzaiq zzaiqVar) {
        this.zzd.zzl();
    }

    public final zzaiq zzj(List<zzagx> list, zzix zzixVar) {
        zzr(0, this.zza.size());
        return zzk(this.zza.size(), list, zzixVar);
    }

    public final zzaiq zzk(int i2, List<zzagx> list, zzix zzixVar) {
        if (!list.isEmpty()) {
            this.zzk = zzixVar;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                zzagx zzagxVar = list.get(i3 - i2);
                if (i3 > 0) {
                    zzagx zzagxVar2 = this.zza.get(i3 - 1);
                    zzaiq zzy = zzagxVar2.zza.zzy();
                    zzagxVar.zza(zzy.zza() + zzagxVar2.zzd);
                } else {
                    zzagxVar.zza(0);
                }
                zzs(i3, zzagxVar.zza.zzy().zza());
                this.zza.add(i3, zzagxVar);
                this.zzc.put(zzagxVar.zzb, zzagxVar);
                if (this.zzi) {
                    zzt(zzagxVar);
                    if (this.zzb.isEmpty()) {
                        this.zzh.add(zzagxVar);
                    } else {
                        zzq(zzagxVar);
                    }
                }
            }
        }
        return zzh();
    }

    public final zzaiq zzl(int i2, int i3, zzix zzixVar) {
        boolean z = false;
        if (i2 >= 0 && i2 <= i3 && i3 <= zzd()) {
            z = true;
        }
        zzakt.zza(z);
        this.zzk = zzixVar;
        zzr(i2, i3);
        return zzh();
    }

    public final zzaiq zzm(int i2, int i3, int i4, zzix zzixVar) {
        zzakt.zza(zzd() >= 0);
        this.zzk = null;
        return zzh();
    }

    public final zzaiq zzn(zzix zzixVar) {
        int zzd = zzd();
        if (zzixVar.zza() != zzd) {
            zzixVar = zzixVar.zzh().zzf(0, zzd);
        }
        this.zzk = zzixVar;
        return zzh();
    }

    public final zzhe zzo(zzhf zzhfVar, zzko zzkoVar, long j2) {
        Object obj = zzhfVar.zza;
        Object obj2 = ((Pair) obj).first;
        zzhf zzc = zzhfVar.zzc(((Pair) obj).second);
        zzagx zzagxVar = this.zzc.get(obj2);
        Objects.requireNonNull(zzagxVar);
        this.zzh.add(zzagxVar);
        zzagw zzagwVar = this.zzg.get(zzagxVar);
        if (zzagwVar != null) {
            zzagwVar.zza.zzp(zzagwVar.zzb);
        }
        zzagxVar.zzc.add(zzc);
        zzgy zzC = zzagxVar.zza.zzC(zzc, zzkoVar, j2);
        this.zzb.put(zzC, zzagxVar);
        zzp();
        return zzC;
    }
}
