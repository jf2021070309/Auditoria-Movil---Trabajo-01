package org.repackage.com.vivo.identifier;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
/* loaded from: classes3.dex */
public class DataBaseOperation {
    private static final String a = "VMS_IDLG_SDK_DB";
    private static final String b = "content://com.vivo.vms.IdProvider/IdentifierId";
    private static final String c = "value";
    private static final String d = "OAID";
    private static final String e = "AAID";
    private static final String f = "VAID";
    private static final String g = "OAIDSTATUS";
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;
    private static final int k = 4;
    private Context l;

    public DataBaseOperation(Context context) {
        this.l = context;
    }

    public String a(int i2, String str) {
        Uri parse;
        String str2 = null;
        if (i2 == 0) {
            parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        } else if (i2 == 1) {
            parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str);
        } else if (i2 == 2) {
            parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str);
        } else if (i2 != 4) {
            parse = null;
        } else {
            parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
        }
        Cursor query = this.l.getContentResolver().query(parse, null, null, null, null);
        if (query != null) {
            if (query.moveToNext()) {
                str2 = query.getString(query.getColumnIndex(c));
            }
            query.close();
        } else {
            Log.d(a, "return cursor is null,return");
        }
        return str2;
    }
}
