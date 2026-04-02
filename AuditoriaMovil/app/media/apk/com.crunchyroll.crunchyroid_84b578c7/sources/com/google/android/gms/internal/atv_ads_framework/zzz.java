package com.google.android.gms.internal.atv_ads_framework;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public final class zzz extends zzv {
    private final zzab zza;

    public zzz(zzab zzabVar, int i) {
        super(zzabVar.size(), i);
        this.zza = zzabVar;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzv
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
