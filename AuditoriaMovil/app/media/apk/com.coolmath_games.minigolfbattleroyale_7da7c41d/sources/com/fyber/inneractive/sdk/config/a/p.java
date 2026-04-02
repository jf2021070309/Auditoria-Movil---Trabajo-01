package com.fyber.inneractive.sdk.config.a;

import java.util.Map;
/* loaded from: classes.dex */
public abstract class p implements n {
    protected n c;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(n nVar) {
        this.c = nVar;
    }

    public final n b() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public String b(String str) {
        n nVar = this.c;
        if (nVar != null) {
            return nVar.b(str);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public Integer c(String str) {
        n nVar = this.c;
        if (nVar != null) {
            return nVar.c(str);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public Boolean d(String str) {
        n nVar = this.c;
        if (nVar != null) {
            return nVar.d(str);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public String a(String str, String str2) {
        n nVar = this.c;
        return nVar != null ? nVar.a(str, str2) : str2;
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public int a(String str, int i) {
        n nVar = this.c;
        return nVar != null ? nVar.a(str, i) : i;
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public boolean a(String str, boolean z) {
        n nVar = this.c;
        return nVar != null ? nVar.a(str, z) : z;
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public Double e(String str) {
        n nVar = this.c;
        if (nVar != null) {
            return nVar.e(str);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public double a(String str, double d) {
        n nVar = this.c;
        return nVar != null ? nVar.a(str, d) : d;
    }

    @Override // com.fyber.inneractive.sdk.config.a.n
    public final Map<String, Object> a() {
        n nVar = this.c;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }
}
