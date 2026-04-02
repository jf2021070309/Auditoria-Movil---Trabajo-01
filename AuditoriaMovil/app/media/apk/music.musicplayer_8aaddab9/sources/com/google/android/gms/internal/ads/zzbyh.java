package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzbyh extends zzbyp {
    private final Map<String, String> zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbyh(zzcml zzcmlVar, Map<String, String> map) {
        super(zzcmlVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcmlVar.zzj();
        this.zzc = zzd("description");
        this.zzf = zzd("summary");
        this.zzd = zze("start_ticks");
        this.zze = zze("end_ticks");
        this.zzg = zzd("location");
    }

    private final String zzd(String str) {
        return TextUtils.isEmpty(this.zza.get(str)) ? "" : this.zza.get(str);
    }

    private final long zze(String str) {
        String str2 = this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzf("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new zzbiv(this.zzb).zzb()) {
            zzf("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.zzb);
        Resources zzj = com.google.android.gms.ads.internal.zzt.zzg().zzj();
        builder.setTitle(zzj != null ? zzj.getString(R.string.s5) : "Create calendar event");
        builder.setMessage(zzj != null ? zzj.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        builder.setPositiveButton(zzj != null ? zzj.getString(R.string.s3) : "Accept", new zzbyf(this));
        builder.setNegativeButton(zzj != null ? zzj.getString(R.string.s4) : "Decline", new zzbyg(this));
        builder.create().show();
    }

    @TargetApi(14)
    public final Intent zzc() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j2 = this.zzd;
        if (j2 > -1) {
            data.putExtra("beginTime", j2);
        }
        long j3 = this.zze;
        if (j3 > -1) {
            data.putExtra("endTime", j3);
        }
        data.setFlags(268435456);
        return data;
    }
}
