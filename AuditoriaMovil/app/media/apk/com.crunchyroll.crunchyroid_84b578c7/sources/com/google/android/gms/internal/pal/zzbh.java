package com.google.android.gms.internal.pal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzbh extends zzbg {
    private final zzgx zza;
    private final com.google.ads.interactivemedia.pal.zzx zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(Handler handler, ExecutorService executorService, Context context, com.google.ads.interactivemedia.pal.zzx zzxVar) {
        super(handler, executorService, zzagc.zzb(2L));
        zzhc zzhcVar = new zzhc(context);
        this.zza = zzhcVar;
        this.zzb = zzxVar;
    }

    @Override // com.google.android.gms.internal.pal.zzbg
    public final zzil zza() {
        final Bundle bundle = new Bundle();
        try {
            zzgx zzgxVar = this.zza;
            final zzhc zzhcVar = (zzhc) zzgxVar;
            return zzil.zzf((String) Tasks.await(((zzhc) zzgxVar).doRead(TaskApiCall.builder().setAutoResolveMissingFeatures(false).setFeatures(zzie.zza).run(new RemoteCall() { // from class: com.google.android.gms.internal.pal.zzgz
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    zzhc zzhcVar2 = zzhc.this;
                    ((zzgw) ((zzhd) obj).getService()).zze(bundle, new zzhb(zzhcVar2, (TaskCompletionSource) obj2));
                }
            }).build()), 5L, TimeUnit.SECONDS));
        } catch (InterruptedException | TimeoutException unused) {
            this.zzb.zza(2);
            return zzil.zze();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof zzgy) {
                ((zzgy) cause).zza();
                this.zzb.zza(3);
            }
            return zzil.zze();
        }
    }
}
