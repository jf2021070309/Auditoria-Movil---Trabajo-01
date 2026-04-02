package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* loaded from: classes.dex */
public final class zzfkk {
    @VisibleForTesting
    public boolean zza;
    @VisibleForTesting
    public zzfkl zzb;

    public zzfkk(Context context, String str, String str2) {
        zzfkl zzfklVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfklVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfklVar = queryLocalInterface instanceof zzfkl ? (zzfkl) queryLocalInterface : new zzfkl(instantiate);
                    }
                    this.zzb = zzfklVar;
                    this.zzb.zzj(ObjectWrapper.wrap(context), str, null);
                    this.zza = true;
                } catch (Exception e2) {
                    throw new zzfjm(e2);
                }
            } catch (RemoteException | zzfjm | NullPointerException | SecurityException unused) {
            }
        } catch (Exception e3) {
            throw new zzfjm(e3);
        }
    }

    public final zzfki zza(byte[] bArr) {
        return new zzfki(this, bArr, null);
    }
}
