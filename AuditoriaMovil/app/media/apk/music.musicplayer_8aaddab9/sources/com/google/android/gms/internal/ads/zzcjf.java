package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
@TargetApi(14)
/* loaded from: classes.dex */
public final class zzcjf implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzcje zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzcjf(Context context, zzcje zzcjeVar) {
        this.zza = (AudioManager) context.getSystemService("audio");
        this.zzb = zzcjeVar;
    }

    private final void zzf() {
        if (!this.zzd || this.zze || this.zzf <= 0.0f) {
            if (this.zzc) {
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    this.zzc = audioManager.abandonAudioFocus(this) == 0;
                }
                this.zzb.zzt();
            }
        } else if (this.zzc) {
        } else {
            AudioManager audioManager2 = this.zza;
            if (audioManager2 != null) {
                this.zzc = audioManager2.requestAudioFocus(this, 3, 2) == 1;
            }
            this.zzb.zzt();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i2) {
        this.zzc = i2 > 0;
        this.zzb.zzt();
    }

    public final void zza(boolean z) {
        this.zze = z;
        zzf();
    }

    public final void zzb(float f2) {
        this.zzf = f2;
        zzf();
    }

    public final float zzc() {
        float f2 = this.zze ? 0.0f : this.zzf;
        if (this.zzc) {
            return f2;
        }
        return 0.0f;
    }

    public final void zzd() {
        this.zzd = true;
        zzf();
    }

    public final void zze() {
        this.zzd = false;
        zzf();
    }
}
