package com.google.android.gms.internal.pal;

import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzri {
    private final zzrb zza;
    private final List zzb;
    private final Integer zzc;

    public /* synthetic */ zzri(zzrb zzrbVar, List list, Integer num, zzrh zzrhVar) {
        this.zza = zzrbVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzri)) {
            return false;
        }
        zzri zzriVar = (zzri) obj;
        if (this.zza.equals(zzriVar.zza) && this.zzb.equals(zzriVar.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzriVar.zzc;
            if (num != num2) {
                if (num != null && num.equals(num2)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
