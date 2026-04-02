package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
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
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j;
import androidx.preference.DialogPreference;
import androidx.preference.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.l8.g;
import com.amazon.aps.iva.l8.h;
import com.crunchyroll.crunchyroid.R;
/* compiled from: PreferenceFragmentCompat.java */
/* loaded from: classes.dex */
public abstract class b extends Fragment implements e.c, e.a, e.b, DialogPreference.a {
    public androidx.preference.e c;
    public RecyclerView d;
    public boolean e;
    public boolean f;
    public final c b = new c();
    public int g = R.layout.preference_list_fragment;
    public final a h = new a(Looper.getMainLooper());
    public final RunnableC0051b i = new RunnableC0051b();

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                b bVar = b.this;
                PreferenceScreen preferenceScreen = bVar.c.g;
                if (preferenceScreen != null) {
                    bVar.d.setAdapter(new androidx.preference.c(preferenceScreen));
                    preferenceScreen.l();
                }
            }
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* renamed from: androidx.preference.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0051b implements Runnable {
        public RunnableC0051b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = b.this.d;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    public class c extends RecyclerView.o {
        public Drawable a;
        public int b;
        public boolean c = true;

        public c() {
        }

        public final boolean f(RecyclerView recyclerView, View view) {
            boolean z;
            RecyclerView.f0 childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z2 = false;
            if ((childViewHolder instanceof g) && ((g) childViewHolder).f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            boolean z3 = this.c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild < recyclerView.getChildCount() - 1) {
                RecyclerView.f0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
                if ((childViewHolder2 instanceof g) && ((g) childViewHolder2).e) {
                    z2 = true;
                }
                return z2;
            }
            return z3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            if (f(recyclerView, view)) {
                rect.bottom = this.b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            if (this.a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (f(recyclerView, childAt)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.a.setBounds(0, height, width, this.b + height);
                    this.a.draw(canvas);
                }
            }
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    public interface d {
        boolean a();
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        boolean a();
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* loaded from: classes.dex */
    public interface f {
        boolean a();
    }

    @Override // androidx.preference.DialogPreference.a
    public final <T extends Preference> T G4(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        androidx.preference.e eVar = this.c;
        if (eVar == null || (preferenceScreen = eVar.g) == null) {
            return null;
        }
        return (T) preferenceScreen.B(charSequence);
    }

    public abstract void ci(String str);

    public RecyclerView di(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView2.setAccessibilityDelegateCompat(new com.amazon.aps.iva.l8.f(recyclerView2));
        return recyclerView2;
    }

    public void ei(Drawable drawable) {
        c cVar = this.b;
        if (drawable != null) {
            cVar.getClass();
            cVar.b = drawable.getIntrinsicHeight();
        } else {
            cVar.b = 0;
        }
        cVar.a = drawable;
        b.this.d.invalidateItemDecorations();
    }

    public void fi(int i) {
        c cVar = this.b;
        cVar.b = i;
        b.this.d.invalidateItemDecorations();
    }

    public final void gi(int i, String str) {
        androidx.preference.e eVar = this.c;
        if (eVar != null) {
            Context requireContext = requireContext();
            eVar.e = true;
            com.amazon.aps.iva.l8.e eVar2 = new com.amazon.aps.iva.l8.e(requireContext, eVar);
            XmlResourceParser xml = requireContext.getResources().getXml(i);
            try {
                PreferenceGroup c2 = eVar2.c(xml);
                xml.close();
                PreferenceScreen preferenceScreen = (PreferenceScreen) c2;
                preferenceScreen.m(eVar);
                SharedPreferences.Editor editor = eVar.d;
                if (editor != null) {
                    editor.apply();
                }
                boolean z = false;
                eVar.e = false;
                Object obj = preferenceScreen;
                if (str != null) {
                    Object B = preferenceScreen.B(str);
                    boolean z2 = B instanceof PreferenceScreen;
                    obj = B;
                    if (!z2) {
                        throw new IllegalArgumentException(defpackage.e.e("Preference object with key ", str, " is not a PreferenceScreen"));
                    }
                }
                PreferenceScreen preferenceScreen2 = (PreferenceScreen) obj;
                androidx.preference.e eVar3 = this.c;
                PreferenceScreen preferenceScreen3 = eVar3.g;
                if (preferenceScreen2 != preferenceScreen3) {
                    if (preferenceScreen3 != null) {
                        preferenceScreen3.p();
                    }
                    eVar3.g = preferenceScreen2;
                    z = true;
                }
                if (z && preferenceScreen2 != null) {
                    this.e = true;
                    if (this.f) {
                        a aVar = this.h;
                        if (!aVar.hasMessages(1)) {
                            aVar.obtainMessage(1).sendToTarget();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    @Override // androidx.preference.e.c
    public boolean nf(Preference preference) {
        if (preference.o == null) {
            return false;
        }
        boolean z = false;
        for (Fragment fragment = this; !z && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof e) {
                z = ((e) fragment).a();
            }
        }
        if (!z && (getContext() instanceof e)) {
            z = ((e) getContext()).a();
        }
        if (!z && (getActivity() instanceof e)) {
            z = ((e) getActivity()).a();
        }
        if (!z) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (preference.p == null) {
                preference.p = new Bundle();
            }
            Bundle bundle = preference.p;
            j F = parentFragmentManager.F();
            requireActivity().getClassLoader();
            Fragment a2 = F.a(preference.o);
            a2.setArguments(bundle);
            a2.setTargetFragment(this, 0);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.e(((View) requireView().getParent()).getId(), a2, null);
            aVar.c(null);
            aVar.h();
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        androidx.preference.e eVar = new androidx.preference.e(requireContext());
        this.c = eVar;
        eVar.j = this;
        if (getArguments() != null) {
            str = getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            str = null;
        }
        ci(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, h.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.g = obtainStyledAttributes.getResourceId(0, this.g);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.g, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView di = di(cloneInContext, viewGroup2, bundle);
            if (di != null) {
                this.d = di;
                c cVar = this.b;
                di.addItemDecoration(cVar);
                ei(drawable);
                if (dimensionPixelSize != -1) {
                    fi(dimensionPixelSize);
                }
                cVar.c = z;
                if (this.d.getParent() == null) {
                    viewGroup2.addView(this.d);
                }
                this.h.post(this.i);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RunnableC0051b runnableC0051b = this.i;
        a aVar = this.h;
        aVar.removeCallbacks(runnableC0051b);
        aVar.removeMessages(1);
        if (this.e) {
            this.d.setAdapter(null);
            PreferenceScreen preferenceScreen = this.c.g;
            if (preferenceScreen != null) {
                preferenceScreen.p();
            }
        }
        this.d = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = this.c.g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.b(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        androidx.preference.e eVar = this.c;
        eVar.h = this;
        eVar.i = this;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        androidx.preference.e eVar = this.c;
        eVar.h = null;
        eVar.i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.c.g) != null) {
            preferenceScreen2.a(bundle2);
        }
        if (this.e && (preferenceScreen = this.c.g) != null) {
            this.d.setAdapter(new androidx.preference.c(preferenceScreen));
            preferenceScreen.l();
        }
        this.f = true;
    }
}
