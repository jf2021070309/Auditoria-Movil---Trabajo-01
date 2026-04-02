package com.amazon.aps.iva.if0;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: JSONPointer.java */
/* loaded from: classes4.dex */
public final class d {
    public final List<String> a;

    public d(String str) {
        String substring;
        if (str != null) {
            if (!str.isEmpty() && !str.equals("#")) {
                if (str.startsWith("#/")) {
                    try {
                        substring = URLDecoder.decode(str.substring(2), "utf-8");
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }
                } else if (str.startsWith("/")) {
                    substring = str.substring(1);
                } else {
                    throw new IllegalArgumentException("a JSON pointer should start with '/' or '#/'");
                }
                this.a = new ArrayList();
                for (String str2 : substring.split("/")) {
                    this.a.add(b(str2));
                }
                return;
            }
            this.a = Collections.emptyList();
            return;
        }
        throw new NullPointerException("pointer cannot be null");
    }

    public static String b(String str) {
        return str.replace("~1", "/").replace("~0", "~").replace("\\\"", "\"").replace("\\\\", "\\");
    }

    public final Object a(Object obj) throws e {
        List<String> list = this.a;
        if (list.isEmpty()) {
            return obj;
        }
        for (String str : list) {
            if (obj instanceof c) {
                obj = ((c) obj).opt(b(str));
            } else if (obj instanceof a) {
                try {
                    int parseInt = Integer.parseInt(str);
                    a aVar = (a) obj;
                    if (parseInt < aVar.e()) {
                        try {
                            obj = aVar.get(parseInt);
                        } catch (b e) {
                            throw new e("Error reading value at index position " + parseInt, e);
                        }
                    } else {
                        throw new e(String.format("index %d is out of bounds - the array has %d elements", Integer.valueOf(parseInt), Integer.valueOf(aVar.e())));
                    }
                } catch (NumberFormatException e2) {
                    throw new e(String.format("%s is not an array index", str), e2);
                }
            } else {
                throw new e(String.format("value [%s] is not an array or object therefore its key %s cannot be resolved", obj, str));
            }
        }
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("");
        for (String str : this.a) {
            sb.append('/');
            sb.append(str.replace("~", "~0").replace("/", "~1").replace("\\", "\\\\").replace("\"", "\\\""));
        }
        return sb.toString();
    }
}
