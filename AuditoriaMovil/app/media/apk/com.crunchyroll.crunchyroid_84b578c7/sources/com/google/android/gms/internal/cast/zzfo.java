package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
final class zzfo extends zzfg {
    private final zzfq zza;

    public zzfo(zzfq zzfqVar, int i) {
        super(zzfqVar.size(), i);
        this.zza = zzfqVar;
    }

    @Override // com.google.android.gms.internal.cast.zzfg
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
