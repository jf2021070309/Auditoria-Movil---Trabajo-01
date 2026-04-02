package com.amazon.aps.iva.lc;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.amazon.aps.iva.lc.d;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: LocalUriFetcher.java */
/* loaded from: classes.dex */
public abstract class i<T> implements d<T> {
    public final Uri b;
    public final ContentResolver c;
    public T d;

    public i(ContentResolver contentResolver, Uri uri) {
        this.c = contentResolver;
        this.b = uri;
    }

    @Override // com.amazon.aps.iva.lc.d
    public final void b() {
        T t = this.d;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t) throws IOException;

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // com.amazon.aps.iva.lc.d
    public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super T> aVar) {
        try {
            ?? r3 = (T) f(this.c, this.b);
            this.d = r3;
            aVar.f(r3);
        } catch (FileNotFoundException e) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.c(e);
        }
    }

    @Override // com.amazon.aps.iva.lc.d
    public final com.amazon.aps.iva.kc.a e() {
        return com.amazon.aps.iva.kc.a.LOCAL;
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException;

    @Override // com.amazon.aps.iva.lc.d
    public final void cancel() {
    }
}
