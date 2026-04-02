package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class zzcok {
    private zzcgz zza;
    private Context zzb;
    private WeakReference<Context> zzc;

    public final zzcok zzd(zzcgz zzcgzVar) {
        this.zza = zzcgzVar;
        return this;
    }

    public final zzcok zze(Context context) {
        this.zzc = new WeakReference<>(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }
}
