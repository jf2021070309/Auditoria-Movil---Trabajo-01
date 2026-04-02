package c.b.h.i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import c.i.k.e0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class g implements c.i.f.a.a {
    public static final int[] a = {1, 4, 5, 3, 2, 0};

    /* renamed from: b  reason: collision with root package name */
    public final Context f1000b;

    /* renamed from: c  reason: collision with root package name */
    public final Resources f1001c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1002d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1003e;

    /* renamed from: f  reason: collision with root package name */
    public a f1004f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<i> f1005g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<i> f1006h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1007i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<i> f1008j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<i> f1009k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1010l;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f1012n;
    public Drawable o;
    public View p;
    public i w;
    public boolean y;

    /* renamed from: m  reason: collision with root package name */
    public int f1011m = 0;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public ArrayList<i> u = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<m>> v = new CopyOnWriteArrayList<>();
    public boolean x = false;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        boolean z;
        boolean z2 = false;
        this.f1000b = context;
        Resources resources = context.getResources();
        this.f1001c = resources;
        this.f1005g = new ArrayList<>();
        this.f1006h = new ArrayList<>();
        this.f1007i = true;
        this.f1008j = new ArrayList<>();
        this.f1009k = new ArrayList<>();
        this.f1010l = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = e0.a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.f1003e = z2;
    }

    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 >= 0) {
            int[] iArr = a;
            if (i6 < iArr.length) {
                int i7 = (iArr[i6] << 16) | (65535 & i4);
                i iVar = new i(this, i2, i3, i4, i7, charSequence, this.f1011m);
                ArrayList<i> arrayList = this.f1005g;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i5 = 0;
                        break;
                    } else if (arrayList.get(size).f1017d <= i7) {
                        i5 = size + 1;
                        break;
                    }
                }
                arrayList.add(i5, iVar);
                q(true);
                return iVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f1001c.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f1001c.getString(i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f1000b.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            i iVar = (i) a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            iVar.setIcon(resolveInfo.loadIcon(packageManager));
            iVar.setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = iVar;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f1001c.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f1001c.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        i iVar = (i) a(i2, i3, i4, charSequence);
        r rVar = new r(this.f1000b, this, iVar);
        iVar.o = rVar;
        rVar.setHeaderTitle(iVar.f1018e);
        return rVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar, Context context) {
        this.v.add(new WeakReference<>(mVar));
        mVar.h(context, this);
        this.f1010l = true;
    }

    public final void c(boolean z) {
        if (this.t) {
            return;
        }
        this.t = true;
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.v.remove(next);
            } else {
                mVar.b(this, z);
            }
        }
        this.t = false;
    }

    @Override // android.view.Menu
    public void clear() {
        i iVar = this.w;
        if (iVar != null) {
            d(iVar);
        }
        this.f1005g.clear();
        q(true);
    }

    public void clearHeader() {
        this.o = null;
        this.f1012n = null;
        this.p = null;
        q(false);
    }

    @Override // android.view.Menu
    public void close() {
        c(true);
    }

    public boolean d(i iVar) {
        boolean z = false;
        if (!this.v.isEmpty() && this.w == iVar) {
            z();
            Iterator<WeakReference<m>> it = this.v.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.v.remove(next);
                } else {
                    z = mVar.e(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            y();
            if (z) {
                this.w = null;
            }
        }
        return z;
    }

    public boolean e(g gVar, MenuItem menuItem) {
        a aVar = this.f1004f;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public boolean f(i iVar) {
        boolean z = false;
        if (this.v.isEmpty()) {
            return false;
        }
        z();
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.v.remove(next);
            } else {
                z = mVar.f(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        y();
        if (z) {
            this.w = iVar;
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f1005g.get(i3);
            if (iVar.a == i2) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public i g(int i2, KeyEvent keyEvent) {
        ArrayList<i> arrayList = this.u;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n2 = n();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = arrayList.get(i3);
            char c2 = n2 ? iVar.f1023j : iVar.f1021h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i2 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f1005g.get(i2);
    }

    public void h(List<i> list, int i2, KeyEvent keyEvent) {
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f1005g.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = this.f1005g.get(i3);
                if (iVar.hasSubMenu()) {
                    iVar.o.h(list, i2, keyEvent);
                }
                char c2 = n2 ? iVar.f1023j : iVar.f1021h;
                if (((modifiers & 69647) == ((n2 ? iVar.f1024k : iVar.f1022i) & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (n2 && c2 == '\b' && i2 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1005g.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        ArrayList<i> l2 = l();
        if (this.f1010l) {
            Iterator<WeakReference<m>> it = this.v.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.v.remove(next);
                } else {
                    z |= mVar.d();
                }
            }
            if (z) {
                this.f1008j.clear();
                this.f1009k.clear();
                int size = l2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = l2.get(i2);
                    if (iVar.g()) {
                        this.f1008j.add(iVar);
                    } else {
                        this.f1009k.add(iVar);
                    }
                }
            } else {
                this.f1008j.clear();
                this.f1009k.clear();
                this.f1009k.addAll(l());
            }
            this.f1010l = false;
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public g k() {
        return this;
    }

    public ArrayList<i> l() {
        if (this.f1007i) {
            this.f1006h.clear();
            int size = this.f1005g.size();
            for (int i2 = 0; i2 < size; i2++) {
                i iVar = this.f1005g.get(i2);
                if (iVar.isVisible()) {
                    this.f1006h.add(iVar);
                }
            }
            this.f1007i = false;
            this.f1010l = true;
            return this.f1006h;
        }
        return this.f1006h;
    }

    public boolean m() {
        return this.x;
    }

    public boolean n() {
        return this.f1002d;
    }

    public boolean o() {
        return this.f1003e;
    }

    public void p() {
        this.f1010l = true;
        q(true);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return r(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        i g2 = g(i2, keyEvent);
        boolean s = g2 != null ? s(g2, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return s;
    }

    public void q(boolean z) {
        if (this.q) {
            this.r = true;
            if (z) {
                this.s = true;
                return;
            }
            return;
        }
        if (z) {
            this.f1007i = true;
            this.f1010l = true;
        }
        if (this.v.isEmpty()) {
            return;
        }
        z();
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.v.remove(next);
            } else {
                mVar.c(z);
            }
        }
        y();
    }

    public boolean r(MenuItem menuItem, int i2) {
        return s(menuItem, null, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f1005g.get(i3).f1015b == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.f1005g.size() - i3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || this.f1005g.get(i3).f1015b != i2) {
                    break;
                }
                t(i3, false);
                i4 = i5;
            }
            q(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f1005g.get(i3).a == i2) {
                break;
            } else {
                i3++;
            }
        }
        t(i3, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s(android.view.MenuItem r7, c.b.h.i.m r8, int r9) {
        /*
            r6 = this;
            c.b.h.i.i r7 = (c.b.h.i.i) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L40
        L19:
            c.b.h.i.g r1 = r7.f1027n
            boolean r1 = r1.e(r1, r7)
            if (r1 == 0) goto L22
            goto L40
        L22:
            android.content.Intent r1 = r7.f1020g
            if (r1 == 0) goto L36
            c.b.h.i.g r3 = r7.f1027n     // Catch: android.content.ActivityNotFoundException -> L2e
            android.content.Context r3 = r3.f1000b     // Catch: android.content.ActivityNotFoundException -> L2e
            r3.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L2e
            goto L40
        L2e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L36:
            c.i.k.f r1 = r7.A
            if (r1 == 0) goto L42
            boolean r1 = r1.e()
            if (r1 == 0) goto L42
        L40:
            r1 = 1
            goto L43
        L42:
            r1 = 0
        L43:
            c.i.k.f r3 = r7.A
            if (r3 == 0) goto L4f
            boolean r4 = r3.a()
            if (r4 == 0) goto L4f
            r4 = 1
            goto L50
        L4f:
            r4 = 0
        L50:
            boolean r5 = r7.f()
            if (r5 == 0) goto L62
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.c(r2)
            goto Ld1
        L62:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L73
            if (r4 == 0) goto L6b
            goto L73
        L6b:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.c(r2)
            goto Ld1
        L73:
            r9 = r9 & 4
            if (r9 != 0) goto L7a
            r6.c(r0)
        L7a:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L8e
            c.b.h.i.r r9 = new c.b.h.i.r
            android.content.Context r5 = r6.f1000b
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.f1018e
            r9.setHeaderTitle(r5)
        L8e:
            c.b.h.i.r r7 = r7.o
            if (r4 == 0) goto L95
            r3.f(r7)
        L95:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<c.b.h.i.m>> r9 = r6.v
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L9e
            goto Lcb
        L9e:
            if (r8 == 0) goto La4
            boolean r0 = r8.i(r7)
        La4:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<c.b.h.i.m>> r8 = r6.v
            java.util.Iterator r8 = r8.iterator()
        Laa:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lcb
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            c.b.h.i.m r3 = (c.b.h.i.m) r3
            if (r3 != 0) goto Lc4
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<c.b.h.i.m>> r3 = r6.v
            r3.remove(r9)
            goto Laa
        Lc4:
            if (r0 != 0) goto Laa
            boolean r0 = r3.i(r7)
            goto Laa
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.c(r2)
        Ld1:
            return r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.h.i.g.s(android.view.MenuItem, c.b.h.i.m, int):boolean");
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.f1005g.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f1005g.get(i3);
            if (iVar.f1015b == i2) {
                iVar.x = (iVar.x & (-5)) | (z2 ? 4 : 0);
                iVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.x = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
        int size = this.f1005g.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f1005g.get(i3);
            if (iVar.f1015b == i2) {
                iVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
        int size = this.f1005g.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f1005g.get(i3);
            if (iVar.f1015b == i2 && iVar.l(z)) {
                z2 = true;
            }
        }
        if (z2) {
            q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1002d = z;
        q(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1005g.size();
    }

    public final void t(int i2, boolean z) {
        if (i2 < 0 || i2 >= this.f1005g.size()) {
            return;
        }
        this.f1005g.remove(i2);
        if (z) {
            q(true);
        }
    }

    public void u(m mVar) {
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.v.remove(next);
            }
        }
    }

    public void v(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).v(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (findItem = findItem(i3)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void w(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).w(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void x(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.f1001c;
        if (view != null) {
            this.p = view;
            this.f1012n = null;
            this.o = null;
        } else {
            if (i2 > 0) {
                this.f1012n = resources.getText(i2);
            } else if (charSequence != null) {
                this.f1012n = charSequence;
            }
            if (i3 > 0) {
                this.o = c.i.d.a.c(this.f1000b, i3);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        q(false);
    }

    public void y() {
        this.q = false;
        if (this.r) {
            this.r = false;
            q(this.s);
        }
    }

    public void z() {
        if (this.q) {
            return;
        }
        this.q = true;
        this.r = false;
        this.s = false;
    }
}
