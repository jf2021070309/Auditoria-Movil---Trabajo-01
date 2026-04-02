package c.m.b;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentManager;
/* loaded from: classes.dex */
public abstract class v<E> extends r {
    public final Activity a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2408b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f2409c;

    /* renamed from: d  reason: collision with root package name */
    public final FragmentManager f2410d;

    public v(o oVar) {
        Handler handler = new Handler();
        this.f2410d = new y();
        this.a = oVar;
        c.i.a.i(oVar, "context == null");
        this.f2408b = oVar;
        c.i.a.i(handler, "handler == null");
        this.f2409c = handler;
    }

    public abstract E d();

    public abstract LayoutInflater e();

    public abstract boolean f(String str);

    public abstract void g();
}
