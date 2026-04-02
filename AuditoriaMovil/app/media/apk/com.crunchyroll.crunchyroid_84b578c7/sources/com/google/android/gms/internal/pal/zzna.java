package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzna {
    public static boolean zza(int i) {
        if (i - 1 != 0) {
            if (!zznb.zzb() || zznb.zza().booleanValue()) {
                return true;
            }
            return false;
        } else if (!zznb.zzb()) {
            return true;
        } else {
            return false;
        }
    }
}
