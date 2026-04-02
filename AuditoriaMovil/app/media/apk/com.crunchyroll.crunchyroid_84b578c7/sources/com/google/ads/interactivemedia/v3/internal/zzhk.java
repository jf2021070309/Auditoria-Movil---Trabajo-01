package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsAdapter;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzhk {
    private final SecureSignalsAdapter zza;
    private final Context zzb;
    private final String zzc;
    private final TaskCompletionSource zzd = new TaskCompletionSource();

    public zzhk(SecureSignalsAdapter secureSignalsAdapter, String str, Context context) {
        this.zza = secureSignalsAdapter;
        this.zzc = str;
        this.zzb = context;
    }

    public final Task zzb() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.collectSignals(this.zzb, new zzhj(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task zzc() {
        this.zza.initialize(this.zzb, new zzhi(this));
        return this.zzd.getTask();
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zza.getVersion().toString();
    }
}
