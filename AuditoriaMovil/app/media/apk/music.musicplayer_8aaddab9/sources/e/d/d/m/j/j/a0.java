package e.d.d.m.j.j;

import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public class a0 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.d.m.j.n.f f7147b;

    public a0(String str, e.d.d.m.j.n.f fVar) {
        this.a = str;
        this.f7147b = fVar;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e2) {
            e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
            StringBuilder y = e.a.d.a.a.y("Error creating marker: ");
            y.append(this.a);
            fVar.c(y.toString(), e2);
            return false;
        }
    }

    public final File b() {
        return this.f7147b.a(this.a);
    }

    public boolean c() {
        return b().exists();
    }
}
