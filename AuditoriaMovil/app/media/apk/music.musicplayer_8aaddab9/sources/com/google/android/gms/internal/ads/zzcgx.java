package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* loaded from: classes.dex */
public final class zzcgx {
    public static <T> T zza(Context context, String str, zzcgv<IBinder, T> zzcgvVar) throws zzcgw {
        try {
            return zzcgvVar.zza(zzc(context).instantiate(str));
        } catch (Exception e2) {
            throw new zzcgw(e2);
        }
    }

    public static Context zzb(Context context) throws zzcgw {
        return zzc(context).getModuleContext();
    }

    private static DynamiteModule zzc(Context context) throws zzcgw {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
        } catch (Exception e2) {
            throw new zzcgw(e2);
        }
    }
}
