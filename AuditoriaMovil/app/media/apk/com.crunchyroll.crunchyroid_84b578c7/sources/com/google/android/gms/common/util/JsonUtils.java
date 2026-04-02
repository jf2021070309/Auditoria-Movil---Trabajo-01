package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class JsonUtils {
    private static final Pattern zza = Pattern.compile("\\\\.");
    private static final Pattern zzb = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    private JsonUtils() {
    }

    @KeepForSdk
    public static boolean areJsonValuesEquivalent(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof c) && (obj2 instanceof c)) {
            c cVar = (c) obj;
            c cVar2 = (c) obj2;
            if (cVar.length() != cVar2.length()) {
                return false;
            }
            Iterator<String> keys = cVar.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!cVar2.has(next)) {
                    return false;
                }
                try {
                    Preconditions.checkNotNull(next);
                } catch (b unused) {
                }
                if (!areJsonValuesEquivalent(cVar.get(next), cVar2.get(next))) {
                    return false;
                }
            }
            return true;
        } else if ((obj instanceof a) && (obj2 instanceof a)) {
            a aVar = (a) obj;
            a aVar2 = (a) obj2;
            if (aVar.e() != aVar2.e()) {
                return false;
            }
            for (int i = 0; i < aVar.e(); i++) {
                if (!areJsonValuesEquivalent(aVar.get(i), aVar2.get(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return obj.equals(obj2);
        }
    }

    @KeepForSdk
    public static String escapeString(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = zzb.matcher(str);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char charAt = matcher.group().charAt(0);
                if (charAt != '\f') {
                    if (charAt != '\r') {
                        if (charAt != '\"') {
                            if (charAt != '/') {
                                if (charAt != '\\') {
                                    switch (charAt) {
                                        case '\b':
                                            matcher.appendReplacement(stringBuffer, "\\\\b");
                                            continue;
                                        case '\t':
                                            matcher.appendReplacement(stringBuffer, "\\\\t");
                                            continue;
                                        case '\n':
                                            matcher.appendReplacement(stringBuffer, "\\\\n");
                                            continue;
                                    }
                                } else {
                                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                                }
                            } else {
                                matcher.appendReplacement(stringBuffer, "\\\\/");
                            }
                        } else {
                            matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                        }
                    } else {
                        matcher.appendReplacement(stringBuffer, "\\\\r");
                    }
                } else {
                    matcher.appendReplacement(stringBuffer, "\\\\f");
                }
            }
            if (stringBuffer == null) {
                return str;
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return str;
    }

    @KeepForSdk
    public static String unescapeString(String str) {
        if (!TextUtils.isEmpty(str)) {
            String zza2 = zzc.zza(str);
            Matcher matcher = zza.matcher(zza2);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char charAt = matcher.group().charAt(1);
                if (charAt != '\"') {
                    if (charAt != '/') {
                        if (charAt != '\\') {
                            if (charAt != 'b') {
                                if (charAt != 'f') {
                                    if (charAt != 'n') {
                                        if (charAt != 'r') {
                                            if (charAt == 't') {
                                                matcher.appendReplacement(stringBuffer, "\t");
                                            } else {
                                                throw new IllegalStateException("Found an escaped character that should never be.");
                                            }
                                        } else {
                                            matcher.appendReplacement(stringBuffer, "\r");
                                        }
                                    } else {
                                        matcher.appendReplacement(stringBuffer, "\n");
                                    }
                                } else {
                                    matcher.appendReplacement(stringBuffer, "\f");
                                }
                            } else {
                                matcher.appendReplacement(stringBuffer, "\b");
                            }
                        } else {
                            matcher.appendReplacement(stringBuffer, "\\\\");
                        }
                    } else {
                        matcher.appendReplacement(stringBuffer, "/");
                    }
                } else {
                    matcher.appendReplacement(stringBuffer, "\"");
                }
            }
            if (stringBuffer == null) {
                return zza2;
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return str;
    }
}
