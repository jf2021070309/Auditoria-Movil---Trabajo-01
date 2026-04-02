package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
final class zzuo implements zzuv {
    private final zzuv[] zza;

    public zzuo(zzuv... zzuvVarArr) {
        this.zza = zzuvVarArr;
    }

    @Override // com.google.android.gms.internal.cast.zzuv
    public final zzuu zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzuv zzuvVar = this.zza[i];
            if (zzuvVar.zzc(cls)) {
                return zzuvVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast.zzuv
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
