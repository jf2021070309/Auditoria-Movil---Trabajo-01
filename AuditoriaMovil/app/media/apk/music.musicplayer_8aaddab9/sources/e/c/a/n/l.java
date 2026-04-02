package e.c.a.n;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class l implements Handler.Callback {
    public static final b a = new a();

    /* renamed from: b  reason: collision with root package name */
    public volatile e.c.a.i f5959b;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f5962e;

    /* renamed from: f  reason: collision with root package name */
    public final b f5963f;

    /* renamed from: c  reason: collision with root package name */
    public final Map<FragmentManager, k> f5960c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<androidx.fragment.app.FragmentManager, o> f5961d = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final c.f.a<View, Fragment> f5964g = new c.f.a<>();

    /* renamed from: h  reason: collision with root package name */
    public final c.f.a<View, android.app.Fragment> f5965h = new c.f.a<>();

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f5966i = new Bundle();

    /* loaded from: classes.dex */
    public class a implements b {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public l(b bVar) {
        this.f5963f = bVar == null ? a : bVar;
        this.f5962e = new Handler(Looper.getMainLooper(), this);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean h(Context context) {
        Activity a2 = a(context);
        return a2 == null || !a2.isFinishing();
    }

    @Deprecated
    public final e.c.a.i b(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        k f2 = f(fragmentManager, fragment, z);
        e.c.a.i iVar = f2.f5956d;
        if (iVar == null) {
            e.c.a.b b2 = e.c.a.b.b(context);
            b bVar = this.f5963f;
            e.c.a.n.a aVar = f2.a;
            m mVar = f2.f5954b;
            Objects.requireNonNull((a) bVar);
            e.c.a.i iVar2 = new e.c.a.i(b2, aVar, mVar, context);
            f2.f5956d = iVar2;
            return iVar2;
        }
        return iVar;
    }

    public e.c.a.i c(Activity activity) {
        if (e.c.a.s.j.g()) {
            return d(activity.getApplicationContext());
        }
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        return b(activity, activity.getFragmentManager(), null, h(activity));
    }

    public e.c.a.i d(Context context) {
        if (context != null) {
            if (e.c.a.s.j.h() && !(context instanceof Application)) {
                if (context instanceof c.m.b.o) {
                    return e((c.m.b.o) context);
                }
                if (context instanceof Activity) {
                    return c((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return d(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f5959b == null) {
                synchronized (this) {
                    if (this.f5959b == null) {
                        e.c.a.b b2 = e.c.a.b.b(context.getApplicationContext());
                        b bVar = this.f5963f;
                        e.c.a.n.b bVar2 = new e.c.a.n.b();
                        g gVar = new g();
                        Context applicationContext = context.getApplicationContext();
                        Objects.requireNonNull((a) bVar);
                        this.f5959b = new e.c.a.i(b2, bVar2, gVar, applicationContext);
                    }
                }
            }
            return this.f5959b;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public e.c.a.i e(c.m.b.o oVar) {
        if (e.c.a.s.j.g()) {
            return d(oVar.getApplicationContext());
        }
        if (oVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        return i(oVar, oVar.getSupportFragmentManager(), null, h(oVar));
    }

    public final k f(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        k kVar = (k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null && (kVar = this.f5960c.get(fragmentManager)) == null) {
            kVar = new k();
            kVar.f5958f = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                kVar.a(fragment.getActivity());
            }
            if (z) {
                kVar.a.d();
            }
            this.f5960c.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f5962e.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    public final o g(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        o oVar = (o) fragmentManager.F("com.bumptech.glide.manager");
        if (oVar == null && (oVar = this.f5961d.get(fragmentManager)) == null) {
            oVar = new o();
            oVar.f5973f = fragment;
            if (fragment != null && fragment.getContext() != null) {
                Fragment fragment2 = fragment;
                while (fragment2.getParentFragment() != null) {
                    fragment2 = fragment2.getParentFragment();
                }
                androidx.fragment.app.FragmentManager fragmentManager2 = fragment2.getFragmentManager();
                if (fragmentManager2 != null) {
                    oVar.c(fragment.getContext(), fragmentManager2);
                }
            }
            if (z) {
                oVar.a.d();
            }
            this.f5961d.put(fragmentManager, oVar);
            c.m.b.d dVar = new c.m.b.d(fragmentManager);
            dVar.d(0, oVar, "com.bumptech.glide.manager", 1);
            dVar.g();
            this.f5962e.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return oVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object remove;
        Object obj2;
        int i2 = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i2 == 1) {
            obj = (FragmentManager) message.obj;
            remove = this.f5960c.remove(obj);
        } else if (i2 != 2) {
            z = false;
            obj2 = null;
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z;
        } else {
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            remove = this.f5961d.remove(obj);
        }
        Object obj4 = obj;
        obj3 = remove;
        obj2 = obj4;
        if (z) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z;
    }

    public final e.c.a.i i(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        o g2 = g(fragmentManager, fragment, z);
        e.c.a.i iVar = g2.f5972e;
        if (iVar == null) {
            e.c.a.b b2 = e.c.a.b.b(context);
            b bVar = this.f5963f;
            e.c.a.n.a aVar = g2.a;
            m mVar = g2.f5969b;
            Objects.requireNonNull((a) bVar);
            e.c.a.i iVar2 = new e.c.a.i(b2, aVar, mVar, context);
            g2.f5972e = iVar2;
            return iVar2;
        }
        return iVar;
    }
}
