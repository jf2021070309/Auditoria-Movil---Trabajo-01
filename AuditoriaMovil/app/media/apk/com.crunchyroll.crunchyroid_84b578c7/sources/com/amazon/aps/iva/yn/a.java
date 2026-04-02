package com.amazon.aps.iva.yn;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BifFile.java */
/* loaded from: classes2.dex */
public abstract class a {
    public final byte[] a;
    public final int b;
    public final List<C0894a> c;
    public final int d;
    public Bitmap e = null;

    /* compiled from: BifFile.java */
    /* renamed from: com.amazon.aps.iva.yn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0894a {
        public int a;
        public int b;
    }

    public a(byte[] bArr, int i, int i2, ArrayList arrayList) {
        this.a = bArr;
        this.b = i;
        this.d = i2;
        this.c = arrayList;
    }

    public abstract Bitmap a(int i);
}
