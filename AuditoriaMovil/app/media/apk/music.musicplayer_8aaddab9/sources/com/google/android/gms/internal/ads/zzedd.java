package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class zzedd {
    public static ArrayList<zzbbi> zza(SQLiteDatabase sQLiteDatabase) {
        ArrayList<zzbbi> arrayList = new ArrayList<>();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(zzbbi.zzi(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzggm e2) {
                zzcgt.zzf("Unable to deserialize proto from offline signals database:");
                zzcgt.zzf(e2.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    public static int zzb(SQLiteDatabase sQLiteDatabase, int i2) {
        int i3;
        Cursor zzd = zzd(sQLiteDatabase, i2);
        if (zzd.getCount() > 0) {
            zzd.moveToNext();
            i3 = zzd.getInt(zzd.getColumnIndexOrThrow("value"));
        } else {
            i3 = 0;
        }
        zzd.close();
        return i3;
    }

    public static long zzc(SQLiteDatabase sQLiteDatabase, int i2) {
        long j2;
        Cursor zzd = zzd(sQLiteDatabase, 2);
        if (zzd.getCount() > 0) {
            zzd.moveToNext();
            j2 = zzd.getLong(zzd.getColumnIndexOrThrow("value"));
        } else {
            j2 = 0;
        }
        zzd.close();
        return j2;
    }

    private static Cursor zzd(SQLiteDatabase sQLiteDatabase, int i2) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i2 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i2 != 1) {
            strArr2[0] = "last_successful_request_time";
        } else {
            strArr2[0] = "total_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }
}
