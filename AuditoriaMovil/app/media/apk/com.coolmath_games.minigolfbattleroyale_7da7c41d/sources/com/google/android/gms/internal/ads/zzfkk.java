package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfkk {
    boolean zza;
    zzfkl zzb;

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
                        if (queryLocalInterface instanceof zzfkl) {
                            zzfklVar = (zzfkl) queryLocalInterface;
                        } else {
                            zzfklVar = new zzfkl(instantiate);
                        }
                    }
                    this.zzb = zzfklVar;
                    this.zzb.zzj(ObjectWrapper.wrap(context), str, null);
                    this.zza = true;
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                } catch (Exception e) {
                    throw new zzfjm(e);
                }
            } catch (Exception e2) {
                throw new zzfjm(e2);
            }
        } catch (RemoteException | zzfjm | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
        }
    }

    public final zzfki zza(byte[] bArr) {
        return new zzfki(this, bArr, null);
    }
}
