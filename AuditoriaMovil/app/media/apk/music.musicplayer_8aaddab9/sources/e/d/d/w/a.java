package e.d.d.w;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class a {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    @TargetApi(26)
    public static boolean a(Resources resources, int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (resources.getDrawable(i2, null) instanceof AdaptiveIconDrawable) {
                StringBuilder sb = new StringBuilder(77);
                sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
                sb.append(i2);
                Log.e("FirebaseMessaging", sb.toString());
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i2);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }
}
