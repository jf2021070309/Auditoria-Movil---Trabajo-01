package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzkg extends zzki {
    private final AlarmManager zza;
    private zzam zzb;
    private Integer zzc;

    public zzkg(zzks zzksVar) {
        super(zzksVar);
        this.zza = (AlarmManager) this.zzs.zzau().getSystemService("alarm");
    }

    private final int zzf() {
        if (this.zzc == null) {
            String valueOf = String.valueOf(this.zzs.zzau().getPackageName());
            this.zzc = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzh() {
        Context zzau = this.zzs.zzau();
        return com.google.android.gms.internal.measurement.zzbs.zza(zzau, 0, new Intent().setClassName(zzau, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzbs.zza);
    }

    private final zzam zzi() {
        if (this.zzb == null) {
            this.zzb = new zzkf(this, this.zzf.zzq());
        }
        return this.zzb;
    }

    @TargetApi(24)
    private final void zzj() {
        JobScheduler jobScheduler = (JobScheduler) this.zzs.zzau().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzf());
        }
    }

    public final void zza() {
        zzY();
        a.G(this.zzs, "Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzi().zzb();
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzki
    public final boolean zzb() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
            return false;
        }
        return false;
    }

    public final void zzd(long j2) {
        zzY();
        this.zzs.zzaw();
        Context zzau = this.zzs.zzau();
        if (!zzkz.zzai(zzau)) {
            this.zzs.zzay().zzc().zza("Receiver not registered/enabled");
        }
        if (!zzkz.zzaj(zzau, false)) {
            this.zzs.zzay().zzc().zza("Service not registered/enabled");
        }
        zza();
        this.zzs.zzay().zzj().zzb("Scheduling upload, millis", Long.valueOf(j2));
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime() + j2;
        this.zzs.zzf();
        if (j2 < Math.max(0L, zzdy.zzw.zza(null).longValue()) && !zzi().zze()) {
            zzi().zzd(j2);
        }
        this.zzs.zzaw();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.zza;
            if (alarmManager != null) {
                this.zzs.zzf();
                alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(zzdy.zzr.zza(null).longValue(), j2), zzh());
                return;
            }
            return;
        }
        Context zzau2 = this.zzs.zzau();
        ComponentName componentName = new ComponentName(zzau2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int zzf = zzf();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzbt.zza(zzau2, new JobInfo.Builder(zzf, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 + j2).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
