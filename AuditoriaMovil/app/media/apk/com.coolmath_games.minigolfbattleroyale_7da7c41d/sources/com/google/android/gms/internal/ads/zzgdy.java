package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads-base@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgdy extends WeakReference<Throwable> {
    private final int zza;

    public zzgdy(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.zza = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            zzgdy zzgdyVar = (zzgdy) obj;
            if (this.zza == zzgdyVar.zza && get() == zzgdyVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }
}
