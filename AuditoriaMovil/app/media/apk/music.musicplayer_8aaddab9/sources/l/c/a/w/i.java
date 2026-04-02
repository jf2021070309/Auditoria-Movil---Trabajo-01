package l.c.a.w;
/* loaded from: classes.dex */
public interface i {
    <R extends d> R adjustInto(R r, long j2);

    long getFrom(e eVar);

    boolean isDateBased();

    boolean isSupportedBy(e eVar);

    boolean isTimeBased();

    n range();

    n rangeRefinedBy(e eVar);
}
