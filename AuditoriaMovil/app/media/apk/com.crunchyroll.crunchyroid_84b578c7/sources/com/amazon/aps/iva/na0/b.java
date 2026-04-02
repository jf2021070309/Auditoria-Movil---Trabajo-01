package com.amazon.aps.iva.na0;

import android.net.Uri;
import com.amazon.aps.iva.b6.d;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.oa0.f1;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: SingularConfig.java */
/* loaded from: classes4.dex */
public final class b {
    public final String a;
    public final String b;
    public a c;
    public Uri g;
    public d h;
    public long i;
    public final ArrayList k;
    public final Boolean l;
    public final HashMap d = new HashMap();
    public final long e = 60;
    public final int f = 6;
    public boolean j = false;

    /* compiled from: SingularConfig.java */
    /* loaded from: classes4.dex */
    public static class a {
    }

    public b(String str, String str2) {
        new ArrayList();
        this.k = new ArrayList();
        this.l = Boolean.FALSE;
        if (!f1.i(str)) {
            if (!f1.i(str2)) {
                this.a = str;
                this.b = str2;
                return;
            }
            throw new IllegalArgumentException("secret can not be null or empty");
        }
        throw new IllegalArgumentException("apiKey can not be null or empty");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("apiKey='");
        sb.append(this.a);
        sb.append("', secret='");
        sb.append(this.b);
        sb.append('\'');
        if (this.c != null) {
            sb.append(", ddlHandler=");
            sb.append(this.c.getClass().getName());
            sb.append(", timeoutInSec=60");
            this.c.getClass();
        }
        sb.append(", logging='false', logLevel='");
        return b2.b(sb, this.f, '\'');
    }
}
