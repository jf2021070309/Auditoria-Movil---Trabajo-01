package com.amazon.aps.iva.y2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: StateSet.java */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public final SparseArray<a> b = new SparseArray<>();

    /* compiled from: StateSet.java */
    /* loaded from: classes.dex */
    public static class a {
        public final int a;
        public final ArrayList<b> b = new ArrayList<>();
        public final int c;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.r);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.c);
                    this.c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: StateSet.java */
    /* loaded from: classes.dex */
    public static class b {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final int e;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.v);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.e);
                    this.e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == 2) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                } else if (index == 3) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == 4) {
                    this.a = obtainStyledAttributes.getDimension(index, this.a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f, float f2) {
            float f3 = this.a;
            if (!Float.isNaN(f3) && f < f3) {
                return false;
            }
            float f4 = this.b;
            if (!Float.isNaN(f4) && f2 < f4) {
                return false;
            }
            float f5 = this.c;
            if (!Float.isNaN(f5) && f > f5) {
                return false;
            }
            float f6 = this.d;
            if (!Float.isNaN(f6) && f2 > f6) {
                return false;
            }
            return true;
        }
    }

    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.a = -1;
        new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.s);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVar = null;
            while (true) {
                boolean z = true;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            if (eventType != 3) {
                                continue;
                            } else if ("StateSet".equals(xmlResourceParser.getName())) {
                                return;
                            }
                        } else {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case 80204913:
                                    if (name.equals("State")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case 1301459538:
                                    if (name.equals("LayoutDescription")) {
                                        z = false;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    z = true;
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                default:
                                    z = true;
                                    break;
                            }
                            if (!z) {
                                if (z) {
                                    b bVar = new b(context, xmlResourceParser);
                                    if (aVar != null) {
                                        aVar.b.add(bVar);
                                    }
                                }
                            } else {
                                a aVar2 = new a(context, xmlResourceParser);
                                this.b.put(aVar2.a, aVar2);
                                aVar = aVar2;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final int a(int i) {
        ArrayList<b> arrayList;
        int i2;
        a aVar;
        ArrayList<b> arrayList2;
        float f = -1;
        SparseArray<a> sparseArray = this.b;
        int i3 = 0;
        if (-1 == i) {
            if (i == -1) {
                aVar = sparseArray.valueAt(0);
            } else {
                aVar = sparseArray.get(-1);
            }
            if (aVar == null) {
                return -1;
            }
            while (true) {
                arrayList2 = aVar.b;
                if (i3 < arrayList2.size()) {
                    if (arrayList2.get(i3).a(f, f)) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (-1 == i3) {
                return -1;
            }
            if (i3 == -1) {
                i2 = aVar.c;
            } else {
                i2 = arrayList2.get(i3).e;
            }
        } else {
            a aVar2 = sparseArray.get(i);
            if (aVar2 == null) {
                return -1;
            }
            while (true) {
                arrayList = aVar2.b;
                if (i3 < arrayList.size()) {
                    if (arrayList.get(i3).a(f, f)) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 == -1) {
                i2 = aVar2.c;
            } else {
                i2 = arrayList.get(i3).e;
            }
        }
        return i2;
    }
}
