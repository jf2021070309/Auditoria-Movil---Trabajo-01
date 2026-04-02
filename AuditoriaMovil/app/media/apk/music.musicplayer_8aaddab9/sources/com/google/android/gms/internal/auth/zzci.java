package com.google.android.gms.internal.auth;

import android.os.Binder;
/* loaded from: classes.dex */
public final /* synthetic */ class zzci {
    public static <V> V zza(zzcj<V> zzcjVar) {
        try {
            return zzcjVar.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzcjVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
