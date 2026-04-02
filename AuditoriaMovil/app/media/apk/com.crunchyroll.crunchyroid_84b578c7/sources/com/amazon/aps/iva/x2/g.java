package com.amazon.aps.iva.x2;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: KeyFrames.java */
/* loaded from: classes.dex */
public final class g {
    public static final HashMap<String, Constructor<? extends d>> b;
    public final HashMap<Integer, ArrayList<d>> a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends d>> hashMap = new HashMap<>();
        b = hashMap;
        try {
            hashMap.put("KeyAttribute", e.class.getConstructor(new Class[0]));
            hashMap.put("KeyPosition", h.class.getConstructor(new Class[0]));
            hashMap.put("KeyCycle", f.class.getConstructor(new Class[0]));
            hashMap.put("KeyTimeCycle", j.class.getConstructor(new Class[0]));
            hashMap.put("KeyTrigger", k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public g(Context context, XmlResourceParser xmlResourceParser) {
        HashMap<String, androidx.constraintlayout.widget.a> hashMap;
        HashMap<String, androidx.constraintlayout.widget.a> hashMap2;
        try {
            int eventType = xmlResourceParser.getEventType();
            d dVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    HashMap<String, Constructor<? extends d>> hashMap3 = b;
                    if (hashMap3.containsKey(name)) {
                        try {
                            Constructor<? extends d> constructor = hashMap3.get(name);
                            if (constructor != null) {
                                d newInstance = constructor.newInstance(new Object[0]);
                                try {
                                    newInstance.e(context, Xml.asAttributeSet(xmlResourceParser));
                                    Integer valueOf = Integer.valueOf(newInstance.b);
                                    HashMap<Integer, ArrayList<d>> hashMap4 = this.a;
                                    if (!hashMap4.containsKey(valueOf)) {
                                        hashMap4.put(Integer.valueOf(newInstance.b), new ArrayList<>());
                                    }
                                    ArrayList<d> arrayList = hashMap4.get(Integer.valueOf(newInstance.b));
                                    if (arrayList != null) {
                                        arrayList.add(newInstance);
                                    }
                                } catch (Exception unused) {
                                }
                                dVar = newInstance;
                                continue;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                                break;
                            }
                        } catch (Exception unused2) {
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (dVar != null && (hashMap2 = dVar.c) != null) {
                            androidx.constraintlayout.widget.a.d(context, xmlResourceParser, hashMap2);
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && dVar != null && (hashMap = dVar.c) != null) {
                        androidx.constraintlayout.widget.a.d(context, xmlResourceParser, hashMap);
                        continue;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
