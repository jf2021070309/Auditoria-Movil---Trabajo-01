package com.amazon.aps.iva.gl;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PlayerTapToSeekDetector.kt */
/* loaded from: classes2.dex */
public final class f {
    public final com.amazon.aps.iva.p3.e a;

    /* compiled from: PlayerTapToSeekDetector.kt */
    /* loaded from: classes2.dex */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ View c;
        public final /* synthetic */ com.amazon.aps.iva.gl.c d;

        /* compiled from: PlayerTapToSeekDetector.kt */
        /* renamed from: com.amazon.aps.iva.gl.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0308a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<Boolean> {
            public C0308a(com.amazon.aps.iva.gl.c cVar) {
                super(0, cVar, com.amazon.aps.iva.gl.c.class, "onDoubleTapLeft", "onDoubleTapLeft()Z", 0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Boolean invoke() {
                return Boolean.valueOf(((com.amazon.aps.iva.gl.c) this.receiver).c());
            }
        }

        /* compiled from: PlayerTapToSeekDetector.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<Boolean> {
            public b(com.amazon.aps.iva.gl.c cVar) {
                super(0, cVar, com.amazon.aps.iva.gl.c.class, "onDoubleTapRight", "onDoubleTapRight()Z", 0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Boolean invoke() {
                return Boolean.valueOf(((com.amazon.aps.iva.gl.c) this.receiver).a());
            }
        }

        /* compiled from: PlayerTapToSeekDetector.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<Boolean> {
            public c(com.amazon.aps.iva.gl.c cVar) {
                super(0, cVar, com.amazon.aps.iva.gl.c.class, "onTapLeft", "onTapLeft()Z", 0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Boolean invoke() {
                return Boolean.valueOf(((com.amazon.aps.iva.gl.c) this.receiver).e());
            }
        }

        /* compiled from: PlayerTapToSeekDetector.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class d extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<Boolean> {
            public d(com.amazon.aps.iva.gl.c cVar) {
                super(0, cVar, com.amazon.aps.iva.gl.c.class, "onTapRight", "onTapRight()Z", 0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Boolean invoke() {
                return Boolean.valueOf(((com.amazon.aps.iva.gl.c) this.receiver).b());
            }
        }

        public a(View view, com.amazon.aps.iva.gl.c cVar) {
            this.c = view;
            this.d = cVar;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            com.amazon.aps.iva.yb0.j.f(motionEvent, "e");
            com.amazon.aps.iva.gl.c cVar = this.d;
            return f.a(f.this, this.c, motionEvent, new C0308a(cVar), new b(cVar));
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            com.amazon.aps.iva.yb0.j.f(motionEvent, "e");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            com.amazon.aps.iva.yb0.j.f(motionEvent, "e");
            com.amazon.aps.iva.gl.c cVar = this.d;
            return f.a(f.this, this.c, motionEvent, new c(cVar), new d(cVar));
        }
    }

    public f(View view, c cVar) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(cVar, "tapToSeekController");
        this.a = new com.amazon.aps.iva.p3.e(view.getContext(), new a(view, cVar));
    }

    public static final boolean a(f fVar, View view, MotionEvent motionEvent, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.a aVar2) {
        Object invoke;
        fVar.getClass();
        if (motionEvent.getX() < view.getMeasuredWidth() / 2.0f) {
            invoke = aVar.invoke();
        } else {
            invoke = aVar2.invoke();
        }
        return ((Boolean) invoke).booleanValue();
    }
}
