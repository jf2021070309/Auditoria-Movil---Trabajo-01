package com.facebook.ads.internal.adapters;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class b {
    protected final c a;
    protected final com.facebook.ads.internal.r.a b;
    private final Context c;
    private boolean d;

    public b(Context context, c cVar, com.facebook.ads.internal.r.a aVar) {
        this.c = context;
        this.a = cVar;
        this.b = aVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        if (this.a != null) {
            this.a.a();
        }
        HashMap hashMap = new HashMap();
        if (this.b != null) {
            this.b.a(hashMap);
        }
        a(hashMap);
        this.d = true;
        com.facebook.ads.internal.q.a.d.a(this.c, "Impression logged");
        if (this.a != null) {
            this.a.b();
        }
    }

    protected abstract void a(Map<String, String> map);
}
