package com.fyber.inneractive.sdk.j;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.t;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.x;
import java.io.IOException;
/* loaded from: classes.dex */
public final class c extends b {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.j.b
    public final boolean b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.j.b
    public final void a(String str, t tVar) throws IOException {
        f fVar = (f) this.a;
        String a = str == null ? null : x.e.a(str);
        String f = com.fyber.inneractive.sdk.config.f.f();
        if (!TextUtils.isEmpty(f)) {
            String e = l.e(f);
            if (!TextUtils.isEmpty(e)) {
                a = e;
            }
        }
        fVar.a = a;
    }

    @Override // com.fyber.inneractive.sdk.j.b
    public final e a() {
        this.a = new f();
        return this.a;
    }
}
