package com.vungle.publisher;

import javax.inject.Inject;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class bd extends ph {
    int a;
    int b;
    float c;

    public float a() {
        return this.c;
    }

    public boolean b() {
        return this.b > this.a;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        lm a;

        public bd a(int i) {
            bd bdVar = new bd();
            bdVar.b = this.a.a();
            bdVar.c = this.a.b();
            bdVar.a = i;
            return bdVar;
        }
    }
}
