package com.amazon.aps.iva.z9;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ n(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return p.b(this.a, this.b, this.c);
    }
}
