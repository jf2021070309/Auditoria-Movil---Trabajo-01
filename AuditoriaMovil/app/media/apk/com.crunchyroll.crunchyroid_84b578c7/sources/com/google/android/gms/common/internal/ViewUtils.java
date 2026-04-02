package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class ViewUtils {
    private ViewUtils() {
    }

    @KeepForSdk
    public static String getXmlAttributeString(String str, String str2, Context context, AttributeSet attributeSet, boolean z, boolean z2, String str3) {
        String attributeValue;
        if (attributeSet == null) {
            attributeValue = null;
        } else {
            attributeValue = attributeSet.getAttributeValue(str, str2);
        }
        if (attributeValue != null && attributeValue.startsWith("@string/") && z) {
            String substring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                resources.getValue(packageName + ":string/" + substring, typedValue, true);
            } catch (Resources.NotFoundException unused) {
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                return charSequence.toString();
            }
            typedValue.toString();
            return attributeValue;
        }
        return attributeValue;
    }
}
