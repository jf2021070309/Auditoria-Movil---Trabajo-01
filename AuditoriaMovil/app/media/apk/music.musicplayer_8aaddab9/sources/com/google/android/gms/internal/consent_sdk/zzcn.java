package com.google.android.gms.internal.consent_sdk;
/* loaded from: classes.dex */
public final class zzcn<T> implements zzcp<T> {
    private zzct<T> zza;

    public static <T> void zza(zzct<T> zzctVar, zzct<T> zzctVar2) {
        zzcu.zza(zzctVar2);
        zzcn zzcnVar = (zzcn) zzctVar;
        if (zzcnVar.zza != null) {
            throw new IllegalStateException();
        }
        zzcnVar.zza = zzctVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzct
    public final T zza() {
        zzct<T> zzctVar = this.zza;
        if (zzctVar != null) {
            return zzctVar.zza();
        }
        throw new IllegalStateException();
    }
}
