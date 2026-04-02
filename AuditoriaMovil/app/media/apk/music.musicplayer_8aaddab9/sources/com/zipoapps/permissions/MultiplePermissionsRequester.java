package com.zipoapps.permissions;

import c.a.h.a;
import c.a.h.b;
import com.zipoapps.permissions.MultiplePermissionsRequester;
import h.k;
import h.o.b.l;
import h.o.b.p;
import h.o.b.q;
import h.o.c.j;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class MultiplePermissionsRequester extends BasePermissionRequester {

    /* renamed from: c  reason: collision with root package name */
    public final String[] f4889c;

    /* renamed from: d  reason: collision with root package name */
    public l<? super MultiplePermissionsRequester, k> f4890d;

    /* renamed from: e  reason: collision with root package name */
    public p<? super MultiplePermissionsRequester, ? super List<String>, k> f4891e;

    /* renamed from: f  reason: collision with root package name */
    public q<? super MultiplePermissionsRequester, ? super Map<String, Boolean>, ? super Boolean, k> f4892f;

    /* renamed from: g  reason: collision with root package name */
    public final b<String[]> f4893g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiplePermissionsRequester(c.b.c.l lVar, String[] strArr) {
        super(lVar);
        j.e(lVar, "activity");
        j.e(strArr, "permissions");
        this.f4889c = strArr;
        b<String[]> registerForActivityResult = lVar.registerForActivityResult(new c.a.h.d.b(), new a() { // from class: e.j.c.a
            @Override // c.a.h.a
            public final void a(Object obj) {
                boolean z;
                boolean z2;
                q<? super MultiplePermissionsRequester, ? super Map<String, Boolean>, ? super Boolean, k> qVar;
                MultiplePermissionsRequester multiplePermissionsRequester = MultiplePermissionsRequester.this;
                Map map = (Map) obj;
                h.o.c.j.e(multiplePermissionsRequester, "this$0");
                h.o.c.j.d(map, "result");
                Collection<Boolean> values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    for (Boolean bool : values) {
                        if (!bool.booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    l<? super MultiplePermissionsRequester, k> lVar2 = multiplePermissionsRequester.f4890d;
                    if (lVar2 != null) {
                        lVar2.invoke(multiplePermissionsRequester);
                    }
                } else {
                    c.b.c.l lVar3 = multiplePermissionsRequester.a;
                    Object[] array = map.keySet().toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    String[] strArr2 = (String[]) array;
                    h.o.c.j.e(lVar3, "activity");
                    h.o.c.j.e(strArr2, "permissions");
                    int length = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        }
                        String str = strArr2[i2];
                        i2++;
                        if (c.i.c.c.d(lVar3, str)) {
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2 && (qVar = multiplePermissionsRequester.f4892f) != null) {
                        qVar.f(multiplePermissionsRequester, map, Boolean.valueOf(!multiplePermissionsRequester.f4888b));
                    }
                }
                multiplePermissionsRequester.f4888b = false;
            }
        });
        j.d(registerForActivityResult, "activity.registerForActi…nResult(result)\n        }");
        this.f4893g = registerForActivityResult;
    }

    @Override // com.zipoapps.permissions.BasePermissionRequester
    public b<?> g() {
        return this.f4893g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3 A[SYNTHETIC] */
    @Override // com.zipoapps.permissions.BasePermissionRequester
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.permissions.MultiplePermissionsRequester.i():void");
    }
}
