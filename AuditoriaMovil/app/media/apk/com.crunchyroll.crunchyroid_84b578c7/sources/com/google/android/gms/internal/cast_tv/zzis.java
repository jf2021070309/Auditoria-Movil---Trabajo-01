package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzis implements zzja {
    private final zzja[] zza;

    public zzis(zzja... zzjaVarArr) {
        this.zza = zzjaVarArr;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzja
    public final zziz zzb(Class cls) {
        zzja[] zzjaVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzja zzjaVar = zzjaVarArr[i];
            if (zzjaVar.zzc(cls)) {
                return zzjaVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast_tv.zzja
    public final boolean zzc(Class cls) {
        zzja[] zzjaVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzjaVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
