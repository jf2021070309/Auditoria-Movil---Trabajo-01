package com.amazon.aps.iva.p3;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.q3.l;
import com.amazon.aps.iva.q3.p;
import com.crunchyroll.crunchyroid.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: AccessibilityDelegateCompat.java */
/* loaded from: classes.dex */
public class a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: com.amazon.aps.iva.p3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0597a extends View.AccessibilityDelegate {
        public final a a;

        public C0597a(a aVar) {
            this.a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            com.amazon.aps.iva.q3.m accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z;
            Object tag;
            boolean z2;
            boolean z3;
            Object tag2;
            boolean z4;
            int i;
            com.amazon.aps.iva.q3.l lVar = new com.amazon.aps.iva.q3.l(accessibilityNodeInfo);
            WeakHashMap<View, r0> weakHashMap = g0.a;
            boolean z5 = true;
            if (Build.VERSION.SDK_INT >= 28) {
                z = true;
            } else {
                z = false;
            }
            CharSequence charSequence = null;
            if (z) {
                tag = Boolean.valueOf(g0.m.d(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            if (bool != null && bool.booleanValue()) {
                z2 = 1;
            } else {
                z2 = 0;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z2);
            } else {
                Bundle c = l.b.c(accessibilityNodeInfo);
                if (c != null) {
                    c.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z2 | (c.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                tag2 = Boolean.valueOf(g0.m.c(view));
            } else {
                tag2 = view.getTag(R.id.tag_accessibility_heading);
                if (!Boolean.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            Boolean bool2 = (Boolean) tag2;
            if (bool2 != null && bool2.booleanValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i2 >= 28) {
                accessibilityNodeInfo.setHeading(z4);
            } else {
                Bundle c2 = l.b.c(accessibilityNodeInfo);
                if (c2 != null) {
                    int i3 = c2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3);
                    if (z4) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    c2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i3);
                }
            }
            CharSequence e = g0.e(view);
            if (i2 >= 28) {
                accessibilityNodeInfo.setPaneTitle(e);
            } else {
                l.b.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", e);
            }
            if (Build.VERSION.SDK_INT < 30) {
                z5 = false;
            }
            if (z5) {
                charSequence = g0.o.b(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_state_description);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            CharSequence charSequence2 = charSequence;
            if (i2 >= 30) {
                l.c.c(accessibilityNodeInfo, charSequence2);
            } else {
                l.b.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
            }
            this.a.onInitializeAccessibilityNodeInfo(view, lVar);
            accessibilityNodeInfo.getText();
            List<l.a> actionList = a.getActionList(view);
            for (int i4 = 0; i4 < actionList.size(); i4++) {
                lVar.b(actionList.get(i4));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.a.performAccessibilityAction(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            this.a.sendAccessibilityEvent(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    /* compiled from: AccessibilityDelegateCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public a() {
        this(DEFAULT_DELEGATE);
    }

    public static List<l.a> getActionList(View view) {
        List<l.a> list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        ClickableSpan[] clickableSpanArr;
        if (clickableSpan != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            for (int i = 0; clickableSpanArr != null && i < clickableSpanArr.length; i++) {
                if (clickableSpan.equals(clickableSpanArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (isSpanStillValid(clickableSpan, view)) {
                clickableSpan.onClick(view);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public com.amazon.aps.iva.q3.m getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider a = b.a(this.mOriginalDelegate, view);
        if (a != null) {
            return new com.amazon.aps.iva.q3.m(a);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, com.amazon.aps.iva.q3.l lVar) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, lVar.a);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        List<l.a> actionList = getActionList(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            l.a aVar = actionList.get(i2);
            if (aVar.a() == i) {
                com.amazon.aps.iva.q3.p pVar = aVar.d;
                if (pVar != null) {
                    Class<? extends p.a> cls = aVar.c;
                    p.a aVar2 = null;
                    if (cls != null) {
                        try {
                            p.a newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            try {
                                newInstance.getClass();
                            } catch (Exception unused) {
                            }
                            aVar2 = newInstance;
                        } catch (Exception unused2) {
                        }
                    }
                    z = pVar.perform(view, aVar2);
                }
            } else {
                i2++;
            }
        }
        if (!z) {
            z = b.b(this.mOriginalDelegate, view, i, bundle);
        }
        if (!z && i == R.id.accessibility_action_clickable_span && bundle != null) {
            return performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
        }
        return z;
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C0597a(this);
    }
}
