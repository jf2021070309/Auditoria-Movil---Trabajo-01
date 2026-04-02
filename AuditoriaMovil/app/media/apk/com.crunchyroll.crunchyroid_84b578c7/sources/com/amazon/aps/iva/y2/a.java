package com.amazon.aps.iva.y2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public final class a {
    public final ConstraintLayout a;
    public int b = -1;
    public int c = -1;
    public final SparseArray<C0882a> d = new SparseArray<>();
    public final SparseArray<androidx.constraintlayout.widget.c> e = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: com.amazon.aps.iva.y2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0882a {
        public final int a;
        public final ArrayList<b> b = new ArrayList<>();
        public final int c;
        public final androidx.constraintlayout.widget.c d;

        public C0882a(Context context, XmlResourceParser xmlResourceParser) {
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
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.d = cVar;
                        cVar.f((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class b {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final int e;
        public final androidx.constraintlayout.widget.c f;

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
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f = cVar;
                        cVar.f((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
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

    public a(Context context, ConstraintLayout constraintLayout, int i) {
        this.a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            C0882a c0882a = null;
            while (true) {
                boolean z = true;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            continue;
                        } else {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        z = true;
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
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        z = false;
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
                                if (!z) {
                                    if (!z) {
                                        continue;
                                    } else {
                                        a(context, xml);
                                        continue;
                                    }
                                } else {
                                    b bVar = new b(context, xml);
                                    if (c0882a != null) {
                                        c0882a.b.add(bVar);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                C0882a c0882a2 = new C0882a(context, xml);
                                this.d.put(c0882a2.a, c0882a2);
                                c0882a = c0882a2;
                                continue;
                            }
                        }
                    } else {
                        xml.getName();
                        continue;
                    }
                    eventType = xml.next();
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

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        int i;
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlResourceParser.getAttributeName(i2);
            String attributeValue = xmlResourceParser.getAttributeValue(i2);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1 && attributeValue.length() > 1) {
                    i = Integer.parseInt(attributeValue.substring(1));
                }
                cVar.n(context, xmlResourceParser);
                this.e.put(i, cVar);
                return;
            }
        }
    }

    public final void b(int i, float f, float f2) {
        androidx.constraintlayout.widget.c cVar;
        C0882a c0882a;
        androidx.constraintlayout.widget.c cVar2;
        int i2 = this.b;
        SparseArray<C0882a> sparseArray = this.d;
        int i3 = 0;
        ConstraintLayout constraintLayout = this.a;
        if (i2 == i) {
            if (i == -1) {
                c0882a = sparseArray.valueAt(0);
            } else {
                c0882a = sparseArray.get(i2);
            }
            int i4 = this.c;
            if (i4 != -1 && c0882a.b.get(i4).a(f, f2)) {
                return;
            }
            while (true) {
                ArrayList<b> arrayList = c0882a.b;
                if (i3 < arrayList.size()) {
                    if (arrayList.get(i3).a(f, f2)) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (this.c == i3) {
                return;
            }
            ArrayList<b> arrayList2 = c0882a.b;
            if (i3 == -1) {
                cVar2 = null;
            } else {
                cVar2 = arrayList2.get(i3).f;
            }
            if (i3 != -1) {
                int i5 = arrayList2.get(i3).e;
            }
            if (cVar2 == null) {
                return;
            }
            this.c = i3;
            cVar2.b(constraintLayout);
            return;
        }
        this.b = i;
        C0882a c0882a2 = sparseArray.get(i);
        while (true) {
            ArrayList<b> arrayList3 = c0882a2.b;
            if (i3 < arrayList3.size()) {
                if (arrayList3.get(i3).a(f, f2)) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        ArrayList<b> arrayList4 = c0882a2.b;
        if (i3 == -1) {
            cVar = c0882a2.d;
        } else {
            cVar = arrayList4.get(i3).f;
        }
        if (i3 != -1) {
            int i6 = arrayList4.get(i3).e;
        }
        if (cVar == null) {
            return;
        }
        this.c = i3;
        cVar.b(constraintLayout);
    }
}
