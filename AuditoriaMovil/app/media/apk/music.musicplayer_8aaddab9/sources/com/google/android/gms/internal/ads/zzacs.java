package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class zzacs extends zzacz {
    public zzacs(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i2, int i3) {
        super(zzabrVar, "DVrAFpWxz2kcLonXDVqzAxxY5qZgb6+MyY8HJZUy9HF2czdhCSx5Lbv7dDVJMgy/", "AdToINYaWmfqYE6WezllyxILgCbRf0l/sf/vZralbBA=", zzyjVar, i2, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zze) {
            zzabm zzabmVar = new zzabm((String) this.zzf.invoke(null, new Object[0]));
            this.zze.zzF(zzabmVar.zza.longValue());
            this.zze.zzG(zzabmVar.zzb.longValue());
        }
    }
}
