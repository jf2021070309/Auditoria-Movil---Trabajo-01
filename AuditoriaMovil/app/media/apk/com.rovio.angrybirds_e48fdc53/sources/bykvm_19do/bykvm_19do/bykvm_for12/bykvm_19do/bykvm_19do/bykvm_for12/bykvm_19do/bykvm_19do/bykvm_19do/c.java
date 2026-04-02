package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class c {
    public static int a(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        int a;
        synchronized (c.class) {
            if (contentValues != null) {
                if (!TextUtils.isEmpty(str)) {
                    a = a.a(context).a().a(str, contentValues, str2, strArr);
                }
            }
            a = 0;
        }
        return a;
    }

    public static int a(Context context, String str, String str2, String[] strArr) {
        int i;
        synchronized (c.class) {
            if (TextUtils.isEmpty(str)) {
                i = 0;
            } else {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("DBMultiUtils  delete start");
                i = a.a(context).a().a(str, str2, strArr);
            }
        }
        return i;
    }

    public static Cursor a(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Cursor a;
        synchronized (c.class) {
            a = TextUtils.isEmpty(str) ? null : a.a(context).a().a(str, strArr, str2, strArr2, null, null, str5);
        }
        return a;
    }

    public static void a(Context context, String str) {
        synchronized (c.class) {
            if (!TextUtils.isEmpty(str)) {
                a.a(context).a().a(Uri.decode(str));
            }
        }
    }

    public static void a(Context context, String str, ContentValues contentValues) {
        synchronized (c.class) {
            if (contentValues != null) {
                if (!TextUtils.isEmpty(str)) {
                    a.a(context).a().a(str, (String) null, contentValues);
                }
            }
        }
    }
}
