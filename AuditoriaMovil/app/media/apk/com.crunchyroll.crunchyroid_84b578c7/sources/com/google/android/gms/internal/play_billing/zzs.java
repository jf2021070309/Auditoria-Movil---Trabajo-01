package com.google.android.gms.internal.play_billing;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
final class zzs extends zzo {
    private final zzu zza;

    public zzs(zzu zzuVar, int i) {
        super(zzuVar.size(), i);
        this.zza = zzuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
