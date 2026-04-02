package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzhx {
    public static Map zza(Uri uri) {
        String str;
        if (uri != null && !uri.isOpaque()) {
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery != null && encodedQuery.length() != 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int indexOf = encodedQuery.indexOf(35);
                int i = 0;
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                do {
                    int indexOf2 = encodedQuery.indexOf(38, i);
                    if (indexOf2 == -1) {
                        indexOf2 = indexOf;
                    }
                    int indexOf3 = encodedQuery.indexOf(61, i);
                    if (indexOf3 > indexOf2 || indexOf3 == -1) {
                        indexOf3 = indexOf2;
                    }
                    String substring = encodedQuery.substring(i, indexOf3);
                    if (indexOf3 < indexOf2) {
                        str = encodedQuery.substring(indexOf3 + 1, indexOf2);
                    } else {
                        str = "";
                    }
                    linkedHashMap.put(substring, str);
                    i = indexOf2 + 1;
                } while (i < indexOf);
                return Collections.unmodifiableMap(linkedHashMap);
            }
            return Collections.emptyMap();
        }
        throw new UnsupportedOperationException("This isn't a hierarchical URI.");
    }
}
