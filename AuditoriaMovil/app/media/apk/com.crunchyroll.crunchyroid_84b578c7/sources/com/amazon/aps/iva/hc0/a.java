package com.amazon.aps.iva.hc0;

import com.amazon.aps.iva.fc0.h;
import com.amazon.aps.iva.ic0.e0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: KCallablesJvm.kt */
/* loaded from: classes4.dex */
public final class a {
    public static final boolean a(e0 e0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (e0Var instanceof h) {
            Field a = b.a(e0Var);
            if (a != null) {
                z3 = a.isAccessible();
            } else {
                z3 = true;
            }
            if (z3) {
                Method b = b.b(e0Var.u());
                if (b != null) {
                    z4 = b.isAccessible();
                } else {
                    z4 = true;
                }
                if (z4) {
                    Method b2 = b.b(((h) e0Var).getSetter());
                    if (b2 != null) {
                        z5 = b2.isAccessible();
                    } else {
                        z5 = true;
                    }
                    if (z5) {
                        return true;
                    }
                }
            }
        } else {
            Field a2 = b.a(e0Var);
            if (a2 != null) {
                z = a2.isAccessible();
            } else {
                z = true;
            }
            if (z) {
                Method b3 = b.b(e0Var.u());
                if (b3 != null) {
                    z2 = b3.isAccessible();
                } else {
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }
}
