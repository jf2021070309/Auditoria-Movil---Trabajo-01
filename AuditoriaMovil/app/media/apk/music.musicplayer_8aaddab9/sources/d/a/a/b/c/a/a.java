package d.a.a.b.c.a;

import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.parser.Node;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.util.Map;
/* loaded from: classes.dex */
public class a<E> extends ContextAwareBase {
    public Converter<E> a;

    /* renamed from: b  reason: collision with root package name */
    public Converter<E> f4950b;

    /* renamed from: c  reason: collision with root package name */
    public final Node f4951c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f4952d;

    public a(Node node, Map<String, String> map) {
        this.f4951c = node;
        this.f4952d = map;
    }

    public final void a(Converter<E> converter) {
        if (this.a == null) {
            this.f4950b = converter;
            this.a = converter;
            return;
        }
        this.f4950b.setNext(converter);
        this.f4950b = converter;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ch.qos.logback.core.pattern.Converter<E> f() {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.b.c.a.a.f():ch.qos.logback.core.pattern.Converter");
    }
}
