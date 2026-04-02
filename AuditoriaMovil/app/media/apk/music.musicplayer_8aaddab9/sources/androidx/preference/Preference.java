package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c.t.f;
import c.t.g;
import c.t.j;
import c.t.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public b H;
    public List<Preference> I;
    public PreferenceGroup J;
    public boolean K;
    public e L;
    public f M;
    public final View.OnClickListener N;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public j f474b;

    /* renamed from: c  reason: collision with root package name */
    public long f475c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f476d;

    /* renamed from: e  reason: collision with root package name */
    public c f477e;

    /* renamed from: f  reason: collision with root package name */
    public d f478f;

    /* renamed from: g  reason: collision with root package name */
    public int f479g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f480h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f481i;

    /* renamed from: j  reason: collision with root package name */
    public int f482j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f483k;

    /* renamed from: l  reason: collision with root package name */
    public String f484l;

    /* renamed from: m  reason: collision with root package name */
    public Intent f485m;

    /* renamed from: n  reason: collision with root package name */
    public String f486n;
    public Bundle o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public String t;
    public Object u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* loaded from: classes.dex */
    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new a();

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<BaseSavedState> {
            @Override // android.os.Parcelable.Creator
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public BaseSavedState[] newArray(int i2) {
                return new BaseSavedState[i2];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.C(view);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(Preference preference, Object obj);
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(Preference preference);
    }

    /* loaded from: classes.dex */
    public static class e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        public final Preference a;

        public e(Preference preference) {
            this.a = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence j2 = this.a.j();
            if (!this.a.D || TextUtils.isEmpty(j2)) {
                return;
            }
            contextMenu.setHeaderTitle(j2);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            CharSequence j2 = this.a.j();
            ((ClipboardManager) this.a.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", j2));
            Context context = this.a.a;
            Toast.makeText(context, context.getString(R.string.preference_copied, j2), 0).show();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface f<T extends Preference> {
        CharSequence a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.i.a.t(context, R.attr.preferenceStyle, 16842894), 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f479g = Integer.MAX_VALUE;
        this.p = true;
        this.q = true;
        this.s = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.B = true;
        this.E = true;
        this.F = R.layout.preference;
        this.N = new a();
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f2572g, i2, i3);
        this.f482j = c.i.a.E(obtainStyledAttributes, 23, 0, 0);
        String string = obtainStyledAttributes.getString(26);
        this.f484l = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f480h = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f481i = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f479g = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = obtainStyledAttributes.getString(22);
        this.f486n = string2 == null ? obtainStyledAttributes.getString(13) : string2;
        this.F = obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.G = obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.p = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        this.q = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.s = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        String string3 = obtainStyledAttributes.getString(19);
        this.t = string3 == null ? obtainStyledAttributes.getString(10) : string3;
        this.y = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, this.q));
        this.z = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, this.q));
        if (obtainStyledAttributes.hasValue(18)) {
            this.u = v(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.u = v(obtainStyledAttributes, 11);
        }
        this.E = obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.A = hasValue;
        if (hasValue) {
            this.B = obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        this.C = obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        this.x = obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        this.D = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public void A(Object obj) {
    }

    @Deprecated
    public void B(Object obj) {
        A(obj);
    }

    public void C(View view) {
        j.c cVar;
        if (l() && this.q) {
            s();
            d dVar = this.f478f;
            if (dVar == null || !dVar.a(this)) {
                j jVar = this.f474b;
                if (jVar != null && (cVar = jVar.f2558h) != null) {
                    c.t.f fVar = (c.t.f) cVar;
                    boolean z = true;
                    if (this.f486n != null) {
                        boolean z2 = false;
                        for (Fragment fragment = fVar; !z2 && fragment != null; fragment = fragment.getParentFragment()) {
                            if (fragment instanceof f.e) {
                                z2 = ((f.e) fragment).a(fVar, this);
                            }
                        }
                        if (!z2 && (fVar.getContext() instanceof f.e)) {
                            z2 = ((f.e) fVar.getContext()).a(fVar, this);
                        }
                        if (!z2 && (fVar.getActivity() instanceof f.e)) {
                            z2 = ((f.e) fVar.getActivity()).a(fVar, this);
                        }
                        if (!z2) {
                            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                            FragmentManager parentFragmentManager = fVar.getParentFragmentManager();
                            if (this.o == null) {
                                this.o = new Bundle();
                            }
                            Bundle bundle = this.o;
                            Fragment a2 = parentFragmentManager.H().a(fVar.requireActivity().getClassLoader(), this.f486n);
                            a2.setArguments(bundle);
                            a2.setTargetFragment(fVar, 0);
                            c.m.b.d dVar2 = new c.m.b.d(parentFragmentManager);
                            dVar2.e(((View) fVar.requireView().getParent()).getId(), a2);
                            if (!dVar2.f2321h) {
                                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                            }
                            dVar2.f2320g = true;
                            dVar2.f2322i = null;
                            dVar2.c();
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                }
                Intent intent = this.f485m;
                if (intent != null) {
                    this.a.startActivity(intent);
                }
            }
        }
    }

    public boolean D(String str) {
        if (M()) {
            if (TextUtils.equals(str, g(null))) {
                return true;
            }
            i();
            SharedPreferences.Editor b2 = this.f474b.b();
            b2.putString(this.f484l, str);
            if (!this.f474b.f2555e) {
                b2.apply();
            }
            return true;
        }
        return false;
    }

    public final void E(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                E(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void F(boolean z) {
        if (this.C != z) {
            this.C = z;
            m();
        }
    }

    public void G(String str) {
        this.f484l = str;
        if (!this.r || k()) {
            return;
        }
        if (TextUtils.isEmpty(this.f484l)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.r = true;
    }

    public void H(CharSequence charSequence) {
        if (this.M != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f481i, charSequence)) {
            return;
        }
        this.f481i = charSequence;
        m();
    }

    public void I(int i2) {
        J(this.a.getString(i2));
    }

    public void J(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f480h)) {
            return;
        }
        this.f480h = charSequence;
        m();
    }

    public final void K(boolean z) {
        if (this.x != z) {
            this.x = z;
            b bVar = this.H;
            if (bVar != null) {
                g gVar = (g) bVar;
                gVar.f2542h.removeCallbacks(gVar.f2543i);
                gVar.f2542h.post(gVar.f2543i);
            }
        }
    }

    public boolean L() {
        return !l();
    }

    public boolean M() {
        return this.f474b != null && this.s && k();
    }

    public final void N() {
        List<Preference> list;
        PreferenceScreen preferenceScreen;
        String str = this.t;
        if (str != null) {
            j jVar = this.f474b;
            Preference preference = null;
            if (jVar != null && (preferenceScreen = jVar.f2557g) != null) {
                preference = preferenceScreen.P(str);
            }
            if (preference == null || (list = preference.I) == null) {
                return;
            }
            list.remove(this);
        }
    }

    public boolean a(Object obj) {
        c cVar = this.f477e;
        return cVar == null || cVar.a(this, obj);
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        if (!k() || (parcelable = bundle.getParcelable(this.f484l)) == null) {
            return;
        }
        this.K = false;
        y(parcelable);
        if (!this.K) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void c(Bundle bundle) {
        if (k()) {
            this.K = false;
            Parcelable z = z();
            if (!this.K) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (z != null) {
                bundle.putParcelable(this.f484l, z);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i2 = this.f479g;
        int i3 = preference2.f479g;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.f480h;
        CharSequence charSequence2 = preference2.f480h;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f480h.toString());
    }

    public long d() {
        return this.f475c;
    }

    public boolean e(boolean z) {
        if (M()) {
            i();
            return this.f474b.c().getBoolean(this.f484l, z);
        }
        return z;
    }

    public int f(int i2) {
        if (M()) {
            i();
            return this.f474b.c().getInt(this.f484l, i2);
        }
        return i2;
    }

    public String g(String str) {
        if (M()) {
            i();
            return this.f474b.c().getString(this.f484l, str);
        }
        return str;
    }

    public Set<String> h(Set<String> set) {
        if (M()) {
            i();
            return this.f474b.c().getStringSet(this.f484l, set);
        }
        return set;
    }

    public void i() {
        j jVar = this.f474b;
    }

    public CharSequence j() {
        f fVar = this.M;
        return fVar != null ? fVar.a(this) : this.f481i;
    }

    public boolean k() {
        return !TextUtils.isEmpty(this.f484l);
    }

    public boolean l() {
        return this.p && this.v && this.w;
    }

    public void m() {
        b bVar = this.H;
        if (bVar != null) {
            g gVar = (g) bVar;
            int indexOf = gVar.f2540f.indexOf(this);
            if (indexOf != -1) {
                gVar.e(indexOf, this);
            }
        }
    }

    public void n(boolean z) {
        List<Preference> list = this.I;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).t(z);
        }
    }

    public void o() {
        b bVar = this.H;
        if (bVar != null) {
            g gVar = (g) bVar;
            gVar.f2542h.removeCallbacks(gVar.f2543i);
            gVar.f2542h.post(gVar.f2543i);
        }
    }

    public void p() {
        PreferenceScreen preferenceScreen;
        if (TextUtils.isEmpty(this.t)) {
            return;
        }
        String str = this.t;
        j jVar = this.f474b;
        Preference preference = null;
        if (jVar != null && (preferenceScreen = jVar.f2557g) != null) {
            preference = preferenceScreen.P(str);
        }
        if (preference != null) {
            if (preference.I == null) {
                preference.I = new ArrayList();
            }
            preference.I.add(this);
            t(preference.L());
            return;
        }
        StringBuilder y = e.a.d.a.a.y("Dependency \"");
        y.append(this.t);
        y.append("\" not found for preference \"");
        y.append(this.f484l);
        y.append("\" (title: \"");
        y.append((Object) this.f480h);
        y.append("\"");
        throw new IllegalStateException(y.toString());
    }

    public void q(j jVar) {
        SharedPreferences sharedPreferences;
        long j2;
        this.f474b = jVar;
        if (!this.f476d) {
            synchronized (jVar) {
                j2 = jVar.f2552b;
                jVar.f2552b = 1 + j2;
            }
            this.f475c = j2;
        }
        i();
        if (M()) {
            if (this.f474b != null) {
                i();
                sharedPreferences = this.f474b.c();
            } else {
                sharedPreferences = null;
            }
            if (sharedPreferences.contains(this.f484l)) {
                B(null);
                return;
            }
        }
        Object obj = this.u;
        if (obj != null) {
            B(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(c.t.l r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.r(c.t.l):void");
    }

    public void s() {
    }

    public void t(boolean z) {
        if (this.v == z) {
            this.v = !z;
            n(L());
            m();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f480h;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence j2 = j();
        if (!TextUtils.isEmpty(j2)) {
            sb.append(j2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void u() {
        N();
    }

    public Object v(TypedArray typedArray, int i2) {
        return null;
    }

    @Deprecated
    public void w() {
    }

    public void x(boolean z) {
        if (this.w == z) {
            this.w = !z;
            n(L());
            m();
        }
    }

    public void y(Parcelable parcelable) {
        this.K = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable z() {
        this.K = true;
        return AbsSavedState.EMPTY_STATE;
    }
}
