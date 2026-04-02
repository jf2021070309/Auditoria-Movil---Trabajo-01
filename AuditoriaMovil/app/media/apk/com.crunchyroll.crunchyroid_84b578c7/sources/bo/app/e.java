package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.coroutine.BrazeCoroutineScope;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class e implements SharedPreferences {
    private final Context a;
    private final String b;
    private SharedPreferences c;
    private final com.amazon.aps.iva.se0.j1 d;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;

        public a(com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            if (this.b == 0) {
                com.amazon.aps.iva.ab.x.i0(obj);
                e.this.a.getSharedPreferences(e.this.b, 0);
                return com.amazon.aps.iva.kb0.q.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;

        public b(com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new b(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.se0.j1 j1Var = e.this.d;
                this.b = 1;
                if (j1Var.N(this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public e(Context context, String str) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = context;
        this.b = str;
        this.d = com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new a(null), 3);
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        a();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null) {
            return sharedPreferences.contains(str);
        }
        com.amazon.aps.iva.yb0.j.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        a();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            com.amazon.aps.iva.yb0.j.e(edit, "prefs.edit()");
            return edit;
        }
        com.amazon.aps.iva.yb0.j.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        a();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null) {
            Map<String, ?> all = sharedPreferences.getAll();
            com.amazon.aps.iva.yb0.j.e(all, "prefs.all");
            return all;
        }
        com.amazon.aps.iva.yb0.j.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        a();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(str, z);
        }
        com.amazon.aps.iva.yb0.j.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        a();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null) {
            return sharedPreferences.getFloat(str, f);
        }
        com.amazon.aps.iva.yb0.j.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        a();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, i);
        }
        com.amazon.aps.iva.yb0.j.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        a();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(str, j);
        }
        com.amazon.aps.iva.yb0.j.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        a();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(str, str2);
        }
        com.amazon.aps.iva.yb0.j.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        a();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null) {
            return sharedPreferences.getStringSet(str, set);
        }
        com.amazon.aps.iva.yb0.j.m("prefs");
        throw null;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        } else {
            com.amazon.aps.iva.yb0.j.m("prefs");
            throw null;
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        } else {
            com.amazon.aps.iva.yb0.j.m("prefs");
            throw null;
        }
    }

    private final void a() {
        if (!this.d.c()) {
            com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new b(null));
        }
        SharedPreferences sharedPreferences = this.a.getSharedPreferences(this.b, 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        this.c = sharedPreferences;
    }
}
