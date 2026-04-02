package com.google.android.gms.cast;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzdn implements com.google.android.gms.cast.internal.zzas {
    final /* synthetic */ zzdp zza;

    public zzdn(zzdp zzdpVar) {
        this.zza = zzdpVar;
    }

    @Override // com.google.android.gms.cast.internal.zzas
    public final void zza(String str, long j, int i, Object obj, long j2, long j3) {
        try {
            zzdp zzdpVar = this.zza;
            Status status = new Status(i);
            c cVar = null;
            if (true != (obj instanceof com.google.android.gms.cast.internal.zzap)) {
                obj = null;
            }
            if (obj != null) {
                cVar = ((com.google.android.gms.cast.internal.zzap) obj).zza;
            }
            zzdpVar.setResult((zzdp) new zzdq(status, cVar));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.cast.internal.zzas
    public final void zzb(String str, long j, long j2, long j3) {
        try {
            zzdp zzdpVar = this.zza;
            zzdpVar.setResult((zzdp) new zzdo(zzdpVar, new Status(2103)));
        } catch (IllegalStateException unused) {
        }
    }
}
