package com.umeng.analytics.pro;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
/* compiled from: NubiaDeviceIdSupplier.java */
/* loaded from: classes3.dex */
class ba implements at {
    private static final String a = "content://cn.nubia.provider.deviceid.dataid/oaid";

    @Override // com.umeng.analytics.pro.at
    public String a(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        Cursor query = context.getContentResolver().query(Uri.parse(a), null, null, null, null);
        if (query != null) {
            if (query.moveToNext()) {
                str = query.getString(query.getColumnIndex("device_ids_grndid"));
            }
            query.close();
        }
        return str;
    }
}
