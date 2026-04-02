package androidx.fragment.app;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import androidx.lifecycle.g;
import com.amazon.aps.iva.n4.e0;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;
/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
public final class a extends r implements FragmentManager.j, FragmentManager.p {
    public final FragmentManager s;
    public boolean t;
    public int u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            androidx.fragment.app.j r0 = r3.F()
            com.amazon.aps.iva.n4.n<?> r1 = r3.v
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.c
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L10
        Lf:
            r1 = 0
        L10:
            r2.<init>(r0, r1)
            r0 = -1
            r2.u = r0
            r2.s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.<init>(androidx.fragment.app.FragmentManager):void");
    }

    @Override // androidx.fragment.app.FragmentManager.p
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.H(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.i) {
            FragmentManager fragmentManager = this.s;
            if (fragmentManager.d == null) {
                fragmentManager.d = new ArrayList<>();
            }
            fragmentManager.d.add(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.r
    public final void d(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            com.amazon.aps.iva.o4.d.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.mTag;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                    sb.append(fragment);
                    sb.append(": was ");
                    throw new IllegalStateException(com.amazon.aps.iva.n4.a.a(sb, fragment.mTag, " now ", str));
                }
                fragment.mTag = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = fragment.mFragmentId;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                    }
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            b(new r.a(fragment, i2));
            fragment.mFragmentManager = this.s;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void g(int i) {
        if (!this.i) {
            return;
        }
        if (FragmentManager.H(2)) {
            toString();
        }
        ArrayList<r.a> arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r.a aVar = arrayList.get(i2);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.mBackStackNesting += i;
                if (FragmentManager.H(2)) {
                    Objects.toString(aVar.b);
                    int i3 = aVar.b.mBackStackNesting;
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public final int getId() {
        return this.u;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public final String getName() {
        return this.k;
    }

    public final int h() {
        return j(false);
    }

    public final int i() {
        return j(true);
    }

    public final int j(boolean z) {
        if (!this.t) {
            if (FragmentManager.H(2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new e0());
                l("  ", printWriter, true);
                printWriter.close();
            }
            this.t = true;
            boolean z2 = this.i;
            FragmentManager fragmentManager = this.s;
            if (z2) {
                this.u = fragmentManager.i.getAndIncrement();
            } else {
                this.u = -1;
            }
            fragmentManager.v(this, z);
            return this.u;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void k() {
        if (!this.i) {
            this.j = false;
            this.s.y(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void l(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.t);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        ArrayList<r.a> arrayList = this.c;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                r.a aVar = arrayList.get(i);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
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
                        str2 = "cmd=" + aVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (z) {
                    if (aVar.d != 0 || aVar.e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.e));
                    }
                    if (aVar.f != 0 || aVar.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.g));
                    }
                }
            }
        }
    }

    public final a m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.s) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        b(new r.a(fragment, 3));
        return this;
    }

    public final a n(Fragment fragment, g.b bVar) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.s;
        if (fragmentManager == fragmentManager2) {
            if (bVar == g.b.INITIALIZED && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
            } else if (bVar != g.b.DESTROYED) {
                b(new r.a(fragment, bVar));
                return this;
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.u >= 0) {
            sb.append(" #");
            sb.append(this.u);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }
}
