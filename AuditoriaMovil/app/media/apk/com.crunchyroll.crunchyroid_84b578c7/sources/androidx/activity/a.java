package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.a;
import com.amazon.aps.iva.i.a;
/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ a.C0348a c;
    public final /* synthetic */ ComponentActivity.a d;

    public a(ComponentActivity.a aVar, int i, a.C0348a c0348a) {
        this.d = aVar;
        this.b = i;
        this.c = c0348a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.amazon.aps.iva.h.b<O> bVar;
        T t = this.c.a;
        ComponentActivity.a aVar = this.d;
        String str = (String) aVar.a.get(Integer.valueOf(this.b));
        if (str != null) {
            a.C0005a c0005a = (a.C0005a) aVar.e.get(str);
            if (c0005a != null && (bVar = c0005a.a) != 0) {
                if (aVar.d.remove(str)) {
                    bVar.a(t);
                    return;
                }
                return;
            }
            aVar.g.remove(str);
            aVar.f.put(str, t);
        }
    }
}
