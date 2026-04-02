package com.amazon.aps.iva.t8;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
/* compiled from: MasterKeys.java */
@Deprecated
/* loaded from: classes.dex */
public final class c {
    public static final Object a;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
        a = new Object();
    }
}
