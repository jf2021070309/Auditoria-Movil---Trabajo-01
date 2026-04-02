package c.g.c;

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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class c {
    public final ConstraintLayout a;

    /* renamed from: b  reason: collision with root package name */
    public int f1830b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f1831c = -1;

    /* renamed from: d  reason: collision with root package name */
    public SparseArray<a> f1832d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public SparseArray<d> f1833e = new SparseArray<>();

    /* loaded from: classes.dex */
    public static class a {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f1834b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f1835c;

        /* renamed from: d  reason: collision with root package name */
        public d f1836d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f1835c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f1917j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == 1) {
                    this.f1835c = obtainStyledAttributes.getResourceId(index, this.f1835c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1835c);
                    context.getResources().getResourceName(this.f1835c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1836d = dVar;
                        dVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(this.f1835c, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public int a(float f2, float f3) {
            for (int i2 = 0; i2 < this.f1834b.size(); i2++) {
                if (this.f1834b.get(i2).a(f2, f3)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public float a;

        /* renamed from: b  reason: collision with root package name */
        public float f1837b;

        /* renamed from: c  reason: collision with root package name */
        public float f1838c;

        /* renamed from: d  reason: collision with root package name */
        public float f1839d;

        /* renamed from: e  reason: collision with root package name */
        public int f1840e;

        /* renamed from: f  reason: collision with root package name */
        public d f1841f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.a = Float.NaN;
            this.f1837b = Float.NaN;
            this.f1838c = Float.NaN;
            this.f1839d = Float.NaN;
            this.f1840e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f1919l);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f1840e = obtainStyledAttributes.getResourceId(index, this.f1840e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1840e);
                    context.getResources().getResourceName(this.f1840e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1841f = dVar;
                        dVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(this.f1840e, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f1839d = obtainStyledAttributes.getDimension(index, this.f1839d);
                } else if (index == 2) {
                    this.f1837b = obtainStyledAttributes.getDimension(index, this.f1837b);
                } else if (index == 3) {
                    this.f1838c = obtainStyledAttributes.getDimension(index, this.f1838c);
                } else if (index == 4) {
                    this.a = obtainStyledAttributes.getDimension(index, this.a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float f2, float f3) {
            if (Float.isNaN(this.a) || f2 >= this.a) {
                if (Float.isNaN(this.f1837b) || f3 >= this.f1837b) {
                    if (Float.isNaN(this.f1838c) || f2 <= this.f1838c) {
                        return Float.isNaN(this.f1839d) || f3 <= this.f1839d;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public c(Context context, ConstraintLayout constraintLayout, int i2) {
        this.a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c2 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 2) {
                        a aVar2 = new a(context, xml);
                        this.f1832d.put(aVar2.a, aVar2);
                        aVar = aVar2;
                        continue;
                    } else if (c2 == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.f1834b.add(bVar);
                            continue;
                        } else {
                            continue;
                        }
                    } else if (c2 != 4) {
                        continue;
                    } else {
                        a(context, xml);
                        continue;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0228, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.c.c.a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
