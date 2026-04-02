package com.kwad.sdk.utils;

import android.content.Context;
import android.os.Build;
import android.os.Process;
/* loaded from: classes3.dex */
public final class AbiUtil {
    private static Abi aHP;

    /* loaded from: classes3.dex */
    public enum Abi {
        UNKNOWN,
        ARMEABI_V7A,
        ARM64_V8A
    }

    public static String bF(Context context) {
        return isArm64(context) ? "arm64-v8a" : "armeabi-v7a";
    }

    private static Abi bG(Context context) {
        Abi abi;
        Abi abi2 = aHP;
        if (abi2 != null) {
            return abi2;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (Build.VERSION.SDK_INT < 23) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        aHP = ((Boolean) s.f(s.a("dalvik.system.VMRuntime", "getRuntime", new Object[0]), "is64Bit", new Object[0])).booleanValue() ? Abi.ARM64_V8A : Abi.ARMEABI_V7A;
                    } catch (Throwable th) {
                        th.printStackTrace();
                        try {
                            aHP = context.getApplicationInfo().nativeLibraryDir.contains("arm64") ? Abi.ARM64_V8A : Abi.UNKNOWN;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            abi = Abi.UNKNOWN;
                        }
                    }
                }
                return aHP;
            } else if (Process.is64Bit()) {
                abi = Abi.ARM64_V8A;
            }
            aHP = abi;
            return aHP;
        }
        abi = Abi.ARMEABI_V7A;
        aHP = abi;
        return aHP;
    }

    public static boolean isArm64(Context context) {
        return bG(context) == Abi.ARM64_V8A;
    }
}
