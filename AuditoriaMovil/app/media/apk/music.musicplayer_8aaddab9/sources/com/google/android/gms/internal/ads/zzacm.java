package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class zzacm extends zzacz {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzacm(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i2, int i3) {
        super(zzabrVar, "FIES3RTkQwHbrKX6yNHRLvjdTy/vAwaHt4NSjNSY8AdC8m3WKKtOY2UmKZKAKB0T", "2LDOSJy2Fx9VBMC+bm+0OJly9nmnJoeXDwyJmbeZyYc=", zzyjVar, i2, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zza("E");
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zza(zzi);
        }
    }
}
