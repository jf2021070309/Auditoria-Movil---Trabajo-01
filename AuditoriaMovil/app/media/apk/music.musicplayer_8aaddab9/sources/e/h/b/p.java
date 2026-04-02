package e.h.b;

import android.content.ContentValues;
/* loaded from: classes2.dex */
public class p {
    public long a;

    /* renamed from: b  reason: collision with root package name */
    public int f8079b;

    /* renamed from: c  reason: collision with root package name */
    public long f8080c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f8081d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f8082e = 0;

    /* renamed from: f  reason: collision with root package name */
    public String f8083f = "";

    public ContentValues a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_pName", this.f8083f);
        contentValues.put("_pMDID", Long.valueOf(this.f8080c));
        contentValues.put("_pDM", Long.valueOf(System.currentTimeMillis() / 1000));
        contentValues.put("_pStatus", Integer.valueOf(this.f8082e));
        return contentValues;
    }

    public void b(String str) {
        if (str == null) {
            str = "";
        }
        this.f8083f = str.trim();
    }
}
