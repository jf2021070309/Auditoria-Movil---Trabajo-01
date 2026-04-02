package com.amazon.aps.iva.ja;

import android.content.Context;
import com.amazon.aps.iva.z9.h;
import com.amazon.aps.iva.z9.i0;
import com.amazon.aps.iva.z9.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
/* compiled from: NetworkFetcher.java */
/* loaded from: classes.dex */
public final class f {
    public final e a;
    public final b b;

    public f(e eVar, b bVar) {
        this.a = eVar;
        this.b = bVar;
    }

    public final i0<h> a(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        i0<h> g;
        i0<h> i0Var;
        c cVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean contains = str2.contains("application/zip");
        e eVar = this.a;
        if (!contains && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            com.amazon.aps.iva.ma.c.a();
            cVar = c.JSON;
            if (str3 != null && eVar != null) {
                i0Var = p.c(new FileInputStream(eVar.c(str, inputStream, cVar).getAbsolutePath()), str);
            } else {
                i0Var = p.c(inputStream, null);
            }
        } else {
            com.amazon.aps.iva.ma.c.a();
            c cVar2 = c.ZIP;
            if (str3 != null && eVar != null) {
                g = p.g(context, new ZipInputStream(new FileInputStream(eVar.c(str, inputStream, cVar2))), str);
            } else {
                g = p.g(context, new ZipInputStream(inputStream), null);
            }
            i0Var = g;
            cVar = cVar2;
        }
        if (str3 != null && i0Var.a != null && eVar != null) {
            File file = new File(eVar.b(), e.a(str, cVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            com.amazon.aps.iva.ma.c.a();
            if (!renameTo) {
                com.amazon.aps.iva.ma.c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return i0Var;
    }
}
