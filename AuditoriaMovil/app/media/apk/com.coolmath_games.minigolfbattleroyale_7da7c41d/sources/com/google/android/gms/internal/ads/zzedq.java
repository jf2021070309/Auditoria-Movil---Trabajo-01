package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzedq extends SQLiteOpenHelper {
    private final Context zza;
    private final zzfsn zzb;

    public zzedq(Context context, zzfsn zzfsnVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) zzbet.zzc().zzc(zzbjl.zzfZ)).intValue());
        this.zza = context;
        this.zzb = zzfsnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzg(SQLiteDatabase sQLiteDatabase, String str, zzcgy zzcgyVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzcgyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Void zzh(zzcgy zzcgyVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, zzcgyVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, zzcgy zzcgyVar) {
        sQLiteDatabase.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("event_state = ");
            sb.append(1);
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, sb.toString(), null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                zzcgyVar.zza(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzfdw<SQLiteDatabase, Void> zzfdwVar) {
        zzfsd.zzp(this.zzb.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzedj
            private final zzedq zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.getWritableDatabase();
            }
        }), new zzedp(this, zzfdwVar), this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(final SQLiteDatabase sQLiteDatabase, final zzcgy zzcgyVar, final String str) {
        this.zzb.execute(new Runnable(sQLiteDatabase, str, zzcgyVar) { // from class: com.google.android.gms.internal.ads.zzedl
            private final SQLiteDatabase zza;
            private final String zzb;
            private final zzcgy zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = sQLiteDatabase;
                this.zzb = str;
                this.zzc = zzcgyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzedq.zzg(this.zza, this.zzb, this.zzc);
            }
        });
    }

    public final void zzc(final zzcgy zzcgyVar, final String str) {
        zza(new zzfdw(this, zzcgyVar, str) { // from class: com.google.android.gms.internal.ads.zzedm
            private final zzedq zza;
            private final zzcgy zzb;
            private final String zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzcgyVar;
                this.zzc = str;
            }

            @Override // com.google.android.gms.internal.ads.zzfdw
            public final Object zza(Object obj) {
                this.zza.zzb((SQLiteDatabase) obj, this.zzb, this.zzc);
                return null;
            }
        });
    }

    public final void zzd(final String str) {
        zza(new zzfdw(this, str) { // from class: com.google.android.gms.internal.ads.zzedn
            private final zzedq zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // com.google.android.gms.internal.ads.zzfdw
            public final Object zza(Object obj) {
                zzedq.zzi((SQLiteDatabase) obj, this.zzb);
                return null;
            }
        });
    }

    public final void zze(final zzeds zzedsVar) {
        zza(new zzfdw(this, zzedsVar) { // from class: com.google.android.gms.internal.ads.zzedo
            private final zzedq zza;
            private final zzeds zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzedsVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfdw
            public final Object zza(Object obj) {
                this.zza.zzf(this.zzb, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zzf(zzeds zzedsVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP, Long.valueOf(zzedsVar.zza));
        contentValues.put("gws_query_id", zzedsVar.zzb);
        contentValues.put("url", zzedsVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzedsVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzbu zzD = com.google.android.gms.ads.internal.util.zzs.zzD(this.zza);
        if (zzD != null) {
            try {
                zzD.zzf(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }
}
