package e.d.e.c0.z;

import e.d.e.c0.z.j;
import e.d.e.z;
import java.io.IOException;
import java.lang.reflect.Field;
/* loaded from: classes2.dex */
public class i extends j.b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Field f7853d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f7854e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ z f7855f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e.d.e.j f7856g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e.d.e.d0.a f7857h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f7858i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, boolean z, boolean z2, Field field, boolean z3, z zVar, e.d.e.j jVar2, e.d.e.d0.a aVar, boolean z4) {
        super(str, z, z2);
        this.f7853d = field;
        this.f7854e = z3;
        this.f7855f = zVar;
        this.f7856g = jVar2;
        this.f7857h = aVar;
        this.f7858i = z4;
    }

    @Override // e.d.e.c0.z.j.b
    public void a(e.d.e.e0.a aVar, Object obj) throws IOException, IllegalAccessException {
        Object a = this.f7855f.a(aVar);
        if (a == null && this.f7858i) {
            return;
        }
        this.f7853d.set(obj, a);
    }

    @Override // e.d.e.c0.z.j.b
    public void b(e.d.e.e0.c cVar, Object obj) throws IOException, IllegalAccessException {
        (this.f7854e ? this.f7855f : new n(this.f7856g, this.f7855f, this.f7857h.f7896b)).b(cVar, this.f7853d.get(obj));
    }

    @Override // e.d.e.c0.z.j.b
    public boolean c(Object obj) throws IOException, IllegalAccessException {
        return this.f7864b && this.f7853d.get(obj) != obj;
    }
}
