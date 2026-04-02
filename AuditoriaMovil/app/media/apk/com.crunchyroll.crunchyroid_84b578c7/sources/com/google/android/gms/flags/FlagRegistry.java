package com.google.android.gms.flags;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.flags.Flag;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
/* loaded from: classes2.dex */
public class FlagRegistry {
    private final Collection<Flag> zza = new ArrayList();
    private final Collection<Flag.StringFlag> zzb = new ArrayList();
    private final Collection<Flag.StringFlag> zzc = new ArrayList();

    @KeepForSdk
    public static void initialize(Context context) {
        Singletons.zza().zzb(context);
    }

    public final void zza(Flag flag) {
        this.zza.add(flag);
    }
}
