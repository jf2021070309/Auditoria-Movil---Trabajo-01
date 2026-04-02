package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzeg extends zzf {
    private final zzef zza;
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeg(zzfu zzfuVar) {
        super(zzfuVar);
        Context zzax = this.zzs.zzax();
        this.zzs.zzc();
        this.zza = new zzef(this, zzax, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzq(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeg.zzq(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zze() {
        return false;
    }

    public final void zzh() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzo = zzo();
            if (zzo == null || (delete = zzo.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzs.zzau().zzk().zzb("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            this.zzs.zzau().zzb().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzi(zzas zzasVar) {
        Parcel obtain = Parcel.obtain();
        zzat.zza(zzasVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzs.zzau().zzc().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zzq(0, marshall);
    }

    public final boolean zzj(zzkq zzkqVar) {
        Parcel obtain = Parcel.obtain();
        zzkr.zza(zzkqVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzs.zzau().zzc().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zzq(1, marshall);
    }

    public final boolean zzk(zzaa zzaaVar) {
        byte[] zzX = this.zzs.zzl().zzX(zzaaVar);
        if (zzX.length > 131072) {
            this.zzs.zzau().zzc().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zzq(2, zzX);
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0252 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zzl(int r23) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeg.zzl(int):java.util.List");
    }

    public final boolean zzm() {
        return zzq(3, new byte[0]);
    }

    public final boolean zzn() {
        int i;
        zzg();
        if (!this.zzb && zzp()) {
            int i2 = 5;
            for (i = 0; i < 5; i = i + 1) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase zzo = zzo();
                    if (zzo == null) {
                        this.zzb = true;
                        return false;
                    }
                    zzo.beginTransaction();
                    zzo.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    zzo.setTransactionSuccessful();
                    zzo.endTransaction();
                    zzo.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    i = 0 == 0 ? i + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e) {
                    this.zzs.zzau().zzb().zzb("Error deleting app launch break from local database", e);
                    this.zzb = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e2) {
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
                    this.zzs.zzau().zzb().zzb("Error deleting app launch break from local database", e2);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.zzs.zzau().zze().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    final SQLiteDatabase zzo() throws SQLiteException {
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

    final boolean zzp() {
        Context zzax = this.zzs.zzax();
        this.zzs.zzc();
        return zzax.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
