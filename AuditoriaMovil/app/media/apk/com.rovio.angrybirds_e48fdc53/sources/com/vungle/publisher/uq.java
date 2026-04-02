package com.vungle.publisher;

import com.vungle.publisher.ub;
import com.vungle.publisher.uo;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class uq extends ub.a {
    @Inject
    uo.a b;
    @Inject
    Lazy<te> c;
    @Inject
    Lazy<tn> d;

    public ub a(cn cnVar, jf jfVar, String str) {
        tn tnVar;
        if (jfVar.a()) {
            tnVar = this.c.get();
        } else {
            tnVar = this.d.get();
        }
        return super.a(this.b.a(cnVar, jfVar, str), tnVar);
    }
}
