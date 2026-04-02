package com.fyber.inneractive.sdk.m;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k {
    final String a;
    final String b;
    final Map<String, String> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(WebResourceRequest webResourceRequest) {
        this.a = webResourceRequest.getUrl().toString();
        this.b = webResourceRequest.getMethod();
        this.c = new HashMap(webResourceRequest.getRequestHeaders() == null ? Collections.emptyMap() : webResourceRequest.getRequestHeaders());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a.equals(kVar.a) && this.b.equals(kVar.b)) {
            return this.c.equals(kVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
