package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import androidx.lifecycle.g;
import com.amazon.aps.iva.c3.a0;
import com.amazon.aps.iva.c3.z;
import com.amazon.aps.iva.i5.h0;
import com.amazon.aps.iva.n4.e0;
import com.amazon.aps.iva.n4.g0;
import com.amazon.aps.iva.n4.v;
import com.crunchyroll.crunchyroid.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class FragmentManager {
    public com.amazon.aps.iva.h.e B;
    public com.amazon.aps.iva.h.e C;
    public com.amazon.aps.iva.h.e D;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList<androidx.fragment.app.a> K;
    public ArrayList<Boolean> L;
    public ArrayList<Fragment> M;
    public androidx.fragment.app.n N;
    public boolean b;
    public ArrayList<androidx.fragment.app.a> d;
    public ArrayList<Fragment> e;
    public OnBackPressedDispatcher g;
    public ArrayList<o> m;
    public com.amazon.aps.iva.n4.n<?> v;
    public com.amazon.aps.iva.n4.l w;
    public Fragment x;
    public Fragment y;
    public final ArrayList<p> a = new ArrayList<>();
    public final androidx.fragment.app.q c = new androidx.fragment.app.q();
    public final androidx.fragment.app.k f = new androidx.fragment.app.k(this);
    public final b h = new b();
    public final AtomicInteger i = new AtomicInteger();
    public final Map<String, com.amazon.aps.iva.n4.b> j = Collections.synchronizedMap(new HashMap());
    public final Map<String, Bundle> k = Collections.synchronizedMap(new HashMap());
    public final Map<String, n> l = Collections.synchronizedMap(new HashMap());
    public final androidx.fragment.app.l n = new androidx.fragment.app.l(this);
    public final CopyOnWriteArrayList<com.amazon.aps.iva.n4.u> o = new CopyOnWriteArrayList<>();
    public final com.amazon.aps.iva.n4.o p = new com.amazon.aps.iva.o3.a() { // from class: com.amazon.aps.iva.n4.o
        @Override // com.amazon.aps.iva.o3.a
        public final void a(Object obj) {
            Configuration configuration = (Configuration) obj;
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.J()) {
                fragmentManager.h(false, configuration);
            }
        }
    };
    public final com.amazon.aps.iva.n4.p q = new com.amazon.aps.iva.o3.a() { // from class: com.amazon.aps.iva.n4.p
        @Override // com.amazon.aps.iva.o3.a
        public final void a(Object obj) {
            Integer num = (Integer) obj;
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.J() && num.intValue() == 80) {
                fragmentManager.l(false);
            }
        }
    };
    public final com.amazon.aps.iva.n4.q r = new com.amazon.aps.iva.o3.a() { // from class: com.amazon.aps.iva.n4.q
        @Override // com.amazon.aps.iva.o3.a
        public final void a(Object obj) {
            com.amazon.aps.iva.c3.k kVar = (com.amazon.aps.iva.c3.k) obj;
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.J()) {
                fragmentManager.m(kVar.a, false);
            }
        }
    };
    public final com.amazon.aps.iva.n4.r s = new com.amazon.aps.iva.o3.a() { // from class: com.amazon.aps.iva.n4.r
        @Override // com.amazon.aps.iva.o3.a
        public final void a(Object obj) {
            com.amazon.aps.iva.c3.c0 c0Var = (com.amazon.aps.iva.c3.c0) obj;
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.J()) {
                fragmentManager.r(c0Var.a, false);
            }
        }
    };
    public final c t = new c();
    public int u = -1;
    public final d z = new d();
    public final e A = new e();
    public ArrayDeque<m> E = new ArrayDeque<>();
    public final f O = new f();

    /* loaded from: classes.dex */
    public class a implements com.amazon.aps.iva.h.b<Map<String, Boolean>> {
        public a() {
        }

        @Override // com.amazon.aps.iva.h.b
        @SuppressLint({"SyntheticAccessor"})
        public final void a(Map<String, Boolean> map) {
            Fragment c;
            int i;
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((Boolean) arrayList.get(i2)).booleanValue()) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[i2] = i;
            }
            FragmentManager fragmentManager = FragmentManager.this;
            m pollFirst = fragmentManager.E.pollFirst();
            if (pollFirst != null && (c = fragmentManager.c.c(pollFirst.b)) != null) {
                c.onRequestPermissionsResult(pollFirst.c, strArr, iArr);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends com.amazon.aps.iva.e.m {
        public b() {
            super(false);
        }

        @Override // com.amazon.aps.iva.e.m
        public final void handleOnBackPressed() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.x(true);
            if (fragmentManager.h.isEnabled()) {
                fragmentManager.P();
            } else {
                fragmentManager.g.c();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements com.amazon.aps.iva.p3.n {
        public c() {
        }

        @Override // com.amazon.aps.iva.p3.n
        public final void a(Menu menu) {
            FragmentManager.this.p(menu);
        }

        @Override // com.amazon.aps.iva.p3.n
        public final void b(Menu menu) {
            FragmentManager.this.s(menu);
        }

        @Override // com.amazon.aps.iva.p3.n
        public final boolean c(MenuItem menuItem) {
            return FragmentManager.this.o(menuItem);
        }

        @Override // com.amazon.aps.iva.p3.n
        public final void d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.j(menu, menuInflater);
        }
    }

    /* loaded from: classes.dex */
    public class d extends androidx.fragment.app.j {
        public d() {
        }

        @Override // androidx.fragment.app.j
        public final Fragment a(String str) {
            return Fragment.instantiate(FragmentManager.this.v.c, str, null);
        }
    }

    /* loaded from: classes.dex */
    public class e implements g0 {
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.x(true);
        }
    }

    /* loaded from: classes.dex */
    public class g implements com.amazon.aps.iva.n4.u {
        public final /* synthetic */ Fragment b;

        public g(Fragment fragment) {
            this.b = fragment;
        }

        @Override // com.amazon.aps.iva.n4.u
        public final void g(Fragment fragment) {
            this.b.onAttachFragment(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class h implements com.amazon.aps.iva.h.b<com.amazon.aps.iva.h.a> {
        public h() {
        }

        @Override // com.amazon.aps.iva.h.b
        public final void a(com.amazon.aps.iva.h.a aVar) {
            Fragment c;
            com.amazon.aps.iva.h.a aVar2 = aVar;
            FragmentManager fragmentManager = FragmentManager.this;
            m pollLast = fragmentManager.E.pollLast();
            if (pollLast != null && (c = fragmentManager.c.c(pollLast.b)) != null) {
                c.onActivityResult(pollLast.c, aVar2.b, aVar2.c);
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements com.amazon.aps.iva.h.b<com.amazon.aps.iva.h.a> {
        public i() {
        }

        @Override // com.amazon.aps.iva.h.b
        public final void a(com.amazon.aps.iva.h.a aVar) {
            Fragment c;
            com.amazon.aps.iva.h.a aVar2 = aVar;
            FragmentManager fragmentManager = FragmentManager.this;
            m pollFirst = fragmentManager.E.pollFirst();
            if (pollFirst != null && (c = fragmentManager.c.c(pollFirst.b)) != null) {
                c.onActivityResult(pollFirst.c, aVar2.b, aVar2.c);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        int getId();

        String getName();
    }

    /* loaded from: classes.dex */
    public static class k extends com.amazon.aps.iva.i.a<com.amazon.aps.iva.h.g, com.amazon.aps.iva.h.a> {
        @Override // com.amazon.aps.iva.i.a
        public final Intent a(ComponentActivity componentActivity, Object obj) {
            Bundle bundleExtra;
            com.amazon.aps.iva.h.g gVar = (com.amazon.aps.iva.h.g) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = gVar.c;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = gVar.b;
                    com.amazon.aps.iva.yb0.j.f(intentSender, "intentSender");
                    gVar = new com.amazon.aps.iva.h.g(intentSender, null, gVar.d, gVar.e);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
            if (FragmentManager.H(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // com.amazon.aps.iva.i.a
        public final com.amazon.aps.iva.h.a c(int i, Intent intent) {
            return new com.amazon.aps.iva.h.a(i, intent);
        }
    }

    /* loaded from: classes.dex */
    public static class n implements v {
        public final androidx.lifecycle.g b;
        public final v c;
        public final androidx.lifecycle.j d;

        public n(androidx.lifecycle.g gVar, v vVar, androidx.lifecycle.j jVar) {
            this.b = gVar;
            this.c = vVar;
            this.d = jVar;
        }

        @Override // com.amazon.aps.iva.n4.v
        public final void i6(Bundle bundle, String str) {
            this.c.i6(bundle, str);
        }
    }

    /* loaded from: classes.dex */
    public interface o {
        void a();
    }

    /* loaded from: classes.dex */
    public interface p {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class q implements p {
        public final String a;
        public final int b;
        public final int c;

        public q(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.y;
            if (fragment != null && this.b < 0 && this.a == null && fragment.getChildFragmentManager().P()) {
                return false;
            }
            return FragmentManager.this.R(arrayList, arrayList2, this.a, this.b, this.c);
        }
    }

    public static boolean H(int i2) {
        if (Log.isLoggable("FragmentManager", i2)) {
            return true;
        }
        return false;
    }

    public static boolean I(Fragment fragment) {
        boolean z;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        Iterator it = fragment.mChildFragmentManager.c.e().iterator();
        boolean z2 = false;
        while (true) {
            if (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null) {
                    z2 = I(fragment2);
                    continue;
                }
                if (z2) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    public static boolean K(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragment.equals(fragmentManager.y) && K(fragmentManager.x)) {
            return true;
        }
        return false;
    }

    public final Fragment A(String str) {
        return this.c.b(str);
    }

    public final Fragment B(int i2) {
        androidx.fragment.app.q qVar = this.c;
        ArrayList<Fragment> arrayList = qVar.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && fragment.mFragmentId == i2) {
                    return fragment;
                }
            } else {
                for (androidx.fragment.app.p pVar : qVar.b.values()) {
                    if (pVar != null) {
                        Fragment fragment2 = pVar.c;
                        if (fragment2.mFragmentId == i2) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final Fragment C(String str) {
        androidx.fragment.app.q qVar = this.c;
        if (str != null) {
            ArrayList<Fragment> arrayList = qVar.a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (androidx.fragment.app.p pVar : qVar.b.values()) {
                if (pVar != null) {
                    Fragment fragment2 = pVar.c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            qVar.getClass();
        }
        return null;
    }

    public final int D() {
        ArrayList<androidx.fragment.app.a> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final ViewGroup E(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.w.y()) {
            View r = this.w.r(fragment.mContainerId);
            if (r instanceof ViewGroup) {
                return (ViewGroup) r;
            }
        }
        return null;
    }

    public final androidx.fragment.app.j F() {
        Fragment fragment = this.x;
        if (fragment != null) {
            return fragment.mFragmentManager.F();
        }
        return this.z;
    }

    public final g0 G() {
        Fragment fragment = this.x;
        if (fragment != null) {
            return fragment.mFragmentManager.G();
        }
        return this.A;
    }

    public final boolean J() {
        Fragment fragment = this.x;
        if (fragment == null) {
            return true;
        }
        if (fragment.isAdded() && this.x.getParentFragmentManager().J()) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        if (!this.G && !this.H) {
            return false;
        }
        return true;
    }

    public final void M(int i2, boolean z) {
        HashMap<String, androidx.fragment.app.p> hashMap;
        com.amazon.aps.iva.n4.n<?> nVar;
        if (this.v == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z && i2 == this.u) {
            return;
        }
        this.u = i2;
        androidx.fragment.app.q qVar = this.c;
        Iterator<Fragment> it = qVar.a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = qVar.b;
            if (!hasNext) {
                break;
            }
            androidx.fragment.app.p pVar = hashMap.get(it.next().mWho);
            if (pVar != null) {
                pVar.i();
            }
        }
        Iterator<androidx.fragment.app.p> it2 = hashMap.values().iterator();
        while (true) {
            boolean z2 = false;
            if (!it2.hasNext()) {
                break;
            }
            androidx.fragment.app.p next = it2.next();
            if (next != null) {
                next.i();
                Fragment fragment = next.c;
                if (fragment.mRemoving && !fragment.isInBackStack()) {
                    z2 = true;
                }
                if (z2) {
                    if (fragment.mBeingSaved && !qVar.c.containsKey(fragment.mWho)) {
                        qVar.i(next.l(), fragment.mWho);
                    }
                    qVar.h(next);
                }
            }
        }
        f0();
        if (this.F && (nVar = this.v) != null && this.u == 7) {
            nVar.m0();
            this.F = false;
        }
    }

    public final void N() {
        if (this.v == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.N.g = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void O() {
        v(new q(null, -1, 0), false);
    }

    public final boolean P() {
        return Q(-1, 0);
    }

    public final boolean Q(int i2, int i3) {
        x(false);
        w(true);
        Fragment fragment = this.y;
        if (fragment != null && i2 < 0 && fragment.getChildFragmentManager().P()) {
            return true;
        }
        boolean R = R(this.K, this.L, null, i2, i3);
        if (R) {
            this.b = true;
            try {
                U(this.K, this.L);
            } finally {
                d();
            }
        }
        i0();
        if (this.J) {
            this.J = false;
            f0();
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return R;
    }

    public final boolean R(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        boolean z;
        if ((i3 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.d;
        int i4 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (str == null && i2 < 0) {
                i4 = z ? 0 : (-1) + this.d.size();
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    androidx.fragment.app.a aVar = this.d.get(size);
                    if ((str != null && str.equals(aVar.k)) || (i2 >= 0 && i2 == aVar.u)) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z) {
                        while (size > 0) {
                            int i5 = size - 1;
                            androidx.fragment.app.a aVar2 = this.d.get(i5);
                            if ((str == null || !str.equals(aVar2.k)) && (i2 < 0 || i2 != aVar2.u)) {
                                break;
                            }
                            size = i5;
                        }
                    } else if (size != this.d.size() - 1) {
                        size++;
                    }
                }
                i4 = size;
            }
        }
        if (i4 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i4; size2--) {
            arrayList.add(this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            g0(new IllegalStateException(defpackage.c.a("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void T(Fragment fragment) {
        if (H(2)) {
            Objects.toString(fragment);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            androidx.fragment.app.q qVar = this.c;
            synchronized (qVar.a) {
                qVar.a.remove(fragment);
            }
            fragment.mAdded = false;
            if (I(fragment)) {
                this.F = true;
            }
            fragment.mRemoving = true;
            e0(fragment);
        }
    }

    public final void U(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).r) {
                    if (i3 != i2) {
                        z(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).r) {
                            i3++;
                        }
                    }
                    z(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                z(arrayList, arrayList2, i3, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void V(Bundle bundle) {
        androidx.fragment.app.l lVar;
        int i2;
        boolean z;
        androidx.fragment.app.p pVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.v.c.getClassLoader());
                this.k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.v.c.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        androidx.fragment.app.q qVar = this.c;
        HashMap<String, Bundle> hashMap2 = qVar.c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        androidx.fragment.app.m mVar = (androidx.fragment.app.m) bundle.getParcelable("state");
        if (mVar == null) {
            return;
        }
        HashMap<String, androidx.fragment.app.p> hashMap3 = qVar.b;
        hashMap3.clear();
        Iterator<String> it = mVar.b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            lVar = this.n;
            if (!hasNext) {
                break;
            }
            Bundle i3 = qVar.i(null, it.next());
            if (i3 != null) {
                Fragment fragment = this.N.b.get(((androidx.fragment.app.o) i3.getParcelable("state")).c);
                if (fragment != null) {
                    if (H(2)) {
                        fragment.toString();
                    }
                    pVar = new androidx.fragment.app.p(lVar, qVar, fragment, i3);
                } else {
                    pVar = new androidx.fragment.app.p(this.n, this.c, this.v.c.getClassLoader(), F(), i3);
                }
                Fragment fragment2 = pVar.c;
                fragment2.mSavedFragmentState = i3;
                fragment2.mFragmentManager = this;
                if (H(2)) {
                    fragment2.toString();
                }
                pVar.j(this.v.c.getClassLoader());
                qVar.g(pVar);
                pVar.e = this.u;
            }
        }
        androidx.fragment.app.n nVar = this.N;
        nVar.getClass();
        Iterator it2 = new ArrayList(nVar.b.values()).iterator();
        while (true) {
            i2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it2.next();
            if (hashMap3.get(fragment3.mWho) != null) {
                i2 = 1;
            }
            if (i2 == 0) {
                if (H(2)) {
                    fragment3.toString();
                    Objects.toString(mVar.b);
                }
                this.N.P8(fragment3);
                fragment3.mFragmentManager = this;
                androidx.fragment.app.p pVar2 = new androidx.fragment.app.p(lVar, qVar, fragment3);
                pVar2.e = 1;
                pVar2.i();
                fragment3.mRemoving = true;
                pVar2.i();
            }
        }
        ArrayList<String> arrayList = mVar.c;
        qVar.a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment b2 = qVar.b(str3);
                if (b2 != null) {
                    if (H(2)) {
                        b2.toString();
                    }
                    qVar.a(b2);
                } else {
                    throw new IllegalStateException(defpackage.e.e("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (mVar.d != null) {
            this.d = new ArrayList<>(mVar.d.length);
            int i4 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = mVar.d;
                if (i4 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.b bVar = bVarArr[i4];
                bVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int[] iArr = bVar.b;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    r.a aVar2 = new r.a();
                    int i7 = i5 + 1;
                    aVar2.a = iArr[i5];
                    if (H(2)) {
                        Objects.toString(aVar);
                        int i8 = iArr[i7];
                    }
                    aVar2.h = g.b.values()[bVar.d[i6]];
                    aVar2.i = g.b.values()[bVar.e[i6]];
                    int i9 = i7 + 1;
                    if (iArr[i7] != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar2.c = z;
                    int i10 = i9 + 1;
                    int i11 = iArr[i9];
                    aVar2.d = i11;
                    int i12 = i10 + 1;
                    int i13 = iArr[i10];
                    aVar2.e = i13;
                    int i14 = i12 + 1;
                    int i15 = iArr[i12];
                    aVar2.f = i15;
                    int i16 = iArr[i14];
                    aVar2.g = i16;
                    aVar.d = i11;
                    aVar.e = i13;
                    aVar.f = i15;
                    aVar.g = i16;
                    aVar.b(aVar2);
                    i6++;
                    i5 = i14 + 1;
                }
                aVar.h = bVar.f;
                aVar.k = bVar.g;
                aVar.i = true;
                aVar.l = bVar.i;
                aVar.m = bVar.j;
                aVar.n = bVar.k;
                aVar.o = bVar.l;
                aVar.p = bVar.m;
                aVar.q = bVar.n;
                aVar.r = bVar.o;
                aVar.u = bVar.h;
                int i17 = 0;
                while (true) {
                    ArrayList<String> arrayList2 = bVar.c;
                    if (i17 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = arrayList2.get(i17);
                    if (str4 != null) {
                        aVar.c.get(i17).b = A(str4);
                    }
                    i17++;
                }
                aVar.g(1);
                if (H(2)) {
                    aVar.toString();
                    PrintWriter printWriter = new PrintWriter(new e0());
                    aVar.l("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i4++;
            }
        } else {
            this.d = null;
        }
        this.i.set(mVar.e);
        String str5 = mVar.f;
        if (str5 != null) {
            Fragment A = A(str5);
            this.y = A;
            q(A);
        }
        ArrayList<String> arrayList3 = mVar.g;
        if (arrayList3 != null) {
            while (i2 < arrayList3.size()) {
                this.j.put(arrayList3.get(i2), mVar.h.get(i2));
                i2++;
            }
        }
        this.E = new ArrayDeque<>(mVar.i);
    }

    public final Bundle W() {
        int i2;
        androidx.fragment.app.b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            u uVar = (u) it.next();
            if (uVar.e) {
                H(2);
                uVar.e = false;
                uVar.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((u) it2.next()).e();
        }
        x(true);
        this.G = true;
        this.N.g = true;
        androidx.fragment.app.q qVar = this.c;
        qVar.getClass();
        HashMap<String, androidx.fragment.app.p> hashMap = qVar.b;
        ArrayList<String> arrayList2 = new ArrayList<>(hashMap.size());
        for (androidx.fragment.app.p pVar : hashMap.values()) {
            if (pVar != null) {
                Fragment fragment = pVar.c;
                qVar.i(pVar.l(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (H(2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        HashMap<String, Bundle> hashMap2 = this.c.c;
        if (hashMap2.isEmpty()) {
            H(2);
        } else {
            androidx.fragment.app.q qVar2 = this.c;
            synchronized (qVar2.a) {
                bVarArr = null;
                if (qVar2.a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(qVar2.a.size());
                    Iterator<Fragment> it3 = qVar2.a.iterator();
                    while (it3.hasNext()) {
                        Fragment next = it3.next();
                        arrayList.add(next.mWho);
                        if (H(2)) {
                            next.toString();
                        }
                    }
                }
            }
            ArrayList<androidx.fragment.app.a> arrayList3 = this.d;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                bVarArr = new androidx.fragment.app.b[size];
                for (i2 = 0; i2 < size; i2++) {
                    bVarArr[i2] = new androidx.fragment.app.b(this.d.get(i2));
                    if (H(2)) {
                        Objects.toString(this.d.get(i2));
                    }
                }
            }
            androidx.fragment.app.m mVar = new androidx.fragment.app.m();
            mVar.b = arrayList2;
            mVar.c = arrayList;
            mVar.d = bVarArr;
            mVar.e = this.i.get();
            Fragment fragment2 = this.y;
            if (fragment2 != null) {
                mVar.f = fragment2.mWho;
            }
            mVar.g.addAll(this.j.keySet());
            mVar.h.addAll(this.j.values());
            mVar.i = new ArrayList<>(this.E);
            bundle.putParcelable("state", mVar);
            for (String str : this.k.keySet()) {
                bundle.putBundle(com.amazon.aps.iva.oa.a.a("result_", str), this.k.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(com.amazon.aps.iva.oa.a.a("fragment_", str2), hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public final Fragment.m X(Fragment fragment) {
        androidx.fragment.app.p pVar = this.c.b.get(fragment.mWho);
        if (pVar != null) {
            Fragment fragment2 = pVar.c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState <= -1) {
                    return null;
                }
                return new Fragment.m(pVar.l());
            }
        }
        g0(new IllegalStateException(defpackage.c.a("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void Y() {
        synchronized (this.a) {
            boolean z = true;
            if (this.a.size() != 1) {
                z = false;
            }
            if (z) {
                this.v.d.removeCallbacks(this.O);
                this.v.d.post(this.O);
                i0();
            }
        }
    }

    public final void Z(Fragment fragment, boolean z) {
        ViewGroup E = E(fragment);
        if (E != null && (E instanceof FragmentContainerView)) {
            ((FragmentContainerView) E).setDrawDisappearingViewsLast(!z);
        }
    }

    public final androidx.fragment.app.p a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            com.amazon.aps.iva.o4.d.d(fragment, str);
        }
        if (H(2)) {
            fragment.toString();
        }
        androidx.fragment.app.p f2 = f(fragment);
        fragment.mFragmentManager = this;
        androidx.fragment.app.q qVar = this.c;
        qVar.g(f2);
        if (!fragment.mDetached) {
            qVar.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (I(fragment)) {
                this.F = true;
            }
        }
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(android.os.Bundle r4, java.lang.String r5) {
        /*
            r3 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$n> r0 = r3.l
            java.lang.Object r0 = r0.get(r5)
            androidx.fragment.app.FragmentManager$n r0 = (androidx.fragment.app.FragmentManager.n) r0
            if (r0 == 0) goto L1c
            androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.STARTED
            androidx.lifecycle.g r2 = r0.b
            androidx.lifecycle.g$b r2 = r2.getCurrentState()
            boolean r1 = r2.isAtLeast(r1)
            if (r1 == 0) goto L1c
            r0.i6(r4, r5)
            goto L21
        L1c:
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r3.k
            r0.put(r5, r4)
        L21:
            r5 = 2
            boolean r5 = H(r5)
            if (r5 == 0) goto L2b
            java.util.Objects.toString(r4)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.a0(android.os.Bundle, java.lang.String):void");
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void b(com.amazon.aps.iva.n4.n<?> nVar, com.amazon.aps.iva.n4.l lVar, Fragment fragment) {
        String str;
        if (this.v == null) {
            this.v = nVar;
            this.w = lVar;
            this.x = fragment;
            CopyOnWriteArrayList<com.amazon.aps.iva.n4.u> copyOnWriteArrayList = this.o;
            if (fragment != null) {
                copyOnWriteArrayList.add(new g(fragment));
            } else if (nVar instanceof com.amazon.aps.iva.n4.u) {
                copyOnWriteArrayList.add((com.amazon.aps.iva.n4.u) nVar);
            }
            if (this.x != null) {
                i0();
            }
            if (nVar instanceof com.amazon.aps.iva.e.v) {
                com.amazon.aps.iva.e.v vVar = (com.amazon.aps.iva.e.v) nVar;
                OnBackPressedDispatcher onBackPressedDispatcher = vVar.getOnBackPressedDispatcher();
                this.g = onBackPressedDispatcher;
                com.amazon.aps.iva.i5.o oVar = vVar;
                if (fragment != null) {
                    oVar = fragment;
                }
                onBackPressedDispatcher.a(oVar, this.h);
            }
            if (fragment != null) {
                androidx.fragment.app.n nVar2 = fragment.mFragmentManager.N;
                HashMap<String, androidx.fragment.app.n> hashMap = nVar2.c;
                androidx.fragment.app.n nVar3 = hashMap.get(fragment.mWho);
                if (nVar3 == null) {
                    nVar3 = new androidx.fragment.app.n(nVar2.e);
                    hashMap.put(fragment.mWho, nVar3);
                }
                this.N = nVar3;
            } else if (nVar instanceof h0) {
                this.N = (androidx.fragment.app.n) new androidx.lifecycle.u(((h0) nVar).getViewModelStore(), androidx.fragment.app.n.h).a(androidx.fragment.app.n.class);
            } else {
                this.N = new androidx.fragment.app.n(false);
            }
            this.N.g = L();
            this.c.d = this.N;
            com.amazon.aps.iva.n4.n<?> nVar4 = this.v;
            if ((nVar4 instanceof com.amazon.aps.iva.s8.c) && fragment == null) {
                androidx.savedstate.a savedStateRegistry = ((com.amazon.aps.iva.s8.c) nVar4).getSavedStateRegistry();
                savedStateRegistry.c("android:support:fragments", new com.amazon.aps.iva.n4.s(this, 0));
                Bundle a2 = savedStateRegistry.a("android:support:fragments");
                if (a2 != null) {
                    V(a2);
                }
            }
            com.amazon.aps.iva.n4.n<?> nVar5 = this.v;
            if (nVar5 instanceof com.amazon.aps.iva.h.f) {
                androidx.activity.result.a activityResultRegistry = ((com.amazon.aps.iva.h.f) nVar5).getActivityResultRegistry();
                if (fragment != null) {
                    str = defpackage.b.c(new StringBuilder(), fragment.mWho, ":");
                } else {
                    str = "";
                }
                String a3 = com.amazon.aps.iva.oa.a.a("FragmentManager:", str);
                this.B = activityResultRegistry.d(com.amazon.aps.iva.c80.a.f(a3, "StartActivityForResult"), new com.amazon.aps.iva.i.d(), new h());
                this.C = activityResultRegistry.d(com.amazon.aps.iva.c80.a.f(a3, "StartIntentSenderForResult"), new k(), new i());
                this.D = activityResultRegistry.d(com.amazon.aps.iva.c80.a.f(a3, "RequestPermissions"), new com.amazon.aps.iva.i.b(), new a());
            }
            com.amazon.aps.iva.n4.n<?> nVar6 = this.v;
            if (nVar6 instanceof com.amazon.aps.iva.d3.b) {
                ((com.amazon.aps.iva.d3.b) nVar6).addOnConfigurationChangedListener(this.p);
            }
            com.amazon.aps.iva.n4.n<?> nVar7 = this.v;
            if (nVar7 instanceof com.amazon.aps.iva.d3.c) {
                ((com.amazon.aps.iva.d3.c) nVar7).addOnTrimMemoryListener(this.q);
            }
            com.amazon.aps.iva.n4.n<?> nVar8 = this.v;
            if (nVar8 instanceof z) {
                ((z) nVar8).addOnMultiWindowModeChangedListener(this.r);
            }
            com.amazon.aps.iva.n4.n<?> nVar9 = this.v;
            if (nVar9 instanceof a0) {
                ((a0) nVar9).addOnPictureInPictureModeChangedListener(this.s);
            }
            com.amazon.aps.iva.n4.n<?> nVar10 = this.v;
            if ((nVar10 instanceof com.amazon.aps.iva.p3.i) && fragment == null) {
                ((com.amazon.aps.iva.p3.i) nVar10).addMenuProvider(this.t);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void b0(final String str, com.amazon.aps.iva.i5.o oVar, final v vVar) {
        final androidx.lifecycle.g lifecycle = oVar.getLifecycle();
        if (lifecycle.getCurrentState() == g.b.DESTROYED) {
            return;
        }
        androidx.lifecycle.j jVar = new androidx.lifecycle.j() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.j
            public final void U2(com.amazon.aps.iva.i5.o oVar2, g.a aVar) {
                Bundle bundle;
                g.a aVar2 = g.a.ON_START;
                FragmentManager fragmentManager = FragmentManager.this;
                String str2 = str;
                if (aVar == aVar2 && (bundle = fragmentManager.k.get(str2)) != null) {
                    vVar.i6(bundle, str2);
                    fragmentManager.k.remove(str2);
                    FragmentManager.H(2);
                }
                if (aVar == g.a.ON_DESTROY) {
                    lifecycle.removeObserver(this);
                    fragmentManager.l.remove(str2);
                }
            }
        };
        n put = this.l.put(str, new n(lifecycle, vVar, jVar));
        if (put != null) {
            put.b.removeObserver(put.d);
        }
        if (H(2)) {
            lifecycle.toString();
            Objects.toString(vVar);
        }
        lifecycle.addObserver(jVar);
    }

    public final void c(Fragment fragment) {
        if (H(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.c.a(fragment);
                if (H(2)) {
                    fragment.toString();
                }
                if (I(fragment)) {
                    this.F = true;
                }
            }
        }
    }

    public final void c0(Fragment fragment, g.b bVar) {
        if (fragment.equals(A(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void d() {
        this.b = false;
        this.L.clear();
        this.K.clear();
    }

    public final void d0(Fragment fragment) {
        if (fragment != null && (!fragment.equals(A(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.y;
        this.y = fragment;
        q(fragment2);
        q(this.y);
    }

    public final HashSet e() {
        Object dVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((androidx.fragment.app.p) it.next()).c.mContainer;
            if (viewGroup != null) {
                com.amazon.aps.iva.yb0.j.f(G(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof u) {
                    dVar = (u) tag;
                } else {
                    dVar = new androidx.fragment.app.d(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, dVar);
                }
                hashSet.add(dVar);
            }
        }
        return hashSet;
    }

    public final void e0(Fragment fragment) {
        ViewGroup E = E(fragment);
        if (E != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (E.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    E.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) E.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final androidx.fragment.app.p f(Fragment fragment) {
        String str = fragment.mWho;
        androidx.fragment.app.q qVar = this.c;
        androidx.fragment.app.p pVar = qVar.b.get(str);
        if (pVar != null) {
            return pVar;
        }
        androidx.fragment.app.p pVar2 = new androidx.fragment.app.p(this.n, qVar, fragment);
        pVar2.j(this.v.c.getClassLoader());
        pVar2.e = this.u;
        return pVar2;
    }

    public final void f0() {
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            androidx.fragment.app.p pVar = (androidx.fragment.app.p) it.next();
            Fragment fragment = pVar.c;
            if (fragment.mDeferStart) {
                if (this.b) {
                    this.J = true;
                } else {
                    fragment.mDeferStart = false;
                    pVar.i();
                }
            }
        }
    }

    public final void g(Fragment fragment) {
        if (H(2)) {
            Objects.toString(fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (H(2)) {
                    fragment.toString();
                }
                androidx.fragment.app.q qVar = this.c;
                synchronized (qVar.a) {
                    qVar.a.remove(fragment);
                }
                fragment.mAdded = false;
                if (I(fragment)) {
                    this.F = true;
                }
                e0(fragment);
            }
        }
    }

    public final void g0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new e0());
        com.amazon.aps.iva.n4.n<?> nVar = this.v;
        try {
            if (nVar != null) {
                nVar.B(printWriter, new String[0]);
            } else {
                u("  ", null, printWriter, new String[0]);
            }
        } catch (Exception unused) {
        }
        throw illegalStateException;
    }

    public final void h(boolean z, Configuration configuration) {
        if (z && (this.v instanceof com.amazon.aps.iva.d3.b)) {
            g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final void h0(l lVar) {
        androidx.fragment.app.l lVar2 = this.n;
        synchronized (lVar2.a) {
            int size = lVar2.a.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (lVar2.a.get(i2).a == lVar) {
                    lVar2.a.remove(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void i0() {
        synchronized (this.a) {
            boolean z = true;
            if (!this.a.isEmpty()) {
                this.h.setEnabled(true);
            } else {
                this.h.setEnabled((D() <= 0 || !K(this.x)) ? false : false);
            }
        }
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        boolean z = true;
        this.I = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((u) it.next()).e();
        }
        com.amazon.aps.iva.n4.n<?> nVar = this.v;
        boolean z2 = nVar instanceof h0;
        androidx.fragment.app.q qVar = this.c;
        if (z2) {
            z = qVar.d.f;
        } else {
            Context context = nVar.c;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            for (com.amazon.aps.iva.n4.b bVar : this.j.values()) {
                for (String str : bVar.b) {
                    androidx.fragment.app.n nVar2 = qVar.d;
                    nVar2.getClass();
                    H(3);
                    nVar2.O8(str);
                }
            }
        }
        t(-1);
        com.amazon.aps.iva.n4.n<?> nVar3 = this.v;
        if (nVar3 instanceof com.amazon.aps.iva.d3.c) {
            ((com.amazon.aps.iva.d3.c) nVar3).removeOnTrimMemoryListener(this.q);
        }
        com.amazon.aps.iva.n4.n<?> nVar4 = this.v;
        if (nVar4 instanceof com.amazon.aps.iva.d3.b) {
            ((com.amazon.aps.iva.d3.b) nVar4).removeOnConfigurationChangedListener(this.p);
        }
        com.amazon.aps.iva.n4.n<?> nVar5 = this.v;
        if (nVar5 instanceof z) {
            ((z) nVar5).removeOnMultiWindowModeChangedListener(this.r);
        }
        com.amazon.aps.iva.n4.n<?> nVar6 = this.v;
        if (nVar6 instanceof a0) {
            ((a0) nVar6).removeOnPictureInPictureModeChangedListener(this.s);
        }
        com.amazon.aps.iva.n4.n<?> nVar7 = this.v;
        if ((nVar7 instanceof com.amazon.aps.iva.p3.i) && this.x == null) {
            ((com.amazon.aps.iva.p3.i) nVar7).removeMenuProvider(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            this.h.remove();
            this.g = null;
        }
        com.amazon.aps.iva.h.e eVar = this.B;
        if (eVar != null) {
            eVar.b();
            this.C.b();
            this.D.b();
        }
    }

    public final void l(boolean z) {
        if (z && (this.v instanceof com.amazon.aps.iva.d3.c)) {
            g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z, boolean z2) {
        if (z2 && (this.v instanceof z)) {
            g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m(z, true);
                }
            }
        }
    }

    public final void n() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.u < 1) {
            return;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(Fragment fragment) {
        if (fragment != null && fragment.equals(A(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    public final void r(boolean z, boolean z2) {
        if (z2 && (this.v instanceof a0)) {
            g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.r(z, true);
                }
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z = false;
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void t(int i2) {
        try {
            this.b = true;
            for (androidx.fragment.app.p pVar : this.c.b.values()) {
                if (pVar != null) {
                    pVar.e = i2;
                }
            }
            M(i2, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((u) it.next()).e();
            }
            this.b = false;
            x(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            com.amazon.aps.iva.n4.n<?> nVar = this.v;
            if (nVar != null) {
                sb.append(nVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String f2 = com.amazon.aps.iva.c80.a.f(str, "    ");
        androidx.fragment.app.q qVar = this.c;
        qVar.getClass();
        String str2 = str + "    ";
        HashMap<String, androidx.fragment.app.p> hashMap = qVar.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (androidx.fragment.app.p pVar : hashMap.values()) {
                printWriter.print(str);
                if (pVar != null) {
                    Fragment fragment = pVar.c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList<Fragment> arrayList = qVar.a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(arrayList.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.e.get(i3).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                androidx.fragment.app.a aVar = this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.l(f2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size4; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((p) this.a.get(i5));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.w);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public final void v(p pVar, boolean z) {
        if (!z) {
            if (this.v == null) {
                if (this.I) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (L()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            if (this.v == null) {
                if (z) {
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            this.a.add(pVar);
            Y();
        }
    }

    public final void w(boolean z) {
        if (!this.b) {
            if (this.v == null) {
                if (this.I) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.v.d.getLooper()) {
                if (!z && L()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.K == null) {
                    this.K = new ArrayList<>();
                    this.L = new ArrayList<>();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean x(boolean z) {
        boolean z2;
        w(z);
        boolean z3 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.K;
            ArrayList<Boolean> arrayList2 = this.L;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    int size = this.a.size();
                    z2 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z2 |= this.a.get(i2).a(arrayList, arrayList2);
                    }
                    this.a.clear();
                    this.v.d.removeCallbacks(this.O);
                }
            }
            if (!z2) {
                break;
            }
            z3 = true;
            this.b = true;
            try {
                U(this.K, this.L);
            } finally {
                d();
            }
        }
        i0();
        if (this.J) {
            this.J = false;
            f0();
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z3;
    }

    public final void y(p pVar, boolean z) {
        if (z && (this.v == null || this.I)) {
            return;
        }
        w(z);
        if (pVar.a(this.K, this.L)) {
            this.b = true;
            try {
                U(this.K, this.L);
            } finally {
                d();
            }
        }
        i0();
        if (this.J) {
            this.J = false;
            f0();
        }
        this.c.b.values().removeAll(Collections.singleton(null));
    }

    public final void z(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<androidx.fragment.app.a> arrayList3;
        int i4;
        ViewGroup viewGroup;
        ArrayList<o> arrayList4;
        androidx.fragment.app.a aVar;
        androidx.fragment.app.q qVar;
        androidx.fragment.app.q qVar2;
        androidx.fragment.app.q qVar3;
        int i5;
        ArrayList<androidx.fragment.app.a> arrayList5 = arrayList;
        ArrayList<Boolean> arrayList6 = arrayList2;
        int i6 = i3;
        boolean z = arrayList5.get(i2).r;
        ArrayList<Fragment> arrayList7 = this.M;
        if (arrayList7 == null) {
            this.M = new ArrayList<>();
        } else {
            arrayList7.clear();
        }
        ArrayList<Fragment> arrayList8 = this.M;
        androidx.fragment.app.q qVar4 = this.c;
        arrayList8.addAll(qVar4.f());
        Fragment fragment = this.y;
        int i7 = i2;
        boolean z2 = false;
        while (true) {
            int i8 = 1;
            if (i7 < i6) {
                androidx.fragment.app.a aVar2 = arrayList5.get(i7);
                if (!arrayList6.get(i7).booleanValue()) {
                    ArrayList<Fragment> arrayList9 = this.M;
                    int i9 = 0;
                    while (true) {
                        ArrayList<r.a> arrayList10 = aVar2.c;
                        if (i9 < arrayList10.size()) {
                            r.a aVar3 = arrayList10.get(i9);
                            int i10 = aVar3.a;
                            if (i10 != i8) {
                                if (i10 != 2) {
                                    if (i10 != 3 && i10 != 6) {
                                        if (i10 != 7) {
                                            if (i10 == 8) {
                                                arrayList10.add(i9, new r.a(9, fragment));
                                                aVar3.c = true;
                                                i9++;
                                                fragment = aVar3.b;
                                            }
                                        } else {
                                            qVar3 = qVar4;
                                            i5 = 1;
                                        }
                                    } else {
                                        arrayList9.remove(aVar3.b);
                                        Fragment fragment2 = aVar3.b;
                                        if (fragment2 == fragment) {
                                            arrayList10.add(i9, new r.a(fragment2, 9));
                                            i9++;
                                            qVar3 = qVar4;
                                            i5 = 1;
                                            fragment = null;
                                        }
                                    }
                                    qVar3 = qVar4;
                                    i5 = 1;
                                } else {
                                    Fragment fragment3 = aVar3.b;
                                    int i11 = fragment3.mContainerId;
                                    Fragment fragment4 = fragment;
                                    boolean z3 = false;
                                    qVar3 = qVar4;
                                    for (int size = arrayList9.size() - 1; size >= 0; size--) {
                                        Fragment fragment5 = arrayList9.get(size);
                                        if (fragment5.mContainerId == i11) {
                                            if (fragment5 == fragment3) {
                                                z3 = true;
                                            } else {
                                                if (fragment5 == fragment4) {
                                                    arrayList10.add(i9, new r.a(9, fragment5));
                                                    i9++;
                                                    fragment4 = null;
                                                }
                                                r.a aVar4 = new r.a(3, fragment5);
                                                aVar4.d = aVar3.d;
                                                aVar4.f = aVar3.f;
                                                aVar4.e = aVar3.e;
                                                aVar4.g = aVar3.g;
                                                arrayList10.add(i9, aVar4);
                                                arrayList9.remove(fragment5);
                                                i9++;
                                                fragment4 = fragment4;
                                            }
                                        }
                                    }
                                    i5 = 1;
                                    if (z3) {
                                        arrayList10.remove(i9);
                                        i9--;
                                    } else {
                                        aVar3.a = 1;
                                        aVar3.c = true;
                                        arrayList9.add(fragment3);
                                    }
                                    fragment = fragment4;
                                }
                                i9 += i5;
                                i8 = i5;
                                qVar4 = qVar3;
                            } else {
                                qVar3 = qVar4;
                                i5 = i8;
                            }
                            arrayList9.add(aVar3.b);
                            i9 += i5;
                            i8 = i5;
                            qVar4 = qVar3;
                        } else {
                            qVar2 = qVar4;
                        }
                    }
                } else {
                    qVar2 = qVar4;
                    int i12 = 1;
                    ArrayList<Fragment> arrayList11 = this.M;
                    ArrayList<r.a> arrayList12 = aVar2.c;
                    int size2 = arrayList12.size() - 1;
                    while (size2 >= 0) {
                        r.a aVar5 = arrayList12.get(size2);
                        int i13 = aVar5.a;
                        if (i13 != i12) {
                            if (i13 != 3) {
                                switch (i13) {
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar5.b;
                                        break;
                                    case 10:
                                        aVar5.i = aVar5.h;
                                        break;
                                }
                                size2--;
                                i12 = 1;
                            }
                            arrayList11.add(aVar5.b);
                            size2--;
                            i12 = 1;
                        }
                        arrayList11.remove(aVar5.b);
                        size2--;
                        i12 = 1;
                    }
                }
                if (!z2 && !aVar2.i) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                i7++;
                arrayList5 = arrayList;
                arrayList6 = arrayList2;
                i6 = i3;
                qVar4 = qVar2;
            } else {
                androidx.fragment.app.q qVar5 = qVar4;
                this.M.clear();
                if (!z && this.u >= 1) {
                    int i14 = i2;
                    i4 = i3;
                    while (true) {
                        arrayList3 = arrayList;
                        if (i14 < i4) {
                            Iterator<r.a> it = arrayList3.get(i14).c.iterator();
                            while (it.hasNext()) {
                                Fragment fragment6 = it.next().b;
                                if (fragment6 != null && fragment6.mFragmentManager != null) {
                                    qVar = qVar5;
                                    qVar.g(f(fragment6));
                                } else {
                                    qVar = qVar5;
                                }
                                qVar5 = qVar;
                            }
                            i14++;
                        }
                    }
                } else {
                    arrayList3 = arrayList;
                    i4 = i3;
                }
                for (int i15 = i2; i15 < i4; i15++) {
                    androidx.fragment.app.a aVar6 = arrayList3.get(i15);
                    if (arrayList2.get(i15).booleanValue()) {
                        aVar6.g(-1);
                        ArrayList<r.a> arrayList13 = aVar6.c;
                        boolean z4 = true;
                        int size3 = arrayList13.size() - 1;
                        while (size3 >= 0) {
                            r.a aVar7 = arrayList13.get(size3);
                            Fragment fragment7 = aVar7.b;
                            if (fragment7 != null) {
                                fragment7.mBeingSaved = false;
                                fragment7.setPopDirection(z4);
                                int i16 = aVar6.h;
                                int i17 = 8194;
                                int i18 = 4097;
                                if (i16 != 4097) {
                                    if (i16 != 8194) {
                                        i17 = 8197;
                                        i18 = 4100;
                                        if (i16 != 8197) {
                                            if (i16 != 4099) {
                                                if (i16 != 4100) {
                                                    i17 = 0;
                                                }
                                            } else {
                                                i17 = 4099;
                                            }
                                        }
                                    }
                                    i17 = i18;
                                }
                                fragment7.setNextTransition(i17);
                                fragment7.setSharedElementNames(aVar6.q, aVar6.p);
                            }
                            int i19 = aVar7.a;
                            FragmentManager fragmentManager = aVar6.s;
                            switch (i19) {
                                case 1:
                                    fragment7.setAnimations(aVar7.d, aVar7.e, aVar7.f, aVar7.g);
                                    fragmentManager.Z(fragment7, true);
                                    fragmentManager.T(fragment7);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar7.a);
                                case 3:
                                    fragment7.setAnimations(aVar7.d, aVar7.e, aVar7.f, aVar7.g);
                                    fragmentManager.a(fragment7);
                                    break;
                                case 4:
                                    fragment7.setAnimations(aVar7.d, aVar7.e, aVar7.f, aVar7.g);
                                    fragmentManager.getClass();
                                    if (H(2)) {
                                        Objects.toString(fragment7);
                                    }
                                    if (fragment7.mHidden) {
                                        fragment7.mHidden = false;
                                        fragment7.mHiddenChanged = !fragment7.mHiddenChanged;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 5:
                                    fragment7.setAnimations(aVar7.d, aVar7.e, aVar7.f, aVar7.g);
                                    fragmentManager.Z(fragment7, true);
                                    if (H(2)) {
                                        Objects.toString(fragment7);
                                    }
                                    if (fragment7.mHidden) {
                                        break;
                                    } else {
                                        fragment7.mHidden = true;
                                        fragment7.mHiddenChanged = !fragment7.mHiddenChanged;
                                        fragmentManager.e0(fragment7);
                                        break;
                                    }
                                case 6:
                                    fragment7.setAnimations(aVar7.d, aVar7.e, aVar7.f, aVar7.g);
                                    fragmentManager.c(fragment7);
                                    break;
                                case 7:
                                    fragment7.setAnimations(aVar7.d, aVar7.e, aVar7.f, aVar7.g);
                                    fragmentManager.Z(fragment7, true);
                                    fragmentManager.g(fragment7);
                                    break;
                                case 8:
                                    fragmentManager.d0(null);
                                    break;
                                case 9:
                                    fragmentManager.d0(fragment7);
                                    break;
                                case 10:
                                    fragmentManager.c0(fragment7, aVar7.h);
                                    break;
                            }
                            size3--;
                            z4 = true;
                        }
                        continue;
                    } else {
                        aVar6.g(1);
                        ArrayList<r.a> arrayList14 = aVar6.c;
                        int size4 = arrayList14.size();
                        int i20 = 0;
                        while (i20 < size4) {
                            r.a aVar8 = arrayList14.get(i20);
                            Fragment fragment8 = aVar8.b;
                            if (fragment8 != null) {
                                fragment8.mBeingSaved = false;
                                fragment8.setPopDirection(false);
                                fragment8.setNextTransition(aVar6.h);
                                fragment8.setSharedElementNames(aVar6.p, aVar6.q);
                            }
                            int i21 = aVar8.a;
                            FragmentManager fragmentManager2 = aVar6.s;
                            switch (i21) {
                                case 1:
                                    aVar = aVar6;
                                    fragment8.setAnimations(aVar8.d, aVar8.e, aVar8.f, aVar8.g);
                                    fragmentManager2.Z(fragment8, false);
                                    fragmentManager2.a(fragment8);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar8.a);
                                case 3:
                                    aVar = aVar6;
                                    fragment8.setAnimations(aVar8.d, aVar8.e, aVar8.f, aVar8.g);
                                    fragmentManager2.T(fragment8);
                                    break;
                                case 4:
                                    aVar = aVar6;
                                    fragment8.setAnimations(aVar8.d, aVar8.e, aVar8.f, aVar8.g);
                                    fragmentManager2.getClass();
                                    if (H(2)) {
                                        Objects.toString(fragment8);
                                    }
                                    if (!fragment8.mHidden) {
                                        fragment8.mHidden = true;
                                        fragment8.mHiddenChanged = !fragment8.mHiddenChanged;
                                        fragmentManager2.e0(fragment8);
                                    }
                                    break;
                                case 5:
                                    aVar = aVar6;
                                    fragment8.setAnimations(aVar8.d, aVar8.e, aVar8.f, aVar8.g);
                                    fragmentManager2.Z(fragment8, false);
                                    if (H(2)) {
                                        Objects.toString(fragment8);
                                    }
                                    if (fragment8.mHidden) {
                                        fragment8.mHidden = false;
                                        fragment8.mHiddenChanged = !fragment8.mHiddenChanged;
                                    }
                                    break;
                                case 6:
                                    aVar = aVar6;
                                    fragment8.setAnimations(aVar8.d, aVar8.e, aVar8.f, aVar8.g);
                                    fragmentManager2.g(fragment8);
                                    break;
                                case 7:
                                    aVar = aVar6;
                                    fragment8.setAnimations(aVar8.d, aVar8.e, aVar8.f, aVar8.g);
                                    fragmentManager2.Z(fragment8, false);
                                    fragmentManager2.c(fragment8);
                                    break;
                                case 8:
                                    fragmentManager2.d0(fragment8);
                                    aVar = aVar6;
                                    break;
                                case 9:
                                    fragmentManager2.d0(null);
                                    aVar = aVar6;
                                    break;
                                case 10:
                                    fragmentManager2.c0(fragment8, aVar8.i);
                                    aVar = aVar6;
                                    break;
                            }
                            i20++;
                            aVar6 = aVar;
                        }
                        continue;
                    }
                }
                boolean booleanValue = arrayList2.get(i4 - 1).booleanValue();
                if (z2 && (arrayList4 = this.m) != null && !arrayList4.isEmpty()) {
                    LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
                    Iterator<androidx.fragment.app.a> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        androidx.fragment.app.a next = it2.next();
                        HashSet hashSet = new HashSet();
                        for (int i22 = 0; i22 < next.c.size(); i22++) {
                            Fragment fragment9 = next.c.get(i22).b;
                            if (fragment9 != null && next.i) {
                                hashSet.add(fragment9);
                            }
                        }
                        linkedHashSet.addAll(hashSet);
                    }
                    Iterator<o> it3 = this.m.iterator();
                    while (it3.hasNext()) {
                        o next2 = it3.next();
                        for (Fragment fragment10 : linkedHashSet) {
                            next2.getClass();
                        }
                    }
                    Iterator<o> it4 = this.m.iterator();
                    while (it4.hasNext()) {
                        o next3 = it4.next();
                        for (Fragment fragment11 : linkedHashSet) {
                            next3.getClass();
                        }
                    }
                }
                for (int i23 = i2; i23 < i4; i23++) {
                    androidx.fragment.app.a aVar9 = arrayList3.get(i23);
                    if (booleanValue) {
                        for (int size5 = aVar9.c.size() - 1; size5 >= 0; size5--) {
                            Fragment fragment12 = aVar9.c.get(size5).b;
                            if (fragment12 != null) {
                                f(fragment12).i();
                            }
                        }
                    } else {
                        Iterator<r.a> it5 = aVar9.c.iterator();
                        while (it5.hasNext()) {
                            Fragment fragment13 = it5.next().b;
                            if (fragment13 != null) {
                                f(fragment13).i();
                            }
                        }
                    }
                }
                M(this.u, true);
                HashSet hashSet2 = new HashSet();
                for (int i24 = i2; i24 < i4; i24++) {
                    Iterator<r.a> it6 = arrayList3.get(i24).c.iterator();
                    while (it6.hasNext()) {
                        Fragment fragment14 = it6.next().b;
                        if (fragment14 != null && (viewGroup = fragment14.mContainer) != null) {
                            hashSet2.add(u.f(viewGroup, this));
                        }
                    }
                }
                Iterator it7 = hashSet2.iterator();
                while (it7.hasNext()) {
                    u uVar = (u) it7.next();
                    uVar.d = booleanValue;
                    uVar.g();
                    uVar.c();
                }
                for (int i25 = i2; i25 < i4; i25++) {
                    androidx.fragment.app.a aVar10 = arrayList3.get(i25);
                    if (arrayList2.get(i25).booleanValue() && aVar10.u >= 0) {
                        aVar10.u = -1;
                    }
                    aVar10.getClass();
                }
                if (z2 && this.m != null) {
                    for (int i26 = 0; i26 < this.m.size(); i26++) {
                        this.m.get(i26).a();
                    }
                    return;
                }
                return;
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();
        public final String b;
        public final int c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            public final m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final m[] newArray(int i) {
                return new m[i];
            }
        }

        public m(String str, int i) {
            this.b = str;
            this.c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeInt(this.c);
        }

        public m(Parcel parcel) {
            this.b = parcel.readString();
            this.c = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        @Deprecated
        public void c(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void e(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void f(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void g(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void h(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void i(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void d(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void j(FragmentManager fragmentManager, Fragment fragment, View view) {
        }
    }
}
