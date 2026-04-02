package com.amazon.aps.iva.j9;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
/* compiled from: AssetHelper.java */
/* loaded from: classes.dex */
public final class u {
    public final Context a;

    public u(Context context) {
        this.a = context;
    }

    public static String a(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.endsWith("/")) {
            return canonicalPath.concat("/");
        }
        return canonicalPath;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r5.equals("mhtml") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j9.u.b(java.lang.String):java.lang.String");
    }

    public final InputStream c(String str) throws Resources.NotFoundException, IOException {
        if (str.length() > 1 && str.charAt(0) == '/') {
            str = str.substring(1);
        }
        String[] split = str.split("/", -1);
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            int lastIndexOf = str3.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str3 = str3.substring(0, lastIndexOf);
            }
            Context context = this.a;
            int identifier = context.getResources().getIdentifier(str3, str2, context.getPackageName());
            TypedValue typedValue = new TypedValue();
            context.getResources().getValue(identifier, typedValue, true);
            int i = typedValue.type;
            if (i == 3) {
                InputStream openRawResource = context.getResources().openRawResource(identifier);
                if (str.endsWith(".svgz")) {
                    return new GZIPInputStream(openRawResource);
                }
                return openRawResource;
            }
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", str, Integer.valueOf(i)));
        }
        throw new IllegalArgumentException("Incorrect resource path: ".concat(str));
    }
}
