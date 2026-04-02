package com.fyber.inneractive.sdk.h;

import android.os.Environment;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class af extends ab<String> {
    private final String a;

    @Override // com.fyber.inneractive.sdk.h.y
    public final boolean g() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final int h() {
        return 0;
    }

    public af(r<String> rVar, String str) {
        super(rVar, new f());
        this.a = str;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final u c() {
        return u.GET;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final String k() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final int m() {
        return ah.b;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.String] */
    @Override // com.fyber.inneractive.sdk.h.y
    public final w<String> a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        x xVar = new x();
        try {
            File file = new File(new File(Environment.getExternalStorageDirectory(), "Pictures"), a(URI.create(this.a), map));
            ?? file2 = file.toString();
            com.fyber.inneractive.sdk.util.q.a(inputStream, new FileOutputStream(file));
            xVar.a = file2;
        } catch (Exception unused) {
            IAlog.b("failed to download and save the image file.", new Object[0]);
        }
        return xVar;
    }

    private static String a(URI uri, Map<String, List<String>> map) {
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        String name = new File(path).getName();
        List<String> list = map != null ? map.get("text/html") : null;
        String str = list != null ? list.get(0) : null;
        if (str != null) {
            for (String str2 : str.split(";")) {
                if (str2.contains("image/")) {
                    String str3 = "." + str2.split("/")[1];
                    if (name.endsWith(str3)) {
                        return name;
                    }
                    return name + str3;
                }
            }
            return name;
        }
        return name;
    }
}
