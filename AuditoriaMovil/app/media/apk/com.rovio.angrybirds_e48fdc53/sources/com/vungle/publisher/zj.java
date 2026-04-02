package com.vungle.publisher;

import android.content.Context;
import android.os.Build;
import com.vungle.publisher.log.Logger;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public class zj {
    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT >= 19 || context.checkCallingOrSelfPermission(com.kuaishou.weapon.p0.g.j) == 0;
    }

    public static boolean b(Context context) {
        return d(context).length == 0;
    }

    public static boolean c(Context context) {
        return context.checkCallingOrSelfPermission(com.kuaishou.weapon.p0.g.g) == 0 || context.checkCallingOrSelfPermission(com.kuaishou.weapon.p0.g.h) == 0;
    }

    public static String[] d(Context context) {
        ArrayList arrayList = new ArrayList();
        if (context.checkCallingOrSelfPermission(com.kuaishou.weapon.p0.g.a) != 0) {
            arrayList.add(com.kuaishou.weapon.p0.g.a);
        }
        if (context.checkCallingOrSelfPermission(com.kuaishou.weapon.p0.g.b) != 0) {
            arrayList.add(com.kuaishou.weapon.p0.g.b);
        }
        if (!a(context)) {
            arrayList.add(com.kuaishou.weapon.p0.g.j);
        }
        if (arrayList.size() > 0) {
            Logger.e(Logger.VUNGLE_TAG, "Make sure to add <uses-permission> for \"" + zk.a(", ", arrayList) + "\" in your AndroidManifest.xml? AND request if revoked in the runtime, which might be possible on Android Marshmallow (API 23) and above.");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
