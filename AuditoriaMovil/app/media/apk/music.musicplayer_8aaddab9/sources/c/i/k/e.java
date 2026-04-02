package c.i.k;

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
import c.i.k.k0.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class e {
    public static final View.AccessibilityDelegate a = new View.AccessibilityDelegate();

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f2148b;

    /* renamed from: c  reason: collision with root package name */
    public final View.AccessibilityDelegate f2149c;

    /* loaded from: classes.dex */
    public static final class a extends View.AccessibilityDelegate {
        public final e a;

        public a(e eVar) {
            this.a = eVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            c.i.k.k0.c b2 = this.a.b(view);
            if (b2 != null) {
                return (AccessibilityNodeProvider) b2.a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int i2;
            c.i.k.k0.b bVar = new c.i.k.k0.b(accessibilityNodeInfo);
            AtomicInteger atomicInteger = d0.a;
            Boolean d2 = new z(R.id.tag_screen_reader_focusable, Boolean.class, 28).d(view);
            boolean z = d2 != null && d2.booleanValue();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z);
            } else {
                bVar.h(1, z);
            }
            Boolean d3 = new c0(R.id.tag_accessibility_heading, Boolean.class, 28).d(view);
            boolean z2 = d3 != null && d3.booleanValue();
            if (i3 >= 28) {
                accessibilityNodeInfo.setHeading(z2);
            } else {
                bVar.h(2, z2);
            }
            CharSequence i4 = d0.i(view);
            if (i3 >= 28) {
                accessibilityNodeInfo.setPaneTitle(i4);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", i4);
            }
            CharSequence d4 = new b0(R.id.tag_state_description, CharSequence.class, 64, 30).d(view);
            if (i3 >= 30) {
                accessibilityNodeInfo.setStateDescription(d4);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", d4);
            }
            this.a.d(view, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i3 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                        if (((WeakReference) sparseArray.valueAt(i5)).get() == null) {
                            arrayList.add(Integer.valueOf(i5));
                        }
                    }
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        sparseArray.remove(((Integer) arrayList.get(i6)).intValue());
                    }
                }
                ClickableSpan[] d5 = c.i.k.k0.b.d(text);
                if (d5 != null && d5.length > 0) {
                    bVar.f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i7 = 0; i7 < d5.length; i7++) {
                        ClickableSpan clickableSpan = d5[i7];
                        int i8 = 0;
                        while (true) {
                            if (i8 >= sparseArray2.size()) {
                                i2 = c.i.k.k0.b.a;
                                c.i.k.k0.b.a = i2 + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i8)).get())) {
                                i2 = sparseArray2.keyAt(i8);
                                break;
                            } else {
                                i8++;
                            }
                        }
                        sparseArray2.put(i2, new WeakReference(d5[i7]));
                        ClickableSpan clickableSpan2 = d5[i7];
                        Spanned spanned = (Spanned) text;
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i9 = 0; i9 < list.size(); i9++) {
                bVar.a((b.a) list.get(i9));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.a.g(view, i2, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i2) {
            this.a.h(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.i(view, accessibilityEvent);
        }
    }

    public e() {
        this.f2148b = a;
        this.f2149c = new a(this);
    }

    public e(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2148b = accessibilityDelegate;
        this.f2149c = new a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2148b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public c.i.k.k0.c b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2148b.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new c.i.k.k0.c(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2148b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, c.i.k.k0.b bVar) {
        this.f2148b.onInitializeAccessibilityNodeInfo(view, bVar.f2193b);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2148b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2148b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = 2131296896(0x7f090280, float:1.8211722E38)
            java.lang.Object r0 = r9.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lf
            java.util.List r0 = java.util.Collections.emptyList()
        Lf:
            r1 = 0
            r2 = 0
        L11:
            int r3 = r0.size()
            if (r2 >= r3) goto L70
            java.lang.Object r3 = r0.get(r2)
            c.i.k.k0.b$a r3 = (c.i.k.k0.b.a) r3
            int r4 = r3.a()
            if (r4 != r10) goto L6d
            c.i.k.k0.d r0 = r3.f2206l
            if (r0 == 0) goto L70
            r0 = 0
            java.lang.Class<? extends c.i.k.k0.d$a> r2 = r3.f2205k
            if (r2 == 0) goto L66
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L40
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.Exception -> L40
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L40
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.Exception -> L40
            c.i.k.k0.d$a r2 = (c.i.k.k0.d.a) r2     // Catch: java.lang.Exception -> L40
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> L3e
            goto L65
        L3e:
            r0 = move-exception
            goto L44
        L40:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L44:
            java.lang.Class<? extends c.i.k.k0.d$a> r4 = r3.f2205k
            if (r4 != 0) goto L4b
            java.lang.String r4 = "null"
            goto L4f
        L4b:
            java.lang.String r4 = r4.getName()
        L4f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r4, r0)
        L65:
            r0 = r2
        L66:
            c.i.k.k0.d r2 = r3.f2206l
            boolean r0 = r2.a(r9, r0)
            goto L71
        L6d:
            int r2 = r2 + 1
            goto L11
        L70:
            r0 = 0
        L71:
            if (r0 != 0) goto L79
            android.view.View$AccessibilityDelegate r0 = r8.f2148b
            boolean r0 = r0.performAccessibilityAction(r9, r10, r11)
        L79:
            if (r0 != 0) goto Lca
            r2 = 2131296273(0x7f090011, float:1.8210458E38)
            if (r10 != r2) goto Lca
            r10 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r10 = r11.getInt(r0, r10)
            r11 = 2131296897(0x7f090281, float:1.8211724E38)
            java.lang.Object r11 = r9.getTag(r11)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r0 = 1
            if (r11 == 0) goto Lc9
            java.lang.Object r10 = r11.get(r10)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto Lc9
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            if (r10 == 0) goto Lc2
            android.view.accessibility.AccessibilityNodeInfo r11 = r9.createAccessibilityNodeInfo()
            java.lang.CharSequence r11 = r11.getText()
            android.text.style.ClickableSpan[] r11 = c.i.k.k0.b.d(r11)
            r2 = 0
        Lb0:
            if (r11 == 0) goto Lc2
            int r3 = r11.length
            if (r2 >= r3) goto Lc2
            r3 = r11[r2]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto Lbf
            r11 = 1
            goto Lc3
        Lbf:
            int r2 = r2 + 1
            goto Lb0
        Lc2:
            r11 = 0
        Lc3:
            if (r11 == 0) goto Lc9
            r10.onClick(r9)
            r1 = 1
        Lc9:
            r0 = r1
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.k.e.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public void h(View view, int i2) {
        this.f2148b.sendAccessibilityEvent(view, i2);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2148b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
