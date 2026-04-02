package com.google.android.gms.cast.tv.internal;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.tv.CastLaunchRequest;
import com.google.android.gms.cast.tv.CastReceiverOptions;
import com.google.android.gms.cast.tv.SenderInfo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.cast_tv.zzbv;
import com.google.android.gms.internal.cast_tv.zzdf;
import com.google.android.gms.internal.cast_tv.zzdg;
import com.google.android.gms.internal.cast_tv.zzes;
import com.google.android.gms.internal.cast_tv.zzey;
import com.google.android.gms.internal.cast_tv.zzfe;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzc {
    public static zzc zzb;
    zzam zzc;
    private static final Logger zzd = new Logger("CastTvDynMod");
    private static final String zze = "com.google.android.gms.".concat(String.valueOf(zzbv.zza.getName()));
    static final String zza = "com.google.android.gms.cast.tv.internal.CastTvDynamiteModuleImpl";

    public static zzc zze() {
        if (zzb == null) {
            zzb = new zzc();
        }
        return zzb;
    }

    public static boolean zzk(Context context) {
        String str = zze;
        if (DynamiteModule.getLocalVersion(context, str) > DynamiteModule.getRemoteVersion(context, str)) {
            return true;
        }
        return false;
    }

    public final CastLaunchRequest zza(zzes zzesVar) {
        zzam zzamVar = this.zzc;
        if (zzamVar != null) {
            try {
                return zzamVar.parseCastLaunchRequest(zzesVar);
            } catch (RemoteException e) {
                zzd.w("Failed to parse resume session request data: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            }
        }
        return null;
    }

    public final CastLaunchRequest zzb(Intent intent) {
        zzam zzamVar = this.zzc;
        if (zzamVar != null) {
            try {
                return zzamVar.parseCastLaunchRequestFromLaunchIntent(intent);
            } catch (RemoteException e) {
                zzd.w("Failed to parse resume session request data: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            }
        }
        return null;
    }

    public final SenderInfo zzc(zzfe zzfeVar) {
        zzam zzamVar = this.zzc;
        if (zzamVar != null) {
            try {
                return zzamVar.parseSenderInfo(zzfeVar);
            } catch (RemoteException e) {
                zzd.w("Failed to parse resume session request data: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.cast_tv.zzi zzd(com.google.android.gms.internal.cast_tv.zzf zzfVar) {
        zzam zzamVar = this.zzc;
        if (zzamVar != null) {
            try {
                return zzamVar.createReceiverCacChannelImpl(zzfVar);
            } catch (RemoteException e) {
                zzd.w("Failed to create CAC channel: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.cast_tv.zzr zzf(Context context, com.google.android.gms.internal.cast_tv.zzo zzoVar, CastReceiverOptions castReceiverOptions) {
        if (this.zzc == null) {
            return null;
        }
        try {
            return this.zzc.createReceiverMediaControlChannelImpl(ObjectWrapper.wrap(context.getApplicationContext()), zzoVar, castReceiverOptions);
        } catch (RemoteException e) {
            zzd.w("Failed to create media control channel: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            return null;
        }
    }

    public final void zzg(Context context, long j) {
        if (this.zzc == null) {
            zzd.w("Failed to broadcast receiver context started intent because the dynamite module failed to initialize", new Object[0]);
            return;
        }
        zzdf zzb2 = zzdg.zzb();
        zzb2.zza(j);
        zzey zzeyVar = new zzey((zzdg) zzb2.zzi());
        try {
            this.zzc.broadcastReceiverContextStartedIntent(ObjectWrapper.wrap(context.getApplicationContext()), zzeyVar);
        } catch (RemoteException e) {
            zzd.w("Failed to broadcast receiver context started intent: ".concat(String.valueOf(e.getMessage())), new Object[0]);
        }
    }

    public final void zzh(Context context) throws zzb {
        if (this.zzc != null) {
            return;
        }
        try {
            this.zzc = zzal.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION, zze).instantiate(zza));
        } catch (DynamiteModule.LoadingException e) {
            throw new zzb(e);
        }
    }

    public final void zzi() {
        zzam zzamVar = this.zzc;
        if (zzamVar != null) {
            try {
                zzamVar.onWargInfoReceived();
            } catch (RemoteException e) {
                zzd.w("Failed to notify warg is connected: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            }
        }
    }

    public final void zzj(zzap zzapVar) {
        zzam zzamVar = this.zzc;
        if (zzamVar != null) {
            try {
                zzamVar.setUmaEventSink(zzapVar);
            } catch (RemoteException e) {
                zzd.w("Failed to parse resume session request data: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            }
        }
    }
}
