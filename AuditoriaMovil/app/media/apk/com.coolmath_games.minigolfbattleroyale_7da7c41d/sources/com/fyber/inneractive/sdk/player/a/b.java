package com.fyber.inneractive.sdk.player.a;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
abstract class b {
    private Map<String, String> a = new HashMap();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes.dex */
    static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {1, 2, 3};
    }

    public abstract int a(com.fyber.inneractive.sdk.player.a.a aVar);

    public Map<String, String> a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str, String str2) {
        this.a.put(str, str2);
    }
}
