package com.fyber.inneractive.sdk.h;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class ac<T> extends ab<T> {
    private final Context a;
    private final com.fyber.inneractive.sdk.a.a<T> b;
    private q<T> g;

    @Override // com.fyber.inneractive.sdk.h.y
    public final boolean g() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final int h() {
        return 0;
    }

    public ac(r<T> rVar, Context context, com.fyber.inneractive.sdk.a.a<T> aVar) {
        super(rVar, new f());
        this.a = context;
        this.b = aVar;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final u c() {
        return u.GET;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final int m() {
        return ah.b;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final w<T> a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        x xVar = new x();
        try {
            String stringBuffer = com.fyber.inneractive.sdk.util.q.a(inputStream).toString();
            xVar.a = this.b.a(stringBuffer);
            xVar.b = stringBuffer;
            return xVar;
        } catch (Exception e) {
            IAlog.a("failed parse cacheable network request", e, new Object[0]);
            if (e instanceof InvalidAppIdException) {
                throw e;
            }
            throw new v(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final String k() {
        return this.b.c();
    }

    @Override // com.fyber.inneractive.sdk.h.ab, com.fyber.inneractive.sdk.h.y
    public final String i() {
        return this.b.b();
    }

    @Override // com.fyber.inneractive.sdk.h.ab, com.fyber.inneractive.sdk.h.y
    public final a<T> j() {
        q<T> qVar = new q<>(this.a, this.b);
        this.g = qVar;
        com.fyber.inneractive.sdk.a.e<T> a = qVar.a();
        return new a<>(a.b, a.a, this.b.b());
    }

    @Override // com.fyber.inneractive.sdk.h.ab, com.fyber.inneractive.sdk.h.y
    public final void a(w<T> wVar, String str, String str2) {
        q<T> qVar = this.g;
        if (qVar != null) {
            qVar.d = str2;
            if (qVar.c == null) {
                qVar.c = qVar.a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            qVar.c.edit().putString(qVar.b.a(), str2).apply();
            if (wVar == null || wVar.b().isEmpty() || str.isEmpty()) {
                return;
            }
            if (!this.g.a(str, wVar.b())) {
                IAlog.e("Failed to cache file", new Object[0]);
            } else {
                this.b.a((com.fyber.inneractive.sdk.a.a<T>) wVar.a());
            }
        }
    }
}
