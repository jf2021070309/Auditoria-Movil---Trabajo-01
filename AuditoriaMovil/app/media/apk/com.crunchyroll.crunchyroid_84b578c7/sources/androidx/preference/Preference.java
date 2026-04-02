package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.preference.c;
import androidx.preference.e;
import com.amazon.aps.iva.f3.j;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.l8.h;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public int F;
    public final int G;
    public c H;
    public ArrayList I;
    public PreferenceGroup J;
    public boolean K;
    public e L;
    public f M;
    public final a N;
    public final Context b;
    public androidx.preference.e c;
    public long d;
    public boolean e;
    public d f;
    public int g;
    public int h;
    public CharSequence i;
    public CharSequence j;
    public int k;
    public Drawable l;
    public final String m;
    public Intent n;
    public final String o;
    public Bundle p;
    public boolean q;
    public final boolean r;
    public final boolean s;
    public final String t;
    public final Object u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final boolean y;
    public final boolean z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Preference.this.u(view);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
        }

        public b(AbsSavedState absSavedState) {
            super(absSavedState);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        public final Preference b;

        public e(Preference preference) {
            this.b = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            Preference preference = this.b;
            CharSequence h = preference.h();
            if (preference.D && !TextUtils.isEmpty(h)) {
                contextMenu.setHeaderTitle(h);
                contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Preference preference = this.b;
            CharSequence h = preference.h();
            ((ClipboardManager) preference.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", h));
            Context context = preference.b;
            Toast.makeText(context, context.getString(R.string.preference_copied, h), 0).show();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface f<T extends Preference> {
        CharSequence a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.g = Integer.MAX_VALUE;
        this.h = 0;
        this.q = true;
        this.r = true;
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
        this.b = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.g, i, i2);
        this.k = obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        this.m = j.g(obtainStyledAttributes, 26, 6);
        CharSequence text = obtainStyledAttributes.getText(34);
        this.i = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.j = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.g = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        this.o = j.g(obtainStyledAttributes, 22, 13);
        this.F = obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.G = obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.q = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.r = z;
        this.s = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        this.t = j.g(obtainStyledAttributes, 19, 10);
        this.y = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z));
        this.z = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z));
        if (obtainStyledAttributes.hasValue(18)) {
            this.u = q(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.u = q(obtainStyledAttributes, 11);
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

    public static void w(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    w(viewGroup.getChildAt(childCount), z);
                } else {
                    return;
                }
            }
        }
    }

    public final boolean A() {
        if (this.c != null && this.s && (!TextUtils.isEmpty(this.m))) {
            return true;
        }
        return false;
    }

    public void a(Bundle bundle) {
        Parcelable parcelable;
        String str = this.m;
        if ((!TextUtils.isEmpty(str)) && (parcelable = bundle.getParcelable(str)) != null) {
            this.K = false;
            r(parcelable);
            if (!this.K) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public void b(Bundle bundle) {
        String str = this.m;
        if (!TextUtils.isEmpty(str)) {
            this.K = false;
            Parcelable s = s();
            if (this.K) {
                if (s != null) {
                    bundle.putParcelable(str, s);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
    }

    public long c() {
        return this.d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.g;
        int i2 = preference2.g;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.i;
        CharSequence charSequence2 = preference2.i;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.i.toString());
    }

    public final String f(String str) {
        if (!A()) {
            return str;
        }
        return this.c.c().getString(this.m, str);
    }

    public CharSequence h() {
        f fVar = this.M;
        if (fVar != null) {
            return fVar.a(this);
        }
        return this.j;
    }

    public boolean i() {
        if (this.q && this.v && this.w) {
            return true;
        }
        return false;
    }

    public void j() {
        c cVar = this.H;
        if (cVar != null) {
            androidx.preference.c cVar2 = (androidx.preference.c) cVar;
            int indexOf = cVar2.c.indexOf(this);
            if (indexOf != -1) {
                cVar2.notifyItemChanged(indexOf, this);
            }
        }
    }

    public void k(boolean z) {
        ArrayList arrayList = this.I;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.v == z) {
                preference.v = !z;
                preference.k(preference.z());
                preference.j();
            }
        }
    }

    public void l() {
        PreferenceScreen preferenceScreen;
        String str = this.t;
        if (!TextUtils.isEmpty(str)) {
            androidx.preference.e eVar = this.c;
            Preference preference = null;
            if (eVar != null && (preferenceScreen = eVar.g) != null) {
                preference = preferenceScreen.B(str);
            }
            if (preference != null) {
                if (preference.I == null) {
                    preference.I = new ArrayList();
                }
                preference.I.add(this);
                boolean z = preference.z();
                if (this.v == z) {
                    this.v = !z;
                    k(z());
                    j();
                    return;
                }
                return;
            }
            StringBuilder c2 = q.c("Dependency \"", str, "\" not found for preference \"");
            c2.append(this.m);
            c2.append("\" (title: \"");
            c2.append((Object) this.i);
            c2.append("\"");
            throw new IllegalStateException(c2.toString());
        }
    }

    public final void m(androidx.preference.e eVar) {
        SharedPreferences sharedPreferences;
        long j;
        this.c = eVar;
        if (!this.e) {
            synchronized (eVar) {
                j = eVar.b;
                eVar.b = 1 + j;
            }
            this.d = j;
        }
        if (A()) {
            androidx.preference.e eVar2 = this.c;
            if (eVar2 != null) {
                sharedPreferences = eVar2.c();
            } else {
                sharedPreferences = null;
            }
            if (sharedPreferences.contains(this.m)) {
                t(null);
                return;
            }
        }
        Object obj = this.u;
        if (obj != null) {
            t(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(com.amazon.aps.iva.l8.g r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.n(com.amazon.aps.iva.l8.g):void");
    }

    public void p() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.t;
        if (str != null) {
            androidx.preference.e eVar = this.c;
            Preference preference = null;
            if (eVar != null && (preferenceScreen = eVar.g) != null) {
                preference = preferenceScreen.B(str);
            }
            if (preference != null && (arrayList = preference.I) != null) {
                arrayList.remove(this);
            }
        }
    }

    public Object q(TypedArray typedArray, int i) {
        return null;
    }

    public void r(Parcelable parcelable) {
        this.K = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable s() {
        this.K = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.i;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence h = h();
        if (!TextUtils.isEmpty(h)) {
            sb.append(h);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void u(View view) {
        Intent intent;
        e.c cVar;
        if (i() && this.r) {
            o();
            d dVar = this.f;
            if (dVar != null) {
                androidx.preference.d dVar2 = (androidx.preference.d) dVar;
                dVar2.a.T = Integer.MAX_VALUE;
                androidx.preference.c cVar2 = dVar2.b;
                Handler handler = cVar2.e;
                c.a aVar = cVar2.f;
                handler.removeCallbacks(aVar);
                handler.post(aVar);
                return;
            }
            androidx.preference.e eVar = this.c;
            if ((eVar == null || (cVar = eVar.h) == null || !cVar.nf(this)) && (intent = this.n) != null) {
                this.b.startActivity(intent);
            }
        }
    }

    public final void v(String str) {
        if (!A() || TextUtils.equals(str, f(null))) {
            return;
        }
        SharedPreferences.Editor b2 = this.c.b();
        b2.putString(this.m, str);
        if (!this.c.e) {
            b2.apply();
        }
    }

    public void x(CharSequence charSequence) {
        if (this.M == null) {
            if (!TextUtils.equals(this.j, charSequence)) {
                this.j = charSequence;
                j();
                return;
            }
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    public final void y(boolean z) {
        if (this.x != z) {
            this.x = z;
            c cVar = this.H;
            if (cVar != null) {
                androidx.preference.c cVar2 = (androidx.preference.c) cVar;
                Handler handler = cVar2.e;
                c.a aVar = cVar2.f;
                handler.removeCallbacks(aVar);
                handler.post(aVar);
            }
        }
    }

    public boolean z() {
        return !i();
    }

    public void o() {
    }

    public void t(Object obj) {
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(context, R.attr.preferenceStyle, 16842894));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
