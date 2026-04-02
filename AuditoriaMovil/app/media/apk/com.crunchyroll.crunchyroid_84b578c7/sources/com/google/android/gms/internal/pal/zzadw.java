package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzadw implements zzaed {
    private final zzaed[] zza;

    public zzadw(zzaed... zzaedVarArr) {
        this.zza = zzaedVarArr;
    }

    @Override // com.google.android.gms.internal.pal.zzaed
    public final zzaec zzb(Class cls) {
        zzaed[] zzaedVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzaed zzaedVar = zzaedVarArr[i];
            if (zzaedVar.zzc(cls)) {
                return zzaedVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.pal.zzaed
    public final boolean zzc(Class cls) {
        zzaed[] zzaedVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzaedVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
