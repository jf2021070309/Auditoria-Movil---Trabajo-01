package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public abstract class zzav extends com.google.android.gms.internal.cast.zzb implements zzaw {
    public static zzaw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
        if (queryLocalInterface instanceof zzaw) {
            return (zzaw) queryLocalInterface;
        }
        return new zzau(iBinder);
    }
}
