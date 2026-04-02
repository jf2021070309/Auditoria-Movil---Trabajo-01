package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzdyl implements SensorEventListener {
    private final Context zza;
    @Nullable
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdyk zzf;
    @GuardedBy("this")
    private boolean zzg;

    public zzdyl(Context context) {
        this.zza = context;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgt)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f2 = fArr[0] / 9.80665f;
            float f3 = fArr[1] / 9.80665f;
            float f4 = fArr[2] / 9.80665f;
            float f5 = f4 * f4;
            if (((float) Math.sqrt(f5 + (f3 * f3) + (f2 * f2))) < ((Float) zzbet.zzc().zzc(zzbjl.zzgu)).floatValue()) {
                return;
            }
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
            if (this.zzd + ((Integer) zzbet.zzc().zzc(zzbjl.zzgv)).intValue() > currentTimeMillis) {
                return;
            }
            if (this.zzd + ((Integer) zzbet.zzc().zzc(zzbjl.zzgw)).intValue() < currentTimeMillis) {
                this.zze = 0;
            }
            com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
            this.zzd = currentTimeMillis;
            int i2 = this.zze + 1;
            this.zze = i2;
            zzdyk zzdykVar = this.zzf;
            if (zzdykVar != null) {
                if (i2 == ((Integer) zzbet.zzc().zzc(zzbjl.zzgx)).intValue()) {
                    zzdyc zzdycVar = (zzdyc) zzdykVar;
                    zzdycVar.zzk(new zzdxz(zzdycVar), zzdyb.GESTURE);
                }
            }
        }
    }

    public final void zza(zzdyk zzdykVar) {
        this.zzf = zzdykVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgt)).booleanValue()) {
                if (this.zzb == null) {
                    SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                    this.zzb = sensorManager2;
                    if (sensorManager2 == null) {
                        zzcgt.zzi("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.zzc = sensorManager2.getDefaultSensor(1);
                }
                if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzd = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis() - ((Integer) zzbet.zzc().zzc(zzbjl.zzgv)).intValue();
                    this.zzg = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    public final void zzc() {
        synchronized (this) {
            if (this.zzg) {
                SensorManager sensorManager = this.zzb;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzc);
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }
}
