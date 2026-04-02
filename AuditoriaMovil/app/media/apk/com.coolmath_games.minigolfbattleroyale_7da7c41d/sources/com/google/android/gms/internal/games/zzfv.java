package com.google.android.gms.internal.games;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfv<E> extends zzft<E> {
    private final transient int length;
    private final transient int offset;
    private final /* synthetic */ zzft zzmt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfv(zzft zzftVar, int i, int i2) {
        this.zzmt = zzftVar;
        this.offset = i;
        this.length = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.games.zzfs
    public final Object[] zzco() {
        return this.zzmt.zzco();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.games.zzfs
    public final int zzcp() {
        return this.zzmt.zzcp() + this.offset;
    }

    @Override // com.google.android.gms.internal.games.zzfs
    final int zzcq() {
        return this.zzmt.zzcp() + this.offset + this.length;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzfo.zza(i, this.length);
        return this.zzmt.get(i + this.offset);
    }

    @Override // com.google.android.gms.internal.games.zzft
    public final zzft<E> zzc(int i, int i2) {
        zzfo.zza(i, i2, this.length);
        zzft zzftVar = this.zzmt;
        int i3 = this.offset;
        return (zzft) zzftVar.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.games.zzft, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
