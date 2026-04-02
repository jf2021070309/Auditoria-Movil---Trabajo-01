package e.d.b.e.a.a;

import android.content.Context;
import android.content.pm.PackageManager;
/* loaded from: classes2.dex */
public final class a2 {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("PackageStateCache");

    /* renamed from: b  reason: collision with root package name */
    public final Context f6733b;

    /* renamed from: c  reason: collision with root package name */
    public int f6734c = -1;

    public a2(Context context) {
        this.f6733b = context;
    }

    public final synchronized int a() {
        if (this.f6734c == -1) {
            try {
                this.f6734c = this.f6733b.getPackageManager().getPackageInfo(this.f6733b.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                a.a(6, "The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f6734c;
    }
}
