package e.d.b.e.a.a;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetPackState f6890b;

    public q(t tVar, AssetPackState assetPackState) {
        this.a = tVar;
        this.f6890b = assetPackState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.a;
        AssetPackState assetPackState = this.f6890b;
        synchronized (tVar) {
            Iterator it = new HashSet(tVar.f6943d).iterator();
            while (it.hasNext()) {
                ((e.d.b.e.a.d.a) it.next()).a(assetPackState);
            }
        }
    }
}
