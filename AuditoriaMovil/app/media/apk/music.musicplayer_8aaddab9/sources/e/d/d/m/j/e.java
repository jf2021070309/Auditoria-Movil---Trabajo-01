package e.d.d.m.j;

import android.content.Context;
import e.d.d.m.j.j.l;
import java.io.IOException;
/* loaded from: classes.dex */
public class e {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public b f7143b = null;

    /* loaded from: classes2.dex */
    public class b {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7144b;

        public b(e eVar, a aVar) {
            String[] list;
            int g2 = l.g(eVar.a, "com.google.firebase.crashlytics.unity_version", "string");
            if (g2 != 0) {
                this.a = "Unity";
                this.f7144b = eVar.a.getResources().getString(g2);
                f.a.a(2);
                return;
            }
            boolean z = false;
            try {
                if (eVar.a.getAssets() != null && (list = eVar.a.getAssets().list("flutter_assets")) != null) {
                    if (list.length > 0) {
                        z = true;
                    }
                }
            } catch (IOException unused) {
            }
            if (!z) {
                this.a = null;
                this.f7144b = null;
                return;
            }
            this.a = "Flutter";
            this.f7144b = null;
            f.a.a(2);
        }
    }

    public e(Context context) {
        this.a = context;
    }
}
