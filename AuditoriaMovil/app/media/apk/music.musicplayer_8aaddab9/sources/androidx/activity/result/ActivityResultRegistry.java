package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import c.p.j;
import c.p.n;
import c.p.p;
import c.p.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    public Random a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, String> f93b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Integer> f94c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, d> f95d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f96e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient Map<String, c<?>> f97f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, Object> f98g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f99h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends c.a.h.b<I> {
        public final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c.a.h.d.a f103b;

        public a(String str, c.a.h.d.a aVar) {
            this.a = str;
            this.f103b = aVar;
        }

        @Override // c.a.h.b
        public void a(I i2, c.i.c.d dVar) {
            Integer num = ActivityResultRegistry.this.f94c.get(this.a);
            if (num != null) {
                ActivityResultRegistry.this.f96e.add(this.a);
                try {
                    ActivityResultRegistry.this.b(num.intValue(), this.f103b, i2, dVar);
                    return;
                } catch (Exception e2) {
                    ActivityResultRegistry.this.f96e.remove(this.a);
                    throw e2;
                }
            }
            StringBuilder y = e.a.d.a.a.y("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            y.append(this.f103b);
            y.append(" and input ");
            y.append(i2);
            y.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(y.toString());
        }

        @Override // c.a.h.b
        public void b() {
            ActivityResultRegistry.this.f(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class b<I> extends c.a.h.b<I> {
        public final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c.a.h.d.a f105b;

        public b(String str, c.a.h.d.a aVar) {
            this.a = str;
            this.f105b = aVar;
        }

        @Override // c.a.h.b
        public void a(I i2, c.i.c.d dVar) {
            Integer num = ActivityResultRegistry.this.f94c.get(this.a);
            if (num != null) {
                ActivityResultRegistry.this.f96e.add(this.a);
                ActivityResultRegistry.this.b(num.intValue(), this.f105b, i2, dVar);
                return;
            }
            StringBuilder y = e.a.d.a.a.y("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            y.append(this.f105b);
            y.append(" and input ");
            y.append(i2);
            y.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(y.toString());
        }

        @Override // c.a.h.b
        public void b() {
            ActivityResultRegistry.this.f(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class c<O> {
        public final c.a.h.a<O> a;

        /* renamed from: b  reason: collision with root package name */
        public final c.a.h.d.a<?, O> f107b;

        public c(c.a.h.a<O> aVar, c.a.h.d.a<?, O> aVar2) {
            this.a = aVar;
            this.f107b = aVar2;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final j a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<n> f108b = new ArrayList<>();

        public d(j jVar) {
            this.a = jVar;
        }
    }

    public final boolean a(int i2, int i3, Intent intent) {
        String str = this.f93b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f97f.get(str);
        if (cVar == null || cVar.a == null || !this.f96e.contains(str)) {
            this.f98g.remove(str);
            this.f99h.putParcelable(str, new ActivityResult(i3, intent));
            return true;
        }
        cVar.a.a(cVar.f107b.c(i3, intent));
        this.f96e.remove(str);
        return true;
    }

    public abstract <I, O> void b(int i2, c.a.h.d.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i3, c.i.c.d dVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> c.a.h.b<I> c(String str, c.a.h.d.a<I, O> aVar, c.a.h.a<O> aVar2) {
        e(str);
        this.f97f.put(str, new c<>(aVar2, aVar));
        if (this.f98g.containsKey(str)) {
            Object obj = this.f98g.get(str);
            this.f98g.remove(str);
            aVar2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f99h.getParcelable(str);
        if (activityResult != null) {
            this.f99h.remove(str);
            aVar2.a(aVar.c(activityResult.a, activityResult.f92b));
        }
        return new b(str, aVar);
    }

    public final <I, O> c.a.h.b<I> d(final String str, p pVar, final c.a.h.d.a<I, O> aVar, final c.a.h.a<O> aVar2) {
        j lifecycle = pVar.getLifecycle();
        r rVar = (r) lifecycle;
        if (rVar.f2467c.isAtLeast(j.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + pVar + " is attempting to register while current state is " + rVar.f2467c + ". LifecycleOwners must call register before they are STARTED.");
        }
        e(str);
        d dVar = this.f95d.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        n nVar = new n() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // c.p.n
            public void c(p pVar2, j.a aVar3) {
                if (!j.a.ON_START.equals(aVar3)) {
                    if (j.a.ON_STOP.equals(aVar3)) {
                        ActivityResultRegistry.this.f97f.remove(str);
                        return;
                    } else if (j.a.ON_DESTROY.equals(aVar3)) {
                        ActivityResultRegistry.this.f(str);
                        return;
                    } else {
                        return;
                    }
                }
                ActivityResultRegistry.this.f97f.put(str, new c<>(aVar2, aVar));
                if (ActivityResultRegistry.this.f98g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f98g.get(str);
                    ActivityResultRegistry.this.f98g.remove(str);
                    aVar2.a(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f99h.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f99h.remove(str);
                    aVar2.a(aVar.c(activityResult.a, activityResult.f92b));
                }
            }
        };
        dVar.a.a(nVar);
        dVar.f108b.add(nVar);
        this.f95d.put(str, dVar);
        return new a(str, aVar);
    }

    public final void e(String str) {
        if (this.f94c.get(str) != null) {
            return;
        }
        int nextInt = this.a.nextInt(2147418112);
        while (true) {
            int i2 = nextInt + 65536;
            if (!this.f93b.containsKey(Integer.valueOf(i2))) {
                this.f93b.put(Integer.valueOf(i2), str);
                this.f94c.put(str, Integer.valueOf(i2));
                return;
            }
            nextInt = this.a.nextInt(2147418112);
        }
    }

    public final void f(String str) {
        Integer remove;
        if (!this.f96e.contains(str) && (remove = this.f94c.remove(str)) != null) {
            this.f93b.remove(remove);
        }
        this.f97f.remove(str);
        if (this.f98g.containsKey(str)) {
            StringBuilder B = e.a.d.a.a.B("Dropping pending result for request ", str, ": ");
            B.append(this.f98g.get(str));
            Log.w("ActivityResultRegistry", B.toString());
            this.f98g.remove(str);
        }
        if (this.f99h.containsKey(str)) {
            StringBuilder B2 = e.a.d.a.a.B("Dropping pending result for request ", str, ": ");
            B2.append(this.f99h.getParcelable(str));
            Log.w("ActivityResultRegistry", B2.toString());
            this.f99h.remove(str);
        }
        d dVar = this.f95d.get(str);
        if (dVar != null) {
            Iterator<n> it = dVar.f108b.iterator();
            while (it.hasNext()) {
                dVar.a.b(it.next());
            }
            dVar.f108b.clear();
            this.f95d.remove(str);
        }
    }
}
