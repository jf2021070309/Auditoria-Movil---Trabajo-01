package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import java.util.Map;
/* loaded from: classes4.dex */
final /* synthetic */ class tk implements Runnable {
    private final tj a;
    private final cn b;
    private final jf c;
    private final String d;
    private final Map e;

    private tk(tj tjVar, cn cnVar, jf jfVar, String str, Map map) {
        this.a = tjVar;
        this.b = cnVar;
        this.c = jfVar;
        this.d = str;
        this.e = map;
    }

    public static Runnable a(tj tjVar, cn cnVar, jf jfVar, String str, Map map) {
        return new tk(tjVar, cnVar, jfVar, str, map);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.a(this.b, this.c, this.d, this.e);
    }
}
