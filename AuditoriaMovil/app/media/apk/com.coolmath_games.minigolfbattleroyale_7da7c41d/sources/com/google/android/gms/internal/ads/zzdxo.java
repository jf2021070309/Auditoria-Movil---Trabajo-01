package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdxo implements SensorEventListener {
    @Nullable
    private final SensorManager zza;
    @Nullable
    private final Sensor zzb;
    private float zzc = 0.0f;
    private Float zzd = Float.valueOf(0.0f);
    private long zze = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
    private int zzf = 0;
    private boolean zzg = false;
    private boolean zzh = false;
    @Nullable
    private zzdxn zzi = null;
    private boolean zzj = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxo(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgy)).booleanValue()) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
            if (this.zze + ((Integer) zzbet.zzc().zzc(zzbjl.zzgA)).intValue() < currentTimeMillis) {
                this.zzf = 0;
                this.zze = currentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            Float valueOf = Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = valueOf;
            if (valueOf.floatValue() > this.zzc + ((Float) zzbet.zzc().zzc(zzbjl.zzgz)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else {
                if (this.zzd.floatValue() < this.zzc - ((Float) zzbet.zzc().zzc(zzbjl.zzgz)).floatValue()) {
                    this.zzc = this.zzd.floatValue();
                    this.zzg = true;
                }
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.zze = currentTimeMillis;
                int i = this.zzf + 1;
                this.zzf = i;
                this.zzg = false;
                this.zzh = false;
                zzdxn zzdxnVar = this.zzi;
                if (zzdxnVar != null) {
                    if (i == ((Integer) zzbet.zzc().zzc(zzbjl.zzgB)).intValue()) {
                        zzdyc zzdycVar = (zzdyc) zzdxnVar;
                        zzdycVar.zzk(new zzdya(zzdycVar), zzdyb.GESTURE);
                    }
                }
            }
        }
    }

    public final void zza(zzdxn zzdxnVar) {
        this.zzi = zzdxnVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgy)).booleanValue()) {
                if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzj = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                }
                if (this.zza == null || this.zzb == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.zzj = false;
                com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
            }
        }
    }
}
