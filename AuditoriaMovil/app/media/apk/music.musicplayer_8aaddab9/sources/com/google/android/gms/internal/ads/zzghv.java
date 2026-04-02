package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzghv {
    private final ArrayDeque<zzgex> zza = new ArrayDeque<>();

    private zzghv() {
    }

    public /* synthetic */ zzghv(zzghw zzghwVar) {
    }

    public static /* synthetic */ zzgex zza(zzghv zzghvVar, zzgex zzgexVar, zzgex zzgexVar2) {
        zzghvVar.zzb(zzgexVar);
        zzghvVar.zzb(zzgexVar2);
        zzgex pop = zzghvVar.zza.pop();
        while (!zzghvVar.zza.isEmpty()) {
            pop = new zzghy(zzghvVar.zza.pop(), pop);
        }
        return pop;
    }

    private final void zzb(zzgex zzgexVar) {
        zzgex zzgexVar2;
        zzgex zzgexVar3;
        if (!zzgexVar.zzg()) {
            if (!(zzgexVar instanceof zzghy)) {
                String valueOf = String.valueOf(zzgexVar.getClass());
                valueOf.length();
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(valueOf));
            }
            zzghy zzghyVar = (zzghy) zzgexVar;
            zzgexVar2 = zzghyVar.zzd;
            zzb(zzgexVar2);
            zzgexVar3 = zzghyVar.zze;
            zzb(zzgexVar3);
            return;
        }
        int zzc = zzc(zzgexVar.zzc());
        int zzG = zzghy.zzG(zzc + 1);
        if (this.zza.isEmpty() || this.zza.peek().zzc() >= zzG) {
            this.zza.push(zzgexVar);
            return;
        }
        int zzG2 = zzghy.zzG(zzc);
        zzgex pop = this.zza.pop();
        while (!this.zza.isEmpty() && this.zza.peek().zzc() < zzG2) {
            pop = new zzghy(this.zza.pop(), pop);
        }
        zzghy zzghyVar2 = new zzghy(pop, zzgexVar);
        while (!this.zza.isEmpty()) {
            if (this.zza.peek().zzc() >= zzghy.zzG(zzc(zzghyVar2.zzc()) + 1)) {
                break;
            }
            zzghyVar2 = new zzghy(this.zza.pop(), zzghyVar2);
        }
        this.zza.push(zzghyVar2);
    }

    private static final int zzc(int i2) {
        int binarySearch = Arrays.binarySearch(zzghy.zza, i2);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
