package c.b.h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import c.b.h.i.i;
import c.b.h.i.j;
import c.b.i.a1;
import c.b.i.e0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class f extends MenuInflater {
    public static final Class<?>[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f922b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f923c;

    /* renamed from: d  reason: collision with root package name */
    public final Object[] f924d;

    /* renamed from: e  reason: collision with root package name */
    public Context f925e;

    /* renamed from: f  reason: collision with root package name */
    public Object f926f;

    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] a = {MenuItem.class};

        /* renamed from: b  reason: collision with root package name */
        public Object f927b;

        /* renamed from: c  reason: collision with root package name */
        public Method f928c;

        public a(Object obj, String str) {
            this.f927b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f928c = cls.getMethod(str, a);
            } catch (Exception e2) {
                StringBuilder B = e.a.d.a.a.B("Couldn't resolve menu item onClick handler ", str, " in class ");
                B.append(cls.getName());
                InflateException inflateException = new InflateException(B.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f928c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f928c.invoke(this.f927b, menuItem)).booleanValue();
                }
                this.f928c.invoke(this.f927b, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public c.i.k.f A;
        public CharSequence B;
        public CharSequence C;
        public Menu a;

        /* renamed from: h  reason: collision with root package name */
        public boolean f935h;

        /* renamed from: i  reason: collision with root package name */
        public int f936i;

        /* renamed from: j  reason: collision with root package name */
        public int f937j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f938k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f939l;

        /* renamed from: m  reason: collision with root package name */
        public int f940m;

        /* renamed from: n  reason: collision with root package name */
        public char f941n;
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
        public String z;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: b  reason: collision with root package name */
        public int f929b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f930c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f931d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f932e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f933f = true;

        /* renamed from: g  reason: collision with root package name */
        public boolean f934g = true;

        public b(Menu menu) {
            this.a = menu;
        }

        public SubMenu a() {
            this.f935h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.f929b, this.f936i, this.f937j, this.f938k);
            c(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f925e.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        public final void c(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.f939l).setIcon(this.f940m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (f.this.f925e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                f fVar = f.this;
                if (fVar.f926f == null) {
                    fVar.f926f = fVar.a(fVar.f925e);
                }
                menuItem.setOnMenuItemClickListener(new a(fVar.f926f, this.z));
            }
            if (this.r >= 2) {
                if (menuItem instanceof i) {
                    i iVar = (i) menuItem;
                    iVar.x = (iVar.x & (-5)) | 4;
                } else if (menuItem instanceof j) {
                    j jVar = (j) menuItem;
                    try {
                        if (jVar.f1029e == null) {
                            jVar.f1029e = jVar.f1028d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        jVar.f1029e.invoke(jVar.f1028d, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) b(str, f.a, f.this.f923c));
                z = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            c.i.k.f fVar2 = this.A;
            if (fVar2 != null) {
                if (menuItem instanceof c.i.f.a.b) {
                    ((c.i.f.a.b) menuItem).a(fVar2);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.B;
            boolean z2 = menuItem instanceof c.i.f.a.b;
            if (z2) {
                ((c.i.f.a.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.C;
            if (z2) {
                ((c.i.f.a.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.f941n;
            int i4 = this.o;
            if (z2) {
                ((c.i.f.a.b) menuItem).setAlphabeticShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.p;
            int i5 = this.q;
            if (z2) {
                ((c.i.f.a.b) menuItem).setNumericShortcut(c3, i5);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i5);
            }
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                if (z2) {
                    ((c.i.f.a.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                if (z2) {
                    ((c.i.f.a.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        a = clsArr;
        f922b = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f925e = context;
        Object[] objArr = {context};
        this.f923c = objArr;
        this.f924d = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ColorStateList colorStateList;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(e.a.d.a.a.k("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        bVar.f929b = 0;
                        bVar.f930c = 0;
                        bVar.f931d = 0;
                        bVar.f932e = 0;
                        bVar.f933f = true;
                        bVar.f934g = true;
                    } else if (name2.equals("item")) {
                        if (!bVar.f935h) {
                            c.i.k.f fVar = bVar.A;
                            if (fVar == null || !fVar.a()) {
                                bVar.f935h = true;
                                bVar.c(bVar.a.add(bVar.f929b, bVar.f936i, bVar.f937j, bVar.f938k));
                            } else {
                                bVar.a();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    TypedArray obtainStyledAttributes = f.this.f925e.obtainStyledAttributes(attributeSet, c.b.b.o);
                    bVar.f929b = obtainStyledAttributes.getResourceId(1, 0);
                    bVar.f930c = obtainStyledAttributes.getInt(3, 0);
                    bVar.f931d = obtainStyledAttributes.getInt(4, 0);
                    bVar.f932e = obtainStyledAttributes.getInt(5, 0);
                    bVar.f933f = obtainStyledAttributes.getBoolean(2, true);
                    bVar.f934g = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    a1 p = a1.p(f.this.f925e, attributeSet, c.b.b.p);
                    bVar.f936i = p.l(2, 0);
                    bVar.f937j = (p.j(5, bVar.f930c) & (-65536)) | (p.j(6, bVar.f931d) & 65535);
                    bVar.f938k = p.n(7);
                    bVar.f939l = p.n(8);
                    bVar.f940m = p.l(0, 0);
                    String m2 = p.m(9);
                    bVar.f941n = m2 == null ? (char) 0 : m2.charAt(0);
                    bVar.o = p.j(16, 4096);
                    String m3 = p.m(10);
                    bVar.p = m3 == null ? (char) 0 : m3.charAt(0);
                    bVar.q = p.j(20, 4096);
                    if (p.o(11)) {
                        bVar.r = p.a(11, false) ? 1 : 0;
                    } else {
                        bVar.r = bVar.f932e;
                    }
                    bVar.s = p.a(3, false);
                    bVar.t = p.a(4, bVar.f933f);
                    bVar.u = p.a(1, bVar.f934g);
                    bVar.v = p.j(21, -1);
                    bVar.z = p.m(12);
                    bVar.w = p.l(13, 0);
                    bVar.x = p.m(15);
                    String m4 = p.m(14);
                    bVar.y = m4;
                    boolean z3 = m4 != null;
                    if (z3 && bVar.w == 0 && bVar.x == null) {
                        bVar.A = (c.i.k.f) bVar.b(m4, f922b, f.this.f924d);
                    } else {
                        if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        bVar.A = null;
                    }
                    bVar.B = p.n(17);
                    bVar.C = p.n(22);
                    if (p.o(19)) {
                        bVar.E = e0.d(p.j(19, -1), bVar.E);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        bVar.E = null;
                    }
                    if (p.o(18)) {
                        bVar.D = p.c(18);
                    } else {
                        bVar.D = colorStateList;
                    }
                    p.f1083b.recycle();
                    bVar.f935h = false;
                } else if (name3.equals("menu")) {
                    b(xmlPullParser, attributeSet, bVar.a());
                } else {
                    z2 = true;
                    str = name3;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof c.i.f.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f925e.getResources().getLayout(i2);
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
