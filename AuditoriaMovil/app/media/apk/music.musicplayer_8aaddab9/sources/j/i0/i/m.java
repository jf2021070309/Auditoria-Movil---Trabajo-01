package j.i0.i;

import j.i0.i.g;
import java.io.IOException;
/* loaded from: classes2.dex */
public class m extends j.i0.b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f9445b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g.C0209g f9446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g.C0209g c0209g, String str, Object[] objArr, q qVar) {
        super(str, objArr);
        this.f9446c = c0209g;
        this.f9445b = qVar;
    }

    @Override // j.i0.b
    public void a() {
        try {
            g.this.f9399c.b(this.f9445b);
        } catch (IOException e2) {
            j.i0.j.f fVar = j.i0.j.f.a;
            StringBuilder y = e.a.d.a.a.y("Http2Connection.Listener failure for ");
            y.append(g.this.f9401e);
            fVar.l(4, y.toString(), e2);
            try {
                this.f9445b.c(b.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
