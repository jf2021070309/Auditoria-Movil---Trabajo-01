package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfii {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task<zzfkk> zzd;
    private final boolean zze;

    zzfii(Context context, Executor executor, Task<zzfkk> task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    public static zzfii zza(final Context context, Executor executor, final boolean z) {
        return new zzfii(context, executor, Tasks.call(executor, new Callable(context, z) { // from class: com.google.android.gms.internal.ads.zzfif
            private final Context zza;
            private final boolean zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = context;
                this.zzb = z;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzfkk(this.zza, true != this.zzb ? "" : "GLAS", null);
            }
        }), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzg(int i) {
        zzf = i;
    }

    private final Task<Boolean> zzh(final int i, long j, Exception exc, String str, Map<String, String> map, String str2) {
        if (this.zze) {
            final zzxv zza2 = zzxz.zza();
            zza2.zza(this.zzb.getPackageName());
            zza2.zzb(j);
            zza2.zzg(zzf);
            if (exc != null) {
                zza2.zzc(zzfmk.zzb(exc));
                zza2.zzd(exc.getClass().getName());
            }
            if (str2 != null) {
                zza2.zze(str2);
            }
            if (str != null) {
                zza2.zzf(str);
            }
            return this.zzd.continueWith(this.zzc, new Continuation(zza2, i) { // from class: com.google.android.gms.internal.ads.zzfih
                private final zzxv zza;
                private final int zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zza2;
                    this.zzb = i;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    zzxv zzxvVar = this.zza;
                    int i2 = this.zzb;
                    int i3 = zzfii.zza;
                    if (task.isSuccessful()) {
                        zzfki zza3 = ((zzfkk) task.getResult()).zza(zzxvVar.zzah().zzao());
                        zza3.zzc(i2);
                        zza3.zza();
                        return true;
                    }
                    return false;
                }
            });
        }
        return this.zzd.continueWith(this.zzc, zzfig.zza);
    }

    public final Task<Boolean> zzb(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public final Task<Boolean> zzc(int i, long j, Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final Task<Boolean> zzd(int i, long j, String str, Map<String, String> map) {
        return zzh(i, j, null, str, null, null);
    }

    public final Task<Boolean> zze(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task<Boolean> zzf(int i, long j, String str) {
        return zzh(i, j, null, null, null, str);
    }
}
