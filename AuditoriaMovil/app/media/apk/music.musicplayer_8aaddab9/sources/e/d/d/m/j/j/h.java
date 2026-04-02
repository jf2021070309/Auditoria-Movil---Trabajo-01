package e.d.d.m.j.j;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
/* loaded from: classes.dex */
public class h {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7165b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7166c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7167d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7168e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7169f;

    /* renamed from: g  reason: collision with root package name */
    public final e.d.d.m.j.e f7170g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, e.d.d.m.j.e eVar) {
        this.a = str;
        this.f7165b = str2;
        this.f7166c = str3;
        this.f7167d = str4;
        this.f7168e = str5;
        this.f7169f = str6;
        this.f7170g = eVar;
    }

    public static h a(Context context, i0 i0Var, String str, String str2, e.d.d.m.j.e eVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String d2 = i0Var.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new h(str, str2, d2, packageName, num, str3, eVar);
    }
}
