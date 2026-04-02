package com.yxcorp.kuaishou.addfp.android.b;

import android.content.Context;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import com.flurry.android.Constants;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
/* loaded from: classes3.dex */
public class b {
    public static File a(Context context, boolean z) {
        StorageManager storageManager = (StorageManager) context.getSystemService("storage");
        try {
            Class<?> cls = Class.forName("android.os.storage.StorageVolume");
            Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
            Method method2 = cls.getMethod("getPath", new Class[0]);
            Method method3 = cls.getMethod("isRemovable", new Class[0]);
            Object invoke = method.invoke(storageManager, new Object[0]);
            int length = Array.getLength(invoke);
            for (int i = 0; i < length; i++) {
                Object obj = Array.get(invoke, i);
                String str = (String) method2.invoke(obj, new Object[0]);
                if (z == ((Boolean) method3.invoke(obj, new Object[0])).booleanValue() && !TextUtils.isEmpty(str)) {
                    return new File(str);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return Environment.getExternalStorageDirectory();
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr3[i] = (byte) i;
        }
        if (bArr2.length == 0) {
            bArr3 = null;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 256; i4++) {
                i3 = ((bArr2[i2] & Constants.UNKNOWN) + (bArr3[i4] & Constants.UNKNOWN) + i3) & 255;
                byte b = bArr3[i4];
                bArr3[i4] = bArr3[i3];
                bArr3[i3] = b;
                i2 = (i2 + 1) % bArr2.length;
            }
        }
        byte[] bArr4 = new byte[bArr.length];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < bArr.length; i7++) {
            i5 = (i5 + 1) & 255;
            i6 = ((bArr3[i5] & Constants.UNKNOWN) + i6) & 255;
            byte b2 = bArr3[i5];
            bArr3[i5] = bArr3[i6];
            bArr3[i6] = b2;
            bArr4[i7] = (byte) (bArr3[((bArr3[i5] & Constants.UNKNOWN) + (bArr3[i6] & Constants.UNKNOWN)) & 255] ^ bArr[i7]);
            bArr4[i7] = (byte) (bArr4[i7] ^ 42);
        }
        return bArr4;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null) {
            try {
                if (bArr2.length > 0 && bArr != null && bArr.length > 0) {
                    byte[] a = a(bArr, bArr2);
                    if (a != null) {
                        if (a.length > 0) {
                        }
                    }
                    return a;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null) {
            try {
                if (bArr2.length > 0 && bArr != null && bArr.length > 0) {
                    byte[] a = a(bArr, bArr2);
                    if (a != null) {
                        if (a.length > 0) {
                        }
                    }
                    return a;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }
}
