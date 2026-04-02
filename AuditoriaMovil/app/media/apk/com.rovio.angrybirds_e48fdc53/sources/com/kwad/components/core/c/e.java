package com.kwad.components.core.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class e implements h {
    private static volatile e IJ;
    private String IK;
    private int IL = 0;
    private int IM = 1;
    private long IN = 1800;
    private boolean IO = false;

    private e() {
    }

    private e(long j) {
        this.IK = String.valueOf(j);
    }

    public static e L(AdTemplate adTemplate) {
        if (adTemplate == null) {
            return null;
        }
        long j = adTemplate.posId;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        e eVar = new e(j);
        eVar.IL = ck.adBaseInfo.adCacheStrategy;
        eVar.IN = ck.adBaseInfo.adCacheSecond;
        eVar.IM = ck.adBaseInfo.adCacheSize;
        eVar.IO = ck.adBaseInfo.adCacheSwitch == 1;
        return eVar;
    }

    public static synchronized List<e> a(Cursor cursor) {
        synchronized (e.class) {
            if (cursor == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                try {
                    arrayList.add(b(cursor));
                } catch (Exception e) {
                    com.kwad.sdk.core.e.c.printStackTrace(e);
                }
            }
            return arrayList;
        }
    }

    private static synchronized e b(Cursor cursor) {
        e eVar;
        synchronized (e.class) {
            String string = cursor.getString(cursor.getColumnIndex("posId"));
            int i = cursor.getInt(cursor.getColumnIndex("strategyCode"));
            int i2 = cursor.getInt(cursor.getColumnIndex("cacheSize"));
            long j = cursor.getLong(cursor.getColumnIndex("cacheSecond"));
            boolean z = true;
            if (cursor.getInt(cursor.getColumnIndex("enable")) != 1) {
                z = false;
            }
            eVar = new e();
            eVar.IK = string;
            eVar.IL = i;
            eVar.IM = i2;
            eVar.IN = j;
            eVar.IO = z;
        }
        return eVar;
    }

    private static e mt() {
        if (IJ == null) {
            synchronized (e.class) {
                if (IJ == null) {
                    IJ = new e();
                }
            }
        }
        return IJ;
    }

    public static e p(long j) {
        e ag;
        return (a.mk() == null || (ag = a.mk().ag(String.valueOf(j))) == null) ? mt() : ag;
    }

    public final boolean isDefault() {
        return equals(mt());
    }

    public final boolean isEnable() {
        return this.IO;
    }

    public final int mu() {
        return this.IL;
    }

    public final int mv() {
        return this.IM;
    }

    public final long mw() {
        return this.IN;
    }

    @Override // com.kwad.components.core.c.h
    public final ContentValues mx() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("posId", this.IK);
        contentValues.put("strategyCode", Integer.valueOf(this.IL));
        contentValues.put("cacheSize", Integer.valueOf(this.IM));
        contentValues.put("cacheSecond", Long.valueOf(this.IN));
        contentValues.put("enable", Integer.valueOf(this.IO ? 1 : 0));
        return contentValues;
    }
}
