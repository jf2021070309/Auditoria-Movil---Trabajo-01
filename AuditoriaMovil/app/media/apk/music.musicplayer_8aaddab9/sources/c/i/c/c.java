package c.i.c;

import android.app.Activity;
import android.os.Build;
/* loaded from: classes.dex */
public class c extends c.i.d.a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f1944c = 0;

    /* loaded from: classes.dex */
    public interface a {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface b {
        void validateRequestPermissionsRequestCode(int i2);
    }

    public static boolean d(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
