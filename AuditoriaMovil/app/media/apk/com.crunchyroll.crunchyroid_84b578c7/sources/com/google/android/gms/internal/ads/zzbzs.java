package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbzs {
    public static Context zza(Context context) throws zzbzr {
        return zzc(context).getModuleContext();
    }

    public static Object zzb(Context context, String str, zzbzq zzbzqVar) throws zzbzr {
        try {
            return zzbzqVar.zza(zzc(context).instantiate(str));
        } catch (Exception e) {
            throw new zzbzr(e);
        }
    }

    private static DynamiteModule zzc(Context context) throws zzbzr {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite");
        } catch (Exception e) {
            throw new zzbzr(e);
        }
    }
}
