package com.bytedance.msdk.adapter.config;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DefaultAdapterClasses {
    private static final List<String> a;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList.add("pangle");
        arrayList.add("ks");
        arrayList.add("gdt");
        arrayList.add("baidu");
        arrayList.add("klevin");
        arrayList.add("mintegral");
        arrayList.add("admob");
        arrayList.add("sigmob");
        arrayList.add("unity");
    }

    public static List<String> getAdnNamesSet() {
        return a;
    }
}
