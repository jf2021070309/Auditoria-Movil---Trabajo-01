package com.vungle.publisher;

import com.vungle.publisher.tr;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class uo extends tr {
    cn a;
    jf b;

    uo() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.tr
    public tr.c b() {
        return tr.c.trackEvent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.tr
    public tr.b a() {
        return tr.b.GET;
    }

    @Override // com.vungle.publisher.tr
    public String toString() {
        return "{" + b() + ": " + c() + "}";
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends tr.a<uo> {
        /* JADX INFO: Access modifiers changed from: protected */
        public uo a(cn cnVar, jf jfVar, String str) {
            uo c = c();
            c.a = cnVar;
            c.b = jfVar;
            c.a(str);
            return c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.tr.a
        /* renamed from: a */
        public uo b() {
            return new uo();
        }
    }
}
