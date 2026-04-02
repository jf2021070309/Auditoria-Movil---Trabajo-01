package com.fyber.inneractive.sdk.h;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class ae extends ab<String> {
    private final String a;
    private final AtomicInteger b;

    public ae(r<String> rVar, String str) {
        this(rVar, str, new f());
    }

    private ae(r<String> rVar, String str, e eVar) {
        super(rVar, eVar);
        this.b = new AtomicInteger();
        this.a = str;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final u c() {
        return u.GET;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final boolean g() {
        return this.b.getAndIncrement() < 4;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final int h() {
        return ((int) Math.pow(2.0d, this.b.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final String k() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    @Override // com.fyber.inneractive.sdk.h.y
    public final w<String> a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        try {
            x xVar = new x();
            xVar.a = String.valueOf(i);
            if (inputStream != null) {
                xVar.b = com.fyber.inneractive.sdk.util.q.a(inputStream).toString();
            }
            return xVar;
        } catch (Exception e) {
            IAlog.a("failed parse hit network request", e, new Object[0]);
            throw new v(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final int m() {
        return ah.b;
    }
}
