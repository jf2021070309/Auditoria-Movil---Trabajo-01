package com.iab.omid.library.ironsrc.c;

import android.view.View;
import com.iab.omid.library.ironsrc.c.a;
import com.iab.omid.library.ironsrc.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class c implements a {
    private final a a;

    public c(a aVar) {
        this.a = aVar;
    }

    ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.ironsrc.b.a a = com.iab.omid.library.ironsrc.b.a.a();
        if (a != null) {
            Collection<com.iab.omid.library.ironsrc.adsession.a> c = a.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (com.iab.omid.library.ironsrc.adsession.a aVar : c) {
                View d = aVar.d();
                if (d != null && f.c(d) && (rootView = d.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = f.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && f.a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.ironsrc.c.a
    public JSONObject a(View view) {
        return com.iab.omid.library.ironsrc.d.b.a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.ironsrc.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0073a interfaceC0073a, boolean z) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0073a.a(it.next(), this.a, jSONObject);
        }
    }
}
