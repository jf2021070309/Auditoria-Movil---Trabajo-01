package e.d.b.d.t;

import android.graphics.Typeface;
import android.text.TextPaint;
/* loaded from: classes2.dex */
public class c extends d {
    public final /* synthetic */ TextPaint a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f6573b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f6574c;

    public c(b bVar, TextPaint textPaint, d dVar) {
        this.f6574c = bVar;
        this.a = textPaint;
        this.f6573b = dVar;
    }

    @Override // e.d.b.d.t.d
    public void a(int i2) {
        this.f6573b.a(i2);
    }

    @Override // e.d.b.d.t.d
    public void b(Typeface typeface, boolean z) {
        this.f6574c.g(this.a, typeface);
        this.f6573b.b(typeface, z);
    }
}
