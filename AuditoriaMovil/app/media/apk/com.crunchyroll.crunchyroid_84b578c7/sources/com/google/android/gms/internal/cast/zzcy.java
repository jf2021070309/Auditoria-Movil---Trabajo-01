package com.google.android.gms.internal.cast;

import android.content.Context;
import com.google.android.gms.cast.internal.Logger;
import java.util.concurrent.Executors;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzcy {
    protected final Logger zza;
    protected final zzda zzb;

    public zzcy(Context context) {
        zzdd zzddVar = new zzdd(context, zzsc.zza(Executors.newFixedThreadPool(3)));
        this.zza = new Logger("BaseNetUtils");
        this.zzb = zzddVar;
        zzddVar.zza();
    }
}
