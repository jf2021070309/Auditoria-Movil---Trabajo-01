package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.a;
import java.util.HashMap;
/* compiled from: DataRewinderRegistry.java */
/* loaded from: classes.dex */
public final class b {
    public static final a b = new a();
    public final HashMap a = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0945a<Object> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0945a
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0945a
        public final com.bumptech.glide.load.data.a<Object> b(Object obj) {
            return new C0946b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry.java */
    /* renamed from: com.bumptech.glide.load.data.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0946b implements com.bumptech.glide.load.data.a<Object> {
        public final Object a;

        public C0946b(Object obj) {
            this.a = obj;
        }

        @Override // com.bumptech.glide.load.data.a
        public final Object a() {
            return this.a;
        }

        @Override // com.bumptech.glide.load.data.a
        public final void b() {
        }
    }
}
