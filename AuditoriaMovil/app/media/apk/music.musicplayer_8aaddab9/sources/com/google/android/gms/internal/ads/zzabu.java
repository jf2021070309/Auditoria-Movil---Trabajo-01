package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;
/* loaded from: classes.dex */
public final class zzabu {
    private static final char[] zza = "0123456789abcdef".toCharArray();

    public static String zza(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return zzzo.zza(bArr, true);
    }

    public static String zzb(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 + i2;
            char[] cArr2 = zza;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        return new String(cArr);
    }

    public static byte[] zzc(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            for (int i2 = 0; i2 < length; i2 += 2) {
                bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
            }
            return bArr;
        }
        throw new IllegalArgumentException("String must be of even-length");
    }

    public static String zzd(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        zzged.zzc(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean zze(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean zzf() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean zzg(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static long zzh(double d2, int i2, DisplayMetrics displayMetrics) {
        double d3 = displayMetrics.density;
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    public static Activity zzi(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        for (int i2 = 0; (context instanceof ContextWrapper) && i2 < 10; i2++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
