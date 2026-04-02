package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public abstract class zzal extends com.google.android.gms.internal.cast.zzb implements zzam {
    public static zzam zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
        if (queryLocalInterface instanceof zzam) {
            return (zzam) queryLocalInterface;
        }
        return new zzak(iBinder);
    }
}
