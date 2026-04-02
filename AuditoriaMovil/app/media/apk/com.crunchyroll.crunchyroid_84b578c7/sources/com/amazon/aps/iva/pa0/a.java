package com.amazon.aps.iva.pa0;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.amazon.aps.iva.b30.j;
/* compiled from: SLDigitalTurbineReferrer.java */
/* loaded from: classes4.dex */
public final class a {
    public static final /* synthetic */ int a = 0;

    static {
        new j(a.class.getSimpleName());
    }

    public static String a(Context context, String str, ContentProviderClient contentProviderClient) {
        Cursor query;
        try {
            Uri parse = Uri.parse(str);
            String[] strArr = {"encrypted_data"};
            String[] strArr2 = {context.getPackageName()};
            if (contentProviderClient != null) {
                query = contentProviderClient.query(parse, strArr, "package_name=?", strArr2, null);
            } else {
                query = context.getContentResolver().query(parse, strArr, null, null, null);
            }
            if (query == null) {
                return null;
            }
            if (!query.moveToFirst()) {
                query.close();
                return null;
            }
            String string = query.getString(0);
            query.close();
            return string;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }
}
