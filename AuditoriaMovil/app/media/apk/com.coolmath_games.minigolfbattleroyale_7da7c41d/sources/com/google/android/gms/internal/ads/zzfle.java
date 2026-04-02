package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
abstract class zzfle<T> implements Iterator<T> {
    @CheckForNull
    private T zza;
    private int zzb = 2;

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.zzb = 2;
            T t = this.zza;
            this.zza = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @CheckForNull
    protected abstract T zza();

    /* JADX INFO: Access modifiers changed from: protected */
    @CheckForNull
    public final T zzb() {
        this.zzb = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        if (i != 4) {
            int i2 = i - 1;
            if (i != 0) {
                if (i2 != 0) {
                    if (i2 != 2) {
                        this.zzb = 4;
                        this.zza = zza();
                        if (this.zzb != 3) {
                            this.zzb = 1;
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            throw null;
        }
        throw new IllegalStateException();
    }
}
