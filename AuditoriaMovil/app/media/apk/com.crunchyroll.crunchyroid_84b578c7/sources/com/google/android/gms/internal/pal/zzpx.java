package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.k.q;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzpx {
    private final Class zza;
    private final zzyv zzb;

    public /* synthetic */ zzpx(Class cls, zzyv zzyvVar, zzpw zzpwVar) {
        this.zza = cls;
        this.zzb = zzyvVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpx)) {
            return false;
        }
        zzpx zzpxVar = (zzpx) obj;
        if (!zzpxVar.zza.equals(this.zza) || !zzpxVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return q.b(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
