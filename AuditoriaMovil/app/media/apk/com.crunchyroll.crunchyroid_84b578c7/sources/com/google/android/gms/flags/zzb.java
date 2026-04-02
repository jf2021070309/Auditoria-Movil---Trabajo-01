package com.google.android.gms.flags;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzb {
    private boolean zza = false;
    private zze zzb = null;

    public final <T> T zza(Flag<T> flag) {
        synchronized (this) {
            if (!this.zza) {
                return flag.zzc();
            }
            return flag.zza(this.zzb);
        }
    }

    public final void zzb(Context context) {
        synchronized (this) {
            if (this.zza) {
                return;
            }
            try {
                zze asInterface = zzd.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.flags.impl.FlagProviderImpl"));
                this.zzb = asInterface;
                asInterface.init(ObjectWrapper.wrap(context));
                this.zza = true;
            } catch (RemoteException | DynamiteModule.LoadingException unused) {
            }
        }
    }
}
