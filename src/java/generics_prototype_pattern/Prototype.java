package generics_prototype_pattern;

public interface Prototype<T> extends Cloneable {
    T clone();
}
