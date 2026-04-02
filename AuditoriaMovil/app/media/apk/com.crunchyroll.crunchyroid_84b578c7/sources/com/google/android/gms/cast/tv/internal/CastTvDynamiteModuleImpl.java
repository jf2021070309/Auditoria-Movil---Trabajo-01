package com.google.android.gms.cast.tv.internal;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.tv.CastLaunchRequest;
import com.google.android.gms.cast.tv.CastReceiverOptions;
import com.google.android.gms.cast.tv.SenderInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.cast_tv.zzbp;
import com.google.android.gms.internal.cast_tv.zzbz;
import com.google.android.gms.internal.cast_tv.zzca;
import com.google.android.gms.internal.cast_tv.zzdx;
import com.google.android.gms.internal.cast_tv.zzes;
import com.google.android.gms.internal.cast_tv.zzey;
import com.google.android.gms.internal.cast_tv.zzfe;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@DynamiteApi
/* loaded from: classes2.dex */
public class CastTvDynamiteModuleImpl extends zzal {
    private static final Logger zzb = new Logger("CastTvDynModImpl");
    final zze zza = new Object() { // from class: com.google.android.gms.cast.tv.internal.zze
    };
    private zzca zzc;

    public static /* synthetic */ void zzb(zzap zzapVar, zzdx zzdxVar) {
        try {
            zzapVar.zzb(zzdxVar);
        } catch (RemoteException unused) {
            zzb.e("Failed to log UMA event", new Object[0]);
        }
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public void broadcastReceiverContextStartedIntent(IObjectWrapper iObjectWrapper, zzey zzeyVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Preconditions.checkNotNull(context);
        context.sendBroadcast(new Intent().setAction("com.google.android.gms.cast.tv.ACTION_RECEIVER_CONTEXT_STARTED").putExtra("com.google.android.gms.cast.tv.EXTRA_PACKAGE_NAME", context.getPackageName()).putExtra("com.google.android.gms.cast.tv.EXTRA_LAST_START_TIMESTAMP", zzeyVar.zza().zza()));
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public com.google.android.gms.internal.cast_tv.zzi createReceiverCacChannelImpl(com.google.android.gms.internal.cast_tv.zzf zzfVar) {
        return new com.google.android.gms.cast.tv.cac.zzj(zzfVar).zzc();
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public com.google.android.gms.internal.cast_tv.zzr createReceiverMediaControlChannelImpl(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.cast_tv.zzo zzoVar, CastReceiverOptions castReceiverOptions) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Preconditions.checkNotNull(context);
        return new zzbp(context, zzoVar, castReceiverOptions, this.zzc).zzg();
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public void onWargInfoReceived() {
        zzca zzcaVar = this.zzc;
        if (zzcaVar != null) {
            zzcaVar.zzd("Cast.AtvReceiver.DynamiteVersion", 12451000L);
        }
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public CastLaunchRequest parseCastLaunchRequest(zzes zzesVar) {
        return CastLaunchRequest.zza(CastUtils.jsonStringToJsonObject(zzesVar.zza().zzc()));
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public CastLaunchRequest parseCastLaunchRequestFromLaunchIntent(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("com.google.android.gms.cast.tv.LAUNCH_CHECKER_PARAMS")) == null) {
            return null;
        }
        return CastLaunchRequest.zza(CastUtils.jsonStringToJsonObject(stringExtra));
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public SenderInfo parseSenderInfo(zzfe zzfeVar) {
        return new SenderInfo(zzfeVar.zza());
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public void setUmaEventSink(final zzap zzapVar) {
        this.zzc = new zzca(new zzbz() { // from class: com.google.android.gms.cast.tv.internal.zzd
            @Override // com.google.android.gms.internal.cast_tv.zzbz
            public final void zza(zzdx zzdxVar) {
                CastTvDynamiteModuleImpl.zzb(zzap.this, zzdxVar);
            }
        });
    }
}
