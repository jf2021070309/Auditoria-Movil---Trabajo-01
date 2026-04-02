package com.google.crypto.tink;

import com.amazon.aps.iva.oa.a;
import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
public final class KeyTemplates {
    private KeyTemplates() {
    }

    public static KeyTemplate get(String str) throws GeneralSecurityException {
        KeyTemplate keyTemplate = Registry.keyTemplateMap().get(str);
        if (keyTemplate != null) {
            return keyTemplate;
        }
        throw new GeneralSecurityException(a.a("cannot find key template: ", str));
    }
}
