package com.amazon.aps.iva.x2;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: Key.java */
/* loaded from: classes.dex */
public abstract class d {
    public int a = -1;
    public int b = -1;
    public HashMap<String, androidx.constraintlayout.widget.a> c;

    public abstract void a(HashMap<String, com.amazon.aps.iva.w2.c> hashMap);

    @Override // 
    /* renamed from: b */
    public abstract d clone();

    public d c(d dVar) {
        this.a = dVar.a;
        this.b = dVar.b;
        this.c = dVar.c;
        return this;
    }

    public abstract void d(HashSet<String> hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap<String, Integer> hashMap) {
    }
}
