package c.m.b;

import android.view.View;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class g0 implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2358b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2359c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2360d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2361e;

    public g0(h0 h0Var, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = i2;
        this.f2358b = arrayList;
        this.f2359c = arrayList2;
        this.f2360d = arrayList3;
        this.f2361e = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i2 = 0; i2 < this.a; i2++) {
            c.i.k.d0.D((View) this.f2358b.get(i2), (String) this.f2359c.get(i2));
            c.i.k.d0.D((View) this.f2360d.get(i2), (String) this.f2361e.get(i2));
        }
    }
}
