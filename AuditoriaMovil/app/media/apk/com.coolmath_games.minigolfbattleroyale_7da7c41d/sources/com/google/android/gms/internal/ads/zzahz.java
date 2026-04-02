package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzahz {
    public static final zzahz zza = new zzahz(0, 0);
    public static final zzahz zzb = new zzahz(LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE);
    public static final zzahz zzc = new zzahz(LongCompanionObject.MAX_VALUE, 0);
    public static final zzahz zzd = new zzahz(0, LongCompanionObject.MAX_VALUE);
    public static final zzahz zze = zza;
    public final long zzf;
    public final long zzg;

    public zzahz(long j, long j2) {
        zzakt.zza(j >= 0);
        zzakt.zza(j2 >= 0);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahz zzahzVar = (zzahz) obj;
            if (this.zzf == zzahzVar.zzf && this.zzg == zzahzVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
