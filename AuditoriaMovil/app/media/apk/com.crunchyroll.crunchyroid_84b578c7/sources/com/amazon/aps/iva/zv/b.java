package com.amazon.aps.iva.zv;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.b10.i;
import com.amazon.aps.iva.sv.o2;
import com.amazon.aps.iva.u00.q;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.model.Channel;
import okhttp3.OkHttpClient;
/* compiled from: DownloadingDependencies.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: DownloadingDependencies.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static Context a;
    }

    l<String, Channel> A();

    com.amazon.aps.iva.ts.c B();

    d C();

    OkHttpClient D();

    com.amazon.aps.iva.zv.a F();

    boolean b(Intent intent);

    com.amazon.aps.iva.aj.a c();

    String d();

    com.amazon.aps.iva.ct.d e();

    e f();

    com.amazon.aps.iva.rh.a g();

    o2 h();

    i k();

    com.amazon.aps.iva.sk.a n();

    f o();

    q p();

    g q();

    h s();

    com.amazon.aps.iva.xb0.a<c> t();

    com.amazon.aps.iva.jg.a x();

    com.amazon.aps.iva.p00.a z();
}
