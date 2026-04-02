package com.amazon.aps.iva.xc0;
/* compiled from: DescriptorsJvmAbiUtil.java */
/* loaded from: classes4.dex */
public final class m {
    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[0] = "propertyDescriptor";
            } else {
                objArr[0] = "memberDescriptor";
            }
        } else {
            objArr[0] = "companionObject";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    objArr[2] = "isPropertyWithBackingFieldInOuterClass";
                } else {
                    objArr[2] = "hasJvmFieldAnnotation";
                }
            } else {
                objArr[2] = "isMappedIntrinsicCompanionObject";
            }
        } else {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
