package com.amazon.aps.iva.m3;

import android.content.Context;
import com.amazon.aps.iva.m3.j;
import java.util.concurrent.Callable;
/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class h implements Callable<j.a> {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ e c;
    public final /* synthetic */ int d;

    public h(String str, Context context, e eVar, int i) {
        this.a = str;
        this.b = context;
        this.c = eVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final j.a call() throws Exception {
        try {
            return j.a(this.a, this.b, this.c, this.d);
        } catch (Throwable unused) {
            return new j.a(-3);
        }
    }
}
