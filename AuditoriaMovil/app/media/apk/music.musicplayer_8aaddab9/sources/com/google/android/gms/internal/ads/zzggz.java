package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzggz implements zzghg {
    private final zzghg[] zza;

    public zzggz(zzghg... zzghgVarArr) {
        this.zza = zzghgVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzghg
    public final boolean zzb(Class<?> cls) {
        zzghg[] zzghgVarArr = this.zza;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzghgVarArr[i2].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzghg
    public final zzghf zzc(Class<?> cls) {
        zzghg[] zzghgVarArr = this.zza;
        for (int i2 = 0; i2 < 2; i2++) {
            zzghg zzghgVar = zzghgVarArr[i2];
            if (zzghgVar.zzb(cls)) {
                return zzghgVar.zzc(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
