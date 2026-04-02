package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzew extends zzfg {
    private List zzi;

    public zzew(zzdu zzduVar, String str, String str2, zzr zzrVar, int i, int i2) {
        super(zzduVar, "tPxcLkiesd8JzrYIyuRbLGxWAQfsX+C1jrJaS2rsRu6lU/ve1b9hEzSSzo6VwqXx", "0RWQk7vrKrAXtxwBYq7T9nI/JnUnK0yiZtx30+mk7/g=", zzrVar, i, 31);
        this.zzi = null;
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzX(-1L);
        this.zze.zzT(-1L);
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke(null, this.zzb.zzb());
        }
        List list = this.zzi;
        if (list != null && list.size() == 2) {
            synchronized (this.zze) {
                this.zze.zzX(((Long) this.zzi.get(0)).longValue());
                this.zze.zzT(((Long) this.zzi.get(1)).longValue());
            }
        }
    }
}
