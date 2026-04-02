package com.fyber.inneractive.sdk.config.a.a;

import com.fyber.inneractive.sdk.config.a.k;
import com.fyber.inneractive.sdk.config.a.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class d extends p {
    public String a;
    public List<com.fyber.inneractive.sdk.config.a.b> b = new ArrayList();
    public Map<String, k> d = new HashMap();

    public abstract d c();

    public d(String str) {
        this.a = str;
    }

    @Override // com.fyber.inneractive.sdk.config.a.p, com.fyber.inneractive.sdk.config.a.n
    public final String b(String str) {
        return a(str, (String) null);
    }

    @Override // com.fyber.inneractive.sdk.config.a.p, com.fyber.inneractive.sdk.config.a.n
    public final int a(String str, int i) {
        Integer c = c(str);
        return c != null ? c.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.config.a.p, com.fyber.inneractive.sdk.config.a.n
    public final double a(String str, double d) {
        Double e = e(str);
        return e != null ? e.doubleValue() : d;
    }

    @Override // com.fyber.inneractive.sdk.config.a.p, com.fyber.inneractive.sdk.config.a.n
    public final boolean a(String str, boolean z) {
        Boolean d = d(str);
        return d != null ? d.booleanValue() : z;
    }

    public String toString() {
        return String.format("id: %s, params: %s exp: %s", this.a, this.c, this.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(d dVar) {
        dVar.a = this.a;
        dVar.c = this.c;
        dVar.b = new ArrayList(this.b);
        dVar.d = new HashMap(this.d);
    }

    @Override // com.fyber.inneractive.sdk.config.a.p, com.fyber.inneractive.sdk.config.a.n
    public final String a(String str, String str2) {
        String str3;
        Iterator<String> it = this.d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            str3 = this.d.get(it.next()).b(str);
            if (str3 != null) {
                break;
            }
        }
        return str3 == null ? super.a(str, str2) : str3;
    }

    @Override // com.fyber.inneractive.sdk.config.a.p, com.fyber.inneractive.sdk.config.a.n
    public final Integer c(String str) {
        Integer num;
        Iterator<String> it = this.d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = this.d.get(it.next()).c(str);
            if (num != null) {
                break;
            }
        }
        return num == null ? super.c(str) : num;
    }

    @Override // com.fyber.inneractive.sdk.config.a.p, com.fyber.inneractive.sdk.config.a.n
    public final Double e(String str) {
        Double d;
        Iterator<String> it = this.d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                d = null;
                break;
            }
            d = this.d.get(it.next()).e(str);
            if (d != null) {
                break;
            }
        }
        return d == null ? super.e(str) : d;
    }

    @Override // com.fyber.inneractive.sdk.config.a.p, com.fyber.inneractive.sdk.config.a.n
    public final Boolean d(String str) {
        Boolean bool;
        Iterator<String> it = this.d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                bool = null;
                break;
            }
            bool = this.d.get(it.next()).d(str);
            if (bool != null) {
                break;
            }
        }
        return bool == null ? super.d(str) : bool;
    }
}
