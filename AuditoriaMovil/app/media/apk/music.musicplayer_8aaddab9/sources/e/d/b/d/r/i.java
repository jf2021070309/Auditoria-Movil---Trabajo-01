package e.d.b.d.r;

import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class i {

    /* renamed from: c  reason: collision with root package name */
    public float f6545c;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f6547e;

    /* renamed from: f  reason: collision with root package name */
    public e.d.b.d.t.b f6548f;
    public final TextPaint a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final e.d.b.d.t.d f6544b = new a();

    /* renamed from: d  reason: collision with root package name */
    public boolean f6546d = true;

    /* loaded from: classes2.dex */
    public class a extends e.d.b.d.t.d {
        public a() {
        }

        @Override // e.d.b.d.t.d
        public void a(int i2) {
            i iVar = i.this;
            iVar.f6546d = true;
            b bVar = iVar.f6547e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // e.d.b.d.t.d
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            i iVar = i.this;
            iVar.f6546d = true;
            b bVar = iVar.f6547e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public i(b bVar) {
        this.f6547e = new WeakReference<>(null);
        this.f6547e = new WeakReference<>(bVar);
    }

    public float a(String str) {
        if (this.f6546d) {
            float measureText = str == null ? 0.0f : this.a.measureText((CharSequence) str, 0, str.length());
            this.f6545c = measureText;
            this.f6546d = false;
            return measureText;
        }
        return this.f6545c;
    }
}
