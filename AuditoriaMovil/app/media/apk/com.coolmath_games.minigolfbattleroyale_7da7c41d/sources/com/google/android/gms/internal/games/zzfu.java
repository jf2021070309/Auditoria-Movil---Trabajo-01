package com.google.android.gms.internal.games;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzfu<E> {
    public abstract zzfu<E> zzc(E e);

    public zzfu<E> zza(Iterable<? extends E> iterable) {
        for (E e : iterable) {
            zzc(e);
        }
        return this;
    }
}
