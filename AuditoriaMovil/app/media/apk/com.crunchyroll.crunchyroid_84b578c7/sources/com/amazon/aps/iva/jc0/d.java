package com.amazon.aps.iva.jc0;

import com.amazon.aps.iva.yb0.l;
import java.util.Arrays;
import java.util.Map;
/* compiled from: AnnotationConstructorCaller.kt */
/* loaded from: classes4.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<Map.Entry<? extends String, ? extends Object>, CharSequence> {
    public static final d h = new d();

    public d() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
        String obj;
        Map.Entry<? extends String, ? extends Object> entry2 = entry;
        com.amazon.aps.iva.yb0.j.f(entry2, "entry");
        String key = entry2.getKey();
        Object value = entry2.getValue();
        if (value instanceof boolean[]) {
            obj = Arrays.toString((boolean[]) value);
            com.amazon.aps.iva.yb0.j.e(obj, "toString(this)");
        } else if (value instanceof char[]) {
            obj = Arrays.toString((char[]) value);
            com.amazon.aps.iva.yb0.j.e(obj, "toString(this)");
        } else if (value instanceof byte[]) {
            obj = Arrays.toString((byte[]) value);
            com.amazon.aps.iva.yb0.j.e(obj, "toString(this)");
        } else if (value instanceof short[]) {
            obj = Arrays.toString((short[]) value);
            com.amazon.aps.iva.yb0.j.e(obj, "toString(this)");
        } else if (value instanceof int[]) {
            obj = Arrays.toString((int[]) value);
            com.amazon.aps.iva.yb0.j.e(obj, "toString(this)");
        } else if (value instanceof float[]) {
            obj = Arrays.toString((float[]) value);
            com.amazon.aps.iva.yb0.j.e(obj, "toString(this)");
        } else if (value instanceof long[]) {
            obj = Arrays.toString((long[]) value);
            com.amazon.aps.iva.yb0.j.e(obj, "toString(this)");
        } else if (value instanceof double[]) {
            obj = Arrays.toString((double[]) value);
            com.amazon.aps.iva.yb0.j.e(obj, "toString(this)");
        } else if (value instanceof Object[]) {
            obj = Arrays.toString((Object[]) value);
            com.amazon.aps.iva.yb0.j.e(obj, "toString(this)");
        } else {
            obj = value.toString();
        }
        return key + '=' + obj;
    }
}
