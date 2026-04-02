package com.google.android.gms.cast.framework.media.widget;

import android.os.Looper;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.internal.cast.zzed;
import java.util.TimerTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzk extends TimerTask {
    final /* synthetic */ RemoteMediaClient zza;
    final /* synthetic */ ExpandedControllerActivity zzb;

    public zzk(ExpandedControllerActivity expandedControllerActivity, RemoteMediaClient remoteMediaClient) {
        this.zzb = expandedControllerActivity;
        this.zza = remoteMediaClient;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        new zzed(Looper.getMainLooper()).post(new zzj(this));
    }
}
