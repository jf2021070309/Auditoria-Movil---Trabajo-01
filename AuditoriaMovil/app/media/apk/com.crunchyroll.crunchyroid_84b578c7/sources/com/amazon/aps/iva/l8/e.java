package com.amazon.aps.iva.l8;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import androidx.preference.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PreferenceInflater.java */
/* loaded from: classes.dex */
public final class e {
    public static final Class<?>[] e = {Context.class, AttributeSet.class};
    public static final HashMap<String, Constructor<?>> f = new HashMap<>();
    public final Context a;
    public androidx.preference.e c;
    public final Object[] b = new Object[2];
    public String[] d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public e(Context context, androidx.preference.e eVar) {
        this.a = context;
        this.c = eVar;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException, InflateException {
        Class<?> cls;
        HashMap<String, Constructor<?>> hashMap = f;
        Constructor<?> constructor = hashMap.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.a.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e2 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e3) {
                                e2 = e3;
                            }
                        }
                        if (cls == null) {
                            if (e2 == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e2;
                        }
                        constructor = cls.getConstructor(e);
                        constructor.setAccessible(true);
                        hashMap.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(e);
                    constructor.setAccessible(true);
                    hashMap.put(str, constructor);
                } catch (ClassNotFoundException e4) {
                    throw e4;
                }
            } catch (Exception e5) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        Object[] objArr = this.b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return a(str, this.d, attributeSet);
            }
            return a(str, null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    public final PreferenceGroup c(XmlResourceParser xmlResourceParser) {
        int next;
        PreferenceGroup preferenceGroup;
        synchronized (this.b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.b[0] = this.a;
            do {
                try {
                    try {
                        try {
                            next = xmlResourceParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (InflateException e2) {
                            throw e2;
                        }
                    } catch (XmlPullParserException e3) {
                        InflateException inflateException = new InflateException(e3.getMessage());
                        inflateException.initCause(e3);
                        throw inflateException;
                    }
                } catch (IOException e4) {
                    InflateException inflateException2 = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e4.getMessage());
                    inflateException2.initCause(e4);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next == 2) {
                preferenceGroup = (PreferenceGroup) b(xmlResourceParser.getName(), asAttributeSet);
                preferenceGroup.m(this.c);
                d(xmlResourceParser, preferenceGroup, asAttributeSet);
            } else {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
        }
        return preferenceGroup;
    }

    public final void d(XmlResourceParser xmlResourceParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        long j;
        int depth = xmlResourceParser.getDepth();
        while (true) {
            int next = xmlResourceParser.next();
            if ((next != 3 || xmlResourceParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlResourceParser.getName();
                    if ("intent".equals(name)) {
                        try {
                            preference.n = Intent.parseIntent(this.a.getResources(), xmlResourceParser, attributeSet);
                        } catch (IOException e2) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e2);
                            throw xmlPullParserException;
                        }
                    } else if ("extra".equals(name)) {
                        Resources resources = this.a.getResources();
                        if (preference.p == null) {
                            preference.p = new Bundle();
                        }
                        resources.parseBundleExtra("extra", attributeSet, preference.p);
                        try {
                            int depth2 = xmlResourceParser.getDepth();
                            while (true) {
                                int next2 = xmlResourceParser.next();
                                if (next2 != 1 && (next2 != 3 || xmlResourceParser.getDepth() > depth2)) {
                                }
                            }
                        } catch (IOException e3) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e3);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference b = b(name, attributeSet);
                        PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                        if (!preferenceGroup.P.contains(b)) {
                            if (b.m != null) {
                                PreferenceGroup preferenceGroup2 = preferenceGroup;
                                while (true) {
                                    PreferenceGroup preferenceGroup3 = preferenceGroup2.J;
                                    if (preferenceGroup3 == null) {
                                        break;
                                    }
                                    preferenceGroup2 = preferenceGroup3;
                                }
                                preferenceGroup2.B(b.m);
                            }
                            int i = b.g;
                            if (i == Integer.MAX_VALUE) {
                                if (preferenceGroup.Q) {
                                    int i2 = preferenceGroup.R;
                                    preferenceGroup.R = i2 + 1;
                                    if (i2 != i) {
                                        b.g = i2;
                                        Preference.c cVar = b.H;
                                        if (cVar != null) {
                                            androidx.preference.c cVar2 = (androidx.preference.c) cVar;
                                            Handler handler = cVar2.e;
                                            c.a aVar = cVar2.f;
                                            handler.removeCallbacks(aVar);
                                            handler.post(aVar);
                                        }
                                    }
                                }
                                if (b instanceof PreferenceGroup) {
                                    ((PreferenceGroup) b).Q = preferenceGroup.Q;
                                }
                            }
                            int binarySearch = Collections.binarySearch(preferenceGroup.P, b);
                            if (binarySearch < 0) {
                                binarySearch = (binarySearch * (-1)) - 1;
                            }
                            boolean z = preferenceGroup.z();
                            if (b.w == z) {
                                b.w = !z;
                                b.k(b.z());
                                b.j();
                            }
                            synchronized (preferenceGroup) {
                                preferenceGroup.P.add(binarySearch, b);
                            }
                            androidx.preference.e eVar = preferenceGroup.c;
                            String str = b.m;
                            if (str != null && preferenceGroup.O.containsKey(str)) {
                                j = preferenceGroup.O.getOrDefault(str, null).longValue();
                                preferenceGroup.O.remove(str);
                            } else {
                                synchronized (eVar) {
                                    j = eVar.b;
                                    eVar.b = 1 + j;
                                }
                            }
                            b.d = j;
                            b.e = true;
                            try {
                                b.m(eVar);
                                b.e = false;
                                if (b.J == null) {
                                    b.J = preferenceGroup;
                                    if (preferenceGroup.S) {
                                        b.l();
                                    }
                                    Preference.c cVar3 = preferenceGroup.H;
                                    if (cVar3 != null) {
                                        androidx.preference.c cVar4 = (androidx.preference.c) cVar3;
                                        Handler handler2 = cVar4.e;
                                        c.a aVar2 = cVar4.f;
                                        handler2.removeCallbacks(aVar2);
                                        handler2.post(aVar2);
                                    }
                                } else {
                                    throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                                }
                            } catch (Throwable th) {
                                b.e = false;
                                throw th;
                            }
                        }
                        d(xmlResourceParser, b, attributeSet);
                    }
                }
            } else {
                return;
            }
        }
    }
}
