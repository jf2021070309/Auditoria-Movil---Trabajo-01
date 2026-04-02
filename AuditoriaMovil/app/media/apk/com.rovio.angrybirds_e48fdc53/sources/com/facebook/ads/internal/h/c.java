package com.facebook.ads.internal.h;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class c {
    private d c;
    private String d;
    private int b = 0;
    private List<a> a = new ArrayList();

    public c(d dVar, String str) {
        this.c = dVar;
        this.d = str;
    }

    public d a() {
        return this.c;
    }

    public void a(a aVar) {
        this.a.add(aVar);
    }

    public String b() {
        return this.d;
    }

    public int c() {
        return this.a.size();
    }

    public a d() {
        if (this.b < this.a.size()) {
            this.b++;
            return this.a.get(this.b - 1);
        }
        return null;
    }
}
