package i.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2.dex */
public class w {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(w.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f9177b;

    public w(Throwable th, boolean z) {
        this.f9177b = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public w(Throwable th, boolean z, int i2) {
        ?? r2 = (i2 & 2) != 0 ? 0 : z;
        this.f9177b = th;
        this._handled = r2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.f9177b + ']';
    }
}
