package e.j.a;

import android.app.Application;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class k {
    public final Application a;

    /* renamed from: b  reason: collision with root package name */
    public final b f8474b;

    /* renamed from: c  reason: collision with root package name */
    public final e.j.d.i f8475c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, FragmentManager.j> f8476d;

    public k(Application application, b bVar, e.j.d.i iVar) {
        h.o.c.j.e(application, "application");
        h.o.c.j.e(bVar, "adManager");
        h.o.c.j.e(iVar, "preferences");
        this.a = application;
        this.f8474b = bVar;
        this.f8475c = iVar;
        this.f8476d = new HashMap<>();
    }
}
