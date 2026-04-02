package ch.qos.logback.core.pattern;

import e.a.d.a.a;
/* loaded from: classes.dex */
public abstract class CompositeConverter<E> extends DynamicConverter<E> {
    public Converter<E> childConverter;

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(E e2) {
        StringBuilder sb = new StringBuilder();
        for (Converter<E> converter = this.childConverter; converter != null; converter = converter.next) {
            converter.write(sb, e2);
        }
        return transform(e2, sb.toString());
    }

    public Converter<E> getChildConverter() {
        return this.childConverter;
    }

    public void setChildConverter(Converter<E> converter) {
        this.childConverter = converter;
    }

    public String toString() {
        StringBuilder y = a.y("CompositeConverter<");
        FormatInfo formatInfo = this.formattingInfo;
        if (formatInfo != null) {
            y.append(formatInfo);
        }
        if (this.childConverter != null) {
            y.append(", children: ");
            y.append(this.childConverter);
        }
        y.append(">");
        return y.toString();
    }

    public abstract String transform(E e2, String str);
}
