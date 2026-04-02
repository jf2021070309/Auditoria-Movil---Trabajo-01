package com.ellation.crunchyroll.presentation.browse;

import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.mn.k;
import com.amazon.aps.iva.mn.m;
import com.amazon.aps.iva.mn.o;
import com.amazon.aps.iva.oh.g;
import com.amazon.aps.iva.tz.k1;
import com.amazon.aps.iva.tz.u0;
import com.amazon.aps.iva.tz.y0;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
/* compiled from: BrowseModule.kt */
/* loaded from: classes2.dex */
public interface c extends k {
    public static final a a = a.a;

    /* compiled from: BrowseModule.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final LinkedHashMap b = new LinkedHashMap();

        public static c a(Fragment fragment, String str, m mVar) {
            o oVar;
            j.f(fragment, "fragment");
            j.f(str, "key");
            LinkedHashMap linkedHashMap = b;
            c cVar = (c) linkedHashMap.get(str);
            if (cVar == null) {
                if (mVar != null) {
                    oVar = new o(mVar, null);
                } else {
                    oVar = null;
                }
                if (oVar == null) {
                    com.amazon.aps.iva.a00.b.Companion.getClass();
                    oVar = new o(com.amazon.aps.iva.a00.b.Popularity, null);
                }
                u0 u0Var = new u0(fragment, oVar);
                linkedHashMap.put(str, u0Var);
                return u0Var;
            }
            return cVar;
        }
    }

    g b();

    y0 c();

    k1 e();
}
