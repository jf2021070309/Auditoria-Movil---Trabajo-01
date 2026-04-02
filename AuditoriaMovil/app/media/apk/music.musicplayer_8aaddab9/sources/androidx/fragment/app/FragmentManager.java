package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentManager;
import c.m.b.a0;
import c.m.b.b0;
import c.m.b.c0;
import c.m.b.d0;
import c.m.b.j0;
import c.m.b.k0;
import c.m.b.l0;
import c.m.b.r;
import c.m.b.s;
import c.m.b.u;
import c.m.b.v;
import c.m.b.w;
import c.m.b.x;
import c.m.b.z;
import c.p.g0;
import c.p.i0;
import c.p.j;
import c.p.m0;
import c.p.n;
import c.p.n0;
import c.p.p;
import c.w.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public abstract class FragmentManager {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ArrayList<c.m.b.d> E;
    public ArrayList<Boolean> F;
    public ArrayList<Fragment> G;
    public z H;

    /* renamed from: b  reason: collision with root package name */
    public boolean f401b;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<c.m.b.d> f403d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Fragment> f404e;

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f406g;
    public v<?> p;
    public r q;
    public Fragment r;
    public Fragment s;
    public c.a.h.b<Intent> v;
    public c.a.h.b<IntentSenderRequest> w;
    public c.a.h.b<String[]> x;
    public boolean z;
    public final ArrayList<k> a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final c0 f402c = new c0();

    /* renamed from: f  reason: collision with root package name */
    public final w f405f = new w(this);

    /* renamed from: h  reason: collision with root package name */
    public final c.a.e f407h = new a(false);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f408i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, BackStackState> f409j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Bundle> f410k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, ?> f411l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public final x f412m = new x(this);

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList<a0> f413n = new CopyOnWriteArrayList<>();
    public int o = -1;
    public u t = new b();
    public l0 u = new c(this);
    public ArrayDeque<LaunchedFragmentInfo> y = new ArrayDeque<>();
    public Runnable I = new d();

    /* renamed from: androidx.fragment.app.FragmentManager$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements n {
        @Override // c.p.n
        public void c(p pVar, j.a aVar) {
            if (aVar == j.a.ON_START) {
                throw null;
            }
            if (aVar == j.a.ON_DESTROY) {
                throw null;
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public int f414b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo[] newArray(int i2) {
                return new LaunchedFragmentInfo[i2];
            }
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.a = parcel.readString();
            this.f414b = parcel.readInt();
        }

        public LaunchedFragmentInfo(String str, int i2) {
            this.a = str;
            this.f414b = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.a);
            parcel.writeInt(this.f414b);
        }
    }

    /* loaded from: classes.dex */
    public class a extends c.a.e {
        public a(boolean z) {
            super(z);
        }

        @Override // c.a.e
        public void a() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.A(true);
            if (fragmentManager.f407h.a) {
                fragmentManager.T();
            } else {
                fragmentManager.f406g.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends u {
        public b() {
        }

        @Override // c.m.b.u
        public Fragment a(ClassLoader classLoader, String str) {
            v<?> vVar = FragmentManager.this.p;
            Context context = vVar.f2408b;
            Objects.requireNonNull(vVar);
            return Fragment.instantiate(context, str, null);
        }
    }

    /* loaded from: classes.dex */
    public class c implements l0 {
        public c(FragmentManager fragmentManager) {
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.A(true);
        }
    }

    /* loaded from: classes.dex */
    public class e implements a0 {
        public final /* synthetic */ Fragment a;

        public e(FragmentManager fragmentManager, Fragment fragment) {
            this.a = fragment;
        }

        @Override // c.m.b.a0
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.a.onAttachFragment(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class f implements c.a.h.a<ActivityResult> {
        public f() {
        }

        @Override // c.a.h.a
        public void a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.y.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.a;
            int i2 = pollFirst.f414b;
            Fragment d2 = FragmentManager.this.f402c.d(str);
            if (d2 != null) {
                d2.onActivityResult(i2, activityResult2.a, activityResult2.f92b);
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: classes.dex */
    public class g implements c.a.h.a<ActivityResult> {
        public g() {
        }

        @Override // c.a.h.a
        public void a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.y.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.a;
            int i2 = pollFirst.f414b;
            Fragment d2 = FragmentManager.this.f402c.d(str);
            if (d2 != null) {
                d2.onActivityResult(i2, activityResult2.a, activityResult2.f92b);
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: classes.dex */
    public class h implements c.a.h.a<Map<String, Boolean>> {
        public h() {
        }

        @Override // c.a.h.a
        @SuppressLint({"SyntheticAccessor"})
        public void a(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.y.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.a;
            int i3 = pollFirst.f414b;
            Fragment d2 = FragmentManager.this.f402c.d(str);
            if (d2 != null) {
                d2.onRequestPermissionsResult(i3, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends c.a.h.d.a<IntentSenderRequest, ActivityResult> {
        @Override // c.a.h.d.a
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest2.f109b;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest2 = new IntentSenderRequest(intentSenderRequest2.a, null, intentSenderRequest2.f110c, intentSenderRequest2.f111d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
            if (FragmentManager.L(2)) {
                String str = "CreateIntent created the following intent: " + intent;
            }
            return intent;
        }

        @Override // c.a.h.d.a
        public ActivityResult c(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public void a(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void b(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void c(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean a(ArrayList<c.m.b.d> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class l implements k {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f417b;

        public l(String str, int i2, int i3) {
            this.a = i2;
            this.f417b = i3;
        }

        @Override // androidx.fragment.app.FragmentManager.k
        public boolean a(ArrayList<c.m.b.d> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.s;
            if (fragment == null || this.a >= 0 || !fragment.getChildFragmentManager().T()) {
                return FragmentManager.this.U(arrayList, arrayList2, null, this.a, this.f417b);
            }
            return false;
        }
    }

    public static boolean L(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public boolean A(boolean z) {
        boolean z2;
        z(z);
        boolean z3 = false;
        while (true) {
            ArrayList<c.m.b.d> arrayList = this.E;
            ArrayList<Boolean> arrayList2 = this.F;
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
                    this.p.f2409c.removeCallbacks(this.I);
                }
            }
            if (!z2) {
                g0();
                v();
                this.f402c.b();
                return z3;
            }
            this.f401b = true;
            try {
                W(this.E, this.F);
                d();
                z3 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
    }

    public void B(k kVar, boolean z) {
        if (z && (this.p == null || this.C)) {
            return;
        }
        z(z);
        ((c.m.b.d) kVar).a(this.E, this.F);
        this.f401b = true;
        try {
            W(this.E, this.F);
            d();
            g0();
            v();
            this.f402c.b();
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    public final void C(ArrayList<c.m.b.d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<c.m.b.d> arrayList3;
        int i4;
        ViewGroup viewGroup;
        Fragment fragment;
        int i5;
        int i6;
        boolean z;
        ArrayList<c.m.b.d> arrayList4 = arrayList;
        ArrayList<Boolean> arrayList5 = arrayList2;
        int i7 = i3;
        boolean z2 = arrayList4.get(i2).p;
        ArrayList<Fragment> arrayList6 = this.G;
        if (arrayList6 == null) {
            this.G = new ArrayList<>();
        } else {
            arrayList6.clear();
        }
        this.G.addAll(this.f402c.h());
        Fragment fragment2 = this.s;
        boolean z3 = false;
        int i8 = i2;
        while (true) {
            int i9 = 1;
            if (i8 >= i7) {
                this.G.clear();
                if (z2 || this.o < 1) {
                    arrayList3 = arrayList;
                    i4 = i3;
                } else {
                    int i10 = i2;
                    i4 = i3;
                    while (true) {
                        arrayList3 = arrayList;
                        if (i10 < i4) {
                            Iterator<d0.a> it = arrayList3.get(i10).a.iterator();
                            while (it.hasNext()) {
                                Fragment fragment3 = it.next().f2328b;
                                if (fragment3 != null && fragment3.mFragmentManager != null) {
                                    this.f402c.i(f(fragment3));
                                }
                            }
                            i10++;
                        }
                    }
                }
                for (int i11 = i2; i11 < i4; i11++) {
                    c.m.b.d dVar = arrayList3.get(i11);
                    if (arrayList2.get(i11).booleanValue()) {
                        dVar.f(-1);
                        boolean z4 = true;
                        int size = dVar.a.size() - 1;
                        while (size >= 0) {
                            d0.a aVar = dVar.a.get(size);
                            Fragment fragment4 = aVar.f2328b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = false;
                                fragment4.setPopDirection(z4);
                                int i12 = dVar.f2319f;
                                int i13 = 4097;
                                if (i12 == 4097) {
                                    i13 = 8194;
                                } else if (i12 != 8194) {
                                    i13 = i12 != 8197 ? i12 != 4099 ? i12 != 4100 ? 0 : 8197 : 4099 : 4100;
                                }
                                fragment4.setNextTransition(i13);
                                fragment4.setSharedElementNames(dVar.o, dVar.f2327n);
                            }
                            switch (aVar.a) {
                                case 1:
                                    fragment4.setAnimations(aVar.f2330d, aVar.f2331e, aVar.f2332f, aVar.f2333g);
                                    dVar.q.a0(fragment4, true);
                                    dVar.q.V(fragment4);
                                    break;
                                case 2:
                                default:
                                    StringBuilder y = e.a.d.a.a.y("Unknown cmd: ");
                                    y.append(aVar.a);
                                    throw new IllegalArgumentException(y.toString());
                                case 3:
                                    fragment4.setAnimations(aVar.f2330d, aVar.f2331e, aVar.f2332f, aVar.f2333g);
                                    dVar.q.a(fragment4);
                                    break;
                                case 4:
                                    fragment4.setAnimations(aVar.f2330d, aVar.f2331e, aVar.f2332f, aVar.f2333g);
                                    dVar.q.e0(fragment4);
                                    break;
                                case 5:
                                    fragment4.setAnimations(aVar.f2330d, aVar.f2331e, aVar.f2332f, aVar.f2333g);
                                    dVar.q.a0(fragment4, true);
                                    dVar.q.K(fragment4);
                                    break;
                                case 6:
                                    fragment4.setAnimations(aVar.f2330d, aVar.f2331e, aVar.f2332f, aVar.f2333g);
                                    dVar.q.c(fragment4);
                                    break;
                                case 7:
                                    fragment4.setAnimations(aVar.f2330d, aVar.f2331e, aVar.f2332f, aVar.f2333g);
                                    dVar.q.a0(fragment4, true);
                                    dVar.q.g(fragment4);
                                    break;
                                case 8:
                                    dVar.q.c0(null);
                                    break;
                                case 9:
                                    dVar.q.c0(fragment4);
                                    break;
                                case 10:
                                    dVar.q.b0(fragment4, aVar.f2334h);
                                    break;
                            }
                            size--;
                            z4 = true;
                        }
                        continue;
                    } else {
                        dVar.f(1);
                        int size2 = dVar.a.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            d0.a aVar2 = dVar.a.get(i14);
                            Fragment fragment5 = aVar2.f2328b;
                            if (fragment5 != null) {
                                fragment5.mBeingSaved = false;
                                fragment5.setPopDirection(false);
                                fragment5.setNextTransition(dVar.f2319f);
                                fragment5.setSharedElementNames(dVar.f2327n, dVar.o);
                            }
                            switch (aVar2.a) {
                                case 1:
                                    fragment5.setAnimations(aVar2.f2330d, aVar2.f2331e, aVar2.f2332f, aVar2.f2333g);
                                    dVar.q.a0(fragment5, false);
                                    dVar.q.a(fragment5);
                                    break;
                                case 2:
                                default:
                                    StringBuilder y2 = e.a.d.a.a.y("Unknown cmd: ");
                                    y2.append(aVar2.a);
                                    throw new IllegalArgumentException(y2.toString());
                                case 3:
                                    fragment5.setAnimations(aVar2.f2330d, aVar2.f2331e, aVar2.f2332f, aVar2.f2333g);
                                    dVar.q.V(fragment5);
                                    break;
                                case 4:
                                    fragment5.setAnimations(aVar2.f2330d, aVar2.f2331e, aVar2.f2332f, aVar2.f2333g);
                                    dVar.q.K(fragment5);
                                    break;
                                case 5:
                                    fragment5.setAnimations(aVar2.f2330d, aVar2.f2331e, aVar2.f2332f, aVar2.f2333g);
                                    dVar.q.a0(fragment5, false);
                                    dVar.q.e0(fragment5);
                                    break;
                                case 6:
                                    fragment5.setAnimations(aVar2.f2330d, aVar2.f2331e, aVar2.f2332f, aVar2.f2333g);
                                    dVar.q.g(fragment5);
                                    break;
                                case 7:
                                    fragment5.setAnimations(aVar2.f2330d, aVar2.f2331e, aVar2.f2332f, aVar2.f2333g);
                                    dVar.q.a0(fragment5, false);
                                    dVar.q.c(fragment5);
                                    break;
                                case 8:
                                    dVar.q.c0(fragment5);
                                    break;
                                case 9:
                                    dVar.q.c0(null);
                                    break;
                                case 10:
                                    dVar.q.b0(fragment5, aVar2.f2335i);
                                    break;
                            }
                        }
                        continue;
                    }
                }
                boolean booleanValue = arrayList2.get(i4 - 1).booleanValue();
                for (int i15 = i2; i15 < i4; i15++) {
                    c.m.b.d dVar2 = arrayList3.get(i15);
                    if (booleanValue) {
                        for (int size3 = dVar2.a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment6 = dVar2.a.get(size3).f2328b;
                            if (fragment6 != null) {
                                f(fragment6).k();
                            }
                        }
                    } else {
                        Iterator<d0.a> it2 = dVar2.a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment7 = it2.next().f2328b;
                            if (fragment7 != null) {
                                f(fragment7).k();
                            }
                        }
                    }
                }
                Q(this.o, true);
                HashSet hashSet = new HashSet();
                for (int i16 = i2; i16 < i4; i16++) {
                    Iterator<d0.a> it3 = arrayList3.get(i16).a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment8 = it3.next().f2328b;
                        if (fragment8 != null && (viewGroup = fragment8.mContainer) != null) {
                            hashSet.add(k0.g(viewGroup, J()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    k0 k0Var = (k0) it4.next();
                    k0Var.f2378d = booleanValue;
                    k0Var.h();
                    k0Var.c();
                }
                for (int i17 = i2; i17 < i4; i17++) {
                    c.m.b.d dVar3 = arrayList3.get(i17);
                    if (arrayList2.get(i17).booleanValue() && dVar3.s >= 0) {
                        dVar3.s = -1;
                    }
                    Objects.requireNonNull(dVar3);
                }
                return;
            }
            c.m.b.d dVar4 = arrayList4.get(i8);
            int i18 = 3;
            if (arrayList5.get(i8).booleanValue()) {
                int i19 = 1;
                ArrayList<Fragment> arrayList7 = this.G;
                int size4 = dVar4.a.size() - 1;
                while (size4 >= 0) {
                    d0.a aVar3 = dVar4.a.get(size4);
                    int i20 = aVar3.a;
                    if (i20 != i19) {
                        if (i20 != 3) {
                            switch (i20) {
                                case 8:
                                    fragment = null;
                                    fragment2 = fragment;
                                    break;
                                case 9:
                                    fragment = aVar3.f2328b;
                                    fragment2 = fragment;
                                    break;
                                case 10:
                                    aVar3.f2335i = aVar3.f2334h;
                                    break;
                            }
                            size4--;
                            i19 = 1;
                        }
                        arrayList7.add(aVar3.f2328b);
                        size4--;
                        i19 = 1;
                    }
                    arrayList7.remove(aVar3.f2328b);
                    size4--;
                    i19 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList8 = this.G;
                int i21 = 0;
                while (i21 < dVar4.a.size()) {
                    d0.a aVar4 = dVar4.a.get(i21);
                    int i22 = aVar4.a;
                    if (i22 != i9) {
                        if (i22 == 2) {
                            Fragment fragment9 = aVar4.f2328b;
                            int i23 = fragment9.mContainerId;
                            int size5 = arrayList8.size() - 1;
                            boolean z5 = false;
                            while (size5 >= 0) {
                                Fragment fragment10 = arrayList8.get(size5);
                                if (fragment10.mContainerId != i23) {
                                    i6 = i23;
                                } else if (fragment10 == fragment9) {
                                    i6 = i23;
                                    z5 = true;
                                } else {
                                    if (fragment10 == fragment2) {
                                        i6 = i23;
                                        z = true;
                                        dVar4.a.add(i21, new d0.a(9, fragment10, true));
                                        i21++;
                                        fragment2 = null;
                                    } else {
                                        i6 = i23;
                                        z = true;
                                    }
                                    d0.a aVar5 = new d0.a(3, fragment10, z);
                                    aVar5.f2330d = aVar4.f2330d;
                                    aVar5.f2332f = aVar4.f2332f;
                                    aVar5.f2331e = aVar4.f2331e;
                                    aVar5.f2333g = aVar4.f2333g;
                                    dVar4.a.add(i21, aVar5);
                                    arrayList8.remove(fragment10);
                                    i21++;
                                }
                                size5--;
                                i23 = i6;
                            }
                            if (z5) {
                                dVar4.a.remove(i21);
                                i21--;
                            } else {
                                aVar4.a = 1;
                                aVar4.f2329c = true;
                                arrayList8.add(fragment9);
                            }
                        } else if (i22 == i18 || i22 == 6) {
                            arrayList8.remove(aVar4.f2328b);
                            Fragment fragment11 = aVar4.f2328b;
                            if (fragment11 == fragment2) {
                                dVar4.a.add(i21, new d0.a(9, fragment11));
                                i21++;
                                i5 = 1;
                                fragment2 = null;
                                i21 += i5;
                                i9 = 1;
                                i18 = 3;
                            }
                        } else if (i22 != 7) {
                            if (i22 == 8) {
                                dVar4.a.add(i21, new d0.a(9, fragment2, true));
                                aVar4.f2329c = true;
                                i21++;
                                fragment2 = aVar4.f2328b;
                            }
                        }
                        i5 = 1;
                        i21 += i5;
                        i9 = 1;
                        i18 = 3;
                    }
                    i5 = 1;
                    arrayList8.add(aVar4.f2328b);
                    i21 += i5;
                    i9 = 1;
                    i18 = 3;
                }
            }
            z3 = z3 || dVar4.f2320g;
            i8++;
            arrayList4 = arrayList;
            arrayList5 = arrayList2;
            i7 = i3;
        }
    }

    public Fragment D(String str) {
        return this.f402c.c(str);
    }

    public Fragment E(int i2) {
        c0 c0Var = this.f402c;
        int size = c0Var.a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (b0 b0Var : c0Var.f2312b.values()) {
                    if (b0Var != null) {
                        Fragment fragment = b0Var.f2309c;
                        if (fragment.mFragmentId == i2) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = c0Var.a.get(size);
            if (fragment2 != null && fragment2.mFragmentId == i2) {
                return fragment2;
            }
        }
    }

    public Fragment F(String str) {
        c0 c0Var = this.f402c;
        Objects.requireNonNull(c0Var);
        int size = c0Var.a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (b0 b0Var : c0Var.f2312b.values()) {
                    if (b0Var != null) {
                        Fragment fragment = b0Var.f2309c;
                        if (str.equals(fragment.mTag)) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = c0Var.a.get(size);
            if (fragment2 != null && str.equals(fragment2.mTag)) {
                return fragment2;
            }
        }
    }

    public final ViewGroup G(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.q.c()) {
            View b2 = this.q.b(fragment.mContainerId);
            if (b2 instanceof ViewGroup) {
                return (ViewGroup) b2;
            }
        }
        return null;
    }

    public u H() {
        Fragment fragment = this.r;
        return fragment != null ? fragment.mFragmentManager.H() : this.t;
    }

    public List<Fragment> I() {
        return this.f402c.h();
    }

    public l0 J() {
        Fragment fragment = this.r;
        return fragment != null ? fragment.mFragmentManager.J() : this.u;
    }

    public void K(Fragment fragment) {
        if (L(2)) {
            String str = "hide: " + fragment;
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        d0(fragment);
    }

    public final boolean M(Fragment fragment) {
        boolean z;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mChildFragmentManager;
        Iterator it = ((ArrayList) fragmentManager.f402c.f()).iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z2 = fragmentManager.M(fragment2);
                continue;
            }
            if (z2) {
                z = true;
                break;
            }
        }
        return z;
    }

    public boolean N(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean O(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.s) && O(fragmentManager.r);
    }

    public boolean P() {
        return this.A || this.B;
    }

    public void Q(int i2, boolean z) {
        v<?> vVar;
        if (this.p == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.o) {
            this.o = i2;
            c0 c0Var = this.f402c;
            Iterator<Fragment> it = c0Var.a.iterator();
            while (it.hasNext()) {
                b0 b0Var = c0Var.f2312b.get(it.next().mWho);
                if (b0Var != null) {
                    b0Var.k();
                }
            }
            Iterator<b0> it2 = c0Var.f2312b.values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                b0 next = it2.next();
                if (next != null) {
                    next.k();
                    Fragment fragment = next.f2309c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        z2 = true;
                    }
                    if (z2) {
                        if (fragment.mBeingSaved && !c0Var.f2313c.containsKey(fragment.mWho)) {
                            next.n();
                        }
                        c0Var.j(next);
                    }
                }
            }
            f0();
            if (this.z && (vVar = this.p) != null && this.o == 7) {
                vVar.g();
                this.z = false;
            }
        }
    }

    public void R() {
        if (this.p == null) {
            return;
        }
        this.A = false;
        this.B = false;
        this.H.f2420i = false;
        for (Fragment fragment : this.f402c.h()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void S(b0 b0Var) {
        Fragment fragment = b0Var.f2309c;
        if (fragment.mDeferStart) {
            if (this.f401b) {
                this.D = true;
                return;
            }
            fragment.mDeferStart = false;
            b0Var.k();
        }
    }

    public boolean T() {
        A(false);
        z(true);
        Fragment fragment = this.s;
        if (fragment == null || !fragment.getChildFragmentManager().T()) {
            boolean U = U(this.E, this.F, null, -1, 0);
            if (U) {
                this.f401b = true;
                try {
                    W(this.E, this.F);
                } finally {
                    d();
                }
            }
            g0();
            v();
            this.f402c.b();
            return U;
        }
        return true;
    }

    public boolean U(ArrayList<c.m.b.d> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        boolean z = (i3 & 1) != 0;
        ArrayList<c.m.b.d> arrayList3 = this.f403d;
        int i4 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (str != null || i2 >= 0) {
                int size = this.f403d.size() - 1;
                while (size >= 0) {
                    c.m.b.d dVar = this.f403d.get(size);
                    if ((str != null && str.equals(dVar.f2322i)) || (i2 >= 0 && i2 == dVar.s)) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z) {
                        while (size > 0) {
                            int i5 = size - 1;
                            c.m.b.d dVar2 = this.f403d.get(i5);
                            if ((str == null || !str.equals(dVar2.f2322i)) && (i2 < 0 || i2 != dVar2.s)) {
                                break;
                            }
                            size = i5;
                        }
                    } else if (size != this.f403d.size() - 1) {
                        size++;
                    }
                }
                i4 = size;
            } else {
                i4 = z ? 0 : (-1) + this.f403d.size();
            }
        }
        if (i4 < 0) {
            return false;
        }
        for (int size2 = this.f403d.size() - 1; size2 >= i4; size2--) {
            arrayList.add(this.f403d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public void V(Fragment fragment) {
        if (L(2)) {
            String str = "remove: " + fragment + " nesting=" + fragment.mBackStackNesting;
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f402c.k(fragment);
            if (M(fragment)) {
                this.z = true;
            }
            fragment.mRemoving = true;
            d0(fragment);
        }
    }

    public final void W(ArrayList<c.m.b.d> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).p) {
                if (i3 != i2) {
                    C(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                        i3++;
                    }
                }
                C(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            C(arrayList, arrayList2, i3, size);
        }
    }

    public void X(Parcelable parcelable) {
        FragmentManagerState fragmentManagerState;
        ArrayList<FragmentState> arrayList;
        int i2;
        b0 b0Var;
        if (parcelable == null || (arrayList = (fragmentManagerState = (FragmentManagerState) parcelable).a) == null) {
            return;
        }
        c0 c0Var = this.f402c;
        c0Var.f2313c.clear();
        Iterator<FragmentState> it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            c0Var.f2313c.put(next.f429b, next);
        }
        this.f402c.f2312b.clear();
        Iterator<String> it2 = fragmentManagerState.f419b.iterator();
        while (it2.hasNext()) {
            FragmentState l2 = this.f402c.l(it2.next(), null);
            if (l2 != null) {
                Fragment fragment = this.H.f2415d.get(l2.f429b);
                if (fragment != null) {
                    if (L(2)) {
                        String str = "restoreSaveState: re-attaching retained " + fragment;
                    }
                    b0Var = new b0(this.f412m, this.f402c, fragment, l2);
                } else {
                    b0Var = new b0(this.f412m, this.f402c, this.p.f2408b.getClassLoader(), H(), l2);
                }
                Fragment fragment2 = b0Var.f2309c;
                fragment2.mFragmentManager = this;
                if (L(2)) {
                    StringBuilder y = e.a.d.a.a.y("restoreSaveState: active (");
                    y.append(fragment2.mWho);
                    y.append("): ");
                    y.append(fragment2);
                    y.toString();
                }
                b0Var.l(this.p.f2408b.getClassLoader());
                this.f402c.i(b0Var);
                b0Var.f2311e = this.o;
            }
        }
        z zVar = this.H;
        Objects.requireNonNull(zVar);
        Iterator it3 = new ArrayList(zVar.f2415d.values()).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it3.next();
            if ((this.f402c.f2312b.get(fragment3.mWho) != null ? 1 : 0) == 0) {
                if (L(2)) {
                    String str2 = "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f419b;
                }
                this.H.f(fragment3);
                fragment3.mFragmentManager = this;
                b0 b0Var2 = new b0(this.f412m, this.f402c, fragment3);
                b0Var2.f2311e = 1;
                b0Var2.k();
                fragment3.mRemoving = true;
                b0Var2.k();
            }
        }
        c0 c0Var2 = this.f402c;
        ArrayList<String> arrayList2 = fragmentManagerState.f420c;
        c0Var2.a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                Fragment c2 = c0Var2.c(str3);
                if (c2 == null) {
                    throw new IllegalStateException(e.a.d.a.a.l("No instantiated fragment for (", str3, ")"));
                }
                if (L(2)) {
                    String str4 = "restoreSaveState: added (" + str3 + "): " + c2;
                }
                c0Var2.a(c2);
            }
        }
        if (fragmentManagerState.f421d != null) {
            this.f403d = new ArrayList<>(fragmentManagerState.f421d.length);
            int i3 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f421d;
                if (i3 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i3];
                Objects.requireNonNull(backStackRecordState);
                c.m.b.d dVar = new c.m.b.d(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = backStackRecordState.a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    d0.a aVar = new d0.a();
                    int i6 = i4 + 1;
                    aVar.a = iArr[i4];
                    if (L(2)) {
                        String str5 = "Instantiate " + dVar + " op #" + i5 + " base fragment #" + backStackRecordState.a[i6];
                    }
                    aVar.f2334h = j.b.values()[backStackRecordState.f371c[i5]];
                    aVar.f2335i = j.b.values()[backStackRecordState.f372d[i5]];
                    int[] iArr2 = backStackRecordState.a;
                    int i7 = i6 + 1;
                    aVar.f2329c = iArr2[i6] != 0;
                    int i8 = i7 + 1;
                    int i9 = iArr2[i7];
                    aVar.f2330d = i9;
                    int i10 = i8 + 1;
                    int i11 = iArr2[i8];
                    aVar.f2331e = i11;
                    int i12 = i10 + 1;
                    int i13 = iArr2[i10];
                    aVar.f2332f = i13;
                    int i14 = iArr2[i12];
                    aVar.f2333g = i14;
                    dVar.f2315b = i9;
                    dVar.f2316c = i11;
                    dVar.f2317d = i13;
                    dVar.f2318e = i14;
                    dVar.b(aVar);
                    i5++;
                    i4 = i12 + 1;
                }
                dVar.f2319f = backStackRecordState.f373e;
                dVar.f2322i = backStackRecordState.f374f;
                dVar.f2320g = true;
                dVar.f2323j = backStackRecordState.f376h;
                dVar.f2324k = backStackRecordState.f377i;
                dVar.f2325l = backStackRecordState.f378j;
                dVar.f2326m = backStackRecordState.f379k;
                dVar.f2327n = backStackRecordState.f380l;
                dVar.o = backStackRecordState.f381m;
                dVar.p = backStackRecordState.f382n;
                dVar.s = backStackRecordState.f375g;
                for (int i15 = 0; i15 < backStackRecordState.f370b.size(); i15++) {
                    String str6 = backStackRecordState.f370b.get(i15);
                    if (str6 != null) {
                        dVar.a.get(i15).f2328b = this.f402c.c(str6);
                    }
                }
                dVar.f(1);
                if (L(2)) {
                    StringBuilder z = e.a.d.a.a.z("restoreAllState: back stack #", i3, " (index ");
                    z.append(dVar.s);
                    z.append("): ");
                    z.append(dVar);
                    z.toString();
                    PrintWriter printWriter = new PrintWriter(new j0("FragmentManager"));
                    dVar.j("  ", printWriter, false);
                    printWriter.close();
                }
                this.f403d.add(dVar);
                i3++;
            }
        } else {
            this.f403d = null;
        }
        this.f408i.set(fragmentManagerState.f422e);
        String str7 = fragmentManagerState.f423f;
        if (str7 != null) {
            Fragment c3 = this.f402c.c(str7);
            this.s = c3;
            r(c3);
        }
        ArrayList<String> arrayList3 = fragmentManagerState.f424g;
        if (arrayList3 != null) {
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                this.f409j.put(arrayList3.get(i16), fragmentManagerState.f425h.get(i16));
            }
        }
        ArrayList<String> arrayList4 = fragmentManagerState.f426i;
        if (arrayList4 != null) {
            while (i2 < arrayList4.size()) {
                Bundle bundle = fragmentManagerState.f427j.get(i2);
                bundle.setClassLoader(this.p.f2408b.getClassLoader());
                this.f410k.put(arrayList4.get(i2), bundle);
                i2++;
            }
        }
        this.y = new ArrayDeque<>(fragmentManagerState.f428k);
    }

    public Parcelable Y() {
        int i2;
        ArrayList<String> arrayList;
        int size;
        Iterator it = ((HashSet) e()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            k0 k0Var = (k0) it.next();
            if (k0Var.f2379e) {
                L(2);
                k0Var.f2379e = false;
                k0Var.c();
            }
        }
        x();
        A(true);
        this.A = true;
        this.H.f2420i = true;
        c0 c0Var = this.f402c;
        Objects.requireNonNull(c0Var);
        ArrayList<String> arrayList2 = new ArrayList<>(c0Var.f2312b.size());
        for (b0 b0Var : c0Var.f2312b.values()) {
            if (b0Var != null) {
                Fragment fragment = b0Var.f2309c;
                b0Var.n();
                arrayList2.add(fragment.mWho);
                if (L(2)) {
                    String str = "Saved state of " + fragment + ": " + fragment.mSavedFragmentState;
                }
            }
        }
        c0 c0Var2 = this.f402c;
        Objects.requireNonNull(c0Var2);
        ArrayList<FragmentState> arrayList3 = new ArrayList<>(c0Var2.f2313c.values());
        BackStackRecordState[] backStackRecordStateArr = null;
        if (arrayList3.isEmpty()) {
            L(2);
            return null;
        }
        c0 c0Var3 = this.f402c;
        synchronized (c0Var3.a) {
            if (c0Var3.a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(c0Var3.a.size());
                Iterator<Fragment> it2 = c0Var3.a.iterator();
                while (it2.hasNext()) {
                    Fragment next = it2.next();
                    arrayList.add(next.mWho);
                    if (L(2)) {
                        String str2 = "saveAllState: adding fragment (" + next.mWho + "): " + next;
                    }
                }
            }
        }
        ArrayList<c.m.b.d> arrayList4 = this.f403d;
        if (arrayList4 != null && (size = arrayList4.size()) > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (i2 = 0; i2 < size; i2++) {
                backStackRecordStateArr[i2] = new BackStackRecordState(this.f403d.get(i2));
                if (L(2)) {
                    StringBuilder z = e.a.d.a.a.z("saveAllState: adding back stack #", i2, ": ");
                    z.append(this.f403d.get(i2));
                    z.toString();
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.a = arrayList3;
        fragmentManagerState.f419b = arrayList2;
        fragmentManagerState.f420c = arrayList;
        fragmentManagerState.f421d = backStackRecordStateArr;
        fragmentManagerState.f422e = this.f408i.get();
        Fragment fragment2 = this.s;
        if (fragment2 != null) {
            fragmentManagerState.f423f = fragment2.mWho;
        }
        fragmentManagerState.f424g.addAll(this.f409j.keySet());
        fragmentManagerState.f425h.addAll(this.f409j.values());
        fragmentManagerState.f426i.addAll(this.f410k.keySet());
        fragmentManagerState.f427j.addAll(this.f410k.values());
        fragmentManagerState.f428k = new ArrayList<>(this.y);
        return fragmentManagerState;
    }

    public void Z() {
        synchronized (this.a) {
            boolean z = true;
            if (this.a.size() != 1) {
                z = false;
            }
            if (z) {
                this.p.f2409c.removeCallbacks(this.I);
                this.p.f2409c.post(this.I);
                g0();
            }
        }
    }

    public b0 a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            c.m.b.n0.d.d(fragment, str);
        }
        if (L(2)) {
            String str2 = "add: " + fragment;
        }
        b0 f2 = f(fragment);
        fragment.mFragmentManager = this;
        this.f402c.i(f2);
        if (!fragment.mDetached) {
            this.f402c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (M(fragment)) {
                this.z = true;
            }
        }
        return f2;
    }

    public void a0(Fragment fragment, boolean z) {
        ViewGroup G = G(fragment);
        if (G == null || !(G instanceof s)) {
            return;
        }
        ((s) G).setDrawDisappearingViewsLast(!z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public void b(v<?> vVar, r rVar, Fragment fragment) {
        if (this.p != null) {
            throw new IllegalStateException("Already attached");
        }
        this.p = vVar;
        this.q = rVar;
        this.r = fragment;
        if (fragment != null) {
            this.f413n.add(new e(this, fragment));
        } else if (vVar instanceof a0) {
            this.f413n.add((a0) vVar);
        }
        if (this.r != null) {
            g0();
        }
        if (vVar instanceof c.a.f) {
            c.a.f fVar = (c.a.f) vVar;
            OnBackPressedDispatcher onBackPressedDispatcher = fVar.getOnBackPressedDispatcher();
            this.f406g = onBackPressedDispatcher;
            Fragment fragment2 = fVar;
            if (fragment != null) {
                fragment2 = fragment;
            }
            c.a.e eVar = this.f407h;
            Objects.requireNonNull(onBackPressedDispatcher);
            c.p.j lifecycle = fragment2.getLifecycle();
            if (((c.p.r) lifecycle).f2467c != j.b.DESTROYED) {
                eVar.f684b.add(new OnBackPressedDispatcher.LifecycleOnBackPressedCancellable(lifecycle, eVar));
            }
        }
        if (fragment != null) {
            z zVar = fragment.mFragmentManager.H;
            z zVar2 = zVar.f2416e.get(fragment.mWho);
            if (zVar2 == null) {
                zVar2 = new z(zVar.f2418g);
                zVar.f2416e.put(fragment.mWho, zVar2);
            }
            this.H = zVar2;
        } else if (vVar instanceof n0) {
            m0 viewModelStore = ((n0) vVar).getViewModelStore();
            i0 i0Var = z.f2414c;
            String canonicalName = z.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String k2 = e.a.d.a.a.k("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            g0 g0Var = viewModelStore.a.get(k2);
            if (!z.class.isInstance(g0Var)) {
                g0Var = i0Var instanceof c.p.j0 ? ((c.p.j0) i0Var).c(k2, z.class) : ((z.a) i0Var).a(z.class);
                g0 put = viewModelStore.a.put(k2, g0Var);
                if (put != null) {
                    put.a();
                }
            } else if (i0Var instanceof c.p.l0) {
                ((c.p.l0) i0Var).b(g0Var);
            }
            this.H = (z) g0Var;
        } else {
            this.H = new z(false);
        }
        this.H.f2420i = P();
        this.f402c.f2314d = this.H;
        v<?> vVar2 = this.p;
        if ((vVar2 instanceof c.w.c) && fragment == null) {
            c.w.a savedStateRegistry = ((c.w.c) vVar2).getSavedStateRegistry();
            savedStateRegistry.b("android:support:fragments", new a.b() { // from class: c.m.b.c
                @Override // c.w.a.b
                public final Bundle a() {
                    FragmentManager fragmentManager = FragmentManager.this;
                    Objects.requireNonNull(fragmentManager);
                    Bundle bundle = new Bundle();
                    Parcelable Y = fragmentManager.Y();
                    if (Y != null) {
                        bundle.putParcelable("android:support:fragments", Y);
                    }
                    return bundle;
                }
            });
            Bundle a2 = savedStateRegistry.a("android:support:fragments");
            if (a2 != null) {
                X(a2.getParcelable("android:support:fragments"));
            }
        }
        v<?> vVar3 = this.p;
        if (vVar3 instanceof c.a.h.c) {
            ActivityResultRegistry activityResultRegistry = ((c.a.h.c) vVar3).getActivityResultRegistry();
            String k3 = e.a.d.a.a.k("FragmentManager:", fragment != null ? e.a.d.a.a.r(new StringBuilder(), fragment.mWho, ":") : "");
            this.v = activityResultRegistry.c(e.a.d.a.a.k(k3, "StartActivityForResult"), new c.a.h.d.c(), new f());
            this.w = activityResultRegistry.c(e.a.d.a.a.k(k3, "StartIntentSenderForResult"), new i(), new g());
            this.x = activityResultRegistry.c(e.a.d.a.a.k(k3, "RequestPermissions"), new c.a.h.d.b(), new h());
        }
    }

    public void b0(Fragment fragment, j.b bVar) {
        if (fragment.equals(D(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void c(Fragment fragment) {
        if (L(2)) {
            String str = "attach: " + fragment;
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f402c.a(fragment);
            if (L(2)) {
                String str2 = "add from attach: " + fragment;
            }
            if (M(fragment)) {
                this.z = true;
            }
        }
    }

    public void c0(Fragment fragment) {
        if (fragment == null || (fragment.equals(D(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.s;
            this.s = fragment;
            r(fragment2);
            r(this.s);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void d() {
        this.f401b = false;
        this.F.clear();
        this.E.clear();
    }

    public final void d0(Fragment fragment) {
        ViewGroup G = G(fragment);
        if (G != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (G.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    G.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) G.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final Set<k0> e() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f402c.e()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((b0) it.next()).f2309c.mContainer;
            if (viewGroup != null) {
                hashSet.add(k0.g(viewGroup, J()));
            }
        }
        return hashSet;
    }

    public void e0(Fragment fragment) {
        if (L(2)) {
            String str = "show: " + fragment;
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public b0 f(Fragment fragment) {
        b0 g2 = this.f402c.g(fragment.mWho);
        if (g2 != null) {
            return g2;
        }
        b0 b0Var = new b0(this.f412m, this.f402c, fragment);
        b0Var.l(this.p.f2408b.getClassLoader());
        b0Var.f2311e = this.o;
        return b0Var;
    }

    public final void f0() {
        Iterator it = ((ArrayList) this.f402c.e()).iterator();
        while (it.hasNext()) {
            S((b0) it.next());
        }
    }

    public void g(Fragment fragment) {
        if (L(2)) {
            String str = "detach: " + fragment;
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (L(2)) {
                String str2 = "remove from detach: " + fragment;
            }
            this.f402c.k(fragment);
            if (M(fragment)) {
                this.z = true;
            }
            d0(fragment);
        }
    }

    public final void g0() {
        synchronized (this.a) {
            boolean z = true;
            if (!this.a.isEmpty()) {
                this.f407h.a = true;
                return;
            }
            c.a.e eVar = this.f407h;
            ArrayList<c.m.b.d> arrayList = this.f403d;
            eVar.a = ((arrayList != null ? arrayList.size() : 0) <= 0 || !O(this.r)) ? false : false;
        }
    }

    public void h(Configuration configuration) {
        for (Fragment fragment : this.f402c.h()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public boolean i(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (Fragment fragment : this.f402c.h()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void j() {
        this.A = false;
        this.B = false;
        this.H.f2420i = false;
        u(1);
    }

    public boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f402c.h()) {
            if (fragment != null && N(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f404e != null) {
            for (int i2 = 0; i2 < this.f404e.size(); i2++) {
                Fragment fragment2 = this.f404e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f404e = arrayList;
        return z;
    }

    public void l() {
        boolean z = true;
        this.C = true;
        A(true);
        x();
        v<?> vVar = this.p;
        if (vVar instanceof n0) {
            z = this.f402c.f2314d.f2419h;
        } else {
            Context context = vVar.f2408b;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            for (BackStackState backStackState : this.f409j.values()) {
                for (String str : backStackState.a) {
                    z zVar = this.f402c.f2314d;
                    Objects.requireNonNull(zVar);
                    L(3);
                    zVar.e(str);
                }
            }
        }
        u(-1);
        this.p = null;
        this.q = null;
        this.r = null;
        if (this.f406g != null) {
            Iterator<c.a.d> it = this.f407h.f684b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f406g = null;
        }
        c.a.h.b<Intent> bVar = this.v;
        if (bVar != null) {
            bVar.b();
            this.w.b();
            this.x.b();
        }
    }

    public void m() {
        for (Fragment fragment : this.f402c.h()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public void n(boolean z) {
        for (Fragment fragment : this.f402c.h()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public void o() {
        Iterator it = ((ArrayList) this.f402c.f()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }

    public boolean p(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (Fragment fragment : this.f402c.h()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void q(Menu menu) {
        if (this.o < 1) {
            return;
        }
        for (Fragment fragment : this.f402c.h()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(Fragment fragment) {
        if (fragment == null || !fragment.equals(D(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public void s(boolean z) {
        for (Fragment fragment : this.f402c.h()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public boolean t(Menu menu) {
        boolean z = false;
        if (this.o < 1) {
            return false;
        }
        for (Fragment fragment : this.f402c.h()) {
            if (fragment != null && N(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public String toString() {
        StringBuilder v = e.a.d.a.a.v(128, "FragmentManager{");
        v.append(Integer.toHexString(System.identityHashCode(this)));
        v.append(" in ");
        Fragment fragment = this.r;
        if (fragment != null) {
            v.append(fragment.getClass().getSimpleName());
            v.append("{");
            v.append(Integer.toHexString(System.identityHashCode(this.r)));
            v.append("}");
        } else {
            v<?> vVar = this.p;
            if (vVar != null) {
                v.append(vVar.getClass().getSimpleName());
                v.append("{");
                v.append(Integer.toHexString(System.identityHashCode(this.p)));
                v.append("}");
            } else {
                v.append("null");
            }
        }
        v.append("}}");
        return v.toString();
    }

    public final void u(int i2) {
        try {
            this.f401b = true;
            for (b0 b0Var : this.f402c.f2312b.values()) {
                if (b0Var != null) {
                    b0Var.f2311e = i2;
                }
            }
            Q(i2, false);
            Iterator it = ((HashSet) e()).iterator();
            while (it.hasNext()) {
                ((k0) it.next()).e();
            }
            this.f401b = false;
            A(true);
        } catch (Throwable th) {
            this.f401b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.D) {
            this.D = false;
            f0();
        }
    }

    public void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String k2 = e.a.d.a.a.k(str, "    ");
        c0 c0Var = this.f402c;
        Objects.requireNonNull(c0Var);
        String str2 = str + "    ";
        if (!c0Var.f2312b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (b0 b0Var : c0Var.f2312b.values()) {
                printWriter.print(str);
                if (b0Var != null) {
                    Fragment fragment = b0Var.f2309c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = c0Var.a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c0Var.a.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f404e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f404e.get(i3).toString());
            }
        }
        ArrayList<c.m.b.d> arrayList2 = this.f403d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                c.m.b.d dVar = this.f403d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(dVar.toString());
                dVar.j(k2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f408i.get());
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
                    printWriter.println((k) this.a.get(i5));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.q);
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.A);
        printWriter.print(" mStopped=");
        printWriter.print(this.B);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.C);
        if (this.z) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.z);
        }
    }

    public final void x() {
        Iterator it = ((HashSet) e()).iterator();
        while (it.hasNext()) {
            ((k0) it.next()).e();
        }
    }

    public void y(k kVar, boolean z) {
        if (!z) {
            if (this.p == null) {
                if (!this.C) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else if (P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            if (this.p == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.a.add(kVar);
            Z();
        }
    }

    public final void z(boolean z) {
        if (this.f401b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.p == null) {
            if (!this.C) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        } else if (Looper.myLooper() != this.p.f2409c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z && P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
            if (this.E == null) {
                this.E = new ArrayList<>();
                this.F = new ArrayList<>();
            }
        }
    }
}
