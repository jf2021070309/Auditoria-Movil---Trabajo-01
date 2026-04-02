package e.d.b.d.t;

import android.graphics.Typeface;
/* loaded from: classes2.dex */
public final class a extends d {
    public final Typeface a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0143a f6557b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6558c;

    /* renamed from: e.d.b.d.t.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0143a {
    }

    public a(InterfaceC0143a interfaceC0143a, Typeface typeface) {
        this.a = typeface;
        this.f6557b = interfaceC0143a;
    }

    @Override // e.d.b.d.t.d
    public void a(int i2) {
        c(this.a);
    }

    @Override // e.d.b.d.t.d
    public void b(Typeface typeface, boolean z) {
        c(typeface);
    }

    public final void c(Typeface typeface) {
        if (this.f6558c) {
            return;
        }
        e.d.b.d.r.c cVar = ((e.d.b.d.r.b) this.f6557b).a;
        a aVar = cVar.w;
        boolean z = true;
        if (aVar != null) {
            aVar.f6558c = true;
        }
        if (cVar.t != typeface) {
            cVar.t = typeface;
        } else {
            z = false;
        }
        if (z) {
            cVar.j();
        }
    }
}
