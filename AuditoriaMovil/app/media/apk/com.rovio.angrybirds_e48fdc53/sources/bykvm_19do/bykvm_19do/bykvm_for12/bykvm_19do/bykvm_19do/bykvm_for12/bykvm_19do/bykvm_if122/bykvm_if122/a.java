package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_if122;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.f;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.g;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.j;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a {
    public static void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar) {
        if (aVar == null) {
            return;
        }
        try {
            ContentResolver b = b();
            if (b != null) {
                String b2 = f.b(aVar.h());
                b.getType(Uri.parse(c() + "adLogDispatch?event=" + b2));
                c.a("dispatch event getType end ");
            }
        } catch (Throwable th) {
            c.b("dispatch event Throwable:" + th.toString());
        }
    }

    private static ContentResolver b() {
        try {
            if (j.m().d() != null) {
                return j.m().d().getContentResolver();
            }
        } catch (Throwable th) {
        }
        return null;
    }

    private static String c() {
        return g.b + "/ad_log_event/";
    }

    public static void d() {
        c.a("start()");
        if (j.m().d() == null) {
            return;
        }
        try {
            ContentResolver b = b();
            if (b != null) {
                b.getType(Uri.parse(c() + "adLogStart"));
            }
        } catch (Throwable th) {
        }
    }

    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public int a(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri a(Uri uri, ContentValues contentValues) {
        return null;
    }

    public String a() {
        return "ad_log_event";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public String a(Uri uri) {
        char c;
        c.a("gettype()");
        String str = uri.getPath().split("/")[2];
        switch (str.hashCode()) {
            case -482705237:
                if (str.equals("trackAdFailed")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -171493183:
                if (str.equals("adLogStart")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 964299715:
                if (str.equals("adLogStop")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1025736635:
                if (str.equals("adLogDispatch")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1131732929:
                if (str.equals("trackAdUrl")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            c.a("EventProviderImpl====ad event function will be start====");
            j.m().k();
            return null;
        } else if (c == 1) {
            c.a("EventProviderImpl", "====ad event function will be stop====");
            j.m().l();
            return null;
        } else if (c == 2) {
            c.a("EventProviderImpl", "dispatch FUN_AD_EVENT_DISPATCH");
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a c2 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_19do.a.c(f.a(uri.getQueryParameter("event")));
            if (c2 != null) {
                j.m().a(c2);
                return null;
            }
            return null;
        } else if (c != 3) {
            if (c != 4) {
                return null;
            }
            j.m().a(uri.getQueryParameter("did"));
            return null;
        } else {
            try {
                String queryParameter = uri.getQueryParameter("did");
                boolean booleanValue = Boolean.valueOf(uri.getQueryParameter("replace")).booleanValue();
                String[] split = f.a(uri.getQueryParameter("track")).split(",");
                if (split.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : split) {
                        String a = f.a(str2);
                        if (!TextUtils.isEmpty(a)) {
                            arrayList.add(a);
                        }
                    }
                    j.m().a(queryParameter, arrayList, booleanValue);
                    return null;
                }
                return null;
            } catch (Throwable th) {
                return null;
            }
        }
    }
}
