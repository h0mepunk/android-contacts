package ru.yandex.practicum.contacts.presentation.base;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public interface ListDiffInterface <T> {

    abstract public boolean theSameAs(T type);

    abstract public boolean equals(Object object);
}
