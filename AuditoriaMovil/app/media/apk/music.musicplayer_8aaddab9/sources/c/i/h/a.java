package c.i.h;

import android.graphics.Typeface;
import c.i.d.c.j;
import c.i.e.e;
/* loaded from: classes.dex */
public class a implements Runnable {
    public final /* synthetic */ m a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f2076b;

    public a(c cVar, m mVar, Typeface typeface) {
        this.a = mVar;
        this.f2076b = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        m mVar = this.a;
        Typeface typeface = this.f2076b;
        j.c cVar = ((e.a) mVar).a;
        if (cVar != null) {
            cVar.e(typeface);
        }
    }
}
