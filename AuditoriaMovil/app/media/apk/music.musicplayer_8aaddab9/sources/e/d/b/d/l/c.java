package e.d.b.d.l;

import android.os.Build;
/* loaded from: classes2.dex */
public class c {
    public static final int a;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            a = 2;
        } else {
            a = 1;
        }
    }
}
