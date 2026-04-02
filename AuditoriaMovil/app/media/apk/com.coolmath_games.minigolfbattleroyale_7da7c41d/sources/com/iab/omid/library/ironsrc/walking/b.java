package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.a.b;
import com.iab.omid.library.ironsrc.walking.a.d;
import com.iab.omid.library.ironsrc.walking.a.e;
import com.iab.omid.library.ironsrc.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b implements b.InterfaceC0075b {
    private JSONObject a;
    private final com.iab.omid.library.ironsrc.walking.a.c b;

    public b(com.iab.omid.library.ironsrc.walking.a.c cVar) {
        this.b = cVar;
    }

    public void a() {
        this.b.b(new d(this));
    }

    @Override // com.iab.omid.library.ironsrc.walking.a.b.InterfaceC0075b
    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }

    @Override // com.iab.omid.library.ironsrc.walking.a.b.InterfaceC0075b
    public JSONObject b() {
        return this.a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }
}
