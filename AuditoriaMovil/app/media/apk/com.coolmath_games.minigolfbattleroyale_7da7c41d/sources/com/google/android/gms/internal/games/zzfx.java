package com.google.android.gms.internal.games;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfx<E> extends zzfr<E> {
    @NullableDecl
    private Object[] zzmv;

    public zzfx() {
        super(4);
    }

    public final zzfy<E> zzct() {
        int i = this.size;
        if (i != 0) {
            if (i == 1) {
                return zzfy.zze(this.zzmp[0]);
            }
            zzfy<E> zzb = zzfy.zzb(this.size, this.zzmp);
            this.size = zzb.size();
            this.zzmq = true;
            this.zzmv = null;
            return zzb;
        }
        return zzgb.zzmz;
    }

    @Override // com.google.android.gms.internal.games.zzfr, com.google.android.gms.internal.games.zzfu
    public final /* synthetic */ zzfu zza(Iterable iterable) {
        zzfo.checkNotNull(iterable);
        super.zza(iterable);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.games.zzfr
    public final /* synthetic */ zzfr zzb(Object obj) {
        return (zzfx) zzc(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.games.zzfr, com.google.android.gms.internal.games.zzfu
    public final /* synthetic */ zzfu zzc(Object obj) {
        zzfo.checkNotNull(obj);
        this.zzmv = null;
        super.zzc(obj);
        return this;
    }
}
