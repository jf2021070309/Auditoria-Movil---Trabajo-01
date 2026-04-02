package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzenw implements zzery<zzenx> {
    private final zzfsn zza;
    private final Context zzb;

    public zzenw(zzfsn zzfsnVar, Context context) {
        this.zza = zzfsnVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzenx> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzenv
            private final zzenw zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzenx zzb() throws Exception {
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        return new zzenx(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzt.zzh().zzb(), com.google.android.gms.ads.internal.zzt.zzh().zzd());
    }
}
