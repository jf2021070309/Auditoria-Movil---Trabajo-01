package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzghv {
    private final ArrayDeque<zzgex> zza = new ArrayDeque<>();

    private zzghv() {
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
        if (zzgexVar.zzg()) {
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
            zzghy zzghyVar = new zzghy(pop, zzgexVar);
            while (!this.zza.isEmpty()) {
                if (this.zza.peek().zzc() >= zzghy.zzG(zzc(zzghyVar.zzc()) + 1)) {
                    break;
                }
                zzghyVar = new zzghy(this.zza.pop(), zzghyVar);
            }
            this.zza.push(zzghyVar);
        } else if (zzgexVar instanceof zzghy) {
            zzghy zzghyVar2 = (zzghy) zzgexVar;
            zzgexVar2 = zzghyVar2.zzd;
            zzb(zzgexVar2);
            zzgexVar3 = zzghyVar2.zze;
            zzb(zzgexVar3);
        } else {
            String valueOf = String.valueOf(zzgexVar.getClass());
            String.valueOf(valueOf).length();
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(valueOf)));
        }
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzghy.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzghv(zzghw zzghwVar) {
    }
}
