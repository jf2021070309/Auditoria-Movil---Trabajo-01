package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzac {
    private static final Logger zza = new Logger("DiscoveryManager");
    private final zzaq zzb;

    public zzac(zzaq zzaqVar) {
        this.zzb = zzaqVar;
    }

    public final IObjectWrapper zza() {
        try {
            return this.zzb.zze();
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "getWrappedThis", "zzaq");
            return null;
        }
    }
}
