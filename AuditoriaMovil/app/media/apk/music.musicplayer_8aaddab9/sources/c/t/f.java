package c.t;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.t.j;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public abstract class f extends Fragment implements j.c, j.a, j.b, DialogPreference.a {

    /* renamed from: b  reason: collision with root package name */
    public j f2528b;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f2529c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2530d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2531e;
    public final c a = new c();

    /* renamed from: f  reason: collision with root package name */
    public int f2532f = R.layout.preference_list_fragment;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f2533g = new a(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f2534h = new b();

    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            f fVar = f.this;
            PreferenceScreen preferenceScreen = fVar.f2528b.f2557g;
            if (preferenceScreen != null) {
                fVar.f2529c.setAdapter(new g(preferenceScreen));
                preferenceScreen.p();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = f.this.f2529c;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public class c extends RecyclerView.l {
        public Drawable a;

        /* renamed from: b  reason: collision with root package name */
        public int f2535b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2536c = true;

        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
            if (i(view, recyclerView)) {
                rect.bottom = this.f2535b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
            if (this.a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (i(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.a.setBounds(0, height, width, this.f2535b + height);
                    this.a.draw(canvas);
                }
            }
        }

        public final boolean i(View view, RecyclerView recyclerView) {
            RecyclerView.a0 M = recyclerView.M(view);
            boolean z = false;
            if ((M instanceof l) && ((l) M).y) {
                boolean z2 = this.f2536c;
                int indexOfChild = recyclerView.indexOfChild(view);
                if (indexOfChild < recyclerView.getChildCount() - 1) {
                    RecyclerView.a0 M2 = recyclerView.M(recyclerView.getChildAt(indexOfChild + 1));
                    if ((M2 instanceof l) && ((l) M2).x) {
                        z = true;
                    }
                    return z;
                }
                return z2;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(f fVar, Preference preference);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(f fVar, Preference preference);
    }

    /* renamed from: c.t.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0053f {
        boolean a(f fVar, PreferenceScreen preferenceScreen);
    }

    @Override // androidx.preference.DialogPreference.a
    public <T extends Preference> T a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        j jVar = this.f2528b;
        if (jVar == null || (preferenceScreen = jVar.f2557g) == null) {
            return null;
        }
        return (T) preferenceScreen.P(charSequence);
    }

    public abstract void b(Bundle bundle, String str);

    public RecyclerView c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) == null) {
            RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
            recyclerView2.setAccessibilityDelegateCompat(new k(recyclerView2));
            return recyclerView2;
        }
        return recyclerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i2, false);
        j jVar = new j(requireContext());
        this.f2528b = jVar;
        jVar.f2560j = this;
        b(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, n.f2573h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f2532f = obtainStyledAttributes.getResourceId(0, this.f2532f);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.f2532f, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView c2 = c(cloneInContext, viewGroup2);
            if (c2 != null) {
                this.f2529c = c2;
                c2.j(this.a);
                c cVar = this.a;
                Objects.requireNonNull(cVar);
                if (drawable != null) {
                    cVar.f2535b = drawable.getIntrinsicHeight();
                } else {
                    cVar.f2535b = 0;
                }
                cVar.a = drawable;
                f.this.f2529c.R();
                if (dimensionPixelSize != -1) {
                    c cVar2 = this.a;
                    cVar2.f2535b = dimensionPixelSize;
                    f.this.f2529c.R();
                }
                this.a.f2536c = z;
                if (this.f2529c.getParent() == null) {
                    viewGroup2.addView(this.f2529c);
                }
                this.f2533g.post(this.f2534h);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f2533g.removeCallbacks(this.f2534h);
        this.f2533g.removeMessages(1);
        if (this.f2530d) {
            this.f2529c.setAdapter(null);
            PreferenceScreen preferenceScreen = this.f2528b.f2557g;
            if (preferenceScreen != null) {
                preferenceScreen.u();
            }
        }
        this.f2529c = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = this.f2528b.f2557g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        j jVar = this.f2528b;
        jVar.f2558h = this;
        jVar.f2559i = this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        j jVar = this.f2528b;
        jVar.f2558h = null;
        jVar.f2559i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.f2528b.f2557g) != null) {
            preferenceScreen2.b(bundle2);
        }
        if (this.f2530d && (preferenceScreen = this.f2528b.f2557g) != null) {
            this.f2529c.setAdapter(new g(preferenceScreen));
            preferenceScreen.p();
        }
        this.f2531e = true;
    }
}
