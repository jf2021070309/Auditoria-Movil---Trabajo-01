package c.m.b;

import android.graphics.Rect;
import android.view.View;
/* loaded from: classes.dex */
public class k implements Runnable {
    public final /* synthetic */ h0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2374b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Rect f2375c;

    public k(e eVar, h0 h0Var, View view, Rect rect) {
        this.a = h0Var;
        this.f2374b = view;
        this.f2375c = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.h(this.f2374b, this.f2375c);
    }
}
