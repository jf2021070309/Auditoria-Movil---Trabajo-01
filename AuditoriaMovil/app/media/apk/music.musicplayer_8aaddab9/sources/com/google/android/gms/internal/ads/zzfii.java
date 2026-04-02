package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zzfii {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task<zzfkk> zzd;
    private final boolean zze;

    public zzfii(Context context, Executor executor, Task<zzfkk> task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    public static zzfii zza(final Context context, Executor executor, final boolean z) {
        return new zzfii(context, executor, Tasks.call(executor, new Callable(context, z) { // from class: com.google.android.gms.internal.ads.zzfif
            private final Context zza;
            private final boolean zzb;

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

    public static void zzg(int i2) {
        zzf = i2;
    }

    private final Task<Boolean> zzh(final int i2, long j2, Exception exc, String str, Map<String, String> map, String str2) {
        if (this.zze) {
            final zzxv zza2 = zzxz.zza();
            zza2.zza(this.zzb.getPackageName());
            zza2.zzb(j2);
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
            return this.zzd.continueWith(this.zzc, new Continuation(zza2, i2) { // from class: com.google.android.gms.internal.ads.zzfih
                private final zzxv zza;
                private final int zzb;

                {
                    this.zza = zza2;
                    this.zzb = i2;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    zzxv zzxvVar = this.zza;
                    int i3 = this.zzb;
                    int i4 = zzfii.zza;
                    if (task.isSuccessful()) {
                        zzfki zza3 = ((zzfkk) task.getResult()).zza(zzxvVar.zzah().zzao());
                        zza3.zzc(i3);
                        zza3.zza();
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }
            });
        }
        return this.zzd.continueWith(this.zzc, zzfig.zza);
    }

    public final Task<Boolean> zzb(int i2, long j2) {
        return zzh(i2, j2, null, null, null, null);
    }

    public final Task<Boolean> zzc(int i2, long j2, Exception exc) {
        return zzh(i2, j2, exc, null, null, null);
    }

    public final Task<Boolean> zzd(int i2, long j2, String str, Map<String, String> map) {
        return zzh(i2, j2, null, str, null, null);
    }

    public final Task<Boolean> zze(int i2, String str) {
        return zzh(i2, 0L, null, null, null, str);
    }

    public final Task<Boolean> zzf(int i2, long j2, String str) {
        return zzh(i2, j2, null, null, null, str);
    }
}
