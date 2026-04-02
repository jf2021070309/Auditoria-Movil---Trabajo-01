package com.google.android.gms.cast.tv.media;

import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.tv.CastReceiverOptions;
import com.google.android.gms.internal.cast_tv.zzaj;
import com.google.android.gms.internal.cast_tv.zzcb;
import com.google.android.gms.internal.cast_tv.zzeq;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class MediaManager {
    final zzaj zza;
    private final zzcb zzb;
    private final CastReceiverOptions zzc;

    /* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
    /* loaded from: classes2.dex */
    public interface MediaStatusInterceptor {
        void intercept(MediaStatusWriter mediaStatusWriter);
    }

    public MediaManager(Context context, zzcb zzcbVar, CastReceiverOptions castReceiverOptions) {
        this.zzb = zzcbVar;
        this.zzc = castReceiverOptions;
        this.zza = new zzaj(context, new zzi(this), castReceiverOptions);
    }

    public void broadcastMediaStatus() {
        this.zza.zzp(0);
    }

    public MediaStatus getBaseMediaStatus() {
        return this.zza.zzb();
    }

    public MediaStatus getCurrentMediaStatus() {
        return this.zza.zzc();
    }

    public MediaQueueManager getMediaQueueManager() {
        return this.zza.zzj();
    }

    public MediaStatusModifier getMediaStatusModifier() {
        return this.zza.zzl();
    }

    public boolean onNewIntent(Intent intent) {
        return this.zza.zzz(intent);
    }

    public void setDataFromLoad(MediaLoadRequestData mediaLoadRequestData) {
        getMediaStatusModifier().zzb(mediaLoadRequestData);
        getMediaQueueManager().zze(mediaLoadRequestData);
        getMediaStatusModifier().setMediaCommandSupported(MediaStatus.COMMAND_STREAM_TRANSFER, Boolean.valueOf(this.zzc.zzb()));
    }

    public void setMediaCommandCallback(MediaCommandCallback mediaCommandCallback) {
        this.zza.zzv(mediaCommandCallback);
    }

    public void setMediaLoadCommandCallback(MediaLoadCommandCallback mediaLoadCommandCallback) {
        this.zza.zzw(mediaLoadCommandCallback);
    }

    public void setMediaStatusInterceptor(MediaStatusInterceptor mediaStatusInterceptor) {
        this.zza.zzx(mediaStatusInterceptor);
    }

    public void setSessionCompatToken(MediaSessionCompat.Token token) {
        this.zza.zzy(token);
    }

    public final zzaj zza() {
        return this.zza;
    }

    public final void zzc(String str, String str2, String str3, zzeq zzeqVar) {
        this.zza.zzs(str2, str3, zzeqVar);
    }
}
