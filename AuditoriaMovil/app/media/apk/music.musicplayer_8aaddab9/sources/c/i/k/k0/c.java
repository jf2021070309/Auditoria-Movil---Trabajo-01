package c.i.k.k0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class c {
    public final Object a;

    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {
        public final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            c.i.k.k0.b a = this.a.a(i2);
            if (a == null) {
                return null;
            }
            return a.f2193b;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
            Objects.requireNonNull(this.a);
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i2, int i3, Bundle bundle) {
            return this.a.c(i2, i3, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(c cVar) {
            super(cVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i2) {
            c.i.k.k0.b b2 = this.a.b(i2);
            if (b2 == null) {
                return null;
            }
            return b2.f2193b;
        }
    }

    /* renamed from: c.i.k.k0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0041c extends b {
        public C0041c(c cVar) {
            super(cVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.a);
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new C0041c(this);
        } else {
            this.a = new b(this);
        }
    }

    public c(Object obj) {
        this.a = obj;
    }

    public c.i.k.k0.b a(int i2) {
        return null;
    }

    public c.i.k.k0.b b(int i2) {
        return null;
    }

    public boolean c(int i2, int i3, Bundle bundle) {
        return false;
    }
}
