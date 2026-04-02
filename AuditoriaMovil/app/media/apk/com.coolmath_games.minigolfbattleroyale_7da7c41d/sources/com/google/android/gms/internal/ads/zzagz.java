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
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzagz {
    private final zzagy zzd;
    private boolean zzi;
    private zzay zzj;
    private zzix zzk = new zzix(0);
    private final IdentityHashMap<zzhe, zzagx> zzb = new IdentityHashMap<>();
    private final Map<Object, zzagx> zzc = new HashMap();
    private final List<zzagx> zza = new ArrayList();
    private final zzho zze = new zzho();
    private final zzfa zzf = new zzfa();
    private final HashMap<zzagx, zzagw> zzg = new HashMap<>();
    private final Set<zzagx> zzh = new HashSet();

    public zzagz(zzagy zzagyVar, zzcy zzcyVar, Handler handler) {
        this.zzd = zzagyVar;
        this.zze.zzb(handler, zzcyVar);
        this.zzf.zzb(handler, zzcyVar);
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

    private final void zzr(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            zzagx remove = this.zza.remove(i2);
            this.zzc.remove(remove.zzb);
            zzs(i2, -remove.zza.zzy().zza());
            remove.zze = true;
            if (this.zzi) {
                zzu(remove);
            }
        }
    }

    private final void zzs(int i, int i2) {
        while (i < this.zza.size()) {
            this.zza.get(i).zzd += i2;
            i++;
        }
    }

    private final void zzt(zzagx zzagxVar) {
        zzhb zzhbVar = zzagxVar.zza;
        zzhg zzhgVar = new zzhg(this) { // from class: com.google.android.gms.internal.ads.zzagu
            private final zzagz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
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
            if (remove != null) {
                remove.zza.zzr(remove.zzb);
                remove.zza.zzl(remove.zzc);
                remove.zza.zzn(remove.zzc);
                this.zzh.remove(zzagxVar);
                return;
            }
            throw null;
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
        for (int i = 0; i < this.zza.size(); i++) {
            zzagx zzagxVar = this.zza.get(i);
            zzt(zzagxVar);
            this.zzh.add(zzagxVar);
        }
        this.zzi = true;
    }

    public final void zzf(zzhe zzheVar) {
        zzagx remove = this.zzb.remove(zzheVar);
        if (remove != null) {
            remove.zza.zzA(zzheVar);
            remove.zzc.remove(((zzgy) zzheVar).zza);
            if (!this.zzb.isEmpty()) {
                zzp();
            }
            zzu(remove);
            return;
        }
        throw null;
    }

    public final void zzg() {
        for (zzagw zzagwVar : this.zzg.values()) {
            try {
                zzagwVar.zza.zzr(zzagwVar.zzb);
            } catch (RuntimeException e) {
                zzaln.zzb("MediaSourceList", "Failed to release child source.", e);
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
        int i = 0;
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            zzagx zzagxVar = this.zza.get(i2);
            zzagxVar.zzd = i;
            i += zzagxVar.zza.zzy().zza();
        }
        return new zzaht(this.zza, this.zzk, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzhh zzhhVar, zzaiq zzaiqVar) {
        this.zzd.zzl();
    }

    public final zzaiq zzj(List<zzagx> list, zzix zzixVar) {
        zzr(0, this.zza.size());
        return zzk(this.zza.size(), list, zzixVar);
    }

    public final zzaiq zzk(int i, List<zzagx> list, zzix zzixVar) {
        if (!list.isEmpty()) {
            this.zzk = zzixVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzagx zzagxVar = list.get(i2 - i);
                if (i2 > 0) {
                    zzagx zzagxVar2 = this.zza.get(i2 - 1);
                    zzagxVar.zza(zzagxVar2.zzd + zzagxVar2.zza.zzy().zza());
                } else {
                    zzagxVar.zza(0);
                }
                zzs(i2, zzagxVar.zza.zzy().zza());
                this.zza.add(i2, zzagxVar);
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

    public final zzaiq zzl(int i, int i2, zzix zzixVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zzd()) {
            z = true;
        }
        zzakt.zza(z);
        this.zzk = zzixVar;
        zzr(i, i2);
        return zzh();
    }

    public final zzaiq zzm(int i, int i2, int i3, zzix zzixVar) {
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

    public final zzhe zzo(zzhf zzhfVar, zzko zzkoVar, long j) {
        Object obj = ((Pair) zzhfVar.zza).first;
        zzhf zzc = zzhfVar.zzc(((Pair) zzhfVar.zza).second);
        zzagx zzagxVar = this.zzc.get(obj);
        if (zzagxVar != null) {
            this.zzh.add(zzagxVar);
            zzagw zzagwVar = this.zzg.get(zzagxVar);
            if (zzagwVar != null) {
                zzagwVar.zza.zzp(zzagwVar.zzb);
            }
            zzagxVar.zzc.add(zzc);
            zzgy zzC = zzagxVar.zza.zzC(zzc, zzkoVar, j);
            this.zzb.put(zzC, zzagxVar);
            zzp();
            return zzC;
        }
        throw null;
    }
}
