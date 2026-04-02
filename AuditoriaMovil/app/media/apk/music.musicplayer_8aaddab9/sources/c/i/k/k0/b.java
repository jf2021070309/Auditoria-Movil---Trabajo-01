package c.i.k.k0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import c.i.k.k0.d;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.util.FileUtil;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class b {
    public static int a;

    /* renamed from: b  reason: collision with root package name */
    public final AccessibilityNodeInfo f2193b;

    /* renamed from: c  reason: collision with root package name */
    public int f2194c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2195d = -1;

    /* loaded from: classes.dex */
    public static class a {
        public static final a a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f2196b;

        /* renamed from: c  reason: collision with root package name */
        public static final a f2197c;

        /* renamed from: d  reason: collision with root package name */
        public static final a f2198d;

        /* renamed from: e  reason: collision with root package name */
        public static final a f2199e;

        /* renamed from: f  reason: collision with root package name */
        public static final a f2200f;

        /* renamed from: g  reason: collision with root package name */
        public static final a f2201g;

        /* renamed from: h  reason: collision with root package name */
        public static final a f2202h;

        /* renamed from: i  reason: collision with root package name */
        public final Object f2203i;

        /* renamed from: j  reason: collision with root package name */
        public final int f2204j;

        /* renamed from: k  reason: collision with root package name */
        public final Class<? extends d.a> f2205k;

        /* renamed from: l  reason: collision with root package name */
        public final d f2206l;

        static {
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(1, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(2, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(4, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(8, null);
            }
            a = new a(16, null);
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(32, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(64, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(128, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(256, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(AdRequest.MAX_CONTENT_URL_LENGTH, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(1024, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(ThrowableProxyConverter.BUILDER_CAPACITY, null);
            }
            f2196b = new a(4096, null);
            f2197c = new a(Compressor.BUFFER_SIZE, null);
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(16384, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(FileUtil.BUF_SIZE, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(65536, null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(131072, null);
            }
            f2198d = new a(262144, null);
            f2199e = new a(524288, null);
            f2200f = new a(1048576, null);
            if (Build.VERSION.SDK_INT >= 21) {
                new AccessibilityNodeInfo.AccessibilityAction(2097152, null);
            }
            int i2 = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908342, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction2 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908343, null);
            }
            f2201g = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3 = i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction3 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908345, null);
            }
            f2202h = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4 = i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction4 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908347, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5 = i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction5 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908358, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6 = i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction6 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908359, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7 = i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction7 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908360, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8 = i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction8 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908361, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9 = i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction9 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908348, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10 = i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction10 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908349, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11 = i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction11 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908354, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12 = i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction12 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908356, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13 = i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction13 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908357, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14 = i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null;
            if (Build.VERSION.SDK_INT >= 21 && accessibilityAction14 == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908362, null);
            }
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15 = i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null;
            if (Build.VERSION.SDK_INT < 21 || accessibilityAction15 != null) {
                return;
            }
            new AccessibilityNodeInfo.AccessibilityAction(16908372, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, null, null, null);
        }

        public a(Object obj, int i2, CharSequence charSequence, d dVar, Class<? extends d.a> cls) {
            this.f2204j = i2;
            this.f2206l = dVar;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.f2203i = obj;
            } else {
                this.f2203i = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            }
            this.f2205k = cls;
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2203i).getId();
            }
            return 0;
        }

        public CharSequence b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2203i).getLabel();
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                Object obj2 = this.f2203i;
                return obj2 == null ? aVar.f2203i == null : obj2.equals(aVar.f2203i);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f2203i;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: c.i.k.k0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0040b {
        public final Object a;

        public C0040b(Object obj) {
            this.a = obj;
        }

        public static C0040b a(int i2, int i3, boolean z, int i4) {
            return Build.VERSION.SDK_INT >= 21 ? new C0040b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z, i4)) : new C0040b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z));
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final Object a;

        public c(Object obj) {
            this.a = obj;
        }

        public static c a(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
            return Build.VERSION.SDK_INT >= 21 ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z, z2)) : new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z));
        }
    }

    public b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2193b = accessibilityNodeInfo;
    }

    public static String c(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                switch (i2) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case ThrowableProxyConverter.BUILDER_CAPACITY /* 2048 */:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case Compressor.BUFFER_SIZE /* 8192 */:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case FileUtil.BUF_SIZE /* 32768 */:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908372:
                        return "ACTION_IME_ENTER";
                    default:
                        switch (i2) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i2) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public static ClickableSpan[] d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public void a(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2193b.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2203i);
        }
    }

    public final List<Integer> b(String str) {
        ArrayList<Integer> integerArrayList = this.f2193b.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f2193b.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public CharSequence e() {
        return this.f2193b.getContentDescription();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f2193b;
            if (accessibilityNodeInfo == null) {
                if (bVar.f2193b != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(bVar.f2193b)) {
                return false;
            }
            return this.f2195d == bVar.f2195d && this.f2194c == bVar.f2194c;
        }
        return false;
    }

    public Bundle f() {
        return this.f2193b.getExtras();
    }

    public CharSequence g() {
        if (!b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List<Integer> b2 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> b3 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> b4 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> b5 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2193b.getText(), 0, this.f2193b.getText().length()));
            for (int i2 = 0; i2 < b2.size(); i2++) {
                spannableString.setSpan(new c.i.k.k0.a(b5.get(i2).intValue(), this, f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), b2.get(i2).intValue(), b3.get(i2).intValue(), b4.get(i2).intValue());
            }
            return spannableString;
        }
        return this.f2193b.getText();
    }

    public final void h(int i2, boolean z) {
        Bundle f2 = f();
        if (f2 != null) {
            int i3 = f2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i2 ^ (-1));
            if (!z) {
                i2 = 0;
            }
            f2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2193b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(Object obj) {
        this.f2193b.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C0040b) obj).a);
    }

    public void j(Object obj) {
        this.f2193b.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).a);
    }

    public void k(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2193b.setHintText(charSequence);
        } else {
            this.f2193b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public String toString() {
        ?? emptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f2193b.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f2193b.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f2193b.getPackageName());
        sb.append("; className: ");
        sb.append(this.f2193b.getClassName());
        sb.append("; text: ");
        sb.append(g());
        sb.append("; contentDescription: ");
        sb.append(e());
        sb.append("; viewId: ");
        sb.append(this.f2193b.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f2193b.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f2193b.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f2193b.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f2193b.isFocused());
        sb.append("; selected: ");
        sb.append(this.f2193b.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f2193b.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f2193b.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f2193b.isEnabled());
        sb.append("; password: ");
        sb.append(this.f2193b.isPassword());
        sb.append("; scrollable: " + this.f2193b.isScrollable());
        sb.append("; [");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            List<AccessibilityNodeInfo.AccessibilityAction> actionList = i2 >= 21 ? this.f2193b.getActionList() : null;
            if (actionList != null) {
                emptyList = new ArrayList();
                int size = actionList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    emptyList.add(new a(actionList.get(i3), 0, null, null, null));
                }
            } else {
                emptyList = Collections.emptyList();
            }
            for (int i4 = 0; i4 < emptyList.size(); i4++) {
                a aVar = (a) emptyList.get(i4);
                String c2 = c(aVar.a());
                if (c2.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                    c2 = aVar.b().toString();
                }
                sb.append(c2);
                if (i4 != emptyList.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int actions = this.f2193b.getActions();
            while (actions != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
                actions &= numberOfTrailingZeros ^ (-1);
                sb.append(c(numberOfTrailingZeros));
                if (actions != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
