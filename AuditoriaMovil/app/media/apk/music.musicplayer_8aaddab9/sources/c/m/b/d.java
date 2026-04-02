package c.m.b;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c.m.b.d0;
import ch.qos.logback.core.joran.action.ActionConst;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class d extends d0 implements FragmentManager.k {
    public final FragmentManager q;
    public boolean r;
    public int s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            c.m.b.u r0 = r3.H()
            c.m.b.v<?> r1 = r3.p
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.f2408b
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L10
        Lf:
            r1 = 0
        L10:
            r2.<init>(r0, r1)
            r0 = -1
            r2.s = r0
            r2.q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.m.b.d.<init>(androidx.fragment.app.FragmentManager):void");
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public boolean a(ArrayList<d> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.L(2)) {
            String str = "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f2320g) {
            FragmentManager fragmentManager = this.q;
            if (fragmentManager.f403d == null) {
                fragmentManager.f403d = new ArrayList<>();
            }
            fragmentManager.f403d.add(this);
            return true;
        }
        return true;
    }

    @Override // c.m.b.d0
    public int c() {
        return h(false);
    }

    @Override // c.m.b.d0
    public void d(int i2, Fragment fragment, String str, int i3) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            c.m.b.n0.d.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder y = e.a.d.a.a.y("Fragment ");
            y.append(cls.getCanonicalName());
            y.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(y.toString());
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(e.a.d.a.a.s(sb, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i4 = fragment.mFragmentId;
            if (i4 != 0 && i4 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
            }
            fragment.mFragmentId = i2;
            fragment.mContainerId = i2;
        }
        b(new d0.a(i3, fragment));
        fragment.mFragmentManager = this.q;
    }

    public void f(int i2) {
        if (this.f2320g) {
            if (FragmentManager.L(2)) {
                String str = "Bump nesting in " + this + " by " + i2;
            }
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                d0.a aVar = this.a.get(i3);
                Fragment fragment = aVar.f2328b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (FragmentManager.L(2)) {
                        StringBuilder y = e.a.d.a.a.y("Bump nesting of ");
                        y.append(aVar.f2328b);
                        y.append(" to ");
                        y.append(aVar.f2328b.mBackStackNesting);
                        y.toString();
                    }
                }
            }
        }
    }

    public int g() {
        return h(true);
    }

    public int h(boolean z) {
        if (this.r) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.L(2)) {
            String str = "Commit: " + this;
            PrintWriter printWriter = new PrintWriter(new j0("FragmentManager"));
            j("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        if (this.f2320g) {
            this.s = this.q.f408i.getAndIncrement();
        } else {
            this.s = -1;
        }
        this.q.y(this, z);
        return this.s;
    }

    public void i() {
        if (this.f2320g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2321h = false;
        this.q.B(this, false);
    }

    public void j(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2322i);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f2319f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2319f));
            }
            if (this.f2315b != 0 || this.f2316c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2315b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2316c));
            }
            if (this.f2317d != 0 || this.f2318e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2317d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2318e));
            }
            if (this.f2323j != 0 || this.f2324k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2323j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2324k);
            }
            if (this.f2325l != 0 || this.f2326m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2325l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2326m);
            }
        }
        if (this.a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            d0.a aVar = this.a.get(i2);
            switch (aVar.a) {
                case 0:
                    str2 = ActionConst.NULL;
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder y = e.a.d.a.a.y("cmd=");
                    y.append(aVar.a);
                    str2 = y.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f2328b);
            if (z) {
                if (aVar.f2330d != 0 || aVar.f2331e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2330d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2331e));
                }
                if (aVar.f2332f != 0 || aVar.f2333g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2332f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2333g));
                }
            }
        }
    }

    public String toString() {
        StringBuilder v = e.a.d.a.a.v(128, "BackStackEntry{");
        v.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            v.append(" #");
            v.append(this.s);
        }
        if (this.f2322i != null) {
            v.append(" ");
            v.append(this.f2322i);
        }
        v.append("}");
        return v.toString();
    }
}
