package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaci extends zzacz {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaci(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i, int i2) {
        super(zzabrVar, "A1tPgHG2ugzZJCs1M+dp+hmS1POsS+eh/W2v7YCpLDG/34A+E/oOE4ZeCFsAYJwW", "qStL+/rRmChGKiFwdmBpG5d//S+c8NqJKVwR4OiL/ms=", zzyjVar, i, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzm(zzi.longValue());
        }
    }
}
