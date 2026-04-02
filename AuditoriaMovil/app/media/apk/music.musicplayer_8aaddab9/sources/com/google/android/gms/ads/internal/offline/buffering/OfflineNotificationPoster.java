package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbvd;
import com.google.android.gms.internal.ads.zzbze;
@KeepForSdk
/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {
    private final zzbze zza;

    public OfflineNotificationPoster(@RecentlyNonNull Context context, @RecentlyNonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzber.zzb().zzr(context, new zzbvd());
    }

    @Override // androidx.work.Worker
    @RecentlyNonNull
    public final ListenableWorker.a doWork() {
        try {
            this.zza.zzf(ObjectWrapper.wrap(getApplicationContext()), getInputData().b("uri"), getInputData().b("gws_query_id"));
            return new ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return new ListenableWorker.a.C0003a();
        }
    }
}
