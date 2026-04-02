package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class CastUtils {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");
    private static final Random zzc = new Random(SystemClock.elapsedRealtime());

    private CastUtils() {
    }

    @KeepForSdk
    public static c jsonStringToJsonObject(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new c(str);
        } catch (b unused) {
            return null;
        }
    }

    @KeepForSdk
    public static double millisecToSec(long j) {
        return j / 1000.0d;
    }

    @KeepForSdk
    public static String optStringOrNull(c cVar, String str) {
        if (cVar != null && cVar.has(str)) {
            return cVar.optString(str);
        }
        return null;
    }

    @KeepForSdk
    public static long secToMillisec(double d) {
        return (long) (d * 1000.0d);
    }

    @KeepForSdk
    public static void throwIfInvalidNamespace(String str) throws IllegalArgumentException {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() <= 128) {
                if (str.startsWith("urn:x-cast:")) {
                    if (str.length() != 11) {
                        return;
                    }
                    throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
                }
                throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
            }
            throw new IllegalArgumentException("Invalid namespace length");
        }
        throw new IllegalArgumentException("Namespace cannot be null or empty");
    }

    @KeepForSdk
    public static long[] toLongArray(Collection<Long> collection) {
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long l : collection) {
            jArr[i] = l.longValue();
            i++;
        }
        return jArr;
    }

    @KeepForSdk
    public static long[] toLongArraySafely(a aVar) {
        try {
            return zzg(aVar);
        } catch (b unused) {
            return null;
        }
    }

    public static long zza() {
        return zzc.nextLong();
    }

    public static String zzb(Locale locale) {
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        return sb.toString();
    }

    public static String zzc(String str) {
        if (zzb.matcher(str).matches()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ':'))) {
                sb.append(String.format("%%%04x", Integer.valueOf(charAt)));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static List zzd(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static boolean zze(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int[] zzf(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static long[] zzg(a aVar) throws b {
        if (aVar == null) {
            return null;
        }
        long[] jArr = new long[aVar.e()];
        for (int i = 0; i < aVar.e(); i++) {
            jArr[i] = aVar.getLong(i);
        }
        return jArr;
    }

    @KeepForSdk
    public static long secToMillisec(long j) {
        return j * 1000;
    }
}
