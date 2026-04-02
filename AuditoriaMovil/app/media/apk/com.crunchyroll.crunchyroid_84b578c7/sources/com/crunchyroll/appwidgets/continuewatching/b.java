package com.crunchyroll.appwidgets.continuewatching;

import android.content.Context;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.xe0.d;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.x;
import com.amazon.aps.iva.z3.m;
import com.amazon.aps.iva.z3.q;
import com.crunchyroll.appwidgets.continuewatching.a;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileInputStream;
/* compiled from: ContinueWatchingStateDefinition.kt */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.z4.b<com.crunchyroll.appwidgets.continuewatching.a> {
    public static final com.amazon.aps.iva.y3.c c;
    public static final /* synthetic */ l<Object>[] b = {e0.a.h(new x(b.class, "datastore", "getDatastore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};
    public static final b a = new b();

    /* compiled from: ContinueWatchingStateDefinition.kt */
    /* loaded from: classes.dex */
    public static final class a implements m<com.crunchyroll.appwidgets.continuewatching.a> {
        public static final a a = new a();
        public static final a.b b = new a.b(new g.b(null));

        @Override // com.amazon.aps.iva.z3.m
        public final Object a(FileInputStream fileInputStream) {
            try {
                Object fromJson = new Gson().fromJson(new String(com.amazon.aps.iva.ab.x.b0(fileInputStream), com.amazon.aps.iva.oe0.a.b), (Class<Object>) com.crunchyroll.appwidgets.continuewatching.a.class);
                j.e(fromJson, "{\n            Gson().fro…te::class.java)\n        }");
                return (com.crunchyroll.appwidgets.continuewatching.a) fromJson;
            } catch (Exception unused) {
                return b;
            }
        }

        @Override // com.amazon.aps.iva.z3.m
        public final q b(Object obj, q.b bVar) {
            try {
                String json = new Gson().toJson((com.crunchyroll.appwidgets.continuewatching.a) obj);
                j.e(json, "Gson().toJson(t)");
                byte[] bytes = json.getBytes(com.amazon.aps.iva.oe0.a.b);
                j.e(bytes, "this as java.lang.String).getBytes(charset)");
                bVar.write(bytes);
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                com.amazon.aps.iva.a60.b.k(bVar, null);
                return com.amazon.aps.iva.kb0.q.a;
            } finally {
            }
        }

        @Override // com.amazon.aps.iva.z3.m
        public final com.crunchyroll.appwidgets.continuewatching.a getDefaultValue() {
            return b;
        }
    }

    static {
        a aVar = a.a;
        d i = z.i(r0.b.plus(i.a()));
        com.amazon.aps.iva.y3.a aVar2 = com.amazon.aps.iva.y3.a.h;
        j.f(aVar2, "produceMigrations");
        c = new com.amazon.aps.iva.y3.c(aVar2, i);
    }

    @Override // com.amazon.aps.iva.z4.b
    public final File a(Context context, String str) {
        j.f(context, "context");
        j.f(str, "fileKey");
        return w.y(context, "continueWatching");
    }

    @Override // com.amazon.aps.iva.z4.b
    public final Object b(Context context, String str) {
        return (com.amazon.aps.iva.z3.i) c.getValue(context, b[0]);
    }
}
