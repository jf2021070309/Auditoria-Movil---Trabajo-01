package com.iab.omid.library.applovin.c;

import android.view.View;
import com.iab.omid.library.applovin.c.a;
import com.iab.omid.library.applovin.d.f;
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

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.applovin.b.a a = com.iab.omid.library.applovin.b.a.a();
        if (a != null) {
            Collection<com.iab.omid.library.applovin.adsession.a> c2 = a.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c2.size() * 2) + 3);
            for (com.iab.omid.library.applovin.adsession.a aVar : c2) {
                View e2 = aVar.e();
                if (e2 != null && f.c(e2) && (rootView = e2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
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

    @Override // com.iab.omid.library.applovin.c.a
    public JSONObject a(View view) {
        return com.iab.omid.library.applovin.d.b.a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.applovin.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0098a interfaceC0098a, boolean z, boolean z2) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0098a.a(it.next(), this.a, jSONObject, z2);
        }
    }
}
