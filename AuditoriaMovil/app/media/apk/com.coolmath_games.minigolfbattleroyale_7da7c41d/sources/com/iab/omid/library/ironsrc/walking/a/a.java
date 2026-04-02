package com.iab.omid.library.ironsrc.walking.a;

import com.iab.omid.library.ironsrc.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class a extends b {
    protected final HashSet<String> a;
    protected final JSONObject b;
    protected final long c;

    public a(b.InterfaceC0075b interfaceC0075b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0075b);
        this.a = new HashSet<>(hashSet);
        this.b = jSONObject;
        this.c = j;
    }
}
