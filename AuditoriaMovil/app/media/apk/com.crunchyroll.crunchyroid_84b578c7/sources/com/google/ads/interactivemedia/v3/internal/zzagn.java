package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.Arrays;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzagn {
    private final ArrayDeque zza = new ArrayDeque();

    private zzagn() {
    }

    public static /* bridge */ /* synthetic */ zzadr zza(zzagn zzagnVar, zzadr zzadrVar, zzadr zzadrVar2) {
        zzagnVar.zzb(zzadrVar);
        zzagnVar.zzb(zzadrVar2);
        zzadr zzadrVar3 = (zzadr) zzagnVar.zza.pop();
        while (!zzagnVar.zza.isEmpty()) {
            zzadrVar3 = new zzagr((zzadr) zzagnVar.zza.pop(), zzadrVar3);
        }
        return zzadrVar3;
    }

    private final void zzb(zzadr zzadrVar) {
        zzadr zzadrVar2;
        zzadr zzadrVar3;
        if (zzadrVar.zzh()) {
            int zzc = zzc(zzadrVar.zzd());
            int zzc2 = zzagr.zzc(zzc + 1);
            if (!this.zza.isEmpty() && ((zzadr) this.zza.peek()).zzd() < zzc2) {
                int zzc3 = zzagr.zzc(zzc);
                zzadr zzadrVar4 = (zzadr) this.zza.pop();
                while (!this.zza.isEmpty() && ((zzadr) this.zza.peek()).zzd() < zzc3) {
                    zzadrVar4 = new zzagr((zzadr) this.zza.pop(), zzadrVar4);
                }
                zzagr zzagrVar = new zzagr(zzadrVar4, zzadrVar);
                while (!this.zza.isEmpty()) {
                    if (((zzadr) this.zza.peek()).zzd() >= zzagr.zzc(zzc(zzagrVar.zzd()) + 1)) {
                        break;
                    }
                    zzagrVar = new zzagr((zzadr) this.zza.pop(), zzagrVar);
                }
                this.zza.push(zzagrVar);
                return;
            }
            this.zza.push(zzadrVar);
        } else if (zzadrVar instanceof zzagr) {
            zzagr zzagrVar2 = (zzagr) zzadrVar;
            zzadrVar2 = zzagrVar2.zzd;
            zzb(zzadrVar2);
            zzadrVar3 = zzagrVar2.zze;
            zzb(zzadrVar3);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzadrVar.getClass())));
        }
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzagr.zza, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    public /* synthetic */ zzagn(zzagm zzagmVar) {
    }
}
