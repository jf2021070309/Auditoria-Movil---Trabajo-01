package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzee extends zzf {
    private final zzed zza;
    private boolean zzb;

    public zzee(zzfv zzfvVar) {
        super(zzfvVar);
        Context zzau = this.zzs.zzau();
        this.zzs.zzf();
        this.zza = new zzed(this, zzau, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzq(int r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzee.zzq(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    public final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase == null) {
            this.zzb = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x024a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zzi(int r23) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzee.zzi(int):java.util.List");
    }

    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzh = zzh();
            if (zzh == null || (delete = zzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzs.zzay().zzj().zzb("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e2) {
            this.zzs.zzay().zzd().zzb("Error resetting local analytics data. error", e2);
        }
    }

    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    public final boolean zzl() {
        Context zzau = this.zzs.zzau();
        this.zzs.zzf();
        return zzau.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean zzm() {
        int i2;
        zzg();
        if (!this.zzb && zzl()) {
            int i3 = 5;
            while (i2 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase zzh = zzh();
                        if (zzh == null) {
                            this.zzb = true;
                            return false;
                        }
                        zzh.beginTransaction();
                        zzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        zzh.setTransactionSuccessful();
                        zzh.endTransaction();
                        zzh.close();
                        return true;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i3);
                        i3 += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e2) {
                    this.zzs.zzay().zzd().zzb("Error deleting app launch break from local database", e2);
                    this.zzb = true;
                    i2 = 0 == 0 ? i2 + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteException e3) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    this.zzs.zzay().zzd().zzb("Error deleting app launch break from local database", e3);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            a.H(this.zzs, "Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzab zzabVar) {
        byte[] zzan = this.zzs.zzv().zzan(zzabVar);
        if (zzan.length > 131072) {
            this.zzs.zzay().zzh().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zzq(2, zzan);
    }

    public final boolean zzo(zzat zzatVar) {
        Parcel obtain = Parcel.obtain();
        zzau.zza(zzatVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzs.zzay().zzh().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zzq(0, marshall);
    }

    public final boolean zzp(zzkv zzkvVar) {
        Parcel obtain = Parcel.obtain();
        zzkw.zza(zzkvVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzs.zzay().zzh().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zzq(1, marshall);
    }
}
