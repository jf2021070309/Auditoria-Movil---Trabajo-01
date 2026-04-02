package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.b8.i;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzaas implements zzzh {
    final /* synthetic */ Class zza;
    final /* synthetic */ zzzg zzb;

    public zzaas(Class cls, zzzg zzzgVar) {
        this.zza = cls;
        this.zzb = zzzgVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
        i.d(this.zza, sb, ",adapter=");
        sb.append(this.zzb);
        sb.append("]");
        return sb.toString();
    }
}
