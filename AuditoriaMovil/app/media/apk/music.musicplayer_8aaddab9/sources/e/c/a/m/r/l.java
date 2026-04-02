package e.c.a.m.r;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import e.c.a.m.r.d;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {
    public final Uri a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentResolver f5575b;

    /* renamed from: c  reason: collision with root package name */
    public T f5576c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f5575b = contentResolver;
        this.a = uri;
    }

    @Override // e.c.a.m.r.d
    public void b() {
        T t = this.f5576c;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t) throws IOException;

    @Override // e.c.a.m.r.d
    public void cancel() {
    }

    @Override // e.c.a.m.r.d
    public e.c.a.m.a d() {
        return e.c.a.m.a.LOCAL;
    }

    @Override // e.c.a.m.r.d
    public final void e(e.c.a.f fVar, d.a<? super T> aVar) {
        try {
            T f2 = f(this.a, this.f5575b);
            this.f5576c = f2;
            aVar.f(f2);
        } catch (FileNotFoundException e2) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.c(e2);
        }
    }

    public abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
