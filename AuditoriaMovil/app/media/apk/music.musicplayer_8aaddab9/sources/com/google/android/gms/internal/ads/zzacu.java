package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class zzacu extends zzacz {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzacu(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i2, int i3) {
        super(zzabrVar, "kgLg33QaU762V6pmSw9NTYQDT3UN+SfZqKWL+LtHgczBAmljOlYdBxhmK655CLWm", "WLzuG2U+Kkbg0oKQlrLQGRQCiSGGQTHe1FZJKw3vRH0=", zzyjVar, i2, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzs(zzi.longValue());
        }
    }
}
