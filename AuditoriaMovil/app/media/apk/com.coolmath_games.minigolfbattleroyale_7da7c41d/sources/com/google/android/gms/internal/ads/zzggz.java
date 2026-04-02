package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzggz implements zzghg {
    private final zzghg[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzggz(zzghg... zzghgVarArr) {
        this.zza = zzghgVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzghg
    public final boolean zzb(Class<?> cls) {
        zzghg[] zzghgVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzghgVarArr[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzghg
    public final zzghf zzc(Class<?> cls) {
        zzghg[] zzghgVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzghg zzghgVar = zzghgVarArr[i];
            if (zzghgVar.zzb(cls)) {
                return zzghgVar.zzc(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
