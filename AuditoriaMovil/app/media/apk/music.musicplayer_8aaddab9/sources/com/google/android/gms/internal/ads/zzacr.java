package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class zzacr extends zzacz {
    private final StackTraceElement[] zzi;

    public zzacr(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i2, int i3, StackTraceElement[] stackTraceElementArr) {
        super(zzabrVar, "FW/4CvJE7gSaOIcNy9aPqAkZHcIOptuimuYgHtkFyrZcR+XexyybvWr2/z62L/0t", "gw9HX1g5D/FveKxEJmgn0Xdlo8h06mYt4u8/nHkUo04=", zzyjVar, i2, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzabj zzabjVar = new zzabj((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzC(zzabjVar.zza.longValue());
                if (zzabjVar.zzb.booleanValue()) {
                    this.zze.zzX(true != zzabjVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    this.zze.zzX(3);
                }
            }
        }
    }
}
