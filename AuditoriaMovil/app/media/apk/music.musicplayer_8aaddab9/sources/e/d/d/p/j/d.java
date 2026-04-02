package e.d.d.p.j;

import java.io.IOException;
import java.io.Writer;
/* loaded from: classes2.dex */
public class d implements e.d.d.p.a {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    public void a(Object obj, Writer writer) throws IOException {
        e eVar = this.a;
        f fVar = new f(writer, eVar.f7542b, eVar.f7543c, eVar.f7544d, eVar.f7545e);
        fVar.a(obj, false);
        fVar.c();
        fVar.f7546b.flush();
    }
}
