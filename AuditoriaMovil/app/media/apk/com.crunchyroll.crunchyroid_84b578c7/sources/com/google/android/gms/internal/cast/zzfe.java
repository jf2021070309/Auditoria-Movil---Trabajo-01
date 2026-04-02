package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
final class zzfe implements zzfc {
    private static final zzfc zza = new zzfc() { // from class: com.google.android.gms.internal.cast.zzfd
        @Override // com.google.android.gms.internal.cast.zzfc
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzfc zzb;
    private Object zzc;

    public zzfe(zzfc zzfcVar) {
        this.zzb = zzfcVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = e.e("<supplier that returned ", String.valueOf(this.zzc), ">");
        }
        return e.e("Suppliers.memoize(", String.valueOf(obj), ")");
    }

    @Override // com.google.android.gms.internal.cast.zzfc
    public final Object zza() {
        zzfc zzfcVar = this.zzb;
        zzfc zzfcVar2 = zza;
        if (zzfcVar != zzfcVar2) {
            synchronized (this) {
                if (this.zzb != zzfcVar2) {
                    Object zza2 = this.zzb.zza();
                    this.zzc = zza2;
                    this.zzb = zzfcVar2;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
