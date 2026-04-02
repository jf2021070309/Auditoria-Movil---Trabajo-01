package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import e.a.d.a.a;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzadt {
    private final AudioManager zza;
    private final zzadr zzb;
    private zzads zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzadt(Context context, Handler handler, zzads zzadsVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.zza = audioManager;
        this.zzc = zzadsVar;
        this.zzb = new zzadr(this, handler);
        this.zzd = 0;
    }

    public static /* synthetic */ void zzd(zzadt zzadtVar, int i2) {
        if (i2 == -3 || i2 == -2) {
            if (i2 != -2) {
                zzadtVar.zzf(3);
                return;
            }
            zzadtVar.zzg(0);
            zzadtVar.zzf(2);
        } else if (i2 == -1) {
            zzadtVar.zzg(-1);
            zzadtVar.zze();
        } else if (i2 != 1) {
            a.D(38, "Unknown focus change type: ", i2, "AudioFocusManager");
        } else {
            zzadtVar.zzf(1);
            zzadtVar.zzg(1);
        }
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

    private final void zzf(int i2) {
        if (this.zzd == i2) {
            return;
        }
        this.zzd = i2;
        float f2 = i2 == 3 ? 0.2f : 1.0f;
        if (this.zze == f2) {
            return;
        }
        this.zze = f2;
        zzads zzadsVar = this.zzc;
        if (zzadsVar != null) {
            ((zzaib) zzadsVar).zza.zzad();
        }
    }

    private final void zzg(int i2) {
        int zzai;
        zzads zzadsVar = this.zzc;
        if (zzadsVar != null) {
            zzaib zzaibVar = (zzaib) zzadsVar;
            boolean zzM = zzaibVar.zza.zzM();
            zzaie zzaieVar = zzaibVar.zza;
            zzai = zzaie.zzai(zzM, i2);
            zzaieVar.zzae(zzM, i2, zzai);
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i2) {
        zze();
        return z ? 1 : -1;
    }

    public final void zzc() {
        this.zzc = null;
        zze();
    }
}
