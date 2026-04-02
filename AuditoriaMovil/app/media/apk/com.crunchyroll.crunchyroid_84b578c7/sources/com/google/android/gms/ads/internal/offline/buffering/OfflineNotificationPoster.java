package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbrj;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class OfflineNotificationPoster extends Worker {
    private final zzbrj zza;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zza().zzm(context, new zzbnq());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        String str;
        Object obj = getInputData().a.get("uri");
        String str2 = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = getInputData().a.get("gws_query_id");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        }
        try {
            this.zza.zzg(ObjectWrapper.wrap(getApplicationContext()), str, str2);
            return new ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return new ListenableWorker.a.C0060a();
        }
    }
}
