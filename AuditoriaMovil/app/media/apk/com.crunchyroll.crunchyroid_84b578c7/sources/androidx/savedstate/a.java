package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.savedstate.Recreator;
import com.amazon.aps.iva.s.b;
import com.amazon.aps.iva.s8.c;
import com.amazon.aps.iva.yb0.j;
import java.util.Iterator;
import java.util.Map;
/* compiled from: SavedStateRegistry.kt */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class a {
    public boolean b;
    public Bundle c;
    public boolean d;
    public Recreator.a e;
    public final com.amazon.aps.iva.s.b<String, b> a = new com.amazon.aps.iva.s.b<>();
    public boolean f = true;

    /* compiled from: SavedStateRegistry.kt */
    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0059a {
        void a(c cVar);
    }

    /* compiled from: SavedStateRegistry.kt */
    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public final Bundle a(String str) {
        Bundle bundle;
        j.f(str, "key");
        if (this.d) {
            Bundle bundle2 = this.c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.c;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final b b() {
        Map.Entry entry;
        b bVar;
        Iterator<Map.Entry<String, b>> it = this.a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                entry = (Map.Entry) eVar.next();
                j.e(entry, "components");
                bVar = (b) entry.getValue();
            } else {
                return null;
            }
        } while (!j.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    public final void c(String str, b bVar) {
        boolean z;
        j.f(str, "key");
        j.f(bVar, "provider");
        if (this.a.d(str, bVar) == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    public final void d() {
        if (this.f) {
            Recreator.a aVar = this.e;
            if (aVar == null) {
                aVar = new Recreator.a(this);
            }
            this.e = aVar;
            try {
                f.a.class.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar2 = this.e;
                if (aVar2 != null) {
                    aVar2.a.add(f.a.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + f.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
