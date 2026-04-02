package com.google.android.gms.internal.games;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgc<E> extends zzft<E> {
    static final zzft<Object> zznd = new zzgc(new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzne;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgc(Object[] objArr, int i) {
        this.zzne = objArr;
        this.size = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.games.zzfs
    public final int zzcp() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.games.zzfs
    public final Object[] zzco() {
        return this.zzne;
    }

    @Override // com.google.android.gms.internal.games.zzfs
    final int zzcq() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.games.zzft, com.google.android.gms.internal.games.zzfs
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzne, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzfo.zza(i, this.size);
        return (E) this.zzne[i];
    }
}
