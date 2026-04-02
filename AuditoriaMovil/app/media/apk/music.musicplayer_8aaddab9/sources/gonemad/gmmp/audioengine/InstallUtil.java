package gonemad.gmmp.audioengine;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.google.android.gms.common.api.CommonStatusCodes;
import e.h.g.s1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
/* loaded from: classes2.dex */
public class InstallUtil {
    public static boolean sUseNativeLibPath;

    private static void copyLibrary(Context context, byte[] bArr, AssetManager assetManager, String str, String str2) {
        s1.h("Installing " + str2);
        try {
            InputStream open = str != null ? assetManager.open(String.format("%s/%s", str, str2)) : assetManager.open(str2);
            FileOutputStream openFileOutput = context.openFileOutput(str2, 0);
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    openFileOutput.flush();
                    open.close();
                    openFileOutput.close();
                    return;
                }
                openFileOutput.write(bArr, 0, read);
            }
        } catch (IOException e2) {
            s1.l(e2, true);
        }
    }

    @SuppressLint({"NewApi"})
    public static void installNativeLibs(Context context) {
        boolean z;
        int i2;
        String[] strArr;
        try {
            if (sUseNativeLibPath) {
                removeLibrary(context, "libavutil_gm.so");
                removeLibrary(context, "libavformat_gm.so");
                removeLibrary(context, "libavcodec_gm.so");
                removeLibrary(context, "libswresample_gm.so");
                removeLibrary(context, "libgm_audioengine.so");
                return;
            }
            AssetManager assets = context.getAssets();
            byte[] bArr = new byte[65536];
            int i3 = 0;
            if (Build.VERSION.SDK_INT >= 21) {
                String[] strArr2 = Build.SUPPORTED_ABIS;
                int length = strArr2.length;
                z = false;
                i2 = 0;
                while (i3 < length) {
                    String str = strArr2[i3];
                    if ("x86".equals(str)) {
                        strArr = strArr2;
                        z = true;
                    } else if ("armeabi-v7a".equals(str)) {
                        strArr = strArr2;
                        i2 = 1;
                    } else {
                        strArr = strArr2;
                        "arm64-v8a".equals(str);
                    }
                    i3++;
                    strArr2 = strArr;
                }
            } else {
                String str2 = Build.CPU_ABI;
                if (!"x86".equals(str2.toLowerCase()) && !"x86".equals(Build.CPU_ABI2.toLowerCase())) {
                    z = false;
                    i2 = (!"armeabi-v7a".equals(str2.toLowerCase()) || "armeabi-v7a".equals(Build.CPU_ABI2.toLowerCase())) ? 1 : 1;
                }
                z = true;
                i2 = (!"armeabi-v7a".equals(str2.toLowerCase()) || "armeabi-v7a".equals(Build.CPU_ABI2.toLowerCase())) ? 1 : 1;
            }
            if (z && assets.list("x86").length > 0) {
                copyLibrary(context, bArr, assets, "x86", "libavutil_gm.so");
                copyLibrary(context, bArr, assets, "x86", "libavformat_gm.so");
                copyLibrary(context, bArr, assets, "x86", "libavcodec_gm.so");
                copyLibrary(context, bArr, assets, "x86", "libswresample_gm.so");
                copyLibrary(context, bArr, assets, "x86", "libgm_audioengine.so");
            } else if (i2 == 0 || assets.list("armeabi-v7a").length <= 0) {
                copyLibrary(context, bArr, assets, null, "libavutil_gm.so");
                copyLibrary(context, bArr, assets, null, "libavformat_gm.so");
                copyLibrary(context, bArr, assets, null, "libavcodec_gm.so");
                copyLibrary(context, bArr, assets, null, "libswresample_gm.so");
                copyLibrary(context, bArr, assets, null, "libgm_audioengine.so");
            } else {
                copyLibrary(context, bArr, assets, "armeabi-v7a", "libavutil_gm.so");
                copyLibrary(context, bArr, assets, "armeabi-v7a", "libavformat_gm.so");
                copyLibrary(context, bArr, assets, "armeabi-v7a", "libavcodec_gm.so");
                copyLibrary(context, bArr, assets, "armeabi-v7a", "libswresample_gm.so");
                copyLibrary(context, bArr, assets, "armeabi-v7a", "libgm_audioengine.so");
            }
        } catch (Exception e2) {
            s1.l(e2, true);
        }
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public static boolean is64Bit() {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 21 && (strArr = Build.SUPPORTED_64_BIT_ABIS) != null) {
            for (String str : strArr) {
                if (str.toLowerCase(Locale.getDefault()).contains("arm64")) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void removeLibrary(Context context, String str) {
        if (context.deleteFile(str)) {
            s1.h("Deleted " + str);
        }
    }
}
