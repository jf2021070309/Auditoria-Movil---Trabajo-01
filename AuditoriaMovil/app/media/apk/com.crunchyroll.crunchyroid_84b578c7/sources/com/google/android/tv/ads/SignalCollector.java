package com.google.android.tv.ads;

import android.content.Context;
import com.google.ads.interactivemedia.pal.PlatformSignalCollector;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public final class SignalCollector implements PlatformSignalCollector {
    private final com.google.android.gms.internal.atv_ads_framework.zzd zza = new com.google.android.gms.internal.atv_ads_framework.zzd();

    @Override // com.google.ads.interactivemedia.pal.PlatformSignalCollector
    @KeepForSdk
    public Task<Map<String, String>> collectSignals(final Context context, ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        context.getClass();
        executorService.getClass();
        executorService.execute(new Runnable() { // from class: com.google.android.tv.ads.zzg
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(com.google.android.gms.internal.atv_ads_framework.zzd.zzb(context));
                } catch (IllegalStateException e) {
                    taskCompletionSource2.setException(e);
                }
            }
        });
        return taskCompletionSource.getTask();
    }
}
