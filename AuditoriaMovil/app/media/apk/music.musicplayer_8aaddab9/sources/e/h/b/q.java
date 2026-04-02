package e.h.b;

import android.content.ContentValues;
/* loaded from: classes2.dex */
public class q {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public long f8084b;

    /* renamed from: c  reason: collision with root package name */
    public long f8085c;

    /* renamed from: d  reason: collision with root package name */
    public String f8086d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f8087e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f8088f = "";

    /* renamed from: g  reason: collision with root package name */
    public String f8089g = "";

    public ContentValues a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_name", this.f8088f);
        contentValues.put("_artist", this.f8087e);
        contentValues.put("_album", this.f8086d);
        contentValues.put("_duration", Integer.valueOf(this.a));
        contentValues.put("_path", this.f8089g);
        contentValues.put(n.f8065c, Long.valueOf(this.f8084b));
        return contentValues;
    }

    public String b() {
        String str = this.f8089g;
        if (str != null && str.length() > 0) {
            try {
                String str2 = this.f8089g;
                return str2.substring(str2.lastIndexOf("/") + 1);
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public void c(String str) {
        if (str == null) {
            str = "";
        }
        this.f8086d = str;
    }

    public void d(String str) {
        if (str == null) {
            str = "";
        }
        this.f8087e = str;
    }

    public void e(String str) {
        if (str == null) {
            str = "";
        }
        this.f8088f = str;
    }

    public void f(String str) {
        if (str == null) {
            str = "";
        }
        this.f8089g = str;
    }
}
