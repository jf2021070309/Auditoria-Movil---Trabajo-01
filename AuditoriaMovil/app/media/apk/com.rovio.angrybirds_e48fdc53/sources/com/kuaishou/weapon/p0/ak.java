package com.kuaishou.weapon.p0;

import android.content.Context;
import java.io.File;
/* loaded from: classes.dex */
public class ak {
    public static boolean a(Context context) {
        if (g.a(context, new String[]{g.i})) {
            String[] strArr = {"/storage/emulated/0/DCIM/Camera/virtual.mp4", "/storage/emulated/0/DCIM/Camera1/virtual.mp4"};
            for (int i = 0; i < 2; i++) {
                if (new File(strArr[i]).exists()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
