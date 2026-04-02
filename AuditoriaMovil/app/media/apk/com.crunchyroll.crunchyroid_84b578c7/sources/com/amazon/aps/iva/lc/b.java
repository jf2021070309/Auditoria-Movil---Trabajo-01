package com.amazon.aps.iva.lc;

import android.content.res.AssetManager;
import android.util.Log;
import com.amazon.aps.iva.lc.d;
import java.io.IOException;
/* compiled from: AssetPathFetcher.java */
/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {
    public final String b;
    public final AssetManager c;
    public T d;

    public b(AssetManager assetManager, String str) {
        this.c = assetManager;
        this.b = str;
    }

    @Override // com.amazon.aps.iva.lc.d
    public final void b() {
        T t = this.d;
        if (t == null) {
            return;
        }
        try {
            c(t);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t) throws IOException;

    @Override // com.amazon.aps.iva.lc.d
    public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super T> aVar) {
        try {
            T f = f(this.c, this.b);
            this.d = f;
            aVar.f(f);
        } catch (IOException e) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.c(e);
        }
    }

    @Override // com.amazon.aps.iva.lc.d
    public final com.amazon.aps.iva.kc.a e() {
        return com.amazon.aps.iva.kc.a.LOCAL;
    }

    public abstract T f(AssetManager assetManager, String str) throws IOException;

    @Override // com.amazon.aps.iva.lc.d
    public final void cancel() {
    }
}
