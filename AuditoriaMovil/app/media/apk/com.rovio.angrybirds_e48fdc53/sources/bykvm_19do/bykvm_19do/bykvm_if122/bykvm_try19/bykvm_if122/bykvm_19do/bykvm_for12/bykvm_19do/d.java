package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_for12.bykvm_19do;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public class d {
    private Context a;

    private Context b() {
        Context context = this.a;
        return context == null ? bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.c.a() : context;
    }

    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        a(uri, contentValues);
        return 0;
    }

    public int a(Uri uri, String str, String[] strArr) {
        String[] split = uri.getPath().split("/");
        if (split[2].equals("clean")) {
            c.a(b(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = split[3];
        if (c.a(b(), uri.getQueryParameter("sp_file_name"), str2)) {
            c.b(b(), uri.getQueryParameter("sp_file_name"), str2);
            return 0;
        }
        return 0;
    }

    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Map<String, ?> b;
        if (!uri.getPath().split("/")[2].equals("get_all") || (b = c.b(b(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : b.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            objArr[2] = b.get(str3);
            if (objArr[2] instanceof Boolean) {
                objArr[1] = "boolean";
            } else if (objArr[2] instanceof String) {
                objArr[1] = "string";
            } else if (objArr[2] instanceof Integer) {
                objArr[1] = "int";
            } else if (objArr[2] instanceof Long) {
                objArr[1] = "long";
            } else if (objArr[2] instanceof Float) {
                objArr[1] = "float";
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    public Uri a(Uri uri, ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String[] split = uri.getPath().split("/");
        String str = split[2];
        String str2 = split[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            c.a(b(), uri.getQueryParameter("sp_file_name"), str2, obj);
            return null;
        }
        return null;
    }

    public String a() {
        return "t_sp";
    }

    public String a(Uri uri) {
        String[] split = uri.getPath().split("/");
        String str = split[2];
        String str2 = split[3];
        if (str.equals("contain")) {
            return c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.c.a(), uri.getQueryParameter("sp_file_name"), str2) + "";
        }
        return "" + c.a(b(), uri.getQueryParameter("sp_file_name"), str2, str);
    }
}
