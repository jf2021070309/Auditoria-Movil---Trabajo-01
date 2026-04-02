package e.c.a.m.r;

import android.content.res.AssetManager;
import android.util.Log;
import e.c.a.m.r.d;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager f5560b;

    /* renamed from: c  reason: collision with root package name */
    public T f5561c;

    public b(AssetManager assetManager, String str) {
        this.f5560b = assetManager;
        this.a = str;
    }

    @Override // e.c.a.m.r.d
    public void b() {
        T t = this.f5561c;
        if (t == null) {
            return;
        }
        try {
            c(t);
        } catch (IOException unused) {
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
    public void e(e.c.a.f fVar, d.a<? super T> aVar) {
        try {
            T f2 = f(this.f5560b, this.a);
            this.f5561c = f2;
            aVar.f(f2);
        } catch (IOException e2) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.c(e2);
        }
    }

    public abstract T f(AssetManager assetManager, String str) throws IOException;
}
