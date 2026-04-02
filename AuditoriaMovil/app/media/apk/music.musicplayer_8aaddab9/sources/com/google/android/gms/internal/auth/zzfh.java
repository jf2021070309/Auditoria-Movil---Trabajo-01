package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
public final class zzfh implements zzfo {
    private final zzfo[] zza;

    public zzfh(zzfo... zzfoVarArr) {
        this.zza = zzfoVarArr;
    }

    @Override // com.google.android.gms.internal.auth.zzfo
    public final zzfn zzb(Class<?> cls) {
        zzfo[] zzfoVarArr = this.zza;
        for (int i2 = 0; i2 < 2; i2++) {
            zzfo zzfoVar = zzfoVarArr[i2];
            if (zzfoVar.zzc(cls)) {
                return zzfoVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.auth.zzfo
    public final boolean zzc(Class<?> cls) {
        zzfo[] zzfoVarArr = this.zza;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzfoVarArr[i2].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
