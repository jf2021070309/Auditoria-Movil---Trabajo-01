package c.w;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public Bundle f2827b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2828c;

    /* renamed from: d  reason: collision with root package name */
    public Recreator.a f2829d;
    public c.c.a.b.b<String, b> a = new c.c.a.b.b<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f2830e = true;

    /* renamed from: c.w.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0057a {
        void a(c cVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.f2828c) {
            Bundle bundle = this.f2827b;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                this.f2827b.remove(str);
                if (this.f2827b.isEmpty()) {
                    this.f2827b = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void b(String str, b bVar) {
        if (this.a.d(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void c(Class<? extends InterfaceC0057a> cls) {
        if (!this.f2830e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f2829d == null) {
            this.f2829d = new Recreator.a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.a aVar = this.f2829d;
            aVar.a.add(cls.getName());
        } catch (NoSuchMethodException e2) {
            StringBuilder y = e.a.d.a.a.y("Class");
            y.append(cls.getSimpleName());
            y.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(y.toString(), e2);
        }
    }
}
