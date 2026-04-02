package com.kwad.sdk.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
/* loaded from: classes3.dex */
public final class ae {
    private static String aIV;
    private static boolean aIW;

    public static String cj(Context context) {
        if (TextUtils.isEmpty(aIV) && !aIW && as.IQ()) {
            Cursor cursor = null;
            try {
                cursor = context.getContentResolver().query(Uri.parse("content://com.xiaomi.market.provider.DirectMailProvider"), null, null, null, null);
                aIV = k(cursor);
            } catch (Throwable th) {
            }
            com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
            aIW = TextUtils.isEmpty(aIV);
            return aIV;
        }
        return aIV;
    }

    private static String k(Cursor cursor) {
        int columnIndex;
        if (cursor == null || cursor.isClosed()) {
            com.kwad.sdk.core.e.c.i("MiMarketHelper", "cursor is null");
            return "";
        }
        cursor.moveToFirst();
        int columnIndex2 = cursor.getColumnIndex("support");
        return ((columnIndex2 <= 0 || cursor.getInt(columnIndex2) != 0) && (columnIndex = cursor.getColumnIndex("detailStyle")) > 0) ? cursor.getString(columnIndex) : "";
    }
}
