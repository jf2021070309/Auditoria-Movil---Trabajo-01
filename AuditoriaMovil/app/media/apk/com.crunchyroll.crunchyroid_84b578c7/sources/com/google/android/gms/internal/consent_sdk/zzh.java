package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public final class zzh {
    private final Executor zza;

    public zzh(Executor executor) {
        this.zza = executor;
    }

    public final Executor zza() {
        return this.zza;
    }

    public final void zzb(final String str, final String str2, final zzg... zzgVarArr) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zze
            @Override // java.lang.Runnable
            public final void run() {
                final c cVar;
                String str3 = str;
                String str4 = str2;
                zzg[] zzgVarArr2 = zzgVarArr;
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                final String lowerCase = str3.toLowerCase();
                if (TextUtils.isEmpty(str4)) {
                    cVar = new c();
                } else {
                    try {
                        cVar = new c(str4);
                    } catch (b unused) {
                        new StringBuilder(String.valueOf(lowerCase).length() + 32 + String.valueOf(str4).length());
                        return;
                    }
                }
                new StringBuilder(String.valueOf(lowerCase).length() + 10 + String.valueOf(cVar).length());
                for (final zzg zzgVar : zzgVarArr2) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzf
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(zzg.this.zzb(lowerCase, cVar));
                        }
                    });
                    zzgVar.zza().execute(futureTask);
                    try {
                    } catch (InterruptedException unused2) {
                        new StringBuilder(String.valueOf(lowerCase).length() + 33);
                    } catch (ExecutionException e) {
                        new StringBuilder(String.valueOf(lowerCase).length() + 24);
                        e.getCause();
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
            }
        });
    }
}
