package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class zzexc {
    public static <T> void zza(AtomicReference<T> atomicReference, zzexb<T> zzexbVar) {
        T t = atomicReference.get();
        if (t == null) {
            return;
        }
        try {
            zzexbVar.zza(t);
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        } catch (NullPointerException e3) {
            zzcgt.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e3);
        }
    }
}
