package com.kwad.framework.filedownloader.a;

import com.kwad.framework.filedownloader.f.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class d {
    public static b a(Map<String, List<String>> map, b bVar, List<String> list) {
        int responseCode = bVar.getResponseCode();
        String aZ = bVar.aZ("Location");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (bd(responseCode)) {
            if (aZ == null) {
                throw new IllegalAccessException(f.b("receive %d (redirect) but the location is null with response [%s]", Integer.valueOf(responseCode), bVar.ui()));
            }
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(d.class, "redirect to %s with %d, %s", aZ, Integer.valueOf(responseCode), arrayList);
            }
            bVar.uj();
            bVar = a(map, aZ);
            arrayList.add(aZ);
            bVar.execute();
            responseCode = bVar.getResponseCode();
            aZ = bVar.aZ("Location");
            i++;
            if (i >= 10) {
                throw new IllegalAccessException(f.b("redirect too many times! %s", arrayList));
            }
        }
        if (list != null) {
            list.addAll(arrayList);
        }
        return bVar;
    }

    private static b a(Map<String, List<String>> map, String str) {
        b bd = com.kwad.framework.filedownloader.download.b.us().bd(str);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                for (String str2 : value) {
                    bd.addHeader(key, str2);
                }
            }
        }
        return bd;
    }

    private static boolean bd(int i) {
        return i == 301 || i == 302 || i == 303 || i == 300 || i == 307 || i == 308;
    }
}
