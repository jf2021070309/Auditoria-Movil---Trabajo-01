package com.amazon.aps.iva.o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.p3.m;
import com.amazon.aps.iva.q.d1;
import com.amazon.aps.iva.q.j0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: SupportMenuInflater.java */
/* loaded from: classes.dex */
public final class f extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] d = {MenuItem.class};
        public final Object b;
        public final Method c;

        public a(Object obj, String str) {
            this.b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.c = cls.getMethod(str, d);
            } catch (Exception e) {
                StringBuilder c = q.c("Couldn't resolve menu item onClick handler ", str, " in class ");
                c.append(cls.getName());
                InflateException inflateException = new InflateException(c.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.c;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.b;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public class b {
        public CharSequence A;
        public CharSequence B;
        public final Menu a;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public com.amazon.aps.iva.p3.b z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public boolean f = true;
        public boolean g = true;

        public b(Menu menu) {
            this.a = menu;
        }

        public final void a(MenuItem menuItem) {
            boolean z;
            Object obj;
            MenuItem enabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
            boolean z2 = false;
            if (this.r >= 1) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            String str = this.y;
            f fVar = f.this;
            if (str != null) {
                if (!fVar.c.isRestricted()) {
                    if (fVar.d == null) {
                        fVar.d = f.a(fVar.c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.d, this.y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    ((androidx.appcompat.view.menu.h) menuItem).f(true);
                } else if (menuItem instanceof com.amazon.aps.iva.p.c) {
                    com.amazon.aps.iva.p.c cVar = (com.amazon.aps.iva.p.c) menuItem;
                    try {
                        Method method = cVar.e;
                        com.amazon.aps.iva.i3.b bVar = cVar.d;
                        if (method == null) {
                            cVar.e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        cVar.e.invoke(bVar, Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
            }
            String str2 = this.x;
            if (str2 != null) {
                Class<?>[] clsArr = f.e;
                Object[] objArr = fVar.a;
                try {
                    Constructor<?> constructor = Class.forName(str2, false, fVar.c.getClassLoader()).getConstructor(clsArr);
                    constructor.setAccessible(true);
                    obj = constructor.newInstance(objArr);
                } catch (Exception unused2) {
                    obj = null;
                }
                menuItem.setActionView((View) obj);
                z2 = true;
            }
            int i2 = this.w;
            if (i2 > 0 && !z2) {
                menuItem.setActionView(i2);
            }
            com.amazon.aps.iva.p3.b bVar2 = this.z;
            if (bVar2 != null && (menuItem instanceof com.amazon.aps.iva.i3.b)) {
                ((com.amazon.aps.iva.i3.b) menuItem).b(bVar2);
            }
            CharSequence charSequence = this.A;
            boolean z3 = menuItem instanceof com.amazon.aps.iva.i3.b;
            if (z3) {
                ((com.amazon.aps.iva.i3.b) menuItem).setContentDescription(charSequence);
            } else {
                m.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z3) {
                ((com.amazon.aps.iva.i3.b) menuItem).setTooltipText(charSequence2);
            } else {
                m.m(menuItem, charSequence2);
            }
            char c = this.n;
            int i3 = this.o;
            if (z3) {
                ((com.amazon.aps.iva.i3.b) menuItem).setAlphabeticShortcut(c, i3);
            } else {
                m.g(menuItem, c, i3);
            }
            char c2 = this.p;
            int i4 = this.q;
            if (z3) {
                ((com.amazon.aps.iva.i3.b) menuItem).setNumericShortcut(c2, i4);
            } else {
                m.k(menuItem, c2, i4);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z3) {
                    ((com.amazon.aps.iva.i3.b) menuItem).setIconTintMode(mode);
                } else {
                    m.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z3) {
                    ((com.amazon.aps.iva.i3.b) menuItem).setIconTintList(colorStateList);
                } else {
                    m.i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        char charAt;
        char charAt2;
        boolean z;
        ColorStateList colorStateList;
        Object obj;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType != 1) {
                Menu menu2 = bVar.a;
                z2 = z2;
                z2 = z2;
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z3 && name2.equals(str)) {
                            z3 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar.b = 0;
                            bVar.c = 0;
                            bVar.d = 0;
                            bVar.e = 0;
                            bVar.f = true;
                            bVar.g = true;
                            z2 = z2;
                        } else if (name2.equals("item")) {
                            z2 = z2;
                            if (!bVar.h) {
                                com.amazon.aps.iva.p3.b bVar2 = bVar.z;
                                if (bVar2 != null && bVar2.hasSubMenu()) {
                                    bVar.h = true;
                                    bVar.a(menu2.addSubMenu(bVar.b, bVar.i, bVar.j, bVar.k).getItem());
                                    z2 = z2;
                                } else {
                                    bVar.h = true;
                                    bVar.a(menu2.add(bVar.b, bVar.i, bVar.j, bVar.k));
                                    z2 = z2;
                                }
                            }
                        } else {
                            z2 = z2;
                            if (name2.equals("menu")) {
                                z2 = true;
                            }
                        }
                    }
                } else if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    f fVar = f.this;
                    if (equals) {
                        TypedArray obtainStyledAttributes = fVar.c.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.j.a.q);
                        bVar.b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.c = obtainStyledAttributes.getInt(3, 0);
                        bVar.d = obtainStyledAttributes.getInt(4, 0);
                        bVar.e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f = obtainStyledAttributes.getBoolean(2, true);
                        bVar.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        z2 = z2;
                    } else if (name3.equals("item")) {
                        Context context = fVar.c;
                        d1 d1Var = new d1(context, context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.j.a.r));
                        bVar.i = d1Var.i(2, 0);
                        bVar.j = (d1Var.h(5, bVar.c) & (-65536)) | (d1Var.h(6, bVar.d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        bVar.k = d1Var.k(7);
                        bVar.l = d1Var.k(8);
                        bVar.m = d1Var.i(0, 0);
                        String j = d1Var.j(9);
                        if (j == null) {
                            charAt = 0;
                        } else {
                            charAt = j.charAt(0);
                        }
                        bVar.n = charAt;
                        bVar.o = d1Var.h(16, 4096);
                        String j2 = d1Var.j(10);
                        if (j2 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = j2.charAt(0);
                        }
                        bVar.p = charAt2;
                        bVar.q = d1Var.h(20, 4096);
                        if (d1Var.l(11)) {
                            bVar.r = d1Var.a(11, false) ? 1 : 0;
                        } else {
                            bVar.r = bVar.e;
                        }
                        bVar.s = d1Var.a(3, false);
                        bVar.t = d1Var.a(4, bVar.f);
                        bVar.u = d1Var.a(1, bVar.g);
                        bVar.v = d1Var.h(21, -1);
                        bVar.y = d1Var.j(12);
                        bVar.w = d1Var.i(13, 0);
                        bVar.x = d1Var.j(15);
                        String j3 = d1Var.j(14);
                        if (j3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && bVar.w == 0 && bVar.x == null) {
                            Class<?>[] clsArr = f;
                            Object[] objArr = fVar.b;
                            try {
                                Constructor<?> constructor = Class.forName(j3, false, fVar.c.getClassLoader()).getConstructor(clsArr);
                                constructor.setAccessible(true);
                                obj = constructor.newInstance(objArr);
                            } catch (Exception unused) {
                                obj = null;
                            }
                            bVar.z = (com.amazon.aps.iva.p3.b) obj;
                        } else {
                            bVar.z = null;
                        }
                        bVar.A = d1Var.k(17);
                        bVar.B = d1Var.k(22);
                        if (d1Var.l(19)) {
                            bVar.D = j0.c(d1Var.h(19, -1), bVar.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar.D = null;
                        }
                        if (d1Var.l(18)) {
                            bVar.C = d1Var.b(18);
                        } else {
                            bVar.C = colorStateList;
                        }
                        d1Var.n();
                        bVar.h = false;
                    } else if (name3.equals("menu")) {
                        bVar.h = true;
                        SubMenu addSubMenu = menu2.addSubMenu(bVar.b, bVar.i, bVar.j, bVar.k);
                        bVar.a(addSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        str = name3;
                        z3 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                i = 2;
                z2 = z2;
                z3 = z3;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof com.amazon.aps.iva.i3.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.c.getResources().getLayout(i);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
