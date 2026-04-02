package com.amazon.aps.iva.v1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.crunchyroll.crunchyroid.R;
import java.util.LinkedHashMap;
/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes.dex */
public final class j3 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final com.amazon.aps.iva.ve0.u0 a(Context context) {
        com.amazon.aps.iva.ve0.u0 u0Var;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            Object obj = linkedHashMap.get(context);
            if (obj == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                com.amazon.aps.iva.ue0.a c = com.amazon.aps.iva.dg.b.c(-1, null, 6);
                obj = com.amazon.aps.iva.dg.b.F(new com.amazon.aps.iva.ve0.j0(new h3(contentResolver, uriFor, new i3(c, com.amazon.aps.iva.k3.i.a(Looper.getMainLooper())), c, context, null)), com.amazon.aps.iva.e.z.j(), new com.amazon.aps.iva.ve0.t0(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                linkedHashMap.put(context, obj);
            }
            u0Var = (com.amazon.aps.iva.ve0.u0) obj;
        }
        return u0Var;
    }

    public static final com.amazon.aps.iva.o0.g0 b(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof com.amazon.aps.iva.o0.g0) {
            return (com.amazon.aps.iva.o0.g0) tag;
        }
        return null;
    }
}
