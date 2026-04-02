package com.amazon.aps.iva.gw;

import android.content.Context;
import com.amazon.aps.iva.a0.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.zv.b;
import java.io.File;
import java.util.List;
/* compiled from: KalturaDatabase.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: KalturaDatabase.kt */
    /* renamed from: com.amazon.aps.iva.gw.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0311a {
        public static a a;

        public static a a() {
            a aVar = a;
            if (aVar == null) {
                Context context = b.a.a;
                if (context != null) {
                    File file = new File(context.getFilesDir(), "dtg/clear");
                    Context context2 = b.a.a;
                    if (context2 != null) {
                        File file2 = new File(context2.getExternalFilesDir(null), "dtg/clear");
                        File file3 = new File(file.getPath(), "downloads.db");
                        if (file3.exists()) {
                            Context context3 = b.a.a;
                            if (context3 != null) {
                                aVar = new b(file2, file3, context3);
                            } else {
                                j.m("internalContext");
                                throw null;
                            }
                        } else {
                            aVar = k.d;
                        }
                        a = aVar;
                    } else {
                        j.m("internalContext");
                        throw null;
                    }
                } else {
                    j.m("internalContext");
                    throw null;
                }
            }
            return aVar;
        }
    }

    List<com.amazon.aps.iva.hw.a> b(List<? extends com.amazon.aps.iva.hw.c> list);

    void c(String str);

    com.amazon.aps.iva.hw.a e(String str);
}
