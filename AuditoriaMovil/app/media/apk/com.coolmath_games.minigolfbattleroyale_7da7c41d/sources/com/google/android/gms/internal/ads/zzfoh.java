package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfoh<E> extends zzfml<E> {
    private final zzfoj<E> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfoh(zzfoj<E> zzfojVar, int i) {
        super(zzfojVar.size(), i);
        this.zza = zzfojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    protected final E zza(int i) {
        return this.zza.get(i);
    }
}
