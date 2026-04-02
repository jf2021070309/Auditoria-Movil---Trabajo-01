package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
abstract class zzan<T> {
    final int zza;
    final TaskCompletionSource<T> zzb = new TaskCompletionSource<>();
    final int zzc;
    final Bundle zzd;

    public zzan(int i, int i2, Bundle bundle) {
        this.zza = i;
        this.zzc = i2;
        this.zzd = bundle;
    }

    public String toString() {
        int i = this.zzc;
        int i2 = this.zza;
        boolean zza = zza();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(zza);
        sb.append("}");
        return sb.toString();
    }

    public abstract void zza(Bundle bundle);

    public final void zza(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            new StringBuilder(String.valueOf(t).length() + valueOf.length() + 16);
        }
        this.zzb.setResult(t);
    }

    public abstract boolean zza();

    public final void zza(zzam zzamVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            new StringBuilder(String.valueOf(zzamVar).length() + valueOf.length() + 14);
        }
        this.zzb.setException(zzamVar);
    }
}
