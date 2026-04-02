package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public abstract class zzai extends com.google.android.gms.internal.cast.zzb implements zzaj {
    public static zzaj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
        if (queryLocalInterface instanceof zzaj) {
            return (zzaj) queryLocalInterface;
        }
        return new zzah(iBinder);
    }
}
