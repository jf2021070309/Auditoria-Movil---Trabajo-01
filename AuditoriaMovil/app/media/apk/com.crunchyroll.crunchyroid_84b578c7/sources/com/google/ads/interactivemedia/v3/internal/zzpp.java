package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzpp {
    private final Context zza;
    private final Executor zzb;
    private final zzoy zzc;
    private final zzpa zzd;
    private final zzpo zze;
    private final zzpo zzf;
    private Task zzg;
    private Task zzh;

    @VisibleForTesting
    public zzpp(Context context, Executor executor, zzoy zzoyVar, zzpa zzpaVar, zzpm zzpmVar, zzpn zzpnVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzoyVar;
        this.zzd = zzpaVar;
        this.zze = zzpmVar;
        this.zzf = zzpnVar;
    }

    public static zzpp zze(Context context, Executor executor, zzoy zzoyVar, zzpa zzpaVar) {
        final zzpp zzppVar = new zzpp(context, executor, zzoyVar, zzpaVar, new zzpm(), new zzpn());
        if (zzppVar.zzd.zzd()) {
            zzppVar.zzg = zzppVar.zzh(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzpj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzpp.this.zzc();
                }
            });
        } else {
            zzppVar.zzg = Tasks.forResult(zzppVar.zze.zza());
        }
        zzppVar.zzh = zzppVar.zzh(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzpk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzpp.this.zzd();
            }
        });
        return zzppVar;
    }

    private static zzbc zzg(Task task, zzbc zzbcVar) {
        if (!task.isSuccessful()) {
            return zzbcVar;
        }
        return (zzbc) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzpl
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzpp.this.zzf(exc);
            }
        });
    }

    public final zzbc zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzbc zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    public final /* synthetic */ zzbc zzc() throws Exception {
        Context context = this.zza;
        zzaf zza = zzbc.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zza.zzs(id);
            zza.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza.zzab(6);
        }
        return (zzbc) zza.zzak();
    }

    public final /* synthetic */ zzbc zzd() throws Exception {
        Context context = this.zza;
        return zzpg.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
