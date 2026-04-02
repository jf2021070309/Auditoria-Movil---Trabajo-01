package e.d.d.m;

import android.os.Bundle;
import e.d.d.k.a.a;
import java.util.Locale;
/* loaded from: classes2.dex */
public class f implements a.b {
    public e.d.d.m.j.h.b a;

    /* renamed from: b  reason: collision with root package name */
    public e.d.d.m.j.h.b f7135b;

    public void a(int i2, Bundle bundle) {
        e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
        String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i2), bundle);
        fVar.a(2);
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            e.d.d.m.j.h.b bVar = "clx".equals(bundle2.getString("_o")) ? this.a : this.f7135b;
            if (bVar == null) {
                return;
            }
            bVar.b(string, bundle2);
        }
    }
}
