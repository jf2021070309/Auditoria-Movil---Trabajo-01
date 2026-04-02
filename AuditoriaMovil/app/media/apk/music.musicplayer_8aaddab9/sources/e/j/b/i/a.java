package e.j.b.i;

import android.text.TextUtils;
/* loaded from: classes2.dex */
public class a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8513b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8514c;

    /* renamed from: d  reason: collision with root package name */
    public int f8515d;

    /* renamed from: e  reason: collision with root package name */
    public long f8516e;

    public a(String str, String str2, int i2) {
        this.a = str;
        this.f8513b = str2;
        this.f8514c = i2;
    }

    public static String a(String str, String str2) {
        return e.a.d.a.a.k(!TextUtils.isEmpty(str) ? e.a.d.a.a.k(str, ".") : null, str2);
    }

    public void b(int i2) {
        this.f8516e = System.currentTimeMillis();
        this.f8515d = i2;
    }
}
