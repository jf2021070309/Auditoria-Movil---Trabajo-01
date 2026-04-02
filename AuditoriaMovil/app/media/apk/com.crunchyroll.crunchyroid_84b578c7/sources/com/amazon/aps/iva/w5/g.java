package com.amazon.aps.iva.w5;

import java.io.IOException;
/* compiled from: DataSourceException.java */
/* loaded from: classes.dex */
public class g extends IOException {
    public static final /* synthetic */ int c = 0;
    public final int b;

    public g(int i) {
        this.b = i;
    }

    public g(int i, Throwable th) {
        super(th);
        this.b = i;
    }

    public g(String str, int i) {
        super(str);
        this.b = i;
    }

    public g(int i, String str, Throwable th) {
        super(str, th);
        this.b = i;
    }
}
