package com.bytedance.pangle.e;

import com.bytedance.pangle.e.f;
import com.bytedance.pangle.log.ZeusLogger;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public final class c implements f.a {
    @Override // com.bytedance.pangle.e.f.a
    public final boolean a(String str, int i) {
        String str2;
        String a = g.a(str, i);
        String c = com.bytedance.pangle.d.c.c(str, i);
        String[] split = a.split(":");
        ZeusLogger.i(ZeusLogger.TAG_INSTALL, "full DexOpt start:".concat(String.valueOf(a)));
        long currentTimeMillis = System.currentTimeMillis();
        int length = split.length;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            if (i2 >= length) {
                z = z2;
                break;
            }
            if (!a(split[i2], c + File.separator + b.a(str2))) {
                break;
            }
            ZeusLogger.i(ZeusLogger.TAG_INSTALL, "full DexOpt result:true");
            i2++;
            z2 = true;
        }
        ZeusLogger.d(ZeusLogger.TAG_LOAD, "compile cost:" + (System.currentTimeMillis() - currentTimeMillis) + " result:" + z);
        return z;
    }

    private static boolean a(String str, String str2) {
        try {
            DexFile.loadDex(str, str2, 0);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
