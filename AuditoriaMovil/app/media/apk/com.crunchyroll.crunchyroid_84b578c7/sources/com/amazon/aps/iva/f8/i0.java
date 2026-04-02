package com.amazon.aps.iva.f8;

import android.media.MediaRoute2Info;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: MediaRouter2Utils.java */
/* loaded from: classes.dex */
public final class i0 {

    /* compiled from: MediaRouter2Utils.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(MediaRoute2Info.Builder builder, y yVar) {
            if (yVar.a.getBoolean("isVisibilityPublic", true)) {
                builder.setVisibilityPublic();
            } else {
                builder.setVisibilityRestricted(yVar.a());
            }
        }

        public static Set<String> b(MediaRoute2Info mediaRoute2Info) {
            return mediaRoute2Info.getDeduplicationIds();
        }

        public static int c(MediaRoute2Info mediaRoute2Info) {
            return mediaRoute2Info.getType();
        }

        public static void d(MediaRoute2Info.Builder builder, Set<String> set) {
            builder.setDeduplicationIds(set);
        }

        public static void e(MediaRoute2Info.Builder builder, int i) {
            builder.setType(i);
        }
    }

    public static ArrayList a(List list) {
        String id;
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            MediaRoute2Info a2 = com.amazon.aps.iva.f8.a.a(obj);
            if (a2 != null) {
                id = a2.getId();
                arrayList.add(id);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.f8.y b(android.media.MediaRoute2Info r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f8.i0.b(android.media.MediaRoute2Info):com.amazon.aps.iva.f8.y");
    }
}
