package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzadt {
    private final AudioManager zza;
    private final zzadr zzb;
    private zzads zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzadt(Context context, Handler handler, zzads zzadsVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            this.zza = audioManager;
            this.zzc = zzadsVar;
            this.zzb = new zzadr(this, handler);
            this.zzd = 0;
            return;
        }
        throw null;
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzamq.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzf(0);
    }

    private final void zzf(int i) {
        if (this.zzd == i) {
            return;
        }
        this.zzd = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.zze == f) {
            return;
        }
        this.zze = f;
        zzads zzadsVar = this.zzc;
        if (zzadsVar != null) {
            ((zzaib) zzadsVar).zza.zzad();
        }
    }

    private final void zzg(int i) {
        int zzai;
        zzads zzadsVar = this.zzc;
        if (zzadsVar != null) {
            zzaib zzaibVar = (zzaib) zzadsVar;
            boolean zzM = zzaibVar.zza.zzM();
            zzaie zzaieVar = zzaibVar.zza;
            zzai = zzaie.zzai(zzM, i);
            zzaieVar.zzae(zzM, i, zzai);
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        return z ? 1 : -1;
    }

    public final void zzc() {
        this.zzc = null;
        zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzadt zzadtVar, int i) {
        if (i == -3 || i == -2) {
            if (i == -2) {
                zzadtVar.zzg(0);
                zzadtVar.zzf(2);
                return;
            }
            zzadtVar.zzf(3);
        } else if (i == -1) {
            zzadtVar.zzg(-1);
            zzadtVar.zze();
        } else if (i == 1) {
            zzadtVar.zzf(1);
            zzadtVar.zzg(1);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            Log.w("AudioFocusManager", sb.toString());
        }
    }
}
