package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzom;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e.a.d.a.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.slf4j.Marker;
/* loaded from: classes2.dex */
public final class zzaj extends zzki {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzai zzj;
    private final zzke zzk;

    public zzaj(zzks zzksVar) {
        super(zzksVar);
        this.zzk = new zzke(this.zzs.zzav());
        this.zzs.zzf();
        this.zzj = new zzai(this, this.zzs.zzau(), "google_app_measurement.db");
    }

    public static final void zzX(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        } else {
            contentValues.put("value", (Double) obj);
        }
    }

    private final long zzab(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzh().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j2 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j2;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e2) {
                this.zzs.zzay().zzd().zzc("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzac(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzh().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j2;
                }
                long j3 = cursor.getLong(0);
                cursor.close();
                return j3;
            } catch (SQLiteException e2) {
                this.zzs.zzay().zzd().zzc("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzA() {
        zzg();
        zzY();
        if (zzK()) {
            long zza2 = this.zzf.zzs().zza.zza();
            long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            this.zzs.zzf();
            if (abs > zzdy.zzx.zza(null).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzY();
                if (zzK()) {
                    SQLiteDatabase zzh2 = zzh();
                    this.zzs.zzf();
                    int delete = zzh2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.zzs.zzav().currentTimeMillis()), String.valueOf(zzaf.zzA())});
                    if (delete > 0) {
                        this.zzs.zzay().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    public final void zzB(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzY();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzd("Error deleting user property. appId", zzel.zzn(str), this.zzs.zzj().zzf(str2), e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0343, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0344, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0358, code lost:
        if (zzh().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x035a, code lost:
        r23.zzs.zzay().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzel.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x036e, code lost:
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0372, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0373, code lost:
        r23.zzs.zzay().zzd().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzel.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0386, code lost:
        zzY();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        r0 = zzh();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03bd, code lost:
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018b, code lost:
        r11 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0197, code lost:
        if (r11.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a3, code lost:
        if (r11.next().zzj() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a5, code lost:
        r23.zzs.zzay().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzel.zzn(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01be, code lost:
        r11 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if (r11.hasNext() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d6, code lost:
        r12 = r11.next();
        zzY();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f0, code lost:
        if (android.text.TextUtils.isEmpty(r12.zzg()) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f2, code lost:
        r0 = r23.zzs.zzay().zzk();
        r8 = com.google.android.gms.measurement.internal.zzel.zzn(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x020a, code lost:
        if (r12.zzp() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x020c, code lost:
        r20 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0217, code lost:
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0219, code lost:
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0224, code lost:
        r3 = r12.zzbs();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put("app_id", r24);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x023d, code lost:
        if (r12.zzp() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x023f, code lost:
        r8 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0248, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0249, code lost:
        r4.put("filter_id", r8);
        r4.put("event_name", r12.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0259, code lost:
        if (r12.zzq() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x025b, code lost:
        r8 = java.lang.Boolean.valueOf(r12.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0264, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0265, code lost:
        r4.put("session_scoped", r8);
        r4.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0279, code lost:
        if (zzh().insertWithOnConflict("event_filters", null, r4, 5) != (-1)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x027b, code lost:
        r23.zzs.zzay().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzel.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x028e, code lost:
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0294, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0295, code lost:
        r23.zzs.zzay().zzd().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzel.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02aa, code lost:
        r21 = r4;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02b8, code lost:
        if (r0.hasNext() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02ba, code lost:
        r3 = r0.next();
        zzY();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02d4, code lost:
        if (android.text.TextUtils.isEmpty(r3.zze()) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d6, code lost:
        r0 = r23.zzs.zzay().zzk();
        r7 = com.google.android.gms.measurement.internal.zzel.zzn(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02ee, code lost:
        if (r3.zzj() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f0, code lost:
        r3 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02f9, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02fa, code lost:
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0303, code lost:
        r4 = r3.zzbs();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x031a, code lost:
        if (r3.zzj() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x031c, code lost:
        r12 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0325, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0326, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0338, code lost:
        if (r3.zzk() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x033a, code lost:
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzC(java.lang.String r24, java.util.List<com.google.android.gms.internal.measurement.zzeh> r25) {
        /*
            Method dump skipped, instructions count: 1219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaj.zzC(java.lang.String, java.util.List):void");
    }

    public final void zzD() {
        zzY();
        zzh().setTransactionSuccessful();
    }

    public final void zzE(zzg zzgVar) {
        Preconditions.checkNotNull(zzgVar);
        zzg();
        zzY();
        String zzt = zzgVar.zzt();
        Preconditions.checkNotNull(zzt);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzt);
        contentValues.put("app_instance_id", zzgVar.zzu());
        contentValues.put("gmp_app_id", zzgVar.zzz());
        contentValues.put("resettable_device_id_hash", zzgVar.zzB());
        contentValues.put("last_bundle_index", Long.valueOf(zzgVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzgVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzgVar.zzn()));
        contentValues.put("app_version", zzgVar.zzw());
        contentValues.put("app_store", zzgVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzgVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzgVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzgVar.zzaj()));
        contentValues.put("day", Long.valueOf(zzgVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzgVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzgVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzgVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzgVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzgVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzgVar.zzb()));
        contentValues.put("firebase_instance_id", zzgVar.zzx());
        contentValues.put("daily_error_events_count", Long.valueOf(zzgVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzgVar.zzh()));
        contentValues.put("health_monitor_sample", zzgVar.zzA());
        contentValues.put("android_id", Long.valueOf(zzgVar.zza()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzgVar.zzai()));
        contentValues.put("admob_app_id", zzgVar.zzr());
        contentValues.put("dynamite_version", Long.valueOf(zzgVar.zzk()));
        List<String> zzC = zzgVar.zzC();
        if (zzC != null) {
            if (zzC.size() == 0) {
                this.zzs.zzay().zzk().zzb("Safelisted events should not be an empty list. appId", zzt);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzC));
            }
        }
        zzom.zzc();
        if (this.zzs.zzf().zzs(zzt, zzdy.zzac)) {
            contentValues.put("ga_app_id", zzgVar.zzy());
        }
        try {
            SQLiteDatabase zzh2 = zzh();
            if (zzh2.update("apps", contentValues, "app_id = ?", new String[]{zzt}) == 0 && zzh2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update app (got -1). appId", zzel.zzn(zzt));
            }
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzc("Error storing app. appId", zzel.zzn(zzt), e2);
        }
    }

    public final void zzF(zzap zzapVar) {
        Preconditions.checkNotNull(zzapVar);
        zzg();
        zzY();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzapVar.zza);
        contentValues.put("name", zzapVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzapVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzapVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzapVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzapVar.zzg));
        contentValues.put("last_bundled_day", zzapVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzapVar.zzi);
        contentValues.put("last_sampling_rate", zzapVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzapVar.zze));
        Boolean bool = zzapVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzel.zzn(zzapVar.zza));
            }
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzc("Error storing event aggregates. appId", zzel.zzn(zzapVar.zza), e2);
        }
    }

    public final void zzG(String str, byte[] bArr, String str2) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzY();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (zzh().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.zzs.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzel.zzn(str));
            }
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzc("Error storing remote config. appId", zzel.zzn(str), e2);
        }
    }

    public final boolean zzH() {
        return zzab("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzI() {
        return zzab("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzJ() {
        return zzab("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    @VisibleForTesting
    public final boolean zzK() {
        Context zzau = this.zzs.zzau();
        this.zzs.zzf();
        return zzau.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzL(String str, Long l2, long j2, com.google.android.gms.internal.measurement.zzfo zzfoVar) {
        zzg();
        zzY();
        Preconditions.checkNotNull(zzfoVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l2);
        byte[] zzbs = zzfoVar.zzbs();
        this.zzs.zzay().zzj().zzc("Saving complex main event, appId, data size", this.zzs.zzj().zzd(str), Integer.valueOf(zzbs.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", zzbs);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert complex main event (got -1). appId", zzel.zzn(str));
                return false;
            }
            return true;
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzc("Error storing complex main event. appId", zzel.zzn(str), e2);
            return false;
        }
    }

    public final boolean zzM(zzab zzabVar) {
        Preconditions.checkNotNull(zzabVar);
        zzg();
        zzY();
        String str = zzabVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzabVar.zzc.zzb) == null) {
            long zzab = zzab("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzs.zzf();
            if (zzab >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzabVar.zzb);
        contentValues.put("name", zzabVar.zzc.zzb);
        zzX(contentValues, "value", Preconditions.checkNotNull(zzabVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzabVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzabVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzabVar.zzh));
        contentValues.put("timed_out_event", this.zzs.zzv().zzan(zzabVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzabVar.zzd));
        contentValues.put("triggered_event", this.zzs.zzv().zzan(zzabVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzabVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzabVar.zzj));
        contentValues.put("expired_event", this.zzs.zzv().zzan(zzabVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzel.zzn(str));
            }
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzc("Error storing conditional user property", zzel.zzn(str), e2);
        }
        return true;
    }

    public final boolean zzN(zzkx zzkxVar) {
        Preconditions.checkNotNull(zzkxVar);
        zzg();
        zzY();
        if (zzp(zzkxVar.zza, zzkxVar.zzc) == null) {
            if (zzkz.zzah(zzkxVar.zzc)) {
                if (zzab("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzkxVar.zza}) >= this.zzs.zzf().zzf(zzkxVar.zza, zzdy.zzF, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzkxVar.zzc)) {
                long zzab = zzab("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzkxVar.zza, zzkxVar.zzb});
                this.zzs.zzf();
                if (zzab >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkxVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzkxVar.zzb);
        contentValues.put("name", zzkxVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzkxVar.zzd));
        zzX(contentValues, "value", zzkxVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update user property (got -1). appId", zzel.zzn(zzkxVar.zza));
            }
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzc("Error storing user property. appId", zzel.zzn(zzkxVar.zza), e2);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0235: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:101:0x0235 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    public final void zzW(String str, long j2, long j3, zzkr zzkrVar) {
        ?? r4;
        Cursor cursor;
        String str2;
        Cursor rawQuery;
        String string;
        String str3;
        String[] strArr;
        Preconditions.checkNotNull(zzkrVar);
        zzg();
        zzY();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str4 = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                r4 = TextUtils.isEmpty(null);
                try {
                    if (r4 != 0) {
                        String[] strArr2 = j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)};
                        str2 = j3 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb = new StringBuilder(str2.length() + 148);
                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb.append(str2);
                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        rawQuery = zzh2.rawQuery(sb.toString(), strArr2);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        }
                        str4 = rawQuery.getString(0);
                        string = rawQuery.getString(1);
                        rawQuery.close();
                    } else {
                        String[] strArr3 = j3 != -1 ? new String[]{null, String.valueOf(j3)} : new String[]{null};
                        str2 = j3 != -1 ? " and rowid <= ?" : "";
                        StringBuilder sb2 = new StringBuilder(str2.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str2);
                        sb2.append(" order by rowid limit 1;");
                        rawQuery = zzh2.rawQuery(sb2.toString(), strArr3);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str5 = string;
                    try {
                        Cursor query = zzh2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, str5}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.zzs.zzay().zzd().zzb("Raw event metadata record is missing. appId", zzel.zzn(str4));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    com.google.android.gms.internal.measurement.zzfy zzaA = ((com.google.android.gms.internal.measurement.zzfx) zzku.zzl(com.google.android.gms.internal.measurement.zzfy.zzu(), query.getBlob(0))).zzaA();
                                    if (query.moveToNext()) {
                                        this.zzs.zzay().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzel.zzn(str4));
                                    }
                                    query.close();
                                    Preconditions.checkNotNull(zzaA);
                                    zzkrVar.zza = zzaA;
                                    if (j3 != -1) {
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{str4, str5, String.valueOf(j3)};
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{str4, str5};
                                    }
                                    Cursor query2 = zzh2.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr, null, null, "rowid", null);
                                    if (!query2.moveToFirst()) {
                                        this.zzs.zzay().zzk().zzb("Raw event data disappeared while in transaction. appId", zzel.zzn(str4));
                                        query2.close();
                                        return;
                                    }
                                    do {
                                        long j4 = query2.getLong(0);
                                        try {
                                            com.google.android.gms.internal.measurement.zzfn zzfnVar = (com.google.android.gms.internal.measurement.zzfn) zzku.zzl(com.google.android.gms.internal.measurement.zzfo.zze(), query2.getBlob(3));
                                            zzfnVar.zzi(query2.getString(1));
                                            zzfnVar.zzm(query2.getLong(2));
                                            if (!zzkrVar.zza(j4, zzfnVar.zzaA())) {
                                                query2.close();
                                                return;
                                            }
                                        } catch (IOException e2) {
                                            this.zzs.zzay().zzd().zzc("Data loss. Failed to merge raw event. appId", zzel.zzn(str4), e2);
                                        }
                                    } while (query2.moveToNext());
                                    query2.close();
                                } catch (IOException e3) {
                                    this.zzs.zzay().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzel.zzn(str4), e3);
                                    query.close();
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                r4 = query;
                                this.zzs.zzay().zzd().zzc("Data loss. Error selecting raw event. appId", zzel.zzn(str4), e);
                                if (r4 != 0) {
                                    r4.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = query;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteException e6) {
                        e = e6;
                        r4 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e8) {
            e = e8;
            r4 = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzY();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzd("Error deleting conditional property", zzel.zzn(str), this.zzs.zzj().zzf(str2), e2);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzki
    public final boolean zzb() {
        return false;
    }

    @VisibleForTesting
    public final long zzc(String str, String str2) {
        long zzac;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzY();
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        long j2 = 0;
        try {
            try {
                zzac = zzac("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (zzac == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (zzh2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.zzs.zzay().zzd().zzc("Failed to insert column (got -1). appId", zzel.zzn(str), "first_open_count");
                        return -1L;
                    }
                    zzac = 0;
                }
            } finally {
                zzh2.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + zzac));
            if (zzh2.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                this.zzs.zzay().zzd().zzc("Failed to update column (got 0). appId", zzel.zzn(str), "first_open_count");
                return -1L;
            }
            zzh2.setTransactionSuccessful();
            return zzac;
        } catch (SQLiteException e3) {
            e = e3;
            j2 = zzac;
            this.zzs.zzay().zzd().zzd("Error inserting column. appId", zzel.zzn(str), "first_open_count", e);
            zzh2.endTransaction();
            return j2;
        }
    }

    public final long zzd() {
        return zzac("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long zze() {
        return zzac("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzac("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @VisibleForTesting
    public final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzk().zzb("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zzi(java.lang.String r8) {
        /*
            r7 = this;
            r7.zzg()
            r7.zzY()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.zzh()     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r3 = 0
            r2[r3] = r8     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r2 != 0) goto L30
            com.google.android.gms.measurement.internal.zzfv r8 = r7.zzs     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzel r8 = r8.zzay()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzej r8 = r8.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r2 = "Default event parameters not found"
            r8.zza(r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        L30:
            byte[] r2 = r1.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfn r3 = com.google.android.gms.internal.measurement.zzfo.zze()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzlb r2 = com.google.android.gms.measurement.internal.zzku.zzl(r3, r2)     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfn r2 = (com.google.android.gms.internal.measurement.zzfn) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzjx r2 = r2.zzaA()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzks r8 = r7.zzf     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r8.zzu()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.List r8 = r2.zzi()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
        L56:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.zzfs r3 = (com.google.android.gms.internal.measurement.zzfs) r3     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            boolean r5 = r3.zzu()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L74
            double r5 = r3.zza()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L74:
            boolean r5 = r3.zzv()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L82
            float r3 = r3.zzb()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L82:
            boolean r5 = r3.zzy()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L90
            java.lang.String r3 = r3.zzh()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L90:
            boolean r5 = r3.zzw()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L56
            long r5 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L9e:
            r1.close()
            return r2
        La2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfv r3 = r7.zzs     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzel r3 = r3.zzay()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzej r3 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzel.zzn(r8)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r3.zzc(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        Lba:
            r8 = move-exception
            goto Lc0
        Lbc:
            r8 = move-exception
            goto Ld7
        Lbe:
            r8 = move-exception
            r1 = r0
        Lc0:
            com.google.android.gms.measurement.internal.zzfv r2 = r7.zzs     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzel r2 = r2.zzay()     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.zzej r2 = r2.zzd()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zzb(r3, r8)     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Ld4
            r1.close()
        Ld4:
            return r0
        Ld5:
            r8 = move-exception
            r0 = r1
        Ld7:
            if (r0 == 0) goto Ldc
            r0.close()
        Ldc:
            goto Lde
        Ldd:
            throw r8
        Lde:
            goto Ldd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaj.zzi(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011b A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01bf, B:42:0x01c8, B:44:0x01d1, B:35:0x018d, B:18:0x011b), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157 A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01bf, B:42:0x01c8, B:44:0x01d1, B:35:0x018d, B:18:0x011b), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018d A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01bf, B:42:0x01c8, B:44:0x01d1, B:35:0x018d, B:18:0x011b), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019c A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01bf, B:42:0x01c8, B:44:0x01d1, B:35:0x018d, B:18:0x011b), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bf A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01bf, B:42:0x01c8, B:44:0x01d1, B:35:0x018d, B:18:0x011b), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d1 A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01bf, B:42:0x01c8, B:44:0x01d1, B:35:0x018d, B:18:0x011b), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzg zzj(java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaj.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0123: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:31:0x0123 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzab zzk(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaj.zzk(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzab");
    }

    public final zzah zzl(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zzm(j2, str, 1L, false, false, z3, false, z5);
    }

    public final zzah zzm(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzY();
        String[] strArr = {str};
        zzah zzahVar = new zzah();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                Cursor query = zzh2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.zzs.zzay().zzk().zzb("Not updating daily counts, app is not known. appId", zzel.zzn(str));
                    query.close();
                    return zzahVar;
                }
                if (query.getLong(0) == j2) {
                    zzahVar.zzb = query.getLong(1);
                    zzahVar.zza = query.getLong(2);
                    zzahVar.zzc = query.getLong(3);
                    zzahVar.zzd = query.getLong(4);
                    zzahVar.zze = query.getLong(5);
                }
                if (z) {
                    zzahVar.zzb += j3;
                }
                if (z2) {
                    zzahVar.zza += j3;
                }
                if (z3) {
                    zzahVar.zzc += j3;
                }
                if (z4) {
                    zzahVar.zzd += j3;
                }
                if (z5) {
                    zzahVar.zze += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(zzahVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzahVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzahVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzahVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzahVar.zze));
                zzh2.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return zzahVar;
            } catch (SQLiteException e2) {
                this.zzs.zzay().zzd().zzc("Error updating daily counts. appId", zzel.zzn(str), e2);
                if (0 != 0) {
                    cursor.close();
                }
                return zzahVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzap zzn(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaj.zzn(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzap");
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:28:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzkx zzp(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r21)
            r19.zzg()
            r19.zzY()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.zzh()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r4 != 0) goto L40
            r11.close()
            return r10
        L40:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.Object r8 = r1.zzq(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r8 != 0) goto L4e
            r11.close()
            return r10
        L4e:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzkx r0 = new com.google.android.gms.measurement.internal.zzkx     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r2 == 0) goto L75
            com.google.android.gms.measurement.internal.zzfv r2 = r1.zzs     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzel r2 = r2.zzay()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzej r2 = r2.zzd()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzel.zzn(r20)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2.zzb(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
        L75:
            r11.close()
            return r0
        L79:
            r0 = move-exception
            goto L7f
        L7b:
            r0 = move-exception
            goto La4
        L7d:
            r0 = move-exception
            r11 = r10
        L7f:
            com.google.android.gms.measurement.internal.zzfv r2 = r1.zzs     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzel r2 = r2.zzay()     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzej r2 = r2.zzd()     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzel.zzn(r20)     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzfv r5 = r1.zzs     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.zzeg r5 = r5.zzj()     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = r5.zzf(r9)     // Catch: java.lang.Throwable -> La2
            r2.zzd(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> La2
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r10
        La2:
            r0 = move-exception
            r10 = r11
        La4:
            if (r10 == 0) goto La9
            r10.close()
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaj.zzp(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzkx");
    }

    @VisibleForTesting
    public final Object zzq(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            a.F(this.zzs, "Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        this.zzs.zzay().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                        return null;
                    }
                    a.F(this.zzs, "Loaded invalid blob type value, ignoring it");
                    return null;
                }
                return cursor.getString(i2);
            }
            return Double.valueOf(cursor.getDouble(i2));
        } else {
            return Long.valueOf(cursor.getLong(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzr() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.zzh()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3e
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            com.google.android.gms.measurement.internal.zzfv r3 = r6.zzs     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.zzel r3 = r3.zzay()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.zzej r3 = r3.zzd()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zzb(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaj.zzr():java.lang.String");
    }

    public final List<zzab> zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzY();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(Marker.ANY_MARKER));
            sb.append(" and name glob ?");
        }
        return zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
        r2 = r27.zzs.zzay().zzd();
        r27.zzs.zzf();
        r2.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzab> zzt(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaj.zzt(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List<zzkx> zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzY();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.zzs.zzf();
                cursor = zzh().query("user_attributes", new String[]{"name", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j2 = cursor.getLong(2);
                    Object zzq = zzq(cursor, 3);
                    if (zzq == null) {
                        this.zzs.zzay().zzd().zzb("Read invalid user property value, ignoring it. appId", zzel.zzn(str));
                    } else {
                        arrayList.add(new zzkx(str, str2, string, j2, zzq));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e2) {
                this.zzs.zzay().zzd().zzc("Error querying user properties. appId", zzel.zzn(str), e2);
                List<zzkx> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
        r2 = r16.zzs.zzay().zzd();
        r16.zzs.zzf();
        r2.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzkx> zzv(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaj.zzv(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void zzw() {
        zzY();
        zzh().beginTransaction();
    }

    public final void zzx(List<Long> list) {
        Preconditions.checkNotNull(list);
        zzg();
        zzY();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(list.get(i2).longValue());
        }
        sb.append(")");
        int delete = zzh().delete("raw_events", sb.toString(), null);
        if (delete != list.size()) {
            this.zzs.zzay().zzd().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    public final void zzy() {
        zzY();
        zzh().endTransaction();
    }

    @VisibleForTesting
    public final void zzz(List<Long> list) {
        zzg();
        zzY();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzK()) {
            String join = TextUtils.join(",", list);
            String s = a.s(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (zzab(a.s(new StringBuilder(s.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", s, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                a.H(this.zzs, "The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase zzh2 = zzh();
                StringBuilder sb = new StringBuilder(s.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(s);
                sb.append(" AND (retry_count IS NULL OR retry_count < ");
                sb.append(Integer.MAX_VALUE);
                sb.append(")");
                zzh2.execSQL(sb.toString());
            } catch (SQLiteException e2) {
                this.zzs.zzay().zzd().zzb("Error incrementing retry count. error", e2);
            }
        }
    }
}
