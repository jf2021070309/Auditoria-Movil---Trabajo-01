package c.i.c;

import android.app.Activity;
import android.content.pm.PackageManager;
import c.i.c.c;
/* loaded from: classes.dex */
public class a implements Runnable {
    public final /* synthetic */ String[] a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f1942b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1943c;

    public a(String[] strArr, Activity activity, int i2) {
        this.a = strArr;
        this.f1942b = activity;
        this.f1943c = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[this.a.length];
        PackageManager packageManager = this.f1942b.getPackageManager();
        String packageName = this.f1942b.getPackageName();
        int length = this.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = packageManager.checkPermission(this.a[i2], packageName);
        }
        ((c.a) this.f1942b).onRequestPermissionsResult(this.f1943c, this.a, iArr);
    }
}
