package com.amazon.aps.iva.n4;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;
/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class n<E> extends l {
    public final Activity b;
    public final Context c;
    public final Handler d;
    public final t e;

    public n(androidx.fragment.app.h hVar) {
        Handler handler = new Handler();
        this.e = new t();
        this.b = hVar;
        if (hVar != null) {
            this.c = hVar;
            this.d = handler;
            return;
        }
        throw new NullPointerException("context == null");
    }

    public abstract void B(PrintWriter printWriter, String[] strArr);

    public abstract androidx.fragment.app.h G();

    public abstract LayoutInflater Z();

    public abstract boolean h0(String str);

    public abstract void m0();
}
