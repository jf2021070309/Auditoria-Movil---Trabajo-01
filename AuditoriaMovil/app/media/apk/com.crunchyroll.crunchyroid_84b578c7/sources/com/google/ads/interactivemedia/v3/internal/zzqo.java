package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzqo {
    @VisibleForTesting
    final zzqr zza;
    @VisibleForTesting
    final boolean zzb;

    private zzqo(zzqr zzqrVar) {
        boolean z;
        this.zza = zzqrVar;
        if (zzqrVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.zzb = z;
    }

    public static zzqo zzb(Context context, String str, String str2) {
        zzqr zzqpVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite").instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzqpVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof zzqr) {
                            zzqpVar = (zzqr) queryLocalInterface;
                        } else {
                            zzqpVar = new zzqp(instantiate);
                        }
                    }
                    zzqpVar.zze(ObjectWrapper.wrap(context), str, null);
                    return new zzqo(zzqpVar);
                } catch (Exception e) {
                    throw new zzps(e);
                }
            } catch (RemoteException | zzps | NullPointerException | SecurityException unused) {
                return new zzqo(new zzqs());
            }
        } catch (Exception e2) {
            throw new zzps(e2);
        }
    }

    public static zzqo zzc() {
        return new zzqo(new zzqs());
    }

    public final zzqn zza(byte[] bArr) {
        return new zzqn(this, bArr, null);
    }
}
