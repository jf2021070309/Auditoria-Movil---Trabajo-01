package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.b8.i;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzaaq implements zzzh {
    final /* synthetic */ Class zza;
    final /* synthetic */ Class zzb;
    final /* synthetic */ zzzg zzc;

    public zzaaq(Class cls, Class cls2, zzzg zzzgVar) {
        this.zza = cls;
        this.zzb = cls2;
        this.zzc = zzzgVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Factory[type=");
        i.d(this.zzb, sb, "+");
        i.d(this.zza, sb, ",adapter=");
        sb.append(this.zzc);
        sb.append("]");
        return sb.toString();
    }
}
