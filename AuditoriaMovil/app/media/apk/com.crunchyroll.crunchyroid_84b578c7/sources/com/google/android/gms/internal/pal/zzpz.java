package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.k.q;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzpz {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzpz(Class cls, Class cls2, zzpy zzpyVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpz)) {
            return false;
        }
        zzpz zzpzVar = (zzpz) obj;
        if (!zzpzVar.zza.equals(this.zza) || !zzpzVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return q.b(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
