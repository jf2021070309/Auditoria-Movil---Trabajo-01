package com.vungle.publisher;

import android.os.Bundle;
import com.vungle.publisher.lb;
import com.vungle.publisher.li;
import javax.inject.Inject;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public abstract class lf {

    /* loaded from: classes4.dex */
    public static abstract class a {
    }

    public abstract void a(Bundle bundle);

    public boolean a() {
        return false;
    }

    public String b() {
        return null;
    }

    public boolean c() {
        return false;
    }

    public String d() {
        return null;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class b {
        @Inject
        lb.a a;
        @Inject
        li.a b;

        public lf a(Bundle bundle) {
            if (bundle.containsKey("webViewRootContentIndexFile")) {
                return this.a.a(bundle);
            }
            if (bundle.containsKey("webViewRootContentString")) {
                return this.b.a(bundle);
            }
            return null;
        }
    }
}
