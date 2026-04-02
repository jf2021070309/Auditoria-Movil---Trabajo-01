package c.c0.d0;

import android.content.Context;
import android.text.TextUtils;
import c.x.a.c;
/* loaded from: classes.dex */
public class h implements c.InterfaceC0058c {
    public final /* synthetic */ Context a;

    public h(Context context) {
        this.a = context;
    }

    @Override // c.x.a.c.InterfaceC0058c
    public c.x.a.c a(c.b bVar) {
        Context context = this.a;
        String str = bVar.f2832b;
        c.a aVar = bVar.f2833c;
        if (aVar != null) {
            if (context != null) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new c.x.a.f.c(context, str, aVar, true);
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}
