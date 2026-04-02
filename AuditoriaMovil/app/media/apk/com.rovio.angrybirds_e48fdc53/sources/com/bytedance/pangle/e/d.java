package com.bytedance.pangle.e;

import android.os.Build;
import com.bytedance.pangle.e.f;
import com.bytedance.pangle.log.ZeusLogger;
import java.io.File;
/* loaded from: classes.dex */
public final class d implements f.a {
    @Override // com.bytedance.pangle.e.f.a
    public final boolean a(String str, int i) {
        String b = com.bytedance.pangle.d.c.b(str, i);
        ZeusLogger.d(ZeusLogger.TAG_INSTALL, "full DexOpt:".concat(String.valueOf(b)));
        String c = com.bytedance.pangle.d.c.c(str, i);
        String str2 = c + File.separator + "compFully" + b.b(b);
        String str3 = c + File.separator + b.a(b);
        if (a(b, str2)) {
            File file = new File(str2);
            if (file.exists()) {
                file.renameTo(new File(str3));
            }
            String str4 = Build.VERSION.SDK_INT >= 26 ? ".odex" : ".dex";
            File file2 = new File(str2.replace(str4, ".vdex"));
            if (file2.exists()) {
                file2.renameTo(new File(str3.replace(str4, ".vdex")));
            }
            boolean a = b.a(str3);
            ZeusLogger.i(ZeusLogger.TAG_INSTALL, "full DexOpt result:".concat(String.valueOf(a)));
            return a;
        }
        return false;
    }

    private static boolean a(String str, String str2) {
        try {
            return a.a(b.a(str, str2, b.b));
        } catch (Exception e) {
            return false;
        }
    }
}
