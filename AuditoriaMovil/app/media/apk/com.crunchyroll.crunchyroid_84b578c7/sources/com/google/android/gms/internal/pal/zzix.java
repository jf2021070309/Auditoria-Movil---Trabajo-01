package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzix extends zzit {
    private final zziz zza;

    public zzix(zziz zzizVar, int i) {
        super(zzizVar.size(), i);
        this.zza = zzizVar;
    }

    @Override // com.google.android.gms.internal.pal.zzit
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
