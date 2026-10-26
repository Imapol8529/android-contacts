package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffCallback<T> {
    boolean theSameAs(T newItem);
    boolean itemEquals(Object object);
}
