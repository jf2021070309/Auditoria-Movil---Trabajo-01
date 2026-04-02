package com.amazon.aps.iva.dk;
/* compiled from: PlayerError.kt */
/* loaded from: classes.dex */
public abstract class c extends Throwable {
    public final String b;
    public final int c;
    public final boolean d;
    public final String e;
    public final String f;

    public c(String str, boolean z, String str2, int i) {
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = str2;
        this.f = str + '-' + i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.e;
    }
}
