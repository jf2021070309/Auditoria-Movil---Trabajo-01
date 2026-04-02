package com.fyber.inneractive.sdk.h;

import android.os.Build;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class ad extends ab<String> {
    private String a;
    private final String b;
    private final AtomicInteger g;

    public ad(r<String> rVar, String str, String str2) {
        this(rVar, str, str2, new f());
    }

    private ad(r<String> rVar, String str, String str2, e eVar) {
        super(rVar, eVar);
        this.g = new AtomicInteger();
        this.b = str;
        this.a = str2;
        this.e = eVar;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final u c() {
        return u.POST;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final int m() {
        return ah.b;
    }

    @Override // com.fyber.inneractive.sdk.h.ab, com.fyber.inneractive.sdk.h.y
    public final byte[] e() {
        byte[] bArr = new byte[0];
        try {
            IAlog.b("NetworkRequestEvent: network request body %s", this.a);
            if (Build.VERSION.SDK_INT >= 19) {
                bArr = this.a.getBytes(StandardCharsets.UTF_8);
            } else {
                bArr = this.a.getBytes("UTF-8");
            }
        } catch (Exception unused) {
        }
        return bArr;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final String k() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.String] */
    @Override // com.fyber.inneractive.sdk.h.y
    public final w<String> a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        try {
            x xVar = new x();
            xVar.a = String.valueOf(i);
            return xVar;
        } catch (Exception e) {
            IAlog.a("failed parse event network request", e, new Object[0]);
            throw new v(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final boolean g() {
        return this.g.getAndIncrement() < 4;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final int h() {
        return ((int) Math.pow(2.0d, this.g.get())) * 1000;
    }
}
