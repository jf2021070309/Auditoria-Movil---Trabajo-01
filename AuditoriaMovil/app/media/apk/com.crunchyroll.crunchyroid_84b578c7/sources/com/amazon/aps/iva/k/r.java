package com.amazon.aps.iva.k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.aps.iva.p3.c0;
import com.amazon.aps.iva.p3.f0;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q.a1;
import com.crunchyroll.crunchyroid.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* compiled from: AppCompatViewInflater.java */
/* loaded from: classes.dex */
public class r {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private static final int[] sAccessibilityHeading = {16844160};
    private static final int[] sAccessibilityPaneTitle = {16844156};
    private static final int[] sScreenReaderFocusable = {16844148};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final com.amazon.aps.iva.x.h<String, Constructor<? extends View>> sConstructorMap = new com.amazon.aps.iva.x.h<>();

    /* compiled from: AppCompatViewInflater.java */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {
        public final View b;
        public final String c;
        public Method d;
        public Context e;

        public a(View view, String str) {
            this.b = view;
            this.c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id;
            String str;
            Method method;
            if (this.d == null) {
                View view2 = this.b;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.c;
                    if (context != null) {
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                                this.d = method;
                                this.e = context;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                        if (context instanceof ContextWrapper) {
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            context = null;
                        }
                    } else {
                        if (view2.getId() == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                        }
                        StringBuilder c = q.c("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        c.append(view2.getClass());
                        c.append(str);
                        throw new IllegalStateException(c.toString());
                    }
                }
            }
            try {
                this.d.invoke(this.e, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void backportAccessibilityAttributes(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (obtainStyledAttributes.hasValue(0)) {
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            WeakHashMap<View, r0> weakHashMap = g0.a;
            new f0().e(view, Boolean.valueOf(z));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (obtainStyledAttributes2.hasValue(0)) {
            g0.o(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (obtainStyledAttributes3.hasValue(0)) {
            boolean z2 = obtainStyledAttributes3.getBoolean(0, false);
            WeakHashMap<View, r0> weakHashMap2 = g0.a;
            new c0().e(view, Boolean.valueOf(z2));
        }
        obtainStyledAttributes3.recycle();
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (g0.c.a(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        com.amazon.aps.iva.x.h<String, Constructor<? extends View>> hVar = sConstructorMap;
        Constructor<? extends View> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = sClassPrefixList;
                    if (i >= strArr.length) {
                        return null;
                    }
                    View createViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                    if (createViewByPrefix != null) {
                        return createViewByPrefix;
                    }
                    i++;
                }
            } else {
                return createViewByPrefix(context, str, null);
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.j.a.A, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(0, 0);
        } else {
            i = 0;
        }
        if (z2 && i == 0) {
            i = obtainStyledAttributes.getResourceId(4, 0);
        }
        obtainStyledAttributes.recycle();
        if (i != 0) {
            if (!(context instanceof com.amazon.aps.iva.o.c) || ((com.amazon.aps.iva.o.c) context).a != i) {
                return new com.amazon.aps.iva.o.c(context, i);
            }
            return context;
        }
        return context;
    }

    private void verifyNotNull(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public com.amazon.aps.iva.q.c createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new com.amazon.aps.iva.q.c(context, attributeSet);
    }

    public com.amazon.aps.iva.q.e createButton(Context context, AttributeSet attributeSet) {
        return new com.amazon.aps.iva.q.e(context, attributeSet);
    }

    public com.amazon.aps.iva.q.f createCheckBox(Context context, AttributeSet attributeSet) {
        return new com.amazon.aps.iva.q.f(context, attributeSet);
    }

    public com.amazon.aps.iva.q.g createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new com.amazon.aps.iva.q.g(context, attributeSet);
    }

    public com.amazon.aps.iva.q.k createEditText(Context context, AttributeSet attributeSet) {
        return new com.amazon.aps.iva.q.k(context, attributeSet);
    }

    public com.amazon.aps.iva.q.o createImageButton(Context context, AttributeSet attributeSet) {
        return new com.amazon.aps.iva.q.o(context, attributeSet);
    }

    public com.amazon.aps.iva.q.q createImageView(Context context, AttributeSet attributeSet) {
        return new com.amazon.aps.iva.q.q(context, attributeSet);
    }

    public com.amazon.aps.iva.q.r createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new com.amazon.aps.iva.q.r(context, attributeSet);
    }

    public com.amazon.aps.iva.q.u createRadioButton(Context context, AttributeSet attributeSet) {
        return new com.amazon.aps.iva.q.u(context, attributeSet);
    }

    public com.amazon.aps.iva.q.v createRatingBar(Context context, AttributeSet attributeSet) {
        return new com.amazon.aps.iva.q.v(context, attributeSet);
    }

    public com.amazon.aps.iva.q.x createSeekBar(Context context, AttributeSet attributeSet) {
        return new com.amazon.aps.iva.q.x(context, attributeSet);
    }

    public com.amazon.aps.iva.q.a0 createSpinner(Context context, AttributeSet attributeSet) {
        return new com.amazon.aps.iva.q.a0(context, attributeSet, R.attr.spinnerStyle);
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public com.amazon.aps.iva.q.g0 createToggleButton(Context context, AttributeSet attributeSet) {
        return new com.amazon.aps.iva.q.g0(context, attributeSet);
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View createRatingBar;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            a1.a(context2);
        }
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                createRatingBar = createRatingBar(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 1:
                createRatingBar = createCheckedTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 2:
                createRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 3:
                createRatingBar = createTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 4:
                createRatingBar = createImageButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 5:
                createRatingBar = createSeekBar(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 6:
                createRatingBar = createSpinner(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 7:
                createRatingBar = createRadioButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\b':
                createRatingBar = createToggleButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\t':
                createRatingBar = createImageView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\n':
                createRatingBar = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 11:
                createRatingBar = createCheckBox(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\f':
                createRatingBar = createEditText(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\r':
                createRatingBar = createButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            default:
                createRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (createRatingBar == null && context != context2) {
            createRatingBar = createViewFromTag(context2, str, attributeSet);
        }
        if (createRatingBar != null) {
            checkOnClickListener(createRatingBar, attributeSet);
            backportAccessibilityAttributes(context2, createRatingBar, attributeSet);
        }
        return createRatingBar;
    }
}
