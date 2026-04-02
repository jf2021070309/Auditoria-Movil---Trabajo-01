package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import e.a.d.a.a;
/* loaded from: classes.dex */
public abstract class zzp<T> {
    public final int zza;
    public final TaskCompletionSource<T> zzb = new TaskCompletionSource<>();
    public final int zzc;
    public final Bundle zzd;

    public zzp(int i2, int i3, Bundle bundle) {
        this.zza = i2;
        this.zzc = i3;
        this.zzd = bundle;
    }

    public final String toString() {
        StringBuilder w = a.w(55, "Request { what=", this.zzc, " id=", this.zza);
        w.append(" oneWay=");
        w.append(zzb());
        w.append("}");
        return w.toString();
    }

    public abstract void zza(Bundle bundle);

    public abstract boolean zzb();

    public final void zzc(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzqVar);
            valueOf.length();
            valueOf2.length();
        }
        this.zzb.setException(zzqVar);
    }

    public final void zzd(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            valueOf.length();
            valueOf2.length();
        }
        this.zzb.setResult(t);
    }
}
