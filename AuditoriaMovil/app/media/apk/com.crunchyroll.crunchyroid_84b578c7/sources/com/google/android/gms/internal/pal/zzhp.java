package com.google.android.gms.internal.pal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzhp {
    @VisibleForTesting
    final zzhs zza;
    @VisibleForTesting
    final boolean zzb;

    private zzhp(zzhs zzhsVar) {
        boolean z;
        this.zza = zzhsVar;
        if (zzhsVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.zzb = z;
    }

    public static zzhp zzb(Context context, String str, String str2) {
        zzhs zzhqVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite").instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzhqVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof zzhs) {
                            zzhqVar = (zzhs) queryLocalInterface;
                        } else {
                            zzhqVar = new zzhq(instantiate);
                        }
                    }
                    zzhqVar.zze(ObjectWrapper.wrap(context), "ADSHIELD", null);
                    return new zzhp(zzhqVar);
                } catch (Exception e) {
                    throw new zzhg(e);
                }
            } catch (Exception e2) {
                throw new zzhg(e2);
            }
        } catch (RemoteException | zzhg | NullPointerException | SecurityException unused) {
            return new zzhp(new zzht());
        }
    }

    public final zzho zza(byte[] bArr) {
        return new zzho(this, bArr, null);
    }
}
